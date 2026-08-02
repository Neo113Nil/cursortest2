package defpackage;

/* loaded from: classes3.dex */
public final class so1 {
    public final u51 a;
    public final kf4 b;
    public final int c;
    public final long d;

    public so1(u51 u51Var, kf4 kf4Var, int i, long j) {
        this.a = u51Var;
        this.b = kf4Var;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so1)) {
            return false;
        }
        so1 so1Var = (so1) obj;
        return this.a.equals(so1Var.a) && this.b == so1Var.b && this.c == so1Var.c && nsa.e(this.d, so1Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kf4 kf4Var = this.b;
        int a = f1d.a(this.c, (hashCode + (kf4Var == null ? 0 : kf4Var.hashCode())) * 31, 31);
        msa msaVar = nsa.b;
        return Long.hashCode(this.d) + a;
    }

    public final String toString() {
        return "Artist(artistDomainItem=" + this.a + ", chartState=" + this.b + ", position=" + this.c + ", listenTime=" + nsa.t(this.d) + ")";
    }
}
