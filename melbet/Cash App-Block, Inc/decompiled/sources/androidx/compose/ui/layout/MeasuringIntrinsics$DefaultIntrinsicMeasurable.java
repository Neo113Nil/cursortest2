package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class MeasuringIntrinsics$DefaultIntrinsicMeasurable implements Measurable {
    public final IntrinsicMeasurable measurable;
    public final MeasuringIntrinsics$IntrinsicMinMax minMax;
    public final MeasuringIntrinsics$IntrinsicWidthHeight widthHeight;

    public MeasuringIntrinsics$DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax, MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight) {
        this.measurable = intrinsicMeasurable;
        this.minMax = measuringIntrinsics$IntrinsicMinMax;
        this.widthHeight = measuringIntrinsics$IntrinsicWidthHeight;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final Object getParentData() {
        return this.measurable.getParentData();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int i) {
        return this.measurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int i) {
        return this.measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public final Placeable mo833measureBRTryo0(long j) {
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight = MeasuringIntrinsics$IntrinsicWidthHeight.Width;
        final int i = IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE;
        IntrinsicMeasurable intrinsicMeasurable = this.measurable;
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight2 = this.widthHeight;
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = this.minMax;
        if (measuringIntrinsics$IntrinsicWidthHeight2 == measuringIntrinsics$IntrinsicWidthHeight) {
            final int maxIntrinsicWidth = measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? intrinsicMeasurable.maxIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j)) : intrinsicMeasurable.minIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j));
            if (Constraints.m1020getHasBoundedHeightimpl(j)) {
                i = Constraints.m1024getMaxHeightimpl(j);
            }
            return new Placeable(maxIntrinsicWidth, i) { // from class: androidx.compose.ui.layout.MeasuringIntrinsics$EmptyPlaceable
                {
                    m852setMeasuredSizeozmzZPI((i & BodyPartID.bodyIdMax) | (maxIntrinsicWidth << 32));
                }

                @Override // androidx.compose.ui.layout.Placeable
                public final int get(AlignmentLine alignmentLine) {
                    return PKIFailureInfo.systemUnavail;
                }

                @Override // androidx.compose.ui.layout.Placeable
                /* renamed from: placeAt-f8xVGno */
                public final void mo836placeAtf8xVGno(long j2, float f, Function1 function1) {
                }
            };
        }
        final int maxIntrinsicHeight = measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? intrinsicMeasurable.maxIntrinsicHeight(Constraints.m1025getMaxWidthimpl(j)) : intrinsicMeasurable.minIntrinsicHeight(Constraints.m1025getMaxWidthimpl(j));
        if (Constraints.m1021getHasBoundedWidthimpl(j)) {
            i = Constraints.m1025getMaxWidthimpl(j);
        }
        return new Placeable(i, maxIntrinsicHeight) { // from class: androidx.compose.ui.layout.MeasuringIntrinsics$EmptyPlaceable
            {
                m852setMeasuredSizeozmzZPI((maxIntrinsicHeight & BodyPartID.bodyIdMax) | (i << 32));
            }

            @Override // androidx.compose.ui.layout.Placeable
            public final int get(AlignmentLine alignmentLine) {
                return PKIFailureInfo.systemUnavail;
            }

            @Override // androidx.compose.ui.layout.Placeable
            /* renamed from: placeAt-f8xVGno */
            public final void mo836placeAtf8xVGno(long j2, float f, Function1 function1) {
            }
        };
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int i) {
        return this.measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int i) {
        return this.measurable.minIntrinsicWidth(i);
    }
}
