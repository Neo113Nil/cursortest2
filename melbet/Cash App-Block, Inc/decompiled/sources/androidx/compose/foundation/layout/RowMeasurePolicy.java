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
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.DimensionKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RowMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public final Arrangement$Horizontal horizontalArrangement;
    public final BiasAlignment.Vertical verticalAlignment;

    public RowMeasurePolicy(Arrangement$Horizontal arrangement$Horizontal, BiasAlignment.Vertical vertical) {
        this.horizontalArrangement = arrangement$Horizontal;
        this.verticalAlignment = vertical;
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q */
    public final long mo260createConstraintsxF2OJ5Q(int i, int i2, boolean z, int i3) {
        return !z ? ConstraintsKt.Constraints(i, i2, 0, i3) : DimensionKt.m1465fitPrioritizingWidthZbe2FdA(i, i2, 0, i3);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final int crossAxisSize(Placeable placeable) {
        return placeable.height;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowMeasurePolicy)) {
            return false;
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) obj;
        return Intrinsics.areEqual(this.horizontalArrangement, rowMeasurePolicy.horizontalArrangement) && Intrinsics.areEqual(this.verticalAlignment, rowMeasurePolicy.verticalAlignment);
    }

    public final int hashCode() {
        return this.verticalAlignment.hashCode() + (this.horizontalArrangement.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final int mainAxisSize(Placeable placeable) {
        return placeable.width;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        int mo230roundToPx0680j_4 = intrinsicMeasureScope.mo230roundToPx0680j_4(this.horizontalArrangement.mo252getSpacingD9Ej5fM());
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
                int min2 = Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, intrinsicMeasurable.maxIntrinsicHeight(min2));
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
                i2 = Math.max(i2, intrinsicMeasurable2.maxIntrinsicHeight(round != Integer.MAX_VALUE ? Math.round(round * weight2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        int mo230roundToPx0680j_4 = intrinsicMeasureScope.mo230roundToPx0680j_4(this.horizontalArrangement.mo252getSpacingD9Ej5fM());
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
            int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
            if (weight == RecyclerView.DECELERATION_RATE) {
                i3 += maxIntrinsicWidth;
            } else if (weight > RecyclerView.DECELERATION_RATE) {
                f += weight;
                i2 = Math.max(i2, Math.round(maxIntrinsicWidth / weight));
            }
        }
        return ((list.size() - 1) * mo230roundToPx0680j_4) + Math.round(i2 * f) + i3;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        return SpacerKt.measure(this, Constraints.m1027getMinWidthimpl(j), Constraints.m1026getMinHeightimpl(j), Constraints.m1025getMaxWidthimpl(j), Constraints.m1024getMaxHeightimpl(j), measureScope.mo230roundToPx0680j_4(this.horizontalArrangement.mo252getSpacingD9Ej5fM()), measureScope, list, new Placeable[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        int mo230roundToPx0680j_4 = intrinsicMeasureScope.mo230roundToPx0680j_4(this.horizontalArrangement.mo252getSpacingD9Ej5fM());
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
                int min2 = Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, intrinsicMeasurable.minIntrinsicHeight(min2));
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
                i2 = Math.max(i2, intrinsicMeasurable2.minIntrinsicHeight(round != Integer.MAX_VALUE ? Math.round(round * weight2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        int mo230roundToPx0680j_4 = intrinsicMeasureScope.mo230roundToPx0680j_4(this.horizontalArrangement.mo252getSpacingD9Ej5fM());
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
            int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i);
            if (weight == RecyclerView.DECELERATION_RATE) {
                i3 += minIntrinsicWidth;
            } else if (weight > RecyclerView.DECELERATION_RATE) {
                f += weight;
                i2 = Math.max(i2, Math.round(minIntrinsicWidth / weight));
            }
        }
        return ((list.size() - 1) * mo230roundToPx0680j_4) + Math.round(i2 * f) + i3;
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final MeasureResult placeHelper(final Placeable[] placeableArr, MeasureScope measureScope, final int i, final int[] iArr, int i2, final int i3, int[] iArr2, int i4, int i5, int i6) {
        return MeasureScope.layout$default(measureScope, i2, i3, new Function1() { // from class: androidx.compose.foundation.layout.RowMeasurePolicy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                Placeable[] placeableArr2 = placeableArr;
                int length = placeableArr2.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    Placeable placeable = placeableArr2[i7];
                    int i9 = i8 + 1;
                    placeable.getClass();
                    Object parentData = placeable.getParentData();
                    RowColumnParentData rowColumnParentData = parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null;
                    SpacerKt spacerKt = rowColumnParentData != null ? rowColumnParentData.crossAxisAlignment : null;
                    int i10 = i3;
                    placementScope.place(placeable, iArr[i8], spacerKt != null ? spacerKt.align$foundation_layout(i10, placeable.height, LayoutDirection.Ltr, placeable, i) : this.verticalAlignment.align(placeable.height, i10), RecyclerView.DECELERATION_RATE);
                    i7++;
                    i8 = i9;
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final void populateMainAxisPositions(int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.horizontalArrangement.arrange(measureScope, i, iArr, measureScope.getLayoutDirection(), iArr2);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.horizontalArrangement + ", verticalAlignment=" + this.verticalAlignment + ')';
    }
}
