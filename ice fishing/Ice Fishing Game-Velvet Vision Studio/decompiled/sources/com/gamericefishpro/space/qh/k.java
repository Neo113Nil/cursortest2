package com.gamericefishpro.space.qh;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.gamericefishpro.space.ph.j {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public k(com.gamericefishpro.space.b1.k kVar) {
        this.e = kVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // com.gamericefishpro.space.ph.j
    public final int b() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((i) this.e).B;
            default:
                return ((com.gamericefishpro.space.b1.k) this.e).c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((i) this.e).clear();
                break;
            default:
                ((com.gamericefishpro.space.b1.k) this.e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((i) this.e).containsValue(obj);
            default:
                return ((com.gamericefishpro.space.b1.k) this.e).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((i) this.e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i map = (i) this.e;
                map.getClass();
                Intrinsics.checkNotNullParameter(map, "map");
                return new f(map, 2);
            default:
                com.gamericefishpro.space.b1.k kVar = (com.gamericefishpro.space.b1.k) this.e;
                com.gamericefishpro.space.y0.j[] jVarArr = new com.gamericefishpro.space.y0.j[8];
                for (int i = 0; i < 8; i++) {
                    jVarArr[i] = new com.gamericefishpro.space.y0.k(2);
                }
                return new com.gamericefishpro.space.y0.f(kVar, jVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i iVar = (i) this.e;
                iVar.c();
                int iK = iVar.k(obj);
                if (iK < 0) {
                    return false;
                }
                iVar.n(iK);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(elements, "elements");
                ((i) this.e).c();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(elements, "elements");
                ((i) this.e).c();
                break;
        }
        return super.retainAll(elements);
    }

    public k(i backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.e = backing;
    }
}
