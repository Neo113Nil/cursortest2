package androidx.compose.ui.viewinterop;

import androidx.compose.foundation.FocusableNode$focusTargetNode$1;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ObserverModifierNode;
import com.datadog.android.Datadog$getInstance$1$1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class FocusTargetInteropNode extends DelegatingNode implements ObserverModifierNode, CompositionLocalConsumerModifierNode {
    public final FocusTargetNode focusTargetNode;
    public LazyLayoutPinnableItem pinnedHandle;

    public FocusTargetInteropNode() {
        FocusTargetNode focusTargetNode = new FocusTargetNode(0, new FocusableNode$focusTargetNode$1(2, this, FocusTargetInteropNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1), 9);
        delegate(focusTargetNode);
        this.focusTargetNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        LazyLayoutPinnableItem lazyLayoutPinnableItem;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        DepthSortedSetKt.observeReads(this, new Datadog$getInstance$1$1(6, ref$ObjectRef, this));
        PinnableContainer pinnableContainer = (PinnableContainer) ref$ObjectRef.element;
        if (this.focusTargetNode.getFocusState$1().isFocused()) {
            LazyLayoutPinnableItem lazyLayoutPinnableItem2 = this.pinnedHandle;
            if (lazyLayoutPinnableItem2 != null) {
                lazyLayoutPinnableItem2.release();
            }
            if (pinnableContainer != null) {
                lazyLayoutPinnableItem = (LazyLayoutPinnableItem) pinnableContainer;
                lazyLayoutPinnableItem.pin();
            } else {
                lazyLayoutPinnableItem = null;
            }
            this.pinnedHandle = lazyLayoutPinnableItem;
        }
    }
}
