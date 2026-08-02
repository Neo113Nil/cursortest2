package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.text.TextLayoutResult;

/* loaded from: classes3.dex */
public final class StaticTextSelectionParams {
    public static final StaticTextSelectionParams Empty = new StaticTextSelectionParams(null, null);
    public final LayoutCoordinates layoutCoordinates;
    public final TextLayoutResult textLayoutResult;

    public StaticTextSelectionParams(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = layoutCoordinates;
        this.textLayoutResult = textLayoutResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.layout.LayoutCoordinates] */
    public static StaticTextSelectionParams copy$default(StaticTextSelectionParams staticTextSelectionParams, NodeCoordinator nodeCoordinator, TextLayoutResult textLayoutResult, int i) {
        NodeCoordinator nodeCoordinator2 = nodeCoordinator;
        if ((i & 1) != 0) {
            nodeCoordinator2 = staticTextSelectionParams.layoutCoordinates;
        }
        if ((i & 2) != 0) {
            textLayoutResult = staticTextSelectionParams.textLayoutResult;
        }
        return new StaticTextSelectionParams(nodeCoordinator2, textLayoutResult);
    }

    public final AndroidPath getPathForRange(int i, int i2) {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return textLayoutResult.getPathForRange(i, i2);
        }
        return null;
    }

    public final boolean getShouldClip() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return (textLayoutResult == null || textLayoutResult.layoutInput.overflow == 3 || !textLayoutResult.getHasVisualOverflow()) ? false : true;
    }

    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }
}
