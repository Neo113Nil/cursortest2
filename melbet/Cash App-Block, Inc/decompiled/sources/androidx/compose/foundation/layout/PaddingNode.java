package androidx.compose.foundation.layout;

import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;

/* loaded from: classes.dex */
public final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    public float bottom;
    public float end;
    public boolean rtlAware;
    public float start;
    public float top;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(this.end) + measureScope.mo230roundToPx0680j_4(this.start);
        int mo230roundToPx0680j_42 = measureScope.mo230roundToPx0680j_4(this.bottom) + measureScope.mo230roundToPx0680j_4(this.top);
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(ConstraintsKt.m1034offsetNN6EwU(-mo230roundToPx0680j_4, -mo230roundToPx0680j_42, j));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m1033constrainWidthK40F9xA(mo833measureBRTryo0.width + mo230roundToPx0680j_4, j), ConstraintsKt.m1032constrainHeightK40F9xA(mo833measureBRTryo0.height + mo230roundToPx0680j_42, j), new Recomposer$$ExternalSyntheticLambda4(8, this, mo833measureBRTryo0));
    }
}
