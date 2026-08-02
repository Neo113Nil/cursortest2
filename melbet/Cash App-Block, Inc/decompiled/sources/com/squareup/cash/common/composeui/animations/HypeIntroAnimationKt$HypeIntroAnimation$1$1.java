package com.squareup.cash.common.composeui.animations;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class HypeIntroAnimationKt$HypeIntroAnimation$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $currentPhase$delegate;
    public final /* synthetic */ List $iconSequence;
    public final /* synthetic */ Function0 $onAnimationComplete;
    public final /* synthetic */ Animatable $rotation;
    public final /* synthetic */ boolean $shouldAnimate;
    public float F$0;
    public float F$1;
    public int I$0;
    public int I$1;
    public int I$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HypeIntroAnimationKt$HypeIntroAnimation$1$1(boolean z, List list, Animatable animatable, Function0 function0, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$shouldAnimate = z;
        this.$iconSequence = list;
        this.$rotation = animatable;
        this.$onAnimationComplete = function0;
        this.$currentPhase$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HypeIntroAnimationKt$HypeIntroAnimation$1$1(this.$shouldAnimate, this.$iconSequence, this.$rotation, this.$onAnimationComplete, this.$currentPhase$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HypeIntroAnimationKt$HypeIntroAnimation$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0190, code lost:
    
        if (r22.$rotation.snapTo(r0, r22) == r7) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0165 -> B:17:0x0166). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int size;
        float f;
        int i;
        int i2;
        int i3;
        float f2;
        float f3;
        float f4;
        int i4;
        int i5;
        int i6;
        float f5;
        int i7;
        int i8;
        int i9;
        Float f6;
        TweenSpec tween$default;
        float f7;
        int i10;
        int i11;
        int i12;
        Float f8;
        TweenSpec tween$default2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = this.label;
        Function0 function0 = this.$onAnimationComplete;
        float f9 = RecyclerView.DECELERATION_RATE;
        List list = this.$iconSequence;
        MutableState mutableState = this.$currentPhase$delegate;
        int i14 = 1;
        if (i13 == 0) {
            SafeTrace.throwOnFailure(obj);
            if (this.$shouldAnimate) {
                size = list.size() - 1;
                f = 15.0f;
                i = 125;
                i2 = 0;
                if (i2 < size) {
                }
            } else {
                mutableState.setValue(IntroPhase.COMPLETE);
                Float f10 = new Float(-15.0f);
                this.label = 5;
            }
        } else {
            if (i13 == 1) {
                i12 = this.I$2;
                i11 = this.I$1;
                int i15 = this.I$0;
                float f11 = this.F$0;
                SafeTrace.throwOnFailure(obj);
                f2 = 0.0f;
                i6 = 1;
                i10 = i15;
                f7 = f11;
                mutableState.setValue((IntroPhase) list.get(i11 + 1));
                f8 = new Float(f7);
                tween$default2 = AnimatableKt.tween$default(i10, 0, EasingFunctionsKt.EaseInOut, 2);
                this.F$0 = f7;
                this.I$0 = i10;
                this.I$1 = i11;
                this.I$2 = i12;
                this.label = 2;
                int i16 = i12;
                float f12 = f7;
                int i17 = i11;
                int i18 = i10;
                if (Animatable.animateTo$default(this.$rotation, f8, tween$default2, null, null, this, 12) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i13 == 2) {
                i9 = this.I$2;
                i8 = this.I$1;
                int i19 = this.I$0;
                float f13 = this.F$0;
                SafeTrace.throwOnFailure(obj);
                f2 = 0.0f;
                i6 = 1;
                i7 = i19;
                f5 = f13;
                if (f5 <= f2) {
                }
                f6 = new Float(r4);
                i3 = i6;
                tween$default = AnimatableKt.tween$default(100, 0, EasingFunctionsKt.EaseInOut, 2);
                this.F$0 = f5;
                this.I$0 = i7;
                this.I$1 = i8;
                this.I$2 = i9;
                this.F$1 = r4;
                this.label = 3;
                int i20 = i9;
                float f14 = f5;
                int i21 = i8;
                int i22 = i7;
                f3 = r4;
                if (Animatable.animateTo$default(this.$rotation, f6, tween$default, null, null, this, 12) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i13 == 3) {
                float f15 = this.F$1;
                int i23 = this.I$2;
                int i24 = this.I$1;
                int i25 = this.I$0;
                float f16 = this.F$0;
                SafeTrace.throwOnFailure(obj);
                i3 = 1;
                f2 = 0.0f;
                f3 = f15;
                size = i23;
                i5 = i24;
                i4 = i25;
                f4 = f16;
                this.F$0 = f4;
                this.I$0 = i4;
                this.I$1 = i5;
                this.I$2 = size;
                this.F$1 = f3;
                this.label = 4;
                int i26 = i4;
                if (JobKt.delay(300L, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i13 == 4) {
                size = this.I$2;
                i5 = this.I$1;
                i = this.I$0;
                f4 = this.F$0;
                SafeTrace.throwOnFailure(obj);
                i3 = 1;
                f2 = 0.0f;
                float f17 = -f4;
                i2 = i5 + 1;
                f = f17;
                f9 = f2;
                i14 = i3;
                if (i2 < size) {
                    Float f18 = new Float(f9);
                    f2 = f9;
                    TweenSpec tween$default3 = AnimatableKt.tween$default(i, 0, EasingFunctionsKt.EaseInOut, 2);
                    this.F$0 = f;
                    this.I$0 = i;
                    this.I$1 = i2;
                    this.I$2 = size;
                    this.label = i14;
                    int i27 = size;
                    int i28 = i;
                    int i29 = i2;
                    float f19 = f;
                    i6 = i14;
                    if (Animatable.animateTo$default(this.$rotation, f18, tween$default3, null, null, this, 12) != coroutineSingletons) {
                        i12 = i27;
                        i10 = i28;
                        i11 = i29;
                        f7 = f19;
                        mutableState.setValue((IntroPhase) list.get(i11 + 1));
                        f8 = new Float(f7);
                        tween$default2 = AnimatableKt.tween$default(i10, 0, EasingFunctionsKt.EaseInOut, 2);
                        this.F$0 = f7;
                        this.I$0 = i10;
                        this.I$1 = i11;
                        this.I$2 = i12;
                        this.label = 2;
                        int i162 = i12;
                        float f122 = f7;
                        int i172 = i11;
                        int i182 = i10;
                        if (Animatable.animateTo$default(this.$rotation, f8, tween$default2, null, null, this, 12) != coroutineSingletons) {
                            i9 = i162;
                            i7 = i182;
                            i8 = i172;
                            f5 = f122;
                            float f20 = f5 <= f2 ? f5 - 1.0f : 1.0f + f5;
                            f6 = new Float(f20);
                            i3 = i6;
                            tween$default = AnimatableKt.tween$default(100, 0, EasingFunctionsKt.EaseInOut, 2);
                            this.F$0 = f5;
                            this.I$0 = i7;
                            this.I$1 = i8;
                            this.I$2 = i9;
                            this.F$1 = f20;
                            this.label = 3;
                            int i202 = i9;
                            float f142 = f5;
                            int i212 = i8;
                            int i222 = i7;
                            f3 = f20;
                            if (Animatable.animateTo$default(this.$rotation, f6, tween$default, null, null, this, 12) != coroutineSingletons) {
                                size = i202;
                                i4 = i222;
                                i5 = i212;
                                f4 = f142;
                                this.F$0 = f4;
                                this.I$0 = i4;
                                this.I$1 = i5;
                                this.I$2 = size;
                                this.F$1 = f3;
                                this.label = 4;
                                int i262 = i4;
                                if (JobKt.delay(300L, this) != coroutineSingletons) {
                                    i = i262;
                                    float f172 = -f4;
                                    i2 = i5 + 1;
                                    f = f172;
                                    f9 = f2;
                                    i14 = i3;
                                    if (i2 < size) {
                                        mutableState.setValue(IntroPhase.COMPLETE);
                                        if (function0 != null) {
                                            function0.invoke();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
            } else {
                if (i13 != 5) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
