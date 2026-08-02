package com.squareup.cash.card.onboarding.graphics;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeImageTransform;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.filament.SlerpAnimator;
import com.squareup.cash.filament.Vector4Animator;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.util.compose.ConstantSpeedMotionDurationScale;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardWobbleState$endWobbling$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ CardWobbleState this$0;

    /* renamed from: com.squareup.cash.card.onboarding.graphics.CardWobbleState$endWobbling$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ SpringSpec $cancelWobbleSpec;
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ CardWobbleState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(CardWobbleState cardWobbleState, SpringSpec springSpec, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = cardWobbleState;
            this.$cancelWobbleSpec = springSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            SpringSpec springSpec = this.$cancelWobbleSpec;
            CardWobbleState cardWobbleState = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(cardWobbleState, springSpec, continuation, 0);
                default:
                    return new AnonymousClass1(cardWobbleState, springSpec, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            CardWobbleState cardWobbleState = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SlerpAnimator slerpAnimator = new SlerpAnimator(cardWobbleState.wobbleRotation.getValue(), new Quat(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f));
                        Animatable Animatable = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                        Float f = new Float(1.0f);
                        BorrowHomeKt$$ExternalSyntheticLambda1 borrowHomeKt$$ExternalSyntheticLambda1 = new BorrowHomeKt$$ExternalSyntheticLambda1(21, slerpAnimator, cardWobbleState);
                        this.label = 1;
                        if (Animatable.animateTo$default(Animatable, f, this.$cancelWobbleSpec, null, borrowHomeKt$$ExternalSyntheticLambda1, this, 4) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Vector4[] vector4Arr = {cardWobbleState.wobbleTranslation.getValue(), new Vector4(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f)};
                        Vector4Animator vector4Animator = new Vector4Animator();
                        vector4Animator.setObjectValues(Arrays.copyOf(vector4Arr, 2));
                        vector4Animator.setEvaluator(new ChangeImageTransform.AnonymousClass1(vector4Animator));
                        Animatable Animatable2 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                        Float f2 = new Float(1.0f);
                        BorrowHomeKt$$ExternalSyntheticLambda1 borrowHomeKt$$ExternalSyntheticLambda12 = new BorrowHomeKt$$ExternalSyntheticLambda1(22, vector4Animator, cardWobbleState);
                        this.label = 1;
                        if (Animatable.animateTo$default(Animatable2, f2, this.$cancelWobbleSpec, null, borrowHomeKt$$ExternalSyntheticLambda12, this, 4) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardWobbleState$endWobbling$2(CardWobbleState cardWobbleState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardWobbleState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardWobbleState cardWobbleState = this.this$0;
        switch (i) {
            case 0:
                CardWobbleState$endWobbling$2 cardWobbleState$endWobbling$2 = new CardWobbleState$endWobbling$2(cardWobbleState, continuation, 0);
                cardWobbleState$endWobbling$2.L$0 = obj;
                return cardWobbleState$endWobbling$2;
            default:
                CardWobbleState$endWobbling$2 cardWobbleState$endWobbling$22 = new CardWobbleState$endWobbling$2(cardWobbleState, continuation, 1);
                cardWobbleState$endWobbling$22.L$0 = obj;
                return cardWobbleState$endWobbling$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((CardWobbleState$endWobbling$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((CardWobbleState$endWobbling$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardWobbleState cardWobbleState = this.this$0;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 20.0f, new Float(0.01f), 1);
                Continuation continuation = null;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cardWobbleState, spring$default, continuation, 0);
                ConstantSpeedMotionDurationScale constantSpeedMotionDurationScale = ConstantSpeedMotionDurationScale.INSTANCE;
                JobKt.launch$default(coroutineScope, constantSpeedMotionDurationScale, null, anonymousClass1, 2);
                return JobKt.launch$default(coroutineScope, constantSpeedMotionDurationScale, null, new AnonymousClass1(cardWobbleState, spring$default, continuation, 1), 2);
            default:
                Pair pair = (Pair) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Quat quat = (Quat) pair.first;
                Vector4 vector4 = (Vector4) pair.second;
                cardWobbleState.wobbleRotation.setValue(quat);
                cardWobbleState.wobbleTranslation.setValue(vector4);
                return Unit.INSTANCE;
        }
    }
}
