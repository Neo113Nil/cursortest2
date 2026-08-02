package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TailModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.Velocity;
import androidx.datastore.core.SimpleActor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.contour.ContourLayout$geometry$1;
import curtains.WindowsKt$onNextDraw$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {
    public NestedScrollConnection connection;
    public NestedScrollNode lastKnownParentNode;
    public SimpleActor resolvedDispatcher;
    public final String traverseKey;

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, SimpleActor simpleActor) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = simpleActor == null ? new SimpleActor(3) : simpleActor;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final CoroutineScope getNestedCoroutineScope() {
        NestedScrollNode parentNestedScrollNode$ui = getParentNestedScrollNode$ui();
        CoroutineScope nestedCoroutineScope = parentNestedScrollNode$ui != null ? parentNestedScrollNode$ui.getNestedCoroutineScope() : null;
        if (nestedCoroutineScope != null && JobKt.isActive(nestedCoroutineScope)) {
            return nestedCoroutineScope;
        }
        CoroutineScope coroutineScope = (CoroutineScope) this.resolvedDispatcher.scope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        a$$ExternalSyntheticBUOutline0.m$1("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final NestedScrollNode getParentNestedScrollNode$ui() {
        NodeChain nodeChain;
        TraversableNode traversableNode = null;
        if (!isAttached()) {
            return null;
        }
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = getNode().getParent$ui();
        LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(this);
        loop0: while (true) {
            if (requireLayoutNode == null) {
                break;
            }
            if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                        Modifier.Node node = parent$ui;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof TraversableNode) {
                                TraversableNode traversableNode2 = (TraversableNode) node;
                                if (Intrinsics.areEqual(this.traverseKey, traversableNode2.getTraverseKey()) && NestedScrollNode.class == traversableNode2.getClass()) {
                                    traversableNode = traversableNode2;
                                    break loop0;
                                }
                            }
                            if ((node.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node node2 = ((DelegatingNode) node).delegate; node2 != null; node2 = node2.getChild$ui()) {
                                    if ((node2.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = node2;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(node2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DepthSortedSetKt.access$pop(mutableVector);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
        }
        return (NestedScrollNode) traversableNode;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        SimpleActor simpleActor = this.resolvedDispatcher;
        simpleActor.consumeMessage = this;
        simpleActor.messageQueue = null;
        this.lastKnownParentNode = null;
        simpleActor.remainingMessages = new ContourLayout$geometry$1(this, 4);
        simpleActor.scope = getCoroutineScope();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        DepthSortedSetKt.traverseAncestors(this, new WindowsKt$onNextDraw$1(ref$ObjectRef, 5));
        NestedScrollNode nestedScrollNode = (NestedScrollNode) ((TraversableNode) ref$ObjectRef.element);
        this.lastKnownParentNode = nestedScrollNode;
        SimpleActor simpleActor = this.resolvedDispatcher;
        simpleActor.messageQueue = nestedScrollNode;
        if (((NestedScrollNode) simpleActor.consumeMessage) == this) {
            simpleActor.consumeMessage = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo241onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        int i;
        long j3;
        long m1073unboximpl;
        NestedScrollConnection nestedScrollConnection;
        long j4;
        long j5;
        if (continuation instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) continuation;
            int i2 = nestedScrollNode$onPostFling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                nestedScrollNode$onPostFling$1.label = i2 - PKIFailureInfo.systemUnavail;
                NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$12 = nestedScrollNode$onPostFling$1;
                Object obj = nestedScrollNode$onPostFling$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nestedScrollNode$onPostFling$12.label;
                NestedScrollNode nestedScrollNode = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    NestedScrollConnection nestedScrollConnection2 = this.connection;
                    nestedScrollNode$onPostFling$12.J$0 = j;
                    nestedScrollNode$onPostFling$12.J$1 = j2;
                    nestedScrollNode$onPostFling$12.label = 1;
                    obj = nestedScrollConnection2.mo241onPostFlingRZ2iAVY(j, j2, nestedScrollNode$onPostFling$12);
                    if (obj != coroutineSingletons) {
                        j3 = j2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j5 = nestedScrollNode$onPostFling$12.J$0;
                    SafeTrace.throwOnFailure(obj);
                    j4 = ((Velocity) obj).m1073unboximpl();
                    m1073unboximpl = j5;
                    return Velocity.m1064boximpl(Velocity.m1070plusAH228Gc(m1073unboximpl, j4));
                }
                long j6 = nestedScrollNode$onPostFling$12.J$1;
                long j7 = nestedScrollNode$onPostFling$12.J$0;
                SafeTrace.throwOnFailure(obj);
                j3 = j6;
                j = j7;
                m1073unboximpl = ((Velocity) obj).m1073unboximpl();
                if (isAttached()) {
                    nestedScrollNode = this.lastKnownParentNode;
                } else if (isAttached()) {
                    nestedScrollNode = getParentNestedScrollNode$ui();
                }
                nestedScrollConnection = nestedScrollNode;
                if (nestedScrollConnection != null) {
                    j4 = 0;
                    return Velocity.m1064boximpl(Velocity.m1070plusAH228Gc(m1073unboximpl, j4));
                }
                long m1070plusAH228Gc = Velocity.m1070plusAH228Gc(j, m1073unboximpl);
                long m1069minusAH228Gc = Velocity.m1069minusAH228Gc(j3, m1073unboximpl);
                nestedScrollNode$onPostFling$12.J$0 = m1073unboximpl;
                nestedScrollNode$onPostFling$12.label = 2;
                obj = nestedScrollConnection.mo241onPostFlingRZ2iAVY(m1070plusAH228Gc, m1069minusAH228Gc, nestedScrollNode$onPostFling$12);
                if (obj != coroutineSingletons) {
                    j5 = m1073unboximpl;
                    j4 = ((Velocity) obj).m1073unboximpl();
                    m1073unboximpl = j5;
                    return Velocity.m1064boximpl(Velocity.m1070plusAH228Gc(m1073unboximpl, j4));
                }
                return coroutineSingletons;
            }
        }
        nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, (ContinuationImpl) continuation);
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$122 = nestedScrollNode$onPostFling$1;
        Object obj2 = nestedScrollNode$onPostFling$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nestedScrollNode$onPostFling$122.label;
        NestedScrollNode nestedScrollNode2 = null;
        if (i != 0) {
        }
        m1073unboximpl = ((Velocity) obj2).m1073unboximpl();
        if (isAttached()) {
        }
        nestedScrollConnection = nestedScrollNode2;
        if (nestedScrollConnection != null) {
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo242onPostScrollDzOQY0M(int i, long j, long j2) {
        long mo242onPostScrollDzOQY0M = this.connection.mo242onPostScrollDzOQY0M(i, j, j2);
        NestedScrollNode parentNestedScrollNode$ui = isAttached() ? getParentNestedScrollNode$ui() : null;
        return Offset.m626plusMKHz9U(mo242onPostScrollDzOQY0M, parentNestedScrollNode$ui != null ? parentNestedScrollNode$ui.mo242onPostScrollDzOQY0M(i, Offset.m626plusMKHz9U(j, mo242onPostScrollDzOQY0M), Offset.m625minusMKHz9U(j2, mo242onPostScrollDzOQY0M)) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo493onPreFlingQWom1Mo(long j, Continuation continuation) {
        NestedScrollNode$onPreFling$1 nestedScrollNode$onPreFling$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        long j2;
        long j3;
        if (continuation instanceof NestedScrollNode$onPreFling$1) {
            nestedScrollNode$onPreFling$1 = (NestedScrollNode$onPreFling$1) continuation;
            int i2 = nestedScrollNode$onPreFling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                nestedScrollNode$onPreFling$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = nestedScrollNode$onPreFling$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nestedScrollNode$onPreFling$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    NestedScrollNode parentNestedScrollNode$ui = isAttached() ? getParentNestedScrollNode$ui() : null;
                    if (parentNestedScrollNode$ui == null) {
                        j2 = 0;
                        NestedScrollConnection nestedScrollConnection = this.connection;
                        long m1069minusAH228Gc = Velocity.m1069minusAH228Gc(j, j2);
                        nestedScrollNode$onPreFling$1.J$0 = j2;
                        nestedScrollNode$onPreFling$1.label = 2;
                        obj = nestedScrollConnection.mo493onPreFlingQWom1Mo(m1069minusAH228Gc, nestedScrollNode$onPreFling$1);
                        if (obj != coroutineSingletons) {
                            j3 = j2;
                            return Velocity.m1064boximpl(Velocity.m1070plusAH228Gc(j3, ((Velocity) obj).m1073unboximpl()));
                        }
                        return coroutineSingletons;
                    }
                    nestedScrollNode$onPreFling$1.J$0 = j;
                    nestedScrollNode$onPreFling$1.label = 1;
                    obj = parentNestedScrollNode$ui.mo493onPreFlingQWom1Mo(j, nestedScrollNode$onPreFling$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = nestedScrollNode$onPreFling$1.J$0;
                        SafeTrace.throwOnFailure(obj);
                        return Velocity.m1064boximpl(Velocity.m1070plusAH228Gc(j3, ((Velocity) obj).m1073unboximpl()));
                    }
                    j = nestedScrollNode$onPreFling$1.J$0;
                    SafeTrace.throwOnFailure(obj);
                }
                j2 = ((Velocity) obj).m1073unboximpl();
                NestedScrollConnection nestedScrollConnection2 = this.connection;
                long m1069minusAH228Gc2 = Velocity.m1069minusAH228Gc(j, j2);
                nestedScrollNode$onPreFling$1.J$0 = j2;
                nestedScrollNode$onPreFling$1.label = 2;
                obj = nestedScrollConnection2.mo493onPreFlingQWom1Mo(m1069minusAH228Gc2, nestedScrollNode$onPreFling$1);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        nestedScrollNode$onPreFling$1 = new NestedScrollNode$onPreFling$1(this, (ContinuationImpl) continuation);
        obj = nestedScrollNode$onPreFling$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nestedScrollNode$onPreFling$1.label;
        if (i != 0) {
        }
        j2 = ((Velocity) obj).m1073unboximpl();
        NestedScrollConnection nestedScrollConnection22 = this.connection;
        long m1069minusAH228Gc22 = Velocity.m1069minusAH228Gc(j, j2);
        nestedScrollNode$onPreFling$1.J$0 = j2;
        nestedScrollNode$onPreFling$1.label = 2;
        obj = nestedScrollConnection22.mo493onPreFlingQWom1Mo(m1069minusAH228Gc22, nestedScrollNode$onPreFling$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo326onPreScrollOzD1aCk(int i, long j) {
        NestedScrollNode parentNestedScrollNode$ui = isAttached() ? getParentNestedScrollNode$ui() : null;
        long mo326onPreScrollOzD1aCk = parentNestedScrollNode$ui != null ? parentNestedScrollNode$ui.mo326onPreScrollOzD1aCk(i, j) : 0L;
        return Offset.m626plusMKHz9U(mo326onPreScrollOzD1aCk, this.connection.mo326onPreScrollOzD1aCk(i, Offset.m625minusMKHz9U(j, mo326onPreScrollOzD1aCk)));
    }
}
