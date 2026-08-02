package defpackage;

/* loaded from: classes.dex */
public final class whn {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public whn(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final whn a(whn whnVar, String str) {
        String M = p1g.M(str, this.c);
        if (whnVar == null) {
            return null;
        }
        long j = whnVar.b;
        if (!M.equals(p1g.M(str, whnVar.c))) {
            return null;
        }
        long j2 = this.b;
        if (j2 != -1) {
            long j3 = this.a;
            if (j3 + j2 == whnVar.a) {
                return new whn(M, j3, j != -1 ? j2 + j : -1L);
            }
        }
        if (j == -1) {
            return null;
        }
        long j4 = whnVar.a;
        if (j4 + j == this.a) {
            return new whn(M, j4, j2 != -1 ? j + j2 : -1L);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || whn.class != obj.getClass()) {
            return false;
        }
        whn whnVar = (whn) obj;
        return this.a == whnVar.a && this.b == whnVar.b && this.c.equals(whnVar.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return hrg.m(this.b, ")", sb);
    }
}
