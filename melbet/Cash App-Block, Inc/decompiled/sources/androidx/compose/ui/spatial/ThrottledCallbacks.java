package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class ThrottledCallbacks {
    public Entry globalChangeEntries;
    public long minDebounceDeadline;
    public final MutableIntObjectMap rectChangedMap;
    public long screenOffset;
    public float[] viewToWindowMatrix;
    public long windowOffset;
    public long windowSize;

    public final class Entry {
        public long bottomRight;
        public final Function1 callback;
        public final int id;
        public long lastInvokeMillis = Long.MIN_VALUE;
        public Entry next;
        public final Modifier.Node node;
        public long topLeft;

        public Entry(int i, Modifier.Node node, Function1 function1) {
            this.id = i;
            this.node = node;
            this.callback = function1;
        }

        /* renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m955fire9b9wPM(long j, long j2, long j3, long j4, float[] fArr) {
            RelativeLayoutBounds m956rectInfoForDg36KO4 = ThrottledCallbacksKt.m956rectInfoForDg36KO4(j, j2, j3, j4, ThrottledCallbacks.this.windowSize, this.node, fArr);
            if (m956rectInfoForDg36KO4 == null) {
                return;
            }
            this.callback.invoke(m956rectInfoForDg36KO4);
        }

        public final void unregister() {
            ThrottledCallbacks throttledCallbacks = ThrottledCallbacks.this;
            MutableIntObjectMap mutableIntObjectMap = throttledCallbacks.rectChangedMap;
            int i = this.id;
            Entry entry = (Entry) mutableIntObjectMap.remove(i);
            if (entry != null) {
                if (entry == this) {
                    Entry entry2 = this.next;
                    this.next = null;
                    if (entry2 != null) {
                        mutableIntObjectMap.put(i, entry2);
                        return;
                    }
                    LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(this.node.getNode());
                    if (requireLayoutNode.addedToRectList) {
                        ((AndroidComposeView) LayoutNodeKt.requireOwner(requireLayoutNode)).rectManager.rects.updateHasCallbacks(requireLayoutNode.semanticsId, false);
                        return;
                    }
                    return;
                }
                mutableIntObjectMap.put(i, entry);
                while (true) {
                    Entry entry3 = entry.next;
                    if (entry3 == null) {
                        break;
                    }
                    if (entry3 == this) {
                        entry.next = this.next;
                        this.next = null;
                        return;
                    }
                    entry = entry3;
                }
            }
            Entry entry4 = throttledCallbacks.globalChangeEntries;
            if (entry4 == this) {
                throttledCallbacks.globalChangeEntries = entry4.next;
                this.next = null;
                return;
            }
            Entry entry5 = entry4 != null ? entry4.next : null;
            while (true) {
                Entry entry6 = entry4;
                entry4 = entry5;
                if (entry4 == null) {
                    return;
                }
                if (entry4 == this) {
                    if (entry6 != null) {
                        entry6.next = entry4.next;
                    }
                    this.next = null;
                    return;
                }
                entry5 = entry4.next;
            }
        }
    }

    public ThrottledCallbacks() {
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.EmptyIntObjectMap;
        this.rectChangedMap = new MutableIntObjectMap();
        this.minDebounceDeadline = -1L;
        this.windowOffset = 0L;
        this.screenOffset = 0L;
    }

    /* renamed from: fire-WY9HvpM, reason: not valid java name */
    public final void m953fireWY9HvpM(Entry entry, long j, long j2, float[] fArr, long j3) {
        long j4 = entry.lastInvokeMillis;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            entry.lastInvokeMillis = j3;
            entry.m955fire9b9wPM(entry.topLeft, entry.bottomRight, j, j2, fArr);
        }
    }

    /* renamed from: updateOffsets-LDcG7Xg, reason: not valid java name */
    public final boolean m954updateOffsetsLDcG7Xg(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (IntOffset.m1047equalsimpl0(j2, this.windowOffset)) {
            z = false;
        } else {
            this.windowOffset = j2;
            z = true;
        }
        if (!IntOffset.m1047equalsimpl0(j, this.screenOffset)) {
            this.screenOffset = j;
            z = true;
        }
        if (fArr != null) {
            this.viewToWindowMatrix = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & BodyPartID.bodyIdMax);
        if (j3 == this.windowSize) {
            return z;
        }
        this.windowSize = j3;
        return true;
    }
}
