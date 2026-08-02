package com.squareup.cash.paymentpad.views;

import androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda8;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.squareup.cash.avatar.components.StackedAvatarsKt$duoTrioMeasurePolicy$1$$ExternalSyntheticLambda0;
import java.util.List;

/* loaded from: classes6.dex */
public final class MainPaymentPadViewKt$PayTapToPayRequestButtons$1$1 implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        measureScope.getClass();
        list.getClass();
        int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(8.0f);
        Measurable measurable = (Measurable) list.get(0);
        Measurable measurable2 = (Measurable) list.get(1);
        Measurable measurable3 = (Measurable) list.get(2);
        int m1025getMaxWidthimpl = (Constraints.m1025getMaxWidthimpl(j) - (mo230roundToPx0680j_4 * 2)) / 3;
        int minIntrinsicWidth = measurable.minIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j));
        int minIntrinsicWidth2 = measurable3.minIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j));
        if (minIntrinsicWidth <= m1025getMaxWidthimpl && minIntrinsicWidth2 <= m1025getMaxWidthimpl) {
            Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, m1025getMaxWidthimpl, m1025getMaxWidthimpl, 0, 0, 8));
            Placeable mo833measureBRTryo02 = measurable2.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, m1025getMaxWidthimpl, m1025getMaxWidthimpl, 0, 0, 8));
            Placeable mo833measureBRTryo03 = measurable3.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, m1025getMaxWidthimpl, m1025getMaxWidthimpl, 0, 0, 8));
            return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), Math.max(mo833measureBRTryo0.height, Math.max(mo833measureBRTryo02.height, mo833measureBRTryo03.height)), new StackedAvatarsKt$duoTrioMeasurePolicy$1$$ExternalSyntheticLambda0(mo833measureBRTryo0, mo833measureBRTryo02, m1025getMaxWidthimpl, mo230roundToPx0680j_4, mo833measureBRTryo03));
        }
        int m1025getMaxWidthimpl2 = (Constraints.m1025getMaxWidthimpl(j) - mo230roundToPx0680j_4) / 2;
        Placeable mo833measureBRTryo04 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, m1025getMaxWidthimpl2, m1025getMaxWidthimpl2, 0, 0, 8));
        Placeable mo833measureBRTryo05 = measurable3.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, m1025getMaxWidthimpl2, m1025getMaxWidthimpl2, 0, 0, 8));
        int max = Math.max(mo833measureBRTryo04.height, mo833measureBRTryo05.height);
        Placeable mo833measureBRTryo06 = measurable2.mo833measureBRTryo0(Constraints.m1017copyZbe2FdA(Constraints.m1025getMaxWidthimpl(j), Constraints.m1025getMaxWidthimpl(j), max, max));
        return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), max + mo230roundToPx0680j_4 + max, new ViewfinderKt$$ExternalSyntheticLambda8(mo833measureBRTryo04, mo833measureBRTryo05, m1025getMaxWidthimpl2, mo230roundToPx0680j_4, mo833measureBRTryo06, max));
    }
}
