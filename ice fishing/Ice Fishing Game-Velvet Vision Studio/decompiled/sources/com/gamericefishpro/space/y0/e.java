package com.gamericefishpro.space.y0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ph.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends m {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ e(int i, com.gamericefishpro.space.b1.k kVar) {
        this.d = i;
        this.e = kVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        switch (this.d) {
            case 2:
                Intrinsics.checkNotNullParameter(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // com.gamericefishpro.space.ph.m
    public final int b() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.b1.k) this.e).c();
            case 1:
                return ((com.gamericefishpro.space.b1.k) this.e).c();
            default:
                return ((com.gamericefishpro.space.qh.i) this.e).B;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((com.gamericefishpro.space.b1.k) this.e).clear();
                break;
            case 1:
                ((com.gamericefishpro.space.b1.k) this.e).clear();
                break;
            default:
                ((com.gamericefishpro.space.qh.i) this.e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                com.gamericefishpro.space.b1.k kVar = (com.gamericefishpro.space.b1.k) this.e;
                Object obj2 = kVar.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && kVar.containsKey(entry.getKey());
            case 1:
                return ((com.gamericefishpro.space.b1.k) this.e).containsKey(obj);
            default:
                return ((com.gamericefishpro.space.qh.i) this.e).containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.d) {
            case 2:
                return ((com.gamericefishpro.space.qh.i) this.e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new com.gamericefishpro.space.ph.h((com.gamericefishpro.space.b1.k) this.e);
            case 1:
                com.gamericefishpro.space.b1.k kVar = (com.gamericefishpro.space.b1.k) this.e;
                j[] jVarArr = new j[8];
                for (int i = 0; i < 8; i++) {
                    jVarArr[i] = new k(1);
                }
                return new f(kVar, jVarArr);
            default:
                com.gamericefishpro.space.qh.i map = (com.gamericefishpro.space.qh.i) this.e;
                map.getClass();
                Intrinsics.checkNotNullParameter(map, "map");
                return new com.gamericefishpro.space.qh.f(map, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((com.gamericefishpro.space.b1.k) this.e).remove(entry.getKey(), entry.getValue());
            case 1:
                com.gamericefishpro.space.b1.k kVar = (com.gamericefishpro.space.b1.k) this.e;
                if (!kVar.containsKey(obj)) {
                    return false;
                }
                kVar.remove(obj);
                return true;
            default:
                com.gamericefishpro.space.qh.i iVar = (com.gamericefishpro.space.qh.i) this.e;
                iVar.c();
                int iJ = iVar.j(obj);
                if (iJ < 0) {
                    return false;
                }
                iVar.n(iJ);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        switch (this.d) {
            case 2:
                Intrinsics.checkNotNullParameter(elements, "elements");
                ((com.gamericefishpro.space.qh.i) this.e).c();
                return super.removeAll(elements);
            default:
                return super.removeAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        switch (this.d) {
            case 2:
                Intrinsics.checkNotNullParameter(elements, "elements");
                ((com.gamericefishpro.space.qh.i) this.e).c();
                break;
        }
        return super.retainAll(elements);
    }

    public e(com.gamericefishpro.space.qh.i backing) {
        this.d = 2;
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.e = backing;
    }
}
