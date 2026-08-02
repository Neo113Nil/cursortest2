package androidx.compose.ui.layout;

import androidx.camera.view.PreviewView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutBoundsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutBoundsNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LayoutBoundsElement extends ModifierNodeElement {
    public final PreviewView.AnonymousClass1 holder;

    public LayoutBoundsElement(PreviewView.AnonymousClass1 anonymousClass1) {
        this.holder = anonymousClass1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new LayoutBoundsNode(this.holder);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutBoundsElement) && Intrinsics.areEqual(this.holder, ((LayoutBoundsElement) obj).holder);
    }

    public final int hashCode() {
        return this.holder.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "layoutBounds";
        inspectorInfo.properties.set(this.holder, "holder");
    }

    public final String toString() {
        return "LayoutBoundsElement(holder=" + this.holder + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        LayoutBoundsNode layoutBoundsNode = (LayoutBoundsNode) node;
        PreviewView.AnonymousClass1 anonymousClass1 = this.holder;
        layoutBoundsNode.holder = anonymousClass1;
        ((ParcelableSnapshotMutableState) anonymousClass1.this$0).setValue(layoutBoundsNode.lastBounds);
    }
}
