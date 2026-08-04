package com.gamericefishpro.space.t0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements com.gamericefishpro.space.g1.d, Iterable, com.gamericefishpro.space.fi.a {
    public final e2 d;
    public final int e;
    public final w1 i;

    public r2(e2 e2Var, int i, l0 l0Var, w1 w1Var) {
        this.d = e2Var;
        this.e = i;
        this.i = w1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return r2Var.e == this.e && r2Var.d.equals(this.d) && r2Var.i.equals(this.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.d.hashCode() + (this.e * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new q2(this.d, this.e, null, this.i);
    }
}
