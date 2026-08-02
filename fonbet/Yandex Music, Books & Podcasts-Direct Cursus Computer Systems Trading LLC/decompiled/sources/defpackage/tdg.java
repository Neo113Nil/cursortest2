package defpackage;

/* loaded from: classes.dex */
public final class tdg {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof tdg) {
            return this.a == ((tdg) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Polite" : i == 1 ? "Assertive" : "Unknown";
    }
}
