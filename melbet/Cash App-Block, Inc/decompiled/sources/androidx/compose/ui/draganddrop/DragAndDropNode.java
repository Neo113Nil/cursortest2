package androidx.compose.ui.draganddrop;

import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.animation.BoundsAnimation$animate$2;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.datastore.core.SimpleActor;
import androidx.room.Room;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropTarget, LayoutAwareModifierNode {
    public DragAndDropNode lastChildDragAndDropModifierNode;
    public final Function1 onDropTargetValidate;
    public long size;
    public DragAndDropTarget thisDragAndDropTarget;

    public DragAndDropNode(SimpleActor.AnonymousClass1 anonymousClass1, int i) {
        this.onDropTargetValidate = (i & 2) != 0 ? null : anonymousClass1;
        this.size = 0L;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return DragAndDropNode$Companion$DragAndDropTraversableKey.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final boolean onDrop(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            return dragAndDropNode.onDrop(dragAndDropEvent);
        }
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            return dragAndDropTarget.onDrop(dragAndDropEvent);
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onEnded(DragAndDropEvent dragAndDropEvent) {
        BoundsAnimation$animate$1 boundsAnimation$animate$1 = new BoundsAnimation$animate$1(dragAndDropEvent, 5);
        if (boundsAnimation$animate$1.invoke(this) != TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
            return;
        }
        DepthSortedSetKt.traverseDescendants(this, boundsAnimation$animate$1);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onEntered(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onEntered(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onEntered(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onExited(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(dragAndDropEvent);
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onExited(dragAndDropEvent);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onMoved(DragAndDropEvent dragAndDropEvent) {
        TraversableNode traversableNode;
        DragAndDropNode dragAndDropNode;
        DragAndDropNode dragAndDropNode2 = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode2 == null || !Room.m1166access$containsUv8p0NA(dragAndDropNode2, DragAndDrop_androidKt.getPositionInRoot(dragAndDropEvent))) {
            if (getNode().isAttached()) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                DepthSortedSetKt.traverseDescendants(this, new BoundsAnimation$animate$2(4, ref$ObjectRef, this, dragAndDropEvent));
                traversableNode = (TraversableNode) ref$ObjectRef.element;
            } else {
                traversableNode = null;
            }
            dragAndDropNode = (DragAndDropNode) traversableNode;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            dragAndDropNode.onEntered(dragAndDropEvent);
            dragAndDropNode.onMoved(dragAndDropEvent);
            DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.onExited(dragAndDropEvent);
            }
        } else if (dragAndDropNode == null && dragAndDropNode2 != null) {
            DragAndDropTarget dragAndDropTarget2 = this.thisDragAndDropTarget;
            if (dragAndDropTarget2 != null) {
                dragAndDropTarget2.onEntered(dragAndDropEvent);
                dragAndDropTarget2.onMoved(dragAndDropEvent);
            }
            dragAndDropNode2.onExited(dragAndDropEvent);
        } else if (!Intrinsics.areEqual(dragAndDropNode, dragAndDropNode2)) {
            if (dragAndDropNode != null) {
                dragAndDropNode.onEntered(dragAndDropEvent);
                dragAndDropNode.onMoved(dragAndDropEvent);
            }
            if (dragAndDropNode2 != null) {
                dragAndDropNode2.onExited(dragAndDropEvent);
            }
        } else if (dragAndDropNode != null) {
            dragAndDropNode.onMoved(dragAndDropEvent);
        } else {
            DragAndDropTarget dragAndDropTarget3 = this.thisDragAndDropTarget;
            if (dragAndDropTarget3 != null) {
                dragAndDropTarget3.onMoved(dragAndDropEvent);
            }
        }
        this.lastChildDragAndDropModifierNode = dragAndDropNode;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public final void mo197onRemeasuredozmzZPI(long j) {
        this.size = j;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onStarted(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onStarted(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onStarted(dragAndDropEvent);
        }
    }
}
