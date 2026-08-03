package w0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m0.s1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q implements Parcelable, v, List, RandomAccess, qc.c {
    public static final Parcelable.Creator<q> CREATOR = new p(0);

    /* renamed from: g, reason: collision with root package name */
    public u f7592g;

    public q(q0.c cVar) {
        g k3 = m.k();
        u uVar = new u(k3.g(), cVar);
        if (!(k3 instanceof b)) {
            uVar.f7621b = new u(1, cVar);
        }
        this.f7592g = uVar;
    }

    @Override // w0.v
    public final x a() {
        return this.f7592g;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        q0.c cVar;
        g k3;
        boolean b2;
        do {
            synchronized (r.f7593a) {
                u uVar = this.f7592g;
                pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                u uVar2 = (u) m.i(uVar);
                i10 = uVar2.f7617d;
                cVar = uVar2.f7616c;
            }
            pc.j.b(cVar);
            q0.c d10 = cVar.d(obj);
            if (d10.equals(cVar)) {
                return false;
            }
            u uVar3 = this.f7592g;
            pc.j.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7580c) {
                k3 = m.k();
                b2 = r.b((u) m.w(uVar3, this, k3), i10, d10, true);
            }
            m.n(k3, this);
        } while (!b2);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(final int i10, final Collection collection) {
        return r.h(this, new oc.c() { // from class: w0.o
            @Override // oc.c
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i10, collection));
            }
        });
    }

    @Override // w0.v
    public final void c(x xVar) {
        xVar.f7621b = this.f7592g;
        this.f7592g = (u) xVar;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        g k3;
        u uVar = this.f7592g;
        pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (m.f7580c) {
            k3 = m.k();
            u uVar2 = (u) m.w(uVar, this, k3);
            synchronized (r.f7593a) {
                uVar2.f7616c = q0.i.f5720h;
                uVar2.f7617d++;
                uVar2.f7618e++;
            }
        }
        m.n(k3, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return r.e(this).f7616c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return r.e(this).f7616c.containsAll(collection);
    }

    public final void d(int i10, int i11) {
        int i12;
        q0.c cVar;
        g k3;
        boolean b2;
        do {
            synchronized (r.f7593a) {
                u uVar = this.f7592g;
                pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                u uVar2 = (u) m.i(uVar);
                i12 = uVar2.f7617d;
                cVar = uVar2.f7616c;
            }
            pc.j.b(cVar);
            q0.f f10 = cVar.f();
            f10.subList(i10, i11).clear();
            q0.c d10 = f10.d();
            if (pc.j.a(d10, cVar)) {
                return;
            }
            u uVar3 = this.f7592g;
            pc.j.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7580c) {
                k3 = m.k();
                b2 = r.b((u) m.w(uVar3, this, k3), i12, d10, true);
            }
            m.n(k3, this);
        } while (!b2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return r.e(this).f7616c.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return r.e(this).f7616c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return r.e(this).f7616c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return r.e(this).f7616c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new cc.a(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        q0.c cVar;
        g k3;
        boolean b2;
        Object obj = get(i10);
        do {
            synchronized (r.f7593a) {
                u uVar = this.f7592g;
                pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                u uVar2 = (u) m.i(uVar);
                i11 = uVar2.f7617d;
                cVar = uVar2.f7616c;
            }
            pc.j.b(cVar);
            q0.c h10 = cVar.h(i10);
            if (h10.equals(cVar)) {
                break;
            }
            u uVar3 = this.f7592g;
            pc.j.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7580c) {
                k3 = m.k();
                b2 = r.b((u) m.w(uVar3, this, k3), i11, h10, true);
            }
            m.n(k3, this);
        } while (!b2);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        q0.c cVar;
        g k3;
        boolean b2;
        do {
            synchronized (r.f7593a) {
                u uVar = this.f7592g;
                pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                u uVar2 = (u) m.i(uVar);
                i10 = uVar2.f7617d;
                cVar = uVar2.f7616c;
            }
            pc.j.b(cVar);
            q0.c g8 = cVar.g(new q0.b(0, collection));
            if (pc.j.a(g8, cVar)) {
                return false;
            }
            u uVar3 = this.f7592g;
            pc.j.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7580c) {
                k3 = m.k();
                b2 = r.b((u) m.w(uVar3, this, k3), i10, g8, true);
            }
            m.n(k3, this);
        } while (!b2);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return r.h(this, new q0.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        q0.c cVar;
        g k3;
        boolean b2;
        Object obj2 = get(i10);
        do {
            synchronized (r.f7593a) {
                u uVar = this.f7592g;
                pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                u uVar2 = (u) m.i(uVar);
                i11 = uVar2.f7617d;
                cVar = uVar2.f7616c;
            }
            pc.j.b(cVar);
            q0.c i12 = cVar.i(i10, obj);
            if (i12.equals(cVar)) {
                break;
            }
            u uVar3 = this.f7592g;
            pc.j.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7580c) {
                k3 = m.k();
                b2 = r.b((u) m.w(uVar3, this, k3), i11, i12, false);
            }
            m.n(k3, this);
        } while (!b2);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return r.e(this).f7616c.a();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            s1.a("fromIndex or toIndex are out of bounds");
        }
        return new y(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pc.i.a(this);
    }

    public final String toString() {
        u uVar = this.f7592g;
        pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((u) m.i(uVar)).f7616c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        q0.c cVar = r.e(this).f7616c;
        int a6 = cVar.a();
        parcel.writeInt(a6);
        for (int i11 = 0; i11 < a6; i11++) {
            parcel.writeValue(cVar.get(i11));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        q0.c cVar;
        g k3;
        boolean b2;
        do {
            synchronized (r.f7593a) {
                u uVar = this.f7592g;
                pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                u uVar2 = (u) m.i(uVar);
                i10 = uVar2.f7617d;
                cVar = uVar2.f7616c;
            }
            pc.j.b(cVar);
            q0.c e10 = cVar.e(collection);
            if (pc.j.a(e10, cVar)) {
                return false;
            }
            u uVar3 = this.f7592g;
            pc.j.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7580c) {
                k3 = m.k();
                b2 = r.b((u) m.w(uVar3, this, k3), i10, e10, true);
            }
            m.n(k3, this);
        } while (!b2);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new cc.a(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pc.i.b(this, objArr);
    }

    public q() {
        this(q0.i.f5720h);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        q0.c cVar;
        g k3;
        boolean b2;
        do {
            synchronized (r.f7593a) {
                u uVar = this.f7592g;
                pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                u uVar2 = (u) m.i(uVar);
                i11 = uVar2.f7617d;
                cVar = uVar2.f7616c;
            }
            pc.j.b(cVar);
            q0.c b10 = cVar.b(i10, obj);
            if (b10.equals(cVar)) {
                return;
            }
            u uVar3 = this.f7592g;
            pc.j.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7580c) {
                k3 = m.k();
                b2 = r.b((u) m.w(uVar3, this, k3), i11, b10, true);
            }
            m.n(k3, this);
        } while (!b2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        q0.c cVar;
        g k3;
        boolean b2;
        do {
            synchronized (r.f7593a) {
                u uVar = this.f7592g;
                pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                u uVar2 = (u) m.i(uVar);
                i10 = uVar2.f7617d;
                cVar = uVar2.f7616c;
            }
            pc.j.b(cVar);
            int indexOf = cVar.indexOf(obj);
            q0.c h10 = indexOf != -1 ? cVar.h(indexOf) : cVar;
            if (h10.equals(cVar)) {
                return false;
            }
            u uVar3 = this.f7592g;
            pc.j.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7580c) {
                k3 = m.k();
                b2 = r.b((u) m.w(uVar3, this, k3), i10, h10, true);
            }
            m.n(k3, this);
        } while (!b2);
        return true;
    }
}
