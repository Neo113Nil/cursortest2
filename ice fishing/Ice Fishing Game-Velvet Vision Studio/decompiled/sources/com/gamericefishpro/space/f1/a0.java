package com.gamericefishpro.space.f1;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements ListIterator, com.gamericefishpro.space.fi.a {
    public final /* synthetic */ int d;
    public int e;
    public int i;
    public int v;
    public final Object w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(com.gamericefishpro.space.h2.o oVar, int i, int i2) {
        this(oVar, (i2 & 1) != 0 ? 0 : i, 0, oVar.d.b);
        this.d = 1;
    }

    public void a() {
        if (((AbstractList) ((com.gamericefishpro.space.qh.b) this.w).w).modCount != this.v) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c();
                u uVar = (u) this.w;
                uVar.add(this.e + 1, obj);
                this.i = -1;
                this.e++;
                this.v = v.g(uVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                a();
                com.gamericefishpro.space.qh.b bVar = (com.gamericefishpro.space.qh.b) this.w;
                int i = this.e;
                this.e = i + 1;
                bVar.add(i, obj);
                this.i = -1;
                this.v = ((AbstractList) bVar).modCount;
                return;
            default:
                b();
                com.gamericefishpro.space.qh.d dVar = (com.gamericefishpro.space.qh.d) this.w;
                int i2 = this.e;
                this.e = i2 + 1;
                dVar.add(i2, obj);
                this.i = -1;
                this.v = ((AbstractList) dVar).modCount;
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((com.gamericefishpro.space.qh.d) this.w)).modCount != this.v) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (v.g((u) this.w) != this.v) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.e < ((u) this.w).size() - 1;
            case 1:
                return this.e < this.v;
            case 2:
                return this.e < ((com.gamericefishpro.space.qh.b) this.w).i;
            default:
                return this.e < ((com.gamericefishpro.space.qh.d) this.w).e;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.e >= 0;
            case 1:
                return this.e > this.i;
            case 2:
                return this.e > 0;
            default:
                return this.e > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c();
                int i = this.e + 1;
                this.i = i;
                u uVar = (u) this.w;
                v.a(i, uVar.size());
                Object obj = uVar.get(i);
                this.e = i;
                return obj;
            case 1:
                com.gamericefishpro.space.t.d0 d0Var = ((com.gamericefishpro.space.h2.o) this.w).d;
                int i2 = this.e;
                this.e = i2 + 1;
                Object objF = d0Var.f(i2);
                Intrinsics.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (com.gamericefishpro.space.h1.l) objF;
            case 2:
                a();
                int i3 = this.e;
                com.gamericefishpro.space.qh.b bVar = (com.gamericefishpro.space.qh.b) this.w;
                if (i3 >= bVar.i) {
                    throw new NoSuchElementException();
                }
                this.e = i3 + 1;
                this.i = i3;
                return bVar.d[bVar.e + i3];
            default:
                b();
                int i4 = this.e;
                com.gamericefishpro.space.qh.d dVar = (com.gamericefishpro.space.qh.d) this.w;
                if (i4 >= dVar.e) {
                    throw new NoSuchElementException();
                }
                this.e = i4 + 1;
                this.i = i4;
                return dVar.d[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.e + 1;
            case 1:
                return this.e - this.i;
            case 2:
                return this.e;
            default:
                return this.e;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c();
                int i = this.e;
                u uVar = (u) this.w;
                v.a(i, uVar.size());
                int i2 = this.e;
                this.i = i2;
                Object obj = uVar.get(i2);
                this.e--;
                return obj;
            case 1:
                com.gamericefishpro.space.t.d0 d0Var = ((com.gamericefishpro.space.h2.o) this.w).d;
                int i3 = this.e - 1;
                this.e = i3;
                Object objF = d0Var.f(i3);
                Intrinsics.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (com.gamericefishpro.space.h1.l) objF;
            case 2:
                a();
                int i4 = this.e;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.e = i5;
                this.i = i5;
                com.gamericefishpro.space.qh.b bVar = (com.gamericefishpro.space.qh.b) this.w;
                return bVar.d[bVar.e + i5];
            default:
                b();
                int i6 = this.e;
                if (i6 <= 0) {
                    throw new NoSuchElementException();
                }
                int i7 = i6 - 1;
                this.e = i7;
                this.i = i7;
                return ((com.gamericefishpro.space.qh.d) this.w).d[i7];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.e;
            case 1:
                i = this.e - this.i;
                break;
            case 2:
                i = this.e;
                break;
            default:
                i = this.e;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c();
                u uVar = (u) this.w;
                uVar.remove(this.i);
                this.e--;
                this.i = -1;
                this.v = v.g(uVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                com.gamericefishpro.space.qh.b bVar = (com.gamericefishpro.space.qh.b) this.w;
                a();
                int i = this.i;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.c(i);
                this.e = this.i;
                this.i = -1;
                this.v = ((AbstractList) bVar).modCount;
                return;
            default:
                com.gamericefishpro.space.qh.d dVar = (com.gamericefishpro.space.qh.d) this.w;
                b();
                int i2 = this.i;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                dVar.c(i2);
                this.e = this.i;
                this.i = -1;
                this.v = ((AbstractList) dVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                u uVar = (u) this.w;
                c();
                int i = this.i;
                if (i < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                uVar.set(i, obj);
                this.v = v.g(uVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                a();
                int i2 = this.i;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((com.gamericefishpro.space.qh.b) this.w).set(i2, obj);
                return;
            default:
                b();
                int i3 = this.i;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((com.gamericefishpro.space.qh.d) this.w).set(i3, obj);
                return;
        }
    }

    public a0(com.gamericefishpro.space.qh.d list, int i) {
        this.d = 3;
        Intrinsics.checkNotNullParameter(list, "list");
        this.w = list;
        this.e = i;
        this.i = -1;
        this.v = ((AbstractList) list).modCount;
    }

    public a0(u uVar, int i) {
        this.d = 0;
        this.w = uVar;
        this.e = i - 1;
        this.i = -1;
        this.v = v.g(uVar);
    }

    public a0(com.gamericefishpro.space.h2.o oVar, int i, int i2, int i3) {
        this.d = 1;
        this.w = oVar;
        this.e = i;
        this.i = i2;
        this.v = i3;
    }

    public a0(com.gamericefishpro.space.qh.b list, int i) {
        this.d = 2;
        Intrinsics.checkNotNullParameter(list, "list");
        this.w = list;
        this.e = i;
        this.i = -1;
        this.v = ((AbstractList) list).modCount;
    }
}
