package defpackage;

/* loaded from: classes10.dex */
public final class z74 {
    public final kgg0 a;
    public final int b;

    public z74(kgg0 kgg0Var, int i) {
        if (kgg0Var == null) {
            ny61.t("Null quality");
            throw null;
        }
        this.a = kgg0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z74) {
            z74 z74Var = (z74) obj;
            if (this.a.equals(z74Var.a) && this.b == z74Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.a);
        sb.append(", aspectRatio=");
        return oyr.m(this.b, "}", sb);
    }
}
