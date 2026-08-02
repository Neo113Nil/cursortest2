package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.google.android.gms.tasks.zzr;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class HitPathTracker {
    public boolean clearNodeCacheAfterDispatchedEvent;
    public boolean dispatchCancelAfterDispatchedEvent;
    public boolean dispatchingEvent;
    public boolean removeSpecificNodesAfterDispatchedEvent;
    public final LayoutCoordinates rootCoordinates;
    public final MutableObjectList nodesToRemove = new MutableObjectList();
    public final NodeParent root = new NodeParent();
    public final MutableLongObjectMap hitPointerIdsAndNodesForPruningNonMatches = new MutableLongObjectMap(10);

    public HitPathTracker(LayoutCoordinates layoutCoordinates) {
        this.rootCoordinates = layoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* renamed from: addHitPath-QJqDSyo, reason: not valid java name */
    public final void m797addHitPathQJqDSyo(long j, List list, boolean z) {
        MutableLongObjectMap mutableLongObjectMap;
        long[] jArr;
        long[] jArr2;
        int i;
        Node node;
        Node node2;
        int size = list.size();
        NodeParent nodeParent = this.root;
        NodeParent nodeParent2 = nodeParent;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            mutableLongObjectMap = this.hitPointerIdsAndNodesForPruningNonMatches;
            if (i2 >= size) {
                break;
            }
            Modifier.Node node3 = (Modifier.Node) list.get(i2);
            if (node3.isAttached()) {
                node3.setDetachedListener$ui(new ViewRegistryKt$buildView$1$2$1$1(2, this, node3));
                if (z2) {
                    MutableVector mutableVector = nodeParent2.children;
                    ?? r14 = mutableVector.content;
                    int i3 = mutableVector.size;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            node2 = 0;
                            break;
                        }
                        node2 = r14[i4];
                        if (Intrinsics.areEqual(((Node) node2).modifierNode, node3)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    node = node2;
                    if (node != null) {
                        node.isIn = true;
                        node.pointerIds.add(j);
                        if (z) {
                            Object obj = mutableLongObjectMap.get(j);
                            if (obj == null) {
                                obj = new MutableObjectList();
                                mutableLongObjectMap.set(obj, j);
                            }
                            ((MutableObjectList) obj).add(node);
                        }
                        nodeParent2 = node;
                    } else {
                        z2 = false;
                    }
                }
                node = new Node(node3);
                node.pointerIds.add(j);
                if (z) {
                    Object obj2 = mutableLongObjectMap.get(j);
                    if (obj2 == null) {
                        obj2 = new MutableObjectList();
                        mutableLongObjectMap.set(obj2, j);
                    }
                    ((MutableObjectList) obj2).add(node);
                }
                nodeParent2.children.add(node);
                nodeParent2 = node;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = mutableLongObjectMap.keys;
            Object[] objArr = mutableLongObjectMap.values;
            long[] jArr4 = mutableLongObjectMap.metadata;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                MutableObjectList mutableObjectList = (MutableObjectList) objArr[i9];
                                MutableVector mutableVector2 = nodeParent.children;
                                i = i6;
                                Object[] objArr2 = mutableVector2.content;
                                int i10 = mutableVector2.size;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((Node) objArr2[i11]).removeInvalidPointerIdsAndChanges(j3, mutableObjectList);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        mutableLongObjectMap.clear();
    }

    public final boolean dispatchChanges(zzr zzrVar, boolean z) {
        LongSparseArray longSparseArray = (LongSparseArray) zzrVar.zza;
        LayoutCoordinates layoutCoordinates = this.rootCoordinates;
        NodeParent nodeParent = this.root;
        boolean buildCache = nodeParent.buildCache(longSparseArray, layoutCoordinates, zzrVar, z);
        MutableVector mutableVector = nodeParent.children;
        if (!buildCache) {
            return false;
        }
        boolean z2 = true;
        this.dispatchingEvent = true;
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((Node) objArr[i2]).dispatchMainEventPass(zzrVar, z) || z3;
        }
        Object[] objArr2 = mutableVector.content;
        int i3 = mutableVector.size;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((Node) objArr2[i4]).dispatchFinalEventPass(zzrVar) || z4;
        }
        nodeParent.cleanUpHits(zzrVar);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.dispatchingEvent = false;
        if (this.removeSpecificNodesAfterDispatchedEvent) {
            this.removeSpecificNodesAfterDispatchedEvent = false;
            MutableObjectList mutableObjectList = this.nodesToRemove;
            int i5 = mutableObjectList._size;
            for (int i6 = 0; i6 < i5; i6++) {
                removePointerInputModifierNode((Modifier.Node) mutableObjectList.get(i6));
            }
            mutableObjectList.clear();
        }
        if (this.dispatchCancelAfterDispatchedEvent) {
            this.dispatchCancelAfterDispatchedEvent = false;
            processCancel();
        }
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = false;
            nodeParent.children.clear();
        }
        return z2;
    }

    public final void processCancel() {
        if (this.dispatchingEvent) {
            this.dispatchCancelAfterDispatchedEvent = true;
            return;
        }
        NodeParent nodeParent = this.root;
        MutableVector mutableVector = nodeParent.children;
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            ((Node) objArr[i2]).dispatchCancel();
        }
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = true;
        } else {
            nodeParent.children.clear();
        }
    }

    public final void removePointerInputModifierNode(Modifier.Node node) {
        if (this.dispatchingEvent) {
            this.removeSpecificNodesAfterDispatchedEvent = true;
            this.nodesToRemove.add(node);
            return;
        }
        NodeParent nodeParent = this.root;
        MutableObjectList mutableObjectList = nodeParent.removeMatchingPointerInputModifierNodeList;
        mutableObjectList.clear();
        mutableObjectList.add(nodeParent);
        while (mutableObjectList.isNotEmpty()) {
            NodeParent nodeParent2 = (NodeParent) mutableObjectList.removeAt(mutableObjectList._size - 1);
            int i = 0;
            while (true) {
                MutableVector mutableVector = nodeParent2.children;
                if (i < mutableVector.size) {
                    Node node2 = (Node) mutableVector.content[i];
                    if (Intrinsics.areEqual(node2.modifierNode, node)) {
                        nodeParent2.children.remove(node2);
                        node2.dispatchCancel();
                    } else {
                        mutableObjectList.add(node2);
                        i++;
                    }
                }
            }
        }
    }
}
