package com.squareup.cash.clientrouting.routers.offers;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.widget.ComposeHelpersKt;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.backend.RealBoostProvider;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.db.RewardMerchantQueries$RewardForMerchantTokenQuery;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.db.RewardQueries.ForIdQuery;
import com.squareup.cash.boost.db.RewardWithSelection;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.cdf.offers.AppLocation;
import com.squareup.cash.cdf.offers.OfferState;
import com.squareup.cash.cdf.offers.OffersTapOpenOfferView;
import com.squareup.cash.cdf.offers.OffersViewUnavailableForBusinessAlert;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsV2;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersFullscreenCollectionScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreenV2;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreen;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder$findByCashtag$4;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey$IdentifierToken$MerchantToken;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey$IdentifierToken$OfferToken;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetMetadata;
import com.squareup.protos.cash.cashsuggest.api.SheetType;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class OffersRouter {
    public final Analytics analytics;
    public final RealBoostRepository boostRepository;
    public final RealFeatureEligibilityRepository eligibilityRepository;
    public final Navigator navigator;
    public final RealOffersAnalyticsV2 offersAnalytics;
    public final RealOffersTabRepository offersTabRepository;
    public final AndroidStringManager stringManager;

    public OffersRouter(Navigator navigator, RealOffersTabRepository realOffersTabRepository, RealFeatureEligibilityRepository realFeatureEligibilityRepository, AndroidStringManager androidStringManager, Analytics analytics, RealOffersAnalyticsV2 realOffersAnalyticsV2, RealBoostRepository realBoostRepository) {
        navigator.getClass();
        this.navigator = navigator;
        this.offersTabRepository = realOffersTabRepository;
        this.eligibilityRepository = realFeatureEligibilityRepository;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.offersAnalytics = realOffersAnalyticsV2;
        this.boostRepository = realBoostRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object getOffersSheetScreen(OfferSheetKey offerSheetKey, Screen screen, RoutingParams routingParams, OffersSheetMetadata offersSheetMetadata, ContinuationImpl continuationImpl) {
        RealBoostProvider realBoostProvider = this.boostRepository.boostProvider;
        SheetType sheetType = offerSheetKey.sheet_type;
        Object[] objArr = 0;
        if (sheetType != null) {
            int ordinal = sheetType.ordinal();
            int i = 1;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                AnalyticsParams analyticsParams = routingParams.analyticsParams;
                boolean z = analyticsParams instanceof AnalyticsParams.OffersTabAnalyticsParams;
                AnalyticsParams.OffersTabAnalyticsParams offersTabAnalyticsParams = z ? (AnalyticsParams.OffersTabAnalyticsParams) analyticsParams : null;
                boolean z2 = offersTabAnalyticsParams != null ? offersTabAnalyticsParams.isSearchMode : false;
                AnalyticsParams.OffersTabAnalyticsParams offersTabAnalyticsParams2 = z ? (AnalyticsParams.OffersTabAnalyticsParams) analyticsParams : null;
                return new OffersScreen$OffersTimelineScreen(offerSheetKey, screen, z2, offersSheetMetadata != null ? offersSheetMetadata.source_screen : null, offersSheetMetadata != null ? offersSheetMetadata.source_section : null, offersTabAnalyticsParams2 != null ? offersTabAnalyticsParams2.flowToken : null);
            }
            ComposeHelpersKt composeHelpersKt = offerSheetKey.identifier_token;
            if (composeHelpersKt != null) {
                OfferSheetKey$IdentifierToken$OfferToken offerSheetKey$IdentifierToken$OfferToken = composeHelpersKt instanceof OfferSheetKey$IdentifierToken$OfferToken ? (OfferSheetKey$IdentifierToken$OfferToken) composeHelpersKt : null;
                String str = offerSheetKey$IdentifierToken$OfferToken != null ? offerSheetKey$IdentifierToken$OfferToken.value : null;
                if (str != null) {
                    RewardQueries rewardQueries = realBoostProvider.rewardQueries;
                    rewardQueries.getClass();
                    Object firstOrNull = FlowKt.firstOrNull(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(rewardQueries.new ForIdQuery(str, new RewardQueries$$ExternalSyntheticLambda4(14))), realBoostProvider.ioDispatcher), new CardModelView$iconTexture$$inlined$map$1(realBoostProvider.getBoostSlots(true), 15), new FlowExtensionsKt$doOnFirst$2(this, routingParams, objArr == true ? 1 : 0, i), 0), continuationImpl);
                    return firstOrNull == CoroutineSingletons.COROUTINE_SUSPENDED ? firstOrNull : (Screen) firstOrNull;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object navigateToOffersHomeScreen(RoutingParams routingParams, ContinuationImpl continuationImpl) {
        OffersRouter$navigateToOffersHomeScreen$1 offersRouter$navigateToOffersHomeScreen$1;
        int i;
        Screen screen;
        Boolean valueOf;
        AppLocation appLocation;
        OfferState offerState;
        RoutingParams.DeepLinkMetadata deepLinkMetadata;
        if (continuationImpl instanceof OffersRouter$navigateToOffersHomeScreen$1) {
            offersRouter$navigateToOffersHomeScreen$1 = (OffersRouter$navigateToOffersHomeScreen$1) continuationImpl;
            int i2 = offersRouter$navigateToOffersHomeScreen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offersRouter$navigateToOffersHomeScreen$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = offersRouter$navigateToOffersHomeScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offersRouter$navigateToOffersHomeScreen$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardModelView$iconTexture$$inlined$map$1 selectedBoostTokens = this.boostRepository.getSelectedBoostTokens();
                    offersRouter$navigateToOffersHomeScreen$1.L$0 = routingParams;
                    offersRouter$navigateToOffersHomeScreen$1.label = 1;
                    obj = FlowKt.firstOrNull(selectedBoostTokens, offersRouter$navigateToOffersHomeScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams = offersRouter$navigateToOffersHomeScreen$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Set set = (Set) obj;
                screen = routingParams.origin;
                valueOf = set == null ? Boolean.valueOf(!set.isEmpty()) : null;
                if (screen != null) {
                    if (screen instanceof ShoppingWebScreen) {
                        appLocation = AppLocation.Browser;
                    } else if (screen instanceof WalletHomeScreen) {
                        appLocation = AppLocation.CardTab;
                    } else if (screen instanceof GlobalSearchScreen) {
                        appLocation = AppLocation.DiscoverSearch;
                    } else if (screen instanceof MerchantScreen$MerchantProfileScreen) {
                        appLocation = AppLocation.MerchantProfile;
                    } else if ((screen instanceof OffersScreen$OffersHomeScreen) || (screen instanceof OffersScreen$OffersFullscreenCollectionScreen)) {
                        appLocation = AppLocation.OffersTab;
                    } else if (screen instanceof TreehouseScreen) {
                        appLocation = AppLocation.ActivityTab;
                    }
                    if (Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
                        offerState = OfferState.ACTIVE;
                    } else if (Intrinsics.areEqual(valueOf, Boolean.FALSE)) {
                        offerState = OfferState.INACTIVE;
                    } else {
                        if (valueOf != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        offerState = null;
                    }
                    this.analytics.track(new OffersTapOpenOfferView(null, appLocation, offerState), null);
                    deepLinkMetadata = routingParams.deepLinkMetadata;
                    Navigator navigator = this.navigator;
                    if (deepLinkMetadata != null) {
                        navigator.goTo(new MoneyTabScreen(null));
                    }
                    OffersScreen$OffersHomeScreenV2 offersScreen$OffersHomeScreenV2 = OffersScreen$OffersHomeScreenV2.INSTANCE;
                    navigator.goTo(offersScreen$OffersHomeScreenV2);
                    return offersScreen$OffersHomeScreenV2;
                }
                appLocation = null;
                if (Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
                }
                this.analytics.track(new OffersTapOpenOfferView(null, appLocation, offerState), null);
                deepLinkMetadata = routingParams.deepLinkMetadata;
                Navigator navigator2 = this.navigator;
                if (deepLinkMetadata != null) {
                }
                OffersScreen$OffersHomeScreenV2 offersScreen$OffersHomeScreenV22 = OffersScreen$OffersHomeScreenV2.INSTANCE;
                navigator2.goTo(offersScreen$OffersHomeScreenV22);
                return offersScreen$OffersHomeScreenV22;
            }
        }
        offersRouter$navigateToOffersHomeScreen$1 = new OffersRouter$navigateToOffersHomeScreen$1(this, continuationImpl);
        Object obj2 = offersRouter$navigateToOffersHomeScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offersRouter$navigateToOffersHomeScreen$1.label;
        if (i != 0) {
        }
        Set set2 = (Set) obj2;
        screen = routingParams.origin;
        if (set2 == null) {
        }
        if (screen != null) {
        }
        appLocation = null;
        if (Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
        }
        this.analytics.track(new OffersTapOpenOfferView(null, appLocation, offerState), null);
        deepLinkMetadata = routingParams.deepLinkMetadata;
        Navigator navigator22 = this.navigator;
        if (deepLinkMetadata != null) {
        }
        OffersScreen$OffersHomeScreenV2 offersScreen$OffersHomeScreenV222 = OffersScreen$OffersHomeScreenV2.INSTANCE;
        navigator22.goTo(offersScreen$OffersHomeScreenV222);
        return offersScreen$OffersHomeScreenV222;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x011d, code lost:
    
        if (route(r14, r5, r3) == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
    
        if (r1 == r4) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.DeprecatedViewBoostDetailsByMerchant deprecatedViewBoostDetailsByMerchant, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        OffersRouter$route$18 offersRouter$route$18;
        Object obj;
        int i;
        RoutingParams routingParams2;
        ClientRoute.DeprecatedViewBoostDetailsByMerchant deprecatedViewBoostDetailsByMerchant2;
        RewardWithSelection rewardWithSelection;
        RoutingParams routingParams3;
        ClientRoute.DeprecatedViewBoostDetailsByMerchant deprecatedViewBoostDetailsByMerchant3;
        ClientRoute.DeprecatedViewBoostDetailsByMerchant deprecatedViewBoostDetailsByMerchant4;
        RealBoostProvider realBoostProvider = this.boostRepository.boostProvider;
        if (continuationImpl instanceof OffersRouter$route$18) {
            offersRouter$route$18 = (OffersRouter$route$18) continuationImpl;
            int i2 = offersRouter$route$18.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offersRouter$route$18.label = i2 - PKIFailureInfo.systemUnavail;
                obj = offersRouter$route$18.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offersRouter$route$18.label;
                int i3 = 4;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    offersRouter$route$18.L$0 = deprecatedViewBoostDetailsByMerchant;
                    routingParams2 = routingParams;
                    offersRouter$route$18.L$1 = routingParams2;
                    offersRouter$route$18.label = 1;
                    Object shouldHideShopping = shouldHideShopping(offersRouter$route$18);
                    if (shouldHideShopping != obj2) {
                        deprecatedViewBoostDetailsByMerchant2 = deprecatedViewBoostDetailsByMerchant;
                        obj = shouldHideShopping;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        routingParams2 = offersRouter$route$18.L$1;
                        ClientRoute.DeprecatedViewBoostDetailsByMerchant deprecatedViewBoostDetailsByMerchant5 = offersRouter$route$18.L$0;
                        SafeTrace.throwOnFailure(obj);
                        deprecatedViewBoostDetailsByMerchant2 = deprecatedViewBoostDetailsByMerchant5;
                        String str = (String) obj;
                        if (str == null) {
                            rewardWithSelection = null;
                            if (rewardWithSelection != null) {
                            }
                            return obj2;
                        }
                        FlowQuery$mapToList$$inlined$map$1 boost = realBoostProvider.getBoost(str);
                        offersRouter$route$18.L$0 = deprecatedViewBoostDetailsByMerchant2;
                        offersRouter$route$18.L$1 = routingParams2;
                        offersRouter$route$18.label = 3;
                        obj = FlowKt.firstOrNull(boost, offersRouter$route$18);
                        if (obj != obj2) {
                            routingParams3 = routingParams2;
                            deprecatedViewBoostDetailsByMerchant3 = deprecatedViewBoostDetailsByMerchant2;
                            rewardWithSelection = (RewardWithSelection) obj;
                            deprecatedViewBoostDetailsByMerchant2 = deprecatedViewBoostDetailsByMerchant3;
                            routingParams2 = routingParams3;
                            if (rewardWithSelection != null) {
                            }
                        }
                        return obj2;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i != 5) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        deprecatedViewBoostDetailsByMerchant4 = offersRouter$route$18.L$0;
                        SafeTrace.throwOnFailure(obj);
                        Timber.Forest.e("Unable to find offers details for merchant ".concat(deprecatedViewBoostDetailsByMerchant4.merchantToken), new Object[0]);
                        return Unit.INSTANCE;
                    }
                    routingParams3 = offersRouter$route$18.L$1;
                    deprecatedViewBoostDetailsByMerchant3 = offersRouter$route$18.L$0;
                    SafeTrace.throwOnFailure(obj);
                    rewardWithSelection = (RewardWithSelection) obj;
                    deprecatedViewBoostDetailsByMerchant2 = deprecatedViewBoostDetailsByMerchant3;
                    routingParams2 = routingParams3;
                    if (rewardWithSelection != null) {
                        ClientRoute.ViewOfferDetailsSheetByMerchant viewOfferDetailsSheetByMerchant = new ClientRoute.ViewOfferDetailsSheetByMerchant(ClientRoute.ViewOfferDetailsSheetByMerchant.spec, null, rewardWithSelection.affiliate_link_url != null ? "PAY_LESS_AFFILIATE" : "PAY_LESS_CLO", deprecatedViewBoostDetailsByMerchant2.merchantToken, ClientRoute.ViewOfferDetailsSheetByMerchant.deepLinkSpecs);
                        offersRouter$route$18.L$0 = null;
                        offersRouter$route$18.L$1 = null;
                        offersRouter$route$18.label = 4;
                    } else {
                        new ClientRoute.ViewOffersBrowse();
                        offersRouter$route$18.L$0 = deprecatedViewBoostDetailsByMerchant2;
                        offersRouter$route$18.L$1 = null;
                        offersRouter$route$18.label = 5;
                        if (route(routingParams2, offersRouter$route$18) != obj2) {
                            deprecatedViewBoostDetailsByMerchant4 = deprecatedViewBoostDetailsByMerchant2;
                            Timber.Forest.e("Unable to find offers details for merchant ".concat(deprecatedViewBoostDetailsByMerchant4.merchantToken), new Object[0]);
                            return Unit.INSTANCE;
                        }
                    }
                    return obj2;
                }
                routingParams2 = offersRouter$route$18.L$1;
                deprecatedViewBoostDetailsByMerchant2 = offersRouter$route$18.L$0;
                SafeTrace.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    showShoppingIneligibilityDialog(routingParams2);
                    return Unit.INSTANCE;
                }
                String str2 = deprecatedViewBoostDetailsByMerchant2.merchantToken;
                offersRouter$route$18.L$0 = deprecatedViewBoostDetailsByMerchant2;
                offersRouter$route$18.L$1 = routingParams2;
                offersRouter$route$18.label = 2;
                SessionQueries sessionQueries = realBoostProvider.rewardMerchantQueries;
                sessionQueries.getClass();
                obj = FlowKt.firstOrNull(new SupportHomePresenter$models$lambda$5$$inlined$map$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(DBUtil.mapToList(DBUtil.toFlow(new RewardMerchantQueries$RewardForMerchantTokenQuery(sessionQueries, str2, new RewardQueries$$ExternalSyntheticLambda4(13), (char) 0)), realBoostProvider.ioDispatcher), FlowKt.transformLatest(realBoostProvider.getActiveBoostTokenOverride(), new AnchoredDraggableNode$drag$2(continuation, realBoostProvider, 7)), new RealRecipientFinder$findByCashtag$4(3, null, 1), 0), i3), offersRouter$route$18);
            }
        }
        offersRouter$route$18 = new OffersRouter$route$18(this, continuationImpl);
        obj = offersRouter$route$18.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offersRouter$route$18.label;
        int i32 = 4;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (route(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route$1(RoutingParams routingParams, ContinuationImpl continuationImpl) {
        OffersRouter$route$19 offersRouter$route$19;
        Object obj;
        int i;
        if (continuationImpl instanceof OffersRouter$route$19) {
            offersRouter$route$19 = (OffersRouter$route$19) continuationImpl;
            int i2 = offersRouter$route$19.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offersRouter$route$19.label = i2 - PKIFailureInfo.systemUnavail;
                obj = offersRouter$route$19.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offersRouter$route$19.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    offersRouter$route$19.L$1 = routingParams;
                    offersRouter$route$19.label = 1;
                    obj = shouldHideShopping(offersRouter$route$19);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams = offersRouter$route$19.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    showShoppingIneligibilityDialog(routingParams);
                    return Unit.INSTANCE;
                }
                new ClientRoute.ViewOffersBrowse();
                offersRouter$route$19.L$1 = null;
                offersRouter$route$19.label = 2;
            }
        }
        offersRouter$route$19 = new OffersRouter$route$19(this, continuationImpl);
        obj = offersRouter$route$19.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offersRouter$route$19.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (route(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route$2(RoutingParams routingParams, ContinuationImpl continuationImpl) {
        OffersRouter$route$20 offersRouter$route$20;
        Object obj;
        int i;
        if (continuationImpl instanceof OffersRouter$route$20) {
            offersRouter$route$20 = (OffersRouter$route$20) continuationImpl;
            int i2 = offersRouter$route$20.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offersRouter$route$20.label = i2 - PKIFailureInfo.systemUnavail;
                obj = offersRouter$route$20.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offersRouter$route$20.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    offersRouter$route$20.L$1 = routingParams;
                    offersRouter$route$20.label = 1;
                    obj = shouldHideShopping(offersRouter$route$20);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams = offersRouter$route$20.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    showShoppingIneligibilityDialog(routingParams);
                    return Unit.INSTANCE;
                }
                new ClientRoute.ViewOffersBrowse();
                offersRouter$route$20.L$1 = null;
                offersRouter$route$20.label = 2;
            }
        }
        offersRouter$route$20 = new OffersRouter$route$20(this, continuationImpl);
        obj = offersRouter$route$20.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offersRouter$route$20.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shouldHideShopping(ContinuationImpl continuationImpl) {
        OffersRouter$shouldHideShopping$1 offersRouter$shouldHideShopping$1;
        int i;
        if (continuationImpl instanceof OffersRouter$shouldHideShopping$1) {
            offersRouter$shouldHideShopping$1 = (OffersRouter$shouldHideShopping$1) continuationImpl;
            int i2 = offersRouter$shouldHideShopping$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offersRouter$shouldHideShopping$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = offersRouter$shouldHideShopping$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offersRouter$shouldHideShopping$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = new FinishSetupTileBadgeCounter(10, this.eligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.CASH_OFFERS_TAB});
                    offersRouter$shouldHideShopping$1.label = 1;
                    obj = FlowKt.firstOrNull(finishSetupTileBadgeCounter, offersRouter$shouldHideShopping$1);
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
        offersRouter$shouldHideShopping$1 = new OffersRouter$shouldHideShopping$1(this, continuationImpl);
        Object obj2 = offersRouter$shouldHideShopping$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offersRouter$shouldHideShopping$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(Intrinsics.areEqual(obj2, Boolean.FALSE));
    }

    public final void showShoppingIneligibilityDialog(RoutingParams routingParams) {
        String str;
        routingParams.getClass();
        Screen screen = routingParams.origin;
        if (routingParams.deepLinkMetadata != null) {
            str = "external";
        } else if (screen != null) {
            str = Reflection.factory.getOrCreateKotlinClass(screen.getClass()).getSimpleName();
        } else {
            str = null;
        }
        this.analytics.track(new OffersViewUnavailableForBusinessAlert(str), null);
        String str2 = this.stringManager.get(R.string.offers_unavailable_for_business);
        if (screen == null) {
            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
        }
        this.navigator.goTo(new FailureMessageScreen(null, str2, null, screen, ColorModel.Icon.INSTANCE, 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (route(r10, r4, r2) == r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006b, code lost:
    
        if (r8 == r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewBoostDetails viewBoostDetails, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        OffersRouter$route$17 offersRouter$route$17;
        int i;
        ClientRoute.ViewBoostDetails viewBoostDetails2;
        RoutingParams routingParams2;
        Object shouldHideShopping;
        ClientRoute.ViewBoostDetails viewBoostDetails3;
        String str;
        ClientRoute.ViewBoostDetails viewBoostDetails4;
        String str2;
        String str3;
        if (continuationImpl instanceof OffersRouter$route$17) {
            offersRouter$route$17 = (OffersRouter$route$17) continuationImpl;
            int i2 = offersRouter$route$17.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offersRouter$route$17.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = offersRouter$route$17.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offersRouter$route$17.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    viewBoostDetails2 = viewBoostDetails;
                    offersRouter$route$17.L$0 = viewBoostDetails2;
                    routingParams2 = routingParams;
                    offersRouter$route$17.L$1 = routingParams2;
                    offersRouter$route$17.label = 1;
                    shouldHideShopping = shouldHideShopping(offersRouter$route$17);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            if (i != 4) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str2 = offersRouter$route$17.L$3;
                            viewBoostDetails4 = offersRouter$route$17.L$0;
                            SafeTrace.throwOnFailure(obj);
                            Timber.Forest.e(CameraSelector$$ExternalSyntheticOutline0.m("Unable to find offers details boost token ", viewBoostDetails4.boostToken, " with offer token ", str2), new Object[0]);
                            return Unit.INSTANCE;
                        }
                        routingParams2 = offersRouter$route$17.L$1;
                        viewBoostDetails3 = offersRouter$route$17.L$0;
                        SafeTrace.throwOnFailure(obj);
                        RewardWithSelection rewardWithSelection = (RewardWithSelection) obj;
                        str = rewardWithSelection == null ? rewardWithSelection.offerly_token : null;
                        if (str == null) {
                            if (rewardWithSelection.affiliate_link_url != null) {
                                str3 = "PAY_LESS_AFFILIATE";
                            } else {
                                str3 = "PAY_LESS_CLO";
                            }
                            ClientRoute.ViewOfferDetailsSheet viewOfferDetailsSheet = new ClientRoute.ViewOfferDetailsSheet(ClientRoute.ViewOfferDetailsSheet.spec, null, str3, str, ClientRoute.ViewOfferDetailsSheet.deepLinkSpecs);
                            offersRouter$route$17.L$0 = null;
                            offersRouter$route$17.L$1 = null;
                            offersRouter$route$17.L$3 = null;
                            offersRouter$route$17.label = 3;
                        } else {
                            new ClientRoute.ViewOffersBrowse();
                            offersRouter$route$17.L$0 = viewBoostDetails3;
                            offersRouter$route$17.L$1 = null;
                            offersRouter$route$17.L$3 = str;
                            offersRouter$route$17.label = 4;
                            if (route(routingParams2, offersRouter$route$17) != obj2) {
                                viewBoostDetails4 = viewBoostDetails3;
                                str2 = str;
                                Timber.Forest.e(CameraSelector$$ExternalSyntheticOutline0.m("Unable to find offers details boost token ", viewBoostDetails4.boostToken, " with offer token ", str2), new Object[0]);
                                return Unit.INSTANCE;
                            }
                        }
                        return obj2;
                    }
                    routingParams2 = offersRouter$route$17.L$1;
                    ClientRoute.ViewBoostDetails viewBoostDetails5 = offersRouter$route$17.L$0;
                    SafeTrace.throwOnFailure(obj);
                    shouldHideShopping = obj;
                    viewBoostDetails2 = viewBoostDetails5;
                }
                if (!((Boolean) shouldHideShopping).booleanValue()) {
                    showShoppingIneligibilityDialog(routingParams2);
                    return Unit.INSTANCE;
                }
                FlowQuery$mapToList$$inlined$map$1 boost = this.boostRepository.boostProvider.getBoost(viewBoostDetails2.boostToken);
                offersRouter$route$17.L$0 = viewBoostDetails2;
                offersRouter$route$17.L$1 = routingParams2;
                offersRouter$route$17.label = 2;
                Object firstOrNull = FlowKt.firstOrNull(boost, offersRouter$route$17);
                if (firstOrNull != obj2) {
                    viewBoostDetails3 = viewBoostDetails2;
                    obj = firstOrNull;
                    RewardWithSelection rewardWithSelection2 = (RewardWithSelection) obj;
                    if (rewardWithSelection2 == null) {
                    }
                    if (str == null) {
                    }
                }
                return obj2;
            }
        }
        offersRouter$route$17 = new OffersRouter$route$17(this, continuationImpl);
        Object obj3 = offersRouter$route$17.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offersRouter$route$17.label;
        if (i != 0) {
        }
        if (!((Boolean) shouldHideShopping).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        if (r13 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0054, code lost:
    
        if (r13 == r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewOfferDetailsSheet viewOfferDetailsSheet, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        OffersRouter$route$9 offersRouter$route$9;
        Object obj;
        int i;
        OfferSheetKey offerSheetKey;
        OfferSheetKey offerSheetKey2;
        Screen screen;
        Screen screen2;
        if (continuationImpl instanceof OffersRouter$route$9) {
            offersRouter$route$9 = (OffersRouter$route$9) continuationImpl;
            int i2 = offersRouter$route$9.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offersRouter$route$9.label = i2 - PKIFailureInfo.systemUnavail;
                OffersRouter$route$9 offersRouter$route$92 = offersRouter$route$9;
                obj = offersRouter$route$92.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offersRouter$route$92.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    offersRouter$route$92.L$0 = viewOfferDetailsSheet;
                    offersRouter$route$92.L$1 = routingParams;
                    offersRouter$route$92.label = 1;
                    obj = shouldHideShopping(offersRouter$route$92);
                } else if (i == 1) {
                    routingParams = offersRouter$route$92.L$1;
                    viewOfferDetailsSheet = offersRouter$route$92.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        Screen screen3 = (Screen) obj;
                        if (screen3 != null) {
                            this.navigator.goTo(screen3);
                        }
                        return Unit.INSTANCE;
                    }
                    offerSheetKey2 = offersRouter$route$92.L$2;
                    routingParams = offersRouter$route$92.L$1;
                    SafeTrace.throwOnFailure(obj);
                    screen2 = (Screen) obj;
                    if (screen2 != null) {
                        offerSheetKey = offerSheetKey2;
                        screen = routingParams.origin;
                        offerSheetKey2 = offerSheetKey;
                        RoutingParams routingParams2 = routingParams;
                        offersRouter$route$92.L$0 = null;
                        offersRouter$route$92.L$1 = null;
                        offersRouter$route$92.L$2 = null;
                        offersRouter$route$92.label = 3;
                        obj = getOffersSheetScreen(offerSheetKey2, screen, routingParams2, null, offersRouter$route$92);
                    } else {
                        screen = screen2;
                        RoutingParams routingParams22 = routingParams;
                        offersRouter$route$92.L$0 = null;
                        offersRouter$route$92.L$1 = null;
                        offersRouter$route$92.L$2 = null;
                        offersRouter$route$92.label = 3;
                        obj = getOffersSheetScreen(offerSheetKey2, screen, routingParams22, null, offersRouter$route$92);
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    showShoppingIneligibilityDialog(routingParams);
                    return Unit.INSTANCE;
                }
                for (OfferType offerType : OfferType.values()) {
                    if (Intrinsics.areEqual(offerType.name(), viewOfferDetailsSheet.offerType)) {
                        offerSheetKey = new OfferSheetKey(SheetType.DETAIL_SHEET, OfferType.valueOf(viewOfferDetailsSheet.offerType), new OfferSheetKey$IdentifierToken$OfferToken(viewOfferDetailsSheet.offerToken), 56);
                        if (routingParams.deepLinkMetadata != null) {
                            offersRouter$route$92.L$0 = null;
                            offersRouter$route$92.L$1 = routingParams;
                            offersRouter$route$92.L$2 = offerSheetKey;
                            offersRouter$route$92.label = 2;
                            Object navigateToOffersHomeScreen = navigateToOffersHomeScreen(routingParams, offersRouter$route$92);
                            if (navigateToOffersHomeScreen != obj2) {
                                obj = navigateToOffersHomeScreen;
                                offerSheetKey2 = offerSheetKey;
                                screen2 = (Screen) obj;
                                if (screen2 != null) {
                                }
                            }
                            return obj2;
                        }
                        screen = routingParams.origin;
                        offerSheetKey2 = offerSheetKey;
                        RoutingParams routingParams222 = routingParams;
                        offersRouter$route$92.L$0 = null;
                        offersRouter$route$92.L$1 = null;
                        offersRouter$route$92.L$2 = null;
                        offersRouter$route$92.label = 3;
                        obj = getOffersSheetScreen(offerSheetKey2, screen, routingParams222, null, offersRouter$route$92);
                    }
                }
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Data validation: ", viewOfferDetailsSheet.offerType, " is not an OfferType "));
                return null;
            }
        }
        offersRouter$route$9 = new OffersRouter$route$9(this, continuationImpl);
        OffersRouter$route$9 offersRouter$route$922 = offersRouter$route$9;
        obj = offersRouter$route$922.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offersRouter$route$922.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x004a, code lost:
    
        if (r12 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewOfferDetailsSheetByMerchant viewOfferDetailsSheetByMerchant, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        OffersRouter$route$14 offersRouter$route$14;
        Object obj;
        int i;
        OfferSheetKey offerSheetKey;
        if (continuationImpl instanceof OffersRouter$route$14) {
            offersRouter$route$14 = (OffersRouter$route$14) continuationImpl;
            int i2 = offersRouter$route$14.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offersRouter$route$14.label = i2 - PKIFailureInfo.systemUnavail;
                obj = offersRouter$route$14.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offersRouter$route$14.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    offersRouter$route$14.L$0 = viewOfferDetailsSheetByMerchant;
                    offersRouter$route$14.L$1 = routingParams;
                    offersRouter$route$14.label = 1;
                    obj = shouldHideShopping(offersRouter$route$14);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        offerSheetKey = offersRouter$route$14.L$2;
                        routingParams = offersRouter$route$14.L$1;
                        SafeTrace.throwOnFailure(obj);
                        Screen screen = (Screen) obj;
                        FeatureContext featureContext = routingParams.featureContext;
                        FeatureContext.MoneybotChatContext moneybotChatContext = !(featureContext instanceof FeatureContext.MoneybotChatContext) ? (FeatureContext.MoneybotChatContext) featureContext : null;
                        this.navigator.goTo(new OffersScreen$OffersDetailsScreen(offerSheetKey, screen, moneybotChatContext != null ? new BlockersData.MoneybotContext(moneybotChatContext.sessionId, moneybotChatContext.toolRequestId) : null, 504));
                        return Unit.INSTANCE;
                    }
                    routingParams = offersRouter$route$14.L$1;
                    viewOfferDetailsSheetByMerchant = offersRouter$route$14.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    showShoppingIneligibilityDialog(routingParams);
                    return Unit.INSTANCE;
                }
                for (OfferType offerType : OfferType.values()) {
                    if (Intrinsics.areEqual(offerType.name(), viewOfferDetailsSheetByMerchant.offerType)) {
                        OfferSheetKey offerSheetKey2 = new OfferSheetKey(SheetType.DETAIL_SHEET, OfferType.valueOf(viewOfferDetailsSheetByMerchant.offerType), new OfferSheetKey$IdentifierToken$MerchantToken(viewOfferDetailsSheetByMerchant.merchantToken), 56);
                        offersRouter$route$14.L$0 = null;
                        offersRouter$route$14.L$1 = routingParams;
                        offersRouter$route$14.L$2 = offerSheetKey2;
                        offersRouter$route$14.label = 2;
                        Object navigateToOffersHomeScreen = navigateToOffersHomeScreen(routingParams, offersRouter$route$14);
                        if (navigateToOffersHomeScreen != obj2) {
                            obj = navigateToOffersHomeScreen;
                            offerSheetKey = offerSheetKey2;
                            Screen screen2 = (Screen) obj;
                            FeatureContext featureContext2 = routingParams.featureContext;
                            if (!(featureContext2 instanceof FeatureContext.MoneybotChatContext)) {
                            }
                            this.navigator.goTo(new OffersScreen$OffersDetailsScreen(offerSheetKey, screen2, moneybotChatContext != null ? new BlockersData.MoneybotContext(moneybotChatContext.sessionId, moneybotChatContext.toolRequestId) : null, 504));
                            return Unit.INSTANCE;
                        }
                        return obj2;
                    }
                }
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Data validation: ", viewOfferDetailsSheetByMerchant.offerType, " is not an OfferType "));
                return null;
            }
        }
        offersRouter$route$14 = new OffersRouter$route$14(this, continuationImpl);
        obj = offersRouter$route$14.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offersRouter$route$14.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (navigateToOffersHomeScreen(r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewOffersCollection viewOffersCollection, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        OffersRouter$route$1 offersRouter$route$1;
        Object obj;
        int i;
        if (continuationImpl instanceof OffersRouter$route$1) {
            offersRouter$route$1 = (OffersRouter$route$1) continuationImpl;
            int i2 = offersRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offersRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = offersRouter$route$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offersRouter$route$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    offersRouter$route$1.L$0 = viewOffersCollection;
                    offersRouter$route$1.L$1 = routingParams;
                    offersRouter$route$1.label = 1;
                    obj = shouldHideShopping(offersRouter$route$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        viewOffersCollection = offersRouter$route$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        this.navigator.goTo(new OffersScreen$OffersFullscreenCollectionScreen(viewOffersCollection.collectionToken));
                        return Unit.INSTANCE;
                    }
                    routingParams = offersRouter$route$1.L$1;
                    viewOffersCollection = offersRouter$route$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    showShoppingIneligibilityDialog(routingParams);
                    return Unit.INSTANCE;
                }
                if (routingParams.deepLinkMetadata != null) {
                    offersRouter$route$1.L$0 = viewOffersCollection;
                    offersRouter$route$1.L$1 = null;
                    offersRouter$route$1.label = 2;
                }
                this.navigator.goTo(new OffersScreen$OffersFullscreenCollectionScreen(viewOffersCollection.collectionToken));
                return Unit.INSTANCE;
            }
        }
        offersRouter$route$1 = new OffersRouter$route$1(this, continuationImpl);
        obj = offersRouter$route$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offersRouter$route$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        if (r10 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004a, code lost:
    
        if (r10 == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewOffersSheetV2 viewOffersSheetV2, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        OffersRouter$route$2 offersRouter$route$2;
        Object obj;
        int i;
        OfferSheetKey offerSheetKey;
        Pair pair;
        OffersRouter offersRouter;
        if (continuationImpl instanceof OffersRouter$route$2) {
            offersRouter$route$2 = (OffersRouter$route$2) continuationImpl;
            int i2 = offersRouter$route$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offersRouter$route$2.label = i2 - PKIFailureInfo.systemUnavail;
                OffersRouter$route$2 offersRouter$route$22 = offersRouter$route$2;
                obj = offersRouter$route$22.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offersRouter$route$22.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    offersRouter$route$22.L$0 = viewOffersSheetV2;
                    offersRouter$route$22.L$1 = routingParams;
                    offersRouter$route$22.label = 1;
                    obj = shouldHideShopping(offersRouter$route$22);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        offersRouter = this;
                        Screen screen = (Screen) obj;
                        if (screen != null) {
                            offersRouter.navigator.goTo(screen);
                        }
                        return Unit.INSTANCE;
                    }
                    routingParams = offersRouter$route$22.L$1;
                    viewOffersSheetV2 = offersRouter$route$22.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    showShoppingIneligibilityDialog(routingParams);
                    return Unit.INSTANCE;
                }
                ByteString.Companion companion = ByteString.Companion;
                ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewOffersSheetV2.offerSheetKey);
                if (decodeBase64 != null && (offerSheetKey = (OfferSheetKey) OfferSheetKey.ADAPTER.decode(decodeBase64)) != null) {
                    Screen screen2 = routingParams.origin;
                    if (screen2 instanceof OffersScreen$OffersDetailsScreen) {
                        OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen = (OffersScreen$OffersDetailsScreen) screen2;
                        pair = new Pair(offersScreen$OffersDetailsScreen.parentScreen, new OffersSheetMetadata(offersScreen$OffersDetailsScreen.sourceScreen, offersScreen$OffersDetailsScreen.sourceSection));
                    } else if (screen2 instanceof OffersScreen$OffersTimelineScreen) {
                        OffersScreen$OffersTimelineScreen offersScreen$OffersTimelineScreen = (OffersScreen$OffersTimelineScreen) screen2;
                        pair = new Pair(offersScreen$OffersTimelineScreen.parentScreen, new OffersSheetMetadata(offersScreen$OffersTimelineScreen.sourceScreen, offersScreen$OffersTimelineScreen.sourceSection));
                    } else {
                        ByteString decodeBase642 = ByteString.Companion.decodeBase64(viewOffersSheetV2.metadata);
                        pair = new Pair(screen2, decodeBase642 != null ? (OffersSheetMetadata) OffersSheetMetadata.ADAPTER.decode(decodeBase642) : null);
                    }
                    Screen screen3 = (Screen) pair.first;
                    OffersSheetMetadata offersSheetMetadata = (OffersSheetMetadata) pair.second;
                    offersRouter$route$22.L$0 = null;
                    offersRouter$route$22.L$1 = null;
                    offersRouter$route$22.label = 2;
                    offersRouter = this;
                    obj = offersRouter.getOffersSheetScreen(offerSheetKey, screen3, routingParams, offersSheetMetadata, offersRouter$route$22);
                }
                return Unit.INSTANCE;
            }
        }
        offersRouter$route$2 = new OffersRouter$route$2(this, continuationImpl);
        OffersRouter$route$2 offersRouter$route$222 = offersRouter$route$2;
        obj = offersRouter$route$222.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offersRouter$route$222.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (navigateToOffersHomeScreen(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(RoutingParams routingParams, ContinuationImpl continuationImpl) {
        OffersRouter$route$6 offersRouter$route$6;
        Object obj;
        int i;
        if (continuationImpl instanceof OffersRouter$route$6) {
            offersRouter$route$6 = (OffersRouter$route$6) continuationImpl;
            int i2 = offersRouter$route$6.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offersRouter$route$6.label = i2 - PKIFailureInfo.systemUnavail;
                obj = offersRouter$route$6.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offersRouter$route$6.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    offersRouter$route$6.L$1 = routingParams;
                    offersRouter$route$6.label = 1;
                    obj = shouldHideShopping(offersRouter$route$6);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams = offersRouter$route$6.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    showShoppingIneligibilityDialog(routingParams);
                    return Unit.INSTANCE;
                }
                offersRouter$route$6.L$1 = null;
                offersRouter$route$6.label = 2;
            }
        }
        offersRouter$route$6 = new OffersRouter$route$6(this, continuationImpl);
        obj = offersRouter$route$6.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offersRouter$route$6.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final Object route(RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object retryWhenRetryable$default = PlatformKt.retryWhenRetryable$default(null, new Scene.AnonymousClass1(this, (Continuation) null, 18), realClientRouteRouter$route$1, 3);
        return retryWhenRetryable$default == CoroutineSingletons.COROUTINE_SUSPENDED ? retryWhenRetryable$default : Unit.INSTANCE;
    }
}
