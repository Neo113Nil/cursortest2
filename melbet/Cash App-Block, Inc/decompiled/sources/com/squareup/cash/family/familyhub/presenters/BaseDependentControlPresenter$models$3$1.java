package com.squareup.cash.family.familyhub.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.formview.components.FormCashtag;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class BaseDependentControlPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ BaseDependentControlPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseDependentControlPresenter$models$3$1(BaseDependentControlPresenter baseDependentControlPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = baseDependentControlPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        BaseDependentControlPresenter baseDependentControlPresenter = this.this$0;
        switch (i) {
            case 0:
                return new BaseDependentControlPresenter$models$3$1(baseDependentControlPresenter, continuation, 0);
            case 1:
                return new BaseDependentControlPresenter$models$3$1(baseDependentControlPresenter, continuation, 1);
            case 2:
                return new BaseDependentControlPresenter$models$3$1(baseDependentControlPresenter, continuation, 2);
            case 3:
                return new BaseDependentControlPresenter$models$3$1(baseDependentControlPresenter, continuation, 3);
            default:
                return new BaseDependentControlPresenter$models$3$1(baseDependentControlPresenter, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BaseDependentControlPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object dependentControlStatus;
        Object dependentControlStatus2;
        int i = this.$r8$classId;
        BaseDependentControlPresenter baseDependentControlPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDependentControlStatusManager controlStatusManager = baseDependentControlPresenter.getControlStatusManager();
                    this.label = 1;
                    dependentControlStatus = controlStatusManager.getDependentControlStatus(false, this);
                    if (dependentControlStatus == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (baseDependentControlPresenter.handleConfirmDisabling(this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (baseDependentControlPresenter.handleCancelDisabling() == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDependentControlStatusManager controlStatusManager2 = baseDependentControlPresenter.getControlStatusManager();
                    this.label = 1;
                    dependentControlStatus2 = controlStatusManager2.getDependentControlStatus(false, this);
                    if (dependentControlStatus2 == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 != 0) {
                    if (i6 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SharedFlowImpl sharedFlowImpl = baseDependentControlPresenter.getControlStatusManager().dependentControlStatus;
                FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass4 = new FormCashtag.AnonymousClass8.AnonymousClass4(baseDependentControlPresenter, 14);
                this.label = 1;
                sharedFlowImpl.collect(anonymousClass4, this);
                return coroutineSingletons5;
        }
    }
}
