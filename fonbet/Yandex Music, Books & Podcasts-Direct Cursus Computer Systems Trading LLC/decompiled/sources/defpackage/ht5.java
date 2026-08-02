package defpackage;

/* loaded from: classes3.dex */
public final class ht5 {
    public final h06 a;
    public final ct5 b;

    public ht5(h06 h06Var, ct5 ct5Var) {
        this.a = h06Var;
        this.b = ct5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht5)) {
            return false;
        }
        ht5 ht5Var = (ht5) obj;
        return this.a.equals(ht5Var.a) && this.b.equals(ht5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConcertItem(concert=" + this.a + ", uiData=" + this.b + ")";
    }
}
