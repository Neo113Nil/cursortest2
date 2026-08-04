package com.gamericefishpro.space.p;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {
    public c d;
    public boolean e = true;
    public final /* synthetic */ f i;

    public d(f fVar) {
        this.i = fVar;
    }

    @Override // com.gamericefishpro.space.p.e
    public final void a(c cVar) {
        c cVar2 = this.d;
        if (cVar == cVar2) {
            c cVar3 = cVar2.v;
            this.d = cVar3;
            this.e = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e) {
            return this.i.d != null;
        }
        c cVar = this.d;
        return (cVar == null || cVar.i == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e) {
            this.e = false;
            this.d = this.i.d;
        } else {
            c cVar = this.d;
            this.d = cVar != null ? cVar.i : null;
        }
        return this.d;
    }
}
