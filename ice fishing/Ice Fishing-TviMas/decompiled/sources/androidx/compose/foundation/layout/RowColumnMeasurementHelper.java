package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: RowColumnMeasurementHelper.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\u0002\u0010\u0014J2\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010&2\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020+H\u0002J(\u00102\u001a\u0002032\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u0002032\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u000207H\u0002J0\u00108\u001a\u0002092\u0006\u00106\u001a\u0002072\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020+2\u0006\u0010=\u001a\u00020+ø\u0001\u0000¢\u0006\u0004\b>\u0010?J&\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020+2\u0006\u0010/\u001a\u000200J\n\u0010\n\u001a\u00020+*\u00020\u0013J\n\u0010F\u001a\u00020+*\u00020\u0013R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001b\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0018\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArrangementSpacing-D9Ej5fM", "()F", "F", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisSize", "()Landroidx/compose/foundation/layout/SizeMode;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getMeasurables", "()Ljava/util/List;", "getOrientation", "()Landroidx/compose/foundation/layout/LayoutOrientation;", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", "[Landroidx/compose/ui/layout/Placeable;", "rowColumnParentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "[Landroidx/compose/foundation/layout/RowColumnParentData;", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getCrossAxisPosition", "", "placeable", "parentData", "crossAxisLayoutSize", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "beforeCrossAxisAlignmentLine", "mainAxisPositions", "", "mainAxisLayoutSize", "childrenMainAxisSize", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measureWithoutPlacing", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "startIndex", "endIndex", "measureWithoutPlacing-_EkL_-Y", "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "placeHelper", "", "placeableScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "measureResult", "crossAxisOffset", "mainAxisSize", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RowColumnMeasurementHelper {
    public static final int $stable = 8;
    private final float arrangementSpacing;
    private final CrossAxisAlignment crossAxisAlignment;
    private final SizeMode crossAxisSize;
    private final Arrangement.Horizontal horizontalArrangement;
    private final List<Measurable> measurables;
    private final LayoutOrientation orientation;
    private final Placeable[] placeables;
    private final RowColumnParentData[] rowColumnParentData;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List list, Placeable[] placeableArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, horizontal, vertical, f, sizeMode, crossAxisAlignment, list, placeableArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List<? extends Measurable> list, Placeable[] placeableArr) {
        this.orientation = layoutOrientation;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.arrangementSpacing = f;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
        this.measurables = list;
        this.placeables = placeableArr;
        int size = list.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i = 0; i < size; i++) {
            rowColumnParentDataArr[i] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i));
        }
        this.rowColumnParentData = rowColumnParentDataArr;
    }

    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    public final Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* renamed from: getArrangementSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getArrangementSpacing() {
        return this.arrangementSpacing;
    }

    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    public final int mainAxisSize(Placeable placeable) {
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    public final int crossAxisSize(Placeable placeable) {
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: measureWithoutPlacing-_EkL_-Y, reason: not valid java name */
    public final RowColumnMeasureHelperResult m591measureWithoutPlacing_EkL_Y(MeasureScope measureScope, long constraints, int startIndex, int endIndex) {
        int i;
        String str;
        String str2;
        float f;
        String str3;
        String str4;
        long j;
        String str5;
        String str6;
        int i2;
        RowColumnMeasurementHelper rowColumnMeasurementHelper;
        int coerceIn;
        long j2;
        String str7;
        int i3;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        long j3;
        String str13;
        String str14;
        String str15;
        long j4;
        long j5;
        float f2;
        int i4;
        int i5;
        RowColumnMeasurementHelper rowColumnMeasurementHelper2;
        int i6;
        int i7;
        long j6;
        float f3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j7;
        int coerceAtLeast;
        RowColumnMeasurementHelper rowColumnMeasurementHelper3 = this;
        int i13 = endIndex;
        long m531constructorimpl = OrientationIndependentConstraints.m531constructorimpl(constraints, rowColumnMeasurementHelper3.orientation);
        long j8 = measureScope.mo307roundToPx0680j_4(rowColumnMeasurementHelper3.arrangementSpacing);
        int i14 = i13 - startIndex;
        int i15 = startIndex;
        float f4 = 0.0f;
        long j9 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (i15 >= i13) {
                break;
            }
            Measurable measurable = rowColumnMeasurementHelper3.measurables.get(i15);
            RowColumnParentData rowColumnParentData = rowColumnMeasurementHelper3.rowColumnParentData[i15];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > 0.0f) {
                f3 = f4 + weight;
                i8 = i16 + 1;
                i9 = i15;
            } else {
                int m5690getMaxWidthimpl = Constraints.m5690getMaxWidthimpl(m531constructorimpl);
                Placeable placeable = rowColumnMeasurementHelper3.placeables[i15];
                if (placeable == null) {
                    float f5 = f4;
                    if (m5690getMaxWidthimpl == Integer.MAX_VALUE) {
                        i11 = i16;
                        i12 = m5690getMaxWidthimpl;
                        coerceAtLeast = Integer.MAX_VALUE;
                        j7 = 0;
                    } else {
                        i11 = i16;
                        i12 = m5690getMaxWidthimpl;
                        j7 = 0;
                        coerceAtLeast = (int) RangesKt.coerceAtLeast(m5690getMaxWidthimpl - j9, 0L);
                    }
                    j6 = j9;
                    f3 = f5;
                    i8 = i11;
                    i9 = i15;
                    i10 = i12;
                    placeable = measurable.mo4678measureBRTryo0(OrientationIndependentConstraints.m544toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m533copyyUG9Ft0$default(m531constructorimpl, 0, coerceAtLeast, 0, 0, 8, null), rowColumnMeasurementHelper3.orientation));
                } else {
                    j6 = j9;
                    f3 = f4;
                    i8 = i16;
                    i9 = i15;
                    i10 = m5690getMaxWidthimpl;
                }
                long j10 = j6;
                int min = Math.min((int) j8, (int) RangesKt.coerceAtLeast((i10 - j10) - rowColumnMeasurementHelper3.mainAxisSize(placeable), 0L));
                j9 = rowColumnMeasurementHelper3.mainAxisSize(placeable) + min + j10;
                int max = Math.max(i18, rowColumnMeasurementHelper3.crossAxisSize(placeable));
                if (!z && !RowColumnImplKt.isRelative(rowColumnParentData)) {
                    z2 = false;
                }
                rowColumnMeasurementHelper3.placeables[i9] = placeable;
                i17 = min;
                i18 = max;
                z = z2;
            }
            i15 = i9 + 1;
            f4 = f3;
            i16 = i8;
        }
        long j11 = j9;
        float f6 = f4;
        int i19 = i16;
        if (i19 == 0) {
            j2 = j11 - i17;
            rowColumnMeasurementHelper = rowColumnMeasurementHelper3;
            i = i14;
            i2 = i18;
            coerceIn = 0;
        } else {
            float f7 = f6;
            int m5692getMinWidthimpl = (f7 <= 0.0f || Constraints.m5690getMaxWidthimpl(m531constructorimpl) == Integer.MAX_VALUE) ? Constraints.m5692getMinWidthimpl(m531constructorimpl) : Constraints.m5690getMaxWidthimpl(m531constructorimpl);
            long j12 = (i19 - 1) * j8;
            long coerceAtLeast2 = RangesKt.coerceAtLeast((m5692getMinWidthimpl - j11) - j12, 0L);
            float f8 = f7 > 0.0f ? coerceAtLeast2 / f7 : 0.0f;
            int i20 = startIndex;
            long j13 = coerceAtLeast2;
            while (true) {
                i = i14;
                str = "weightedSize ";
                str2 = "weightUnitSpace ";
                f = f7;
                str3 = "fixedSpace ";
                str4 = "weightChildrenCount ";
                j = coerceAtLeast2;
                str5 = "arrangementSpacingPx ";
                str6 = "targetSpace ";
                if (i20 >= i13) {
                    break;
                }
                float weight2 = RowColumnImplKt.getWeight(rowColumnMeasurementHelper3.rowColumnParentData[i20]);
                float f9 = f8 * weight2;
                try {
                    j13 -= MathKt.roundToInt(f9);
                    i20++;
                    rowColumnMeasurementHelper3 = this;
                    i14 = i;
                    i13 = endIndex;
                    f7 = f;
                    coerceAtLeast2 = j;
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ");
                    sb.append(Constraints.m5690getMaxWidthimpl(m531constructorimpl)).append("mainAxisMin ").append(Constraints.m5692getMinWidthimpl(m531constructorimpl)).append("targetSpace ").append(m5692getMinWidthimpl).append("arrangementSpacingPx ").append(j8).append("weightChildrenCount ").append(i19).append("fixedSpace ").append(j11).append("arrangementSpacingTotal ").append(j12).append("remainingToTarget ").append(j).append("totalWeight ").append(f).append(str2).append(f8).append("itemWeight ").append(weight2).append(str);
                    sb.append(f9);
                    throw new IllegalArgumentException(sb.toString()).initCause(e);
                }
            }
            long j14 = j12;
            long j15 = j;
            long j16 = j11;
            long j17 = j8;
            String str16 = "arrangementSpacingTotal ";
            String str17 = "remainingToTarget ";
            int i21 = 0;
            int i22 = startIndex;
            int i23 = endIndex;
            int i24 = i18;
            String str18 = "totalWeight ";
            i2 = i24;
            while (i22 < i23) {
                String str19 = str3;
                if (this.placeables[i22] == null) {
                    Measurable measurable2 = this.measurables.get(i22);
                    i3 = i19;
                    RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i22];
                    String str20 = str4;
                    float weight3 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (weight3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    long j18 = j17;
                    int sign = MathKt.getSign(j13);
                    String str21 = str5;
                    String str22 = str6;
                    j13 -= sign;
                    float f10 = f8 * weight3;
                    int max2 = Math.max(0, MathKt.roundToInt(f10) + sign);
                    try {
                        if (!RowColumnImplKt.getFill(rowColumnParentData2) || max2 == Integer.MAX_VALUE) {
                            i4 = sign;
                            i5 = 0;
                        } else {
                            i5 = max2;
                            i4 = sign;
                        }
                        try {
                            f2 = f10;
                            try {
                                Placeable mo4678measureBRTryo0 = measurable2.mo4678measureBRTryo0(OrientationIndependentConstraints.m544toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m529constructorimpl(i5, max2, 0, Constraints.m5689getMaxHeightimpl(m531constructorimpl)), this.orientation));
                                i21 += mainAxisSize(mo4678measureBRTryo0);
                                i2 = Math.max(i2, crossAxisSize(mo4678measureBRTryo0));
                                boolean z3 = z || RowColumnImplKt.isRelative(rowColumnParentData2);
                                this.placeables[i22] = mo4678measureBRTryo0;
                                z = z3;
                                str9 = str;
                                j3 = j16;
                                j17 = j18;
                                str7 = str21;
                                str10 = str22;
                                str11 = str18;
                                str14 = str16;
                                str15 = str19;
                                str8 = str20;
                                str12 = str2;
                                j5 = j15;
                                str13 = str17;
                                j4 = j14;
                            } catch (IllegalArgumentException e2) {
                                e = e2;
                                StringBuilder sb2 = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ");
                                sb2.append(Constraints.m5690getMaxWidthimpl(m531constructorimpl)).append("mainAxisMin ").append(Constraints.m5692getMinWidthimpl(m531constructorimpl)).append(str22).append(m5692getMinWidthimpl).append(str21).append(j18).append(str20).append(i3).append(str19).append(j16).append(str16).append(j14).append(str17).append(j15).append(str18).append(f).append(str2).append(f8).append("weight ").append(weight3).append(str);
                                sb2.append(f2).append("remainderUnit ").append(i4).append("childMainAxisSize ").append(max2);
                                throw new IllegalArgumentException(sb2.toString()).initCause(e);
                            }
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            f2 = f10;
                        }
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        f2 = f10;
                        i4 = sign;
                    }
                } else {
                    str7 = str5;
                    i3 = i19;
                    str8 = str4;
                    str9 = str;
                    str10 = str6;
                    str11 = str18;
                    str12 = str2;
                    j3 = j16;
                    str13 = str17;
                    str14 = str16;
                    str15 = str19;
                    j4 = j14;
                    j5 = j15;
                }
                i22++;
                i23 = endIndex;
                j14 = j4;
                j15 = j5;
                str17 = str13;
                str16 = str14;
                str2 = str12;
                str18 = str11;
                str = str9;
                str4 = str8;
                long j19 = j3;
                str6 = str10;
                str5 = str7;
                str3 = str15;
                i19 = i3;
                j16 = j19;
            }
            rowColumnMeasurementHelper = this;
            long j20 = j16;
            coerceIn = (int) RangesKt.coerceIn(i21 + j14, 0L, Constraints.m5690getMaxWidthimpl(m531constructorimpl) - j20);
            j2 = j20;
        }
        if (z) {
            rowColumnMeasurementHelper2 = rowColumnMeasurementHelper;
            i6 = 0;
            i7 = 0;
            for (int i25 = startIndex; i25 < endIndex; i25++) {
                Placeable placeable2 = rowColumnMeasurementHelper2.placeables[i25];
                Intrinsics.checkNotNull(placeable2);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(rowColumnMeasurementHelper2.rowColumnParentData[i25]);
                Integer calculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable2) : null;
                if (calculateAlignmentLinePosition$foundation_layout_release != null) {
                    Integer num = calculateAlignmentLinePosition$foundation_layout_release;
                    int intValue = num.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    i6 = Math.max(i6, intValue);
                    int crossAxisSize = rowColumnMeasurementHelper2.crossAxisSize(placeable2);
                    int intValue2 = num.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = rowColumnMeasurementHelper2.crossAxisSize(placeable2);
                    }
                    i7 = Math.max(i7, crossAxisSize - intValue2);
                }
            }
        } else {
            rowColumnMeasurementHelper2 = rowColumnMeasurementHelper;
            i6 = 0;
            i7 = 0;
        }
        int max3 = Math.max((int) RangesKt.coerceAtLeast(j2 + coerceIn, 0L), Constraints.m5692getMinWidthimpl(m531constructorimpl));
        int max4 = (Constraints.m5689getMaxHeightimpl(m531constructorimpl) == Integer.MAX_VALUE || rowColumnMeasurementHelper2.crossAxisSize != SizeMode.Expand) ? Math.max(i2, Math.max(Constraints.m5691getMinHeightimpl(m531constructorimpl), i7 + i6)) : Constraints.m5689getMaxHeightimpl(m531constructorimpl);
        int i26 = i;
        int[] iArr = new int[i26];
        for (int i27 = 0; i27 < i26; i27++) {
            iArr[i27] = 0;
        }
        int[] iArr2 = new int[i26];
        for (int i28 = 0; i28 < i26; i28++) {
            Placeable placeable3 = rowColumnMeasurementHelper2.placeables[i28 + startIndex];
            Intrinsics.checkNotNull(placeable3);
            iArr2[i28] = rowColumnMeasurementHelper2.mainAxisSize(placeable3);
        }
        return new RowColumnMeasureHelperResult(max4, max3, startIndex, endIndex, i6, rowColumnMeasurementHelper2.mainAxisPositions(max3, iArr2, iArr, measureScope));
    }

    private final int[] mainAxisPositions(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, MeasureScope measureScope) {
        if (this.orientation == LayoutOrientation.Vertical) {
            Arrangement.Vertical vertical = this.verticalArrangement;
            if (vertical == null) {
                throw new IllegalArgumentException("null verticalArrangement in Column".toString());
            }
            vertical.arrange(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
        } else {
            Arrangement.Horizontal horizontal = this.horizontalArrangement;
            if (horizontal == null) {
                throw new IllegalArgumentException("null horizontalArrangement in Row".toString());
            }
            horizontal.arrange(measureScope, mainAxisLayoutSize, childrenMainAxisSize, measureScope.getLayoutDirection(), mainAxisPositions);
        }
        return mainAxisPositions;
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData parentData, int crossAxisLayoutSize, LayoutDirection layoutDirection, int beforeCrossAxisAlignmentLine) {
        CrossAxisAlignment crossAxisAlignment;
        if (parentData == null || (crossAxisAlignment = parentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = this.crossAxisAlignment;
        }
        int crossAxisSize = crossAxisLayoutSize - crossAxisSize(placeable);
        if (this.orientation == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(crossAxisSize, layoutDirection, placeable, beforeCrossAxisAlignmentLine);
    }

    public final void placeHelper(Placeable.PlacementScope placeableScope, RowColumnMeasureHelperResult measureResult, int crossAxisOffset, LayoutDirection layoutDirection) {
        int endIndex = measureResult.getEndIndex();
        for (int startIndex = measureResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            Intrinsics.checkNotNull(placeable);
            int[] mainAxisPositions = measureResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            int crossAxisPosition = getCrossAxisPosition(placeable, parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null, measureResult.getCrossAxisSize(), layoutDirection, measureResult.getBeforeCrossAxisAlignmentLine()) + crossAxisOffset;
            if (this.orientation == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placeableScope, placeable, mainAxisPositions[startIndex - measureResult.getStartIndex()], crossAxisPosition, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placeableScope, placeable, crossAxisPosition, mainAxisPositions[startIndex - measureResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }
}
