package com.procyon.propilkki;

import android.app.NativeActivity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.provider.Settings;
import android.view.KeyCharacterMap;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.procyon.propilkki.util.Security;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ProPilkki2Mobile extends NativeActivity implements PurchasesUpdatedListener, AcknowledgePurchaseResponseListener, ProductDetailsResponseListener {
    private static final String BASE64_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhAYDgJPpHHDZswpu+MNtDEFjMjX8aaqXV06GIEEtEN2Pry7ER0OqnPQDVB4V9jcHhokloI/CuE46rhwHA/wi/9jbd7Xe1PvcfFvnZO7g/O7XbFec+wX/5Q5td0l27QFbe+vctixfP0ZjYKMfQRCQpON5TcnJTQ6Hz3HjMDJ8WI+yAtyhN9fhckIh127f3hJc3M9EqDqPOTqKSUMsqv6ToG99+7vWFM2PjljABPUumZpmrCVBaTw8IF2hKJZJvbal3tl1cNts/3tqsywktkSPxyGm6sRZ5s5zRassmx/zCCCD/fmcqnw4hz86GJQ+cRFpMtrUtBQhTq9fJOMxF/2YwwIDAQAB";
    static final String PRODUCT_INAPP_FULL = "pp2_mobile_full";
    static final int RC_REQUEST = 10001;
    private static final byte[] SALT;
    public static final String TAG = "ProPilkki";
    private static String mAndroidId;
    private static Boolean mIsInAppFull;
    private BillingClient mBillingClient;
    ClipboardManager mClipBoardManager = null;
    boolean mHelperSetupSuccess = false;
    boolean mHelperSetupCompleted = false;
    boolean mQueryInAppPurchasePending = false;
    private Object mQueryLock = new Object();
    String mPurchaseTokenFull = "";

    public native void InAppLicenseCallbackAllow();

    public native void InAppLicenseCallbackDontAllow();

    public native void InAppLicenseCallbackDontAllowRetry();

    public native void InAppPurchaseCompleteError();

    public native void InAppPurchaseCompleteOk();

    public native void LicenseCallbackAllow();

    public native void LicenseCallbackDontAllow();

    public native void LicenseCallbackDontAllowRetry();

    public native void ShareEventComple();

    public native void ShareEventCompleError();

    public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
    }

    static {
        System.loadLibrary("lib_main");
        SALT = new byte[]{-23, 1, 60, -120, 23, -90, 40, -24, 75, 42, -11, -10, 44, 24, -27, 94, -95, 35, -75, 55};
        mIsInAppFull = false;
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.mClipBoardManager = (ClipboardManager) getApplicationContext().getSystemService("clipboard");
        } catch (Exception unused) {
        }
        ContentResolver contentResolver = getApplicationContext().getContentResolver();
        if (contentResolver != null) {
            mAndroidId = Settings.Secure.getString(contentResolver, "android_id");
        }
        initialiseBilling();
    }

    @Override // android.app.NativeActivity, android.app.Activity
    protected void onDestroy() {
        BillingClient billingClient = this.mBillingClient;
        if (billingClient != null) {
            billingClient.endConnection();
            this.mBillingClient = null;
            this.mHelperSetupCompleted = true;
            this.mHelperSetupSuccess = false;
            InAppPurchaseCompleteError();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialiseBilling() {
        synchronized (this.mQueryLock) {
            BillingClient billingClient = this.mBillingClient;
            if (billingClient != null) {
                billingClient.endConnection();
                this.mBillingClient = null;
            }
            this.mHelperSetupCompleted = false;
            BillingClient billingClientBuild = BillingClient.newBuilder(this).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(this).build();
            this.mBillingClient = billingClientBuild;
            billingClientBuild.startConnection(new BillingClientStateListener() { // from class: com.procyon.propilkki.ProPilkki2Mobile.1
                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingSetupFinished(BillingResult billingResult) {
                    if (billingResult.getResponseCode() == 0) {
                        ProPilkki2Mobile.this.mHelperSetupSuccess = true;
                        ProPilkki2Mobile.this.mHelperSetupCompleted = true;
                        if (ProPilkki2Mobile.this.mQueryInAppPurchasePending) {
                            ProPilkki2Mobile.this.mQueryInAppPurchasePending = false;
                            ProPilkki2Mobile.this.mBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: com.procyon.propilkki.ProPilkki2Mobile.1.1
                                @Override // com.android.billingclient.api.PurchasesResponseListener
                                public void onQueryPurchasesResponse(BillingResult billingResult2, List<Purchase> list) {
                                    if (list.size() > 0) {
                                        ProPilkki2Mobile.this.handlePurchases(list);
                                    } else {
                                        ProPilkki2Mobile.this.InAppLicenseCallbackDontAllow();
                                        ProPilkki2Mobile.this.InAppPurchaseCompleteError();
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (ProPilkki2Mobile.this.mQueryInAppPurchasePending) {
                        ProPilkki2Mobile.this.mQueryInAppPurchasePending = false;
                        ProPilkki2Mobile.this.InAppLicenseCallbackDontAllow();
                    }
                    ProPilkki2Mobile.this.mHelperSetupCompleted = true;
                    ProPilkki2Mobile.this.mHelperSetupSuccess = false;
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingServiceDisconnected() {
                    ProPilkki2Mobile.this.mHelperSetupCompleted = true;
                    ProPilkki2Mobile.this.mHelperSetupSuccess = false;
                }
            });
        }
    }

    private void OpenURL(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public File saveStringToHtmlFile(String str) {
        try {
            File file = new File(getExternalFilesDir(null), "file.html");
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
                bufferedWriter.write(str);
                bufferedWriter.close();
                return file;
            } catch (IOException unused) {
                return file;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public String CreatePngFile(String str, int i, int i2, int i3, byte[] bArr) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        new File(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return "1";
        } catch (Exception unused) {
            return "0";
        }
    }

    public String StartShareEvent(String str, String str2) {
        try {
            File file = new File(str);
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(file.getName().substring(file.getName().lastIndexOf(".") + 1));
            Intent intent = new Intent("android.intent.action.SEND");
            Uri uriForFile = FileProvider.getUriForFile(getApplicationContext(), "com.procyon.propilkki.fileprovider", file);
            intent.setType(mimeTypeFromExtension);
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.putExtra("android.content.Intent.EXTRA_TEXT", str2);
            intent.addFlags(1);
            startActivity(Intent.createChooser(intent, null));
            ShareEventComple();
            return "1";
        } catch (IllegalArgumentException | Exception unused) {
            return "0";
        }
    }

    private void OpenAssetToBrowser(String str) {
        try {
            InputStream inputStreamOpen = getAssets().open(str);
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            File fileSaveStringToHtmlFile = saveStringToHtmlFile(new String(bArr));
            if (fileSaveStringToHtmlFile != null) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(Uri.fromFile(fileSaveStringToHtmlFile), "text/html");
                intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
                intent.setFlags(268435456);
                startActivity(intent);
            }
        } catch (ActivityNotFoundException | IOException unused) {
        }
    }

    public void FinishTask() {
        finishAndRemoveTask();
    }

    public void SystemExit() {
        System.exit(0);
    }

    public String GetLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public String GetAndroidId() {
        return mAndroidId;
    }

    public void SetClipBoard(String str) {
        try {
            if (this.mClipBoardManager != null) {
                this.mClipBoardManager.setPrimaryClip(ClipData.newPlainText("text", str));
            }
        } catch (Exception unused) {
        }
    }

    public String GetClipBoard() {
        Context applicationContext = getApplicationContext();
        try {
            ClipboardManager clipboardManager = this.mClipBoardManager;
            if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                return this.mClipBoardManager.getPrimaryClip().getItemAt(0).coerceToText(applicationContext).toString();
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public String GetAndroidKeyCharacterMap(int i, int i2, int i3) {
        try {
            int i4 = KeyCharacterMap.load(i).get(i2, i3);
            if ((Integer.MIN_VALUE & i4) != 0) {
                return "";
            }
            return Character.toString((char) i4);
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // android.app.NativeActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            hideSystemUI();
        }
    }

    public void hideSystemUI() {
        runOnUiThread(new Runnable() { // from class: com.procyon.propilkki.ProPilkki2Mobile.2
            @Override // java.lang.Runnable
            public void run() {
                ProPilkki2Mobile.this.getWindow().getDecorView().setSystemUiVisibility(5894);
            }
        });
    }

    public void showSystemUI() {
        runOnUiThread(new Runnable() { // from class: com.procyon.propilkki.ProPilkki2Mobile.3
            @Override // java.lang.Runnable
            public void run() {
                ProPilkki2Mobile.this.getWindow().getDecorView().setSystemUiVisibility(1792);
            }
        });
    }

    public String GetAndroidDisplayRotation() {
        int rotation;
        boolean z = getResources().getConfiguration().orientation != 1;
        if (Build.VERSION.SDK_INT >= 30) {
            rotation = getApplicationContext().getDisplay().getRotation();
        } else {
            rotation = getWindowManager().getDefaultDisplay().getRotation();
        }
        if (z) {
            if (rotation == 0 || rotation == 1) {
                return "0";
            }
            return (rotation == 2 || rotation == 3) ? "2" : "";
        }
        if (rotation == 0 || rotation == 1) {
            return "1";
        }
        return (rotation == 2 || rotation == 3) ? "3" : "1";
    }

    public void SleepPrevent() {
        runOnUiThread(new Runnable() { // from class: com.procyon.propilkki.ProPilkki2Mobile.4
            @Override // java.lang.Runnable
            public void run() {
                ProPilkki2Mobile.this.getWindow().addFlags(128);
            }
        });
    }

    public void SleepAllow() {
        runOnUiThread(new Runnable() { // from class: com.procyon.propilkki.ProPilkki2Mobile.5
            @Override // java.lang.Runnable
            public void run() {
                ProPilkki2Mobile.this.getWindow().clearFlags(128);
            }
        });
    }

    public void CheckInAppLicense() {
        synchronized (this.mQueryLock) {
            runOnUiThread(new Runnable() { // from class: com.procyon.propilkki.ProPilkki2Mobile.6
                @Override // java.lang.Runnable
                public void run() {
                    if (!ProPilkki2Mobile.this.mHelperSetupCompleted) {
                        ProPilkki2Mobile.this.mQueryInAppPurchasePending = true;
                    } else if (ProPilkki2Mobile.this.mHelperSetupSuccess && ProPilkki2Mobile.this.mBillingClient != null) {
                        ProPilkki2Mobile.this.mBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: com.procyon.propilkki.ProPilkki2Mobile.6.1
                            @Override // com.android.billingclient.api.PurchasesResponseListener
                            public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
                                if (list.size() > 0) {
                                    ProPilkki2Mobile.this.handlePurchases(list);
                                } else {
                                    ProPilkki2Mobile.this.InAppLicenseCallbackDontAllow();
                                    ProPilkki2Mobile.this.InAppPurchaseCompleteError();
                                }
                            }
                        });
                    } else {
                        ProPilkki2Mobile.this.mQueryInAppPurchasePending = true;
                        ProPilkki2Mobile.this.initialiseBilling();
                    }
                }
            });
        }
    }

    public void buyFullVersion() {
        runOnUiThread(new Runnable() { // from class: com.procyon.propilkki.ProPilkki2Mobile.7
            @Override // java.lang.Runnable
            public void run() {
                if (ProPilkki2Mobile.this.mHelperSetupCompleted && ProPilkki2Mobile.this.mHelperSetupSuccess && ProPilkki2Mobile.this.mBillingClient != null) {
                    if (ProPilkki2Mobile.this.mBillingClient.isReady()) {
                        ProPilkki2Mobile.this.initiatePurchaseFullVersion();
                        return;
                    } else {
                        ProPilkki2Mobile.this.InAppPurchaseCompleteError();
                        ProPilkki2Mobile.this.initialiseBilling();
                        return;
                    }
                }
                ProPilkki2Mobile.this.openPlayStore();
                ProPilkki2Mobile.this.InAppPurchaseCompleteError();
            }
        });
    }

    public void initiatePurchaseFullVersion() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(PRODUCT_INAPP_FULL).setProductType("inapp").build());
        this.mBillingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), this);
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
        if (billingResult.getResponseCode() == 0) {
            if (list.size() > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator<ProductDetails> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(it.next()).build());
                }
                this.mBillingClient.launchBillingFlow(this, BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList).build());
                return;
            }
            InAppPurchaseCompleteError();
            return;
        }
        InAppPurchaseCompleteError();
    }

    public void openPlayStore() {
        Context applicationContext = getApplicationContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + applicationContext.getPackageName()));
        for (ResolveInfo resolveInfo : applicationContext.getPackageManager().queryIntentActivities(intent, 0)) {
            if (resolveInfo.activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.setFlags(270532608);
                intent.setComponent(componentName);
                applicationContext.startActivity(intent);
                return;
            }
        }
        OpenURL("https://play.google.com/store/apps/details?id=" + applicationContext.getPackageName());
    }

    Vibrator getDefaultVibrator() {
        Context applicationContext = getApplicationContext();
        if (Build.VERSION.SDK_INT >= 31) {
            VibratorManager vibratorManagerM = ProPilkki2Mobile$$ExternalSyntheticApiModelOutline0.m(applicationContext.getSystemService("vibrator_manager"));
            if (vibratorManagerM != null) {
                return vibratorManagerM.getDefaultVibrator();
            }
            return null;
        }
        return (Vibrator) applicationContext.getSystemService("vibrator");
    }

    public void Vibra(int i) {
        Vibrator defaultVibrator = getDefaultVibrator();
        if (defaultVibrator != null) {
            defaultVibrator.cancel();
            if (Build.VERSION.SDK_INT >= 31) {
                defaultVibrator.vibrate(VibrationEffect.createOneShot(i, -1));
            } else {
                defaultVibrator.vibrate(i);
            }
        }
    }

    public String IsVibraAvailable() {
        Vibrator defaultVibrator = getDefaultVibrator();
        if (defaultVibrator != null && defaultVibrator.hasVibrator()) {
            return "1";
        }
        return "0";
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        if (billingResult.getResponseCode() == 0 && list != null) {
            handlePurchases(list);
            return;
        }
        if (billingResult.getResponseCode() == 7) {
            this.mBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: com.procyon.propilkki.ProPilkki2Mobile.8
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public void onQueryPurchasesResponse(BillingResult billingResult2, List<Purchase> list2) {
                    ProPilkki2Mobile.this.handlePurchases(list2);
                }
            });
        } else if (billingResult.getResponseCode() == 1) {
            InAppLicenseCallbackDontAllow();
            InAppPurchaseCompleteError();
        } else {
            InAppLicenseCallbackDontAllow();
            InAppPurchaseCompleteError();
        }
    }

    @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
    public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            mIsInAppFull = true;
            InAppLicenseCallbackAllow();
            InAppPurchaseCompleteOk();
        } else {
            InAppLicenseCallbackDontAllow();
            InAppPurchaseCompleteError();
        }
    }

    void handlePurchases(List<Purchase> list) {
        for (Purchase purchase : list) {
            if (purchase.getProducts().contains(PRODUCT_INAPP_FULL) && purchase.getPurchaseState() == 1) {
                if (!verifyValidSignature(purchase.getOriginalJson(), purchase.getSignature())) {
                    mIsInAppFull = false;
                    InAppLicenseCallbackDontAllow();
                    InAppPurchaseCompleteError();
                    return;
                } else if (!purchase.isAcknowledged()) {
                    this.mBillingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), this);
                } else {
                    mIsInAppFull = true;
                    this.mPurchaseTokenFull = purchase.getPurchaseToken();
                    InAppLicenseCallbackAllow();
                    InAppPurchaseCompleteOk();
                }
            }
        }
    }

    private boolean verifyValidSignature(String str, String str2) {
        try {
            return Security.verifyPurchase(BASE64_PUBLIC_KEY, str, str2);
        } catch (IOException unused) {
            return false;
        }
    }
}
