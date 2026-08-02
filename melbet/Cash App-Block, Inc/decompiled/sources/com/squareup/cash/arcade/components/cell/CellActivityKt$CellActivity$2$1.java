package com.squareup.cash.arcade.components.cell;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class CellActivityKt$CellActivity$2$1 implements MultiContentMeasurePolicy {
    public final /* synthetic */ Object $accessoryScope;
    public final /* synthetic */ boolean $centerVertically;
    public final /* synthetic */ int $r8$classId = 0;

    public CellActivityKt$CellActivity$2$1(RealCellActivityAccessoryScope realCellActivityAccessoryScope, boolean z) {
        this.$accessoryScope = realCellActivityAccessoryScope;
        this.$centerVertically = z;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo263measure3p2s80s(MeasureScope measureScope, List list, long j) {
        int maxOf;
        int i = this.$r8$classId;
        boolean z = true;
        Object obj = this.$accessoryScope;
        measureScope.getClass();
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) list;
                List list2 = (List) arrayList.get(0);
                List list3 = (List) arrayList.get(1);
                List list4 = (List) arrayList.get(2);
                List list5 = (List) arrayList.get(3);
                long m1018copyZbe2FdA$default = Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 10);
                final Placeable mo833measureBRTryo0 = ((Measurable) CollectionsKt.single(list2)).mo833measureBRTryo0(m1018copyZbe2FdA$default);
                final Placeable mo833measureBRTryo02 = ((Measurable) CollectionsKt.single(list4)).mo833measureBRTryo0(m1018copyZbe2FdA$default);
                int ordinal = ((RealCellActivityAccessoryScope.Type) ((RealCellActivityAccessoryScope) obj).type$delegate.getValue()).ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    z = false;
                }
                final int mo230roundToPx0680j_4 = ((mo833measureBRTryo02.width <= 0 || !z) ? 0 : measureScope.mo230roundToPx0680j_4(16.0f)) + mo833measureBRTryo02.width;
                Measurable measurable = (Measurable) CollectionsKt.singleOrNull(list5);
                r9 = measurable != null ? measurable.mo833measureBRTryo0(m1018copyZbe2FdA$default) : null;
                final int i2 = r9 != null ? r9.width : 0;
                int i3 = r9 != null ? r9.height : 0;
                final int mo230roundToPx0680j_42 = measureScope.mo230roundToPx0680j_4(16.0f);
                int m1025getMaxWidthimpl = (((Constraints.m1025getMaxWidthimpl(m1018copyZbe2FdA$default) - mo833measureBRTryo0.width) - i2) - mo230roundToPx0680j_4) - (mo230roundToPx0680j_42 * 2);
                Measurable measurable2 = (Measurable) CollectionsKt.single(list3);
                if (m1025getMaxWidthimpl < 0) {
                    m1025getMaxWidthimpl = 0;
                }
                if (m1025getMaxWidthimpl < 0) {
                    InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
                }
                final Placeable mo833measureBRTryo03 = measurable2.mo833measureBRTryo0(ConstraintsKt.createConstraints(m1025getMaxWidthimpl, m1025getMaxWidthimpl, 0, Integer.MAX_VALUE));
                final int m1025getMaxWidthimpl2 = Constraints.m1025getMaxWidthimpl(m1018copyZbe2FdA$default);
                final int maxOf2 = ComparisonsKt___ComparisonsJvmKt.maxOf(Constraints.m1026getMinHeightimpl(m1018copyZbe2FdA$default), mo833measureBRTryo0.height, mo833measureBRTryo03.height, i3);
                int m1025getMaxWidthimpl3 = Constraints.m1025getMaxWidthimpl(m1018copyZbe2FdA$default);
                final RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                final boolean z2 = this.$centerVertically;
                final int i4 = i3;
                final Placeable placeable = r9;
                return MeasureScope.layout$default(measureScope, m1025getMaxWidthimpl3, maxOf2, new Function1() { // from class: com.squareup.cash.arcade.components.cell.CellActivityKt$CellActivity$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i5;
                        int i6;
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj2;
                        placementScope.getClass();
                        boolean z3 = z2;
                        int i7 = maxOf2;
                        Placeable placeable2 = mo833measureBRTryo0;
                        int i8 = 0;
                        int i9 = z3 ? (i7 / 2) - (placeable2.height / 2) : 0;
                        placementScope.placeRelative(placeable2, 0, i9, RecyclerView.DECELERATION_RATE);
                        Placeable placeable3 = mo833measureBRTryo03;
                        int i10 = z3 ? (i7 / 2) - (placeable3.height / 2) : 0;
                        placementScope.placeRelative(placeable3, placeable2.width + mo230roundToPx0680j_42, i10, RecyclerView.DECELERATION_RATE);
                        int ordinal2 = ((RealCellActivityAccessoryScope.Type) realCellActivityAccessoryScope.type$delegate.getValue()).ordinal();
                        int i11 = i4;
                        if (ordinal2 != 0) {
                            if (ordinal2 == 1) {
                                i5 = i7 / 2;
                                i6 = i11 / 2;
                            } else {
                                if (ordinal2 != 2 && ordinal2 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                if (z3) {
                                    i5 = i7 / 2;
                                    i6 = i11 / 2;
                                }
                            }
                            i8 = i5 - i6;
                        } else {
                            i8 = i10;
                        }
                        Placeable placeable4 = placeable;
                        int i12 = m1025getMaxWidthimpl2;
                        if (placeable4 != null) {
                            placementScope.placeRelative(placeable4, i12 - placeable4.width, i8, RecyclerView.DECELERATION_RATE);
                        }
                        Placeable placeable5 = mo833measureBRTryo02;
                        int i13 = placeable5.height;
                        placementScope.placeRelative(placeable5, (i12 - i2) - mo230roundToPx0680j_4, placeable4 != null ? ((i11 / 2) + i8) - (i13 / 2) : (i13 / 2) + i9, RecyclerView.DECELERATION_RATE);
                        return Unit.INSTANCE;
                    }
                });
            default:
                ArrayList arrayList2 = (ArrayList) list;
                List list6 = (List) arrayList2.get(0);
                List list7 = (List) arrayList2.get(1);
                List list8 = (List) arrayList2.get(2);
                List list9 = (List) arrayList2.get(3);
                Measurable measurable3 = (Measurable) CollectionsKt.singleOrNull(list6);
                Placeable mo833measureBRTryo04 = measurable3 != null ? measurable3.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 10)) : null;
                Measurable measurable4 = (Measurable) CollectionsKt.singleOrNull(list8);
                Placeable mo833measureBRTryo05 = measurable4 != null ? measurable4.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 10)) : null;
                Measurable measurable5 = (Measurable) CollectionsKt.singleOrNull(list9);
                if (measurable5 != null) {
                    int m1025getMaxWidthimpl4 = Constraints.m1025getMaxWidthimpl(j);
                    int m1025getMaxWidthimpl5 = Constraints.m1025getMaxWidthimpl(j) / 2;
                    r9 = measurable5.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, m1025getMaxWidthimpl4 > m1025getMaxWidthimpl5 ? m1025getMaxWidthimpl5 : m1025getMaxWidthimpl4, 0, 0, 8));
                }
                int i5 = mo833measureBRTryo04 != null ? mo833measureBRTryo04.width : 0;
                int i6 = mo833measureBRTryo05 != null ? mo833measureBRTryo05.width : 0;
                int i7 = r9 != null ? r9.width : 0;
                final int mo230roundToPx0680j_43 = i5 > 0 ? measureScope.mo230roundToPx0680j_4(16.0f) + i5 : 0;
                int mo230roundToPx0680j_44 = (i6 > 0 || i7 > 0) ? measureScope.mo230roundToPx0680j_4(16.0f) + i6 + i7 : 0;
                int i8 = mo230roundToPx0680j_43 + mo230roundToPx0680j_44;
                int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j) - i8;
                int i9 = m1027getMinWidthimpl < 0 ? 0 : m1027getMinWidthimpl;
                int m1025getMaxWidthimpl6 = Constraints.m1025getMaxWidthimpl(j) - i8;
                final Placeable mo833measureBRTryo06 = ((Measurable) CollectionsKt.single(list7)).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, i9, m1025getMaxWidthimpl6 < 0 ? 0 : m1025getMaxWidthimpl6, 0, 0, 8));
                final int m1025getMaxWidthimpl7 = Constraints.m1023getHasFixedWidthimpl(j) ? Constraints.m1025getMaxWidthimpl(j) : mo230roundToPx0680j_44 + mo833measureBRTryo06.width + mo230roundToPx0680j_43;
                if (Constraints.m1022getHasFixedHeightimpl(j)) {
                    maxOf = Constraints.m1024getMaxHeightimpl(j);
                } else {
                    maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(mo833measureBRTryo04 != null ? mo833measureBRTryo04.height : 0, mo833measureBRTryo06.height, mo833measureBRTryo05 != null ? mo833measureBRTryo05.height : 0, r9 != null ? r9.height : 0);
                }
                final int i10 = maxOf;
                final CellDefaultAccessory cellDefaultAccessory = (CellDefaultAccessory) obj;
                final boolean z3 = this.$centerVertically;
                final Placeable placeable2 = mo833measureBRTryo04;
                final Placeable placeable3 = r9;
                final Placeable placeable4 = mo833measureBRTryo05;
                return MeasureScope.layout$default(measureScope, m1025getMaxWidthimpl7, i10, new Function1() { // from class: com.squareup.cash.arcade.components.cell.CellDefaultKt$CellDefaultBase$cellContent$1$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i11;
                        int i12;
                        int i13;
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj2;
                        placementScope.getClass();
                        Placeable placeable5 = mo833measureBRTryo06;
                        int i14 = placeable5.height;
                        int i15 = i10;
                        int i16 = (i15 - i14) / 2;
                        placementScope.placeRelative(placeable5, mo230roundToPx0680j_43, i16, RecyclerView.DECELERATION_RATE);
                        Placeable placeable6 = placeable2;
                        boolean z4 = z3;
                        if (placeable6 != null) {
                            if (z4) {
                                i13 = (i15 - placeable6.height) / 2;
                            } else {
                                i13 = placeable5.get(AlignmentLinesKt.FirstLineCenter) - (placeable6.height / 2);
                                if (i13 < 0) {
                                    i13 = 0;
                                }
                            }
                            placementScope.placeRelative(placeable6, 0, i13, RecyclerView.DECELERATION_RATE);
                        }
                        Placeable placeable7 = placeable3;
                        int i17 = m1025getMaxWidthimpl7;
                        CellDefaultAccessory cellDefaultAccessory2 = cellDefaultAccessory;
                        if (placeable7 != null) {
                            i17 -= placeable7.width;
                            if (z4) {
                                i11 = (i15 - placeable7.height) / 2;
                            } else if (cellDefaultAccessory2.getConfig().centerToFirstLine) {
                                int i18 = placeable5.get(AlignmentLinesKt.FirstLineCenter) - (placeable7.height / 2);
                                if (i18 < 0) {
                                    i18 = 0;
                                }
                                i11 = i18 + i16;
                            } else {
                                i11 = 0;
                            }
                            placementScope.placeRelative(placeable7, i17, i11, RecyclerView.DECELERATION_RATE);
                        } else {
                            i11 = 0;
                        }
                        Placeable placeable8 = placeable4;
                        if (placeable8 != null) {
                            int i19 = i17 - placeable8.width;
                            if (z4) {
                                i12 = (i15 - placeable8.height) / 2;
                            } else if (cellDefaultAccessory2.getConfig().centerToFirstLine) {
                                int i20 = placeable5.get(AlignmentLinesKt.FirstLineCenter) - (placeable8.height / 2);
                                i12 = i16 + (i20 >= 0 ? i20 : 0);
                            } else {
                                int i21 = ((placeable7 != null ? placeable7.height : 0) - placeable8.height) / 2;
                                i12 = i11 + (i21 >= 0 ? i21 : 0);
                            }
                            placementScope.placeRelative(placeable8, i19, i12, RecyclerView.DECELERATION_RATE);
                        }
                        return Unit.INSTANCE;
                    }
                });
        }
    }

    public CellActivityKt$CellActivity$2$1(boolean z, CellDefaultAccessory cellDefaultAccessory) {
        this.$centerVertically = z;
        this.$accessoryScope = cellDefaultAccessory;
    }
}
