package com.squareup.cash.marketing.components;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class TooltipState$hide$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ TooltipState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TooltipState$hide$1(TooltipState tooltipState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = tooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        TooltipState tooltipState = this.this$0;
        switch (i) {
            case 0:
                return new TooltipState$hide$1(tooltipState, continuation, 0);
            default:
                return new TooltipState$hide$1(tooltipState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TooltipState$hide$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final TooltipState tooltipState = this.this$0;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float floatValue = tooltipState._alpha$delegate.getFloatValue();
                    TweenSpec tween$default = AnimatableKt.tween$default(0, 0, null, 7);
                    Function2 function2 = new Function2() { // from class: com.squareup.cash.marketing.components.TooltipState$hide$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i5 = i3;
                            TooltipState tooltipState2 = tooltipState;
                            float floatValue2 = ((Float) obj2).floatValue();
                            ((Float) obj3).getClass();
                            switch (i5) {
                                case 0:
                                    tooltipState2._alpha$delegate.setFloatValue(floatValue2);
                                    break;
                                default:
                                    tooltipState2._alpha$delegate.setFloatValue(floatValue2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (AnimatableKt.animate$default(floatValue, RecyclerView.DECELERATION_RATE, tween$default, function2, this, 4) == coroutineSingletons) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float floatValue2 = tooltipState._alpha$delegate.getFloatValue();
                    TweenSpec tween$default2 = AnimatableKt.tween$default(0, 0, null, 7);
                    Function2 function22 = new Function2() { // from class: com.squareup.cash.marketing.components.TooltipState$hide$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i52 = i2;
                            TooltipState tooltipState2 = tooltipState;
                            float floatValue22 = ((Float) obj2).floatValue();
                            ((Float) obj3).getClass();
                            switch (i52) {
                                case 0:
                                    tooltipState2._alpha$delegate.setFloatValue(floatValue22);
                                    break;
                                default:
                                    tooltipState2._alpha$delegate.setFloatValue(floatValue22);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (AnimatableKt.animate$default(floatValue2, 1.0f, tween$default2, function22, this, 4) == coroutineSingletons2) {
                        break;
                    }
                } else if (i5 != 1) {
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
