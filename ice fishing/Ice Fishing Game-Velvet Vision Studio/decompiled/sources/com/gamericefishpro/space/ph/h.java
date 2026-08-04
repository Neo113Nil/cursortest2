package com.gamericefishpro.space.ph;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, com.gamericefishpro.space.fi.a {
    public final /* synthetic */ int d;
    public final Iterator e;

    public /* synthetic */ h(Iterator it, int i) {
        this.d = i;
        this.e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.e.hasNext();
            case 1:
                return this.e.hasNext();
            case 2:
                return this.e.hasNext();
            default:
                return ((com.gamericefishpro.space.y0.d) this.e).i;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((Map.Entry) this.e.next()).getKey();
            case 1:
                return ((Map.Entry) this.e.next()).getValue();
            case 2:
                return (com.gamericefishpro.space.u1.h0) this.e.next();
            default:
                return (Map.Entry) ((com.gamericefishpro.space.y0.d) this.e).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((com.gamericefishpro.space.y0.d) this.e).remove();
                return;
        }
    }

    public h(com.gamericefishpro.space.b1.k kVar) {
        this.d = 3;
        com.gamericefishpro.space.y0.j[] jVarArr = new com.gamericefishpro.space.y0.j[8];
        for (int i = 0; i < 8; i++) {
            jVarArr[i] = new com.gamericefishpro.space.y0.l(this);
        }
        this.e = new com.gamericefishpro.space.y0.d(kVar, jVarArr);
    }

    public h(com.gamericefishpro.space.u1.f0 f0Var) {
        this.d = 2;
        this.e = f0Var.C.iterator();
    }
}
