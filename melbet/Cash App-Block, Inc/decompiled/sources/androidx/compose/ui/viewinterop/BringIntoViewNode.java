package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import curtains.WindowsKt$onNextDraw$1;

/* loaded from: classes.dex */
public final class BringIntoViewNode extends Modifier.Node {
    public AndroidViewHolder$layoutNode$1$4 onRequesterReady;
    public final WindowsKt$onNextDraw$1 requester = new WindowsKt$onNextDraw$1(this, 13);

    public BringIntoViewNode(AndroidViewHolder$layoutNode$1$4 androidViewHolder$layoutNode$1$4) {
        this.onRequesterReady = androidViewHolder$layoutNode$1$4;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        this.onRequesterReady.invoke(this.requester);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.onRequesterReady.invoke(null);
    }
}
