package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SharedBoundsNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/SharedBoundsNode;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SharedBoundsNodeElement extends ModifierNodeElement {
    public final SharedElementEntry sharedElementState;

    public SharedBoundsNodeElement(SharedElementEntry sharedElementEntry) {
        this.sharedElementState = sharedElementEntry;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new SharedBoundsNode(this.sharedElementState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && this.sharedElementState == ((SharedBoundsNodeElement) obj).sharedElementState;
    }

    public final int hashCode() {
        return this.sharedElementState.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "sharedBounds";
        inspectorInfo.properties.set(this.sharedElementState, "sharedElementState");
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.sharedElementState + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        SharedBoundsNode sharedBoundsNode = (SharedBoundsNode) node;
        SharedElementEntry sharedElementEntry = sharedBoundsNode.sharedElementEntry;
        SharedElementEntry sharedElementEntry2 = this.sharedElementState;
        if (sharedElementEntry2 != sharedElementEntry) {
            sharedElementEntry.isAttached$delegate.setValue(Boolean.FALSE);
            sharedBoundsNode.sharedElementEntry = sharedElementEntry2;
            sharedElementEntry2.isAttached$delegate.setValue(Boolean.valueOf(sharedBoundsNode.isAttached()));
            if (sharedBoundsNode.isAttached()) {
                sharedBoundsNode.setup();
            }
        }
    }
}
