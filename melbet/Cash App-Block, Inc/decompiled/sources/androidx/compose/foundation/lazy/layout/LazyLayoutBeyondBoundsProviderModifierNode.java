package androidx.compose.foundation.lazy.layout;

import androidx.camera.video.Recorder;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutModifierNode;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class LazyLayoutBeyondBoundsProviderModifierNode extends Modifier.Node implements LayoutModifierNode, BeyondBoundsLayoutProviderModifierNode {
    public static final LazyLayoutBeyondBoundsProviderModifierNode$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new LazyLayoutBeyondBoundsProviderModifierNode$Companion$emptyBeyondBoundsScope$1();
    public Recorder.AnonymousClass6 beyondBoundsInfo;
    public Orientation orientation;
    public LazyLayoutBeyondBoundsState state;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001b, code lost:
    
        if (r4.orientation == androidx.compose.foundation.gestures.Orientation.Vertical) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x000d, code lost:
    
        if (r4.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal) goto L30;
     */
    /* renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m318hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo$Interval lazyLayoutBeyondBoundsInfo$Interval, int i) {
        if (i != 5 && i != 6) {
            if (i != 3 && i != 4) {
                if (i != 1 && i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
            }
            return !m319isForward4vf7U8o(i) ? lazyLayoutBeyondBoundsInfo$Interval.start <= 0 : lazyLayoutBeyondBoundsInfo$Interval.end >= this.state.getItemCount() - 1;
        }
    }

    /* renamed from: isForward-4vf7U8o, reason: not valid java name */
    public final boolean m319isForward4vf7U8o(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int ordinal = DepthSortedSetKt.requireLayoutNode(this).layoutDirection.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return false;
        }
        if (i != 4) {
            a$$ExternalSyntheticBUOutline0.m$1("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int ordinal2 = DepthSortedSetKt.requireLayoutNode(this).layoutDirection.ordinal();
        if (ordinal2 == 0) {
            return true;
        }
        if (ordinal2 == 1) {
            return false;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 5));
    }
}
