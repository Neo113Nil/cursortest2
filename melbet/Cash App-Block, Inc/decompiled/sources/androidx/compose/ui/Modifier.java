package androidx.compose.ui;

import androidx.collection.MutableObjectList;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public interface Modifier {

    public final class Companion implements Modifier {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // androidx.compose.ui.Modifier
        public final boolean all(Function1 function1) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public final Object foldIn(Object obj, Function2 function2) {
            return obj;
        }

        @Override // androidx.compose.ui.Modifier
        public final Modifier then(Modifier modifier) {
            return modifier;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    public interface Element extends Modifier {
        @Override // androidx.compose.ui.Modifier
        default boolean all(Function1 function1) {
            return ((Boolean) function1.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default Object foldIn(Object obj, Function2 function2) {
            return function2.invoke(obj, this);
        }
    }

    public abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        private Node child;
        private NodeCoordinator coordinator;
        private Function0<Unit> detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private ObserverNodeOwnerScope ownerScope;
        private Node parent;
        private CoroutineScope scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private Node node = this;
        private int aggregateChildKindSet = -1;

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public final int getAggregateChildKindSet$ui() {
            return this.aggregateChildKindSet;
        }

        public final Node getChild$ui() {
            return this.child;
        }

        public final NodeCoordinator getCoordinator$ui() {
            return this.coordinator;
        }

        public final CoroutineScope getCoroutineScope() {
            CoroutineScope coroutineScope = this.scope;
            if (coroutineScope != null) {
                return coroutineScope;
            }
            ContextScope CoroutineScope = JobKt.CoroutineScope(((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).coroutineContext.plus(new JobImpl((Job) ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).coroutineContext.get(Job.Key.$$INSTANCE))));
            this.scope = CoroutineScope;
            return CoroutineScope;
        }

        public final Function0<Unit> getDetachedListener$ui() {
            return this.detachedListener;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui() {
            return this.kindSet;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public final Node getNode() {
            return this.node;
        }

        public final ObserverNodeOwnerScope getOwnerScope$ui() {
            return this.ownerScope;
        }

        public final Node getParent$ui() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        /* renamed from: isKind-H91voCI$ui, reason: not valid java name */
        public final boolean m585isKindH91voCI$ui(int i) {
            return (getKindSet$ui() & i) != 0;
        }

        public boolean isValidOwnerScope() {
            return isAttached();
        }

        public void markAsAttached$ui() {
            if (this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void markAsDetached$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            CoroutineScope coroutineScope = this.scope;
            if (coroutineScope != null) {
                JobKt.cancel(coroutineScope, new ModifierNodeDetachedCancellationException("The Modifier.Node was detached"));
                this.scope = null;
            }
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public void reset$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("reset() called on an unattached node");
            }
            onReset();
        }

        public void runAttachLifecycle$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node detached multiple times");
            }
            if (this.coordinator == null) {
                InlineClassHelperKt.throwIllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            Function0<Unit> function0 = this.detachedListener;
            if (function0 != null) {
                function0.invoke();
            }
            onDetach();
        }

        public final void setAggregateChildKindSet$ui(int i) {
            this.aggregateChildKindSet = i;
        }

        public void setAsDelegateTo$ui(Node node) {
            this.node = node;
        }

        public final void setChild$ui(Node node) {
            this.child = node;
        }

        public final void setDetachedListener$ui(Function0<Unit> function0) {
            this.detachedListener = function0;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        public final void setKindSet$ui(int i) {
            this.kindSet = i;
        }

        public final void setOwnerScope$ui(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void setParent$ui(Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        public final void sideEffect(Function0<Unit> function0) {
            MutableObjectList mutableObjectList = ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).endApplyChangesListeners;
            if (mutableObjectList.indexOf(function0) >= 0) {
                return;
            }
            mutableObjectList.add(function0);
        }

        public void updateCoordinator$ui(NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }
    }

    boolean all(Function1 function1);

    Object foldIn(Object obj, Function2 function2);

    default Modifier then(Modifier modifier) {
        return modifier == Companion.$$INSTANCE ? this : new CombinedModifier(this, modifier);
    }
}
