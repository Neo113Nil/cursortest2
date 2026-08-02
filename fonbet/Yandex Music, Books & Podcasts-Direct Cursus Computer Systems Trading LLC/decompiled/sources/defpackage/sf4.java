package defpackage;

/* loaded from: classes5.dex */
public final class sf4 {
    public final mqs a;
    public final jf4 b;

    public sf4(mqs mqsVar, jf4 jf4Var) {
        this.a = mqsVar;
        this.b = jf4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf4)) {
            return false;
        }
        sf4 sf4Var = (sf4) obj;
        return this.a.equals(sf4Var.a) && this.b.equals(sf4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChartTrack(track=" + this.a + ", chartPosition=" + this.b + ")";
    }
}
