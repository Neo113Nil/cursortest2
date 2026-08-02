package com.squareup.cash.fidesmo.presenters;

import android.os.Build;
import androidx.compose.runtime.MutableState;
import com.squareup.cash.cdf.cashtagprovisioning.DeviceType;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.data.CashAppTagKt;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.stripe.android.uicore.elements.FormLabelKt;
import java.util.List;
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
public final class FidesmoDeprovisioningPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $cashAppTags$delegate;
    public final /* synthetic */ FidesmoDeprovisioningPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoDeprovisioningPresenter$models$1$1(FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fidesmoDeprovisioningPresenter;
        this.$cashAppTags$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FidesmoDeprovisioningPresenter$models$1$1(this.this$0, this.$cashAppTags$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FidesmoDeprovisioningPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter = this.this$0;
        fidesmoDeprovisioningPresenter.journeyStarted = false;
        fidesmoDeprovisioningPresenter.journeyEnded = false;
        fidesmoDeprovisioningPresenter.scanAttempts = 0;
        fidesmoDeprovisioningPresenter.observabilityManager.logEvent("fidesmo_provisioning_flow_started", MapsKt__MapsJVMKt.mapOf(new Pair("has_activate_config", Boolean.valueOf(fidesmoDeprovisioningPresenter.args.blocker.activate != null))));
        FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = fidesmoDeprovisioningPresenter.flowContext;
        FidesmoFlowType fidesmoFlowType = FidesmoFlowType.DEPROVISION;
        List list = (List) this.$cashAppTags$delegate.getValue();
        list.getClass();
        CashAppTag currentCashAppTagOrNull = CashAppTagKt.currentCashAppTagOrNull(list);
        TagFormFactor tagFormFactor = currentCashAppTagOrNull != null ? currentCashAppTagOrNull.formFactor : null;
        DeviceType cdfDeviceType = tagFormFactor != null ? FormLabelKt.toCdfDeviceType(tagFormFactor) : null;
        String str = Build.MODEL;
        fidesmoProvisioningFlowContext.logFlowStarted(fidesmoFlowType, cdfDeviceType, null);
        return Unit.INSTANCE;
    }
}
