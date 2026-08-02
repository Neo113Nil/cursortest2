package defpackage;

/* loaded from: classes3.dex */
public final class ch1 implements dh1 {
    public final lt a;
    public final qtn b;

    public ch1(lt ltVar, qtn qtnVar) {
        this.a = ltVar;
        this.b = qtnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch1)) {
            return false;
        }
        ch1 ch1Var = (ch1) obj;
        return this.a.equals(ch1Var.a) && this.b.equals(ch1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(album=" + this.a + ", uiDate=" + this.b + ")";
    }
}
