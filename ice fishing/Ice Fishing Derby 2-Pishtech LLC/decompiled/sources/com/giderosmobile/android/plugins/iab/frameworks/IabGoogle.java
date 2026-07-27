package com.giderosmobile.android.plugins.iab.frameworks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.giderosmobile.android.plugins.iab.Iab;
import com.giderosmobile.android.plugins.iab.IabInterface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class IabGoogle implements IabInterface, PurchasesUpdatedListener {
    private static WeakReference<Activity> sActivity;
    private BillingClient billingClient;
    boolean wasChecked = false;
    int sdkAvailable = -1;
    Map<String, ProductDetails> inventory = new HashMap();
    Set<String> purchasing = new HashSet();

    @Override // com.giderosmobile.android.plugins.iab.IabInterface
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.giderosmobile.android.plugins.iab.IabInterface
    public void onStart() {
    }

    public static Boolean isInstalled() {
        if (Iab.isPackageInstalled("com.android.vending") || Iab.isPackageInstalled("com.google.vending") || Iab.isPackageInstalled("com.google.market")) {
            return true;
        }
        return false;
    }

    @Override // com.giderosmobile.android.plugins.iab.IabInterface
    public void onCreate(WeakReference<Activity> weakReference) {
        sActivity = weakReference;
    }

    @Override // com.giderosmobile.android.plugins.iab.IabInterface
    public void onDestroy() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            billingClient.endConnection();
        }
        this.billingClient = null;
    }

    @Override // com.giderosmobile.android.plugins.iab.IabInterface
    public void init(Object obj) {
        BillingClient build = BillingClient.newBuilder(sActivity.get()).enablePendingPurchases().setListener(this).build();
        this.billingClient = build;
        build.startConnection(new BillingClientStateListener() { // from class: com.giderosmobile.android.plugins.iab.frameworks.IabGoogle.1
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult billingResult) {
                if (billingResult.getResponseCode() == 0) {
                    IabGoogle.this.sdkAvailable = 1;
                } else {
                    IabGoogle.this.sdkAvailable = 0;
                }
                if (IabGoogle.this.wasChecked) {
                    if (IabGoogle.this.sdkAvailable == 1) {
                        Iab.available(this);
                    } else {
                        Iab.notAvailable(this);
                    }
                }
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                IabGoogle.this.sdkAvailable = 0;
                if (IabGoogle.this.wasChecked) {
                    Iab.notAvailable(this);
                }
            }
        });
    }

    @Override // com.giderosmobile.android.plugins.iab.IabInterface
    public void check() {
        int i = this.sdkAvailable;
        if (i == 1) {
            Iab.available(this);
        } else if (i == 0) {
            Iab.notAvailable(this);
        } else {
            this.wasChecked = true;
        }
    }

    @Override // com.giderosmobile.android.plugins.iab.IabInterface
    public void request(Hashtable<String, String> hashtable) {
        if (this.sdkAvailable == 1) {
            ArrayList arrayList = new ArrayList();
            Enumeration<String> keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(hashtable.get(keys.nextElement())).setProductType("inapp").build());
            }
            try {
                this.billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), new ProductDetailsResponseListener() { // from class: com.giderosmobile.android.plugins.iab.frameworks.IabGoogle.2
                    @Override // com.android.billingclient.api.ProductDetailsResponseListener
                    public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
                        if (billingResult.getResponseCode() != 0) {
                            Iab.productsError(this, billingResult.getDebugMessage());
                            return;
                        }
                        Hashtable<String, String> products = Iab.getProducts(this);
                        if (products == null) {
                            Iab.productsError(this, "Request Failed");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        for (ProductDetails productDetails : list) {
                            hashMap.put(productDetails.getProductId(), productDetails);
                        }
                        IabGoogle.this.inventory = hashMap;
                        SparseArray sparseArray = new SparseArray();
                        Enumeration<String> keys2 = products.keys();
                        int i = 0;
                        while (keys2.hasMoreElements()) {
                            String nextElement = keys2.nextElement();
                            ProductDetails productDetails2 = (ProductDetails) hashMap.get(products.get(nextElement));
                            if (productDetails2 != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString("productId", products.get(nextElement));
                                bundle.putString("title", productDetails2.getTitle());
                                bundle.putString("description", productDetails2.getDescription());
                                bundle.putString("price", productDetails2.getOneTimePurchaseOfferDetails().getFormattedPrice());
                                sparseArray.put(i, bundle);
                                i++;
                            }
                        }
                        Iab.productsComplete(this, sparseArray);
                    }
                });
            } catch (Exception e) {
                Iab.productsError(this, e.getLocalizedMessage());
            }
        }
    }

    @Override // com.giderosmobile.android.plugins.iab.IabInterface
    public void purchase(String str) {
        try {
            ProductDetails productDetails = this.inventory.get(str);
            if (productDetails == null) {
                Iab.purchaseError(this, "No such product id: " + str);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build());
                BillingFlowParams build = BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList).build();
                this.purchasing.add(str);
                this.billingClient.launchBillingFlow(sActivity.get(), build);
            }
        } catch (Exception e) {
            Iab.purchaseError(this, e.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getSku(Purchase purchase) {
        return purchase.getProducts().get(0);
    }

    @Override // com.giderosmobile.android.plugins.iab.IabInterface
    public void restore() {
        try {
            this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: com.giderosmobile.android.plugins.iab.frameworks.IabGoogle.3
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
                    if (billingResult.getResponseCode() != 0) {
                        Iab.restoreError(this, "Request Failed");
                        return;
                    }
                    if (list != null) {
                        for (final Purchase purchase : list) {
                            if (purchase.getPurchaseState() == 1) {
                                if (Iab.isConsumable(IabGoogle.this.getSku(purchase), this)) {
                                    try {
                                        IabGoogle.this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() { // from class: com.giderosmobile.android.plugins.iab.frameworks.IabGoogle.3.1
                                            @Override // com.android.billingclient.api.ConsumeResponseListener
                                            public void onConsumeResponse(BillingResult billingResult2, String str) {
                                                if (billingResult2.getResponseCode() == 0) {
                                                    Iab.purchaseComplete(this, IabGoogle.this.getSku(purchase), purchase.getOrderId());
                                                } else {
                                                    Iab.purchaseError(this, billingResult2.getDebugMessage());
                                                }
                                            }
                                        });
                                    } catch (Exception unused) {
                                    }
                                } else if (purchase.isAcknowledged()) {
                                    Iab.purchaseComplete(this, IabGoogle.this.getSku(purchase), purchase.getOrderId());
                                } else {
                                    IabGoogle.this.billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new AcknowledgePurchaseResponseListener() { // from class: com.giderosmobile.android.plugins.iab.frameworks.IabGoogle.3.2
                                        @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                                        public void onAcknowledgePurchaseResponse(BillingResult billingResult2) {
                                            if (billingResult2.getResponseCode() == 0) {
                                                Iab.purchaseComplete(this, IabGoogle.this.getSku(purchase), purchase.getOrderId());
                                            } else {
                                                Iab.purchaseError(this, billingResult2.getDebugMessage());
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        Iab.restoreComplete(this);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        if (billingResult.getResponseCode() != 0) {
            Iab.purchaseError(this, billingResult.getDebugMessage());
            return;
        }
        for (final Purchase purchase : list) {
            if (this.purchasing.contains(getSku(purchase))) {
                if (purchase.getPurchaseState() == 1) {
                    if (Iab.isConsumable(getSku(purchase), this)) {
                        try {
                            this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() { // from class: com.giderosmobile.android.plugins.iab.frameworks.IabGoogle.4
                                @Override // com.android.billingclient.api.ConsumeResponseListener
                                public void onConsumeResponse(BillingResult billingResult2, String str) {
                                    if (billingResult2.getResponseCode() == 0) {
                                        Iab.purchaseComplete(this, IabGoogle.this.getSku(purchase), purchase.getOrderId());
                                    } else {
                                        Iab.purchaseError(this, billingResult2.getDebugMessage());
                                    }
                                }
                            });
                        } catch (Exception unused) {
                        }
                    } else if (purchase.isAcknowledged()) {
                        Iab.purchaseComplete(this, getSku(purchase), purchase.getOrderId());
                    } else {
                        this.billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new AcknowledgePurchaseResponseListener() { // from class: com.giderosmobile.android.plugins.iab.frameworks.IabGoogle.5
                            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                            public void onAcknowledgePurchaseResponse(BillingResult billingResult2) {
                                if (billingResult2.getResponseCode() == 0) {
                                    Iab.purchaseComplete(this, IabGoogle.this.getSku(purchase), purchase.getOrderId());
                                } else {
                                    Iab.purchaseError(this, billingResult2.getDebugMessage());
                                }
                            }
                        });
                    }
                }
            } else {
                Iab.purchaseError(this, "PENDING");
            }
        }
        this.purchasing.clear();
    }
}
