package com.gamericefishpro.space.t0;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements com.gamericefishpro.space.g1.d, Iterable, com.gamericefishpro.space.fi.a {
    public final e2 d;
    public final int e;
    public final int i;

    public f2(e2 e2Var, int i, int i2) {
        this.d = e2Var;
        this.e = i;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return f2Var.e == this.e && f2Var.i == this.i && Intrinsics.a(f2Var.d, this.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + this.e;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        e2 e2Var = this.d;
        if (e2Var.A != this.i) {
            g2.f();
        }
        int i = this.e;
        e2Var.i(i);
        return new k0(e2Var, i + 1, e2Var.d[(i * 5) + 3] + i);
    }
}
