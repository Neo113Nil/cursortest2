package app.cash.passcode.backend;

import androidx.compose.runtime.Recomposer$join$2;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.lifecycle.Lifecycle;
import androidx.tracing.Trace;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.molecule.GatedFrameClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.attribution.deeplink.DeepLinkCompletableNavigator;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.braze.BrazeManager;
import com.squareup.cash.braze.BrazeSetupTeardownActivityWorker;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.featureflags.AmplitudeExperiments$BrazeSdkSetup;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AppLockMonitor$setup$$inlined$setupSingleCoroutine$default$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Lifecycle $lifecycle$inlined;
    public final /* synthetic */ int $r8$classId;
    public int I$0;
    public /* synthetic */ Object L$0;
    public CoroutineScope L$2;
    public int label;
    public final /* synthetic */ IoActivitySetupTeardown this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppLockMonitor$setup$$inlined$setupSingleCoroutine$default$1(int i, Lifecycle lifecycle, IoActivitySetupTeardown ioActivitySetupTeardown, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = ioActivitySetupTeardown;
        this.$lifecycle$inlined = lifecycle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Lifecycle lifecycle = this.$lifecycle$inlined;
        IoActivitySetupTeardown ioActivitySetupTeardown = this.this$0;
        switch (i) {
            case 0:
                AppLockMonitor$setup$$inlined$setupSingleCoroutine$default$1 appLockMonitor$setup$$inlined$setupSingleCoroutine$default$1 = new AppLockMonitor$setup$$inlined$setupSingleCoroutine$default$1(0, lifecycle, (AppLockMonitor) ioActivitySetupTeardown, continuation);
                appLockMonitor$setup$$inlined$setupSingleCoroutine$default$1.L$0 = obj;
                return appLockMonitor$setup$$inlined$setupSingleCoroutine$default$1;
            default:
                AppLockMonitor$setup$$inlined$setupSingleCoroutine$default$1 appLockMonitor$setup$$inlined$setupSingleCoroutine$default$12 = new AppLockMonitor$setup$$inlined$setupSingleCoroutine$default$1(1, lifecycle, (BrazeSetupTeardownActivityWorker) ioActivitySetupTeardown, continuation);
                appLockMonitor$setup$$inlined$setupSingleCoroutine$default$12.L$0 = obj;
                return appLockMonitor$setup$$inlined$setupSingleCoroutine$default$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AppLockMonitor$setup$$inlined$setupSingleCoroutine$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c8, code lost:
    
        if (androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(r1, r15, r2, r14) == r9) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (java.lang.Boolean.valueOf(r3) != r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r15, r3, r14) == r9) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:
    
        if (((com.squareup.cash.attribution.deeplink.DeepLinkCompletableNavigatorKt$DeepLinkCompletableNavigator$1) r15).$$delegate_0.join(r14) == r9) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        int i;
        boolean configure;
        int i2 = this.$r8$classId;
        Lifecycle lifecycle = this.$lifecycle$inlined;
        int i3 = 0;
        IoActivitySetupTeardown ioActivitySetupTeardown = this.this$0;
        int i4 = 3;
        int i5 = 2;
        Continuation continuation = null;
        switch (i2) {
            case 0:
                AppLockMonitor appLockMonitor = (AppLockMonitor) ioActivitySetupTeardown;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DeepLinkCompletableNavigator deepLinkCompletableNavigator = appLockMonitor.deepLinkCompletableNavigator;
                    this.L$0 = null;
                    this.L$2 = coroutineScope2;
                    this.I$0 = 0;
                    this.label = 1;
                    break;
                } else if (i6 == 1) {
                    i3 = this.I$0;
                    coroutineScope2 = this.L$2;
                    SafeTrace.throwOnFailure(obj);
                } else if (i6 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new GatedFrameClock.AnonymousClass1(new FinishSetupTileBadgeCounter(i4, FlowKt.flowOn(FlowKt.channelFlow(new AppLockMonitor$asFlowEvent$1(lifecycle, null)), appLockMonitor.mainDispatcher), appLockMonitor), appLockMonitor, null, 21), 1);
                this.L$0 = null;
                this.L$2 = null;
                this.I$0 = i3;
                this.label = 2;
                AppLockMonitor.access$appLockLoop(appLockMonitor, this);
                break;
            default:
                BrazeSetupTeardownActivityWorker brazeSetupTeardownActivityWorker = (BrazeSetupTeardownActivityWorker) ioActivitySetupTeardown;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                int i8 = 12;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow onboardedAccountStatus = brazeSetupTeardownActivityWorker.sessionManager.getOnboardedAccountStatus();
                    Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(i5, continuation, i5);
                    this.L$0 = null;
                    this.L$2 = coroutineScope3;
                    this.I$0 = 0;
                    this.label = 1;
                    break;
                } else if (i7 == 1) {
                    i3 = this.I$0;
                    coroutineScope3 = this.L$2;
                    SafeTrace.throwOnFailure(obj);
                } else if (i7 == 2) {
                    i = this.I$0;
                    coroutineScope = this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    BrazeManager brazeManager = brazeSetupTeardownActivityWorker.brazeManager;
                    this.L$0 = null;
                    this.L$2 = coroutineScope;
                    this.I$0 = i;
                    this.label = 3;
                    RealBrazeManager realBrazeManager = (RealBrazeManager) brazeManager;
                    configure = ((RealBrazeConfigurator) realBrazeManager.brazeConfigurator).configure();
                    if (configure) {
                    }
                    break;
                } else if (i7 == 3) {
                    i = this.I$0;
                    coroutineScope = this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default(coroutineScope, null, null, new CardModelView.AnonymousClass1.C00581(brazeSetupTeardownActivityWorker, continuation, 15), 3);
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    PlaidLinkView.AnonymousClass2 anonymousClass2 = new PlaidLinkView.AnonymousClass2(brazeSetupTeardownActivityWorker, continuation, i8);
                    this.L$0 = null;
                    this.L$2 = null;
                    this.I$0 = i;
                    this.label = 4;
                    break;
                } else if (i7 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                DerivedStateFlow valuesStateExperiment = Trace.valuesStateExperiment(brazeSetupTeardownActivityWorker.featureFlagManager, AmplitudeExperiments$BrazeSdkSetup.INSTANCE);
                DataStoreImpl$data$1.AnonymousClass2 anonymousClass22 = new DataStoreImpl$data$1.AnonymousClass2(i8);
                this.L$0 = null;
                this.L$2 = coroutineScope3;
                this.I$0 = i3;
                this.label = 2;
                if (FlowKt.first(valuesStateExperiment, anonymousClass22, this) != coroutineSingletons2) {
                    int i9 = i3;
                    coroutineScope = coroutineScope3;
                    i = i9;
                    BrazeManager brazeManager2 = brazeSetupTeardownActivityWorker.brazeManager;
                    this.L$0 = null;
                    this.L$2 = coroutineScope;
                    this.I$0 = i;
                    this.label = 3;
                    RealBrazeManager realBrazeManager2 = (RealBrazeManager) brazeManager2;
                    configure = ((RealBrazeConfigurator) realBrazeManager2.brazeConfigurator).configure();
                    if (configure) {
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
