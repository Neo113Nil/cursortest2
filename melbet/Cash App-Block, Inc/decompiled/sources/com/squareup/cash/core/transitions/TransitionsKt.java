package com.squareup.cash.core.transitions;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.CrossfadeKt$Crossfade$3$1;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.TransitionFactory;
import app.cash.molecule.PlatformKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.workflow1.WorkflowInterceptorKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class TransitionsKt {
    public static final OptionalProvider$$ExternalSyntheticLambda0 accelDecel = new OptionalProvider$$ExternalSyntheticLambda0(29);
    public static final CubicBezierEasing easeIn = new CubicBezierEasing(0.42f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
    public static final CubicBezierEasing easeOut = new CubicBezierEasing(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.58f, 1.0f);

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransitionFactory.Interpolator.values().length];
            try {
                TransitionFactory.Interpolator interpolator = TransitionFactory.Interpolator.EaseIn;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TransitionFactory.Interpolator interpolator2 = TransitionFactory.Interpolator.EaseIn;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TransitionFactory.Interpolator interpolator3 = TransitionFactory.Interpolator.EaseIn;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float decrementAndGet(MutableFloatState mutableFloatState) {
        mutableFloatState.getClass();
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
        float nextAfter = Math.nextAfter(parcelableSnapshotMutableFloatState.getFloatValue(), Double.NEGATIVE_INFINITY);
        parcelableSnapshotMutableFloatState.setFloatValue(nextAfter);
        return nextAfter;
    }

    public static TweenSpec fadeInSpec$default(int i, int i2, Easing easing) {
        if ((i2 & 1) != 0) {
            easing = easeOut;
        }
        if ((i2 & 2) != 0) {
            i = 200;
        }
        return new TweenSpec(i, (i2 & 4) != 0 ? 0 : 200, easing);
    }

    public static TweenSpec fadeOutSpec$default() {
        return new TweenSpec(200, 0, easeIn);
    }

    public static final float incrementAndGet(MutableFloatState mutableFloatState) {
        mutableFloatState.getClass();
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
        float nextUp = Math.nextUp(parcelableSnapshotMutableFloatState.getFloatValue());
        parcelableSnapshotMutableFloatState.setFloatValue(nextUp);
        return nextUp;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ContentTransform toContentTransform(final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, TransitionFactory.StandardTransition standardTransition, Density density, MutableFloatState mutableFloatState) {
        Easing easing;
        animatedContentTransitionScopeImpl.getClass();
        density.getClass();
        mutableFloatState.getClass();
        boolean z = standardTransition instanceof TransitionFactory.StandardTransition.Crossfade;
        OptionalProvider$$ExternalSyntheticLambda0 optionalProvider$$ExternalSyntheticLambda0 = accelDecel;
        final int i = 3;
        final int i2 = 2;
        final int i3 = 0;
        if (z) {
            return new ContentTransform(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(0, 0, optionalProvider$$ExternalSyntheticLambda0, 3), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(0, 0, optionalProvider$$ExternalSyntheticLambda0, 3), 2), RecyclerView.DECELERATION_RATE, 12);
        }
        final int i4 = 1;
        if (standardTransition instanceof TransitionFactory.StandardTransition.FadeIn) {
            TransitionFactory.StandardTransition.FadeIn fadeIn = (TransitionFactory.StandardTransition.FadeIn) standardTransition;
            TransitionFactory.Interpolator interpolator = fadeIn.interpolator;
            int i5 = interpolator == null ? -1 : WhenMappings.$EnumSwitchMapping$0[interpolator.ordinal()];
            if (i5 != -1) {
                if (i5 == 1) {
                    easing = EasingKt.LinearEasing;
                } else if (i5 == 2) {
                    easing = easeIn;
                } else if (i5 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Integer num = fadeIn.duration;
                return new ContentTransform(EnterExitTransitionKt.fadeIn$default(fadeInSpec$default(num == null ? num.intValue() : 200, 4, easing), 2), ExitTransitionImpl.KeepUntilTransitionsFinished, incrementAndGet(mutableFloatState), 8);
            }
            easing = easeOut;
            Integer num2 = fadeIn.duration;
            return new ContentTransform(EnterExitTransitionKt.fadeIn$default(fadeInSpec$default(num2 == null ? num2.intValue() : 200, 4, easing), 2), ExitTransitionImpl.KeepUntilTransitionsFinished, incrementAndGet(mutableFloatState), 8);
        }
        if (standardTransition.equals(TransitionFactory.StandardTransition.FadeOut.INSTANCE)) {
            return new ContentTransform(EnterTransitionImpl.None, EnterExitTransitionKt.fadeOut$default(fadeOutSpec$default(), 2), decrementAndGet(mutableFloatState), 8);
        }
        if (standardTransition.equals(TransitionFactory.StandardTransition.FadeOutThenIn.INSTANCE)) {
            return new ContentTransform(EnterExitTransitionKt.fadeIn$default(fadeInSpec$default(0, 3, null), 2), EnterExitTransitionKt.fadeOut$default(fadeOutSpec$default(), 2), ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue(), 8);
        }
        if (standardTransition.equals(TransitionFactory.StandardTransition.Immediate.INSTANCE)) {
            return new ContentTransform(EnterExitTransitionKt.fadeIn$default(new SnapSpec(0), 2), EnterExitTransitionKt.fadeOut$default(new SnapSpec(0), 2), ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue(), 8);
        }
        if (standardTransition.equals(TransitionFactory.StandardTransition.InFromBottom.INSTANCE)) {
            return WorkflowInterceptorKt.verticalSlide(incrementAndGet(mutableFloatState), true);
        }
        if (standardTransition.equals(TransitionFactory.StandardTransition.InFromRight.INSTANCE)) {
            TweenSpec tween$default = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, optionalProvider$$ExternalSyntheticLambda0, 2);
            final CrossfadeKt$Crossfade$3$1 crossfadeKt$Crossfade$3$1 = CrossfadeKt$Crossfade$3$1.INSTANCE$3;
            return new ContentTransform(animatedContentTransitionScopeImpl.m142isLeftgWo6LJ4(0) ? EnterExitTransitionKt.slideInHorizontally(tween$default, new Function1() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    long mo584alignKFBX0sM;
                    long mo584alignKFBX0sM2;
                    long mo584alignKFBX0sM3;
                    long mo584alignKFBX0sM4;
                    int i6 = i3;
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    Function1 function1 = crossfadeKt$Crossfade$3$1;
                    switch (i6) {
                        case 0:
                            int intValue = ((Number) obj).intValue();
                            int m140access$getCurrentSizeYbymL2g = (int) (AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2) >> 32);
                            long j = intValue;
                            mo584alignKFBX0sM = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((BodyPartID.bodyIdMax & j) | (j << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf(m140access$getCurrentSizeYbymL2g - ((int) (mo584alignKFBX0sM >> 32))));
                        case 1:
                            int intValue2 = ((Number) obj).intValue();
                            long j2 = intValue2;
                            mo584alignKFBX0sM2 = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j2 & BodyPartID.bodyIdMax) | (j2 << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf((-((int) (mo584alignKFBX0sM2 >> 32))) - intValue2));
                        case 2:
                            int intValue3 = ((Number) obj).intValue();
                            int m140access$getCurrentSizeYbymL2g2 = (int) (AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2) & BodyPartID.bodyIdMax);
                            long j3 = intValue3;
                            mo584alignKFBX0sM3 = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j3 & BodyPartID.bodyIdMax) | (j3 << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf(m140access$getCurrentSizeYbymL2g2 - ((int) (BodyPartID.bodyIdMax & mo584alignKFBX0sM3))));
                        default:
                            int intValue4 = ((Number) obj).intValue();
                            long j4 = intValue4;
                            mo584alignKFBX0sM4 = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j4 & BodyPartID.bodyIdMax) | (j4 << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf((-((int) (mo584alignKFBX0sM4 & BodyPartID.bodyIdMax))) - intValue4));
                    }
                }
            }) : animatedContentTransitionScopeImpl.m143isRightgWo6LJ4(0) ? EnterExitTransitionKt.slideInHorizontally(tween$default, new Function1() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    long mo584alignKFBX0sM;
                    long mo584alignKFBX0sM2;
                    long mo584alignKFBX0sM3;
                    long mo584alignKFBX0sM4;
                    int i6 = i4;
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    Function1 function1 = crossfadeKt$Crossfade$3$1;
                    switch (i6) {
                        case 0:
                            int intValue = ((Number) obj).intValue();
                            int m140access$getCurrentSizeYbymL2g = (int) (AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2) >> 32);
                            long j = intValue;
                            mo584alignKFBX0sM = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((BodyPartID.bodyIdMax & j) | (j << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf(m140access$getCurrentSizeYbymL2g - ((int) (mo584alignKFBX0sM >> 32))));
                        case 1:
                            int intValue2 = ((Number) obj).intValue();
                            long j2 = intValue2;
                            mo584alignKFBX0sM2 = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j2 & BodyPartID.bodyIdMax) | (j2 << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf((-((int) (mo584alignKFBX0sM2 >> 32))) - intValue2));
                        case 2:
                            int intValue3 = ((Number) obj).intValue();
                            int m140access$getCurrentSizeYbymL2g2 = (int) (AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2) & BodyPartID.bodyIdMax);
                            long j3 = intValue3;
                            mo584alignKFBX0sM3 = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j3 & BodyPartID.bodyIdMax) | (j3 << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf(m140access$getCurrentSizeYbymL2g2 - ((int) (BodyPartID.bodyIdMax & mo584alignKFBX0sM3))));
                        default:
                            int intValue4 = ((Number) obj).intValue();
                            long j4 = intValue4;
                            mo584alignKFBX0sM4 = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j4 & BodyPartID.bodyIdMax) | (j4 << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf((-((int) (mo584alignKFBX0sM4 & BodyPartID.bodyIdMax))) - intValue4));
                    }
                }
            }) : CrossfadeKt.m146equalsimpl0(0, 2) ? EnterExitTransitionKt.slideInVertically(tween$default, new Function1() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    long mo584alignKFBX0sM;
                    long mo584alignKFBX0sM2;
                    long mo584alignKFBX0sM3;
                    long mo584alignKFBX0sM4;
                    int i6 = i2;
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    Function1 function1 = crossfadeKt$Crossfade$3$1;
                    switch (i6) {
                        case 0:
                            int intValue = ((Number) obj).intValue();
                            int m140access$getCurrentSizeYbymL2g = (int) (AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2) >> 32);
                            long j = intValue;
                            mo584alignKFBX0sM = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((BodyPartID.bodyIdMax & j) | (j << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf(m140access$getCurrentSizeYbymL2g - ((int) (mo584alignKFBX0sM >> 32))));
                        case 1:
                            int intValue2 = ((Number) obj).intValue();
                            long j2 = intValue2;
                            mo584alignKFBX0sM2 = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j2 & BodyPartID.bodyIdMax) | (j2 << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf((-((int) (mo584alignKFBX0sM2 >> 32))) - intValue2));
                        case 2:
                            int intValue3 = ((Number) obj).intValue();
                            int m140access$getCurrentSizeYbymL2g2 = (int) (AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2) & BodyPartID.bodyIdMax);
                            long j3 = intValue3;
                            mo584alignKFBX0sM3 = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j3 & BodyPartID.bodyIdMax) | (j3 << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf(m140access$getCurrentSizeYbymL2g2 - ((int) (BodyPartID.bodyIdMax & mo584alignKFBX0sM3))));
                        default:
                            int intValue4 = ((Number) obj).intValue();
                            long j4 = intValue4;
                            mo584alignKFBX0sM4 = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j4 & BodyPartID.bodyIdMax) | (j4 << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf((-((int) (mo584alignKFBX0sM4 & BodyPartID.bodyIdMax))) - intValue4));
                    }
                }
            }) : CrossfadeKt.m146equalsimpl0(0, 3) ? EnterExitTransitionKt.slideInVertically(tween$default, new Function1() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    long mo584alignKFBX0sM;
                    long mo584alignKFBX0sM2;
                    long mo584alignKFBX0sM3;
                    long mo584alignKFBX0sM4;
                    int i6 = i;
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    Function1 function1 = crossfadeKt$Crossfade$3$1;
                    switch (i6) {
                        case 0:
                            int intValue = ((Number) obj).intValue();
                            int m140access$getCurrentSizeYbymL2g = (int) (AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2) >> 32);
                            long j = intValue;
                            mo584alignKFBX0sM = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((BodyPartID.bodyIdMax & j) | (j << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf(m140access$getCurrentSizeYbymL2g - ((int) (mo584alignKFBX0sM >> 32))));
                        case 1:
                            int intValue2 = ((Number) obj).intValue();
                            long j2 = intValue2;
                            mo584alignKFBX0sM2 = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j2 & BodyPartID.bodyIdMax) | (j2 << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf((-((int) (mo584alignKFBX0sM2 >> 32))) - intValue2));
                        case 2:
                            int intValue3 = ((Number) obj).intValue();
                            int m140access$getCurrentSizeYbymL2g2 = (int) (AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2) & BodyPartID.bodyIdMax);
                            long j3 = intValue3;
                            mo584alignKFBX0sM3 = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j3 & BodyPartID.bodyIdMax) | (j3 << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf(m140access$getCurrentSizeYbymL2g2 - ((int) (BodyPartID.bodyIdMax & mo584alignKFBX0sM3))));
                        default:
                            int intValue4 = ((Number) obj).intValue();
                            long j4 = intValue4;
                            mo584alignKFBX0sM4 = animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j4 & BodyPartID.bodyIdMax) | (j4 << 32), AnimatedContentTransitionScopeImpl.m140access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl2), LayoutDirection.Ltr);
                            return (Integer) function1.invoke(Integer.valueOf((-((int) (mo584alignKFBX0sM4 & BodyPartID.bodyIdMax))) - intValue4));
                    }
                }
            }) : EnterTransitionImpl.None, ExitTransitionImpl.KeepUntilTransitionsFinished, incrementAndGet(mutableFloatState), 8);
        }
        if (standardTransition.equals(TransitionFactory.StandardTransition.OutToBottom.INSTANCE)) {
            return WorkflowInterceptorKt.verticalSlide(incrementAndGet(mutableFloatState), false);
        }
        if (standardTransition.equals(TransitionFactory.StandardTransition.OutToLeft.INSTANCE)) {
            return new ContentTransform(EnterTransitionImpl.None, AnimatedContentTransitionScopeImpl.m141slideOutOfContainermOhB8PU$default(animatedContentTransitionScopeImpl, 0, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, optionalProvider$$ExternalSyntheticLambda0, 2)), decrementAndGet(mutableFloatState), 8);
        }
        if (standardTransition.equals(TransitionFactory.StandardTransition.OutToRight.INSTANCE)) {
            return new ContentTransform(EnterTransitionImpl.None, AnimatedContentTransitionScopeImpl.m141slideOutOfContainermOhB8PU$default(animatedContentTransitionScopeImpl, 1, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, optionalProvider$$ExternalSyntheticLambda0, 2)), decrementAndGet(mutableFloatState), 8);
        }
        if (standardTransition instanceof TransitionFactory.StandardTransition.Push) {
            return PlatformKt.push(density, !((TransitionFactory.StandardTransition.Push) standardTransition).back, ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue());
        }
        if (standardTransition.equals(TransitionFactory.StandardTransition.PushLeft.INSTANCE)) {
            return PlatformKt.push(density, true, ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue());
        }
        if (standardTransition.equals(TransitionFactory.StandardTransition.PushRight.INSTANCE)) {
            return PlatformKt.push(density, false, ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue());
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
