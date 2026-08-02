package com.squareup.cash.avatar.components;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.List;

/* loaded from: classes5.dex */
public final class StackedAvatarsKt$duoTrioMeasurePolicy$1 implements MeasurePolicy {
    public static final StackedAvatarsKt$duoTrioMeasurePolicy$1 INSTANCE = new StackedAvatarsKt$duoTrioMeasurePolicy$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        measureScope.getClass();
        list.getClass();
        if (list.size() < 2 || list.size() > 3) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Only support two or three measurables");
            return null;
        }
        int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
        boolean z = list.size() == 3;
        float f = m1025getMaxWidthimpl;
        int i = (int) (0.65f * f);
        long Constraints$default = ConstraintsKt.Constraints$default(0, i, 0, i, 5);
        float f2 = f * 0.35f;
        return MeasureScope.layout$default(measureScope, m1025getMaxWidthimpl, m1025getMaxWidthimpl, new StackedAvatarsKt$duoTrioMeasurePolicy$1$$ExternalSyntheticLambda0(((Measurable) list.get(0)).mo833measureBRTryo0(Constraints$default), z ? ((Measurable) list.get(1)).mo833measureBRTryo0(Constraints$default) : null, (int) (f2 / 2.0f), (z ? (Measurable) list.get(2) : (Measurable) list.get(1)).mo833measureBRTryo0(Constraints$default), (int) f2));
    }
}
