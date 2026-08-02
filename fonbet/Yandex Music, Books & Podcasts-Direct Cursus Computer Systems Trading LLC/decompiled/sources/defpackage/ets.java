package defpackage;

/* loaded from: classes4.dex */
public final class ets {
    public static final ets d = new ets(oq4.k, 0, o5n.c);
    public final oq4 a;
    public final int b;
    public final o5n c;

    public ets(oq4 oq4Var, int i, o5n o5nVar) {
        this.a = oq4Var;
        this.b = i;
        this.c = o5nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ets)) {
            return false;
        }
        ets etsVar = (ets) obj;
        return this.a == etsVar.a && this.b == etsVar.b && this.c == etsVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TechInfo(codec=" + this.a + ", bitrate=" + this.b + ", realQuality=" + this.c + ")";
    }
}
