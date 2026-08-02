package com.squareup.cash.investing.components;

import android.app.Activity;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewEvent$Exit;
import com.squareup.cash.appmessages.InvestingTabPopupAppMessage;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.growtools.GrowToolsManageChangeTarget;
import com.squareup.cash.cdf.growtools.GrowToolsManageExit;
import com.squareup.cash.cdf.growtools.GrowToolsManageShowMore;
import com.squareup.cash.cdf.growtools.GrowToolsToggleCancel;
import com.squareup.cash.cdf.growtools.GrowToolsToggleOffConfirm;
import com.squareup.cash.cdf.growtools.GrowToolsToggleStart;
import com.squareup.cash.cdf.growtools.InvestmentType;
import com.squareup.cash.cdf.growtools.Origin;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db.contacts.RecipientPaymentInfo;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.google.pay.GooglePayActivationPresenter$VisaExtras;
import com.squareup.cash.google.pay.GooglePayActivationPresenter$models$1$1$1$emit$1;
import com.squareup.cash.google.pay.GooglePayService;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.swampgl.EngineFrameScheduler$SceneGroup;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsActivityViewEvent$Back;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewEvent;
import com.squareup.cash.history.presenters.PaymentReceiptDialogPresenter;
import com.squareup.cash.history.treehouse.views.ActivityInviteFriendsView;
import com.squareup.cash.history.viewmodels.ActivityInviteViewModel;
import com.squareup.cash.history.viewmodels.CancelPaymentResult$Negative;
import com.squareup.cash.history.viewmodels.CancelPaymentResult$Positive;
import com.squareup.cash.history.viewmodels.CancelPaymentViewEvent;
import com.squareup.cash.history.viewmodels.ErrorViewEvent$NegativeClick;
import com.squareup.cash.history.viewmodels.InvestingRoundUpsFailedViewEvent$Close;
import com.squareup.cash.history.viewmodels.InvestingRoundUpsSkippedViewEvent$Close;
import com.squareup.cash.history.viewmodels.PaymentReceiptDialogViewEvent$Close;
import com.squareup.cash.history.viewmodels.RefundPaymentEvent;
import com.squareup.cash.history.viewmodels.SkipPaymentViewEvent;
import com.squareup.cash.initialscreenloader.backend.AppUpgradeAnalytics$Option;
import com.squareup.cash.initialscreenloader.screens.AppUpgradeScreen;
import com.squareup.cash.initialscreenloader.screens.InitiateSessionFailedScreen$Result$Close;
import com.squareup.cash.initialscreenloader.screens.InitiateSessionFailedScreen$Result$Retry;
import com.squareup.cash.initialscreenloader.screens.ScenarioPlanErrorScreen$Result$Close;
import com.squareup.cash.initialscreenloader.screens.ScenarioPlanErrorScreen$Result$Retry;
import com.squareup.cash.initialscreenloader.viewmodels.AppUpgradeViewEvent;
import com.squareup.cash.initialscreenloader.viewmodels.GenericErrorViewEvent;
import com.squareup.cash.initialscreenloader.viewmodels.InitiateSessionFailedViewEvent;
import com.squareup.cash.initialscreenloader.viewmodels.ScenarioPlanErrorViewEvent;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.screens.InstrumentSelectionLoadingScreen;
import com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionLoadingViewEvent$CloseClick;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentResult;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewEvent$SelectPaymentInstrument;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileEvent$StocksAppletOnClickTile;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingExplanatoryViewEvent$Close;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.PerformanceViewEvent$NavigationClick;
import com.squareup.cash.investing.viewmodels.dependent.DependentWelcomeViewEvent;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.ActivateDigitalWalletRequest;
import com.squareup.protos.franklin.app.ActivateDigitalWalletResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.PlatformRandomKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import operations.ComparingOperation;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingHomeView$2$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ InvestingHomeView$2$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.squareup.protos.common.Money] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r7v19, types: [com.squareup.protos.common.Money] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Event growToolsToggleStart;
        boolean z;
        SelectPaymentInstrumentResult selectPaymentInstrumentResult;
        ?? r15;
        int i = this.$r8$classId;
        FullScreenActivityViewEvent$Exit fullScreenActivityViewEvent$Exit = FullScreenActivityViewEvent$Exit.INSTANCE;
        Back back = Back.INSTANCE;
        Object obj2 = this.this$0;
        Screen screen = null;
        switch (i) {
            case 0:
                Ui.EventReceiver eventReceiver = ((InvestingHomeView) obj2).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(InvestingHomeViewEvent.ScrollEvent.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 1:
                GlobalSearchViewEvent globalSearchViewEvent = (GlobalSearchViewEvent) obj;
                if (!(globalSearchViewEvent instanceof GlobalSearchViewEvent.QueryUpdateEvent) && (globalSearchViewEvent instanceof GlobalSearchViewEvent.BackEvent)) {
                    ((BetterNavigator.ScreenNavigator) ((LocalEditorialPresenter) obj2).navigator).goTo(back);
                }
                return Unit.INSTANCE;
            case 2:
                if (((GlobalSearchViewEvent) obj) instanceof GlobalSearchViewEvent.Retry) {
                    StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) obj2;
                    RealGlobalSearchRepository realGlobalSearchRepository = (RealGlobalSearchRepository) stuckPlayerDetector.callback;
                    realGlobalSearchRepository.cacheKey = null;
                    StateFlowKt.emitOrThrow(realGlobalSearchRepository.cachedData, null);
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) stuckPlayerDetector.stuckSuppressedDetector;
                    parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                }
                return Unit.INSTANCE;
            case 3:
                return emit((IssuedCardFactory.IssuedCard) obj, continuation);
            case 4:
                ((EngineFrameScheduler$SceneGroup) obj2).requestRender("dirty");
                return Unit.INSTANCE;
            case 5:
                GrowToolsManagerViewEvent growToolsManagerViewEvent = (GrowToolsManagerViewEvent) obj;
                MusicPresenter musicPresenter = (MusicPresenter) obj2;
                Analytics analytics = (Analytics) musicPresenter.musicRepository;
                GrowToolsManagerScreen growToolsManagerScreen = (GrowToolsManagerScreen) musicPresenter.args;
                GrowToolsManagerScreen.Origin origin = growToolsManagerScreen.getOrigin();
                GrowToolsManagerScreen.InvestmentType investmentType = growToolsManagerScreen.f1144type;
                growToolsManagerViewEvent.getClass();
                origin.getClass();
                Origin cdfType = PlatformRandomKt.toCdfType(origin);
                InvestmentType cdfType2 = PlatformRandomKt.toCdfType(investmentType);
                if (growToolsManagerViewEvent.equals(GrowToolsManagerViewEvent.ActivityShowMoreTapped.INSTANCE)) {
                    growToolsToggleStart = new GrowToolsManageShowMore(cdfType, cdfType2);
                } else if (growToolsManagerViewEvent.equals(GrowToolsManagerViewEvent.Back.INSTANCE)) {
                    growToolsToggleStart = new GrowToolsManageExit(cdfType, cdfType2);
                } else if (growToolsManagerViewEvent.equals(GrowToolsManagerViewEvent.ChangeButtonTapped.INSTANCE)) {
                    growToolsToggleStart = new GrowToolsManageChangeTarget(cdfType, cdfType2);
                } else if (growToolsManagerViewEvent.equals(GrowToolsManagerViewEvent.DialogConfirmTapped.INSTANCE)) {
                    growToolsToggleStart = new GrowToolsToggleOffConfirm(cdfType, cdfType2);
                } else if (growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.DialogDismissTapped) {
                    growToolsToggleStart = new GrowToolsToggleCancel(cdfType, cdfType2);
                } else {
                    if (!growToolsManagerViewEvent.equals(GrowToolsManagerViewEvent.TargetAvatarTapped.INSTANCE)) {
                        if (growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.ToggleTapped) {
                            growToolsToggleStart = new GrowToolsToggleStart(cdfType, cdfType2, Boolean.valueOf(((GrowToolsManagerViewEvent.ToggleTapped) growToolsManagerViewEvent).isChecked));
                        } else if (!(growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.DetailRowTapped)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    }
                    growToolsToggleStart = null;
                }
                if (growToolsToggleStart != null) {
                    analytics.track(growToolsToggleStart, null);
                }
                return Unit.INSTANCE;
            case 6:
                if (Intrinsics.areEqual((GrowToolsActivityViewEvent$Back) obj, GrowToolsActivityViewEvent$Back.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) ((DisclosurePresenter) obj2).navigator).goTo(back);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 7:
                if (Intrinsics.areEqual((FullScreenActivityViewEvent$Exit) obj, fullScreenActivityViewEvent$Exit)) {
                    ((BetterNavigator.ScreenNavigator) ((CardStudioPresenter) obj2).navigator).goTo(back);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 8:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
                CancelPaymentViewEvent cancelPaymentViewEvent = (CancelPaymentViewEvent) obj;
                if (Intrinsics.areEqual(cancelPaymentViewEvent, CancelPaymentViewEvent.NegativeClick.INSTANCE)) {
                    screenNavigator.goTo(new Finish(CancelPaymentResult$Negative.INSTANCE));
                } else {
                    if (!Intrinsics.areEqual(cancelPaymentViewEvent, CancelPaymentViewEvent.PositiveClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default((CoroutineScope) localEditorialPresenter.screen, null, null, new RealKeyStoreProvider$load$2(localEditorialPresenter, r7, 7), 3);
                    screenNavigator.goTo(new Finish(CancelPaymentResult$Positive.INSTANCE));
                }
                return Unit.INSTANCE;
            case 9:
                if (Intrinsics.areEqual((ErrorViewEvent$NegativeClick) obj, ErrorViewEvent$NegativeClick.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator).goTo(back);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 10:
                if (Intrinsics.areEqual((FullScreenActivityViewEvent$Exit) obj, fullScreenActivityViewEvent$Exit)) {
                    ((LiteActivityPresenter) obj2).navigator.goTo(back);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 11:
                if (Intrinsics.areEqual((InvestingRoundUpsFailedViewEvent$Close) obj, InvestingRoundUpsFailedViewEvent$Close.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, ((AddAliasPresenter) obj2).navigator);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 12:
                if (Intrinsics.areEqual((InvestingRoundUpsSkippedViewEvent$Close) obj, InvestingRoundUpsSkippedViewEvent$Close.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, ((AddAliasPresenter) obj2).navigator);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 13:
                if (Intrinsics.areEqual((PaymentReceiptDialogViewEvent$Close) obj, PaymentReceiptDialogViewEvent$Close.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, ((PaymentReceiptDialogPresenter) obj2).navigator);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 14:
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
                RefundPaymentEvent refundPaymentEvent = (RefundPaymentEvent) obj;
                if (Intrinsics.areEqual(refundPaymentEvent, RefundPaymentEvent.PositiveButtonClick.INSTANCE)) {
                    PaymentManager paymentManager = (PaymentManager) cardStudioPresenter.ioContext;
                    ClientScenario clientScenario = ClientScenario.ACTIVITY;
                    HistoryScreens.RefundPayment refundPayment = (HistoryScreens.RefundPayment) cardStudioPresenter.appConfig;
                    String str = refundPayment.flowToken;
                    String str2 = refundPayment.paymentToken;
                    clientScenario.getClass();
                    str.getClass();
                    str2.getClass();
                    StateFlowKt.emitOrThrow(((RealPaymentManager) paymentManager).paymentActions, new PaymentAction.SendRefundAction(clientScenario, str, str2));
                    screenNavigator2.goTo(back);
                } else {
                    if (!Intrinsics.areEqual(refundPaymentEvent, RefundPaymentEvent.NegativeButtonClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, screenNavigator2);
                }
                return Unit.INSTANCE;
            case 15:
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                SkipPaymentViewEvent skipPaymentViewEvent = (SkipPaymentViewEvent) obj;
                if (skipPaymentViewEvent instanceof SkipPaymentViewEvent.Cancel) {
                    screenNavigator3.goTo(back);
                } else {
                    if (!(skipPaymentViewEvent instanceof SkipPaymentViewEvent.Confirm)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator3.goTo(back);
                    PaymentManager paymentManager2 = (PaymentManager) localPosCheckInPresenter.store;
                    HistoryScreens.SkipPayment skipPayment = (HistoryScreens.SkipPayment) localPosCheckInPresenter.cameraPermissions;
                    String str3 = skipPayment.flowToken;
                    String str4 = skipPayment.paymentToken;
                    str3.getClass();
                    str4.getClass();
                    StateFlowKt.emitOrThrow(((RealPaymentManager) paymentManager2).paymentActions, new PaymentAction.SendSkipLoanPayment(str3, str4));
                }
                return Unit.INSTANCE;
            case 16:
                ActivityInviteViewModel activityInviteViewModel = (ActivityInviteViewModel) obj;
                ActivityInviteFriendsView activityInviteFriendsView = (ActivityInviteFriendsView) obj2;
                activityInviteFriendsView.setText(activityInviteViewModel.text);
                activityInviteFriendsView.setVisibility(activityInviteViewModel.enabled ? 0 : 8);
                return Unit.INSTANCE;
            case 17:
                LocalEditorialPresenter localEditorialPresenter2 = (LocalEditorialPresenter) obj2;
                Activity activity = (Activity) localEditorialPresenter2.service;
                RealIntentFactory realIntentFactory = (RealIntentFactory) localEditorialPresenter2.launcher;
                zzr zzrVar = (zzr) localEditorialPresenter2.clock;
                AppUpgradeScreen appUpgradeScreen = (AppUpgradeScreen) localEditorialPresenter2.responseContextHandler;
                AppUpgradeViewEvent appUpgradeViewEvent = (AppUpgradeViewEvent) obj;
                if (Intrinsics.areEqual(appUpgradeViewEvent, AppUpgradeViewEvent.Upgrade.INSTANCE)) {
                    zzrVar.trackAppUpgrade(appUpgradeScreen.getRequired(), AppUpgradeAnalytics$Option.VISIT_APP_STORE);
                    realIntentFactory.maybeStartUrlIntent("https://play.google.com/store/apps/details?id=".concat((String) localEditorialPresenter2.screen), activity, true);
                } else if (Intrinsics.areEqual(appUpgradeViewEvent, AppUpgradeViewEvent.OpenWebVersion.INSTANCE)) {
                    zzrVar.trackAppUpgrade(appUpgradeScreen.getRequired(), AppUpgradeAnalytics$Option.OPEN_WEB_VERSION);
                    realIntentFactory.maybeStartUrlIntent("https://cash.app/login", activity, true);
                } else {
                    if (!Intrinsics.areEqual(appUpgradeViewEvent, AppUpgradeViewEvent.Close.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (appUpgradeScreen.getRequired()) {
                        ((AndroidActivityFinisher) localEditorialPresenter2.installedStore).finish();
                    } else {
                        ((BetterNavigator.ScreenNavigator) localEditorialPresenter2.navigator).goTo(back);
                    }
                    zzrVar.trackAppUpgrade(appUpgradeScreen.getRequired(), AppUpgradeAnalytics$Option.DISMISS);
                }
                return Unit.INSTANCE;
            case 18:
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj2;
                GenericErrorViewEvent genericErrorViewEvent = (GenericErrorViewEvent) obj;
                if (Intrinsics.areEqual(genericErrorViewEvent, GenericErrorViewEvent.Close.INSTANCE)) {
                    ((AndroidActivityFinisher) endAppLockPresenter.navigatorSwitcher).finish();
                } else {
                    if (!Intrinsics.areEqual(genericErrorViewEvent, GenericErrorViewEvent.SignOut.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((BetterNavigator.ScreenNavigator) endAppLockPresenter.accountOutboundNavigator).goTo(((RealFlowStarter) ((FlowStarter) endAppLockPresenter.appLockState)).signOut());
                }
                return Unit.INSTANCE;
            case 19:
                BetterNavigator.ScreenNavigator screenNavigator4 = ((AddAliasPresenter) obj2).navigator;
                InitiateSessionFailedViewEvent initiateSessionFailedViewEvent = (InitiateSessionFailedViewEvent) obj;
                if (Intrinsics.areEqual(initiateSessionFailedViewEvent, InitiateSessionFailedViewEvent.Close.INSTANCE)) {
                    screenNavigator4.goTo(new Finish(InitiateSessionFailedScreen$Result$Close.INSTANCE));
                } else {
                    if (!Intrinsics.areEqual(initiateSessionFailedViewEvent, InitiateSessionFailedViewEvent.Retry.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator4.goTo(new Finish(InitiateSessionFailedScreen$Result$Retry.INSTANCE));
                }
                return Unit.INSTANCE;
            case 20:
                BetterNavigator.ScreenNavigator screenNavigator5 = ((AddAliasPresenter) obj2).navigator;
                ScenarioPlanErrorViewEvent scenarioPlanErrorViewEvent = (ScenarioPlanErrorViewEvent) obj;
                if (Intrinsics.areEqual(scenarioPlanErrorViewEvent, ScenarioPlanErrorViewEvent.Close.INSTANCE)) {
                    screenNavigator5.goTo(new Finish(ScenarioPlanErrorScreen$Result$Close.INSTANCE));
                } else {
                    if (!Intrinsics.areEqual(scenarioPlanErrorViewEvent, ScenarioPlanErrorViewEvent.Retry.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator5.goTo(new Finish(ScenarioPlanErrorScreen$Result$Retry.INSTANCE));
                }
                return Unit.INSTANCE;
            case 21:
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
                if (!Intrinsics.areEqual((InstrumentSelectionLoadingViewEvent$CloseClick) obj, InstrumentSelectionLoadingViewEvent$CloseClick.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                screenNavigator6.goTo(back);
                screenNavigator6.goTo(((InstrumentSelectionLoadingScreen) disclosurePresenter.args).blockersData.exitScreen);
                return Unit.INSTANCE;
            case 22:
                SelectPaymentInstrumentViewEvent$SelectPaymentInstrument selectPaymentInstrumentViewEvent$SelectPaymentInstrument = (SelectPaymentInstrumentViewEvent$SelectPaymentInstrument) obj;
                if (!(selectPaymentInstrumentViewEvent$SelectPaymentInstrument instanceof SelectPaymentInstrumentViewEvent$SelectPaymentInstrument)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj2;
                SelectPaymentInstrumentViewModel.PaymentInstrument paymentInstrument = selectPaymentInstrumentViewEvent$SelectPaymentInstrument.paymentInstrument;
                boolean z2 = paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument;
                if (z2) {
                    z = ((SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument) paymentInstrument).enabled;
                } else if (paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) {
                    z = ((SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) paymentInstrument).enabled;
                } else {
                    if (!(paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    z = true;
                }
                if (z) {
                    RecipientPaymentInfo recipientPaymentInfo = (RecipientPaymentInfo) CollectionsKt.singleOrNull(((SelectPaymentInstrumentArgs) localCashBalancePresenter.clock).getRecipients());
                    boolean z3 = recipientPaymentInfo != null && recipientPaymentInfo.isBusinessCustomer;
                    if (paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) {
                        SelectPaymentInstrumentResult.Status status = SelectPaymentInstrumentResult.Status.SUCCESS;
                        CashInstrumentType cashInstrumentType = CashInstrumentType.CASH_BALANCE;
                        SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance existingCashBalance = (SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) paymentInstrument;
                        BalanceSnapshot balanceSnapshot = existingCashBalance.balance;
                        String str5 = balanceSnapshot.token;
                        Money money = existingCashBalance.acceptedAmount;
                        if (money == null) {
                            CurrencyCode currencyCode = balanceSnapshot.balance.currency_code;
                            r7 = currencyCode != null ? Moneys.zero(currencyCode) : null;
                            if (r7 == null) {
                                money = Moneys.zero(CurrencyCode.USD);
                            } else {
                                r15 = r7;
                                selectPaymentInstrumentResult = new SelectPaymentInstrumentResult(status, cashInstrumentType, null, null, str5, null, r15, z3, 32);
                            }
                        }
                        r15 = money;
                        selectPaymentInstrumentResult = new SelectPaymentInstrumentResult(status, cashInstrumentType, null, null, str5, null, r15, z3, 32);
                    } else if (z2) {
                        SelectPaymentInstrumentResult.Status status2 = SelectPaymentInstrumentResult.Status.SUCCESS;
                        SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument existingInstrument = (SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument) paymentInstrument;
                        Instrument instrument = existingInstrument.instrument;
                        CashInstrumentType cashInstrumentType2 = instrument.cashInstrumentType;
                        String str6 = instrument.token;
                        InstrumentType instrumentType = instrument.cardBrand;
                        String str7 = instrument.suffix;
                        Money money2 = existingInstrument.acceptedAmount;
                        if (money2 == null) {
                            money2 = Moneys.zero(CurrencyCode.USD);
                        }
                        selectPaymentInstrumentResult = new SelectPaymentInstrumentResult(status2, cashInstrumentType2, instrumentType, str7, str6, null, money2, z3, 32);
                    } else {
                        if (!(paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        selectPaymentInstrumentResult = new SelectPaymentInstrumentResult(SelectPaymentInstrumentResult.Status.LINK_CARD, null, null, null, null, ((SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument) paymentInstrument).f1148type, null, z3, 94);
                    }
                    ((BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator).goTo(new Finish(selectPaymentInstrumentResult));
                }
                return Unit.INSTANCE;
            case 23:
                if (!Intrinsics.areEqual((StocksAppletTileEvent$StocksAppletOnClickTile) obj, StocksAppletTileEvent$StocksAppletOnClickTile.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj2;
                ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) localHomePresenter.clearMarketingBadgesIfNeeded)).submitSelectItemEvent(ItemId.STOCKS.INSTANCE, null, MoneySelectAction.TAP);
                InvestingState investingState = (InvestingState) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
                if (investingState instanceof InvestingState.Content) {
                    if (ComparingOperation.DefaultImpls.getNeedsApprovalToAccessInvestingFeatures((InvestingState.Content) investingState)) {
                        screen = new InvestingScreens.DependentWelcomeScreen(false);
                    } else {
                        AppNavigateOpenSpace.SourceTab sourceTab = AppNavigateOpenSpace.SourceTab.BANKING;
                        AppNavigateOpenSpace.Source source = AppNavigateOpenSpace.Source.TOP_NAV_BAR_BUTTON;
                        screen = new InvestingScreens.InvestingHome(null, null, 57, false);
                    }
                }
                if (screen != null) {
                    ((Navigator) localHomePresenter.localHomeGeoPresenterFactory).goTo(screen);
                }
                return Unit.INSTANCE;
            case 24:
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                gpsConfigQueries.transactionWithWrapper(new GLSceneScope$$ExternalSyntheticLambda10(17, (Map) obj, gpsConfigQueries));
                return Unit.INSTANCE;
            case 25:
                DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) disclosurePresenter2.navigator;
                DependentWelcomeViewEvent dependentWelcomeViewEvent = (DependentWelcomeViewEvent) obj;
                if (Intrinsics.areEqual(dependentWelcomeViewEvent, DependentWelcomeViewEvent.CtaClicked.INSTANCE)) {
                    screenNavigator7.goTo(FlowStarter.startPlasmaFlow$default((FlowStarter) disclosurePresenter2.analytics, Flow$Type.INVEST_TEEN_REQUEST_AUTHORIZATION, new InvestingScreens.DependentWelcomeScreen(true), null, null, 12));
                } else {
                    if (!Intrinsics.areEqual(dependentWelcomeViewEvent, DependentWelcomeViewEvent.Close.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator7.goTo(back);
                }
                return Unit.INSTANCE;
            case 26:
                if (Intrinsics.areEqual((InvestingExplanatoryViewEvent$Close) obj, InvestingExplanatoryViewEvent$Close.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 27:
                ((ProfilePresenter) obj2).navigator.goTo(InvestingTabPopupAppMessage.INSTANCE);
                return Unit.INSTANCE;
            case 28:
                ((StateFlowImpl) ((MutableStateFlow) obj2)).setValue((PolledData) obj);
                Unit unit = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit;
            default:
                if (Intrinsics.areEqual((PerformanceViewEvent$NavigationClick) obj, PerformanceViewEvent$NavigationClick.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) ((PoolsListPresenter) obj2).navigator).goTo(back);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public /* synthetic */ InvestingHomeView$2$1(CoroutineScope coroutineScope, Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(IssuedCardFactory.IssuedCard issuedCard, Continuation continuation) {
        GooglePayActivationPresenter$models$1$1$1$emit$1 googlePayActivationPresenter$models$1$1$1$emit$1;
        int i;
        ApiResult apiResult;
        Screen next;
        LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.this$0;
        BlockersScreens.GooglePayActivationScreen googlePayActivationScreen = (BlockersScreens.GooglePayActivationScreen) localEditorialPresenter.responseContextHandler;
        if (continuation instanceof GooglePayActivationPresenter$models$1$1$1$emit$1) {
            googlePayActivationPresenter$models$1$1$1$emit$1 = (GooglePayActivationPresenter$models$1$1$1$emit$1) continuation;
            int i2 = googlePayActivationPresenter$models$1$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                googlePayActivationPresenter$models$1$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = googlePayActivationPresenter$models$1$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayActivationPresenter$models$1$1$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ByteString.Companion companion = ByteString.Companion;
                    ByteString decodeBase64 = ByteString.Companion.decodeBase64(googlePayActivationScreen.activationData);
                    decodeBase64.getClass();
                    Object fromJson = ((Moshi) localEditorialPresenter.installedStore).adapter(GooglePayActivationPresenter$VisaExtras.class, Util.NO_ANNOTATIONS, null).fromJson(decodeBase64.utf8());
                    fromJson.getClass();
                    GooglePayActivationPresenter$VisaExtras googlePayActivationPresenter$VisaExtras = (GooglePayActivationPresenter$VisaExtras) fromJson;
                    GooglePayService googlePayService = (GooglePayService) localEditorialPresenter.launcher;
                    ClientScenario clientScenario = googlePayActivationScreen.blockersData.clientScenario;
                    clientScenario.getClass();
                    String str = googlePayActivationScreen.blockersData.flowToken;
                    RequestContext requestContext = googlePayActivationScreen.blockersData.requestContext;
                    String str2 = googlePayActivationPresenter$VisaExtras.panReferenceID;
                    String str3 = googlePayActivationPresenter$VisaExtras.tokenReferenceID;
                    String str4 = issuedCard.token;
                    ByteString byteString = ByteString.EMPTY;
                    ActivateDigitalWalletRequest activateDigitalWalletRequest = new ActivateDigitalWalletRequest(requestContext, null, null, CollectionsKt__CollectionsJVMKt.listOf(new ActivateDigitalWalletRequest.DigitalWalletCardData(str2, null, str3, null, str4, byteString)), byteString);
                    googlePayActivationPresenter$models$1$1$1$emit$1.label = 1;
                    obj = googlePayService.activateDigitalWallet(clientScenario, str, activateDigitalWalletRequest, googlePayActivationPresenter$models$1$1$1$emit$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    ((BlockerFlowListener) localEditorialPresenter.stringManager).onFlowCancelled(googlePayActivationScreen.blockersData);
                    next = googlePayActivationScreen.blockersData.exitScreen;
                } else if (apiResult instanceof ApiResult.Success) {
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) localEditorialPresenter.service;
                    BlockersData blockersData = googlePayActivationScreen.blockersData;
                    ResponseContext responseContext = ((ActivateDigitalWalletResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    next = blockersDataNavigator.getNext(googlePayActivationScreen, blockersData.updateFromResponseContext(responseContext, false));
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(next);
                return Unit.INSTANCE;
            }
        }
        googlePayActivationPresenter$models$1$1$1$emit$1 = new GooglePayActivationPresenter$models$1$1$1$emit$1(this, continuation);
        Object obj2 = googlePayActivationPresenter$models$1$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayActivationPresenter$models$1$1$1$emit$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(next);
        return Unit.INSTANCE;
    }
}
