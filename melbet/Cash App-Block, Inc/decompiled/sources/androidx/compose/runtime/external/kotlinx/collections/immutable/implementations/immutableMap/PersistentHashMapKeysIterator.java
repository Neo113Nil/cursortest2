package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

/* loaded from: classes3.dex */
public final class PersistentHashMapKeysIterator extends PersistentHashMapBaseIterator {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PersistentHashMapKeysIterator(TrieNode trieNode) {
        super(trieNode, r1);
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i = 0; i < 8; i++) {
            trieNodeBaseIteratorArr[i] = new TrieNodeKeysIterator(1);
        }
    }
}
