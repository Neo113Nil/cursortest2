package defpackage;

/* loaded from: classes3.dex */
public final class s06 {
    public final h06 a;
    public final ct5 b;

    public s06(h06 h06Var, ct5 ct5Var) {
        this.a = h06Var;
        this.b = ct5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s06)) {
            return false;
        }
        s06 s06Var = (s06) obj;
        return this.a.equals(s06Var.a) && this.b.equals(s06Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConcertItem(concertShort=" + this.a + ", uiData=" + this.b + ")";
    }
}
