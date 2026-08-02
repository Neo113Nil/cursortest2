package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.datastore.core.SimpleActor;
import com.squareup.contour.ContourLayout$geometry$1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class NestedScrollElement extends ModifierNodeElement {
    public final NestedScrollConnection connection;
    public final SimpleActor dispatcher;

    public NestedScrollElement(NestedScrollConnection nestedScrollConnection, SimpleActor simpleActor) {
        this.connection = nestedScrollConnection;
        this.dispatcher = simpleActor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new NestedScrollNode(this.connection, this.dispatcher);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return Intrinsics.areEqual(nestedScrollElement.connection, this.connection) && Intrinsics.areEqual(nestedScrollElement.dispatcher, this.dispatcher);
    }

    public final int hashCode() {
        int hashCode = this.connection.hashCode() * 31;
        SimpleActor simpleActor = this.dispatcher;
        return hashCode + (simpleActor != null ? simpleActor.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("nestedScroll");
        inspectorInfo.getProperties().set(this.connection, "connection");
        inspectorInfo.getProperties().set(this.dispatcher, "dispatcher");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        NestedScrollNode nestedScrollNode = (NestedScrollNode) node;
        nestedScrollNode.connection = this.connection;
        SimpleActor simpleActor = nestedScrollNode.resolvedDispatcher;
        if (((NestedScrollNode) simpleActor.consumeMessage) == nestedScrollNode) {
            simpleActor.consumeMessage = null;
        }
        SimpleActor simpleActor2 = this.dispatcher;
        if (simpleActor2 == null) {
            nestedScrollNode.resolvedDispatcher = new SimpleActor(3);
        } else if (simpleActor2 != simpleActor) {
            nestedScrollNode.resolvedDispatcher = simpleActor2;
        }
        if (nestedScrollNode.isAttached()) {
            SimpleActor simpleActor3 = nestedScrollNode.resolvedDispatcher;
            simpleActor3.consumeMessage = nestedScrollNode;
            simpleActor3.messageQueue = null;
            nestedScrollNode.lastKnownParentNode = null;
            simpleActor3.remainingMessages = new ContourLayout$geometry$1(nestedScrollNode, 4);
            simpleActor3.scope = nestedScrollNode.getCoroutineScope();
        }
    }
}
