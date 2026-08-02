package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusRequesterNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusRequesterElement extends ModifierNodeElement {
    public final FocusRequester focusRequester;

    public FocusRequesterElement(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        FocusRequesterNode focusRequesterNode = new FocusRequesterNode();
        focusRequesterNode.focusRequester = this.focusRequester;
        return focusRequesterNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.areEqual(this.focusRequester, ((FocusRequesterElement) obj).focusRequester);
    }

    public final int hashCode() {
        return this.focusRequester.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRequester");
        inspectorInfo.getProperties().set(this.focusRequester, "focusRequester");
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.focusRequester + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        FocusRequesterNode focusRequesterNode = (FocusRequesterNode) node;
        focusRequesterNode.focusRequester.focusRequesterNodes.remove(focusRequesterNode);
        FocusRequester focusRequester = this.focusRequester;
        focusRequesterNode.focusRequester = focusRequester;
        focusRequester.focusRequesterNodes.add(focusRequesterNode);
    }
}
