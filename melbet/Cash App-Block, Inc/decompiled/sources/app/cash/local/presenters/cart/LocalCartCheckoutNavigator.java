package app.cash.local.presenters.cart;

import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.real.RealLocalOrderRepository;
import app.cash.local.presenters.OrderBuilder$Payload;
import app.cash.local.presenters.RealOrderBuilder;
import app.cash.local.presenters.RealOrderBuilder$Factory$Impl;
import app.cash.local.presenters.RealOrderBuilderStore;
import app.cash.local.presenters.brand.checkout.OpenTabCheckoutRouting;
import app.cash.local.presenters.cart.LocalCartCheckoutResult;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.viewmodels.CreateCartErrorViewModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.tinygraph.BaseRepositoryKt;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse$Response$Cart;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import sqip.CardEntry;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class LocalCartCheckoutNavigator {
    public final RealLocalOrderRepository localOrderRepository;
    public final RealOrderBuilder$Factory$Impl orderBuilderFactory;
    public final RealOrderBuilderStore orderStore;
    public final AndroidStringManager stringManager;

    public LocalCartCheckoutNavigator(RealLocalOrderRepository realLocalOrderRepository, RealOrderBuilder$Factory$Impl realOrderBuilder$Factory$Impl, RealOrderBuilderStore realOrderBuilderStore, AndroidStringManager androidStringManager, RealUuidGenerator realUuidGenerator) {
        this.localOrderRepository = realLocalOrderRepository;
        this.orderBuilderFactory = realOrderBuilder$Factory$Impl;
        this.orderStore = realOrderBuilderStore;
        this.stringManager = androidStringManager;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(1:(4:9|10|11|12)(2:81|82))(2:83|(2:146|147)(27:87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|(1:114)(1:115)))|13|14|(3:18|(1:20)(1:69)|(2:22|(2:24|25)(3:(4:30|(1:32)(1:66)|(1:34)(1:65)|(14:36|(1:38)(1:64)|(1:40)|41|(1:43)(1:63)|(1:45)|46|(1:48)(1:62)|49|(2:51|(1:53))(1:61)|54|(1:58)|59|60))|67|68)))|70|(0)(0)))|148|6|(0)(0)|13|14|(4:16|18|(0)(0)|(0))|70|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x009a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createCheckoutResult(LocalCart localCart, BrandSpot brandSpot, AttributionKey attributionKey, boolean z, BrandSpotSyncTokens brandSpotSyncTokens, BetterNavigator.ScreenNavigator screenNavigator, OrderBuilder$Payload orderBuilder$Payload, OpenTabCheckoutRouting openTabCheckoutRouting, BuyerIntentScope buyerIntentScope, ContinuationImpl continuationImpl) {
        LocalCartCheckoutNavigator$createCheckoutResult$1 localCartCheckoutNavigator$createCheckoutResult$1;
        int i;
        String str;
        BrandSpot brandSpot2;
        AttributionKey attributionKey2;
        boolean z2;
        BrandSpotSyncTokens brandSpotSyncTokens2;
        BetterNavigator.ScreenNavigator screenNavigator2;
        OrderBuilder$Payload orderBuilder$Payload2;
        OpenTabCheckoutRouting openTabCheckoutRouting2;
        BuyerIntentScope buyerIntentScope2;
        RealLocalOrderRepository realLocalOrderRepository;
        OrderBuilder$Payload orderBuilder$Payload3;
        OpenTabCheckoutRouting openTabCheckoutRouting3;
        CreateCartResponse createCartResponse;
        LocalErrorResponse localErrorResponse;
        zzho zzhoVar;
        LocalCart localCart2;
        zzho zzhoVar2;
        CreateCartResponse$Response$ErrorResponse createCartResponse$Response$ErrorResponse;
        LocalCart localCart3 = localCart;
        if (continuationImpl instanceof LocalCartCheckoutNavigator$createCheckoutResult$1) {
            localCartCheckoutNavigator$createCheckoutResult$1 = (LocalCartCheckoutNavigator$createCheckoutResult$1) continuationImpl;
            int i2 = localCartCheckoutNavigator$createCheckoutResult$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                localCartCheckoutNavigator$createCheckoutResult$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = localCartCheckoutNavigator$createCheckoutResult$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = localCartCheckoutNavigator$createCheckoutResult$1.label;
                OrderBuilder$Payload orderBuilder$Payload4 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (localCart3 == null || (str = localCart3.token) == null) {
                        return new LocalCartCheckoutResult.Error(genericErrorViewModel());
                    }
                    try {
                        realLocalOrderRepository = this.localOrderRepository;
                        localCartCheckoutNavigator$createCheckoutResult$1.L$0 = localCart3;
                        brandSpot2 = brandSpot;
                        try {
                            localCartCheckoutNavigator$createCheckoutResult$1.L$1 = brandSpot2;
                            attributionKey2 = attributionKey;
                        } catch (Exception e) {
                            e = e;
                            attributionKey2 = attributionKey;
                            z2 = z;
                            brandSpotSyncTokens2 = brandSpotSyncTokens;
                            screenNavigator2 = screenNavigator;
                            orderBuilder$Payload2 = orderBuilder$Payload;
                            openTabCheckoutRouting2 = openTabCheckoutRouting;
                            buyerIntentScope2 = buyerIntentScope;
                            if (e instanceof CancellationException) {
                                throw e;
                            }
                            Timber.Forest.w("Failed to fetch cart for checkout.", new Object[0], e);
                            createCartResponse = null;
                            orderBuilder$Payload3 = orderBuilder$Payload2;
                            openTabCheckoutRouting3 = openTabCheckoutRouting2;
                            if (createCartResponse != null) {
                            }
                            localErrorResponse = null;
                            if (localErrorResponse == null) {
                            }
                        }
                        try {
                            localCartCheckoutNavigator$createCheckoutResult$1.L$2 = attributionKey2;
                            brandSpotSyncTokens2 = brandSpotSyncTokens;
                        } catch (Exception e2) {
                            e = e2;
                            z2 = z;
                            brandSpotSyncTokens2 = brandSpotSyncTokens;
                            screenNavigator2 = screenNavigator;
                            orderBuilder$Payload2 = orderBuilder$Payload;
                            openTabCheckoutRouting2 = openTabCheckoutRouting;
                            buyerIntentScope2 = buyerIntentScope;
                            if (e instanceof CancellationException) {
                            }
                        }
                        try {
                            localCartCheckoutNavigator$createCheckoutResult$1.L$3 = brandSpotSyncTokens2;
                            screenNavigator2 = screenNavigator;
                            try {
                                localCartCheckoutNavigator$createCheckoutResult$1.L$4 = screenNavigator2;
                                orderBuilder$Payload2 = orderBuilder$Payload;
                            } catch (Exception e3) {
                                e = e3;
                                z2 = z;
                                orderBuilder$Payload2 = orderBuilder$Payload;
                                openTabCheckoutRouting2 = openTabCheckoutRouting;
                                buyerIntentScope2 = buyerIntentScope;
                                if (e instanceof CancellationException) {
                                }
                            }
                            try {
                                localCartCheckoutNavigator$createCheckoutResult$1.L$5 = orderBuilder$Payload2;
                                openTabCheckoutRouting2 = openTabCheckoutRouting;
                            } catch (Exception e4) {
                                e = e4;
                                z2 = z;
                                openTabCheckoutRouting2 = openTabCheckoutRouting;
                                buyerIntentScope2 = buyerIntentScope;
                                if (e instanceof CancellationException) {
                                }
                            }
                        } catch (Exception e5) {
                            e = e5;
                            z2 = z;
                            screenNavigator2 = screenNavigator;
                            orderBuilder$Payload2 = orderBuilder$Payload;
                            openTabCheckoutRouting2 = openTabCheckoutRouting;
                            buyerIntentScope2 = buyerIntentScope;
                            if (e instanceof CancellationException) {
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                        brandSpot2 = brandSpot;
                    }
                    try {
                        localCartCheckoutNavigator$createCheckoutResult$1.L$6 = openTabCheckoutRouting2;
                        buyerIntentScope2 = buyerIntentScope;
                        try {
                            localCartCheckoutNavigator$createCheckoutResult$1.L$7 = buyerIntentScope2;
                            z2 = z;
                        } catch (Exception e7) {
                            e = e7;
                            z2 = z;
                        }
                        try {
                            localCartCheckoutNavigator$createCheckoutResult$1.Z$0 = z2;
                            localCartCheckoutNavigator$createCheckoutResult$1.label = 1;
                            obj = realLocalOrderRepository.getCart(str, localCartCheckoutNavigator$createCheckoutResult$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                            orderBuilder$Payload3 = orderBuilder$Payload2;
                            openTabCheckoutRouting3 = openTabCheckoutRouting2;
                        } catch (Exception e8) {
                            e = e8;
                            if (e instanceof CancellationException) {
                            }
                        }
                    } catch (Exception e9) {
                        e = e9;
                        z2 = z;
                        buyerIntentScope2 = buyerIntentScope;
                        if (e instanceof CancellationException) {
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = localCartCheckoutNavigator$createCheckoutResult$1.Z$0;
                    BuyerIntentScope buyerIntentScope3 = localCartCheckoutNavigator$createCheckoutResult$1.L$7;
                    openTabCheckoutRouting3 = localCartCheckoutNavigator$createCheckoutResult$1.L$6;
                    orderBuilder$Payload3 = localCartCheckoutNavigator$createCheckoutResult$1.L$5;
                    BetterNavigator.ScreenNavigator screenNavigator3 = localCartCheckoutNavigator$createCheckoutResult$1.L$4;
                    BrandSpotSyncTokens brandSpotSyncTokens3 = localCartCheckoutNavigator$createCheckoutResult$1.L$3;
                    AttributionKey attributionKey3 = localCartCheckoutNavigator$createCheckoutResult$1.L$2;
                    BrandSpot brandSpot3 = localCartCheckoutNavigator$createCheckoutResult$1.L$1;
                    LocalCart localCart4 = localCartCheckoutNavigator$createCheckoutResult$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        screenNavigator2 = screenNavigator3;
                        brandSpot2 = brandSpot3;
                        brandSpotSyncTokens2 = brandSpotSyncTokens3;
                        attributionKey2 = attributionKey3;
                        z2 = z3;
                        localCart3 = localCart4;
                        buyerIntentScope2 = buyerIntentScope3;
                    } catch (Exception e10) {
                        e = e10;
                        screenNavigator2 = screenNavigator3;
                        brandSpot2 = brandSpot3;
                        brandSpotSyncTokens2 = brandSpotSyncTokens3;
                        attributionKey2 = attributionKey3;
                        z2 = z3;
                        localCart3 = localCart4;
                        buyerIntentScope2 = buyerIntentScope3;
                        openTabCheckoutRouting2 = openTabCheckoutRouting3;
                        orderBuilder$Payload2 = orderBuilder$Payload3;
                        if (e instanceof CancellationException) {
                        }
                    }
                }
                createCartResponse = (CreateCartResponse) obj;
                if (createCartResponse != null && (zzhoVar2 = createCartResponse.response) != null) {
                    createCartResponse$Response$ErrorResponse = !(zzhoVar2 instanceof CreateCartResponse$Response$ErrorResponse) ? (CreateCartResponse$Response$ErrorResponse) zzhoVar2 : null;
                    if (createCartResponse$Response$ErrorResponse != null) {
                        localErrorResponse = createCartResponse$Response$ErrorResponse.value;
                        if (localErrorResponse == null) {
                            return new LocalCartCheckoutResult.Error(genericErrorViewModel());
                        }
                        if (createCartResponse != null && (zzhoVar = createCartResponse.response) != null) {
                            CreateCartResponse$Response$Cart createCartResponse$Response$Cart = zzhoVar instanceof CreateCartResponse$Response$Cart ? (CreateCartResponse$Response$Cart) zzhoVar : null;
                            LocalCart localCart5 = createCartResponse$Response$Cart != null ? createCartResponse$Response$Cart.value : null;
                            if (localCart5 != null) {
                                LocalCart.OpenTabInfo openTabInfo = localCart3.open_tab_info;
                                List<LocalCart.OpenTabInfo.Round> list = openTabInfo != null ? openTabInfo.rounds : null;
                                if (list == null) {
                                    list = EmptyList.INSTANCE;
                                }
                                LocalCart.OpenTabInfo openTabInfo2 = localCart5.open_tab_info;
                                List<LocalCart.OpenTabInfo.Round> list2 = openTabInfo2 != null ? openTabInfo2.rounds : null;
                                if (list2 == null) {
                                    list2 = EmptyList.INSTANCE;
                                }
                                if (list.size() > list2.size()) {
                                    LocalCart localCart6 = localCart5;
                                    localCart2 = localCart6;
                                    createCartResponse = CreateCartResponse.copy$default(createCartResponse, new CreateCartResponse$Response$Cart(LocalCart.copy$default(localCart6, null, null, null, null, null, localCart3.open_tab_info, null, null, 28671)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862);
                                } else {
                                    localCart2 = localCart5;
                                }
                                RealOrderBuilderStore realOrderBuilderStore = this.orderStore;
                                if (orderBuilder$Payload3 == null) {
                                    RealOrderBuilder realOrderBuilder = realOrderBuilderStore.active;
                                    if (realOrderBuilder != null) {
                                        orderBuilder$Payload4 = realOrderBuilder.payload();
                                    }
                                } else {
                                    orderBuilder$Payload4 = orderBuilder$Payload3;
                                }
                                String str2 = localCart2.checkout_flow_token;
                                if (str2 == null && (str2 = localCart3.checkout_flow_token) == null) {
                                    str2 = "";
                                }
                                CreateCartResponse createCartResponse2 = createCartResponse;
                                BrandSpot brandSpot4 = brandSpot2;
                                RealOrderBuilder create = this.orderBuilderFactory.create(brandSpot4, createCartResponse2, attributionKey2, screenNavigator2, str2, orderBuilder$Payload4, z2, brandSpotSyncTokens2, buyerIntentScope2);
                                realOrderBuilderStore.active = create;
                                CardEntry.setCardNonceBackgroundHandler(create);
                                return new LocalCartCheckoutResult.Navigation(BaseRepositoryKt.toCheckoutScreen$default(createCartResponse2, brandSpot4, attributionKey2, z2, brandSpotSyncTokens2, openTabCheckoutRouting3));
                            }
                        }
                        return new LocalCartCheckoutResult.Error(genericErrorViewModel());
                    }
                }
                localErrorResponse = null;
                if (localErrorResponse == null) {
                }
            }
        }
        localCartCheckoutNavigator$createCheckoutResult$1 = new LocalCartCheckoutNavigator$createCheckoutResult$1(this, continuationImpl);
        Object obj3 = localCartCheckoutNavigator$createCheckoutResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = localCartCheckoutNavigator$createCheckoutResult$1.label;
        OrderBuilder$Payload orderBuilder$Payload42 = null;
        if (i != 0) {
        }
        createCartResponse = (CreateCartResponse) obj3;
        if (createCartResponse != null) {
            if (!(zzhoVar2 instanceof CreateCartResponse$Response$ErrorResponse)) {
            }
            if (createCartResponse$Response$ErrorResponse != null) {
            }
        }
        localErrorResponse = null;
        if (localErrorResponse == null) {
        }
    }

    public final CreateCartErrorViewModel genericErrorViewModel() {
        return new CreateCartErrorViewModel(re$$ExternalSyntheticOutline0.m(), null, this.stringManager.get(R.string.local_presenters_something_went_wrong));
    }
}
