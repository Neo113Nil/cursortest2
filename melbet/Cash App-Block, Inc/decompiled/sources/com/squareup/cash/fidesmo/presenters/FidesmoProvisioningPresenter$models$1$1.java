package com.squareup.cash.fidesmo.presenters;

import android.os.Build;
import androidx.compose.runtime.MutableState;
import com.squareup.cash.cdf.cashtagprovisioning.DeviceType;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.screens.FidesmoProvisioningScreen;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class FidesmoProvisioningPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $cashAppTags$delegate;
    public final /* synthetic */ FidesmoProvisioningPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoProvisioningPresenter$models$1$1(FidesmoProvisioningPresenter fidesmoProvisioningPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fidesmoProvisioningPresenter;
        this.$cashAppTags$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FidesmoProvisioningPresenter$models$1$1(this.this$0, this.$cashAppTags$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FidesmoProvisioningPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        FidesmoProvisioningPresenter fidesmoProvisioningPresenter = this.this$0;
        fidesmoProvisioningPresenter.journeyStarted = false;
        fidesmoProvisioningPresenter.journeyEnded = false;
        fidesmoProvisioningPresenter.scanAttempts = 0;
        RealObservabilityManager realObservabilityManager = fidesmoProvisioningPresenter.observabilityManager;
        FidesmoProvisioningScreen fidesmoProvisioningScreen = fidesmoProvisioningPresenter.args;
        realObservabilityManager.logEvent("fidesmo_provisioning_flow_started", MapsKt__MapsJVMKt.mapOf(new Pair("has_activate_config", Boolean.valueOf(fidesmoProvisioningScreen.blocker.activate != null))));
        FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = fidesmoProvisioningPresenter.flowContext;
        FidesmoFlowType fidesmoFlowType = fidesmoProvisioningScreen.flowType;
        DeviceType models$resolveFlowDeviceType = FidesmoProvisioningPresenter.models$resolveFlowDeviceType(fidesmoProvisioningPresenter, this.$cashAppTags$delegate);
        String str = Build.MODEL;
        FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig = fidesmoProvisioningScreen.blocker.pre_scan;
        fidesmoProvisioningFlowContext.logFlowStarted(fidesmoFlowType, models$resolveFlowDeviceType, preScanUiConfig != null ? preScanUiConfig.tag_theme_token : null);
        return Unit.INSTANCE;
    }
}
