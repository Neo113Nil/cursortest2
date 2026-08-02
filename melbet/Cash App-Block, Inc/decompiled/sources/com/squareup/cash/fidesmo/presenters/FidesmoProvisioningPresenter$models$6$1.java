package com.squareup.cash.fidesmo.presenters;

import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionAssignedNfcIndicatorLocation;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class FidesmoProvisioningPresenter$models$6$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ResolvedStarPlacement $resolvedStarPlacement;
    public final /* synthetic */ ScanningStarPlacement $scanningStarPlacement;
    public final /* synthetic */ FidesmoProvisioningPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoProvisioningPresenter$models$6$1(FidesmoProvisioningPresenter fidesmoProvisioningPresenter, ScanningStarPlacement scanningStarPlacement, ResolvedStarPlacement resolvedStarPlacement, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fidesmoProvisioningPresenter;
        this.$scanningStarPlacement = scanningStarPlacement;
        this.$resolvedStarPlacement = resolvedStarPlacement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ResolvedStarPlacement resolvedStarPlacement = this.$resolvedStarPlacement;
        FidesmoProvisioningPresenter fidesmoProvisioningPresenter = this.this$0;
        ScanningStarPlacement scanningStarPlacement = this.$scanningStarPlacement;
        switch (i) {
            case 0:
                return new FidesmoProvisioningPresenter$models$6$1(fidesmoProvisioningPresenter, scanningStarPlacement, resolvedStarPlacement, continuation);
            default:
                return new FidesmoProvisioningPresenter$models$6$1(scanningStarPlacement, fidesmoProvisioningPresenter, resolvedStarPlacement, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FidesmoProvisioningPresenter$models$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ResolvedStarPlacement resolvedStarPlacement = this.$resolvedStarPlacement;
        FidesmoProvisioningPresenter fidesmoProvisioningPresenter = this.this$0;
        ScanningStarPlacement scanningStarPlacement = this.$scanningStarPlacement;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                fidesmoProvisioningPresenter.observabilityManager.logEvent("fidesmo_provisioning_nfc_indicator_placement", MapsKt__MapsKt.mapOf(new Pair("nfc_indicator_placement", scanningStarPlacement.getAnalyticsLabel()), new Pair("placement_source", resolvedStarPlacement.source.analyticsLabel)));
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ScanningStarPlacement.Position position = scanningStarPlacement instanceof ScanningStarPlacement.Position ? (ScanningStarPlacement.Position) scanningStarPlacement : null;
                FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = fidesmoProvisioningPresenter.flowContext;
                String analyticsLabel = scanningStarPlacement.getAnalyticsLabel();
                String str = resolvedStarPlacement.source.analyticsLabel;
                Float f = position != null ? new Float(position.xFraction) : null;
                Float f2 = position != null ? new Float(position.yFraction) : null;
                if (fidesmoProvisioningFlowContext.flowType == FidesmoFlowType.PROVISION && !fidesmoProvisioningFlowContext.assignedLocationLogged) {
                    fidesmoProvisioningFlowContext.assignedLocationLogged = true;
                    fidesmoProvisioningFlowContext.analytics.track(new CashTagProvisioningProvisionAssignedNfcIndicatorLocation(fidesmoProvisioningFlowContext.flowToken, analyticsLabel, str, f != null ? Double.valueOf(f.floatValue()) : null, f2 != null ? Double.valueOf(f2.floatValue()) : null, fidesmoProvisioningFlowContext.getJourneyToken()), null);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoProvisioningPresenter$models$6$1(ScanningStarPlacement scanningStarPlacement, FidesmoProvisioningPresenter fidesmoProvisioningPresenter, ResolvedStarPlacement resolvedStarPlacement, Continuation continuation) {
        super(2, continuation);
        this.$scanningStarPlacement = scanningStarPlacement;
        this.this$0 = fidesmoProvisioningPresenter;
        this.$resolvedStarPlacement = resolvedStarPlacement;
    }
}
