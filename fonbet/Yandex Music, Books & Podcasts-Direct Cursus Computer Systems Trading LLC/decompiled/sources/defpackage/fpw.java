package defpackage;

/* loaded from: classes4.dex */
public final class fpw {
    public final boolean a;
    public final long b;
    public final long c;
    public final h4q d;
    public final uqw e;

    public fpw(boolean z, long j, long j2, h4q h4qVar, uqw uqwVar) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = h4qVar;
        this.e = uqwVar;
    }

    public static fpw a(fpw fpwVar, boolean z, long j, long j2, h4q h4qVar, int i) {
        if ((i & 1) != 0) {
            z = fpwVar.a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            j = fpwVar.b;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = fpwVar.c;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            h4qVar = fpwVar.d;
        }
        h4q h4qVar2 = h4qVar;
        uqw uqwVar = fpwVar.e;
        h4qVar2.getClass();
        return new fpw(z2, j3, j4, h4qVar2, uqwVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpw)) {
            return false;
        }
        fpw fpwVar = (fpw) obj;
        return this.a == fpwVar.a && this.b == fpwVar.b && this.c == fpwVar.c && this.d.equals(fpwVar.d) && this.e.equals(fpwVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + eta.a(tlm.c(this.c, tlm.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31), this.d.a, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YnisonRemotePlayingState(playing=");
        sb.append(this.a);
        sb.append(", progressMs=");
        sb.append(this.b);
        ouj.C(sb, ", durationMs=", this.c, ", speed=");
        sb.append(this.d);
        sb.append(", signature=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
