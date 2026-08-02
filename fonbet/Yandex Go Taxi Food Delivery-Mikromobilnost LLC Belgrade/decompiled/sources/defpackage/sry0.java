package defpackage;

/* loaded from: classes10.dex */
public final class sry0 {
    public final int a;

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public static int b(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sry0) {
            return this.a == ((sry0) obj).a;
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
