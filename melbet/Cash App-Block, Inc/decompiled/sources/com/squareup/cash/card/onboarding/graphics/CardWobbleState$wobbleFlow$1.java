package com.squareup.cash.card.onboarding.graphics;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.ClosedFloatRange;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardWobbleState$wobbleFlow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ClosedFloatRange $xRange;
    public final /* synthetic */ Animatable $xRotation;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardWobbleState$wobbleFlow$1(ClosedFloatRange closedFloatRange, Animatable animatable, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$xRange = closedFloatRange;
        this.$xRotation = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Animatable animatable = this.$xRotation;
        ClosedFloatRange closedFloatRange = this.$xRange;
        switch (i) {
            case 0:
                return new CardWobbleState$wobbleFlow$1(closedFloatRange, animatable, continuation, 0);
            case 1:
                return new CardWobbleState$wobbleFlow$1(closedFloatRange, animatable, continuation, 1);
            case 2:
                return new CardWobbleState$wobbleFlow$1(closedFloatRange, animatable, continuation, 2);
            default:
                return new CardWobbleState$wobbleFlow$1(closedFloatRange, animatable, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                ((CardWobbleState$wobbleFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            case 1:
                ((CardWobbleState$wobbleFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            case 2:
                ((CardWobbleState$wobbleFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            default:
                ((CardWobbleState$wobbleFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r0, null, null, r5, 12) != r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x009a, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r4, r2, null, null, r5, 12) == r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f5, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r0, null, null, r5, 12) != r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0126, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r4, r2, null, null, r5, 12) == r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0129, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017f, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r0, null, null, r5, 12) != r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ae, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r3, r2, null, null, r5, 12) == r8) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b1, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0207, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r0, null, null, r5, 12) != r8) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0236, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r3, r2, null, null, r5, 12) == r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0239, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x009a -> B:8:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0126 -> B:24:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01ae -> B:39:0x01b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0236 -> B:54:0x023a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        Animatable animatable2;
        Animatable animatable3;
        Animatable animatable4;
        CardWobbleState$wobbleFlow$1 cardWobbleState$wobbleFlow$1 = this;
        int i = cardWobbleState$wobbleFlow$1.$r8$classId;
        ClosedFloatRange closedFloatRange = cardWobbleState$wobbleFlow$1.$xRange;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = cardWobbleState$wobbleFlow$1.label;
                Animatable animatable5 = cardWobbleState$wobbleFlow$1.$xRotation;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float random = FlowsKt.random(closedFloatRange);
                    float abs = Math.abs(random - ((Number) animatable5.getValue()).floatValue()) / 10.0f;
                    Float f = new Float(random);
                    TweenSpec tween$default = AnimatableKt.tween$default((int) (6000.0f * abs), 0, null, 6);
                    cardWobbleState$wobbleFlow$1.label = 1;
                    animatable = animatable5;
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    animatable = animatable5;
                    float f2 = -FlowsKt.random(closedFloatRange);
                    float abs2 = Math.abs(f2 - ((Number) animatable.getValue()).floatValue()) / 10.0f;
                    Float f3 = new Float(f2);
                    TweenSpec tween$default2 = AnimatableKt.tween$default((int) (abs2 * 6000.0f), 0, null, 6);
                    cardWobbleState$wobbleFlow$1.label = 2;
                    break;
                } else {
                    if (i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    animatable = animatable5;
                    cardWobbleState$wobbleFlow$1 = this;
                    animatable5 = animatable;
                    float random2 = FlowsKt.random(closedFloatRange);
                    float abs3 = Math.abs(random2 - ((Number) animatable5.getValue()).floatValue()) / 10.0f;
                    Float f4 = new Float(random2);
                    TweenSpec tween$default3 = AnimatableKt.tween$default((int) (6000.0f * abs3), 0, null, 6);
                    cardWobbleState$wobbleFlow$1.label = 1;
                    animatable = animatable5;
                    break;
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = cardWobbleState$wobbleFlow$1.label;
                Animatable animatable6 = cardWobbleState$wobbleFlow$1.$xRotation;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float random3 = FlowsKt.random(closedFloatRange);
                    float abs4 = Math.abs(random3 - ((Number) animatable6.getValue()).floatValue()) / 10.0f;
                    Float f5 = new Float(random3);
                    TweenSpec tween$default4 = AnimatableKt.tween$default((int) (5000.0f * abs4), 0, null, 6);
                    cardWobbleState$wobbleFlow$1.label = 1;
                    animatable2 = animatable6;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    animatable2 = animatable6;
                    float f6 = -FlowsKt.random(closedFloatRange);
                    float abs5 = Math.abs(f6 - ((Number) animatable2.getValue()).floatValue()) / 10.0f;
                    Float f7 = new Float(f6);
                    TweenSpec tween$default5 = AnimatableKt.tween$default((int) (abs5 * 5000.0f), 0, null, 6);
                    cardWobbleState$wobbleFlow$1.label = 2;
                    break;
                } else {
                    if (i3 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    animatable2 = animatable6;
                    animatable6 = animatable2;
                    float random32 = FlowsKt.random(closedFloatRange);
                    float abs42 = Math.abs(random32 - ((Number) animatable6.getValue()).floatValue()) / 10.0f;
                    Float f52 = new Float(random32);
                    TweenSpec tween$default42 = AnimatableKt.tween$default((int) (5000.0f * abs42), 0, null, 6);
                    cardWobbleState$wobbleFlow$1.label = 1;
                    animatable2 = animatable6;
                    break;
                }
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = cardWobbleState$wobbleFlow$1.label;
                Animatable animatable7 = cardWobbleState$wobbleFlow$1.$xRotation;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f8 = new Float(FlowsKt.random(closedFloatRange));
                    TweenSpec tween$default6 = AnimatableKt.tween$default((int) (Math.abs(r0 - ((Number) animatable7.getValue()).floatValue()) * 10.0d * 3000.0d), 0, null, 6);
                    cardWobbleState$wobbleFlow$1.label = 1;
                    animatable3 = animatable7;
                } else if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    animatable3 = animatable7;
                    Float f9 = new Float(-FlowsKt.random(closedFloatRange));
                    TweenSpec tween$default7 = AnimatableKt.tween$default((int) (Math.abs(r1 - ((Number) animatable3.getValue()).floatValue()) * 10.0d * 3000.0d), 0, null, 6);
                    cardWobbleState$wobbleFlow$1.label = 2;
                    break;
                } else {
                    if (i4 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    animatable3 = animatable7;
                    animatable7 = animatable3;
                    Float f82 = new Float(FlowsKt.random(closedFloatRange));
                    TweenSpec tween$default62 = AnimatableKt.tween$default((int) (Math.abs(r0 - ((Number) animatable7.getValue()).floatValue()) * 10.0d * 3000.0d), 0, null, 6);
                    cardWobbleState$wobbleFlow$1.label = 1;
                    animatable3 = animatable7;
                    break;
                }
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = cardWobbleState$wobbleFlow$1.label;
                Animatable animatable8 = cardWobbleState$wobbleFlow$1.$xRotation;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f10 = new Float(FlowsKt.random(closedFloatRange));
                    TweenSpec tween$default8 = AnimatableKt.tween$default((int) (Math.abs(r0 - ((Number) animatable8.getValue()).floatValue()) * 10.0d * 6000.0d), 0, null, 6);
                    cardWobbleState$wobbleFlow$1.label = 1;
                    animatable4 = animatable8;
                } else if (i5 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    animatable4 = animatable8;
                    Float f11 = new Float(-FlowsKt.random(closedFloatRange));
                    TweenSpec tween$default9 = AnimatableKt.tween$default((int) (Math.abs(r1 - ((Number) animatable4.getValue()).floatValue()) * 10.0d * 6000.0d), 0, null, 6);
                    cardWobbleState$wobbleFlow$1.label = 2;
                    break;
                } else {
                    if (i5 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    animatable4 = animatable8;
                    animatable8 = animatable4;
                    Float f102 = new Float(FlowsKt.random(closedFloatRange));
                    TweenSpec tween$default82 = AnimatableKt.tween$default((int) (Math.abs(r0 - ((Number) animatable8.getValue()).floatValue()) * 10.0d * 6000.0d), 0, null, 6);
                    cardWobbleState$wobbleFlow$1.label = 1;
                    animatable4 = animatable8;
                    break;
                }
        }
    }
}
