package androidx.compose.ui.node;

import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.layout.DefaultIntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.IntrinsicsMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.ConstraintsKt;

/* loaded from: classes.dex */
public interface LayoutModifierNode extends DelegatableNode {
    default int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return mo144measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, NodeMeasuringIntrinsics$IntrinsicMinMax.Max, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Height, 1), ConstraintsKt.Constraints$default(0, i, 0, 0, 13)).getHeight();
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return mo144measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, NodeMeasuringIntrinsics$IntrinsicMinMax.Max, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width, 1), ConstraintsKt.Constraints$default(0, 0, 0, i, 7)).getWidth();
    }

    /* renamed from: measure-3p2s80s */
    MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j);

    default int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return mo144measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, NodeMeasuringIntrinsics$IntrinsicMinMax.Min, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Height, 1), ConstraintsKt.Constraints$default(0, i, 0, 0, 13)).getHeight();
    }

    default int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return new Toolbar.AnonymousClass1(this).m9measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, NodeMeasuringIntrinsics$IntrinsicMinMax.Min, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width, 1), ConstraintsKt.Constraints$default(0, 0, 0, i, 7)).getWidth();
    }
}
