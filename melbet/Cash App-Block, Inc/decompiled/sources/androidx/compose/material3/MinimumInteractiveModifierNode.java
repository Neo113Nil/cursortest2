package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.common.composeui.SegmentedCircleKt$$ExternalSyntheticLambda1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyMap;

/* loaded from: classes3.dex */
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    public LinkedHashMap alignmentLinesCache;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float f = ((Dp) DepthSortedSetKt.currentValueOf(this, InteractiveComponentSizeKt.LocalMinimumInteractiveComponentSize)).value;
        if (f < RecyclerView.DECELERATION_RATE) {
            f = 0.0f;
        }
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        boolean z = isAttached() && !Float.isNaN(f) && Dp.m1036compareTo0680j_4(f, RecyclerView.DECELERATION_RATE) > 0;
        int mo230roundToPx0680j_4 = !Float.isNaN(f) ? measureScope.mo230roundToPx0680j_4(f) : 0;
        int i = mo833measureBRTryo0.width;
        if (z) {
            i = Math.max(i, mo230roundToPx0680j_4);
        }
        int i2 = mo833measureBRTryo0.height;
        if (z) {
            i2 = Math.max(i2, mo230roundToPx0680j_4);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.alignmentLinesCache;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.alignmentLinesCache = linkedHashMap;
            }
            VerticalAlignmentLine verticalAlignmentLine = InteractiveComponentSizeKt.MinimumInteractiveLeftAlignmentLine;
            int round = Math.round((mo230roundToPx0680j_4 - mo833measureBRTryo0.width) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(verticalAlignmentLine, Integer.valueOf(round));
            HorizontalAlignmentLine horizontalAlignmentLine = InteractiveComponentSizeKt.MinimumInteractiveTopAlignmentLine;
            int round2 = Math.round((mo230roundToPx0680j_4 - mo833measureBRTryo0.height) / 2.0f);
            linkedHashMap.put(horizontalAlignmentLine, Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        Map map = this.alignmentLinesCache;
        if (map == null) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        return measureScope.layout(i, i2, map, new SegmentedCircleKt$$ExternalSyntheticLambda1(i, i2, 2, mo833measureBRTryo0));
    }
}
