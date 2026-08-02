package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

/* loaded from: classes3.dex */
public final class TrieNodeKeysIterator extends TrieNodeBaseIterator {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.$r8$classId) {
            case 0:
                int i = this.index;
                this.index = i + 2;
                return this.buffer[i];
            default:
                int i2 = this.index;
                this.index = i2 + 2;
                return this.buffer[i2 + 1];
        }
    }
}
