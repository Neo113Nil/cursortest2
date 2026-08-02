package defpackage;

/* loaded from: classes.dex */
public final class kds {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof kds) {
            return this.a == ((kds) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}
