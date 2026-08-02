package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {
    public float fraction;
    public State heightState;
    public State widthState;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        State state = this.widthState;
        int round = (state == null || ((Number) state.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) state.getValue()).floatValue() * this.fraction);
        State state2 = this.heightState;
        int round2 = (state2 == null || ((Number) state2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) state2.getValue()).floatValue() * this.fraction);
        int m1027getMinWidthimpl = round != Integer.MAX_VALUE ? round : Constraints.m1027getMinWidthimpl(j);
        int m1026getMinHeightimpl = round2 != Integer.MAX_VALUE ? round2 : Constraints.m1026getMinHeightimpl(j);
        if (round == Integer.MAX_VALUE) {
            round = Constraints.m1025getMaxWidthimpl(j);
        }
        if (round2 == Integer.MAX_VALUE) {
            round2 = Constraints.m1024getMaxHeightimpl(j);
        }
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(ConstraintsKt.Constraints(m1027getMinWidthimpl, round, m1026getMinHeightimpl, round2));
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 4));
    }
}
