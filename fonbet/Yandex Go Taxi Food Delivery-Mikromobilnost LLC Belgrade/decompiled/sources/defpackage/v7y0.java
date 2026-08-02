package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class v7y0 implements r1y0 {
    public final i501 a;
    public final o2y0 b;
    public final long c;
    public final a741 d;
    public final h741 e;

    public v7y0(i501 i501Var, o2y0 o2y0Var, long j, a741 a741Var, h741 h741Var) {
        this.a = i501Var;
        this.b = o2y0Var;
        this.c = j;
        this.d = a741Var;
        this.e = h741Var;
    }

    public static v7y0 c(v7y0 v7y0Var, i501 i501Var) {
        return new v7y0(i501Var, v7y0Var.b, v7y0Var.c, v7y0Var.d, v7y0Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v7y0) {
            v7y0 v7y0Var = (v7y0) obj;
            return jl40.l(this.a, v7y0Var.a) && jl40.l(this.b, v7y0Var.b) && this.c == v7y0Var.c && this.d.equals(v7y0Var.d) && this.e == v7y0Var.e;
        }
        return false;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return String.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + qv10.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final h741 m() {
        return this.e;
    }

    @Override // defpackage.w201
    public final i501 q() {
        return this.a;
    }

    public final String toString() {
        return "TaxiOrderWalkingRouteTracking(cardSwipeBehaviour=" + this.a + ", orderHolder=" + this.b + ", timestamp=" + this.c + ", blockState=" + this.d + ", detailScreen=" + this.e + Extension.C_BRAKE;
    }
}
