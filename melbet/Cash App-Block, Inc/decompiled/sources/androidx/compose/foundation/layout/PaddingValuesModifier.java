package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    public PaddingValues paddingValues;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float mo265calculateLeftPaddingu2uoSUM = this.paddingValues.mo265calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection());
        float mo267calculateTopPaddingD9Ej5fM = this.paddingValues.mo267calculateTopPaddingD9Ej5fM();
        float mo266calculateRightPaddingu2uoSUM = this.paddingValues.mo266calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection());
        float mo264calculateBottomPaddingD9Ej5fM = this.paddingValues.mo264calculateBottomPaddingD9Ej5fM();
        if (!((Dp.m1036compareTo0680j_4(mo265calculateLeftPaddingu2uoSUM, RecyclerView.DECELERATION_RATE) >= 0) & (Dp.m1036compareTo0680j_4(mo267calculateTopPaddingD9Ej5fM, RecyclerView.DECELERATION_RATE) >= 0) & (Dp.m1036compareTo0680j_4(mo266calculateRightPaddingu2uoSUM, RecyclerView.DECELERATION_RATE) >= 0) & (Dp.m1036compareTo0680j_4(mo264calculateBottomPaddingD9Ej5fM, RecyclerView.DECELERATION_RATE) >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
        int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(mo265calculateLeftPaddingu2uoSUM);
        int mo230roundToPx0680j_42 = measureScope.mo230roundToPx0680j_4(mo266calculateRightPaddingu2uoSUM) + mo230roundToPx0680j_4;
        int mo230roundToPx0680j_43 = measureScope.mo230roundToPx0680j_4(mo267calculateTopPaddingD9Ej5fM);
        int mo230roundToPx0680j_44 = measureScope.mo230roundToPx0680j_4(mo264calculateBottomPaddingD9Ej5fM) + mo230roundToPx0680j_43;
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(ConstraintsKt.m1034offsetNN6EwU(-mo230roundToPx0680j_42, -mo230roundToPx0680j_44, j));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m1033constrainWidthK40F9xA(mo833measureBRTryo0.width + mo230roundToPx0680j_42, j), ConstraintsKt.m1032constrainHeightK40F9xA(mo833measureBRTryo0.height + mo230roundToPx0680j_44, j), new PaddingValuesModifier$$ExternalSyntheticLambda0(mo230roundToPx0680j_4, mo230roundToPx0680j_43, 0, mo833measureBRTryo0));
    }
}
