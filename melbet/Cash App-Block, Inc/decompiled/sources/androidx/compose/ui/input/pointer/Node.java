package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.media3.common.util.LongArray;
import com.google.android.gms.tasks.zzr;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class Node extends NodeParent {
    public NodeCoordinator coordinates;
    public final Modifier.Node modifierNode;
    public PointerEvent pointerEvent;
    public boolean wasIn;
    public final LongArray pointerIds = new LongArray();
    public final LongSparseArray relevantChanges = new LongSparseArray(2);
    public boolean isIn = true;
    public boolean hasExited = true;

    public Node(Modifier.Node node) {
        this.modifierNode = node;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public final boolean buildCache(LongSparseArray longSparseArray, LayoutCoordinates layoutCoordinates, zzr zzrVar, boolean z) {
        LongArray longArray;
        LongSparseArray longSparseArray2;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        PointerEvent pointerEvent;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        boolean z7;
        int i3;
        int i4;
        List list;
        int i5;
        boolean buildCache = super.buildCache(longSparseArray, layoutCoordinates, zzrVar, z);
        DelegatingNode delegatingNode = this.modifierNode;
        if (delegatingNode.isAttached()) {
            ?? r8 = 0;
            while (delegatingNode != 0) {
                if (delegatingNode instanceof PointerInputModifierNode) {
                    this.coordinates = PointerInputModifierNodeKt.getLayoutCoordinates((PointerInputModifierNode) delegatingNode);
                } else if ((delegatingNode.getKindSet$ui() & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                    Modifier.Node node = delegatingNode.delegate;
                    int i6 = 0;
                    delegatingNode = delegatingNode;
                    r8 = r8;
                    while (node != null) {
                        if ((node.getKindSet$ui() & 16) != 0) {
                            i6++;
                            r8 = r8;
                            if (i6 == 1) {
                                delegatingNode = node;
                            } else {
                                if (r8 == 0) {
                                    r8 = new MutableVector(0, new Modifier.Node[16]);
                                }
                                if (delegatingNode != 0) {
                                    r8.add(delegatingNode);
                                    delegatingNode = 0;
                                }
                                r8.add(node);
                            }
                        }
                        node = node.getChild$ui();
                        delegatingNode = delegatingNode;
                        r8 = r8;
                    }
                    if (i6 == 1) {
                    }
                }
                delegatingNode = DepthSortedSetKt.access$pop(r8);
            }
            if (this.coordinates != null) {
                int size = longSparseArray.size();
                int i7 = 0;
                while (true) {
                    longArray = this.pointerIds;
                    longSparseArray2 = this.relevantChanges;
                    if (i7 >= size) {
                        break;
                    }
                    long keyAt = longSparseArray.keyAt(i7);
                    PointerInputChange pointerInputChange = (PointerInputChange) longSparseArray.valueAt(i7);
                    if (longArray.contains(keyAt)) {
                        long m817getPreviousPositionF1C5BW0 = pointerInputChange.m817getPreviousPositionF1C5BW0();
                        long m816getPositionF1C5BW0 = pointerInputChange.m816getPositionF1C5BW0();
                        if ((((m817getPreviousPositionF1C5BW0 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((m816getPositionF1C5BW0 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList = new ArrayList(pointerInputChange.getHistorical().size());
                            List historical = pointerInputChange.getHistorical();
                            z7 = buildCache;
                            int size2 = historical.size();
                            i3 = size;
                            int i8 = 0;
                            while (i8 < size2) {
                                HistoricalChange historicalChange = (HistoricalChange) historical.get(i8);
                                int i9 = size2;
                                int i10 = i8;
                                long m796getPositionF1C5BW0 = historicalChange.m796getPositionF1C5BW0();
                                if ((((m796getPositionF1C5BW0 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long uptimeMillis = historicalChange.getUptimeMillis();
                                    list = historical;
                                    NodeCoordinator nodeCoordinator = this.coordinates;
                                    nodeCoordinator.getClass();
                                    i5 = i7;
                                    arrayList.add(new HistoricalChange(uptimeMillis, nodeCoordinator.mo840localPositionOfS_NoaFU(layoutCoordinates, m796getPositionF1C5BW0, true), historicalChange.getScaleFactor(), historicalChange.m795getPanOffsetF1C5BW0(), historicalChange.m794getOriginalEventPositionF1C5BW0$ui()));
                                } else {
                                    list = historical;
                                    i5 = i7;
                                }
                                i8 = i10 + 1;
                                size2 = i9;
                                historical = list;
                                i7 = i5;
                            }
                            i4 = i7;
                            NodeCoordinator nodeCoordinator2 = this.coordinates;
                            nodeCoordinator2.getClass();
                            long mo840localPositionOfS_NoaFU = nodeCoordinator2.mo840localPositionOfS_NoaFU(layoutCoordinates, m817getPreviousPositionF1C5BW0, true);
                            NodeCoordinator nodeCoordinator3 = this.coordinates;
                            nodeCoordinator3.getClass();
                            longSparseArray2.put(PointerInputChange.m814copyOHpmEuE$default(pointerInputChange, nodeCoordinator3.mo840localPositionOfS_NoaFU(layoutCoordinates, m816getPositionF1C5BW0, true), mo840localPositionOfS_NoaFU, arrayList), keyAt);
                            i7 = i4 + 1;
                            buildCache = z7;
                            size = i3;
                        }
                    }
                    z7 = buildCache;
                    i3 = size;
                    i4 = i7;
                    i7 = i4 + 1;
                    buildCache = z7;
                    size = i3;
                }
                boolean z8 = buildCache;
                if (longSparseArray2.isEmpty()) {
                    longArray.clear();
                    this.children.clear();
                    return true;
                }
                int size3 = longArray.getSize();
                while (true) {
                    size3--;
                    if (-1 >= size3) {
                        break;
                    }
                    if (longSparseArray.indexOfKey(longArray.m1140get_I2yYro(size3)) < 0) {
                        longArray.removeAt(size3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(longSparseArray2.size());
                int size4 = longSparseArray2.size();
                for (int i11 = 0; i11 < size4; i11++) {
                    arrayList2.add(longSparseArray2.valueAt(i11));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList2, zzrVar);
                int size5 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size5) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i12);
                    if (zzrVar.m2031activeHoverEvent0FcD4WY(((PointerInputChange) obj).m815getIdJ3iCeTQ())) {
                        break;
                    }
                    i12++;
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                if (pointerInputChange2 != null) {
                    if (z) {
                        z2 = false;
                        if (!this.isIn && (pointerInputChange2.getPressed() || pointerInputChange2.getPreviousPressed())) {
                            this.coordinates.getClass();
                            z3 = true;
                            this.isIn = !PointerEventKt.m806isOutOfBoundsO0kMr_c(r3.measuredSize, pointerInputChange2);
                            z5 = this.isIn;
                            z6 = this.wasIn;
                            if (z5 == z6 && ((i2 = pointerEvent2.f858type) == 3 || i2 == 4 || i2 == 5)) {
                                pointerEvent2.f858type = z5 ? 4 : 5;
                            } else {
                                i = pointerEvent2.f858type;
                                if (i != 4 && z6 && !this.hasExited) {
                                    pointerEvent2.f858type = 3;
                                } else if (i == 5 && z5 && pointerInputChange2.getPressed()) {
                                    pointerEvent2.f858type = 3;
                                }
                            }
                        }
                    } else {
                        z2 = false;
                        this.isIn = false;
                    }
                    z3 = true;
                    z5 = this.isIn;
                    z6 = this.wasIn;
                    if (z5 == z6) {
                    }
                    i = pointerEvent2.f858type;
                    if (i != 4) {
                    }
                    if (i == 5) {
                        pointerEvent2.f858type = 3;
                    }
                } else {
                    z2 = false;
                    z3 = true;
                }
                if (!z8 && pointerEvent2.f858type == 3 && (pointerEvent = this.pointerEvent) != null) {
                    ?? r1 = pointerEvent.changes;
                    int size6 = r1.size();
                    ?? r4 = pointerEvent2.changes;
                    if (size6 == r4.size()) {
                        int size7 = r4.size();
                        for (?? r5 = z2; r5 < size7; r5++) {
                            if (Offset.m622equalsimpl0(((PointerInputChange) r1.get(r5)).m816getPositionF1C5BW0(), ((PointerInputChange) r4.get(r5)).m816getPositionF1C5BW0())) {
                            }
                        }
                        z4 = z2;
                        this.pointerEvent = pointerEvent2;
                        return z4;
                    }
                }
                z4 = z3;
                this.pointerEvent = pointerEvent2;
                return z4;
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public final void cleanUpHits(zzr zzrVar) {
        super.cleanUpHits(zzrVar);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List list = pointerEvent.changes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i);
            boolean pressed = pointerInputChange.getPressed();
            boolean m2031activeHoverEvent0FcD4WY = zzrVar.m2031activeHoverEvent0FcD4WY(pointerInputChange.m815getIdJ3iCeTQ());
            boolean z = this.isIn;
            if ((!pressed && !m2031activeHoverEvent0FcD4WY) || (!pressed && !z)) {
                this.pointerIds.remove(pointerInputChange.m815getIdJ3iCeTQ());
            }
        }
        this.isIn = false;
        this.hasExited = pointerEvent.f858type == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void dispatchCancel() {
        MutableVector mutableVector = this.children;
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            ((Node) objArr[i2]).dispatchCancel();
        }
        DelegatingNode delegatingNode = this.modifierNode;
        ?? r1 = 0;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNode).onCancelPointerInput();
            } else if ((delegatingNode.getKindSet$ui() & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                Modifier.Node node = delegatingNode.delegate;
                int i3 = 0;
                r1 = r1;
                delegatingNode = delegatingNode;
                while (node != null) {
                    if ((node.getKindSet$ui() & 16) != 0) {
                        i3++;
                        r1 = r1;
                        if (i3 == 1) {
                            delegatingNode = node;
                        } else {
                            if (r1 == 0) {
                                r1 = new MutableVector(0, new Modifier.Node[16]);
                            }
                            if (delegatingNode != 0) {
                                r1.add(delegatingNode);
                                delegatingNode = 0;
                            }
                            r1.add(node);
                        }
                    }
                    node = node.getChild$ui();
                    r1 = r1;
                    delegatingNode = delegatingNode;
                }
                if (i3 == 1) {
                }
            }
            delegatingNode = DepthSortedSetKt.access$pop(r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean dispatchFinalEventPass(zzr zzrVar) {
        LayoutNode layoutNode;
        LongSparseArray longSparseArray = this.relevantChanges;
        boolean z = false;
        z = false;
        z = false;
        if (!longSparseArray.isEmpty()) {
            Modifier.Node node = this.modifierNode;
            if (node.isAttached()) {
                NodeCoordinator coordinator$ui = node.getCoordinator$ui();
                if ((coordinator$ui == null || (layoutNode = coordinator$ui.layoutNode) == null) ? false : layoutNode.isPlaced()) {
                    PointerEvent pointerEvent = this.pointerEvent;
                    pointerEvent.getClass();
                    NodeCoordinator nodeCoordinator = this.coordinates;
                    nodeCoordinator.getClass();
                    long j = nodeCoordinator.measuredSize;
                    DelegatingNode delegatingNode = node;
                    ?? r8 = 0;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNode).mo162onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, j);
                        } else if ((delegatingNode.getKindSet$ui() & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node node2 = delegatingNode.delegate;
                            int i = 0;
                            delegatingNode = delegatingNode;
                            r8 = r8;
                            while (node2 != null) {
                                if ((node2.getKindSet$ui() & 16) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        delegatingNode = node2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new MutableVector(0, new Modifier.Node[16]);
                                        }
                                        if (delegatingNode != 0) {
                                            r8.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        r8.add(node2);
                                    }
                                }
                                node2 = node2.getChild$ui();
                                delegatingNode = delegatingNode;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNode = DepthSortedSetKt.access$pop(r8);
                    }
                    if (node.isAttached()) {
                        MutableVector mutableVector = this.children;
                        Object[] objArr = mutableVector.content;
                        int i2 = mutableVector.size;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((Node) objArr[i3]).dispatchFinalEventPass(zzrVar);
                        }
                    }
                    z = true;
                }
            }
        }
        cleanUpHits(zzrVar);
        longSparseArray.clear();
        this.coordinates = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean dispatchMainEventPass(zzr zzrVar, boolean z) {
        LayoutNode layoutNode;
        if (!this.relevantChanges.isEmpty()) {
            DelegatingNode delegatingNode = this.modifierNode;
            if (delegatingNode.isAttached()) {
                NodeCoordinator coordinator$ui = delegatingNode.getCoordinator$ui();
                if ((coordinator$ui == null || (layoutNode = coordinator$ui.layoutNode) == null) ? false : layoutNode.isPlaced()) {
                    PointerEvent pointerEvent = this.pointerEvent;
                    pointerEvent.getClass();
                    NodeCoordinator nodeCoordinator = this.coordinates;
                    nodeCoordinator.getClass();
                    long j = nodeCoordinator.measuredSize;
                    DelegatingNode delegatingNode2 = delegatingNode;
                    ?? r7 = 0;
                    while (delegatingNode2 != 0) {
                        if (delegatingNode2 instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNode2).mo162onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, j);
                        } else if ((delegatingNode2.getKindSet$ui() & 16) != 0 && (delegatingNode2 instanceof DelegatingNode)) {
                            Modifier.Node node = delegatingNode2.delegate;
                            int i = 0;
                            delegatingNode2 = delegatingNode2;
                            r7 = r7;
                            while (node != null) {
                                if ((node.getKindSet$ui() & 16) != 0) {
                                    i++;
                                    r7 = r7;
                                    if (i == 1) {
                                        delegatingNode2 = node;
                                    } else {
                                        if (r7 == 0) {
                                            r7 = new MutableVector(0, new Modifier.Node[16]);
                                        }
                                        if (delegatingNode2 != 0) {
                                            r7.add(delegatingNode2);
                                            delegatingNode2 = 0;
                                        }
                                        r7.add(node);
                                    }
                                }
                                node = node.getChild$ui();
                                delegatingNode2 = delegatingNode2;
                                r7 = r7;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNode2 = DepthSortedSetKt.access$pop(r7);
                    }
                    if (delegatingNode.isAttached()) {
                        MutableVector mutableVector = this.children;
                        Object[] objArr = mutableVector.content;
                        int i2 = mutableVector.size;
                        for (int i3 = 0; i3 < i2; i3++) {
                            Node node2 = (Node) objArr[i3];
                            this.coordinates.getClass();
                            node2.dispatchMainEventPass(zzrVar, z);
                        }
                    }
                    if (delegatingNode.isAttached()) {
                        ?? r13 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof PointerInputModifierNode) {
                                ((PointerInputModifierNode) delegatingNode).mo162onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, j);
                            } else if ((delegatingNode.getKindSet$ui() & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node3 = delegatingNode.delegate;
                                int i4 = 0;
                                delegatingNode = delegatingNode;
                                r13 = r13;
                                while (node3 != null) {
                                    if ((node3.getKindSet$ui() & 16) != 0) {
                                        i4++;
                                        r13 = r13;
                                        if (i4 == 1) {
                                            delegatingNode = node3;
                                        } else {
                                            if (r13 == 0) {
                                                r13 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r13.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r13.add(node3);
                                        }
                                    }
                                    node3 = node3.getChild$ui();
                                    delegatingNode = delegatingNode;
                                    r13 = r13;
                                }
                                if (i4 == 1) {
                                }
                            }
                            delegatingNode = DepthSortedSetKt.access$pop(r13);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void removeInvalidPointerIdsAndChanges(long j, MutableObjectList mutableObjectList) {
        LongArray longArray = this.pointerIds;
        if (longArray.contains(j) && mutableObjectList.indexOf(this) < 0) {
            longArray.remove(j);
            this.relevantChanges.remove(j);
        }
        MutableVector mutableVector = this.children;
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            ((Node) objArr[i2]).removeInvalidPointerIdsAndChanges(j, mutableObjectList);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.modifierNode + ", children=" + this.children + ", pointerIds=" + this.pointerIds + ')';
    }
}
