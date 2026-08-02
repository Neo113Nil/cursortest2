package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class PersistentHashMapBuilderBaseIterator extends PersistentHashMapBaseIterator {
    public final PersistentHashMapBuilder builder;
    public int expectedModCount;
    public Object lastIteratedKey;
    public boolean nextWasInvoked;

    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder persistentHashMapBuilder, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.node, trieNodeBaseIteratorArr);
        this.builder = persistentHashMapBuilder;
        this.expectedModCount = persistentHashMapBuilder.modCount;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public final Object next() {
        if (this.builder.modCount != this.expectedModCount) {
            Drop$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        if (!this.hasNext) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        TrieNodeBaseIterator trieNodeBaseIterator = this.path[this.pathLastIndex];
        this.lastIteratedKey = trieNodeBaseIterator.buffer[trieNodeBaseIterator.index];
        this.nextWasInvoked = true;
        return super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public final void remove() {
        if (!this.nextWasInvoked) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        boolean z = this.hasNext;
        PersistentHashMapBuilder persistentHashMapBuilder = this.builder;
        if (!z) {
            TypeIntrinsics.asMutableMap(persistentHashMapBuilder).remove(this.lastIteratedKey);
        } else {
            if (!z) {
                a$$ExternalSyntheticBUOutline0.m();
                return;
            }
            TrieNodeBaseIterator trieNodeBaseIterator = this.path[this.pathLastIndex];
            Object obj = trieNodeBaseIterator.buffer[trieNodeBaseIterator.index];
            TypeIntrinsics.asMutableMap(persistentHashMapBuilder).remove(this.lastIteratedKey);
            resetPath(obj != null ? obj.hashCode() : 0, persistentHashMapBuilder.node, obj, 0);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = persistentHashMapBuilder.modCount;
    }

    public final void resetPath(int i, TrieNode trieNode, Object obj, int i2) {
        int i3 = i2 * 5;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.path;
        if (i3 <= 30) {
            int indexSegment = 1 << SizeKt.indexSegment(i, i3);
            if (trieNode.hasEntryAt$runtime(indexSegment)) {
                trieNodeBaseIteratorArr[i2].reset(Integer.bitCount(trieNode.dataMap) * 2, trieNode.entryKeyIndex$runtime(indexSegment), trieNode.buffer);
                this.pathLastIndex = i2;
                return;
            }
            int nodeIndex$runtime = trieNode.nodeIndex$runtime(indexSegment);
            TrieNode nodeAtIndex$runtime = trieNode.nodeAtIndex$runtime(nodeIndex$runtime);
            trieNodeBaseIteratorArr[i2].reset(Integer.bitCount(trieNode.dataMap) * 2, nodeIndex$runtime, trieNode.buffer);
            resetPath(i, nodeAtIndex$runtime, obj, i2 + 1);
            return;
        }
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i2];
        Object[] objArr = trieNode.buffer;
        trieNodeBaseIterator.reset(objArr.length, 0, objArr);
        while (true) {
            TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i2];
            if (Intrinsics.areEqual(trieNodeBaseIterator2.buffer[trieNodeBaseIterator2.index], obj)) {
                this.pathLastIndex = i2;
                return;
            } else {
                trieNodeBaseIteratorArr[i2].index += 2;
            }
        }
    }
}
