package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* loaded from: classes3.dex */
public final class SelectableNode extends ClickableNode {
    public boolean selected;

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, this.selected);
    }
}
