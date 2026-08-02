package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;

/* loaded from: classes3.dex */
public final class ScrollCaptureCandidate {
    public final NodeCoordinator coordinates;
    public final int depth;
    public final SemanticsNode node;
    public final IntRect viewportBoundsInWindow;

    public ScrollCaptureCandidate(SemanticsNode semanticsNode, int i, IntRect intRect, NodeCoordinator nodeCoordinator) {
        this.node = semanticsNode;
        this.depth = i;
        this.viewportBoundsInWindow = intRect;
        this.coordinates = nodeCoordinator;
    }

    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    public final SemanticsNode getNode() {
        return this.node;
    }

    public final IntRect getViewportBoundsInWindow() {
        return this.viewportBoundsInWindow;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.node + ", depth=" + this.depth + ", viewportBoundsInWindow=" + this.viewportBoundsInWindow + ", coordinates=" + this.coordinates + ')';
    }
}
