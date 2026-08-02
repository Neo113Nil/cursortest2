package androidx.compose.ui.semantics;

import androidx.compose.ui.unit.IntRect;

/* loaded from: classes3.dex */
public final class SemanticsNodeWithAdjustedBounds {
    public final IntRect adjustedBounds;
    public final SemanticsNode semanticsNode;

    public SemanticsNodeWithAdjustedBounds(SemanticsNode semanticsNode, IntRect intRect) {
        this.semanticsNode = semanticsNode;
        this.adjustedBounds = intRect;
    }

    public final IntRect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    public final SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }
}
