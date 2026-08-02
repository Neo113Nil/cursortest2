package com.squareup.cash.pools.views.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GoalMetAnimationStateHolder$animateIn$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ GoalMetAnimationStateHolder this$0;

    /* renamed from: com.squareup.cash.pools.views.animation.GoalMetAnimationStateHolder$animateIn$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ GoalMetAnimationStateHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(GoalMetAnimationStateHolder goalMetAnimationStateHolder, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = goalMetAnimationStateHolder;
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
                default:
                    return new AnonymousClass1(this.this$0, continuation, 7);
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

        /* JADX WARN: Code restructure failed: missing block: B:108:0x0217, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r6, r2, null, null, r16, 12) == r7) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x01fd, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(167, r16) == r7) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x01f2, code lost:
        
            if (r0.snapTo(r6, r16) == r7) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, null, null, r16, 12) == r7) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(433, r16) == r7) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r3, null, null, r16, 12) == r7) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f4, code lost:
        
            if (r0.snapTo(r1, r16) == r7) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r6, r2, null, null, r16, 12) == r7) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0155, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(250, r16) == r7) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x014a, code lost:
        
            if (r0.snapTo(r6, r16) == r7) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x01bf, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r3, null, null, r16, 12) == r7) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x019c, code lost:
        
            if (r0.snapTo(r1, r16) == r7) goto L86;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            GoalMetAnimationStateHolder goalMetAnimationStateHolder = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable = goalMetAnimationStateHolder.backgroundAlphaAnimatable;
                        Float f = new Float(1.0f);
                        TweenSpec tween$default = AnimatableKt.tween$default(517, 0, new CubicBezierEasing(0.17f, 0.17f, RecyclerView.DECELERATION_RATE, 1.0f), 2);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, f, tween$default, null, null, this, 12) == coroutineSingletons) {
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
                        Animatable animatable2 = goalMetAnimationStateHolder.titleScaleAnimatable;
                        Float f2 = new Float(0.5f);
                        this.label = 1;
                        break;
                    } else if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i3 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable3 = goalMetAnimationStateHolder.titleScaleAnimatable;
                        Float f3 = new Float(1.0f);
                        SpringSpec spring$default = AnimatableKt.spring$default(0.5f, 200.0f, null, 4);
                        this.label = 3;
                        break;
                    } else if (i3 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    this.label = 2;
                    break;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable4 = goalMetAnimationStateHolder.titleAlphaAnimatable;
                        Float f4 = new Float(RecyclerView.DECELERATION_RATE);
                        this.label = 1;
                        break;
                    } else if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i4 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    Animatable animatable5 = goalMetAnimationStateHolder.titleAlphaAnimatable;
                    Float f5 = new Float(1.0f);
                    TweenSpec tweenSpec = new TweenSpec(534, 167, new CubicBezierEasing(0.17f, 0.17f, RecyclerView.DECELERATION_RATE, 1.0f));
                    this.label = 2;
                    break;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable6 = goalMetAnimationStateHolder.subtitleScaleAnimatable;
                        Float f6 = new Float(0.5f);
                        this.label = 1;
                        break;
                    } else if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i5 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable7 = goalMetAnimationStateHolder.subtitleScaleAnimatable;
                        Float f7 = new Float(1.0f);
                        SpringSpec spring$default2 = AnimatableKt.spring$default(0.5f, 200.0f, null, 4);
                        this.label = 3;
                        break;
                    } else if (i5 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    this.label = 2;
                    break;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable8 = goalMetAnimationStateHolder.subtitleAlphaAnimatable;
                        Float f8 = new Float(RecyclerView.DECELERATION_RATE);
                        this.label = 1;
                        break;
                    } else if (i6 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i6 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    Animatable animatable9 = goalMetAnimationStateHolder.subtitleAlphaAnimatable;
                    Float f9 = new Float(1.0f);
                    TweenSpec tweenSpec2 = new TweenSpec(367, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, new CubicBezierEasing(0.17f, 0.17f, RecyclerView.DECELERATION_RATE, 1.0f));
                    this.label = 2;
                    break;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable10 = goalMetAnimationStateHolder.titleAlphaAnimatable;
                        Float f10 = new Float(RecyclerView.DECELERATION_RATE);
                        TweenSpec tween$default2 = AnimatableKt.tween$default(350, 0, new CubicBezierEasing(1.0f, RecyclerView.DECELERATION_RATE, 0.83f, 1.0f), 2);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable10, f10, tween$default2, null, null, this, 12) == coroutineSingletons6) {
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
                        Animatable animatable11 = goalMetAnimationStateHolder.subtitleAlphaAnimatable;
                        Float f11 = new Float(RecyclerView.DECELERATION_RATE);
                        TweenSpec tween$default3 = AnimatableKt.tween$default(350, 0, new CubicBezierEasing(1.0f, RecyclerView.DECELERATION_RATE, 0.83f, 1.0f), 2);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable11, f11, tween$default3, null, null, this, 12) == coroutineSingletons7) {
                            break;
                        }
                    } else if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        break;
                    } else if (i9 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i9 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    Animatable animatable12 = goalMetAnimationStateHolder.backgroundAlphaAnimatable;
                    Float f12 = new Float(RecyclerView.DECELERATION_RATE);
                    TweenSpec tween$default4 = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 0, new CubicBezierEasing(0.17f, 0.17f, RecyclerView.DECELERATION_RATE, 1.0f), 2);
                    this.label = 2;
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GoalMetAnimationStateHolder$animateIn$2(GoalMetAnimationStateHolder goalMetAnimationStateHolder, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = goalMetAnimationStateHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                GoalMetAnimationStateHolder$animateIn$2 goalMetAnimationStateHolder$animateIn$2 = new GoalMetAnimationStateHolder$animateIn$2(this.this$0, continuation, 0);
                goalMetAnimationStateHolder$animateIn$2.L$0 = obj;
                return goalMetAnimationStateHolder$animateIn$2;
            default:
                GoalMetAnimationStateHolder$animateIn$2 goalMetAnimationStateHolder$animateIn$22 = new GoalMetAnimationStateHolder$animateIn$2(this.this$0, continuation, 1);
                goalMetAnimationStateHolder$animateIn$22.L$0 = obj;
                return goalMetAnimationStateHolder$animateIn$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((GoalMetAnimationStateHolder$animateIn$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        GoalMetAnimationStateHolder goalMetAnimationStateHolder = this.this$0;
        Continuation continuation = null;
        int i2 = 3;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(goalMetAnimationStateHolder, continuation, 0), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(goalMetAnimationStateHolder, continuation, 1), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(goalMetAnimationStateHolder, continuation, 2), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(goalMetAnimationStateHolder, continuation, i2), 3);
                return JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(goalMetAnimationStateHolder, continuation, 4), 3);
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(goalMetAnimationStateHolder, continuation, 5), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(goalMetAnimationStateHolder, continuation, 6), 3);
                return JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(goalMetAnimationStateHolder, continuation, 7), 3);
        }
    }
}
