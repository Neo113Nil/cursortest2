package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.core.os.BundleKt;
import java.util.List;
import kotlin.collections.AbstractList;

/* loaded from: classes3.dex */
public final class ImmutableList$SubList extends AbstractList {
    public final int _size;
    public final int fromIndex;
    public final AbstractPersistentList source;

    public ImmutableList$SubList(AbstractPersistentList abstractPersistentList, int i, int i2) {
        this.source = abstractPersistentList;
        this.fromIndex = i;
        BundleKt.checkRangeIndexes$runtime(i, i2, abstractPersistentList.size());
        this._size = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        BundleKt.checkElementIndex$runtime(i, this._size);
        return this.source.get(this.fromIndex + i);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this._size;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        BundleKt.checkRangeIndexes$runtime(i, i2, this._size);
        int i3 = this.fromIndex;
        return new ImmutableList$SubList(this.source, i + i3, i3 + i2);
    }
}
