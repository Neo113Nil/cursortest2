package com.squareup.cash.charting.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.components.accountswitcher.ManagedAccountSwitchLoadingContentKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class EarningsBarChartKt$ChartBars$1$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Animatable $it;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EarningsBarChartKt$ChartBars$1$1$1$1(Animatable animatable, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$it = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 0);
            case 1:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 1);
            case 2:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 2);
            case 3:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 3);
            case 4:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 4);
            case 5:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 5);
            case 6:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 6);
            case 7:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 7);
            case 8:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 8);
            case 9:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 9);
            case 10:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 10);
            case 11:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 11);
            case 12:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 12);
            case 13:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 13);
            case 14:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 14);
            case 15:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 15);
            case 16:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 16);
            case 17:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 17);
            case 18:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 18);
            case 19:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 19);
            case 20:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 20);
            case 21:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 21);
            case 22:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 22);
            case 23:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 23);
            case 24:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 24);
            case 25:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 25);
            case 26:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 26);
            case 27:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 27);
            case 28:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 28);
            default:
                return new EarningsBarChartKt$ChartBars$1$1$1$1(this.$it, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((EarningsBarChartKt$ChartBars$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f = new Float(1.0f);
                    SpringSpec spring$default = AnimatableKt.spring$default(1.0f, 175.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f, spring$default, null, null, this, 12) == coroutineSingletons) {
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
                    Float f2 = new Float(180.0f);
                    TweenSpec tween$default = AnimatableKt.tween$default(600, 0, EasingKt.FastOutSlowInEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f2, tween$default, null, null, this, 12) == coroutineSingletons2) {
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
                    SpringSpec spring$default2 = AnimatableKt.spring$default(0.8f, 95.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f3, spring$default2, null, null, this, 12) == coroutineSingletons3) {
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
                    SpringSpec spring$default3 = AnimatableKt.spring$default(0.8f, 95.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f4, spring$default3, null, null, this, 12) == coroutineSingletons4) {
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
                    Float f5 = new Float(1.0f);
                    TweenSpec tween$default2 = AnimatableKt.tween$default(800, 0, EasingKt.FastOutSlowInEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f5, tween$default2, null, null, this, 12) == coroutineSingletons5) {
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
                    Float f6 = new Float(RecyclerView.DECELERATION_RATE);
                    SpringSpec spring$default4 = AnimatableKt.spring$default(0.8f, 95.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f6, spring$default4, null, null, this, 12) == coroutineSingletons6) {
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
                    Float f7 = new Float(1.0f);
                    TweenSpec tween$default3 = AnimatableKt.tween$default(800, 0, EasingKt.FastOutSlowInEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f7, tween$default3, null, null, this, 12) == coroutineSingletons7) {
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
                    Float f8 = new Float(RecyclerView.DECELERATION_RATE);
                    SpringSpec spring$default5 = AnimatableKt.spring$default(0.8f, 95.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f8, spring$default5, null, null, this, 12) == coroutineSingletons8) {
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
                    TweenSpec tween$default4 = AnimatableKt.tween$default(800, 0, EasingKt.FastOutSlowInEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f9, tween$default4, null, null, this, 12) == coroutineSingletons9) {
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
                    Float f10 = new Float(1.5f);
                    TweenSpec tweenSpec = new TweenSpec(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 100, EasingFunctionsKt.EaseOutCirc);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f10, tweenSpec, null, null, this, 12) == coroutineSingletons10) {
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
                    Float f11 = new Float(1.5f);
                    TweenSpec tweenSpec2 = new TweenSpec(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 200, EasingFunctionsKt.EaseOutCirc);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f11, tweenSpec2, null, null, this, 12) == coroutineSingletons11) {
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
                    Float f12 = new Float(1.5f);
                    TweenSpec tweenSpec3 = new TweenSpec(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, EasingFunctionsKt.EaseOutCirc);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f12, tweenSpec3, null, null, this, 12) == coroutineSingletons12) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f13 = new Float(-1.0f);
                    KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig(false);
                    keyframesSpecConfig.durationMillis = 500;
                    keyframesSpecConfig.at(Float.valueOf(1.2f), 100);
                    KeyframesSpec.KeyframeEntity at = keyframesSpecConfig.at(Float.valueOf(0.65f), 200);
                    CubicBezierEasing cubicBezierEasing = EasingFunctionsKt.EaseOut;
                    at.easing = cubicBezierEasing;
                    keyframesSpecConfig.at(Float.valueOf(RecyclerView.DECELERATION_RATE), 350).easing = cubicBezierEasing;
                    KeyframesSpec keyframesSpec = new KeyframesSpec(keyframesSpecConfig);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f13, keyframesSpec, null, null, this, 12) == coroutineSingletons13) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f14 = new Float(0.99f);
                    TweenSpec tween$default5 = AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, ManagedAccountSwitchLoadingContentKt.BounceScaleEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f14, tween$default5, null, null, this, 12) == coroutineSingletons14) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f15 = new Float(RecyclerView.DECELERATION_RATE);
                    TweenSpec tween$default6 = AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, ManagedAccountSwitchLoadingContentKt.BounceYEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f15, tween$default6, null, null, this, 12) == coroutineSingletons15) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f16 = new Float(1.0f);
                    TweenSpec tween$default7 = AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, ManagedAccountSwitchLoadingContentKt.BounceScaleEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f16, tween$default7, null, null, this, 12) == coroutineSingletons16) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f17 = new Float(RecyclerView.DECELERATION_RATE);
                    TweenSpec tween$default8 = AnimatableKt.tween$default(400, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f17, tween$default8, null, null, this, 12) == coroutineSingletons17) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f18 = new Float(1.0f);
                    TweenSpec tween$default9 = AnimatableKt.tween$default(800, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f18, tween$default9, null, null, this, 12) == coroutineSingletons18) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f19 = new Float(1.0f);
                    TweenSpec tween$default10 = AnimatableKt.tween$default(800, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f19, tween$default10, null, null, this, 12) == coroutineSingletons19) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f20 = new Float(1.0f);
                    TweenSpec tween$default11 = AnimatableKt.tween$default(800, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f20, tween$default11, null, null, this, 12) == coroutineSingletons20) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f21 = new Float(RecyclerView.DECELERATION_RATE);
                    TweenSpec tween$default12 = AnimatableKt.tween$default(400, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f21, tween$default12, null, null, this, 12) == coroutineSingletons21) {
                        break;
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f22 = new Float(1.0f);
                    TweenSpec tween$default13 = AnimatableKt.tween$default(350, 0, EasingKt.LinearEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f22, tween$default13, null, null, this, 12) == coroutineSingletons22) {
                        break;
                    }
                } else if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f23 = new Float(RecyclerView.DECELERATION_RATE);
                    TweenSpec tween$default14 = AnimatableKt.tween$default(700, 0, EasingKt.LinearOutSlowInEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f23, tween$default14, null, null, this, 12) == coroutineSingletons23) {
                        break;
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f24 = new Float(1.0f);
                    TweenSpec tween$default15 = AnimatableKt.tween$default(700, 0, EasingKt.LinearOutSlowInEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f24, tween$default15, null, null, this, 12) == coroutineSingletons24) {
                        break;
                    }
                } else if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f25 = new Float(RecyclerView.DECELERATION_RATE);
                    SpringSpec spring$default6 = AnimatableKt.spring$default(0.2f, 150.0f, null, 4);
                    Float f26 = new Float(8.0f);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f25, spring$default6, f26, null, this, 8) == coroutineSingletons25) {
                        break;
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f27 = new Float(RecyclerView.DECELERATION_RATE);
                    SpringSpec spring$default7 = AnimatableKt.spring$default(0.4f, 230.0f, null, 4);
                    Float f28 = new Float(50.0f);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f27, spring$default7, f28, null, this, 8) == coroutineSingletons26) {
                        break;
                    }
                } else if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f29 = new Float(1.0f);
                    TweenSpec tween$default16 = AnimatableKt.tween$default(150, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f29, tween$default16, null, null, this, 12) == coroutineSingletons27) {
                        break;
                    }
                } else if (i27 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f30 = new Float(1.0f);
                    SpringSpec spring$default8 = AnimatableKt.spring$default(0.88f, 360.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f30, spring$default8, null, null, this, 12) == coroutineSingletons28) {
                        break;
                    }
                } else if (i28 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f31 = new Float(1.0f);
                    TweenSpec tween$default17 = AnimatableKt.tween$default(120, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f31, tween$default17, null, null, this, 12) == coroutineSingletons29) {
                        break;
                    }
                } else if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f32 = new Float(RecyclerView.DECELERATION_RATE);
                    SpringSpec spring$default9 = AnimatableKt.spring$default(0.62f, 420.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$it, f32, spring$default9, null, null, this, 12) == coroutineSingletons30) {
                        break;
                    }
                } else if (i30 != 1) {
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
