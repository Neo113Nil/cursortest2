package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class DraggableAnchorsNodeV2 extends Modifier.Node implements LayoutModifierNode {
    public Function2 anchors;
    public boolean didLookahead;
    public Orientation orientation;
    public AnchoredDraggableState state;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        if (!measureScope.isLookingAhead() || !this.didLookahead) {
            Pair pair = (Pair) this.anchors.invoke(new IntSize((mo833measureBRTryo0.height & BodyPartID.bodyIdMax) | (mo833measureBRTryo0.width << 32)), new Constraints(j));
            this.state.updateAnchors((DefaultDraggableAnchors) pair.first, pair.second);
        }
        this.didLookahead = measureScope.isLookingAhead() || this.didLookahead;
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new MenuKt$$ExternalSyntheticLambda0(21, measureScope, this, mo833measureBRTryo0));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.didLookahead = false;
    }
}
