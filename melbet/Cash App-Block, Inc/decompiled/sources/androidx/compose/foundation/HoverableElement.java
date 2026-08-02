package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/HoverableNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HoverableElement extends ModifierNodeElement {
    public final MutableInteractionSourceImpl interactionSource;

    public HoverableElement(MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        this.interactionSource = mutableInteractionSourceImpl;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        HoverableNode hoverableNode = new HoverableNode();
        hoverableNode.interactionSource = this.interactionSource;
        return hoverableNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && Intrinsics.areEqual(((HoverableElement) obj).interactionSource, this.interactionSource);
    }

    public final int hashCode() {
        return this.interactionSource.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "hoverable";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(this.interactionSource, "interactionSource");
        linesSequence.set(Boolean.TRUE, "enabled");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        HoverableNode hoverableNode = (HoverableNode) node;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = hoverableNode.interactionSource;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = this.interactionSource;
        if (Intrinsics.areEqual(mutableInteractionSourceImpl, mutableInteractionSourceImpl2)) {
            return;
        }
        hoverableNode.tryEmitExit();
        hoverableNode.interactionSource = mutableInteractionSourceImpl2;
    }
}
