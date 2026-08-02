package defpackage;

/* loaded from: classes3.dex */
public final class ko6 {
    public final po6 a;
    public final mqs b;

    public ko6(po6 po6Var, mqs mqsVar) {
        this.a = po6Var;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko6)) {
            return false;
        }
        ko6 ko6Var = (ko6) obj;
        return this.a.equals(ko6Var.a) && this.b.equals(ko6Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CoverTrackItem(uiData=" + this.a + ", track=" + this.b + ")";
    }
}
