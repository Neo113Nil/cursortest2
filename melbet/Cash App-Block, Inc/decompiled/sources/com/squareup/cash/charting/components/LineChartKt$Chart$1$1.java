package com.squareup.cash.charting.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.history.views.ReportAbuseViewKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class LineChartKt$Chart$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $animate;
    public final /* synthetic */ Animatable $animationProgress;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LineChartKt$Chart$1$1(Animatable animatable, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$animationProgress = animatable;
        this.$animate = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new LineChartKt$Chart$1$1(this.$animate, this.$animationProgress, continuation, 0);
            case 1:
                return new LineChartKt$Chart$1$1(this.$animate, this.$animationProgress, continuation, 1);
            case 2:
                return new LineChartKt$Chart$1$1(this.$animationProgress, this.$animate, continuation, 2);
            default:
                return new LineChartKt$Chart$1$1(this.$animationProgress, this.$animate, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((LineChartKt$Chart$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r13.$animationProgress, r0, r1, null, null, r13, 12) == r12) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00dd, code lost:
    
        if (r0.snapTo(r3, r13) == r12) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0108, code lost:
    
        if (r0.snapTo(r1, r13) == r12) goto L61;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        float f = RecyclerView.DECELERATION_RATE;
        boolean z = this.$animate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = this.$animationProgress;
                    if (!z) {
                        Float f2 = new Float(1.0f);
                        this.label = 3;
                        break;
                    } else {
                        Float f3 = new Float(RecyclerView.DECELERATION_RATE);
                        this.label = 1;
                        break;
                    }
                    break;
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    Float f4 = new Float(1.0f);
                    SpringSpec spring$default = AnimatableKt.spring$default(1.0f, 200.0f, null, 4);
                    this.label = 2;
                    break;
                } else if (i2 != 2 && i2 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (z) {
                        Float f5 = new Float(1.0f);
                        SpringSpec spring$default2 = AnimatableKt.spring$default(1.0f, 600.0f, null, 4);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$animationProgress, f5, spring$default2, null, null, this, 12) == coroutineSingletons2) {
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
                    if (z) {
                        f = 1.0f;
                    }
                    Float f6 = new Float(f);
                    TweenSpec tween$default = AnimatableKt.tween$default(150, 0, ReportAbuseViewKt.OvershootEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$animationProgress, f6, tween$default, null, null, this, 12) == coroutineSingletons3) {
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
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (z) {
                        f = 1.0f;
                    }
                    Float f7 = new Float(f);
                    TweenSpec tween$default2 = AnimatableKt.tween$default(150, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$animationProgress, f7, tween$default2, null, null, this, 12) == coroutineSingletons4) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LineChartKt$Chart$1$1(boolean z, Animatable animatable, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$animate = z;
        this.$animationProgress = animatable;
    }
}
