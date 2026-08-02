package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.room.util.DBUtil;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class TextContextMenuGestureNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode {
    public final ParcelableSnapshotMutableState localCoordinates$delegate = new ParcelableSnapshotMutableState(null, NeverEqualPolicy.INSTANCE);
    public Function2 onPreShowContextMenu;

    /* loaded from: classes3.dex */
    public final class ClickTextContextMenuDataProvider implements TextContextMenuDataProvider {
        public final long localClickOffset;

        public ClickTextContextMenuDataProvider(long j) {
            this.localClickOffset = j;
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
        public final Rect contentBounds(LayoutCoordinates layoutCoordinates) {
            return DBUtil.m1180Recttz77jQw(mo375positiontuRUvjQ(layoutCoordinates), 0L);
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
        public final TextContextMenuData data() {
            return TextContextMenuModifierKt.collectTextContextMenuData(TextContextMenuGestureNode.this);
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
        /* renamed from: position-tuRUvjQ, reason: not valid java name */
        public final long mo375positiontuRUvjQ(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) TextContextMenuGestureNode.this.localCoordinates$delegate.getValue();
            if (layoutCoordinates2 != null) {
                return layoutCoordinates.mo839localPositionOfR5De75A(layoutCoordinates2, this.localClickOffset);
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Tried to open context menu before the anchor was placed.");
            OptionalProvider$$ExternalSyntheticLambda0.m$1();
            return 0L;
        }
    }

    public TextContextMenuGestureNode(Function2 function2) {
        this.onPreShowContextMenu = function2;
        AndroidEdgeEffectOverscrollEffect$pointerInputNode$1 androidEdgeEffectOverscrollEffect$pointerInputNode$1 = new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1(this, 1);
        PointerEvent pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        delegate(new SuspendingPointerInputModifierNodeImpl(null, null, null, androidEdgeEffectOverscrollEffect$pointerInputNode$1));
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        this.localCoordinates$delegate.setValue(nodeCoordinator);
    }
}
