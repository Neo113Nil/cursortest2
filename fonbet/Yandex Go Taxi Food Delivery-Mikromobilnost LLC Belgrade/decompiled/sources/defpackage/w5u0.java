package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class w5u0 implements Iterator, xfx {
    public final SnapshotStateSet a;
    public final Iterator b;
    public Object c;
    public Object w;
    public int x;

    public w5u0(SnapshotStateSet snapshotStateSet, Iterator it) {
        this.a = snapshotStateSet;
        this.b = it;
        this.x = ((x5u0) q2t0.h((x5u0) snapshotStateSet.getFirstStateRecord())).d;
        this.c = this.w;
        this.w = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.w != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (((x5u0) q2t0.h((x5u0) this.a.getFirstStateRecord())).d != this.x) {
            ny61.y();
            return null;
        }
        this.c = this.w;
        Iterator it = this.b;
        this.w = it.hasNext() ? it.next() : null;
        Object obj = this.c;
        if (obj != null) {
            return obj;
        }
        ny61.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        SnapshotStateSet snapshotStateSet = this.a;
        if (((x5u0) q2t0.h((x5u0) snapshotStateSet.getFirstStateRecord())).d != this.x) {
            ny61.y();
            return;
        }
        Object obj = this.c;
        if (obj == null) {
            ny61.k();
            return;
        }
        snapshotStateSet.remove(obj);
        this.c = null;
        this.x = ((x5u0) q2t0.h((x5u0) snapshotStateSet.getFirstStateRecord())).d;
    }
}
