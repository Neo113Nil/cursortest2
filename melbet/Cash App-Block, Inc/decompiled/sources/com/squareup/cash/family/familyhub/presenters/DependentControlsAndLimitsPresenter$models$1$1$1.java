package com.squareup.cash.family.familyhub.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class DependentControlsAndLimitsPresenter$models$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealBitcoinAmountPickerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DependentControlsAndLimitsPresenter$models$1$1$1(RealBitcoinAmountPickerPresenter realBitcoinAmountPickerPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realBitcoinAmountPickerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealBitcoinAmountPickerPresenter realBitcoinAmountPickerPresenter = this.this$0;
        switch (i) {
            case 0:
                return new DependentControlsAndLimitsPresenter$models$1$1$1(realBitcoinAmountPickerPresenter, continuation, 0);
            case 1:
                return new DependentControlsAndLimitsPresenter$models$1$1$1(realBitcoinAmountPickerPresenter, continuation, 1);
            case 2:
                return new DependentControlsAndLimitsPresenter$models$1$1$1(realBitcoinAmountPickerPresenter, continuation, 2);
            case 3:
                return new DependentControlsAndLimitsPresenter$models$1$1$1(realBitcoinAmountPickerPresenter, continuation, 3);
            default:
                return new DependentControlsAndLimitsPresenter$models$1$1$1(realBitcoinAmountPickerPresenter, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((DependentControlsAndLimitsPresenter$models$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object dependentControlStatus;
        Object dependentControlStatus2;
        int i = this.$r8$classId;
        RealBitcoinAmountPickerPresenter realBitcoinAmountPickerPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDependentControlStatusManager realDependentControlStatusManager = (RealDependentControlStatusManager) ((Lazy) realBitcoinAmountPickerPresenter.keypadStateStore).getValue();
                    if (realDependentControlStatusManager != null) {
                        this.label = 1;
                        dependentControlStatus = realDependentControlStatusManager.getDependentControlStatus(false, this);
                        if (dependentControlStatus == coroutineSingletons) {
                            break;
                        }
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDependentControlStatusManager realDependentControlStatusManager2 = (RealDependentControlStatusManager) ((Lazy) realBitcoinAmountPickerPresenter.keypadEvents).getValue();
                    if (realDependentControlStatusManager2 != null) {
                        this.label = 1;
                        dependentControlStatus2 = realDependentControlStatusManager2.getDependentControlStatus(false, this);
                        if (dependentControlStatus2 == coroutineSingletons2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDependentControlStatusManager realDependentControlStatusManager3 = (RealDependentControlStatusManager) realBitcoinAmountPickerPresenter.moneyFormatter;
                    this.label = 1;
                    if (realDependentControlStatusManager3.getDependentControlStatus(false, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDependentControlStatusManager realDependentControlStatusManager4 = (RealDependentControlStatusManager) realBitcoinAmountPickerPresenter.purpose;
                    this.label = 1;
                    if (realDependentControlStatusManager4.getDependentControlStatus(false, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDependentControlStatusManager realDependentControlStatusManager5 = (RealDependentControlStatusManager) realBitcoinAmountPickerPresenter.initialMoneyFormatter;
                    this.label = 1;
                    if (realDependentControlStatusManager5.getDependentControlStatus(false, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
