package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/key/KeyInputNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class KeyInputElement extends ModifierNodeElement {
    public final Function1 onKeyEvent;
    public final Function1 onPreKeyEvent;

    public KeyInputElement(Function1 function1, Function1 function12) {
        this.onKeyEvent = function1;
        this.onPreKeyEvent = function12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        KeyInputNode keyInputNode = new KeyInputNode();
        keyInputNode.onEvent = this.onKeyEvent;
        keyInputNode.onPreEvent = this.onPreKeyEvent;
        return keyInputNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.onKeyEvent == keyInputElement.onKeyEvent && this.onPreKeyEvent == keyInputElement.onPreKeyEvent;
    }

    public final int hashCode() {
        Function1 function1 = this.onKeyEvent;
        int hashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.onPreKeyEvent;
        return hashCode + (function12 != null ? function12.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        LinesSequence linesSequence = inspectorInfo.properties;
        Function1 function1 = this.onKeyEvent;
        if (function1 != null) {
            inspectorInfo.name = "onKeyEvent";
            linesSequence.set(function1, "onKeyEvent");
        }
        Function1 function12 = this.onPreKeyEvent;
        if (function12 != null) {
            inspectorInfo.name = "onPreviewKeyEvent";
            linesSequence.set(function12, "onPreviewKeyEvent");
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        KeyInputNode keyInputNode = (KeyInputNode) node;
        keyInputNode.onEvent = this.onKeyEvent;
        keyInputNode.onPreEvent = this.onPreKeyEvent;
    }
}
