package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class t4u0 implements ListIterator, xfx {
    public final SnapshotStateList a;
    public int b;
    public int c = -1;
    public int w;

    public t4u0(SnapshotStateList snapshotStateList, int i) {
        this.a = snapshotStateList;
        this.b = i - 1;
        this.w = d6z.H(snapshotStateList);
    }

    public final void a() {
        if (d6z.H(this.a) == this.w) {
            return;
        }
        ny61.y();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.b + 1;
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.add(i, obj);
        this.c = -1;
        this.b++;
        this.w = d6z.H(snapshotStateList);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i = this.b + 1;
        this.c = i;
        SnapshotStateList snapshotStateList = this.a;
        d6z.b(i, snapshotStateList.size());
        Object obj = snapshotStateList.get(i);
        this.b = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i = this.b;
        SnapshotStateList snapshotStateList = this.a;
        d6z.b(i, snapshotStateList.size());
        int i2 = this.b;
        this.c = i2;
        this.b--;
        return snapshotStateList.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.c;
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.remove(i);
        this.b--;
        this.c = -1;
        this.w = d6z.H(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.c;
        if (i < 0) {
            ny61.r("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
            return;
        }
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.set(i, obj);
        this.w = d6z.H(snapshotStateList);
    }
}
