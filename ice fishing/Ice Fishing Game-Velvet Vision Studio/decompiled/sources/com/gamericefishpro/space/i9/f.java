package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n {
    public final n d;
    public final String e;

    public f(String str) {
        this.d = n.j;
        this.e = str;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Boolean b() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Double c() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.e.equals(fVar.e) && this.d.equals(fVar.d);
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.e.hashCode() * 31);
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n l(String str, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.gamericefishpro.space.i9.n
    public final String m() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n o() {
        return new f(this.e, this.d.o());
    }

    public f(String str, n nVar) {
        this.d = nVar;
        this.e = str;
    }
}
