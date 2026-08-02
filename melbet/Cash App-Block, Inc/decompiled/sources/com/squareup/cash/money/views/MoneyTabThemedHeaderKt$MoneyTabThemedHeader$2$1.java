package com.squareup.cash.money.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
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
public final class MoneyTabThemedHeaderKt$MoneyTabThemedHeader$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $showTagBackground;
    public final /* synthetic */ Animatable $tagBackgroundAlpha;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyTabThemedHeaderKt$MoneyTabThemedHeader$2$1(Animatable animatable, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$tagBackgroundAlpha = animatable;
        this.$showTagBackground = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoneyTabThemedHeaderKt$MoneyTabThemedHeader$2$1(this.$tagBackgroundAlpha, this.$showTagBackground, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoneyTabThemedHeaderKt$MoneyTabThemedHeader$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Float f = new Float(this.$showTagBackground ? 1.0f : RecyclerView.DECELERATION_RATE);
            TweenSpec tween$default = AnimatableKt.tween$default(800, 0, new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f), 2);
            this.label = 1;
            if (Animatable.animateTo$default(this.$tagBackgroundAlpha, f, tween$default, null, null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
