package com.squareup.cash.pools.views.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda43;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PoolDetailsAnimationStateHolder$animateIn$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ PoolDetailsAnimationStateHolder this$0;

    /* renamed from: com.squareup.cash.pools.views.animation.PoolDetailsAnimationStateHolder$animateIn$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ PoolDetailsAnimationStateHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = poolDetailsAnimationStateHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    return new AnonymousClass1(this.this$0, continuation, 0);
                case 1:
                    return new AnonymousClass1(this.this$0, continuation, 1);
                case 2:
                    return new AnonymousClass1(this.this$0, continuation, 2);
                case 3:
                    return new AnonymousClass1(this.this$0, continuation, 3);
                case 4:
                    return new AnonymousClass1(this.this$0, continuation, 4);
                case 5:
                    return new AnonymousClass1(this.this$0, continuation, 5);
                case 6:
                    return new AnonymousClass1(this.this$0, continuation, 6);
                case 7:
                    return new AnonymousClass1(this.this$0, continuation, 7);
                case 8:
                    return new AnonymousClass1(this.this$0, continuation, 8);
                default:
                    return new AnonymousClass1(this.this$0, continuation, 9);
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

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r3, null, null, r17, 12) == r7) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        
            if (r0.snapTo(r1, r17) == r7) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r3, null, null, r17, 12) == r7) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
        
            if (r0.snapTo(r1, r17) == r7) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable = poolDetailsAnimationStateHolder.avatarSpacingAnimatable;
                        Dp dp = new Dp((-poolDetailsAnimationStateHolder.avatarSize) / 3.0f);
                        TweenSpec tween$default = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 0, new CubicBezierEasing(0.17f, 0.17f, RecyclerView.DECELERATION_RATE, 1.0f), 2);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, dp, tween$default, null, null, this, 12) == coroutineSingletons) {
                            break;
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
                        Animatable animatable2 = poolDetailsAnimationStateHolder.avatarAlphaAnimatable;
                        Float f = new Float(1.0f);
                        TweenSpec tween$default2 = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 0, new CubicBezierEasing(0.17f, 0.17f, RecyclerView.DECELERATION_RATE, 1.0f), 2);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable2, f, tween$default2, null, null, this, 12) == coroutineSingletons2) {
                            break;
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
                        Animatable animatable3 = poolDetailsAnimationStateHolder.progressRingScaleAnimatable;
                        Float f2 = new Float(1.0f);
                        SpringSpec spring$default = AnimatableKt.spring$default(0.65f, 400.0f, null, 4);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable3, f2, spring$default, null, null, this, 12) == coroutineSingletons3) {
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
                        Animatable animatable4 = poolDetailsAnimationStateHolder.progressUiScaleAnimatable;
                        Float f3 = new Float(1.0f);
                        SpringSpec spring$default2 = AnimatableKt.spring$default(0.65f, 400.0f, null, 4);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable4, f3, spring$default2, null, null, this, 12) == coroutineSingletons4) {
                            break;
                        }
                    } else if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable5 = poolDetailsAnimationStateHolder.progressUiAlphaAnimatable;
                        Float f4 = new Float(1.0f);
                        this.label = 1;
                        if (animatable5.snapTo(f4, this) == coroutineSingletons5) {
                            break;
                        }
                    } else if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable6 = poolDetailsAnimationStateHolder.avatarSpacingAnimatable;
                        Dp dp2 = new Dp(-poolDetailsAnimationStateHolder.avatarSize);
                        KeyframesSpec keyframes = AnimatableKt.keyframes(new PoolDetailsViewKt$$ExternalSyntheticLambda43(poolDetailsAnimationStateHolder, 2));
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable6, dp2, keyframes, null, null, this, 12) == coroutineSingletons6) {
                            break;
                        }
                    } else if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable7 = poolDetailsAnimationStateHolder.avatarAlphaAnimatable;
                        Float f5 = new Float(RecyclerView.DECELERATION_RATE);
                        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig(false);
                        Float valueOf = Float.valueOf(1.0f);
                        keyframesSpecConfig.at(valueOf, 0);
                        keyframesSpecConfig.at(valueOf, EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE).easing = new CubicBezierEasing(0.17f, 0.17f, 0.45f, 1.0f);
                        keyframesSpecConfig.durationMillis = 616;
                        KeyframesSpec keyframesSpec = new KeyframesSpec(keyframesSpecConfig);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable7, f5, keyframesSpec, null, null, this, 12) == coroutineSingletons7) {
                            break;
                        }
                    } else if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable8 = poolDetailsAnimationStateHolder.progressRingScaleAnimatable;
                        Float f6 = new Float(0.28f);
                        KeyframesSpec keyframes2 = AnimatableKt.keyframes(new PoolsListViewKt$$ExternalSyntheticLambda6(10));
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable8, f6, keyframes2, null, null, this, 12) == coroutineSingletons8) {
                            break;
                        }
                    } else if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable9 = poolDetailsAnimationStateHolder.progressUiScaleAnimatable;
                        Float f7 = new Float(1.0f);
                        this.label = 1;
                        break;
                    } else if (i10 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i10 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    Animatable animatable10 = poolDetailsAnimationStateHolder.progressUiScaleAnimatable;
                    Float f8 = new Float(0.45f);
                    TweenSpec tweenSpec = new TweenSpec(333, EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, new CubicBezierEasing(0.3f, 0.14f, 0.18f, 0.69f));
                    this.label = 2;
                    break;
                default:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable11 = poolDetailsAnimationStateHolder.progressUiAlphaAnimatable;
                        Float f9 = new Float(1.0f);
                        this.label = 1;
                        break;
                    } else if (i11 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i11 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    Animatable animatable12 = poolDetailsAnimationStateHolder.progressUiAlphaAnimatable;
                    Float f10 = new Float(RecyclerView.DECELERATION_RATE);
                    TweenSpec tweenSpec2 = new TweenSpec(333, EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, new CubicBezierEasing(0.17f, 0.17f, 0.67f, 1.0f));
                    this.label = 2;
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoolDetailsAnimationStateHolder$animateIn$2(PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = poolDetailsAnimationStateHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                PoolDetailsAnimationStateHolder$animateIn$2 poolDetailsAnimationStateHolder$animateIn$2 = new PoolDetailsAnimationStateHolder$animateIn$2(this.this$0, continuation, 0);
                poolDetailsAnimationStateHolder$animateIn$2.L$0 = obj;
                return poolDetailsAnimationStateHolder$animateIn$2;
            default:
                PoolDetailsAnimationStateHolder$animateIn$2 poolDetailsAnimationStateHolder$animateIn$22 = new PoolDetailsAnimationStateHolder$animateIn$2(this.this$0, continuation, 1);
                poolDetailsAnimationStateHolder$animateIn$22.L$0 = obj;
                return poolDetailsAnimationStateHolder$animateIn$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PoolDetailsAnimationStateHolder$animateIn$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder = this.this$0;
        Continuation continuation = null;
        int i2 = 3;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(poolDetailsAnimationStateHolder, continuation, 0), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(poolDetailsAnimationStateHolder, continuation, 1), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(poolDetailsAnimationStateHolder, continuation, 2), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(poolDetailsAnimationStateHolder, continuation, i2), 3);
                return JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(poolDetailsAnimationStateHolder, continuation, 4), 3);
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(poolDetailsAnimationStateHolder, continuation, 5), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(poolDetailsAnimationStateHolder, continuation, 6), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(poolDetailsAnimationStateHolder, continuation, 7), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(poolDetailsAnimationStateHolder, continuation, 8), 3);
                return JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(poolDetailsAnimationStateHolder, continuation, 9), 3);
        }
    }
}
