package defpackage;

/* loaded from: classes10.dex */
public final class q64 {
    public static final q64 c = new q64(kgg0.g, 0);
    public final kgg0 a;
    public final int b;

    public q64(kgg0 kgg0Var, int i) {
        if (kgg0Var == null) {
            ny61.t("Null fallbackQuality");
            throw null;
        }
        this.a = kgg0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q64)) {
            return false;
        }
        q64 q64Var = (q64) obj;
        return this.a.equals(q64Var.a) && this.b == q64Var.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.a);
        sb.append(", fallbackRule=");
        return oyr.m(this.b, "}", sb);
    }
}
