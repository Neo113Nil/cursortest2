package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.compose.animation.BoundsAnimation$animate$2;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener {
    public final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(null, 3);
    public final ArraySet interestedTargets = new ArraySet(0);
    public final AndroidDragAndDropManager$modifier$1 modifier = new ModifierNodeElement() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final Modifier.Node create() {
            return AndroidDragAndDropManager.this.rootDragAndDropNode;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return AndroidDragAndDropManager.this.rootDragAndDropNode.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootDragAndDropNode");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(dragEvent);
        int action = dragEvent.getAction();
        ArraySet arraySet = this.interestedTargets;
        DragAndDropNode dragAndDropNode = this.rootDragAndDropNode;
        switch (action) {
            case 1:
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                BoundsAnimation$animate$2 boundsAnimation$animate$2 = new BoundsAnimation$animate$2(3, dragAndDropEvent, dragAndDropNode, ref$BooleanRef);
                if (boundsAnimation$animate$2.invoke(dragAndDropNode) == TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
                    DepthSortedSetKt.traverseDescendants(dragAndDropNode, boundsAnimation$animate$2);
                }
                boolean z = ref$BooleanRef.element;
                arraySet.getClass();
                ArrayMap.KeyIterator keyIterator = new ArrayMap.KeyIterator(arraySet);
                while (keyIterator.hasNext()) {
                    ((DragAndDropTarget) keyIterator.next()).onStarted(dragAndDropEvent);
                }
                break;
            case 2:
                dragAndDropNode.onMoved(dragAndDropEvent);
                break;
            case 4:
                dragAndDropNode.onEnded(dragAndDropEvent);
                arraySet.clear();
                break;
            case 5:
                dragAndDropNode.onEntered(dragAndDropEvent);
                break;
            case 6:
                dragAndDropNode.onExited(dragAndDropEvent);
                break;
        }
        return false;
    }
}
