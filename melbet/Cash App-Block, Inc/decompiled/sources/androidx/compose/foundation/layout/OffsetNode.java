package androidx.compose.foundation.layout;

import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;

/* loaded from: classes3.dex */
public final class OffsetNode extends Modifier.Node implements LayoutModifierNode {
    public boolean rtlAware;
    public float x;
    public float y;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ClickableKt$$ExternalSyntheticLambda0(20, this, mo833measureBRTryo0));
    }
}
