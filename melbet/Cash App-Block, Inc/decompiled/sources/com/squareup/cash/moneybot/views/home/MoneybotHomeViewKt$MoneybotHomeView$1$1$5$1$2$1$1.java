package com.squareup.cash.moneybot.views.home;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
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
public final class MoneybotHomeViewKt$MoneybotHomeView$1$1$5$1$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $animateHomeEntrance;
    public final /* synthetic */ float $height;
    public final /* synthetic */ Animatable $nbaSpacing;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotHomeViewKt$MoneybotHomeView$1$1$5$1$2$1$1(boolean z, Animatable animatable, float f, Continuation continuation) {
        super(2, continuation);
        this.$animateHomeEntrance = z;
        this.$nbaSpacing = animatable;
        this.$height = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoneybotHomeViewKt$MoneybotHomeView$1$1$5$1$2$1$1(this.$animateHomeEntrance, this.$nbaSpacing, this.$height, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoneybotHomeViewKt$MoneybotHomeView$1$1$5$1$2$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r13.$nbaSpacing, r7, r8, null, null, r13, 12) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(200, r13) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r13.$nbaSpacing.snapTo(r13, r13) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        float f = this.$height;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (this.$animateHomeEntrance) {
                this.label = 1;
            } else {
                Float f2 = new Float(f);
                this.label = 3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        Float f3 = new Float(f);
        SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 80.0f, null, 5);
        this.label = 2;
    }
}
