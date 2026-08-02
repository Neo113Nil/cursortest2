package defpackage;

/* loaded from: classes4.dex */
public final class qs4 {
    public final String a;
    public final hps b;
    public final fe3 c;

    public qs4(String str, hps hpsVar, fe3 fe3Var) {
        this.a = str;
        this.b = hpsVar;
        this.c = fe3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs4)) {
            return false;
        }
        qs4 qs4Var = (qs4) obj;
        return this.a.equals(qs4Var.a) && this.b.equals(qs4Var.b) && this.c.equals(qs4Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CollageDisplayItemData(contentBackground=" + this.a + ", topBlock=" + this.b + ", bottomBlock=" + this.c + ")";
    }
}
