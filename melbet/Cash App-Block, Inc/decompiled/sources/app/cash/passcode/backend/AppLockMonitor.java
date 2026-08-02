package app.cash.passcode.backend;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.lifecycle.Lifecycle;
import androidx.tracing.Trace;
import app.cash.cdp.integration.CashCdpConfigProvider$1$2;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.attribution.deeplink.DeepLinkCompletableNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AppScreenLock;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.money.applets.sections.RealAppletTileServerRecommendationProvider;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.ui.MainActivity$navigatorSwitcher$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.discover.api.app.v2.service.AppletsService;
import com.squareup.protos.cash.marketdata.MarketDataService;
import com.squareup.protos.franklin.investing.InvestingService;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AppLockMonitor implements IoActivitySetupTeardown {
    public final RealAppLockState appLockState;
    public final AndroidClock clock;
    public final Flow customerToggleEvents;
    public final DeepLinkCompletableNavigator deepLinkCompletableNavigator;
    public final Flow featureFlagEvents;
    public final CoroutineContext mainDispatcher;
    public final MainActivity$navigatorSwitcher$1 navigatorSwitcher;
    public final RealPasscodeFlowStarter passcodeFlowStarter;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AppLockMonitor(MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$1, RealPasscodeFlowStarter realPasscodeFlowStarter, RealAppLockState realAppLockState, DeepLinkCompletableNavigator deepLinkCompletableNavigator, AndroidClock androidClock, FeatureFlagManager featureFlagManager, StateFlow stateFlow, CoroutineContext coroutineContext) {
        this.navigatorSwitcher = mainActivity$navigatorSwitcher$1;
        this.passcodeFlowStarter = realPasscodeFlowStarter;
        this.appLockState = realAppLockState;
        this.deepLinkCompletableNavigator = deepLinkCompletableNavigator;
        this.clock = androidClock;
        this.mainDispatcher = coroutineContext;
        this.featureFlagEvents = FlowKt.distinctUntilChanged(new AppLockMonitor$special$$inlined$map$1(Trace.valuesState(featureFlagManager, LaunchDarklyFeatureFlags$AppScreenLock.INSTANCE), 0));
        this.customerToggleEvents = FlowKt.distinctUntilChanged(new AppLockMonitor$special$$inlined$map$2(stateFlow, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$appLockLoop(AppLockMonitor appLockMonitor, ContinuationImpl continuationImpl) {
        AppLockMonitor$appLockLoop$1 appLockMonitor$appLockLoop$1;
        int i;
        if (continuationImpl instanceof AppLockMonitor$appLockLoop$1) {
            appLockMonitor$appLockLoop$1 = (AppLockMonitor$appLockLoop$1) continuationImpl;
            int i2 = appLockMonitor$appLockLoop$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                appLockMonitor$appLockLoop$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = appLockMonitor$appLockLoop$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appLockMonitor$appLockLoop$1.label;
                if (i == 0) {
                    if (i == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    StateFlowImpl stateFlowImpl = appLockMonitor.appLockState.stateFlow;
                    CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$2 = new CashCdpConfigProvider$1$2(7, ref$BooleanRef, appLockMonitor);
                    appLockMonitor$appLockLoop$1.label = 1;
                    stateFlowImpl.collect(cashCdpConfigProvider$1$2, appLockMonitor$appLockLoop$1);
                    return;
                }
            }
        }
        appLockMonitor$appLockLoop$1 = new AppLockMonitor$appLockLoop$1(appLockMonitor, continuationImpl);
        Object obj2 = appLockMonitor$appLockLoop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appLockMonitor$appLockLoop$1.label;
        if (i == 0) {
        }
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Lifecycle lifecycle = (Lifecycle) obj;
        coroutineScope.getClass();
        lifecycle.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new AppLockMonitor$setup$$inlined$setupSingleCoroutine$default$1(0, lifecycle, this, null), 1);
        return StateFlowKt.noOpTeardown;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 1;
        public final Provider appLockState;
        public final Provider clock;
        public final Provider deepLinkCompletableNavigator;
        public final Provider featureFlagManager;
        public final Provider mainDispatcher;
        public final InstanceFactory navigatorSwitcher;
        public final Provider passcodeFlowStarter;
        public final Provider passcodeSettings;

        public MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, InstanceFactory instanceFactory) {
            this.passcodeFlowStarter = doubleCheck;
            this.appLockState = doubleCheck2;
            this.deepLinkCompletableNavigator = doubleCheck3;
            this.clock = lambdaProvider;
            this.featureFlagManager = doubleCheck4;
            this.passcodeSettings = doubleCheck5;
            this.mainDispatcher = lambdaProvider2;
            this.navigatorSwitcher = instanceFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.mainDispatcher;
            InstanceFactory instanceFactory = this.navigatorSwitcher;
            Provider provider2 = this.passcodeSettings;
            Provider provider3 = this.featureFlagManager;
            Provider provider4 = this.clock;
            Provider provider5 = this.deepLinkCompletableNavigator;
            Provider provider6 = this.appLockState;
            Provider provider7 = this.passcodeFlowStarter;
            switch (i) {
                case 0:
                    MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$1 = (MainActivity$navigatorSwitcher$1) instanceFactory.value;
                    RealPasscodeFlowStarter realPasscodeFlowStarter = (RealPasscodeFlowStarter) provider7.invoke();
                    RealAppLockState realAppLockState = (RealAppLockState) provider6.invoke();
                    DeepLinkCompletableNavigator deepLinkCompletableNavigator = (DeepLinkCompletableNavigator) provider5.invoke();
                    AndroidClock androidClock = (AndroidClock) provider4.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider3.invoke();
                    StateFlow stateFlow = (StateFlow) provider2.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    mainActivity$navigatorSwitcher$1.getClass();
                    realPasscodeFlowStarter.getClass();
                    realAppLockState.getClass();
                    deepLinkCompletableNavigator.getClass();
                    androidClock.getClass();
                    featureFlagManager.getClass();
                    stateFlow.getClass();
                    coroutineContext.getClass();
                    return new AppLockMonitor(mainActivity$navigatorSwitcher$1, realPasscodeFlowStarter, realAppLockState, deepLinkCompletableNavigator, androidClock, featureFlagManager, stateFlow, coroutineContext);
                case 1:
                    MarketDataService marketDataService = (MarketDataService) provider7.invoke();
                    InvestingService investingService = (InvestingService) provider6.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider5.invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider4.invoke();
                    Map map = (Map) provider3.invoke();
                    Signal signal = (Signal) provider2.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    marketDataService.getClass();
                    investingService.getClass();
                    cashAccountDatabaseImpl.getClass();
                    androidClock2.getClass();
                    map.getClass();
                    signal.getClass();
                    coroutineContext2.getClass();
                    coroutineScope.getClass();
                    return new RealInvestingSyncer(marketDataService, investingService, cashAccountDatabaseImpl, androidClock2, map, signal, coroutineContext2, coroutineScope);
                default:
                    SessionManager sessionManager = (SessionManager) provider7.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider6.invoke();
                    AppletsService appletsService = (AppletsService) provider5.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider4.invoke();
                    RealPromotedAppletTileStore realPromotedAppletTileStore = (RealPromotedAppletTileStore) provider3.invoke();
                    AndroidClock androidClock3 = (AndroidClock) provider2.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    sessionManager.getClass();
                    featureFlagManager2.getClass();
                    appletsService.getClass();
                    errorReporter.getClass();
                    realPromotedAppletTileStore.getClass();
                    androidClock3.getClass();
                    coroutineScope2.getClass();
                    coroutineContext3.getClass();
                    return new RealAppletTileServerRecommendationProvider(sessionManager, featureFlagManager2, appletsService, errorReporter, realPromotedAppletTileStore, androidClock3, coroutineScope2, coroutineContext3);
            }
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, RetroUiFactory.MetroFactory metroFactory, LambdaProvider lambdaProvider3, InstanceFactory instanceFactory, LambdaProvider lambdaProvider4) {
            this.passcodeFlowStarter = lambdaProvider;
            this.appLockState = doubleCheck;
            this.deepLinkCompletableNavigator = doubleCheck2;
            this.clock = lambdaProvider2;
            this.featureFlagManager = metroFactory;
            this.passcodeSettings = lambdaProvider3;
            this.navigatorSwitcher = instanceFactory;
            this.mainDispatcher = lambdaProvider4;
        }

        public MetroFactory(InstanceFactory instanceFactory, Provider provider, DoubleCheck doubleCheck, Provider provider2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, Provider provider3, LambdaProvider lambdaProvider2) {
            this.navigatorSwitcher = instanceFactory;
            this.passcodeFlowStarter = provider;
            this.appLockState = doubleCheck;
            this.deepLinkCompletableNavigator = provider2;
            this.clock = lambdaProvider;
            this.featureFlagManager = doubleCheck2;
            this.passcodeSettings = provider3;
            this.mainDispatcher = lambdaProvider2;
        }
    }
}
