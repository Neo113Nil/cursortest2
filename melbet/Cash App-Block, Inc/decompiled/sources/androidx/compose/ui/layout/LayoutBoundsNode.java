package androidx.compose.ui.layout;

import androidx.camera.view.PreviewView;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import androidx.compose.ui.spatial.ThrottledCallbacks;

/* loaded from: classes3.dex */
public final class LayoutBoundsNode extends Modifier.Node {
    public ThrottledCallbacks.Entry handle;
    public PreviewView.AnonymousClass1 holder;
    public RelativeLayoutBounds lastBounds;
    public final BoundsAnimation$animate$1 rectChanged = new BoundsAnimation$animate$1(this, 9);

    public LayoutBoundsNode(PreviewView.AnonymousClass1 anonymousClass1) {
        this.holder = anonymousClass1;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        ThrottledCallbacks.Entry entry = this.handle;
        if (entry != null) {
            entry.unregister();
        }
        this.handle = RulerKt.registerOnLayoutRectChanged(this, this.rectChanged);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        ThrottledCallbacks.Entry entry = this.handle;
        if (entry != null) {
            entry.unregister();
        }
        ((ParcelableSnapshotMutableState) this.holder.this$0).setValue(null);
    }
}
