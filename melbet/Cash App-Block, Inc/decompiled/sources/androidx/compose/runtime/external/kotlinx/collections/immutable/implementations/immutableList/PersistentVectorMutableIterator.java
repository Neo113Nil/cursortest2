package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class PersistentVectorMutableIterator extends AbstractListIterator {
    public final PersistentVectorBuilder builder;
    public int expectedModCount;
    public int lastIteratedIndex;
    public TrieIterator trieIterator;

    public PersistentVectorMutableIterator(PersistentVectorBuilder persistentVectorBuilder, int i) {
        super(i, persistentVectorBuilder.size, 1);
        this.builder = persistentVectorBuilder;
        this.expectedModCount = persistentVectorBuilder.getModCount$runtime();
        this.lastIteratedIndex = -1;
        setupTrieIterator();
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public final void add(Object obj) {
        checkForComodification();
        int i = this.index;
        PersistentVectorBuilder persistentVectorBuilder = this.builder;
        persistentVectorBuilder.add(i, obj);
        this.index++;
        this.size = persistentVectorBuilder.getSize();
        this.expectedModCount = persistentVectorBuilder.getModCount$runtime();
        this.lastIteratedIndex = -1;
        setupTrieIterator();
    }

    public final void checkForComodification() {
        if (this.expectedModCount == this.builder.getModCount$runtime()) {
            return;
        }
        Drop$$ExternalSyntheticBUOutline0.m$1();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        checkForComodification();
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.index;
        this.lastIteratedIndex = i;
        TrieIterator trieIterator = this.trieIterator;
        PersistentVectorBuilder persistentVectorBuilder = this.builder;
        if (trieIterator == null) {
            Object[] objArr = persistentVectorBuilder.tail;
            this.index = i + 1;
            return objArr[i];
        }
        if (trieIterator.hasNext()) {
            this.index++;
            return trieIterator.next();
        }
        Object[] objArr2 = persistentVectorBuilder.tail;
        int i2 = this.index;
        this.index = i2 + 1;
        return objArr2[i2 - trieIterator.size];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        checkForComodification();
        if (!hasPrevious()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.index;
        this.lastIteratedIndex = i - 1;
        TrieIterator trieIterator = this.trieIterator;
        PersistentVectorBuilder persistentVectorBuilder = this.builder;
        if (trieIterator == null) {
            Object[] objArr = persistentVectorBuilder.tail;
            int i2 = i - 1;
            this.index = i2;
            return objArr[i2];
        }
        int i3 = trieIterator.size;
        if (i <= i3) {
            this.index = i - 1;
            return trieIterator.previous();
        }
        Object[] objArr2 = persistentVectorBuilder.tail;
        int i4 = i - 1;
        this.index = i4;
        return objArr2[i4 - i3];
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        checkForComodification();
        int i = this.lastIteratedIndex;
        if (i == -1) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        PersistentVectorBuilder persistentVectorBuilder = this.builder;
        persistentVectorBuilder.removeAt(i);
        int i2 = this.lastIteratedIndex;
        if (i2 < this.index) {
            this.index = i2;
        }
        this.size = persistentVectorBuilder.getSize();
        this.expectedModCount = persistentVectorBuilder.getModCount$runtime();
        this.lastIteratedIndex = -1;
        setupTrieIterator();
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public final void set(Object obj) {
        checkForComodification();
        int i = this.lastIteratedIndex;
        if (i == -1) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        PersistentVectorBuilder persistentVectorBuilder = this.builder;
        persistentVectorBuilder.set(i, obj);
        this.expectedModCount = persistentVectorBuilder.getModCount$runtime();
        setupTrieIterator();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void setupTrieIterator() {
        PersistentVectorBuilder persistentVectorBuilder = this.builder;
        Object[] objArr = persistentVectorBuilder.root;
        if (objArr == null) {
            this.trieIterator = null;
            return;
        }
        int i = (persistentVectorBuilder.size - 1) & (-32);
        int i2 = this.index;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (persistentVectorBuilder.rootShift / 5) + 1;
        TrieIterator trieIterator = this.trieIterator;
        if (trieIterator == null) {
            this.trieIterator = new TrieIterator(objArr, i2, i, i3);
            return;
        }
        trieIterator.index = i2;
        trieIterator.size = i;
        trieIterator.height = i3;
        if (trieIterator.path.length < i3) {
            trieIterator.path = new Object[i3];
        }
        trieIterator.path[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        trieIterator.isInRightEdge = r0;
        trieIterator.fillPath(i2 - r0, 1);
    }
}
