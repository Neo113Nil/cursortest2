package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sj90 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final List f;
    public final List g;
    public final List h;
    public final long i;
    public final boolean j;
    public final s1a1 k;
    public final int l;
    public final vwk0 m;
    public final ssn n;

    public sj90(List list, List list2, gce0 gce0Var, int i, vwk0 vwk0Var, ssn ssnVar) {
        List g = scc.g(16572810, 16740973, 16003181, 11832815);
        this.a = 90;
        this.b = 360;
        this.c = 3.0f;
        this.d = 3.0f;
        this.e = 1.0f;
        this.f = list;
        this.g = g;
        this.h = list2;
        this.i = 2000L;
        this.j = true;
        this.k = gce0Var;
        this.l = i;
        this.m = vwk0Var;
        this.n = ssnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj90)) {
            return false;
        }
        sj90 sj90Var = (sj90) obj;
        return this.a == sj90Var.a && this.b == sj90Var.b && Float.compare(this.c, sj90Var.c) == 0 && Float.compare(this.d, sj90Var.d) == 0 && Float.compare(this.e, sj90Var.e) == 0 && jl40.l(this.f, sj90Var.f) && jl40.l(this.g, sj90Var.g) && jl40.l(this.h, sj90Var.h) && this.i == sj90Var.i && this.j == sj90Var.j && jl40.l(this.k, sj90Var.k) && this.l == sj90Var.l && jl40.l(this.m, sj90Var.m) && jl40.l(this.n, sj90Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.m.hashCode() + oyr.b(this.l, (this.k.hashCode() + unr0.e(qv10.c(unr0.c(unr0.c(unr0.c(g8e.c(this.e, g8e.c(this.d, g8e.c(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "Party(angle=", ", spread=", ", speed=");
        vfc.x(s, this.c, ", maxSpeed=", this.d, ", damping=");
        s.append(this.e);
        s.append(", size=");
        s.append(this.f);
        s.append(", colors=");
        nnm.w(s, this.g, ", shapes=", this.h, ", timeToLive=");
        s.append(this.i);
        s.append(", fadeOutEnabled=");
        s.append(this.j);
        s.append(", position=");
        s.append(this.k);
        s.append(", delay=");
        s.append(this.l);
        s.append(", rotation=");
        s.append(this.m);
        s.append(", emitter=");
        s.append(this.n);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
