package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class FocusRequesterNode extends Modifier.Node implements FocusRequesterModifierNode {
    public FocusRequester focusRequester;

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        this.focusRequester.focusRequesterNodes.add(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.focusRequester.focusRequesterNodes.remove(this);
        super.onDetach();
    }
}
