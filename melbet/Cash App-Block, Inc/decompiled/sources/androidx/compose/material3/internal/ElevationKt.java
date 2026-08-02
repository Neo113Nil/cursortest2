package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.DragInteraction$Start;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class ElevationKt {
    public static final TweenSpec DefaultIncomingSpec;
    public static final TweenSpec DefaultOutgoingSpec;
    public static final TweenSpec HoveredOutgoingSpec;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, RecyclerView.DECELERATION_RATE, 0.6f, 1.0f);
        DefaultIncomingSpec = new TweenSpec(120, EasingKt.FastOutSlowInEasing, 2);
        DefaultOutgoingSpec = new TweenSpec(150, cubicBezierEasing, 2);
        HoveredOutgoingSpec = new TweenSpec(120, cubicBezierEasing, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
    
        if ((r11 instanceof androidx.compose.foundation.interaction.FocusInteraction$Focus) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        if ((r10 instanceof androidx.compose.foundation.interaction.FocusInteraction$Focus) != false) goto L6;
     */
    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m565animateElevationrAjV9yQ(Animatable animatable, float f, Interaction interaction, Interaction interaction2, ContinuationImpl continuationImpl) {
        TweenSpec tweenSpec;
        TweenSpec tweenSpec2 = null;
        if (interaction2 != null) {
            boolean z = interaction2 instanceof PressInteraction.Press;
            tweenSpec = DefaultIncomingSpec;
            if (!z) {
                if (!(interaction2 instanceof DragInteraction$Start)) {
                    if (!(interaction2 instanceof HoverInteraction$Enter)) {
                    }
                }
            }
            tweenSpec2 = tweenSpec;
        } else if (interaction != null) {
            boolean z2 = interaction instanceof PressInteraction.Press;
            tweenSpec = DefaultOutgoingSpec;
            if (!z2 && !(interaction instanceof DragInteraction$Start)) {
                if (interaction instanceof HoverInteraction$Enter) {
                    tweenSpec2 = HoveredOutgoingSpec;
                }
            }
            tweenSpec2 = tweenSpec;
        }
        TweenSpec tweenSpec3 = tweenSpec2;
        if (tweenSpec3 != null) {
            Object animateTo$default = Animatable.animateTo$default(animatable, new Dp(f), tweenSpec3, null, null, continuationImpl, 12);
            return animateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? animateTo$default : Unit.INSTANCE;
        }
        Object snapTo = animatable.snapTo(new Dp(f), continuationImpl);
        return snapTo == CoroutineSingletons.COROUTINE_SUSPENDED ? snapTo : Unit.INSTANCE;
    }
}
