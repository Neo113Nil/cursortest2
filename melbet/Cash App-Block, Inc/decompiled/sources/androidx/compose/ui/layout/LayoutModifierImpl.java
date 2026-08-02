package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {
    public Function3 measureBlock;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        return (MeasureResult) this.measureBlock.invoke(measureScope, measurable, new Constraints(j));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
