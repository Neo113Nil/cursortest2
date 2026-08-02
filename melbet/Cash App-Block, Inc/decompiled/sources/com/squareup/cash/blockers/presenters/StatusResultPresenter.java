package com.squareup.cash.blockers.presenters;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.coroutines.Signal;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import net.idrnd.face.iad.capture.internal.o0;

/* loaded from: classes4.dex */
public final class StatusResultPresenter implements MoleculePresenter {
    public final Activity activity;
    public final Analytics analytics;
    public final AppConfigManager appConfigManager;
    public final BlockersScreens.StatusResultScreen args;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final BlockersDataNavigator blockersNavigator;
    public final RealClientScenarioCompleter clientScenarioCompleter;
    public final FeatureFlagManager featureFlagManager;
    public final FlowStarter flowStarter;
    public final CoroutineContext ioDispatcher;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final PromotionPanePresenter promotionPanePresenter;
    public final RealReferralManager referralManager;
    public final RealRouter router;
    public final SessionManager sessionManager;
    public final RealSupportNavigator supportNavigator;
    public final Lazy transfersInboundNavigator;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StatusResult.Action.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Trigger.Companion companion = StatusResult.Action.Companion;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Trigger.Companion companion2 = StatusResult.Action.Companion;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Trigger.Companion companion3 = StatusResult.Action.Companion;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClientScenario.values().length];
            try {
                iArr2[ClientScenario.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ClientScenario.ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ClientScenario.ONBOARDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ClientScenario.RETURNING_CUSTOMER_LOGIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ClientScenario.PAYMENT_FLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[StatusResultButton.ButtonAction.values().length];
            try {
                iArr3[4] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ClientDriven.Companion companion4 = StatusResultButton.ButtonAction.Companion;
                iArr3[3] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                ClientDriven.Companion companion5 = StatusResultButton.ButtonAction.Companion;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                ClientDriven.Companion companion6 = StatusResultButton.ButtonAction.Companion;
                iArr3[0] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                ClientDriven.Companion companion7 = StatusResultButton.ButtonAction.Companion;
                iArr3[5] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                ClientDriven.Companion companion8 = StatusResultButton.ButtonAction.Companion;
                iArr3[6] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                ClientDriven.Companion companion9 = StatusResultButton.ButtonAction.Companion;
                iArr3[7] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr4 = new int[StatusResult.Icon.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                KeyScope.Companion companion10 = StatusResult.Icon.Companion;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                KeyScope.Companion companion11 = StatusResult.Icon.Companion;
                iArr4[3] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                KeyScope.Companion companion12 = StatusResult.Icon.Companion;
                iArr4[2] = 4;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public StatusResultPresenter(BlockersDataNavigator blockersDataNavigator, FlowStarter flowStarter, RealClientScenarioCompleter realClientScenarioCompleter, Analytics analytics, IntentLauncher intentLauncher, AppConfigManager appConfigManager, RealBalanceSnapshotManager realBalanceSnapshotManager, CoroutineContext coroutineContext, Activity activity, RealSupportNavigator realSupportNavigator, RealReferralManager realReferralManager, SessionManager sessionManager, PromotionPanePresenter$Factory$Impl promotionPanePresenter$Factory$Impl, RealScheduledReloadUpsellPresenter$Factory$Impl realScheduledReloadUpsellPresenter$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.StatusResultScreen statusResultScreen, RealObservabilityManager realObservabilityManager, FeatureFlagManager featureFlagManager, RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl) {
        this.blockersNavigator = blockersDataNavigator;
        this.flowStarter = flowStarter;
        this.clientScenarioCompleter = realClientScenarioCompleter;
        this.analytics = analytics;
        this.launcher = intentLauncher;
        this.appConfigManager = appConfigManager;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.ioDispatcher = coroutineContext;
        this.activity = activity;
        this.supportNavigator = realSupportNavigator;
        this.referralManager = realReferralManager;
        this.sessionManager = sessionManager;
        this.navigator = screenNavigator;
        this.args = statusResultScreen;
        this.observabilityManager = realObservabilityManager;
        this.featureFlagManager = featureFlagManager;
        this.transfersInboundNavigator = realTransfersInboundNavigator$Factory$Impl.create$1(screenNavigator);
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        statusResultScreen.getBlockersData().getClass();
        CheckDepositAmountPresenter.MetroFactory metroFactory = realScheduledReloadUpsellPresenter$Factory$Impl.delegateFactory;
        AppService appService = (AppService) metroFactory.analytics.getValue();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) metroFactory.blockerFlowAnalytics.invoke();
        appService.getClass();
        realBlockersHelper$Factory$Impl.getClass();
        realBlockersHelper$Factory$Impl.create(screenNavigator);
        TabToolbarPresenter.MetroFactory metroFactory2 = promotionPanePresenter$Factory$Impl.delegateFactory;
        Analytics analytics2 = (Analytics) ((DoubleCheck) metroFactory2.featureFlagManager).getValue();
        RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) metroFactory2.sessionManager.invoke();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl2 = (RealBlockersHelper$Factory$Impl) metroFactory2.profileManager.invoke();
        AppService appService2 = (AppService) ((DoubleCheck) metroFactory2.bitcoinCapabilityProvider).getValue();
        RealIntentFactory realIntentFactory = (RealIntentFactory) ((DoubleCheck) metroFactory2.badgingStateAccessibilityHelper).getValue();
        DoubleCheck doubleCheck = (DoubleCheck) metroFactory2.moneybotFlagsHelper;
        Signal signal = (Signal) ((DoubleCheck) metroFactory2.moneybotAnalyticsService).getValue();
        TransferManager transferManager = (TransferManager) metroFactory2.badges.invoke();
        RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) metroFactory2.sessionFlags).invoke();
        o0 o0Var = (o0) ((RealDrawerOpener$MetroFactory) metroFactory2.syncValueReader).invoke();
        AndroidNotificationManager androidNotificationManager = (AndroidNotificationManager) ((LambdaProvider) metroFactory2.p2pSettingsManager).lambda.invoke();
        Context context = (Context) ((DoubleCheck) metroFactory2.familyNavigatorFactory).getValue();
        CoroutineContext coroutineContext2 = (CoroutineContext) ((LambdaProvider) metroFactory2.familyProfileManager).lambda.invoke();
        FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) ((DoubleCheck) metroFactory2.balanceSnapshotManager).getValue();
        RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) metroFactory2.badger2.invoke();
        CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) metroFactory2.tabToolbarOutboundNavigatorFactory).value;
        RealUuidGenerator realUuidGenerator = (RealUuidGenerator) ((LambdaProvider) metroFactory2.moneyFormatterFactory).lambda.invoke();
        analytics2.getClass();
        realRouter$Factory$Impl2.getClass();
        realBlockersHelper$Factory$Impl2.getClass();
        appService2.getClass();
        realIntentFactory.getClass();
        signal.getClass();
        transferManager.getClass();
        realProfileManager.getClass();
        androidNotificationManager.getClass();
        context.getClass();
        coroutineContext2.getClass();
        featureFlagManager2.getClass();
        realMoneyNavigatorHelper.getClass();
        coroutineScope.getClass();
        realUuidGenerator.getClass();
        this.promotionPanePresenter = new PromotionPanePresenter(analytics2, realRouter$Factory$Impl2, realBlockersHelper$Factory$Impl2, appService2, realIntentFactory, doubleCheck, signal, transferManager, realProfileManager, o0Var, androidNotificationManager, context, coroutineContext2, statusResultScreen, screenNavigator, featureFlagManager2, realMoneyNavigatorHelper, coroutineScope, realUuidGenerator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-340902275);
        Object rememberedValue = gapComposer.rememberedValue();
        BlockersScreens.StatusResultScreen statusResultScreen = this.args;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            StatusResult.Action action = statusResultScreen.getStatusResult().action;
            int i2 = action == null ? -1 : WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            rememberedValue = Updater.mutableStateOf$default((i2 == 1 || i2 == 2 || i2 == 3) ? StatusResultViewModel.Hidden.INSTANCE : StatusResultViewModel.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        String str5 = statusResultScreen.getBlockersData().blockerId;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        Pair pair = new Pair("blocker_id", str5);
        ClientScenario clientScenario = statusResultScreen.getBlockersData().clientScenario;
        if (clientScenario == null || (str = clientScenario.name()) == null) {
            str = "";
        }
        Pair pair2 = new Pair("client_scenario", str);
        StatusResult.Action action2 = statusResultScreen.getStatusResult().action;
        if (action2 == null || (str2 = action2.name()) == null) {
            str2 = "";
        }
        Pair pair3 = new Pair("action", str2);
        StatusResult.SupportAction supportAction = statusResultScreen.getStatusResult().support_action;
        if (supportAction == null || (str3 = supportAction.support_flow_node) == null) {
            str3 = "";
        }
        Pair pair4 = new Pair("node_token", str3);
        StatusResult.SupportAction supportAction2 = statusResultScreen.getStatusResult().support_action;
        if (supportAction2 != null && (str4 = supportAction2.entity_id) != null) {
            str6 = str4;
        }
        DragAndDrop_androidKt.AddViewAttributes(this.observabilityManager, MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, new Pair("entity_token", str6)), gapComposer, 0);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new CardModelView.AnonymousClass1.C00581(this, null, 9);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new InteractiveCardView$flingTo$1.AnonymousClass2(this, mutableState, continuation, 12);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Updater.LaunchedEffect(gapComposer, flow, new RealBoostSelector$removeBoost$1(flow, continuation, this, mutableState, 4));
        StatusResultViewModel statusResultViewModel = (StatusResultViewModel) mutableState.getValue();
        gapComposer.end(false);
        return statusResultViewModel;
    }
}
