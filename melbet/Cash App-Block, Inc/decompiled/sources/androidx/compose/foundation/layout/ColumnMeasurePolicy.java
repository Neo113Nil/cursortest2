package androidx.compose.foundation.layout;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.DimensionKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ColumnMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public final BiasAlignment.Horizontal horizontalAlignment;
    public final Arrangement$Vertical verticalArrangement;

    public ColumnMeasurePolicy(Arrangement$Vertical arrangement$Vertical, BiasAlignment.Horizontal horizontal) {
        this.verticalArrangement = arrangement$Vertical;
        this.horizontalAlignment = horizontal;
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q, reason: not valid java name */
    public final long mo260createConstraintsxF2OJ5Q(int i, int i2, boolean z, int i3) {
        return !z ? ConstraintsKt.Constraints(0, i3, i, i2) : DimensionKt.m1464fitPrioritizingHeightZbe2FdA(0, i3, i, i2);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final int crossAxisSize(Placeable placeable) {
        return placeable.width;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) obj;
        return Intrinsics.areEqual(this.verticalArrangement, columnMeasurePolicy.verticalArrangement) && this.horizontalAlignment.equals(columnMeasurePolicy.horizontalAlignment);
    }

    public final int hashCode() {
        return Float.hashCode(this.horizontalAlignment.bias) + (this.verticalArrangement.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final int mainAxisSize(Placeable placeable) {
        return placeable.height;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        int mo230roundToPx0680j_4 = intrinsicMeasureScope.mo230roundToPx0680j_4(this.verticalArrangement.mo252getSpacingD9Ej5fM());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i4);
            float weight = SpacerKt.getWeight(SpacerKt.getRowColumnParentData(intrinsicMeasurable));
            int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i);
            if (weight == RecyclerView.DECELERATION_RATE) {
                i3 += maxIntrinsicHeight;
            } else if (weight > RecyclerView.DECELERATION_RATE) {
                f += weight;
                i2 = Math.max(i2, Math.round(maxIntrinsicHeight / weight));
            }
        }
        return ((list.size() - 1) * mo230roundToPx0680j_4) + Math.round(i2 * f) + i3;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        int mo230roundToPx0680j_4 = intrinsicMeasureScope.mo230roundToPx0680j_4(this.verticalArrangement.mo252getSpacingD9Ej5fM());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * mo230roundToPx0680j_4, i);
        List list2 = list;
        int size = list2.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            float weight = SpacerKt.getWeight(SpacerKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == RecyclerView.DECELERATION_RATE) {
                int min2 = Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, intrinsicMeasurable.maxIntrinsicWidth(min2));
            } else if (weight > RecyclerView.DECELERATION_RATE) {
                f += weight;
            }
        }
        int round = f == RecyclerView.DECELERATION_RATE ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i4);
            float weight2 = SpacerKt.getWeight(SpacerKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > RecyclerView.DECELERATION_RATE) {
                i2 = Math.max(i2, intrinsicMeasurable2.maxIntrinsicWidth(round != Integer.MAX_VALUE ? Math.round(round * weight2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        return SpacerKt.measure(this, Constraints.m1026getMinHeightimpl(j), Constraints.m1027getMinWidthimpl(j), Constraints.m1024getMaxHeightimpl(j), Constraints.m1025getMaxWidthimpl(j), measureScope.mo230roundToPx0680j_4(this.verticalArrangement.mo252getSpacingD9Ej5fM()), measureScope, list, new Placeable[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        int mo230roundToPx0680j_4 = intrinsicMeasureScope.mo230roundToPx0680j_4(this.verticalArrangement.mo252getSpacingD9Ej5fM());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i4);
            float weight = SpacerKt.getWeight(SpacerKt.getRowColumnParentData(intrinsicMeasurable));
            int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i);
            if (weight == RecyclerView.DECELERATION_RATE) {
                i3 += minIntrinsicHeight;
            } else if (weight > RecyclerView.DECELERATION_RATE) {
                f += weight;
                i2 = Math.max(i2, Math.round(minIntrinsicHeight / weight));
            }
        }
        return ((list.size() - 1) * mo230roundToPx0680j_4) + Math.round(i2 * f) + i3;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        int mo230roundToPx0680j_4 = intrinsicMeasureScope.mo230roundToPx0680j_4(this.verticalArrangement.mo252getSpacingD9Ej5fM());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * mo230roundToPx0680j_4, i);
        List list2 = list;
        int size = list2.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            float weight = SpacerKt.getWeight(SpacerKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == RecyclerView.DECELERATION_RATE) {
                int min2 = Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, intrinsicMeasurable.minIntrinsicWidth(min2));
            } else if (weight > RecyclerView.DECELERATION_RATE) {
                f += weight;
            }
        }
        int round = f == RecyclerView.DECELERATION_RATE ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i4);
            float weight2 = SpacerKt.getWeight(SpacerKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > RecyclerView.DECELERATION_RATE) {
                i2 = Math.max(i2, intrinsicMeasurable2.minIntrinsicWidth(round != Integer.MAX_VALUE ? Math.round(round * weight2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final MeasureResult placeHelper(Placeable[] placeableArr, MeasureScope measureScope, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return MeasureScope.layout$default(measureScope, i3, i2, new BoxMeasurePolicy$$ExternalSyntheticLambda1(placeableArr, this, i3, i, measureScope, iArr));
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final void populateMainAxisPositions(int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.verticalArrangement.arrange(measureScope, i, iArr, iArr2);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.verticalArrangement + ", horizontalAlignment=" + this.horizontalAlignment + ')';
    }
}
