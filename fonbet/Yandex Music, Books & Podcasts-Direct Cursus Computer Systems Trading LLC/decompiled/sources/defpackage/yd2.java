package defpackage;

/* loaded from: classes3.dex */
public final class yd2 {
    public final zd2 a;
    public final be2 b;
    public final ae2 c;

    public yd2(zd2 zd2Var, be2 be2Var, ae2 ae2Var) {
        this.a = zd2Var;
        this.b = be2Var;
        this.c = ae2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yd2)) {
            return false;
        }
        yd2 yd2Var = (yd2) obj;
        return this.a.equals(yd2Var.a) && this.b.equals(yd2Var.b) && this.c.equals(yd2Var.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
