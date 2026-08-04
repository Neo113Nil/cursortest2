package com.gamericefishpro.space.g3;

import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final boolean a;
    public final boolean b;
    public final r c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public o() {
        r rVar = r.d;
        this.a = true;
        this.b = true;
        this.c = rVar;
        this.d = true;
        this.e = true;
        this.f = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.b == oVar.b && this.c == oVar.c && this.d == oVar.d && this.e == oVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + y0.c((this.c.hashCode() + y0.c(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }
}
