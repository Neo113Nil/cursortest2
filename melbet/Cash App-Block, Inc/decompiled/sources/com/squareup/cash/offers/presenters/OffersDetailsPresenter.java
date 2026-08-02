package com.squareup.cash.offers.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.ShadowKt;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.widget.ComposeHelpersKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.backend.AppletCreditLineState;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.benefits.activity.BenefitsActivityRequestHandler;
import com.squareup.cash.benefits.screens.GreenEligibleTransactionsScreen;
import com.squareup.cash.benefits.utils.ErrorReportingKt;
import com.squareup.cash.benefits.viewmodels.GreenEligibleTransactionsViewModel;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.boost.backend.BoostAction;
import com.squareup.cash.boost.backend.RealBoostProvider;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$OffersDetail;
import com.squareup.cash.boost.db.Slots;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.cdf.boost.AppPresentation;
import com.squareup.cash.cdf.offers.AppLocation;
import com.squareup.cash.cdf.offers.OfferUpdateType;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.api.OffersSpanAction;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.offers.backend.real.RealOffersSpanManager;
import com.squareup.cash.offers.presenters.OfferAddedConfirmationState;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersNotificationScreen;
import com.squareup.cash.offers.viewmodels.FormattedDetailViewModel;
import com.squareup.cash.offers.viewmodels.OfferCountdownTemplateViewModel;
import com.squareup.cash.offers.viewmodels.OfferDetailsSheetViewModel;
import com.squareup.cash.offers.viewmodels.OfferFooterButton;
import com.squareup.cash.offers.viewmodels.shared.OffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.shared.OffersLinkViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.OffersDetailsSheetViewEvent;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey$IdentifierToken$MerchantToken;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey$IdentifierToken$OfferToken;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import com.squareup.protos.cash.cashsuggest.api.SheetType;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.DismissTapAction;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.OfferDetailListSheet;
import com.squareup.protos.cash.shop.rendering.api.OfferDetailSheet;
import com.squareup.protos.cash.shop.rendering.api.OfferSheet;
import com.squareup.protos.cash.shop.rendering.api.OfferSheet$Sheet$DetailListSheet;
import com.squareup.protos.cash.shop.rendering.api.OfferSheet$Sheet$DetailSheet;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$DismissAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.bankingbenefits.ui.SpendPathProgress;

