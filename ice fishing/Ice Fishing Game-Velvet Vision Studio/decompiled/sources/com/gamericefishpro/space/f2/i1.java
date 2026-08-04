package com.gamericefishpro.space.f2;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements Collection, com.gamericefishpro.space.fi.a {
    public final /* synthetic */ int d = 0;
    public final Object e;

    public i1() {
        int i = com.gamericefishpro.space.t.o0.a;
        this.e = new com.gamericefishpro.space.t.e0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.t.e0) this.e).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((com.gamericefishpro.space.t.e0) this.e).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.t.e0) this.e).c(obj);
            default:
                return ((com.gamericefishpro.space.t.h0) this.e).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!((com.gamericefishpro.space.t.e0) this.e).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Intrinsics.checkNotNullParameter(elements, "elements");
                Collection collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((com.gamericefishpro.space.t.h0) this.e).d(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.t.e0) this.e).g == 0;
            default:
                return ((com.gamericefishpro.space.t.h0) this.e).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.t.e0 e0Var = (com.gamericefishpro.space.t.e0) this.e;
                e0Var.getClass();
                return new com.gamericefishpro.space.li.e(new com.gamericefishpro.space.t.g0(e0Var));
            default:
                return com.gamericefishpro.space.li.h.a(new com.gamericefishpro.space.t.g(this, null, 2));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.t.e0) this.e).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.t.e0) this.e).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.t.e0) this.e).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.t.e0) this.e).g;
            default:
                return ((com.gamericefishpro.space.t.h0) this.e).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return com.gamericefishpro.space.ei.k.b(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                Intrinsics.checkNotNullParameter(array, "array");
                break;
        }
        return com.gamericefishpro.space.ei.k.c(this, array);
    }

    public i1(com.gamericefishpro.space.t.h0 parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.e = parent;
    }
}
