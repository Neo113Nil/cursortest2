package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes3.dex */
public abstract class CanvasKt {
    /* renamed from: BorderStroke-cXLIe8U, reason: not valid java name */
    public static final BorderStroke m173BorderStrokecXLIe8U(long j, float f) {
        return new BorderStroke(f, new SolidColor(j));
    }

    public static final void Canvas(int i, Composer composer, Modifier modifier, Function1 function1) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-932836462);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SpacerKt.Spacer(gapComposer, ClipKt.drawBehind(modifier, function1));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CanvasKt$$ExternalSyntheticLambda0(modifier, function1, i, i3);
        }
    }

    public static float absorbToRelaxIfNeeded(EdgeEffect edgeEffect, float f, float f2, Density density) {
        float f3 = EdgeEffectCompat_androidKt.PlatformFlingScrollFriction;
        double density2 = density.getDensity() * 386.0878f * 160.0f * 0.84f;
        double d = EdgeEffectCompat_androidKt.PlatformFlingScrollFriction * density2;
        if (((float) (Math.exp((EdgeEffectCompat_androidKt.DecelerationRate / EdgeEffectCompat_androidKt.DecelMinusOne) * Math.log((Math.abs(f) * 0.35f) / d)) * d)) > getDistanceCompat(edgeEffect) * f2) {
            return RecyclerView.DECELERATION_RATE;
        }
        onAbsorbCompat(edgeEffect, MathKt__MathJVMKt.roundToInt(f));
        return f;
    }

    public static EdgeEffect create(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.create(context) : new GlowEdgeEffectCompat(context);
    }

    public static final Modifier focusable(Modifier modifier, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        return modifier.then(z ? new FocusableElement(mutableInteractionSourceImpl) : Modifier.Companion.$$INSTANCE);
    }

    public static final GestureNode gestureNode(GestureConnection gestureConnection) {
        return new GestureNode(gestureConnection);
    }

    public static float getDistanceCompat(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.getDistance(edgeEffect) : RecyclerView.DECELERATION_RATE;
    }

    public static final GestureConnection getParentGestureConnection(DelegatingNode delegatingNode) {
        TraversableNode findNearestAncestor = DepthSortedSetKt.findNearestAncestor(delegatingNode, GestureNode.TraverseKey);
        GestureNode gestureNode = findNearestAncestor instanceof GestureNode ? (GestureNode) findNearestAncestor : null;
        if (gestureNode != null) {
            return gestureNode.gestureConnection;
        }
        return null;
    }

    public static void onAbsorbCompat(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static float onPullDistanceCompat(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.onPullDistance(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static void onReleaseWithOppositeDelta(EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof GlowEdgeEffectCompat)) {
            edgeEffect.onRelease();
            return;
        }
        GlowEdgeEffectCompat glowEdgeEffectCompat = (GlowEdgeEffectCompat) edgeEffect;
        float f2 = glowEdgeEffectCompat.oppositeReleaseDelta + f;
        glowEdgeEffectCompat.oppositeReleaseDelta = f2;
        if (Math.abs(f2) > glowEdgeEffectCompat.oppositeReleaseDeltaThreshold) {
            glowEdgeEffectCompat.onRelease();
        }
    }

    public static final Modifier progressSemantics(Modifier modifier) {
        return SemanticsModifierKt.semantics(modifier, true, new BorderKt$$ExternalSyntheticLambda1(16));
    }

    public static final void traverseAncestorGestureConnections(AbstractClickableNode abstractClickableNode, Function1 function1) {
        DepthSortedSetKt.traverseAncestors(abstractClickableNode, GestureNode.TraverseKey, new GestureNodeKt$$ExternalSyntheticLambda0(0, function1));
    }
}
