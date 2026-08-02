package com.squareup.cash.clientrouting.routers.shopping;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.redwood.ui.DensityKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.R;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.cdf.boost.AppPresentation;
import com.squareup.cash.cdf.offers.OffersViewUnavailableForBusinessAlert;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreen;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.shopping.screens.EntityInformation;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.screens.MerchantBoostContext;
import com.squareup.cash.shopping.screens.ShoppingScreen$BrandsSearchScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$ProductSearchScreen;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.settings.screens.ShoppingSettingsScreen;
import com.squareup.cash.shopping.sup.backend.SUPWebSession;
import com.squareup.cash.shopping.sup.backend.SingleWebSessionInMemoryManager;
import com.squareup.protos.cash.cashstorefronts.api.ExternalAppLink;
import com.squareup.protos.cash.cashstorefronts.api.RewardAmount;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata$Metadata$AffiliateBoostMetadata;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata$Metadata$CashAppPayMetadata;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata;
import com.squareup.protos.cash.cashsuggest.api.ShopMerchantInfo;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.FlowKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ShoppingRouter {
    public final Analytics analytics;
    public final RealBoostRepository boostRepository;
    public final String defaultUserAgent;
    public final RealFeatureEligibilityRepository eligibilityRepository;
    public final IntentLauncher launcher;
    public final Navigator navigator;
    public final RealOffersAnalyticsHelper offersAnalyticsHelper;
    public final zzb shoppingWebLauncher;
    public final AndroidStringManager stringManager;

    public ShoppingRouter(Navigator navigator, String str, IntentLauncher intentLauncher, zzb zzbVar, RealBoostRepository realBoostRepository, RealFeatureEligibilityRepository realFeatureEligibilityRepository, AndroidStringManager androidStringManager, Analytics analytics, RealOffersAnalyticsHelper realOffersAnalyticsHelper) {
        navigator.getClass();
        this.navigator = navigator;
        this.defaultUserAgent = str;
        this.launcher = intentLauncher;
        this.shoppingWebLauncher = zzbVar;
        this.boostRepository = realBoostRepository;
        this.eligibilityRepository = realFeatureEligibilityRepository;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.offersAnalyticsHelper = realOffersAnalyticsHelper;
    }

    public static ShoppingScreenContext toShoppingContext(RoutingParams routingParams) {
        Screen screen = routingParams.origin;
        AnalyticsParams analyticsParams = routingParams.analyticsParams;
        if (screen instanceof GlobalSearchScreen) {
            analyticsParams.getClass();
            return new ShoppingScreenContext.Directory(((AnalyticsParams.GlobalSearchAnalyticsParams) analyticsParams).searchToken.toString(), null);
        }
        if (screen instanceof ShoppingScreen$ProductSearchScreen) {
            analyticsParams.getClass();
            return new ShoppingScreenContext.ProductSearch(null, ((AnalyticsParams.ShopHubAnalyticsParams) analyticsParams).shopFlowToken);
        }
        if (screen instanceof ShoppingScreen$BrandsSearchScreen) {
            analyticsParams.getClass();
            return new ShoppingScreenContext.BrandsSearch(((AnalyticsParams.ShopHubAnalyticsParams) analyticsParams).shopFlowToken);
        }
        if (screen instanceof OffersScreen$OffersTimelineScreen) {
            analyticsParams.getClass();
            return new ShoppingScreenContext.OffersTimelineSheet(((OffersScreen$OffersTimelineScreen) screen).parentScreen, ((AnalyticsParams.OffersTabAnalyticsParams) analyticsParams).flowToken);
        }
        if (screen instanceof OffersScreen$OffersDetailsScreen) {
            analyticsParams.getClass();
            OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen = (OffersScreen$OffersDetailsScreen) screen;
            return new ShoppingScreenContext.OffersTab(offersScreen$OffersDetailsScreen.parentScreen, ((AnalyticsParams.OffersTabAnalyticsParams) analyticsParams).flowToken, offersScreen$OffersDetailsScreen.searchFlowToken);
        }
        AnalyticsParams.GenericTreeElementsParams genericTreeElementsParams = analyticsParams instanceof AnalyticsParams.GenericTreeElementsParams ? (AnalyticsParams.GenericTreeElementsParams) analyticsParams : null;
        if (genericTreeElementsParams == null) {
            return null;
        }
        String str = genericTreeElementsParams.referrerFlowToken;
        return new ShoppingScreenContext.MerchantProfile(str, new MerchantBoostContext.MerchantProfileDiscover(str), new EntityInformation(null, genericTreeElementsParams.entityToken, null, null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewCashOfferInAppBrowser viewCashOfferInAppBrowser, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        ShoppingRouter$route$4 shoppingRouter$route$4;
        int i;
        ClientRoute.ViewCashOfferInAppBrowser viewCashOfferInAppBrowser2;
        Object shouldHideShopping;
        RoutingParams routingParams2;
        boolean booleanValue;
        InAppBrowserMetadata inAppBrowserMetadata;
        IabMetadata iabMetadata;
        IabMetadata iabMetadata2;
        IabMetadata iabMetadata3;
        ExternalAppLink externalAppLink;
        boolean z;
        ExternalAppLink.AppLinkAndroid appLinkAndroid;
        String str;
        String str2;
        if (continuationImpl instanceof ShoppingRouter$route$4) {
            shoppingRouter$route$4 = (ShoppingRouter$route$4) continuationImpl;
            int i2 = shoppingRouter$route$4.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                shoppingRouter$route$4.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = shoppingRouter$route$4.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shoppingRouter$route$4.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    viewCashOfferInAppBrowser2 = viewCashOfferInAppBrowser;
                    shoppingRouter$route$4.L$0 = viewCashOfferInAppBrowser2;
                    shoppingRouter$route$4.L$1 = routingParams;
                    shoppingRouter$route$4.label = 1;
                    shouldHideShopping = shouldHideShopping(shoppingRouter$route$4);
                    if (shouldHideShopping == obj2) {
                        return obj2;
                    }
                    routingParams2 = routingParams;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams2 = shoppingRouter$route$4.L$1;
                    ClientRoute.ViewCashOfferInAppBrowser viewCashOfferInAppBrowser3 = shoppingRouter$route$4.L$0;
                    SafeTrace.throwOnFailure(obj);
                    shouldHideShopping = obj;
                    viewCashOfferInAppBrowser2 = viewCashOfferInAppBrowser3;
                }
                booleanValue = ((Boolean) shouldHideShopping).booleanValue();
                Navigator navigator = this.navigator;
                if (!booleanValue) {
                    routingParams2.getClass();
                    Screen screen = routingParams2.origin;
                    this.analytics.track(new OffersViewUnavailableForBusinessAlert(routingParams2.deepLinkMetadata != null ? "external" : screen != null ? Reflection.factory.getOrCreateKotlinClass(screen.getClass()).getSimpleName() : null), null);
                    String str3 = this.stringManager.get(R.string.offers_unavailable_for_business);
                    if (screen == null) {
                        screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                    }
                    navigator.goTo(new FailureMessageScreen(null, str3, null, screen, ColorModel.Icon.INSTANCE, 5));
                    return Unit.INSTANCE;
                }
                ByteString.Companion companion = ByteString.Companion;
                ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewCashOfferInAppBrowser2.b64EncodedProto);
                if (decodeBase64 != null && (inAppBrowserMetadata = (InAppBrowserMetadata) InAppBrowserMetadata.ADAPTER.decode(decodeBase64)) != null) {
                    DensityKt densityKt = inAppBrowserMetadata.metadata;
                    if (densityKt != null) {
                        InAppBrowserMetadata$Metadata$CashAppPayMetadata inAppBrowserMetadata$Metadata$CashAppPayMetadata = densityKt instanceof InAppBrowserMetadata$Metadata$CashAppPayMetadata ? (InAppBrowserMetadata$Metadata$CashAppPayMetadata) densityKt : null;
                        InAppBrowserMetadata.IABMetadataCAP iABMetadataCAP = inAppBrowserMetadata$Metadata$CashAppPayMetadata != null ? inAppBrowserMetadata$Metadata$CashAppPayMetadata.value : null;
                        if (iABMetadataCAP != null) {
                            RewardAmount rewardAmount = iABMetadataCAP.reward;
                            rewardAmount.getClass();
                            iabMetadata2 = new IabMetadata.CashPayMetadata(rewardAmount);
                            iabMetadata3 = iabMetadata2;
                            iabMetadata3.getClass();
                            InAppBrowserMetadata.EntityInformation entityInformation = inAppBrowserMetadata.entity_info;
                            entityInformation.getClass();
                            externalAppLink = inAppBrowserMetadata.app_link;
                            RealOffersAnalyticsHelper realOffersAnalyticsHelper = this.offersAnalyticsHelper;
                            z = false;
                            if (externalAppLink != null && (appLinkAndroid = externalAppLink.f1256android) != null && (str = appLinkAndroid.app_package) != null) {
                                str2 = appLinkAndroid.app_link_url;
                                if (str2 != null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: android app_link_url == null");
                                    return null;
                                }
                                if (iabMetadata3 instanceof IabMetadata.AffiliateBoostMetadata) {
                                    RealBoostRepository.selectBoost$default(this.boostRepository, new Finish(null), ((IabMetadata.AffiliateBoostMetadata) iabMetadata3).boostToken, null, null, realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.BOOST_PLASMA), null, null, null, AppPresentation.BottomSheet, null, null, 7912);
                                }
                                z = this.launcher.launchAppLink(str2, str);
                            }
                            if (z) {
                                realOffersAnalyticsHelper.refreshFlowToken(OffersAnalyticsHelper$Flow.BROWSE);
                                return Unit.INSTANCE;
                            }
                            String str4 = inAppBrowserMetadata.user_agent;
                            String concat = this.defaultUserAgent.concat(str4 != null ? " ".concat(str4) : "");
                            String str5 = inAppBrowserMetadata.url;
                            ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2 = str5 != null ? new ShoppingWebScreen.ShoppingWebScreenV2(str5, concat, toShoppingContext(routingParams2), entityInformation, iabMetadata3) : null;
                            if (shoppingWebScreenV2 != null) {
                                navigator.goTo(shoppingWebScreenV2);
                            }
                        }
                    }
                    if (densityKt != null) {
                        InAppBrowserMetadata$Metadata$AffiliateBoostMetadata inAppBrowserMetadata$Metadata$AffiliateBoostMetadata = densityKt instanceof InAppBrowserMetadata$Metadata$AffiliateBoostMetadata ? (InAppBrowserMetadata$Metadata$AffiliateBoostMetadata) densityKt : null;
                        InAppBrowserMetadata.IABMetadataAffiliateBoost iABMetadataAffiliateBoost = inAppBrowserMetadata$Metadata$AffiliateBoostMetadata != null ? inAppBrowserMetadata$Metadata$AffiliateBoostMetadata.value : null;
                        if (iABMetadataAffiliateBoost != null) {
                            RewardAmount rewardAmount2 = iABMetadataAffiliateBoost.reward;
                            rewardAmount2.getClass();
                            String str6 = iABMetadataAffiliateBoost.boost_token;
                            str6.getClass();
                            iabMetadata2 = new IabMetadata.AffiliateBoostMetadata(rewardAmount2, str6);
                            iabMetadata3 = iabMetadata2;
                            iabMetadata3.getClass();
                            InAppBrowserMetadata.EntityInformation entityInformation2 = inAppBrowserMetadata.entity_info;
                            entityInformation2.getClass();
                            externalAppLink = inAppBrowserMetadata.app_link;
                            RealOffersAnalyticsHelper realOffersAnalyticsHelper2 = this.offersAnalyticsHelper;
                            z = false;
                            if (externalAppLink != null) {
                                str2 = appLinkAndroid.app_link_url;
                                if (str2 != null) {
                                }
                            }
                            if (z) {
                            }
                        }
                    }
                    if (densityKt != null) {
                        InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata inAppBrowserMetadata$Metadata$AfterpayShoppingMetadata = densityKt instanceof InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata ? (InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata) densityKt : null;
                        InAppBrowserMetadata.IABMetadataAfterpay iABMetadataAfterpay = inAppBrowserMetadata$Metadata$AfterpayShoppingMetadata != null ? inAppBrowserMetadata$Metadata$AfterpayShoppingMetadata.value : null;
                        if (iABMetadataAfterpay != null) {
                            Integer num = iABMetadataAfterpay.number_installments;
                            num.getClass();
                            iabMetadata = new IabMetadata.AfterpayMetadata(num.intValue());
                            if (iabMetadata == null) {
                                iabMetadata3 = iabMetadata;
                                iabMetadata3.getClass();
                                InAppBrowserMetadata.EntityInformation entityInformation22 = inAppBrowserMetadata.entity_info;
                                entityInformation22.getClass();
                                externalAppLink = inAppBrowserMetadata.app_link;
                                RealOffersAnalyticsHelper realOffersAnalyticsHelper22 = this.offersAnalyticsHelper;
                                z = false;
                                if (externalAppLink != null) {
                                }
                                if (z) {
                                }
                            } else {
                                if (densityKt != null) {
                                    InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata inAppBrowserMetadata$Metadata$SingleUsePaymentMetadata = densityKt instanceof InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata ? (InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata) densityKt : null;
                                    InAppBrowserMetadata.IABMetadataSUP iABMetadataSUP = inAppBrowserMetadata$Metadata$SingleUsePaymentMetadata != null ? inAppBrowserMetadata$Metadata$SingleUsePaymentMetadata.value : null;
                                    if (iABMetadataSUP != null) {
                                        iabMetadata2 = new IabMetadata.SUPMetadata(iABMetadataSUP.sup_token, null);
                                        iabMetadata3 = iabMetadata2;
                                        iabMetadata3.getClass();
                                        InAppBrowserMetadata.EntityInformation entityInformation222 = inAppBrowserMetadata.entity_info;
                                        entityInformation222.getClass();
                                        externalAppLink = inAppBrowserMetadata.app_link;
                                        RealOffersAnalyticsHelper realOffersAnalyticsHelper222 = this.offersAnalyticsHelper;
                                        z = false;
                                        if (externalAppLink != null) {
                                        }
                                        if (z) {
                                        }
                                    }
                                }
                                iabMetadata2 = null;
                                iabMetadata3 = iabMetadata2;
                                iabMetadata3.getClass();
                                InAppBrowserMetadata.EntityInformation entityInformation2222 = inAppBrowserMetadata.entity_info;
                                entityInformation2222.getClass();
                                externalAppLink = inAppBrowserMetadata.app_link;
                                RealOffersAnalyticsHelper realOffersAnalyticsHelper2222 = this.offersAnalyticsHelper;
                                z = false;
                                if (externalAppLink != null) {
                                }
                                if (z) {
                                }
                            }
                        }
                    }
                    iabMetadata = null;
                    if (iabMetadata == null) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        shoppingRouter$route$4 = new ShoppingRouter$route$4(this, continuationImpl);
        Object obj3 = shoppingRouter$route$4.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shoppingRouter$route$4.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) shouldHideShopping).booleanValue();
        Navigator navigator2 = this.navigator;
        if (!booleanValue) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shouldHideShopping(ContinuationImpl continuationImpl) {
        ShoppingRouter$shouldHideShopping$1 shoppingRouter$shouldHideShopping$1;
        int i;
        if (continuationImpl instanceof ShoppingRouter$shouldHideShopping$1) {
            shoppingRouter$shouldHideShopping$1 = (ShoppingRouter$shouldHideShopping$1) continuationImpl;
            int i2 = shoppingRouter$shouldHideShopping$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                shoppingRouter$shouldHideShopping$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = shoppingRouter$shouldHideShopping$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shoppingRouter$shouldHideShopping$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i3 = 10;
                    FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = new FinishSetupTileBadgeCounter(i3, this.eligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.CASH_OFFERS_TAB});
                    shoppingRouter$shouldHideShopping$1.label = 1;
                    obj = FlowKt.firstOrNull(finishSetupTileBadgeCounter, shoppingRouter$shouldHideShopping$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(Intrinsics.areEqual(obj, Boolean.FALSE));
            }
        }
        shoppingRouter$shouldHideShopping$1 = new ShoppingRouter$shouldHideShopping$1(this, continuationImpl);
        Object obj2 = shoppingRouter$shouldHideShopping$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shoppingRouter$shouldHideShopping$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(Intrinsics.areEqual(obj2, Boolean.FALSE));
    }

    public final void route(ClientRoute.InitiateSingleUsePayment initiateSingleUsePayment, RoutingParams routingParams) {
        ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2;
        initiateSingleUsePayment.getClass();
        routingParams.getClass();
        Screen screen = routingParams.origin;
        ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV22 = screen instanceof ShoppingWebScreen.ShoppingWebScreenV2 ? (ShoppingWebScreen.ShoppingWebScreenV2) screen : null;
        ShoppingScreenContext shoppingScreenContext = shoppingWebScreenV22 != null ? shoppingWebScreenV22.screenContext : null;
        SUPWebSession sUPWebSession = ((SingleWebSessionInMemoryManager) this.shoppingWebLauncher.zza).session;
        if (sUPWebSession != null) {
            String str = sUPWebSession.url;
            str.getClass();
            String str2 = sUPWebSession.userAgent;
            InAppBrowserMetadata.EntityInformation entityInformation = sUPWebSession.entityInformation;
            entityInformation.getClass();
            shoppingWebScreenV2 = new ShoppingWebScreen.ShoppingWebScreenV2(str, str2, shoppingScreenContext, entityInformation, new IabMetadata.SUPMetadata(sUPWebSession.supToken, null));
        } else {
            shoppingWebScreenV2 = null;
        }
        if (shoppingWebScreenV2 != null) {
            IabMetadata iabMetadata = shoppingWebScreenV2.metadata;
            iabMetadata.getClass();
            this.navigator.goTo(ShoppingWebScreen.ShoppingWebScreenV2.copy$default(shoppingWebScreenV2, null, new IabMetadata.SUPMetadata(((IabMetadata.SUPMetadata) iabMetadata).supToken, initiateSingleUsePayment.initiationData), 15));
        }
    }

    public final void route(ClientRoute.ViewShopBrandsSearch viewShopBrandsSearch, RoutingParams routingParams) {
        viewShopBrandsSearch.getClass();
        routingParams.getClass();
        this.navigator.goTo(new ShoppingScreen$BrandsSearchScreen(toShoppingContext(routingParams), viewShopBrandsSearch.searchText));
    }

    public final void route(ClientRoute.ViewShopProductsSearch viewShopProductsSearch, RoutingParams routingParams) {
        viewShopProductsSearch.getClass();
        routingParams.getClass();
        this.navigator.goTo(new ShoppingScreen$ProductSearchScreen(toShoppingContext(routingParams), viewShopProductsSearch.searchText, EmptyList.INSTANCE));
    }

    public final void route(ClientRoute.ViewAfterpayInAppBrowser viewAfterpayInAppBrowser, RoutingParams routingParams) {
        viewAfterpayInAppBrowser.getClass();
        routingParams.getClass();
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewAfterpayInAppBrowser.base64EncodedShopUrl);
        this.navigator.goTo(new ShoppingWebScreen.AfterPayShoppingScreen(decodeBase64 != null ? decodeBase64.utf8() : null, toShoppingContext(routingParams), null));
    }

    public final void route(ClientRoute.ViewAfterpayInAppBrowserV2 viewAfterpayInAppBrowserV2, RoutingParams routingParams) {
        ShopMerchantInfo shopMerchantInfo;
        viewAfterpayInAppBrowserV2.getClass();
        routingParams.getClass();
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewAfterpayInAppBrowserV2.base64EncodedMerchantInfo);
        if (decodeBase64 == null || (shopMerchantInfo = (ShopMerchantInfo) ShopMerchantInfo.ADAPTER.decode(decodeBase64)) == null) {
            return;
        }
        String str = shopMerchantInfo.merchant_url;
        str.getClass();
        this.navigator.goTo(new ShoppingWebScreen.AfterPayShoppingScreen(str, toShoppingContext(routingParams), shopMerchantInfo.user_agent));
    }

    public final void route(ClientRoute.ViewShoppingSettings viewShoppingSettings, RoutingParams routingParams) {
        viewShoppingSettings.getClass();
        routingParams.getClass();
        this.navigator.goTo(ShoppingSettingsScreen.INSTANCE);
    }
}
