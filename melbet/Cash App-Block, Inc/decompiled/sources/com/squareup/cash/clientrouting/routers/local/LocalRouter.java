package com.squareup.cash.clientrouting.routers.local;

import app.cash.broadway.navigation.Navigator;
import app.cash.local.navigation.api.RealCashLocalNavigator;
import app.cash.local.navigation.api.RealCashLocalNavigator$Factory$Impl;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.screens.app.LocalAddBrandsScreen;
import app.cash.local.screens.app.LocalBrandLocationMenuScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalCashBalanceScreen;
import app.cash.local.screens.app.LocalCheckoutDeeplinkScreen;
import app.cash.local.screens.app.LocalEditorialScreen;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.local.screens.app.LocalPosCheckInScreen;
import app.cash.local.screens.app.LocalShortlinkSheet;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.screens.app.TableQrCodeScannerScreen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.fallback.CashtagBrandNavigator$Companion;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.tabprovider.real.RealLocalTabProvider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import okhttp3.HttpUrl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class LocalRouter {
    public final RealCashLocalNavigator localNavigator;
    public final RealLocalTabProvider localTabProvider;
    public final Navigator navigator;

    public LocalRouter(RealCashLocalNavigator$Factory$Impl realCashLocalNavigator$Factory$Impl, RealLocalTabProvider realLocalTabProvider, Navigator navigator) {
        navigator.getClass();
        this.localTabProvider = realLocalTabProvider;
        this.navigator = navigator;
        RealUuidGenerator realUuidGenerator = (RealUuidGenerator) realCashLocalNavigator$Factory$Impl.delegateFactory.sandboxer.invoke();
        realUuidGenerator.getClass();
        this.localNavigator = new RealCashLocalNavigator(realUuidGenerator, navigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ContinuationImpl continuationImpl) {
        LocalRouter$route$1 localRouter$route$1;
        Object obj;
        int i;
        if (continuationImpl instanceof LocalRouter$route$1) {
            localRouter$route$1 = (LocalRouter$route$1) continuationImpl;
            int i2 = localRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                localRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = localRouter$route$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = localRouter$route$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                    CardModelView.AnonymousClass1.C00581 c00581 = new CardModelView.AnonymousClass1.C00581(this, continuation, 23);
                    localRouter$route$1.label = 1;
                    obj = JobKt.m4185withTimeoutOrNullKLykuaI(duration, c00581, localRouter$route$1);
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
                if (((Unit) obj) == null) {
                    this.navigator.goTo(LocalTabScreen.INSTANCE);
                }
                return Unit.INSTANCE;
            }
        }
        localRouter$route$1 = new LocalRouter$route$1(this, continuationImpl);
        obj = localRouter$route$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = localRouter$route$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((Unit) obj) == null) {
        }
        return Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewLocalMenuShortlink viewLocalMenuShortlink) {
        viewLocalMenuShortlink.getClass();
        this.navigator.goTo(new LocalBrandLocationMenuScreen(new BrandSpot(viewLocalMenuShortlink.brandShortToken, viewLocalMenuShortlink.locationShortToken), false, new AttributionKey(viewLocalMenuShortlink.attributionKey), null, 96));
    }

    public final void route(ClientRoute.ViewLocalBrandProfileWithDefaultLocation viewLocalBrandProfileWithDefaultLocation, RoutingParams routingParams) {
        String str;
        String str2;
        HttpUrl httpUrl;
        viewLocalBrandProfileWithDefaultLocation.getClass();
        routingParams.getClass();
        BrandSpot brandSpot = new BrandSpot(viewLocalBrandProfileWithDefaultLocation.brandShortToken, null);
        AttributionKey attributionKey = new AttributionKey(viewLocalBrandProfileWithDefaultLocation.attributionKey);
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        if (deepLinkMetadata == null || (str2 = deepLinkMetadata.originalUrl) == null) {
            str = null;
        } else {
            try {
                HttpUrl.Builder builder = new HttpUrl.Builder();
                builder.parse$okhttp(null, str2);
                httpUrl = builder.build();
            } catch (IllegalArgumentException unused) {
                httpUrl = null;
            }
            str = httpUrl != null ? httpUrl.queryParameter("coupon_code") : null;
        }
        this.navigator.goTo(new LocalBrandProfileScreen(brandSpot, attributionKey, (MarketingMessageOfferDetails) null, (String) null, str, (BrandSpotSyncTokens) null, deepLinkMetadata != null ? deepLinkMetadata.originalUrl : null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE));
    }

    public final void route(ClientRoute.ViewLocalCashDetail viewLocalCashDetail) {
        viewLocalCashDetail.getClass();
        this.navigator.goTo(new LocalCashBalanceScreen(2));
    }

    public final void route(ClientRoute.ViewLocalBrandBrowser viewLocalBrandBrowser) {
        viewLocalBrandBrowser.getClass();
        this.navigator.goTo(LocalAddBrandsScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewNeighborhoodsCheckInScanner viewNeighborhoodsCheckInScanner) {
        viewNeighborhoodsCheckInScanner.getClass();
        this.navigator.goTo(LocalPosCheckInScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewNeighborhoodsLocalEarningCards viewNeighborhoodsLocalEarningCards) {
        viewNeighborhoodsLocalEarningCards.getClass();
        this.navigator.goTo(new LocalCashBalanceScreen(false, true));
    }

    public final void route(ClientRoute.ViewNeighborhoodsTableQrCodeScanner viewNeighborhoodsTableQrCodeScanner) {
        viewNeighborhoodsTableQrCodeScanner.getClass();
        this.navigator.goTo(TableQrCodeScannerScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewLocalBrandCheckoutWithCashtag viewLocalBrandCheckoutWithCashtag) {
        viewLocalBrandCheckoutWithCashtag.getClass();
        String concat = viewLocalBrandCheckoutWithCashtag.currency.concat(viewLocalBrandCheckoutWithCashtag.name);
        String str = viewLocalBrandCheckoutWithCashtag.cartToken;
        RealCashLocalNavigator realCashLocalNavigator = this.localNavigator;
        realCashLocalNavigator.getClass();
        realCashLocalNavigator.navigator.goTo(new LocalCheckoutDeeplinkScreen(str, concat));
    }

    public final void route(ClientRoute.ViewLocalBrandProfile viewLocalBrandProfile, RoutingParams routingParams) {
        String str;
        String str2;
        HttpUrl httpUrl;
        viewLocalBrandProfile.getClass();
        routingParams.getClass();
        String str3 = viewLocalBrandProfile.brandToken;
        String str4 = viewLocalBrandProfile.locationToken;
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        if (deepLinkMetadata == null || (str2 = deepLinkMetadata.originalUrl) == null) {
            str = null;
        } else {
            try {
                HttpUrl.Builder builder = new HttpUrl.Builder();
                builder.parse$okhttp(null, str2);
                httpUrl = builder.build();
            } catch (IllegalArgumentException unused) {
                httpUrl = null;
            }
            str = httpUrl != null ? httpUrl.queryParameter("coupon_code") : null;
        }
        this.localNavigator.goToBrand(str3, str4, null, str, deepLinkMetadata != null ? deepLinkMetadata.originalUrl : null);
    }

    public final void route(ClientRoute.ViewLocalBrandProfileQrOrdering viewLocalBrandProfileQrOrdering, RoutingParams routingParams) {
        viewLocalBrandProfileQrOrdering.getClass();
        routingParams.getClass();
        String concat = viewLocalBrandProfileQrOrdering.currency.concat(viewLocalBrandProfileQrOrdering.name);
        String str = viewLocalBrandProfileQrOrdering.locationToken;
        String str2 = viewLocalBrandProfileQrOrdering.inStoreOrderingToken;
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        String str3 = deepLinkMetadata != null ? deepLinkMetadata.originalUrl : null;
        RealCashLocalNavigator realCashLocalNavigator = this.localNavigator;
        realCashLocalNavigator.getClass();
        realCashLocalNavigator.navigator.goTo(new LocalBrandProfileScreen(new BrandSpot(concat, str), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, new BrandSpotSyncTokens(str2, RealUuidGenerator.generate().toString(), 1), str3, EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE));
    }

    public final void route(ClientRoute.ViewLocalBrandProfileShortlink viewLocalBrandProfileShortlink, RoutingParams routingParams) {
        String str;
        String str2;
        HttpUrl httpUrl;
        viewLocalBrandProfileShortlink.getClass();
        routingParams.getClass();
        String str3 = viewLocalBrandProfileShortlink.brandShortToken;
        String str4 = viewLocalBrandProfileShortlink.locationShortToken;
        String str5 = viewLocalBrandProfileShortlink.attributionKey;
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        if (deepLinkMetadata == null || (str2 = deepLinkMetadata.originalUrl) == null) {
            str = null;
        } else {
            try {
                HttpUrl.Builder builder = new HttpUrl.Builder();
                builder.parse$okhttp(null, str2);
                httpUrl = builder.build();
            } catch (IllegalArgumentException unused) {
                httpUrl = null;
            }
            str = httpUrl != null ? httpUrl.queryParameter("coupon_code") : null;
        }
        this.localNavigator.goToBrand(str3, str4, str5, str, deepLinkMetadata != null ? deepLinkMetadata.originalUrl : null);
    }

    public final void route(ClientRoute.ViewLocalBrandProfileWithCashtagAndLocationSlug viewLocalBrandProfileWithCashtagAndLocationSlug, RoutingParams routingParams) {
        viewLocalBrandProfileWithCashtagAndLocationSlug.getClass();
        routingParams.getClass();
        String concat = viewLocalBrandProfileWithCashtagAndLocationSlug.currency.concat(viewLocalBrandProfileWithCashtagAndLocationSlug.name);
        String str = viewLocalBrandProfileWithCashtagAndLocationSlug.locationSlug;
        String extractAttributionKey = CashtagBrandNavigator$Companion.extractAttributionKey(routingParams);
        String extractCouponCode = CashtagBrandNavigator$Companion.extractCouponCode(routingParams);
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        this.localNavigator.goToBrand(concat, str, extractAttributionKey, extractCouponCode, deepLinkMetadata != null ? deepLinkMetadata.originalUrl : null);
    }

    public final void route(ClientRoute.ViewLocalEditorial viewLocalEditorial) {
        viewLocalEditorial.getClass();
        String str = viewLocalEditorial.editorialToken;
        String str2 = viewLocalEditorial.attributionKey;
        RealCashLocalNavigator realCashLocalNavigator = this.localNavigator;
        realCashLocalNavigator.getClass();
        realCashLocalNavigator.navigator.goTo(new LocalEditorialScreen(str, new AttributionKey(str2)));
    }

    public final void route(ClientRoute.ViewLocalMarketingMessage viewLocalMarketingMessage) {
        viewLocalMarketingMessage.getClass();
        String str = viewLocalMarketingMessage.brandToken;
        String str2 = viewLocalMarketingMessage.messageToken;
        AttributionKey attributionKey = new AttributionKey(viewLocalMarketingMessage.attributionKey);
        RealCashLocalNavigator realCashLocalNavigator = this.localNavigator;
        realCashLocalNavigator.getClass();
        realCashLocalNavigator.navigator.goTo(new LocalBrandProfileScreen(new BrandSpot(str, null), attributionKey, (MarketingMessageOfferDetails) null, str2, (String) null, (BrandSpotSyncTokens) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE));
    }

    public final void route(ClientRoute.ViewLocalOrderShortlink viewLocalOrderShortlink) {
        viewLocalOrderShortlink.getClass();
        String str = viewLocalOrderShortlink.orderShortToken;
        RealCashLocalNavigator realCashLocalNavigator = this.localNavigator;
        realCashLocalNavigator.getClass();
        realCashLocalNavigator.navigator.goTo(new LocalOrderStatusScreen((LocalOrderStatusScreen.Type) new LocalOrderStatusScreen.Type.Standalone(str), false, 6));
    }

    public final void route(ClientRoute.ViewLocalOrderStatus viewLocalOrderStatus) {
        viewLocalOrderStatus.getClass();
        String str = viewLocalOrderStatus.orderToken;
        RealCashLocalNavigator realCashLocalNavigator = this.localNavigator;
        realCashLocalNavigator.getClass();
        realCashLocalNavigator.navigator.goTo(new LocalOrderStatusScreen((LocalOrderStatusScreen.Type) new LocalOrderStatusScreen.Type.Standalone(str), false, 6));
    }

    public final void route(ClientRoute.ViewLocalShortlink viewLocalShortlink) {
        viewLocalShortlink.getClass();
        String str = viewLocalShortlink.shortlinkKey;
        RealCashLocalNavigator realCashLocalNavigator = this.localNavigator;
        realCashLocalNavigator.getClass();
        realCashLocalNavigator.navigator.goTo(new LocalShortlinkSheet(str, null));
    }
}
