package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/handwriting/StylusHandwritingNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class StylusHandwritingElement extends ModifierNodeElement {
    public final Function0 onHandwritingSlopExceeded;

    public StylusHandwritingElement(Function0 function0) {
        this.onHandwritingSlopExceeded = function0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new StylusHandwritingNode(this.onHandwritingSlopExceeded);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StylusHandwritingElement) {
            return this.onHandwritingSlopExceeded == ((StylusHandwritingElement) obj).onHandwritingSlopExceeded;
        }
        return false;
    }

    public final int hashCode() {
        return this.onHandwritingSlopExceeded.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHandwriting");
        inspectorInfo.getProperties().set(this.onHandwritingSlopExceeded, "onHandwritingSlopExceeded");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((StylusHandwritingNode) node).onHandwritingSlopExceeded = this.onHandwritingSlopExceeded;
    }
}
