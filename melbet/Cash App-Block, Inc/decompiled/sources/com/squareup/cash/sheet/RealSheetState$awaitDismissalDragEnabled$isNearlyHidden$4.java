package com.squareup.cash.sheet;

import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealSheetState$awaitDismissalDragEnabled$isNearlyHidden$4 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ float F$0;
    public /* synthetic */ float F$1;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealSheetState$awaitDismissalDragEnabled$isNearlyHidden$4(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.this$0;
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                RealSheetState$awaitDismissalDragEnabled$isNearlyHidden$4 realSheetState$awaitDismissalDragEnabled$isNearlyHidden$4 = new RealSheetState$awaitDismissalDragEnabled$isNearlyHidden$4((RealSheetState) obj4, continuation, 0);
                realSheetState$awaitDismissalDragEnabled$isNearlyHidden$4.F$0 = floatValue;
                realSheetState$awaitDismissalDragEnabled$isNearlyHidden$4.F$1 = floatValue2;
                return realSheetState$awaitDismissalDragEnabled$isNearlyHidden$4.invokeSuspend(Unit.INSTANCE);
            default:
                RealSheetState$awaitDismissalDragEnabled$isNearlyHidden$4 realSheetState$awaitDismissalDragEnabled$isNearlyHidden$42 = new RealSheetState$awaitDismissalDragEnabled$isNearlyHidden$4((CoreFlowRealSheetState) obj4, continuation, 1);
                realSheetState$awaitDismissalDragEnabled$isNearlyHidden$42.F$0 = floatValue;
                realSheetState$awaitDismissalDragEnabled$isNearlyHidden$42.F$1 = floatValue2;
                return realSheetState$awaitDismissalDragEnabled$isNearlyHidden$42.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                float f = this.F$0;
                float f2 = this.F$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealSheetState realSheetState = (RealSheetState) this.this$0;
                int i = RealSheetState.$r8$clinit;
                realSheetState.getClass();
                return Boolean.valueOf(Math.abs(f2 - f) <= 0.01f);
            default:
                float f3 = this.F$0;
                float f4 = this.F$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(Math.abs(f4 - f3) <= 0.01f);
        }
    }
}
