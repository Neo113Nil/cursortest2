package androidx.compose.foundation.layout;

import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda4;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.InlineClassHelperKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes.dex */
public final class BoxMeasurePolicy implements MeasurePolicy {
    public final Alignment alignment;
    public final boolean propagateMinConstraints;

    public BoxMeasurePolicy(Alignment alignment, boolean z) {
        this.alignment = alignment;
        this.propagateMinConstraints = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return Intrinsics.areEqual(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.propagateMinConstraints) + (this.alignment.hashCode() * 31);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(final MeasureScope measureScope, final List list, long j) {
        int m1027getMinWidthimpl;
        int m1026getMinHeightimpl;
        Placeable mo833measureBRTryo0;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m1027getMinWidthimpl(j), Constraints.m1026getMinHeightimpl(j), new ScrollState$$ExternalSyntheticLambda4(27));
        }
        long j2 = this.propagateMinConstraints ? j : j & (-8589934589L);
        if (list.size() == 1) {
            Measurable measurable = (Measurable) list.get(0);
            Object parentData = measurable.getParentData();
            BoxChildDataNode boxChildDataNode = parentData instanceof BoxChildDataNode ? (BoxChildDataNode) parentData : null;
            if (boxChildDataNode != null ? boxChildDataNode.matchParentSize : false) {
                m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j);
                m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j);
                int m1027getMinWidthimpl2 = Constraints.m1027getMinWidthimpl(j);
                int m1026getMinHeightimpl2 = Constraints.m1026getMinHeightimpl(j);
                if (!((m1026getMinHeightimpl2 >= 0) & (m1027getMinWidthimpl2 >= 0))) {
                    InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
                }
                mo833measureBRTryo0 = measurable.mo833measureBRTryo0(ConstraintsKt.createConstraints(m1027getMinWidthimpl2, m1027getMinWidthimpl2, m1026getMinHeightimpl2, m1026getMinHeightimpl2));
            } else {
                mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j2);
                m1027getMinWidthimpl = Math.max(Constraints.m1027getMinWidthimpl(j), mo833measureBRTryo0.width);
                m1026getMinHeightimpl = Math.max(Constraints.m1026getMinHeightimpl(j), mo833measureBRTryo0.height);
            }
            int i = m1026getMinHeightimpl;
            int i2 = m1027getMinWidthimpl;
            return MeasureScope.layout$default(measureScope, i2, i, new BoxMeasurePolicy$$ExternalSyntheticLambda1(mo833measureBRTryo0, measurable, measureScope, i2, i, this));
        }
        final Placeable[] placeableArr = new Placeable[list.size()];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = Constraints.m1027getMinWidthimpl(j);
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = Constraints.m1026getMinHeightimpl(j);
        List list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            Measurable measurable2 = (Measurable) list.get(i3);
            Object parentData2 = measurable2.getParentData();
            BoxChildDataNode boxChildDataNode2 = parentData2 instanceof BoxChildDataNode ? (BoxChildDataNode) parentData2 : null;
            if (boxChildDataNode2 != null ? boxChildDataNode2.matchParentSize : false) {
                z = true;
            } else {
                Placeable mo833measureBRTryo02 = measurable2.mo833measureBRTryo0(j2);
                placeableArr[i3] = mo833measureBRTryo02;
                ref$IntRef.element = Math.max(ref$IntRef.element, mo833measureBRTryo02.width);
                ref$IntRef2.element = Math.max(ref$IntRef2.element, mo833measureBRTryo02.height);
            }
        }
        if (z) {
            int i4 = ref$IntRef.element;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = ref$IntRef2.element;
            long Constraints = ConstraintsKt.Constraints(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Measurable measurable3 = (Measurable) list.get(i7);
                Object parentData3 = measurable3.getParentData();
                BoxChildDataNode boxChildDataNode3 = parentData3 instanceof BoxChildDataNode ? (BoxChildDataNode) parentData3 : null;
                if (boxChildDataNode3 != null ? boxChildDataNode3.matchParentSize : false) {
                    placeableArr[i7] = measurable3.mo833measureBRTryo0(Constraints);
                }
            }
        }
        return MeasureScope.layout$default(measureScope, ref$IntRef.element, ref$IntRef2.element, new Function1() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                Placeable[] placeableArr2 = placeableArr;
                int length = placeableArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = i8;
                    Placeable placeable = placeableArr2[i9];
                    placeable.getClass();
                    BoxKt.access$placeInBox(placementScope, placeable, (Measurable) list.get(i10), measureScope.getLayoutDirection(), ref$IntRef.element, ref$IntRef2.element, this.alignment);
                    i9++;
                    i8 = i10 + 1;
                }
                return Unit.INSTANCE;
            }
        });
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.alignment);
        sb.append(", propagateMinConstraints=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.propagateMinConstraints, ')');
    }
}
