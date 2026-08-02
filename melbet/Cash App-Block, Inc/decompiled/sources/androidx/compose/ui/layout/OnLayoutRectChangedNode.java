package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.spatial.ThrottledCallbacks;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class OnLayoutRectChangedNode extends Modifier.Node {
    public Function1 callback;
    public ThrottledCallbacks.Entry handle;

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        ThrottledCallbacks.Entry entry = this.handle;
        if (entry != null) {
            entry.unregister();
        }
        this.handle = RulerKt.registerOnLayoutRectChanged(this, this.callback);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        ThrottledCallbacks.Entry entry = this.handle;
        if (entry != null) {
            entry.unregister();
        }
        this.handle = null;
    }
}
