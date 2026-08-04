package com.gamericefishpro.space.f1;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.t0.m1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable, c0, List, RandomAccess, com.gamericefishpro.space.fi.c {
    public static final Parcelable.Creator<u> CREATOR = new t(0);
    public b0 d;

    public u(com.gamericefishpro.space.w0.b bVar) {
        g gVarJ = p.j();
        b0 b0Var = new b0(gVarJ.g(), bVar);
        if (!(gVarJ instanceof b)) {
            b0Var.b = new b0(1, bVar);
        }
        this.d = b0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        com.gamericefishpro.space.w0.b bVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (v.a) {
                b0 b0Var = this.d;
                Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                b0 b0Var2 = (b0) p.h(b0Var);
                i = b0Var2.d;
                bVar = b0Var2.c;
                Unit unit = Unit.a;
            }
            Intrinsics.b(bVar);
            com.gamericefishpro.space.w0.b bVarAdd = bVar.add(obj);
            if (bVarAdd.equals(bVar)) {
                return false;
            }
            b0 b0Var3 = this.d;
            Intrinsics.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p.c) {
                gVarJ = p.j();
                zB = v.b((b0) p.w(b0Var3, this, gVarJ), i, bVarAdd, true);
            }
            p.n(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return v.i(this, new s(i, collection));
    }

    @Override // com.gamericefishpro.space.f1.c0
    public final e0 c() {
        return this.d;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        g gVarJ;
        b0 b0Var = this.d;
        Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (p.c) {
            gVarJ = p.j();
            b0 b0Var2 = (b0) p.w(b0Var, this, gVarJ);
            synchronized (v.a) {
                b0Var2.c = com.gamericefishpro.space.x0.h.i;
                b0Var2.d++;
                b0Var2.e++;
            }
        }
        p.n(gVarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ((com.gamericefishpro.space.x0.b) v.f(this).c).contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((com.gamericefishpro.space.x0.b) v.f(this).c).containsAll(collection);
    }

    @Override // com.gamericefishpro.space.f1.c0
    public final void d(e0 e0Var) {
        e0Var.b = this.d;
        this.d = (b0) e0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void f(int i, int i2) {
        int i3;
        com.gamericefishpro.space.w0.b bVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (v.a) {
                b0 b0Var = this.d;
                Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                b0 b0Var2 = (b0) p.h(b0Var);
                i3 = b0Var2.d;
                bVar = b0Var2.c;
                Unit unit = Unit.a;
            }
            Intrinsics.b(bVar);
            com.gamericefishpro.space.x0.e eVarBuilder = bVar.builder();
            eVarBuilder.subList(i, i2).clear();
            com.gamericefishpro.space.w0.b bVarD = eVarBuilder.d();
            if (Intrinsics.a(bVarD, bVar)) {
                return;
            }
            b0 b0Var3 = this.d;
            Intrinsics.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p.c) {
                gVarJ = p.j();
                zB = v.b((b0) p.w(b0Var3, this, gVarJ), i3, bVarD, true);
            }
            p.n(gVarJ, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return v.f(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return v.f(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return v.f(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return v.f(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new a0(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        com.gamericefishpro.space.w0.b bVar;
        g gVarJ;
        boolean zB;
        Object obj = get(i);
        do {
            synchronized (v.a) {
                b0 b0Var = this.d;
                Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                b0 b0Var2 = (b0) p.h(b0Var);
                i2 = b0Var2.d;
                bVar = b0Var2.c;
                Unit unit = Unit.a;
            }
            Intrinsics.b(bVar);
            com.gamericefishpro.space.w0.b bVarG = bVar.g(i);
            if (bVarG.equals(bVar)) {
                break;
            }
            b0 b0Var3 = this.d;
            Intrinsics.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p.c) {
                gVarJ = p.j();
                zB = v.b((b0) p.w(b0Var3, this, gVarJ), i2, bVarG, true);
            }
            p.n(gVarJ, this);
        } while (!zB);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        com.gamericefishpro.space.w0.b bVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (v.a) {
                b0 b0Var = this.d;
                Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                b0 b0Var2 = (b0) p.h(b0Var);
                i = b0Var2.d;
                bVar = b0Var2.c;
                Unit unit = Unit.a;
            }
            Intrinsics.b(bVar);
            com.gamericefishpro.space.w0.b bVarE = ((com.gamericefishpro.space.x0.b) bVar).e(new r(1, collection));
            if (Intrinsics.a(bVarE, bVar)) {
                return false;
            }
            b0 b0Var3 = this.d;
            Intrinsics.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p.c) {
                gVarJ = p.j();
                zB = v.b((b0) p.w(b0Var3, this, gVarJ), i, bVarE, true);
            }
            p.n(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return v.i(this, new r(0, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        com.gamericefishpro.space.w0.b bVar;
        g gVarJ;
        boolean zB;
        Object obj2 = get(i);
        do {
            synchronized (v.a) {
                b0 b0Var = this.d;
                Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                b0 b0Var2 = (b0) p.h(b0Var);
                i2 = b0Var2.d;
                bVar = b0Var2.c;
                Unit unit = Unit.a;
            }
            Intrinsics.b(bVar);
            com.gamericefishpro.space.w0.b bVar2 = bVar.set(i, obj);
            if (bVar2.equals(bVar)) {
                break;
            }
            b0 b0Var3 = this.d;
            Intrinsics.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p.c) {
                gVarJ = p.j();
                zB = v.b((b0) p.w(b0Var3, this, gVarJ), i2, bVar2, false);
            }
            p.n(gVarJ, this);
        } while (!zB);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return v.f(this).c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            m1.a("fromIndex or toIndex are out of bounds");
        }
        return new g0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return com.gamericefishpro.space.ei.k.b(this);
    }

    public final String toString() {
        b0 b0Var = this.d;
        Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((b0) p.h(b0Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.gamericefishpro.space.w0.b bVar = v.f(this).c;
        int size = bVar.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(bVar.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        com.gamericefishpro.space.w0.b bVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (v.a) {
                b0 b0Var = this.d;
                Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                b0 b0Var2 = (b0) p.h(b0Var);
                i = b0Var2.d;
                bVar = b0Var2.c;
                Unit unit = Unit.a;
            }
            Intrinsics.b(bVar);
            com.gamericefishpro.space.w0.b bVarAddAll = bVar.addAll(collection);
            if (Intrinsics.a(bVarAddAll, bVar)) {
                return false;
            }
            b0 b0Var3 = this.d;
            Intrinsics.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p.c) {
                gVarJ = p.j();
                zB = v.b((b0) p.w(b0Var3, this, gVarJ), i, bVarAddAll, true);
            }
            p.n(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new a0(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return com.gamericefishpro.space.ei.k.c(this, objArr);
    }

    public u() {
        this(com.gamericefishpro.space.x0.h.i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        com.gamericefishpro.space.w0.b bVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (v.a) {
                b0 b0Var = this.d;
                Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                b0 b0Var2 = (b0) p.h(b0Var);
                i2 = b0Var2.d;
                bVar = b0Var2.c;
                Unit unit = Unit.a;
            }
            Intrinsics.b(bVar);
            com.gamericefishpro.space.w0.b bVarAdd = bVar.add(i, obj);
            if (bVarAdd.equals(bVar)) {
                return;
            }
            b0 b0Var3 = this.d;
            Intrinsics.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p.c) {
                gVarJ = p.j();
                zB = v.b((b0) p.w(b0Var3, this, gVarJ), i2, bVarAdd, true);
            }
            p.n(gVarJ, this);
        } while (!zB);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        com.gamericefishpro.space.w0.b bVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (v.a) {
                b0 b0Var = this.d;
                Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                b0 b0Var2 = (b0) p.h(b0Var);
                i = b0Var2.d;
                bVar = b0Var2.c;
                Unit unit = Unit.a;
            }
            Intrinsics.b(bVar);
            com.gamericefishpro.space.w0.b bVarG = (com.gamericefishpro.space.x0.b) bVar;
            int iIndexOf = bVarG.indexOf(obj);
            if (iIndexOf != -1) {
                bVarG = bVarG.g(iIndexOf);
            }
            if (bVarG.equals(bVar)) {
                return false;
            }
            b0 b0Var3 = this.d;
            Intrinsics.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p.c) {
                gVarJ = p.j();
                zB = v.b((b0) p.w(b0Var3, this, gVarJ), i, bVarG, true);
            }
            p.n(gVarJ, this);
        } while (!zB);
        return true;
    }
}
