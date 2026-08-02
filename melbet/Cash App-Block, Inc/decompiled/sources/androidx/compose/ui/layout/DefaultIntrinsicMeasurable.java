package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeMeasuringIntrinsics$IntrinsicMinMax;
import androidx.compose.ui.node.NodeMeasuringIntrinsics$IntrinsicWidthHeight;
import androidx.compose.ui.unit.Constraints;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class DefaultIntrinsicMeasurable implements Measurable {
    public final /* synthetic */ int $r8$classId;
    public final IntrinsicMeasurable measurable;
    public final Enum minMax;
    public final Enum widthHeight;

    public /* synthetic */ DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, Enum r2, Enum r3, int i) {
        this.$r8$classId = i;
        this.measurable = intrinsicMeasurable;
        this.minMax = r2;
        this.widthHeight = r3;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final Object getParentData() {
        switch (this.$r8$classId) {
        }
        return this.measurable.getParentData();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int i) {
        switch (this.$r8$classId) {
        }
        return this.measurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int i) {
        switch (this.$r8$classId) {
        }
        return this.measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0, reason: not valid java name */
    public final Placeable mo833measureBRTryo0(long j) {
        int i = this.$r8$classId;
        Enum r1 = this.minMax;
        Enum r2 = this.widthHeight;
        IntrinsicMeasurable intrinsicMeasurable = this.measurable;
        int i2 = IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE;
        switch (i) {
            case 0:
                IntrinsicMinMax intrinsicMinMax = (IntrinsicMinMax) r1;
                if (((IntrinsicWidthHeight) r2) == IntrinsicWidthHeight.Width) {
                    int maxIntrinsicWidth = intrinsicMinMax == IntrinsicMinMax.Max ? intrinsicMeasurable.maxIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j)) : intrinsicMeasurable.minIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j));
                    if (Constraints.m1020getHasBoundedHeightimpl(j)) {
                        i2 = Constraints.m1024getMaxHeightimpl(j);
                    }
                    return new FixedSizeIntrinsicsPlaceable(maxIntrinsicWidth, i2, 0);
                }
                int maxIntrinsicHeight = intrinsicMinMax == IntrinsicMinMax.Max ? intrinsicMeasurable.maxIntrinsicHeight(Constraints.m1025getMaxWidthimpl(j)) : intrinsicMeasurable.minIntrinsicHeight(Constraints.m1025getMaxWidthimpl(j));
                if (Constraints.m1021getHasBoundedWidthimpl(j)) {
                    i2 = Constraints.m1025getMaxWidthimpl(j);
                }
                return new FixedSizeIntrinsicsPlaceable(i2, maxIntrinsicHeight, 0);
            default:
                NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax = (NodeMeasuringIntrinsics$IntrinsicMinMax) r1;
                if (((NodeMeasuringIntrinsics$IntrinsicWidthHeight) r2) == NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width) {
                    int maxIntrinsicWidth2 = nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? intrinsicMeasurable.maxIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j)) : intrinsicMeasurable.minIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j));
                    if (Constraints.m1020getHasBoundedHeightimpl(j)) {
                        i2 = Constraints.m1024getMaxHeightimpl(j);
                    }
                    return new FixedSizeIntrinsicsPlaceable(maxIntrinsicWidth2, i2, 1);
                }
                int maxIntrinsicHeight2 = nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? intrinsicMeasurable.maxIntrinsicHeight(Constraints.m1025getMaxWidthimpl(j)) : intrinsicMeasurable.minIntrinsicHeight(Constraints.m1025getMaxWidthimpl(j));
                if (Constraints.m1021getHasBoundedWidthimpl(j)) {
                    i2 = Constraints.m1025getMaxWidthimpl(j);
                }
                return new FixedSizeIntrinsicsPlaceable(i2, maxIntrinsicHeight2, 1);
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int i) {
        switch (this.$r8$classId) {
        }
        return this.measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int i) {
        switch (this.$r8$classId) {
        }
        return this.measurable.minIntrinsicWidth(i);
    }
}
