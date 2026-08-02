package defpackage;

/* loaded from: classes3.dex */
public final class fc2 extends kq6 {
    public final long a;
    public final String b;
    public final eq6 c;
    public final fq6 d;
    public final gq6 e;
    public final jq6 f;

    public fc2(long j, String str, eq6 eq6Var, fq6 fq6Var, gq6 gq6Var, jq6 jq6Var) {
        this.a = j;
        this.b = str;
        this.c = eq6Var;
        this.d = fq6Var;
        this.e = gq6Var;
        this.f = jq6Var;
    }

    public final ec2 a() {
        ec2 ec2Var = new ec2();
        ec2Var.a = this.a;
        ec2Var.b = this.b;
        ec2Var.c = this.c;
        ec2Var.d = this.d;
        ec2Var.e = this.e;
        ec2Var.f = this.f;
        ec2Var.g = (byte) 1;
        return ec2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kq6) {
            fc2 fc2Var = (fc2) ((kq6) obj);
            if (this.a == fc2Var.a && this.b.equals(fc2Var.b) && this.c.equals(fc2Var.c) && this.d.equals(fc2Var.d)) {
                gq6 gq6Var = fc2Var.e;
                gq6 gq6Var2 = this.e;
                if (gq6Var2 != null ? gq6Var2.equals(gq6Var) : gq6Var == null) {
                    jq6 jq6Var = fc2Var.f;
                    jq6 jq6Var2 = this.f;
                    if (jq6Var2 != null ? jq6Var2.equals(jq6Var) : jq6Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        gq6 gq6Var = this.e;
        int hashCode2 = (hashCode ^ (gq6Var == null ? 0 : gq6Var.hashCode())) * 1000003;
        jq6 jq6Var = this.f;
        return hashCode2 ^ (jq6Var != null ? jq6Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