/* loaded from: classes6.dex */
public final class OffersDetailsPresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object analytics;
    public final Object analyticsHelper;
    public final Object args;
    public final Object boostRepository;
    public final Object clientRouteParser;
    public final Object clock;
    public final Object computationDispatcher;
    public final Object flowStarter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Object observabilityManager;
    public final Object offersDetailsStateManager;
    public final Object offersSheetRepository;
    public final Object router;
    public final Object spanManager;
    public final AndroidStringManager stringManager;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Action.Type.Companion companion = SheetType.Companion;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CashAppCard.PhysicalCardOrderState.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TextSize.Companion companion2 = CashAppCard.PhysicalCardOrderState.Companion;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[OfferType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ByteString.Companion companion3 = OfferType.Companion;
                iArr3[5] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ByteString.Companion companion4 = OfferType.Companion;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ByteString.Companion companion5 = OfferType.Companion;
                iArr3[2] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ByteString.Companion companion6 = OfferType.Companion;
                iArr3[6] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ByteString.Companion companion7 = OfferType.Companion;
                iArr3[3] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ByteString.Companion companion8 = OfferType.Companion;
                iArr3[4] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public OffersDetailsPresenter(OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen, BetterNavigator.ScreenNavigator screenNavigator, AssetPublicSuffixList assetPublicSuffixList, AndroidStringManager androidStringManager, RealBoostRepository realBoostRepository, RealOffersAnalyticsHelper realOffersAnalyticsHelper, RealUuidGenerator realUuidGenerator, RealClientRouteParser realClientRouteParser, RealFlowTokenGenerator realFlowTokenGenerator, RealOffersSheetRepository realOffersSheetRepository, CoroutineContext coroutineContext, RealObservabilityManager realObservabilityManager, RealOffersSpanManager realOffersSpanManager, AndroidClock androidClock, FlowStarter flowStarter, RealRouter$Factory$Impl realRouter$Factory$Impl, RealOffersAnalytics$Factory$Impl realOffersAnalytics$Factory$Impl) {
        offersScreen$OffersDetailsScreen.getClass();
        this.args = offersScreen$OffersDetailsScreen;
        this.navigator = screenNavigator;
        this.offersDetailsStateManager = assetPublicSuffixList;
        this.stringManager = androidStringManager;
        this.boostRepository = realBoostRepository;
        this.analyticsHelper = realOffersAnalyticsHelper;
        this.clientRouteParser = realClientRouteParser;
        this.offersSheetRepository = realOffersSheetRepository;
        this.computationDispatcher = coroutineContext;
        this.observabilityManager = realObservabilityManager;
        this.spanManager = realOffersSpanManager;
        this.clock = androidClock;
        this.flowStarter = flowStarter;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.analytics = realOffersAnalytics$Factory$Impl.create(offersScreen$OffersDetailsScreen);
        String str = offersScreen$OffersDetailsScreen.referrerFlowToken;
        if (str != null) {
            realOffersAnalyticsHelper.referrerFlowToken = str;
        }
        SheetType sheetType = offersScreen$OffersDetailsScreen.offerSheetKey.sheet_type;
        int i = sheetType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sheetType.ordinal()];
        if (i == -1 || i == 1) {
            return;
        }
        if (i == 2) {
            realOffersSpanManager.onAction(new OffersSpanAction.StartRootSpan("offers_details_sheet_span"));
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            throw null;
        }
    }

    public static final void access$handleOfferSelection(OffersDetailsPresenter offersDetailsPresenter, String str, ArrayList arrayList, OfferUpdateType offerUpdateType) {
        AppLocation appLocation;
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = (RealOffersAnalyticsHelper) offersDetailsPresenter.analyticsHelper;
        OffersAnalyticsHelper$Flow offersAnalyticsHelper$Flow = OffersAnalyticsHelper$Flow.BOOST_PLASMA;
        realOffersAnalyticsHelper.refreshFlowToken(offersAnalyticsHelper$Flow);
        RealOffersAnalytics realOffersAnalytics = (RealOffersAnalytics) offersDetailsPresenter.analytics;
        realOffersAnalytics.trackGenericAnalyticsEvents(arrayList, MapsKt__MapsJVMKt.mapOf(new Pair(AnalyticsEvent.ParamType.UPDATE_TYPE, offerUpdateType.name())));
        MoneyTabUIKt$$ExternalSyntheticLambda5 moneyTabUIKt$$ExternalSyntheticLambda5 = new MoneyTabUIKt$$ExternalSyntheticLambda5(offersDetailsPresenter, 16);
        OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen = (OffersScreen$OffersDetailsScreen) offersDetailsPresenter.args;
        Screen screen = offersScreen$OffersDetailsScreen.parentScreen;
        if (screen == null || (appLocation = OffersAnalyticsKt.toAppLocation(screen, offersScreen$OffersDetailsScreen.searchFlowToken)) == null) {
            appLocation = AppLocation.OffersTab;
        }
        RealBoostRepository realBoostRepository = (RealBoostRepository) offersDetailsPresenter.boostRepository;
        String str2 = null;
        Finish finish = new Finish(null);
        BoostAppLocation$OffersDetail boostAppLocation$OffersDetail = new BoostAppLocation$OffersDetail(appLocation);
        String flowToken = realOffersAnalyticsHelper.getFlowToken(offersAnalyticsHelper$Flow);
        if (realOffersAnalytics.isOnGlobalSearchScreen) {
            OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen2 = realOffersAnalytics.offersDetailsScreen;
            if (offersScreen$OffersDetailsScreen2 != null) {
                str2 = offersScreen$OffersDetailsScreen2.shopFlowToken;
            }
        } else {
            str2 = realOffersAnalytics.offersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SHOP);
        }
        RealBoostRepository.selectBoost$default(realBoostRepository, finish, str, boostAppLocation$OffersDetail, null, flowToken, str2, realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.BROWSE), realOffersAnalytics.getSearchFlowToken(), AppPresentation.BottomSheet, moneyTabUIKt$$ExternalSyntheticLambda5, offersScreen$OffersDetailsScreen.moneybotContext, 1536);
    }

    public static final void access$routeFooterActionUrl(OffersDetailsPresenter offersDetailsPresenter, String str) {
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = (RealOffersAnalyticsHelper) offersDetailsPresenter.analyticsHelper;
        RealRouter realRouter = (RealRouter) offersDetailsPresenter.router;
        OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen = (OffersScreen$OffersDetailsScreen) offersDetailsPresenter.args;
        String str2 = offersScreen$OffersDetailsScreen.referrerFlowToken;
        if (str2 == null && (str2 = realOffersAnalyticsHelper.getReferrerFlowToken()) == null) {
            str2 = realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SHOP);
        }
        realRouter.route(new RoutingParams(offersScreen$OffersDetailsScreen, null, null, null, new AnalyticsParams.OffersTabAnalyticsParams(str2, offersScreen$OffersDetailsScreen.searchModeContext), null, 478), str);
    }

    public void closeAndShowErrorNotification(String str) {
        Back back = Back.INSTANCE;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        screenNavigator.goTo(back);
        screenNavigator.goTo(new OffersScreen$OffersNotificationScreen(str, 3000L));
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.clientRouteParser;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.offersSheetRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0657, code lost:
    
        if (r2 != null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0522, code lost:
    
        if (r20 == null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x02b0, code lost:
    
        if (r20 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0b47  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0bb5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0bb9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0536 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0552 A[ADDED_TO_REGION] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        OfferSheetKey offerSheetKey;
        Object obj;
        MutableState mutableState;
        Object obj2;
        IssuedCardManager issuedCardManager;
        FormattedDetail formattedDetail;
        OfferSheet offerSheet;
        zzkw zzkwVar;
        FormattedDetail formattedDetail2;
        Continuation continuation;
        Object obj3;
        OfferSheet offerSheet2;
        zzkw zzkwVar2;
        FormattedDetail formattedDetail3;
        boolean z;
        boolean z2;
        OfferAddedConfirmationState offerAddedConfirmationState;
        OfferDetailSheet offerDetailSheet;
        OfferAddedConfirmationState offerAddedConfirmationState2;
        OfferDetailListSheet offerDetailListSheet;
        zzkw zzkwVar3;
        zzkw zzkwVar4;
        OffersSheetResponse offersSheetResponse;
        boolean changed;
        Object rememberedValue;
        Object rememberedValue2;
        boolean z3;
        OfferDetailsSheetViewModel.Loading loading;
        Continuation continuation2;
        boolean z4;
        Object obj4;
        MutableState mutableState2;
        MutableState mutableState3;
        String str;
        zzkw zzkwVar5;
        OffersSpanAction.EndRootSpan endRootSpan;
        OfferFooterButton offerFooterButton;
        OffersSpanAction.EndLoading endLoading;
        RealOffersSpanManager realOffersSpanManager;
        String str2;
        OffersDetailsSheetViewEvent.OfferButtonEvent removeOffer;
        OfferFooterButton offerFooterButton2;
        zzle zzleVar;
        OfferDetailsSheetViewModel.FooterSectionViewModel footerButtons;
        DismissTapAction dismissTapAction;
        String str3;
        OffersDetailsSheetViewEvent.OfferButtonEvent actionUrl;
        zzle zzleVar2;
        UrlTapAction urlTapAction;
        zzle zzleVar3;
        Avatar avatar;
        Color color;
        FormattedDetailViewModel text;
        LocalizedString localizedString;
        String str4;
        FormattedDetailViewModel text2;
        TapAction tapAction;
        String str5;
        boolean z5;
        int i2;
        zzle zzleVar4;
        OffersLinkViewModel offersLinkViewModel;
        FormattedDetailViewModel text3;
        OfferDetailsSheetViewModel.FooterSectionViewModel footerSectionViewModel;
        String str6;
        ComposeHelpersKt composeHelpersKt;
        Object obj5;
        Object obj6;
        OfferType offerType;
        String name;
        Slots slots;
        Slots slots2;
        Object obj7;
        int i3 = this.$r8$classId;
        Object obj8 = this.args;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        Object obj9 = this.offersDetailsStateManager;
        Object obj10 = this.observabilityManager;
        Object obj11 = this.clock;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        AndroidStringManager androidStringManager = this.stringManager;
        Continuation continuation3 = null;
        switch (i3) {
            case 0:
                OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen = (OffersScreen$OffersDetailsScreen) obj8;
                RealOffersSpanManager realOffersSpanManager2 = (RealOffersSpanManager) this.spanManager;
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-48248403);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState4 = (MutableState) rememberedValue3;
                Object rememberedValue4 = gapComposer.rememberedValue();
                Continuation continuation4 = null;
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState5 = (MutableState) rememberedValue4;
                AssetPublicSuffixList assetPublicSuffixList = (AssetPublicSuffixList) obj9;
                OfferSheetKey offerSheetKey2 = offersScreen$OffersDetailsScreen.offerSheetKey;
                String str7 = (String) mutableState5.getValue();
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new Overlay$$ExternalSyntheticLambda0(this, 24);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Function1 function1 = (Function1) rememberedValue5;
                IssuedCardManager issuedCardManager2 = (IssuedCardManager) assetPublicSuffixList.bytes;
                RealBoostRepository realBoostRepository = (RealBoostRepository) assetPublicSuffixList.readCompleteLatch;
                RealBoostProvider realBoostProvider = realBoostRepository.boostProvider;
                offerSheetKey2.getClass();
                function1.getClass();
                gapComposer.startReplaceGroup(-846821714);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    SafeFlow offerSheet3 = ((RealOffersSheetRepository) assetPublicSuffixList.listRead).offerSheet(offerSheetKey2, function1);
                    DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1(assetPublicSuffixList, offerSheetKey2, function1, continuation4, 16);
                    obj = obj10;
                    offerSheetKey = offerSheetKey2;
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(offerSheet3, dotGridKt$DotGrid$3$1, 3);
                    gapComposer.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
                    rememberedValue6 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
                } else {
                    offerSheetKey = offerSheetKey2;
                    obj = obj10;
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue6, null, null, gapComposer, 48, 2);
                boolean changed2 = gapComposer.changed((ApiResult) collectAsState.getValue());
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue7 == neverEqualPolicy) {
                    ApiResult apiResult = (ApiResult) collectAsState.getValue();
                    if (apiResult != null) {
                        OffersSheetResponse offersSheetResponse2 = (OffersSheetResponse) (apiResult instanceof ApiResult.Success ? ((ApiResult.Success) apiResult).response : null);
                        if (offersSheetResponse2 != null && (offerSheet2 = offersSheetResponse2.sheet) != null && (zzkwVar2 = offerSheet2.sheet) != null) {
                            OfferSheet$Sheet$DetailListSheet offerSheet$Sheet$DetailListSheet = zzkwVar2 instanceof OfferSheet$Sheet$DetailListSheet ? (OfferSheet$Sheet$DetailListSheet) zzkwVar2 : null;
                            OfferDetailListSheet offerDetailListSheet2 = offerSheet$Sheet$DetailListSheet != null ? offerSheet$Sheet$DetailListSheet.value : null;
                            if (offerDetailListSheet2 != null && (formattedDetail3 = offerDetailListSheet2.subtitle) != null) {
                                if (formattedDetail3.credit_check == null) {
                                    formattedDetail2 = null;
                                    break;
                                } else {
                                    formattedDetail2 = formattedDetail3;
                                    break;
                                }
                            }
                        }
                    }
                    if (apiResult != null) {
                        OffersSheetResponse offersSheetResponse3 = (OffersSheetResponse) (apiResult instanceof ApiResult.Success ? ((ApiResult.Success) apiResult).response : null);
                        if (offersSheetResponse3 != null && (offerSheet = offersSheetResponse3.sheet) != null && (zzkwVar = offerSheet.sheet) != null) {
                            OfferSheet$Sheet$DetailSheet offerSheet$Sheet$DetailSheet = zzkwVar instanceof OfferSheet$Sheet$DetailSheet ? (OfferSheet$Sheet$DetailSheet) zzkwVar : null;
                            OfferDetailSheet offerDetailSheet2 = offerSheet$Sheet$DetailSheet != null ? offerSheet$Sheet$DetailSheet.value : null;
                            if (offerDetailSheet2 != null) {
                                FormattedDetail formattedDetail4 = offerDetailSheet2.formatted_subtitle;
                                formattedDetail2 = (formattedDetail4 == null || formattedDetail4.credit_check == null) ? null : formattedDetail4;
                                if (formattedDetail2 == null) {
                                    String str8 = offerDetailSheet2.subtitle;
                                    if (str8 != null) {
                                        mutableState = collectAsState;
                                        StyledText styledText = new StyledText(str8, (Color) null, 6);
                                        AndroidStringManager androidStringManager2 = (AndroidStringManager) assetPublicSuffixList.readFailure;
                                        obj2 = obj11;
                                        StyledText styledText2 = new StyledText(androidStringManager2.get(R.string.offers_sup_credit_not_available), (Color) null, 6);
                                        StyledText styledText3 = new StyledText(androidStringManager2.get(R.string.offers_sup_credit_error), (Color) null, 6);
                                        ByteString byteString = ByteString.EMPTY;
                                        issuedCardManager = issuedCardManager2;
                                        formattedDetail = new FormattedDetail(null, null, new FormattedDetail.CreditInfoCheck("{creditAmount}", null, null, null, styledText2, styledText3, byteString), new FormattedDetail.LoanInfoCheck("{creditAmount}", null, new StyledText(androidStringManager2.get(R.string.offers_sup_credit_loan_limit_reached), (Color) null, 6), byteString), null, null, styledText, byteString);
                                        if (formattedDetail != null) {
                                            RealAfterpayAppletRepository realAfterpayAppletRepository = (RealAfterpayAppletRepository) assetPublicSuffixList.exceptionBytes;
                                            int i4 = 3;
                                            continuation = null;
                                            obj3 = FlowKt.distinctUntilChanged(new SafeFlow(new zzmo(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realAfterpayAppletRepository.getAfterpayAppletCache(), realAfterpayAppletRepository.expiredAfterpayAppletResponse, new CardModelView.AnonymousClass1.AnonymousClass4(i4, continuation, i4), 0), (Continuation) null, realAfterpayAppletRepository, formattedDetail, 28)));
                                        } else {
                                            continuation = null;
                                            obj3 = EmptyFlow.INSTANCE;
                                        }
                                        rememberedValue7 = obj3;
                                        gapComposer.updateRememberedValue(rememberedValue7);
                                    }
                                }
                                mutableState = collectAsState;
                                obj2 = obj11;
                                issuedCardManager = issuedCardManager2;
                                formattedDetail = formattedDetail2;
                                if (formattedDetail != null) {
                                }
                                rememberedValue7 = obj3;
                                gapComposer.updateRememberedValue(rememberedValue7);
                            }
                        }
                    }
                    mutableState = collectAsState;
                    obj2 = obj11;
                    issuedCardManager = issuedCardManager2;
                    formattedDetail = null;
                    if (formattedDetail != null) {
                    }
                    rememberedValue7 = obj3;
                    gapComposer.updateRememberedValue(rememberedValue7);
                } else {
                    mutableState = collectAsState;
                    obj2 = obj11;
                    issuedCardManager = issuedCardManager2;
                    continuation = null;
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue7, null, null, gapComposer, 48, 2);
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = realBoostProvider.getBoostSlots(false);
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue8, null, null, gapComposer, 48, 2);
                Object rememberedValue9 = gapComposer.rememberedValue();
                if (rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = realBoostProvider.getBoostSlots(true);
                    gapComposer.updateRememberedValue(rememberedValue9);
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue9, null, null, gapComposer, 48, 2);
                Object rememberedValue10 = gapComposer.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = realBoostRepository.boostSelector.actions;
                    gapComposer.updateRememberedValue(rememberedValue10);
                }
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer, 48, 2);
                Object rememberedValue11 = gapComposer.rememberedValue();
                if (rememberedValue11 == neverEqualPolicy) {
                    RealIssuedCardManager realIssuedCardManager = (RealIssuedCardManager) issuedCardManager;
                    MoneyTabPresenter$models$lambda$17$$inlined$map$1 issuedCardState = realIssuedCardManager.getIssuedCardState();
                    MoneyTabPresenter$models$lambda$17$$inlined$map$1 moneyTabPresenter$models$lambda$17$$inlined$map$1 = new MoneyTabPresenter$models$lambda$17$$inlined$map$1(realIssuedCardManager.getIssuedCardOrNull(), 6);
                    int i5 = 3;
                    rememberedValue11 = new SupportHomePresenter$models$lambda$5$$inlined$map$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(issuedCardState, moneyTabPresenter$models$lambda$17$$inlined$map$1, new InteractiveCardView$flingTo$1.AnonymousClass1(i5, continuation, i5), 0), 8);
                    gapComposer.updateRememberedValue(rememberedValue11);
                }
                CashAppCard.PhysicalCardOrderState physicalCardOrderState = CashAppCard.PhysicalCardOrderState.NO_CARD;
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue11, physicalCardOrderState, null, gapComposer, 48, 2);
                Object rememberedValue12 = gapComposer.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy) {
                    rememberedValue12 = Updater.mutableStateOf$default(OfferDetailsFooterState.BUTTONS);
                    gapComposer.updateRememberedValue(rememberedValue12);
                }
                MutableState mutableState6 = (MutableState) rememberedValue12;
                if (str7 != null) {
                    List list = (List) collectAsState3.getValue();
                    if (str7.equals((list == null || (slots2 = (Slots) CollectionsKt.firstOrNull(list)) == null) ? null : slots2.token)) {
                        z = true;
                        if (str7 != null) {
                            List list2 = (List) collectAsState4.getValue();
                            if (str7.equals((list2 == null || (slots = (Slots) CollectionsKt.firstOrNull(list2)) == null) ? null : slots.token)) {
                                z2 = true;
                                boolean z6 = (z || z2) ? false : true;
                                if (((BoostAction) collectAsState5.getValue()) instanceof BoostAction.Error) {
                                    offerAddedConfirmationState2 = OfferAddedConfirmationState.ShowErrorNotification.INSTANCE;
                                } else {
                                    if (!z6) {
                                        offerAddedConfirmationState = null;
                                        mutableState6.setValue((z6 || offerAddedConfirmationState != null) ? (OfferDetailsFooterState) mutableState6.getValue() : OfferDetailsFooterState.OFFER_UPDATE_IN_FLIGHT);
                                        Boolean valueOf = Boolean.valueOf(z2);
                                        changed = gapComposer.changed(z2);
                                        rememberedValue = gapComposer.rememberedValue();
                                        if (!changed || rememberedValue == neverEqualPolicy) {
                                            rememberedValue = new RealOffersDetailsStateManager$states$1$1(z2, mutableState6, null, 0);
                                            gapComposer.updateRememberedValue(rememberedValue);
                                        }
                                        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue);
                                        ApiResult apiResult2 = (ApiResult) mutableState.getValue();
                                        List list3 = (List) collectAsState4.getValue();
                                        OffersDetailsState offersDetailsState = new OffersDetailsState(apiResult2, (AppletCreditLineState) collectAsState2.getValue(), list3 == null ? (Slots) CollectionsKt.firstOrNull(list3) : null, (CashAppCard.PhysicalCardOrderState) collectAsState6.getValue(), (OfferDetailsFooterState) mutableState6.getValue(), offerAddedConfirmationState);
                                        gapComposer.end(false);
                                        MutableState rememberUpdatedState = Updater.rememberUpdatedState(offersDetailsState, gapComposer);
                                        rememberedValue2 = gapComposer.rememberedValue();
                                        if (rememberedValue2 == neverEqualPolicy) {
                                            rememberedValue2 = Updater.mutableStateOf$default(null);
                                            gapComposer.updateRememberedValue(rememberedValue2);
                                        }
                                        MutableState mutableState7 = (MutableState) rememberedValue2;
                                        Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) mutableState4, (State) mutableState5, (Object) rememberUpdatedState, 20));
                                        OfferAddedConfirmationState offerAddedConfirmationState3 = ((OffersDetailsState) rememberUpdatedState.getValue()).offerAddedConfirmationState;
                                        z3 = offerAddedConfirmationState3 instanceof OfferAddedConfirmationState.Dismiss;
                                        OfferDetailsSheetViewModel.Loading loading2 = OfferDetailsSheetViewModel.Loading.INSTANCE;
                                        if (!z3) {
                                            gapComposer.startReplaceGroup(878058007);
                                            gapComposer.end(false);
                                            screenNavigator.goTo(Back.INSTANCE);
                                        } else {
                                            if (!(offerAddedConfirmationState3 instanceof OfferAddedConfirmationState.ShowErrorNotification)) {
                                                if (offerAddedConfirmationState3 != null) {
                                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 878058145, false);
                                                }
                                                gapComposer.startReplaceGroup(1450233980);
                                                ApiResult apiResult3 = ((OffersDetailsState) rememberUpdatedState.getValue()).response;
                                                boolean z7 = apiResult3 instanceof ApiResult.Success;
                                                OffersSpanAction.EndRootSpan endRootSpan2 = OffersSpanAction.EndRootSpan.INSTANCE;
                                                OffersSpanAction.EndLoading endLoading2 = OffersSpanAction.EndLoading.INSTANCE;
                                                if (z7) {
                                                    gapComposer.startReplaceGroup(1450323663);
                                                    OffersSheetResponse offersSheetResponse4 = (OffersSheetResponse) ((ApiResult.Success) apiResult3).response;
                                                    OffersDetailsState offersDetailsState2 = (OffersDetailsState) rememberUpdatedState.getValue();
                                                    offersSheetResponse4.getClass();
                                                    OfferSheet offerSheet4 = offersSheetResponse4.sheet;
                                                    loading = loading2;
                                                    if (offerSheet4 != null) {
                                                        zzkw zzkwVar6 = offerSheet4.sheet;
                                                        mutableState3 = mutableState4;
                                                        if (zzkwVar6 != null) {
                                                            OfferSheet$Sheet$DetailSheet offerSheet$Sheet$DetailSheet2 = zzkwVar6 instanceof OfferSheet$Sheet$DetailSheet ? (OfferSheet$Sheet$DetailSheet) zzkwVar6 : null;
                                                            OfferDetailSheet offerDetailSheet3 = offerSheet$Sheet$DetailSheet2 != null ? offerSheet$Sheet$DetailSheet2.value : null;
                                                            if (offerDetailSheet3 != null) {
                                                                str = offerDetailSheet3.boost_token;
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        mutableState3 = mutableState4;
                                                    }
                                                    if (offerSheet4 != null && (zzkwVar5 = offerSheet4.sheet) != null) {
                                                        OfferSheet$Sheet$DetailListSheet offerSheet$Sheet$DetailListSheet2 = zzkwVar5 instanceof OfferSheet$Sheet$DetailListSheet ? (OfferSheet$Sheet$DetailListSheet) zzkwVar5 : null;
                                                        OfferDetailListSheet offerDetailListSheet3 = offerSheet$Sheet$DetailListSheet2 != null ? offerSheet$Sheet$DetailListSheet2.value : null;
                                                        if (offerDetailListSheet3 != null) {
                                                            str = offerDetailListSheet3.boost_token;
                                                            Slots slots3 = offersDetailsState2.activeBoostSlot;
                                                            boolean equals = ((slots3 == null ? slots3.token : null) != null || str == null) ? false : str.equals(slots3.token);
                                                            Slots slots4 = ((OffersDetailsState) rememberUpdatedState.getValue()).activeBoostSlot;
                                                            boolean z8 = (slots4 != null || (str6 = slots4.token) == null) ? false : !StringsKt.isBlank(str6);
                                                            AppletCreditLineState appletCreditLineState = ((OffersDetailsState) rememberUpdatedState.getValue()).appletCreditLineState;
                                                            boolean z9 = equals;
                                                            CashAppCard.PhysicalCardOrderState physicalCardOrderState2 = ((OffersDetailsState) rememberUpdatedState.getValue()).cardState;
                                                            boolean booleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
                                                            OfferDetailsFooterState offerDetailsFooterState = ((OffersDetailsState) rememberUpdatedState.getValue()).footerState;
                                                            physicalCardOrderState2.getClass();
                                                            offerDetailsFooterState.getClass();
                                                            if (offerSheet4 != null) {
                                                                boolean z10 = z8;
                                                                zzkw zzkwVar7 = offerSheet4.sheet;
                                                                if (zzkwVar7 != null) {
                                                                    OfferSheet$Sheet$DetailListSheet offerSheet$Sheet$DetailListSheet3 = zzkwVar7 instanceof OfferSheet$Sheet$DetailListSheet ? (OfferSheet$Sheet$DetailListSheet) zzkwVar7 : null;
                                                                    OfferDetailListSheet offerDetailListSheet4 = offerSheet$Sheet$DetailListSheet3 != null ? offerSheet$Sheet$DetailListSheet3.value : null;
                                                                    if (offerDetailListSheet4 != null) {
                                                                        boolean z11 = !booleanValue ? z9 : false;
                                                                        int ordinal = offerDetailsFooterState.ordinal();
                                                                        if (ordinal == 0) {
                                                                            endRootSpan = endRootSpan2;
                                                                            Button button = offerDetailListSheet4.open_button;
                                                                            if (button == null || !z9 || booleanValue || OfferDetailsSheetMapperKt.needsCashCard(offerDetailListSheet4, physicalCardOrderState2)) {
                                                                                endLoading = endLoading2;
                                                                                realOffersSpanManager = realOffersSpanManager2;
                                                                                offerFooterButton = null;
                                                                            } else {
                                                                                StyledText styledText4 = button.styled_text;
                                                                                String str9 = styledText4 != null ? styledText4.text : null;
                                                                                if (str9 == null) {
                                                                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                    return null;
                                                                                }
                                                                                endLoading = endLoading2;
                                                                                realOffersSpanManager = realOffersSpanManager2;
                                                                                offerFooterButton = new OfferFooterButton(str9, new OffersDetailsSheetViewEvent.OfferButtonEvent.ActionUrl(OfferDetailsSheetMapperKt.getRequiredActionUrl(button), OfferDetailsSheetMapperKt.getRequiredAnalyticsEventSpecs(button)));
                                                                            }
                                                                            OfferType offerType2 = offerDetailListSheet4.offer_type;
                                                                            offerType2.getClass();
                                                                            if (offerType2 == OfferType.PAY_LATER_INN) {
                                                                                Button button2 = offerDetailListSheet4.shop_button;
                                                                                if (button2 != null && !booleanValue) {
                                                                                    StyledText styledText5 = button2.styled_text;
                                                                                    String str10 = styledText5 != null ? styledText5.text : null;
                                                                                    if (str10 != null) {
                                                                                        TapAction tapAction2 = button2.tap_action;
                                                                                        if (tapAction2 != null && (zzleVar3 = tapAction2.action) != null) {
                                                                                            TapAction$Action$DismissAction tapAction$Action$DismissAction = zzleVar3 instanceof TapAction$Action$DismissAction ? (TapAction$Action$DismissAction) zzleVar3 : null;
                                                                                            if (tapAction$Action$DismissAction != null) {
                                                                                                dismissTapAction = tapAction$Action$DismissAction.value;
                                                                                                if (tapAction2 != null && (zzleVar2 = tapAction2.action) != null) {
                                                                                                    TapAction$Action$UrlAction tapAction$Action$UrlAction = !(zzleVar2 instanceof TapAction$Action$UrlAction) ? (TapAction$Action$UrlAction) zzleVar2 : null;
                                                                                                    urlTapAction = tapAction$Action$UrlAction == null ? tapAction$Action$UrlAction.value : null;
                                                                                                    if (urlTapAction != null) {
                                                                                                        str3 = urlTapAction.action_url;
                                                                                                        if (dismissTapAction != null) {
                                                                                                            actionUrl = new OffersDetailsSheetViewEvent.OfferButtonEvent.Close();
                                                                                                        } else if (str3 != null) {
                                                                                                            actionUrl = new OffersDetailsSheetViewEvent.OfferButtonEvent.ActionUrl(OfferDetailsSheetMapperKt.getRequiredActionUrl(button2), OfferDetailsSheetMapperKt.getRequiredAnalyticsEventSpecs(button2));
                                                                                                        } else {
                                                                                                            a$$ExternalSyntheticBUOutline0.m$1("tap action for both dismiss and urlAction were null");
                                                                                                        }
                                                                                                        offerFooterButton2 = new OfferFooterButton(str10, actionUrl);
                                                                                                        footerButtons = offerFooterButton2 == null ? new OfferDetailsSheetViewModel.FooterSectionViewModel.FooterButtons(offerFooterButton, offerFooterButton2) : null;
                                                                                                    }
                                                                                                }
                                                                                                str3 = null;
                                                                                                if (dismissTapAction != null) {
                                                                                                }
                                                                                                offerFooterButton2 = new OfferFooterButton(str10, actionUrl);
                                                                                                footerButtons = offerFooterButton2 == null ? new OfferDetailsSheetViewModel.FooterSectionViewModel.FooterButtons(offerFooterButton, offerFooterButton2) : null;
                                                                                            }
                                                                                        }
                                                                                        dismissTapAction = null;
                                                                                        if (tapAction2 != null) {
                                                                                            if (!(zzleVar2 instanceof TapAction$Action$UrlAction)) {
                                                                                            }
                                                                                            if (tapAction$Action$UrlAction == null) {
                                                                                            }
                                                                                            if (urlTapAction != null) {
                                                                                            }
                                                                                        }
                                                                                        str3 = null;
                                                                                        if (dismissTapAction != null) {
                                                                                        }
                                                                                        offerFooterButton2 = new OfferFooterButton(str10, actionUrl);
                                                                                        footerButtons = offerFooterButton2 == null ? new OfferDetailsSheetViewModel.FooterSectionViewModel.FooterButtons(offerFooterButton, offerFooterButton2) : null;
                                                                                    } else {
                                                                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                    }
                                                                                    return null;
                                                                                }
                                                                                offerFooterButton2 = null;
                                                                                footerButtons = offerFooterButton2 == null ? new OfferDetailsSheetViewModel.FooterSectionViewModel.FooterButtons(offerFooterButton, offerFooterButton2) : null;
                                                                            } else {
                                                                                Button button3 = offerDetailListSheet4.activate_button;
                                                                                if (button3 != null && !booleanValue) {
                                                                                    if (OfferDetailsSheetMapperKt.needsCashCard(offerDetailListSheet4, physicalCardOrderState2)) {
                                                                                        String str11 = physicalCardOrderState2 == physicalCardOrderState ? androidStringManager.get(R.string.offers_get_cash_card_button_label) : androidStringManager.get(R.string.offers_activate_cash_app_card_button_label);
                                                                                        Button button4 = offerDetailListSheet4.order_card_button;
                                                                                        offerFooterButton2 = new OfferFooterButton(str11, new OffersDetailsSheetViewEvent.OfferButtonEvent.CashCardAction(button4 != null ? OfferDetailsSheetMapperKt.getRequiredAnalyticsEventSpecs(button4) : EmptyList.INSTANCE));
                                                                                    } else {
                                                                                        String str12 = offerDetailListSheet4.boost_token;
                                                                                        if (str12 == null) {
                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: Offer detail boost_token == null");
                                                                                            return null;
                                                                                        }
                                                                                        String str13 = z9 ? androidStringManager.get(R.string.offers_remove_offer_button_label) : z10 ? androidStringManager.get(R.string.offers_swap_offer_button_label) : androidStringManager.get(R.string.offers_add_offer_button_label);
                                                                                        ArrayList requiredAnalyticsEventSpecs = OfferDetailsSheetMapperKt.getRequiredAnalyticsEventSpecs(button3);
                                                                                        TapAction tapAction3 = button3.tap_action;
                                                                                        if (tapAction3 != null && (zzleVar = tapAction3.action) != null) {
                                                                                            TapAction$Action$UrlAction tapAction$Action$UrlAction2 = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
                                                                                            UrlTapAction urlTapAction2 = tapAction$Action$UrlAction2 != null ? tapAction$Action$UrlAction2.value : null;
                                                                                            if (urlTapAction2 != null) {
                                                                                                str2 = urlTapAction2.action_url;
                                                                                                if (str2 == null) {
                                                                                                    removeOffer = new OffersDetailsSheetViewEvent.OfferButtonEvent.ActionUrl(OfferDetailsSheetMapperKt.getRequiredActionUrl(button3), requiredAnalyticsEventSpecs);
                                                                                                } else {
                                                                                                    removeOffer = z9 ? new OffersDetailsSheetViewEvent.OfferButtonEvent.RemoveOffer(str12, requiredAnalyticsEventSpecs) : z10 ? new OffersDetailsSheetViewEvent.OfferButtonEvent.SwapOffer(str12, requiredAnalyticsEventSpecs) : new OffersDetailsSheetViewEvent.OfferButtonEvent.AddOffer(str12, requiredAnalyticsEventSpecs);
                                                                                                }
                                                                                                offerFooterButton2 = new OfferFooterButton(str13, removeOffer);
                                                                                            }
                                                                                        }
                                                                                        str2 = null;
                                                                                        if (str2 == null) {
                                                                                        }
                                                                                        offerFooterButton2 = new OfferFooterButton(str13, removeOffer);
                                                                                    }
                                                                                    footerButtons = offerFooterButton2 == null ? new OfferDetailsSheetViewModel.FooterSectionViewModel.FooterButtons(offerFooterButton, offerFooterButton2) : null;
                                                                                }
                                                                                offerFooterButton2 = null;
                                                                                footerButtons = offerFooterButton2 == null ? new OfferDetailsSheetViewModel.FooterSectionViewModel.FooterButtons(offerFooterButton, offerFooterButton2) : null;
                                                                            }
                                                                            AnalyticsEvent analyticsEvent = offerSheet4.analytics_view_event;
                                                                            if (analyticsEvent == null) {
                                                                            }
                                                                            avatar = offerDetailListSheet4.logo;
                                                                            if (avatar == null) {
                                                                            }
                                                                            return null;
                                                                        }
                                                                        endRootSpan = endRootSpan2;
                                                                        if (ordinal == 1) {
                                                                            footerSectionViewModel = OfferDetailsSheetViewModel.FooterSectionViewModel.Loading.INSTANCE;
                                                                        } else {
                                                                            if (ordinal != 2) {
                                                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                return null;
                                                                            }
                                                                            footerSectionViewModel = new OfferDetailsSheetViewModel.FooterSectionViewModel.MessageText(androidStringManager.get(R.string.offer_detail_add_confirmation_title));
                                                                        }
                                                                        footerButtons = footerSectionViewModel;
                                                                        endLoading = endLoading2;
                                                                        realOffersSpanManager = realOffersSpanManager2;
                                                                        AnalyticsEvent analyticsEvent2 = offerSheet4.analytics_view_event;
                                                                        OffersAnalyticsEventSpec offersAnalyticsEventSpec = analyticsEvent2 == null ? ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent2) : null;
                                                                        avatar = offerDetailListSheet4.logo;
                                                                        if (avatar == null) {
                                                                            if (avatar.accent_color != null) {
                                                                                Color.ModeVariant modeVariant = new Color.ModeVariant(avatar.accent_color, null, null, null, null, 30, null);
                                                                                String str14 = avatar.dark_theme_accent_color;
                                                                                if (str14 == null) {
                                                                                    str14 = avatar.accent_color;
                                                                                }
                                                                                color = new Color(modeVariant, new Color.ModeVariant(str14, null, null, null, null, 30, null), 4);
                                                                            } else {
                                                                                color = null;
                                                                            }
                                                                            String str15 = avatar.image_url;
                                                                            if (str15 != null) {
                                                                                String str16 = avatar.dark_theme_image_url;
                                                                                if (str16 == null || str16.length() == 0) {
                                                                                    str16 = null;
                                                                                }
                                                                                if (str16 == null) {
                                                                                    str16 = avatar.image_url;
                                                                                }
                                                                                OffersAvatarViewModel.IconUrl iconUrl = new OffersAvatarViewModel.IconUrl(str15, str16);
                                                                                String str17 = avatar.initial;
                                                                                if (str17 == null) {
                                                                                    str17 = null;
                                                                                }
                                                                                OffersAvatarViewModel offersAvatarViewModel = new OffersAvatarViewModel(iconUrl, GrpcStatus.Companion.monogram(str17), color, Intrinsics.areEqual(avatar.colorize_image, Boolean.TRUE));
                                                                                LocalizedString localizedString2 = offerDetailListSheet4.l_title;
                                                                                if (localizedString2 != null) {
                                                                                    String translated = com.squareup.util.cash.StringsKt.translated(localizedString2);
                                                                                    FormattedDetail formattedDetail5 = offerDetailListSheet4.subtitle;
                                                                                    if (booleanValue) {
                                                                                        text2 = new FormattedDetailViewModel.Text(null, androidStringManager.get(R.string.offers_expired));
                                                                                    } else if (appletCreditLineState == null) {
                                                                                        text = (formattedDetail5 == null || (localizedString = formattedDetail5.l_text) == null || (str4 = localizedString.translated_value) == null) ? null : new FormattedDetailViewModel.Text(null, str4);
                                                                                        String str18 = androidStringManager.get(R.string.offers_how_it_works_label);
                                                                                        tapAction = offerDetailListSheet4.learn_more_action;
                                                                                        if (tapAction == null) {
                                                                                            OffersLinkViewModel offersLinkViewModel2 = new OffersLinkViewModel(str18, tapAction);
                                                                                            List list4 = offerDetailListSheet4.formatted_detail_rows;
                                                                                            list4.getClass();
                                                                                            List list5 = list4;
                                                                                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                                                                            Iterator it = list5.iterator();
                                                                                            while (true) {
                                                                                                if (it.hasNext()) {
                                                                                                    FormattedDetail formattedDetail6 = (FormattedDetail) it.next();
                                                                                                    Icon icon = formattedDetail6.arcade_icon;
                                                                                                    LocalizedString localizedString3 = formattedDetail6.l_text;
                                                                                                    if (icon != null) {
                                                                                                        FormattedDetail.CountdownInfoCheck countdownInfoCheck = formattedDetail6.countdown_check;
                                                                                                        if (countdownInfoCheck != null) {
                                                                                                            offersLinkViewModel = offersLinkViewModel2;
                                                                                                            String str19 = countdownInfoCheck.string_to_replace;
                                                                                                            if (str19 != null) {
                                                                                                                String str20 = localizedString3 != null ? localizedString3.translated_value : null;
                                                                                                                StyledText styledText6 = formattedDetail6.styled_text;
                                                                                                                text3 = new FormattedDetailViewModel.Countdown(new OfferCountdownTemplateViewModel(OfferCountdownTemplateViewModel.CountdownFormatStyle.DETAILED, null, str20, styledText6 != null ? styledText6.text_color : null, countdownInfoCheck.countdown_to_ms, str19));
                                                                                                                arrayList.add(new OfferDetailsSheetViewModel.OfferDetailRow(icon, text3));
                                                                                                                offersLinkViewModel2 = offersLinkViewModel;
                                                                                                            } else {
                                                                                                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                            }
                                                                                                        } else {
                                                                                                            offersLinkViewModel = offersLinkViewModel2;
                                                                                                            String str21 = localizedString3 != null ? localizedString3.translated_value : null;
                                                                                                            if (str21 != null) {
                                                                                                                text3 = new FormattedDetailViewModel.Text(null, str21);
                                                                                                                arrayList.add(new OfferDetailsSheetViewModel.OfferDetailRow(icon, text3));
                                                                                                                offersLinkViewModel2 = offersLinkViewModel;
                                                                                                            } else {
                                                                                                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                    }
                                                                                                } else {
                                                                                                    OffersLinkViewModel offersLinkViewModel3 = offersLinkViewModel2;
                                                                                                    OfferDetailsSheetViewModel.OfferDetails offerDetails = new OfferDetailsSheetViewModel.OfferDetails(offersAnalyticsEventSpec, offersAvatarViewModel, z11, translated, text, offersLinkViewModel3, arrayList, offerSheet4.footer_markdown_text, offerDetailListSheet4.terms_link, footerButtons);
                                                                                                    gapComposer.startReplaceGroup(-97728940);
                                                                                                    TapAction tapAction4 = offersLinkViewModel3.tapAction;
                                                                                                    if (tapAction4 != null && (zzleVar4 = tapAction4.action) != null) {
                                                                                                        TapAction$Action$UrlAction tapAction$Action$UrlAction3 = zzleVar4 instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar4 : null;
                                                                                                        UrlTapAction urlTapAction3 = tapAction$Action$UrlAction3 != null ? tapAction$Action$UrlAction3.value : null;
                                                                                                        if (urlTapAction3 != null) {
                                                                                                            str5 = urlTapAction3.action_url;
                                                                                                            if (str5 != null) {
                                                                                                                gapComposer.startReplaceGroup(1265370157);
                                                                                                                z5 = false;
                                                                                                                gapComposer.end(false);
                                                                                                                continuation2 = null;
                                                                                                            } else {
                                                                                                                gapComposer.startReplaceGroup(1265370158);
                                                                                                                boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changed(str5);
                                                                                                                Object rememberedValue13 = gapComposer.rememberedValue();
                                                                                                                if (changedInstance2 || rememberedValue13 == neverEqualPolicy) {
                                                                                                                    continuation2 = null;
                                                                                                                    rememberedValue13 = new MusicPresenter$models$2$1(this, str5, continuation2, 29);
                                                                                                                    gapComposer.updateRememberedValue(rememberedValue13);
                                                                                                                } else {
                                                                                                                    continuation2 = null;
                                                                                                                }
                                                                                                                Updater.LaunchedEffect(gapComposer, str5, (Function2) rememberedValue13);
                                                                                                                z5 = false;
                                                                                                                gapComposer.end(false);
                                                                                                            }
                                                                                                            gapComposer.end(z5);
                                                                                                            SheetType sheetType = offerSheetKey.sheet_type;
                                                                                                            i2 = sheetType != null ? -1 : WhenMappings.$EnumSwitchMapping$0[sheetType.ordinal()];
                                                                                                            if (i2 != -1 && i2 != 1) {
                                                                                                                if (i2 != 2) {
                                                                                                                    Long l = offersSheetResponse4.expire_at_ms;
                                                                                                                    if ((l != null ? l.longValue() : 0L) > ((AndroidClock) obj2).millis()) {
                                                                                                                        RealOffersSpanManager realOffersSpanManager3 = realOffersSpanManager;
                                                                                                                        realOffersSpanManager3.onAction(endLoading);
                                                                                                                        realOffersSpanManager3.onAction(endRootSpan);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                                                }
                                                                                                            }
                                                                                                            z4 = false;
                                                                                                            gapComposer.end(false);
                                                                                                            mutableState2 = mutableState7;
                                                                                                            obj4 = offerDetails;
                                                                                                        }
                                                                                                    }
                                                                                                    str5 = null;
                                                                                                    if (str5 != null) {
                                                                                                    }
                                                                                                    gapComposer.end(z5);
                                                                                                    SheetType sheetType2 = offerSheetKey.sheet_type;
                                                                                                    if (sheetType2 != null) {
                                                                                                    }
                                                                                                    if (i2 != -1) {
                                                                                                        if (i2 != 2) {
                                                                                                        }
                                                                                                    }
                                                                                                    z4 = false;
                                                                                                    gapComposer.end(false);
                                                                                                    mutableState2 = mutableState7;
                                                                                                    obj4 = offerDetails;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                        }
                                                                                    } else if (appletCreditLineState instanceof AppletCreditLineState.Error) {
                                                                                        text2 = new FormattedDetailViewModel.Text(null, ((AppletCreditLineState.Error) appletCreditLineState).text);
                                                                                    } else if (appletCreditLineState.equals(AppletCreditLineState.Loading.INSTANCE)) {
                                                                                        text2 = new FormattedDetailViewModel.Loading();
                                                                                    } else if (appletCreditLineState instanceof AppletCreditLineState.AvailableCredit) {
                                                                                        text2 = new FormattedDetailViewModel.Text(null, ((AppletCreditLineState.AvailableCredit) appletCreditLineState).limitText);
                                                                                    } else if (appletCreditLineState instanceof AppletCreditLineState.LimitReached) {
                                                                                        text2 = new FormattedDetailViewModel.Text(null, ((AppletCreditLineState.LimitReached) appletCreditLineState).text);
                                                                                    } else {
                                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                    }
                                                                                    text = text2;
                                                                                    String str182 = androidStringManager.get(R.string.offers_how_it_works_label);
                                                                                    tapAction = offerDetailListSheet4.learn_more_action;
                                                                                    if (tapAction == null) {
                                                                                    }
                                                                                } else {
                                                                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                }
                                                                            } else {
                                                                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                            }
                                                                        } else {
                                                                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                        }
                                                                        return null;
                                                                    }
                                                                }
                                                            }
                                                            a$$ExternalSyntheticBUOutline0.m$1("Not valid OffersDetail response in arcade");
                                                            return null;
                                                        }
                                                    }
                                                    str = null;
                                                    Slots slots32 = offersDetailsState2.activeBoostSlot;
                                                    if ((slots32 == null ? slots32.token : null) != null) {
                                                    }
                                                    Slots slots42 = ((OffersDetailsState) rememberUpdatedState.getValue()).activeBoostSlot;
                                                    if (slots42 != null) {
                                                    }
                                                    AppletCreditLineState appletCreditLineState2 = ((OffersDetailsState) rememberUpdatedState.getValue()).appletCreditLineState;
                                                    boolean z92 = equals;
                                                    CashAppCard.PhysicalCardOrderState physicalCardOrderState22 = ((OffersDetailsState) rememberUpdatedState.getValue()).cardState;
                                                    boolean booleanValue2 = ((Boolean) mutableState3.getValue()).booleanValue();
                                                    OfferDetailsFooterState offerDetailsFooterState2 = ((OffersDetailsState) rememberUpdatedState.getValue()).footerState;
                                                    physicalCardOrderState22.getClass();
                                                    offerDetailsFooterState2.getClass();
                                                    if (offerSheet4 != null) {
                                                    }
                                                    a$$ExternalSyntheticBUOutline0.m$1("Not valid OffersDetail response in arcade");
                                                    return null;
                                                }
                                                loading = loading2;
                                                continuation2 = null;
                                                if (apiResult3 instanceof ApiResult.Failure) {
                                                    gapComposer.startReplaceGroup(1452002778);
                                                    gapComposer.end(false);
                                                    closeAndShowErrorNotification(apiResult3 instanceof ApiResult.Failure.NetworkFailure ? androidStringManager.get(R.string.offers_tab_network_error_title) : androidStringManager.get(R.string.offers_tab_generic_error_title));
                                                    realOffersSpanManager2.onAction(endLoading2);
                                                    realOffersSpanManager2.onAction(endRootSpan2);
                                                    obj4 = loading;
                                                    mutableState2 = mutableState7;
                                                    z4 = false;
                                                } else {
                                                    if (apiResult3 != null) {
                                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 878066718, false);
                                                    }
                                                    gapComposer.startReplaceGroup(1452513813);
                                                    z4 = false;
                                                    gapComposer.end(false);
                                                    obj4 = loading;
                                                    mutableState2 = mutableState7;
                                                }
                                                mutableState2.setValue(obj4);
                                                gapComposer.end(z4);
                                                RealObservabilityManager realObservabilityManager = (RealObservabilityManager) obj;
                                                composeHelpersKt = offerSheetKey.identifier_token;
                                                String str22 = "";
                                                if (composeHelpersKt != null) {
                                                    OfferSheetKey$IdentifierToken$OfferToken offerSheetKey$IdentifierToken$OfferToken = composeHelpersKt instanceof OfferSheetKey$IdentifierToken$OfferToken ? (OfferSheetKey$IdentifierToken$OfferToken) composeHelpersKt : continuation2;
                                                    Object obj12 = offerSheetKey$IdentifierToken$OfferToken != 0 ? offerSheetKey$IdentifierToken$OfferToken.value : continuation2;
                                                    if (obj12 != null) {
                                                        obj5 = obj12;
                                                        Pair pair = new Pair("offer_token", obj5);
                                                        if (composeHelpersKt != null) {
                                                            OfferSheetKey$IdentifierToken$MerchantToken offerSheetKey$IdentifierToken$MerchantToken = composeHelpersKt instanceof OfferSheetKey$IdentifierToken$MerchantToken ? (OfferSheetKey$IdentifierToken$MerchantToken) composeHelpersKt : continuation2;
                                                            Object obj13 = offerSheetKey$IdentifierToken$MerchantToken != 0 ? offerSheetKey$IdentifierToken$MerchantToken.value : continuation2;
                                                            if (obj13 != null) {
                                                                obj6 = obj13;
                                                                Pair pair2 = new Pair("merchant_token", obj6);
                                                                offerType = offerSheetKey.offer_type;
                                                                if (offerType != null && (name = offerType.name()) != null) {
                                                                    str22 = name;
                                                                }
                                                                realObservabilityManager.addViewAttributes(MapsKt__MapsKt.mapOf(pair, pair2, new Pair("offer_type", str22)));
                                                                OfferDetailsSheetViewModel offerDetailsSheetViewModel = (OfferDetailsSheetViewModel) mutableState2.getValue();
                                                                OfferDetailsSheetViewModel offerDetailsSheetViewModel2 = offerDetailsSheetViewModel == null ? loading : offerDetailsSheetViewModel;
                                                                gapComposer.end(false);
                                                                return offerDetailsSheetViewModel2;
                                                            }
                                                        }
                                                        obj6 = "";
                                                        Pair pair22 = new Pair("merchant_token", obj6);
                                                        offerType = offerSheetKey.offer_type;
                                                        if (offerType != null) {
                                                            str22 = name;
                                                        }
                                                        realObservabilityManager.addViewAttributes(MapsKt__MapsKt.mapOf(pair, pair22, new Pair("offer_type", str22)));
                                                        OfferDetailsSheetViewModel offerDetailsSheetViewModel3 = (OfferDetailsSheetViewModel) mutableState2.getValue();
                                                        if (offerDetailsSheetViewModel3 == null) {
                                                        }
                                                        gapComposer.end(false);
                                                        return offerDetailsSheetViewModel2;
                                                    }
                                                }
                                                obj5 = "";
                                                Pair pair3 = new Pair("offer_token", obj5);
                                                if (composeHelpersKt != null) {
                                                }
                                                obj6 = "";
                                                Pair pair222 = new Pair("merchant_token", obj6);
                                                offerType = offerSheetKey.offer_type;
                                                if (offerType != null) {
                                                }
                                                realObservabilityManager.addViewAttributes(MapsKt__MapsKt.mapOf(pair3, pair222, new Pair("offer_type", str22)));
                                                OfferDetailsSheetViewModel offerDetailsSheetViewModel32 = (OfferDetailsSheetViewModel) mutableState2.getValue();
                                                if (offerDetailsSheetViewModel32 == null) {
                                                }
                                                gapComposer.end(false);
                                                return offerDetailsSheetViewModel2;
                                            }
                                            gapComposer.startReplaceGroup(1450042958);
                                            gapComposer.end(false);
                                            closeAndShowErrorNotification(androidStringManager.get(R.string.offers_tab_generic_error_title));
                                        }
                                        loading = loading2;
                                        mutableState2 = mutableState7;
                                        continuation2 = null;
                                        RealObservabilityManager realObservabilityManager2 = (RealObservabilityManager) obj;
                                        composeHelpersKt = offerSheetKey.identifier_token;
                                        String str222 = "";
                                        if (composeHelpersKt != null) {
                                        }
                                        obj5 = "";
                                        Pair pair32 = new Pair("offer_token", obj5);
                                        if (composeHelpersKt != null) {
                                        }
                                        obj6 = "";
                                        Pair pair2222 = new Pair("merchant_token", obj6);
                                        offerType = offerSheetKey.offer_type;
                                        if (offerType != null) {
                                        }
                                        realObservabilityManager2.addViewAttributes(MapsKt__MapsKt.mapOf(pair32, pair2222, new Pair("offer_type", str222)));
                                        OfferDetailsSheetViewModel offerDetailsSheetViewModel322 = (OfferDetailsSheetViewModel) mutableState2.getValue();
                                        if (offerDetailsSheetViewModel322 == null) {
                                        }
                                        gapComposer.end(false);
                                        return offerDetailsSheetViewModel2;
                                    }
                                    ApiResult apiResult4 = (ApiResult) mutableState.getValue();
                                    ApiResult.Success success = apiResult4 instanceof ApiResult.Success ? (ApiResult.Success) apiResult4 : null;
                                    OfferSheet offerSheet5 = (success == null || (offersSheetResponse = (OffersSheetResponse) success.response) == null) ? null : offersSheetResponse.sheet;
                                    if (offerSheet5 != null && (zzkwVar4 = offerSheet5.sheet) != null) {
                                        OfferSheet$Sheet$DetailSheet offerSheet$Sheet$DetailSheet3 = zzkwVar4 instanceof OfferSheet$Sheet$DetailSheet ? (OfferSheet$Sheet$DetailSheet) zzkwVar4 : null;
                                        if (offerSheet$Sheet$DetailSheet3 != null) {
                                            offerDetailSheet = offerSheet$Sheet$DetailSheet3.value;
                                            if (offerDetailSheet == null) {
                                                if (offerSheet5 != null && (zzkwVar3 = offerSheet5.sheet) != null) {
                                                    OfferSheet$Sheet$DetailListSheet offerSheet$Sheet$DetailListSheet4 = zzkwVar3 instanceof OfferSheet$Sheet$DetailListSheet ? (OfferSheet$Sheet$DetailListSheet) zzkwVar3 : null;
                                                    if (offerSheet$Sheet$DetailListSheet4 != null) {
                                                        offerDetailListSheet = offerSheet$Sheet$DetailListSheet4.value;
                                                        break;
                                                    }
                                                }
                                                offerDetailListSheet = null;
                                                break;
                                            }
                                            if (((CashAppCard.PhysicalCardOrderState) collectAsState6.getValue()) != physicalCardOrderState) {
                                                offerAddedConfirmationState2 = null;
                                            }
                                            offerAddedConfirmationState2 = OfferAddedConfirmationState.Dismiss.INSTANCE;
                                        }
                                    }
                                    offerDetailSheet = null;
                                    if (offerDetailSheet == null) {
                                    }
                                    if (((CashAppCard.PhysicalCardOrderState) collectAsState6.getValue()) != physicalCardOrderState) {
                                    }
                                    offerAddedConfirmationState2 = OfferAddedConfirmationState.Dismiss.INSTANCE;
                                }
                                offerAddedConfirmationState = offerAddedConfirmationState2;
                                mutableState6.setValue((z6 || offerAddedConfirmationState != null) ? (OfferDetailsFooterState) mutableState6.getValue() : OfferDetailsFooterState.OFFER_UPDATE_IN_FLIGHT);
                                Boolean valueOf2 = Boolean.valueOf(z2);
                                changed = gapComposer.changed(z2);
                                rememberedValue = gapComposer.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = new RealOffersDetailsStateManager$states$1$1(z2, mutableState6, null, 0);
                                gapComposer.updateRememberedValue(rememberedValue);
                                Updater.LaunchedEffect(gapComposer, valueOf2, (Function2) rememberedValue);
                                ApiResult apiResult22 = (ApiResult) mutableState.getValue();
                                List list32 = (List) collectAsState4.getValue();
                                OffersDetailsState offersDetailsState3 = new OffersDetailsState(apiResult22, (AppletCreditLineState) collectAsState2.getValue(), list32 == null ? (Slots) CollectionsKt.firstOrNull(list32) : null, (CashAppCard.PhysicalCardOrderState) collectAsState6.getValue(), (OfferDetailsFooterState) mutableState6.getValue(), offerAddedConfirmationState);
                                gapComposer.end(false);
                                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(offersDetailsState3, gapComposer);
                                rememberedValue2 = gapComposer.rememberedValue();
                                if (rememberedValue2 == neverEqualPolicy) {
                                }
                                MutableState mutableState72 = (MutableState) rememberedValue2;
                                Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) mutableState4, (State) mutableState5, (Object) rememberUpdatedState2, 20));
                                OfferAddedConfirmationState offerAddedConfirmationState32 = ((OffersDetailsState) rememberUpdatedState2.getValue()).offerAddedConfirmationState;
                                z3 = offerAddedConfirmationState32 instanceof OfferAddedConfirmationState.Dismiss;
                                OfferDetailsSheetViewModel.Loading loading22 = OfferDetailsSheetViewModel.Loading.INSTANCE;
                                if (!z3) {
                                }
                                loading = loading22;
                                mutableState2 = mutableState72;
                                continuation2 = null;
                                RealObservabilityManager realObservabilityManager22 = (RealObservabilityManager) obj;
                                composeHelpersKt = offerSheetKey.identifier_token;
                                String str2222 = "";
                                if (composeHelpersKt != null) {
                                }
                                obj5 = "";
                                Pair pair322 = new Pair("offer_token", obj5);
                                if (composeHelpersKt != null) {
                                }
                                obj6 = "";
                                Pair pair22222 = new Pair("merchant_token", obj6);
                                offerType = offerSheetKey.offer_type;
                                if (offerType != null) {
                                }
                                realObservabilityManager22.addViewAttributes(MapsKt__MapsKt.mapOf(pair322, pair22222, new Pair("offer_type", str2222)));
                                OfferDetailsSheetViewModel offerDetailsSheetViewModel3222 = (OfferDetailsSheetViewModel) mutableState2.getValue();
                                if (offerDetailsSheetViewModel3222 == null) {
                                }
                                gapComposer.end(false);
                                return offerDetailsSheetViewModel2;
                            }
                        }
                        z2 = false;
                        if (z) {
                        }
                        if (((BoostAction) collectAsState5.getValue()) instanceof BoostAction.Error) {
                        }
                        offerAddedConfirmationState = offerAddedConfirmationState2;
                        mutableState6.setValue((z6 || offerAddedConfirmationState != null) ? (OfferDetailsFooterState) mutableState6.getValue() : OfferDetailsFooterState.OFFER_UPDATE_IN_FLIGHT);
                        Boolean valueOf22 = Boolean.valueOf(z2);
                        changed = gapComposer.changed(z2);
                        rememberedValue = gapComposer.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new RealOffersDetailsStateManager$states$1$1(z2, mutableState6, null, 0);
                        gapComposer.updateRememberedValue(rememberedValue);
                        Updater.LaunchedEffect(gapComposer, valueOf22, (Function2) rememberedValue);
                        ApiResult apiResult222 = (ApiResult) mutableState.getValue();
                        List list322 = (List) collectAsState4.getValue();
                        OffersDetailsState offersDetailsState32 = new OffersDetailsState(apiResult222, (AppletCreditLineState) collectAsState2.getValue(), list322 == null ? (Slots) CollectionsKt.firstOrNull(list322) : null, (CashAppCard.PhysicalCardOrderState) collectAsState6.getValue(), (OfferDetailsFooterState) mutableState6.getValue(), offerAddedConfirmationState);
                        gapComposer.end(false);
                        MutableState rememberUpdatedState22 = Updater.rememberUpdatedState(offersDetailsState32, gapComposer);
                        rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                        }
                        MutableState mutableState722 = (MutableState) rememberedValue2;
                        Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) mutableState4, (State) mutableState5, (Object) rememberUpdatedState22, 20));
                        OfferAddedConfirmationState offerAddedConfirmationState322 = ((OffersDetailsState) rememberUpdatedState22.getValue()).offerAddedConfirmationState;
                        z3 = offerAddedConfirmationState322 instanceof OfferAddedConfirmationState.Dismiss;
                        OfferDetailsSheetViewModel.Loading loading222 = OfferDetailsSheetViewModel.Loading.INSTANCE;
                        if (!z3) {
                        }
                        loading = loading222;
                        mutableState2 = mutableState722;
                        continuation2 = null;
                        RealObservabilityManager realObservabilityManager222 = (RealObservabilityManager) obj;
                        composeHelpersKt = offerSheetKey.identifier_token;
                        String str22222 = "";
                        if (composeHelpersKt != null) {
                        }
                        obj5 = "";
                        Pair pair3222 = new Pair("offer_token", obj5);
                        if (composeHelpersKt != null) {
                        }
                        obj6 = "";
                        Pair pair222222 = new Pair("merchant_token", obj6);
                        offerType = offerSheetKey.offer_type;
                        if (offerType != null) {
                        }
                        realObservabilityManager222.addViewAttributes(MapsKt__MapsKt.mapOf(pair3222, pair222222, new Pair("offer_type", str22222)));
                        OfferDetailsSheetViewModel offerDetailsSheetViewModel32222 = (OfferDetailsSheetViewModel) mutableState2.getValue();
                        if (offerDetailsSheetViewModel32222 == null) {
                        }
                        gapComposer.end(false);
                        return offerDetailsSheetViewModel2;
                    }
                }
                z = false;
                if (str7 != null) {
                }
                z2 = false;
                if (z) {
                }
                if (((BoostAction) collectAsState5.getValue()) instanceof BoostAction.Error) {
                }
                offerAddedConfirmationState = offerAddedConfirmationState2;
                mutableState6.setValue((z6 || offerAddedConfirmationState != null) ? (OfferDetailsFooterState) mutableState6.getValue() : OfferDetailsFooterState.OFFER_UPDATE_IN_FLIGHT);
                Boolean valueOf222 = Boolean.valueOf(z2);
                changed = gapComposer.changed(z2);
                rememberedValue = gapComposer.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new RealOffersDetailsStateManager$states$1$1(z2, mutableState6, null, 0);
                gapComposer.updateRememberedValue(rememberedValue);
                Updater.LaunchedEffect(gapComposer, valueOf222, (Function2) rememberedValue);
                ApiResult apiResult2222 = (ApiResult) mutableState.getValue();
                List list3222 = (List) collectAsState4.getValue();
                OffersDetailsState offersDetailsState322 = new OffersDetailsState(apiResult2222, (AppletCreditLineState) collectAsState2.getValue(), list3222 == null ? (Slots) CollectionsKt.firstOrNull(list3222) : null, (CashAppCard.PhysicalCardOrderState) collectAsState6.getValue(), (OfferDetailsFooterState) mutableState6.getValue(), offerAddedConfirmationState);
                gapComposer.end(false);
                MutableState rememberUpdatedState222 = Updater.rememberUpdatedState(offersDetailsState322, gapComposer);
                rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                }
                MutableState mutableState7222 = (MutableState) rememberedValue2;
                Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) mutableState4, (State) mutableState5, (Object) rememberUpdatedState222, 20));
                OfferAddedConfirmationState offerAddedConfirmationState3222 = ((OffersDetailsState) rememberUpdatedState222.getValue()).offerAddedConfirmationState;
                z3 = offerAddedConfirmationState3222 instanceof OfferAddedConfirmationState.Dismiss;
                OfferDetailsSheetViewModel.Loading loading2222 = OfferDetailsSheetViewModel.Loading.INSTANCE;
                if (!z3) {
                }
                loading = loading2222;
                mutableState2 = mutableState7222;
                continuation2 = null;
                RealObservabilityManager realObservabilityManager2222 = (RealObservabilityManager) obj;
                composeHelpersKt = offerSheetKey.identifier_token;
                String str222222 = "";
                if (composeHelpersKt != null) {
                }
                obj5 = "";
                Pair pair32222 = new Pair("offer_token", obj5);
                if (composeHelpersKt != null) {
                }
                obj6 = "";
                Pair pair2222222 = new Pair("merchant_token", obj6);
                offerType = offerSheetKey.offer_type;
                if (offerType != null) {
                }
                realObservabilityManager2222.addViewAttributes(MapsKt__MapsKt.mapOf(pair32222, pair2222222, new Pair("offer_type", str222222)));
                OfferDetailsSheetViewModel offerDetailsSheetViewModel322222 = (OfferDetailsSheetViewModel) mutableState2.getValue();
                if (offerDetailsSheetViewModel322222 == null) {
                }
                gapComposer.end(false);
                return offerDetailsSheetViewModel2;
            default:
                TimeZone timeZone = (TimeZone) this.analytics;
                AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) this.computationDispatcher;
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(686868196);
                Object rememberedValue14 = gapComposer2.rememberedValue();
                if (rememberedValue14 == neverEqualPolicy) {
                    rememberedValue14 = ((SyncValueReader) obj11).getSingleValue(AndroidSyncValueSpecs.CashGreen, new BenefitsHubViewKt$$ExternalSyntheticLambda2(9));
                    gapComposer2.updateRememberedValue(rememberedValue14);
                }
                MutableState collectAsState7 = Updater.collectAsState((StateFlow) rememberedValue14, null, gapComposer2, 1);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer2.changedInstance(this);
                Object rememberedValue15 = gapComposer2.rememberedValue();
                if (changedInstance3 || rememberedValue15 == neverEqualPolicy) {
                    rememberedValue15 = new MLKitTitleGenerator$1(this, continuation3, 17);
                    gapComposer2.updateRememberedValue(rememberedValue15);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue15);
                Updater.LaunchedEffect(gapComposer2, flow, new ToastKt$Toast$9$1(flow, continuation3, this, 22));
                CashGreenV1 cashGreenV1 = (CashGreenV1) collectAsState7.getValue();
                SpendPathProgress spendPath = cashGreenV1 != null ? ErrorReportingKt.spendPath(this, cashGreenV1) : null;
                Long l2 = spendPath != null ? spendPath.period_start_at : null;
                Long l3 = spendPath != null ? spendPath.period_end_at : null;
                if (spendPath == null || l3 == null) {
                    gapComposer2.end(false);
                    return GreenEligibleTransactionsViewModel.Loading.INSTANCE;
                }
                boolean changed3 = gapComposer2.changed(l2) | gapComposer2.changed(l3.longValue());
                Object rememberedValue16 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue16 == neverEqualPolicy) {
                    obj7 = obj8;
                    rememberedValue16 = new ActivitiesManager.ActivityContext(new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, PlatformKt.activeAccountToken((SessionManager) obj10), (String) null, 12), ActivityScope.GREEN_BENEFITS, new BenefitsActivityRequestHandler((ActivityClientService) obj9, (ErrorReporter) this.clientRouteParser, l2, l3), 8);
                    gapComposer2.updateRememberedValue(rememberedValue16);
                } else {
                    obj7 = obj8;
                }
                ActivitiesManager.ActivityContext activityContext = (ActivitiesManager.ActivityContext) rememberedValue16;
                boolean changed4 = gapComposer2.changed(activityContext);
                Object rememberedValue17 = gapComposer2.rememberedValue();
                if (changed4 || rememberedValue17 == neverEqualPolicy) {
                    rememberedValue17 = ((RealActivityEmbeddedPresenter$Factory$Impl) this.boostRepository).create(screenNavigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(activityContext, RealActivitiesCacheManager.take$default((RealActivitiesCacheManager) obj7, activityContext), null, new SsnViewKt$$ExternalSyntheticLambda0(8), Integer.MAX_VALUE, null, null, null, null, null, 8136));
                    gapComposer2.updateRememberedValue(rememberedValue17);
                }
                Instant ofEpochMilli = Instant.ofEpochMilli(l3.longValue());
                timeZone.getClass();
                String format2 = androidDateFormatManager.getDateFormat("MMM", timeZone).formatter.format(ofEpochMilli);
                ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(1, format2, "month", format2);
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format3 = new MessageFormat(resources.getString(R.string.benefits_green_eligible_transactions_header_title)).format(m);
                format3.getClass();
                String str23 = androidStringManager.get(R.string.benefits_green_eligible_transactions_header_body);
                String str24 = androidStringManager.get(R.string.benefits_green_eligible_transactions_learn_more);
                String format4 = androidDateFormatManager.getDateFormat("MMMM", timeZone).formatter.format(ofEpochMilli);
                format4.getClass();
                MoneyFormatter moneyFormatter = (MoneyFormatter) this.router;
                Money money = spendPath.current_aggregated_amount;
                money.getClass();
                GreenEligibleTransactionsViewModel.Loaded loaded = new GreenEligibleTransactionsViewModel.Loaded(format3, str23, str24, format4, moneyFormatter.format(money), androidStringManager.get(R.string.green_eligible_transactions_empty_message), ((RealActivityEmbeddedPresenter) rememberedValue17).models(gapComposer2, 0));
                gapComposer2.end(false);
                return loaded;
        }
    }

    public OffersDetailsPresenter(LocalizedMoneyFormatter.Factory factory, RealActivitiesCacheManager realActivitiesCacheManager, ActivityClientService activityClientService, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, Analytics analytics, ErrorReporter errorReporter, SampleStrategy sampleStrategy, AndroidDateFormatManager androidDateFormatManager, SessionManager sessionManager, AndroidStringManager androidStringManager, RealSupportNavigator realSupportNavigator, SyncValueReader syncValueReader, GreenEligibleTransactionsScreen greenEligibleTransactionsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        greenEligibleTransactionsScreen.getClass();
        this.args = realActivitiesCacheManager;
        this.offersDetailsStateManager = activityClientService;
        this.boostRepository = realActivityEmbeddedPresenter$Factory$Impl;
        this.analyticsHelper = analytics;
        this.clientRouteParser = errorReporter;
        this.offersSheetRepository = sampleStrategy;
        this.computationDispatcher = androidDateFormatManager;
        this.observabilityManager = sessionManager;
        this.stringManager = androidStringManager;
        this.spanManager = realSupportNavigator;
        this.clock = syncValueReader;
        this.flowStarter = greenEligibleTransactionsScreen;
        this.navigator = screenNavigator;
        this.router = factory.create(MoneyFormatterConfig.COMPACT);
        this.analytics = TimeZone.getTimeZone(ZoneId.of("America/New_York"));
    }
}
