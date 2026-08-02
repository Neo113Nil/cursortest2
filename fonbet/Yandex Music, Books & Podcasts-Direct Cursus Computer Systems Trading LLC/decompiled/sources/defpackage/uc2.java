package defpackage;

/* loaded from: classes3.dex */
public final class uc2 extends iq6 {
    public final hq6 a;
    public final String b;
    public final String c;
    public final long d;

    public uc2(vc2 vc2Var, String str, String str2, long j) {
        this.a = vc2Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iq6) {
            uc2 uc2Var = (uc2) ((iq6) obj);
            if (this.a.equals(uc2Var.a) && this.b.equals(uc2Var.b) && this.c.equals(uc2Var.c) && this.d == uc2Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return hrg.m(this.d, "}", sb);
    }
}
