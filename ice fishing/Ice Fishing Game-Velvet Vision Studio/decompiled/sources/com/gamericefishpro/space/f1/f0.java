package com.gamericefishpro.space.f1;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ph.p0;
import java.util.List;
import java.util.ListIterator;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements ListIterator, com.gamericefishpro.space.fi.a {
    public final /* synthetic */ int d = 0;
    public final Object e;
    public final /* synthetic */ Object i;

    public f0(p0 p0Var, int i) {
        this.i = p0Var;
        List list = p0Var.e;
        if (i >= 0 && i <= p0Var.b()) {
            this.e = list.listIterator(p0Var.b() - i);
            return;
        }
        StringBuilder sbK = com.gamericefishpro.space.m5.a.k(i, "Position index ", " must be in range [");
        sbK.append(new IntRange(0, p0Var.b(), 1));
        sbK.append("].");
        throw new IndexOutOfBoundsException(sbK.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.ei.y) this.e).d < ((g0) this.i).v - 1;
            default:
                return ((ListIterator) this.e).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.ei.y) this.e).d >= 0;
            default:
                return ((ListIterator) this.e).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.ei.y yVar = (com.gamericefishpro.space.ei.y) this.e;
                int i = yVar.d + 1;
                g0 g0Var = (g0) this.i;
                v.a(i, g0Var.v);
                yVar.d = i;
                return g0Var.get(i);
            default:
                return ((ListIterator) this.e).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.ei.y) this.e).d + 1;
            default:
                p0 p0Var = (p0) this.i;
                return com.gamericefishpro.space.ph.x.e(p0Var) - ((ListIterator) this.e).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.ei.y yVar = (com.gamericefishpro.space.ei.y) this.e;
                int i = yVar.d;
                g0 g0Var = (g0) this.i;
                v.a(i, g0Var.v);
                yVar.d = i - 1;
                return g0Var.get(i);
            default:
                return ((ListIterator) this.e).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.ei.y) this.e).d;
            default:
                p0 p0Var = (p0) this.i;
                return com.gamericefishpro.space.ph.x.e(p0Var) - ((ListIterator) this.e).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f0(com.gamericefishpro.space.ei.y yVar, g0 g0Var) {
        this.e = yVar;
        this.i = g0Var;
    }
}
