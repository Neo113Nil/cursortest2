package com.squareup.cash.pools.views.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AvatarLayoutAnimationStateHolder$animateOut$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int $shrinkDuration;
    public final /* synthetic */ long $stretchDelay;
    public int label;
    public final /* synthetic */ AvatarLayoutAnimationStateHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarLayoutAnimationStateHolder$animateOut$2$1(AvatarLayoutAnimationStateHolder avatarLayoutAnimationStateHolder, long j, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.this$0 = avatarLayoutAnimationStateHolder;
        this.$stretchDelay = j;
        this.$shrinkDuration = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new AvatarLayoutAnimationStateHolder$animateOut$2$1(this.this$0, this.$stretchDelay, this.$shrinkDuration, continuation, 0);
            default:
                return new AvatarLayoutAnimationStateHolder$animateOut$2$1(this.this$0, this.$stretchDelay, this.$shrinkDuration, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AvatarLayoutAnimationStateHolder$animateOut$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009c, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r8, null, null, r17, 12) == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r7, r17) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r1.snapTo(r10, r17) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0120, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r1, r1, r8, null, null, r17, 12) == r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dc, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r7, r17) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        if (r1.snapTo(r10, r17) == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.$shrinkDuration;
        long j = this.$stretchDelay;
        AvatarLayoutAnimationStateHolder avatarLayoutAnimationStateHolder = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = avatarLayoutAnimationStateHolder.scaleMultiplierAnimatable;
                    Float f = new Float(1.0f);
                    this.label = 1;
                    break;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable2 = avatarLayoutAnimationStateHolder.scaleMultiplierAnimatable;
                    CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                    Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                    KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig(false);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 0).easing = new CubicBezierEasing(0.17f, 0.17f, 0.67f, 1.0f);
                    keyframesSpecConfig.at(Float.valueOf(1.1f), EnumC0170g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE).easing = new CubicBezierEasing(0.17f, 0.17f, RecyclerView.DECELERATION_RATE, 1.0f);
                    keyframesSpecConfig.durationMillis = i2 + EnumC0170g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE;
                    KeyframesSpec keyframesSpec = new KeyframesSpec(keyframesSpecConfig);
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
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable3 = avatarLayoutAnimationStateHolder.offsetMultiplierAnimatable;
                    Float f3 = new Float(1.0f);
                    this.label = 1;
                    break;
                } else if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i4 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable4 = avatarLayoutAnimationStateHolder.offsetMultiplierAnimatable;
                    CoroutineSingletons coroutineSingletons4 = coroutineSingletons3;
                    Float f4 = new Float(RecyclerView.DECELERATION_RATE);
                    KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig2 = new KeyframesSpec.KeyframesSpecConfig(false);
                    keyframesSpecConfig2.at(Float.valueOf(1.0f), 0).easing = new CubicBezierEasing(0.17f, 0.17f, 0.67f, 1.0f);
                    keyframesSpecConfig2.at(Float.valueOf(1.1f), EnumC0170g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE).easing = new CubicBezierEasing(0.17f, 0.17f, RecyclerView.DECELERATION_RATE, 1.0f);
                    keyframesSpecConfig2.durationMillis = i2 + EnumC0170g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE;
                    KeyframesSpec keyframesSpec2 = new KeyframesSpec(keyframesSpecConfig2);
                    this.label = 3;
                    break;
                } else if (i4 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }
}
