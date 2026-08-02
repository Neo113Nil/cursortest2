package androidx.compose.ui.layout;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.collection.Values;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.compose.runtime.PausedCompositionState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import app.cash.redwood.Modifier$$ExternalSyntheticLambda0;
import app.cash.trifle.KeyHandle$keyPair$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.trace.internal.data.CoreTraceWriter$write$1;
import com.google.android.gms.dynamite.zzg;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    public final String NoIntrinsicsMessage;
    public final ApproachMeasureScopeImpl approachMeasureScope;
    public final MutableScatterMap approachPrecomposeSlotHandleMap;
    public CompositionContext compositionContext;
    public int currentApproachIndex;
    public int currentIndex;
    public final MutableScatterMap nodeToNodeState;
    public final MutableScatterMap precomposeMap;
    public int precomposedCount;
    public int reusableCount;
    public final Values reusableSlotIdsSet;
    public final LayoutNode root;
    public final Scope scope;
    public final MutableScatterMap slotIdToNode;
    public final MutableVector slotIdsOfCompositionsNeededInApproach;
    public SubcomposeSlotReusePolicy slotReusePolicy;

    public final class NodeState {
        public ParcelableSnapshotMutableState activeState;
        public boolean composedWithReusableContentHost;
        public CompositionImpl composition;
        public Function2 content;
        public boolean forceRecompose;
        public boolean forceReuse;
        public PausedCompositionImpl pausedComposition;
        public Object slotId;
    }

    public final class Scope implements SubcomposeMeasureScope {
        public float density;
        public float fontScale;
        public LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public final boolean isLookingAhead() {
            LayoutNode.LayoutState layoutState = LayoutNodeSubcompositionsState.this.root.layoutDelegate.layoutState;
            return layoutState == LayoutNode.LayoutState.LookaheadLayingOut || layoutState == LayoutNode.LayoutState.LookaheadMeasuring;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public final MeasureResult layout(final int i, final int i2, final Map map, final Function1 function1, final Function1 function12) {
            if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
                InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                @Override // androidx.compose.ui.layout.MeasureResult
                public final Map getAlignmentLines() {
                    return map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final int getHeight() {
                    return i2;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final Function1 getRulers() {
                    return function1;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final int getWidth() {
                    return i;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final void placeChildren() {
                    InnerNodeCoordinator.LookaheadDelegateImpl lookaheadDelegateImpl;
                    LayoutNode layoutNode = layoutNodeSubcompositionsState.root;
                    boolean isLookingAhead = this.isLookingAhead();
                    Function1 function13 = function12;
                    if (!isLookingAhead || (lookaheadDelegateImpl = ((InnerNodeCoordinator) layoutNode.nodes.innerCoordinator).lookaheadDelegate) == null) {
                        function13.invoke(((InnerNodeCoordinator) layoutNode.nodes.innerCoordinator).placementScope);
                    } else {
                        function13.invoke(lookaheadDelegateImpl.placementScope);
                    }
                }
            };
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public final List subcompose(Object obj, Function2 function2) {
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            layoutNodeSubcompositionsState.makeSureStateIsConsistent();
            LayoutNode layoutNode = layoutNodeSubcompositionsState.root;
            LayoutNode.LayoutState layoutState = layoutNode.layoutDelegate.layoutState;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Measuring;
            if (layoutState != layoutState2 && layoutState != LayoutNode.LayoutState.LayingOut && layoutState != LayoutNode.LayoutState.LookaheadMeasuring && layoutState != LayoutNode.LayoutState.LookaheadLayingOut) {
                InlineClassHelperKt.throwIllegalStateException("subcompose can only be used inside the measure or layout blocks");
            }
            MutableScatterMap mutableScatterMap = layoutNodeSubcompositionsState.slotIdToNode;
            Object obj2 = mutableScatterMap.get(obj);
            if (obj2 == null) {
                obj2 = (LayoutNode) layoutNodeSubcompositionsState.precomposeMap.remove(obj);
                if (obj2 != null) {
                    if (layoutNodeSubcompositionsState.precomposedCount <= 0) {
                        InlineClassHelperKt.throwIllegalStateException("Check failed.");
                    }
                    layoutNodeSubcompositionsState.precomposedCount--;
                } else {
                    obj2 = layoutNodeSubcompositionsState.takeNodeFromReusables(obj);
                    if (obj2 == null) {
                        int i = layoutNodeSubcompositionsState.currentIndex;
                        LayoutNode layoutNode2 = new LayoutNode(2);
                        layoutNode.ignoreRemeasureRequests = true;
                        layoutNode.insertAt$ui(i, layoutNode2);
                        layoutNode.ignoreRemeasureRequests = false;
                        obj2 = layoutNode2;
                    }
                }
                mutableScatterMap.set(obj, obj2);
            }
            LayoutNode layoutNode3 = (LayoutNode) obj2;
            if (CollectionsKt.getOrNull(layoutNodeSubcompositionsState.currentIndex, layoutNode.getFoldedChildren$ui()) != layoutNode3) {
                int indexOf = ((MutableVector.MutableVectorList) layoutNode.getFoldedChildren$ui()).vector.indexOf(layoutNode3);
                if (indexOf < layoutNodeSubcompositionsState.currentIndex) {
                    InlineClassHelperKt.throwIllegalArgumentException("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                }
                int i2 = layoutNodeSubcompositionsState.currentIndex;
                if (i2 != indexOf) {
                    layoutNodeSubcompositionsState.move$1(indexOf, i2);
                }
            }
            layoutNodeSubcompositionsState.currentIndex++;
            layoutNodeSubcompositionsState.subcompose(layoutNode3, obj, false, function2);
            return (layoutState == layoutState2 || layoutState == LayoutNode.LayoutState.LayingOut) ? layoutNode3.getChildMeasurables$ui() : layoutNode3.getChildLookaheadMeasurables$ui();
        }
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        long[] jArr = ScatterMapKt.EmptyGroup;
        this.nodeToNodeState = new MutableScatterMap();
        this.slotIdToNode = new MutableScatterMap();
        this.scope = new Scope();
        this.approachMeasureScope = new ApproachMeasureScopeImpl();
        this.precomposeMap = new MutableScatterMap();
        this.reusableSlotIdsSet = new Values();
        this.approachPrecomposeSlotHandleMap = new MutableScatterMap();
        this.slotIdsOfCompositionsNeededInApproach = new MutableVector(0, new Object[16]);
        this.NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void access$disposePrecomposedSlot(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, Object obj) {
        LayoutNode layoutNode = layoutNodeSubcompositionsState.root;
        layoutNodeSubcompositionsState.makeSureStateIsConsistent();
        LayoutNode layoutNode2 = (LayoutNode) layoutNodeSubcompositionsState.precomposeMap.remove(obj);
        if (layoutNode2 != null) {
            if (layoutNodeSubcompositionsState.precomposedCount <= 0) {
                InlineClassHelperKt.throwIllegalStateException("No pre-composed items to dispose");
            }
            int indexOf = ((MutableVector.MutableVectorList) layoutNode.getFoldedChildren$ui()).vector.indexOf(layoutNode2);
            if (indexOf < ((MutableVector.MutableVectorList) layoutNode.getFoldedChildren$ui()).vector.size - layoutNodeSubcompositionsState.precomposedCount) {
                InlineClassHelperKt.throwIllegalStateException("Item is not in pre-composed item range");
            }
            layoutNodeSubcompositionsState.reusableCount++;
            layoutNodeSubcompositionsState.precomposedCount--;
            NodeState nodeState = (NodeState) layoutNodeSubcompositionsState.nodeToNodeState.get(layoutNode2);
            if (nodeState != null) {
                cancelPausedPrecomposition(nodeState);
            }
            int i = (((MutableVector.MutableVectorList) layoutNode.getFoldedChildren$ui()).vector.size - layoutNodeSubcompositionsState.precomposedCount) - layoutNodeSubcompositionsState.reusableCount;
            layoutNodeSubcompositionsState.move$1(indexOf, i);
            layoutNodeSubcompositionsState.disposeOrReuseStartingFromIndex(i);
        }
        if (layoutNodeSubcompositionsState.slotIdsOfCompositionsNeededInApproach.contains(obj)) {
            LayoutNode.requestRemeasure$ui$default(layoutNode, true, 6);
        }
    }

    public static void cancelPausedPrecomposition(NodeState nodeState) {
        MutableScatterSet mutableScatterSet;
        PausedCompositionImpl pausedCompositionImpl = nodeState.pausedComposition;
        if (pausedCompositionImpl != null) {
            ((AtomicReference) pausedCompositionImpl.state).set(PausedCompositionState.Cancelled);
            RememberEventDispatcher rememberEventDispatcher = (RememberEventDispatcher) pausedCompositionImpl.rememberManager;
            if (((MutableScatterSet) rememberEventDispatcher.rememberSet).isNotEmpty()) {
                mutableScatterSet = (MutableScatterSet) rememberEventDispatcher.rememberSet;
                MutableScatterSet mutableScatterSet2 = ScatterSetKt.EmptyScatterSet;
                rememberEventDispatcher.rememberSet = new MutableScatterSet();
                ((MutableVector) rememberEventDispatcher.remembering).clear();
            } else {
                mutableScatterSet = null;
            }
            rememberEventDispatcher.dispatchAbandons();
            CompositionImpl compositionImpl = (CompositionImpl) pausedCompositionImpl.composition;
            compositionImpl.pendingPausedComposition = null;
            if (mutableScatterSet != null) {
                compositionImpl.rememberManager.ignoreLeavingSet = mutableScatterSet;
                compositionImpl.state = 2;
            }
            nodeState.pausedComposition = null;
            CompositionImpl compositionImpl2 = nodeState.composition;
            if (compositionImpl2 != null) {
                compositionImpl2.dispose();
            }
            nodeState.composition = null;
        }
    }

    public final void applyPausedPrecomposition(NodeState nodeState, boolean z) {
        PausedCompositionImpl pausedCompositionImpl = nodeState.pausedComposition;
        if (pausedCompositionImpl != null) {
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                LayoutNode layoutNode = this.root;
                layoutNode.ignoreRemeasureRequests = true;
                if (z) {
                    while (!pausedCompositionImpl.isComplete()) {
                        try {
                            pausedCompositionImpl.resume(new DifferentialMotionFlingController$$ExternalSyntheticLambda0(4));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                pausedCompositionImpl.apply();
                nodeState.pausedComposition = null;
                layoutNode.ignoreRemeasureRequests = false;
            } finally {
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle createPrecomposedSlotHandle(final Object obj) {
        return !this.root.isAttached() ? new LayoutNodeSubcompositionsState$createPrecomposedSlotHandle$1() : new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createPrecomposedSlotHandle$2
            public final MutableIntSet hasPremeasured;

            {
                int[] iArr = IntSetKt.EmptyIntArray;
                this.hasPremeasured = new MutableIntSet();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public final void dispose() {
                LayoutNodeSubcompositionsState.access$disposePrecomposedSlot(LayoutNodeSubcompositionsState.this, obj);
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public final int getPlaceablesCount() {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                if (layoutNode != null) {
                    return ((MutableVector.MutableVectorList) layoutNode.getChildren$ui()).vector.size;
                }
                return 0;
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: getSize-YEO4UFw, reason: not valid java name */
            public final long mo848getSizeYEO4UFw(int i) {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                if (layoutNode == null || !layoutNode.isAttached()) {
                    return 0L;
                }
                int i2 = ((MutableVector.MutableVectorList) layoutNode.getChildren$ui()).vector.size;
                if (i < 0 || i >= i2) {
                    InlineClassHelperKt.throwIndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + i2 + ')');
                }
                if (!this.hasPremeasured.contains(i)) {
                    return 0L;
                }
                int width = ((LayoutNode) ((MutableVector.MutableVectorList) layoutNode.getChildren$ui()).get(i)).getWidth();
                return (((LayoutNode) ((MutableVector.MutableVectorList) layoutNode.getChildren$ui()).get(i)).getHeight() & BodyPartID.bodyIdMax) | (width << 32);
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw, reason: not valid java name */
            public final void mo849premeasure0kLqBqw(int i, long j) {
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                LayoutNode layoutNode = (LayoutNode) layoutNodeSubcompositionsState.precomposeMap.get(obj);
                if (layoutNode == null || !layoutNode.isAttached()) {
                    return;
                }
                int i2 = ((MutableVector.MutableVectorList) layoutNode.getChildren$ui()).vector.size;
                if (i < 0 || i >= i2) {
                    InlineClassHelperKt.throwIndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + i2 + ')');
                }
                if (layoutNode.isPlaced()) {
                    InlineClassHelperKt.throwIllegalArgumentException("Pre-measure called on node that is not placed");
                }
                LayoutNode layoutNode2 = layoutNodeSubcompositionsState.root;
                layoutNode2.ignoreRemeasureRequests = true;
                ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode)).m917measureAndLayout0kLqBqw((LayoutNode) ((MutableVector.MutableVectorList) layoutNode.getChildren$ui()).get(i), j);
                layoutNode2.ignoreRemeasureRequests = false;
                this.hasPremeasured.add(i);
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public final void traverseDescendants(Modifier$$ExternalSyntheticLambda0 modifier$$ExternalSyntheticLambda0) {
                NodeChain nodeChain;
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                Modifier.Node node = (layoutNode == null || (nodeChain = layoutNode.nodes) == null) ? null : (Modifier.Node) nodeChain.head;
                if (node == null || !node.isAttached()) {
                    return;
                }
                DepthSortedSetKt.traverseDescendants(node, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", modifier$$ExternalSyntheticLambda0);
            }
        };
    }

    public final void disposeOrReuseStartingFromIndex(int i) {
        boolean z;
        boolean z2 = false;
        this.reusableCount = 0;
        List foldedChildren$ui = this.root.getFoldedChildren$ui();
        MutableVector.MutableVectorList mutableVectorList = (MutableVector.MutableVectorList) foldedChildren$ui;
        int i2 = (mutableVectorList.vector.size - this.precomposedCount) - 1;
        if (i <= i2) {
            this.reusableSlotIdsSet.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object obj = this.nodeToNodeState.get((LayoutNode) mutableVectorList.get(i3));
                    obj.getClass();
                    ((MutableOrderedScatterSet) this.reusableSlotIdsSet.parent).add(((NodeState) obj).slotId);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            z = false;
            while (i2 >= i) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((MutableVector.MutableVectorList) foldedChildren$ui).get(i2);
                    Object obj2 = this.nodeToNodeState.get(layoutNode);
                    obj2.getClass();
                    NodeState nodeState = (NodeState) obj2;
                    Object obj3 = nodeState.slotId;
                    if (((MutableOrderedScatterSet) this.reusableSlotIdsSet.parent).contains(obj3)) {
                        this.reusableCount++;
                        if (((Boolean) nodeState.activeState.getValue()).booleanValue()) {
                            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.layoutDelegate;
                            MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.measurePassDelegate;
                            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                            measurePassDelegate.measuredByParent = usageByParent;
                            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
                            if (lookaheadPassDelegate != null) {
                                lookaheadPassDelegate.measuredByParent = usageByParent;
                            }
                            reuseComposition(nodeState, false);
                            if (nodeState.composedWithReusableContentHost) {
                                z = true;
                            }
                        }
                    } else {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.remove(layoutNode);
                        CompositionImpl compositionImpl = nodeState.composition;
                        if (compositionImpl != null) {
                            compositionImpl.dispose();
                        }
                        this.root.removeAt$ui(i2, 1);
                        layoutNode2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.remove(obj3);
                    i2--;
                } catch (Throwable th) {
                    zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        } else {
            z = false;
        }
        if (z) {
            synchronized (SnapshotKt.lock) {
                MutableScatterSet mutableScatterSet = SnapshotKt.globalSnapshot.modified;
                if (mutableScatterSet != null) {
                    if (mutableScatterSet.isNotEmpty()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            }
        }
        makeSureStateIsConsistent();
    }

    public final void makeSureStateIsConsistent() {
        int i = ((MutableVector.MutableVectorList) this.root.getFoldedChildren$ui()).vector.size;
        MutableScatterMap mutableScatterMap = this.nodeToNodeState;
        if (mutableScatterMap._size != i) {
            InlineClassHelperKt.throwIllegalArgumentException("Inconsistency between the count of nodes tracked by the state (" + mutableScatterMap._size + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.reusableCount) - this.precomposedCount < 0) {
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Incorrect state. Total children ", ". Reusable children ");
            m2m.append(this.reusableCount);
            m2m.append(". Precomposed children ");
            m2m.append(this.precomposedCount);
            InlineClassHelperKt.throwIllegalArgumentException(m2m.toString());
        }
        MutableScatterMap mutableScatterMap2 = this.precomposeMap;
        if (mutableScatterMap2._size == this.precomposedCount) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + mutableScatterMap2._size);
    }

    public final void markActiveNodesAsReused(boolean z) {
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        List foldedChildren$ui = this.root.getFoldedChildren$ui();
        int i = ((MutableVector.MutableVectorList) foldedChildren$ui).vector.size;
        if (this.reusableCount != i) {
            this.reusableCount = i;
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((MutableVector.MutableVectorList) foldedChildren$ui).get(i2);
                    NodeState nodeState = (NodeState) this.nodeToNodeState.get(layoutNode);
                    if (nodeState != null && ((Boolean) nodeState.activeState.getValue()).booleanValue()) {
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.layoutDelegate;
                        MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.measurePassDelegate;
                        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                        measurePassDelegate.measuredByParent = usageByParent;
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
                        if (lookaheadPassDelegate != null) {
                            lookaheadPassDelegate.measuredByParent = usageByParent;
                        }
                        reuseComposition(nodeState, z);
                        nodeState.slotId = RulerKt.ReusedSlotId;
                    }
                } catch (Throwable th) {
                    zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            this.slotIdToNode.clear();
        }
        makeSureStateIsConsistent();
    }

    public final void move$1(int i, int i2) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        layoutNode.move$ui(i, i2, 1);
        layoutNode.ignoreRemeasureRequests = false;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void onRelease() {
        CompositionImpl compositionImpl;
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        MutableScatterMap mutableScatterMap = this.nodeToNodeState;
        Object[] objArr = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (compositionImpl = ((NodeState) objArr[(i << 3) + i3]).composition) != null) {
                            compositionImpl.dispose();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        layoutNode.removeAll$ui();
        layoutNode.ignoreRemeasureRequests = false;
        mutableScatterMap.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        makeSureStateIsConsistent();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void onReuse() {
        markActiveNodesAsReused(false);
    }

    public final void precompose(Object obj, Function2 function2, boolean z) {
        LayoutNode layoutNode = this.root;
        if (layoutNode.isAttached()) {
            makeSureStateIsConsistent();
            if (this.slotIdToNode.containsKey(obj)) {
                return;
            }
            this.approachPrecomposeSlotHandleMap.remove(obj);
            MutableScatterMap mutableScatterMap = this.precomposeMap;
            Object obj2 = mutableScatterMap.get(obj);
            if (obj2 == null) {
                obj2 = takeNodeFromReusables(obj);
                if (obj2 != null) {
                    move$1(((MutableVector.MutableVectorList) layoutNode.getFoldedChildren$ui()).vector.indexOf(obj2), ((MutableVector.MutableVectorList) layoutNode.getFoldedChildren$ui()).vector.size);
                    this.precomposedCount++;
                } else {
                    int i = ((MutableVector.MutableVectorList) layoutNode.getFoldedChildren$ui()).vector.size;
                    LayoutNode layoutNode2 = new LayoutNode(2);
                    layoutNode.ignoreRemeasureRequests = true;
                    layoutNode.insertAt$ui(i, layoutNode2);
                    layoutNode.ignoreRemeasureRequests = false;
                    this.precomposedCount++;
                    obj2 = layoutNode2;
                }
                mutableScatterMap.set(obj, obj2);
            }
            subcompose((LayoutNode) obj2, obj, z, function2);
        }
    }

    public final void reuseComposition(NodeState nodeState, boolean z) {
        CompositionImpl compositionImpl;
        if (z || !nodeState.composedWithReusableContentHost) {
            nodeState.activeState = Updater.mutableStateOf$default(Boolean.FALSE);
        } else {
            nodeState.activeState.setValue(Boolean.FALSE);
        }
        if (nodeState.pausedComposition != null) {
            cancelPausedPrecomposition(nodeState);
            return;
        }
        if (z) {
            CompositionImpl compositionImpl2 = nodeState.composition;
            if (compositionImpl2 != null) {
                compositionImpl2.deactivate();
                return;
            }
            return;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(this.root);
        if (!androidComposeView.isAttachedToWindow()) {
            androidComposeView = null;
        }
        if (androidComposeView == null) {
            if (nodeState.composedWithReusableContentHost || (compositionImpl = nodeState.composition) == null) {
                return;
            }
            compositionImpl.deactivate();
            return;
        }
        KeyHandle$keyPair$2 keyHandle$keyPair$2 = new KeyHandle$keyPair$2(nodeState, 1);
        ArrayDeque arrayDeque = androidComposeView.outOfFrameQueue;
        boolean isEmpty = arrayDeque.isEmpty();
        arrayDeque.addLast(keyHandle$keyPair$2);
        if (isEmpty) {
            Handler handler = androidComposeView.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(androidComposeView.outOfFrameRunnable);
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:37:0x0079, B:40:0x0085, B:45:0x00b0, B:49:0x00c5, B:51:0x00da, B:53:0x00de, B:54:0x0114, B:57:0x00eb, B:58:0x00f6, B:60:0x00fa, B:61:0x0111, B:62:0x00c8, B:65:0x0095, B:67:0x00a3, B:68:0x011e, B:69:0x0129), top: B:36:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:37:0x0079, B:40:0x0085, B:45:0x00b0, B:49:0x00c5, B:51:0x00da, B:53:0x00de, B:54:0x0114, B:57:0x00eb, B:58:0x00f6, B:60:0x00fa, B:61:0x0111, B:62:0x00c8, B:65:0x0095, B:67:0x00a3, B:68:0x011e, B:69:0x0129), top: B:36:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:37:0x0079, B:40:0x0085, B:45:0x00b0, B:49:0x00c5, B:51:0x00da, B:53:0x00de, B:54:0x0114, B:57:0x00eb, B:58:0x00f6, B:60:0x00fa, B:61:0x0111, B:62:0x00c8, B:65:0x0095, B:67:0x00a3, B:68:0x011e, B:69:0x0129), top: B:36:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:37:0x0079, B:40:0x0085, B:45:0x00b0, B:49:0x00c5, B:51:0x00da, B:53:0x00de, B:54:0x0114, B:57:0x00eb, B:58:0x00f6, B:60:0x00fa, B:61:0x0111, B:62:0x00c8, B:65:0x0095, B:67:0x00a3, B:68:0x011e, B:69:0x0129), top: B:36:0x0079 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void subcompose(LayoutNode layoutNode, Object obj, boolean z, Function2 function2) {
        boolean z2;
        CompositionImpl compositionImpl;
        AndroidComposeView androidComposeView;
        MutableScatterMap mutableScatterMap = this.nodeToNodeState;
        Object obj2 = mutableScatterMap.get(layoutNode);
        Object obj3 = obj2;
        if (obj2 == null) {
            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$SubcomposeLayoutKt.lambda$641200809;
            NodeState nodeState = new NodeState();
            nodeState.slotId = obj;
            nodeState.content = composableLambdaImpl;
            nodeState.composition = null;
            nodeState.activeState = Updater.mutableStateOf$default(Boolean.TRUE);
            mutableScatterMap.set(layoutNode, nodeState);
            obj3 = nodeState;
        }
        NodeState nodeState2 = (NodeState) obj3;
        boolean z3 = nodeState2.content != function2;
        if (nodeState2.pausedComposition != null) {
            if (z3) {
                cancelPausedPrecomposition(nodeState2);
            } else if (z) {
                return;
            } else {
                applyPausedPrecomposition(nodeState2, true);
            }
        }
        CompositionImpl compositionImpl2 = nodeState2.composition;
        if (compositionImpl2 != null) {
            synchronized (compositionImpl2.lock) {
                z2 = compositionImpl2.invalidations._size > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || nodeState2.forceRecompose) {
            nodeState2.content = function2;
            if (nodeState2.pausedComposition != null) {
                InlineClassHelperKt.throwIllegalArgumentException("new subcompose call while paused composition is still active");
            }
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                LayoutNode layoutNode2 = this.root;
                layoutNode2.ignoreRemeasureRequests = true;
                CompositionImpl compositionImpl3 = nodeState2.composition;
                CompositionContext compositionContext = this.compositionContext;
                if (compositionContext == null) {
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (compositionImpl3 != null) {
                    if (compositionImpl3.state == 3) {
                    }
                    nodeState2.composition = compositionImpl3;
                    Function2 function22 = nodeState2.content;
                    androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(this.root);
                    if ((androidComposeView.isAttachedToWindow() ? androidComposeView : null) == null) {
                        nodeState2.composedWithReusableContentHost = false;
                    } else {
                        nodeState2.composedWithReusableContentHost = true;
                        function22 = new ComposableLambdaImpl(new CoreTraceWriter$write$1(2, nodeState2, function22), true, 1524156494);
                    }
                    if (z) {
                        if (nodeState2.forceReuse) {
                            compositionImpl3.clearDeactivated();
                            compositionImpl3.ensureRunning();
                            GapComposer gapComposer = compositionImpl3.composer;
                            gapComposer.reusingGroup = 0;
                            gapComposer.reusing = true;
                            compositionImpl3.composable = function22;
                            compositionImpl3.parent.composeInitial$runtime(compositionImpl3, function22);
                            gapComposer.endReuseFromRoot$runtime();
                        } else {
                            compositionImpl3.setContent(function22);
                        }
                    } else if (nodeState2.forceReuse) {
                        compositionImpl3.clearDeactivated();
                        compositionImpl3.ensureRunning();
                        nodeState2.pausedComposition = compositionImpl3.composeInitialPaused(true, function22);
                    } else {
                        nodeState2.pausedComposition = compositionImpl3.composeInitialPaused(compositionImpl3.clearDeactivated(), function22);
                    }
                    nodeState2.forceReuse = false;
                    layoutNode2.ignoreRemeasureRequests = false;
                    zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    nodeState2.forceRecompose = false;
                }
                if (z) {
                    ViewGroup.LayoutParams layoutParams = Wrapper_androidKt.DefaultLayoutParams;
                    compositionImpl = new CompositionImpl(compositionContext, new UiApplier(layoutNode));
                } else {
                    ViewGroup.LayoutParams layoutParams2 = Wrapper_androidKt.DefaultLayoutParams;
                    compositionImpl = new CompositionImpl(compositionContext, new UiApplier(layoutNode));
                }
                compositionImpl3 = compositionImpl;
                nodeState2.composition = compositionImpl3;
                Function2 function222 = nodeState2.content;
                androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(this.root);
                if ((androidComposeView.isAttachedToWindow() ? androidComposeView : null) == null) {
                }
                if (z) {
                }
                nodeState2.forceReuse = false;
                layoutNode2.ignoreRemeasureRequests = false;
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                nodeState2.forceRecompose = false;
            } catch (Throwable th) {
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        }
    }

    public final LayoutNode takeNodeFromReusables(Object obj) {
        MutableScatterMap mutableScatterMap;
        int i;
        if (this.reusableCount == 0) {
            return null;
        }
        MutableVector.MutableVectorList mutableVectorList = (MutableVector.MutableVectorList) this.root.getFoldedChildren$ui();
        int i2 = mutableVectorList.vector.size - this.precomposedCount;
        int i3 = i2 - this.reusableCount;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            mutableScatterMap = this.nodeToNodeState;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object obj2 = mutableScatterMap.get((LayoutNode) mutableVectorList.get(i5));
            obj2.getClass();
            if (Intrinsics.areEqual(((NodeState) obj2).slotId, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object obj3 = mutableScatterMap.get((LayoutNode) mutableVectorList.get(i4));
                obj3.getClass();
                NodeState nodeState = (NodeState) obj3;
                Object obj4 = nodeState.slotId;
                if (obj4 == RulerKt.ReusedSlotId || this.slotReusePolicy.areCompatible(obj, obj4)) {
                    nodeState.slotId = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            move$1(i5, i3);
        }
        this.reusableCount--;
        LayoutNode layoutNode = (LayoutNode) mutableVectorList.get(i3);
        Object obj5 = mutableScatterMap.get(layoutNode);
        obj5.getClass();
        NodeState nodeState2 = (NodeState) obj5;
        nodeState2.activeState = Updater.mutableStateOf$default(Boolean.TRUE);
        nodeState2.forceReuse = true;
        nodeState2.forceRecompose = true;
        return layoutNode;
    }

    public final class ApproachMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {
        public final /* synthetic */ Scope $$delegate_0;

        public ApproachMeasureScopeImpl() {
            this.$$delegate_0 = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getDensity() {
            return this.$$delegate_0.density;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getFontScale() {
            return this.$$delegate_0.fontScale;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public final LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.layoutDirection;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public final boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public final MeasureResult layout(int i, int i2, Map map, Function1 function1) {
            return this.$$delegate_0.layout(i, i2, map, null, function1);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public final int mo229roundToPxR2X_6o(long j) {
            return this.$$delegate_0.mo229roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public final int mo230roundToPx0680j_4(float f) {
            return this.$$delegate_0.mo230roundToPx0680j_4(f);
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public final List subcompose(Object obj, Function2 function2) {
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            LayoutNode layoutNode = layoutNodeSubcompositionsState.root;
            MutableScatterMap mutableScatterMap = layoutNodeSubcompositionsState.slotIdToNode;
            LayoutNode layoutNode2 = (LayoutNode) mutableScatterMap.get(obj);
            if (layoutNode2 != null && ((MutableVector.MutableVectorList) layoutNode.getFoldedChildren$ui()).vector.indexOf(layoutNode2) < layoutNodeSubcompositionsState.currentIndex) {
                return layoutNode2.getChildMeasurables$ui();
            }
            MutableScatterMap mutableScatterMap2 = layoutNodeSubcompositionsState.approachPrecomposeSlotHandleMap;
            MutableScatterMap mutableScatterMap3 = layoutNodeSubcompositionsState.precomposeMap;
            MutableVector mutableVector = layoutNodeSubcompositionsState.slotIdsOfCompositionsNeededInApproach;
            if (mutableVector.size < layoutNodeSubcompositionsState.currentApproachIndex) {
                InlineClassHelperKt.throwIllegalArgumentException("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
            }
            LayoutNode layoutNode3 = (LayoutNode) mutableScatterMap.get(obj);
            int i = mutableVector.size;
            int i2 = layoutNodeSubcompositionsState.currentApproachIndex;
            if (i == i2) {
                mutableVector.add(obj);
            } else {
                Object[] objArr = mutableVector.content;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
            }
            layoutNodeSubcompositionsState.currentApproachIndex++;
            boolean contains = mutableScatterMap3.contains(obj);
            if (contains || layoutNode3 != null) {
                if (!contains && layoutNode3 != null) {
                    layoutNodeSubcompositionsState.move$1(((MutableVector.MutableVectorList) layoutNode.getFoldedChildren$ui()).vector.indexOf(layoutNode3), ((MutableVector.MutableVectorList) layoutNode.getFoldedChildren$ui()).vector.size);
                    layoutNodeSubcompositionsState.precomposedCount++;
                    mutableScatterMap.remove(obj);
                    mutableScatterMap3.set(obj, layoutNode3);
                    mutableScatterMap2.set(obj, layoutNodeSubcompositionsState.createPrecomposedSlotHandle(obj));
                    if (layoutNode.isAttached()) {
                        layoutNodeSubcompositionsState.makeSureStateIsConsistent();
                    }
                }
                LayoutNode layoutNode4 = (LayoutNode) mutableScatterMap3.get(obj);
                NodeState nodeState = layoutNode4 != null ? (NodeState) layoutNodeSubcompositionsState.nodeToNodeState.get(layoutNode4) : null;
                if (nodeState != null && nodeState.forceRecompose) {
                    layoutNodeSubcompositionsState.subcompose(layoutNode4, obj, false, function2);
                }
                if ((nodeState != null ? nodeState.pausedComposition : null) != null) {
                    layoutNodeSubcompositionsState.applyPausedPrecomposition(nodeState, true);
                }
            } else {
                layoutNodeSubcompositionsState.precompose(obj, function2, false);
                mutableScatterMap2.set(obj, layoutNodeSubcompositionsState.createPrecomposedSlotHandle(obj));
            }
            LayoutNode layoutNode5 = (LayoutNode) mutableScatterMap3.get(obj);
            if (layoutNode5 == null) {
                return EmptyList.INSTANCE;
            }
            List childDelegates$ui = layoutNode5.layoutDelegate.measurePassDelegate.getChildDelegates$ui();
            int size = childDelegates$ui.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((MeasurePassDelegate) ((MutableVector.MutableVectorList) childDelegates$ui).get(i3)).layoutNodeLayoutDelegate.detachedFromParentLookaheadPass = true;
            }
            return childDelegates$ui;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-GaN1DYA */
        public final float mo231toDpGaN1DYA(long j) {
            return this.$$delegate_0.mo231toDpGaN1DYA(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public final float mo232toDpu2uoSUM(float f) {
            return f / this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public final long mo234toDpSizekrfVVM(long j) {
            return this.$$delegate_0.mo234toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public final float mo235toPxR2X_6o(long j) {
            return this.$$delegate_0.mo235toPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public final float mo236toPx0680j_4(float f) {
            return this.$$delegate_0.getDensity() * f;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public final long mo237toSizeXkaWNTQ(long j) {
            return this.$$delegate_0.mo237toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-0xMU5do */
        public final long mo238toSp0xMU5do(float f) {
            return this.$$delegate_0.mo238toSp0xMU5do(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public final long mo239toSpkPz2Gy4(float f) {
            return this.$$delegate_0.mo239toSpkPz2Gy4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public final float mo233toDpu2uoSUM(int i) {
            return this.$$delegate_0.mo233toDpu2uoSUM(i);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public final MeasureResult layout(int i, int i2, Map map, Function1 function1, Function1 function12) {
            return this.$$delegate_0.layout(i, i2, map, function1, function12);
        }
    }
}
