package androidx.compose.material;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.DpSize;
import com.squareup.cash.common.composeui.SegmentedCircleKt$$ExternalSyntheticLambda1;

/* loaded from: classes3.dex */
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        boolean z = isAttached() && ((Boolean) DepthSortedSetKt.currentValueOf(this, InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement)).booleanValue();
        long j2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize;
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        int i = mo833measureBRTryo0.width;
        if (z) {
            i = Math.max(i, measureScope.mo230roundToPx0680j_4(DpSize.m1044getWidthD9Ej5fM(j2)));
        }
        int i2 = mo833measureBRTryo0.height;
        if (z) {
            i2 = Math.max(i2, measureScope.mo230roundToPx0680j_4(DpSize.m1043getHeightD9Ej5fM(j2)));
        }
        return MeasureScope.layout$default(measureScope, i, i2, new SegmentedCircleKt$$ExternalSyntheticLambda1(i, i2, 1, mo833measureBRTryo0));
    }
}
