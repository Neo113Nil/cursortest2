package com.squareup.cash.money.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.SpringSpec;
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
public final class MoneyTabUIKt$MoneyTabLoaded$4$4$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Animatable $toolbarAlpha;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(Animatable animatable, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$toolbarAlpha = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Animatable animatable = this.$toolbarAlpha;
        switch (i) {
            case 0:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 0);
            case 1:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 1);
            case 2:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 2);
            case 3:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 3);
            case 4:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 4);
            case 5:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 5);
            case 6:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 6);
            case 7:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 7);
            case 8:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 8);
            case 9:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 9);
            case 10:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 10);
            case 11:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 11);
            case 12:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 12);
            default:
                return new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, continuation, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneyTabUIKt$MoneyTabLoaded$4$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r17.$toolbarAlpha, r1, r1, r3, null, r17, 8) == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
    
        if (r17.$toolbarAlpha.stop(r17) == r7) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f = new Float(1.0f);
                    TweenSpec tween$default = AnimatableKt.tween$default(0, 67, new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f), 1);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f, tween$default, null, null, this, 12) == coroutineSingletons) {
                        break;
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                    SpringSpec spring$default = AnimatableKt.spring$default(0.62f, 420.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f2, spring$default, null, null, this, 12) == coroutineSingletons2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f3 = new Float(RecyclerView.DECELERATION_RATE);
                    SpringSpec spring$default2 = AnimatableKt.spring$default(0.5f, 300.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f3, spring$default2, null, null, this, 12) == coroutineSingletons3) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f4 = new Float(RecyclerView.DECELERATION_RATE);
                    SpringSpec spring$default3 = AnimatableKt.spring$default(0.5f, 300.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f4, spring$default3, null, null, this, 12) == coroutineSingletons4) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f5 = new Float(RecyclerView.DECELERATION_RATE);
                    SpringSpec spring$default4 = AnimatableKt.spring$default(0.5f, 300.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f5, spring$default4, null, null, this, 12) == coroutineSingletons5) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f6 = new Float(1.0f);
                    SpringSpec spring$default5 = AnimatableKt.spring$default(0.58f, 520.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f6, spring$default5, null, null, this, 12) == coroutineSingletons6) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f7 = new Float(RecyclerView.DECELERATION_RATE);
                    SpringSpec spring$default6 = AnimatableKt.spring$default(0.6f, 480.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f7, spring$default6, null, null, this, 12) == coroutineSingletons7) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f8 = new Float(1.0f);
                    TweenSpec tween$default2 = AnimatableKt.tween$default(0, 67, new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f), 1);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f8, tween$default2, null, null, this, 12) == coroutineSingletons8) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f9 = new Float(1.0f);
                    SpringSpec spring$default7 = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 50.0f, null, 5);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f9, spring$default7, null, null, this, 12) == coroutineSingletons9) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f10 = new Float(RecyclerView.DECELERATION_RATE);
                    TweenSpec tween$default3 = AnimatableKt.tween$default(2500, 1250, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f10, tween$default3, null, null, this, 12) == coroutineSingletons10) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SpringSpec spring$default8 = AnimatableKt.spring$default(0.12f, 1500.0f, null, 4);
                    Float f11 = new Float(RecyclerView.DECELERATION_RATE);
                    Float f12 = new Float(-200.0f);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f11, spring$default8, f12, null, this, 8) == coroutineSingletons11) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else if (i12 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i12 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                SpringSpec springSpec = new SpringSpec(0.5f, 200.0f, new Float(1.0E-7f));
                Float f13 = new Float(0.4f);
                Float f14 = new Float(2.0f);
                this.label = 2;
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SpringSpec spring$default9 = AnimatableKt.spring$default(0.12f, 1500.0f, null, 4);
                    Float f15 = new Float(RecyclerView.DECELERATION_RATE);
                    Float f16 = new Float(-200.0f);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f15, spring$default9, f16, null, this, 8) == coroutineSingletons13) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SpringSpec springSpec2 = new SpringSpec(0.5f, 200.0f, new Float(1.0E-7f));
                    Float f17 = new Float(0.4f);
                    Float f18 = new Float(2.0f);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$toolbarAlpha, f17, springSpec2, f18, null, this, 8) == coroutineSingletons14) {
                        break;
                    }
                } else if (i14 != 1) {
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
