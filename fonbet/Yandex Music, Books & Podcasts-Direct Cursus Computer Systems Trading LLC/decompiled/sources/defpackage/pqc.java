package defpackage;

/* loaded from: classes.dex */
public final class pqc {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof pqc) {
            return this.a == ((pqc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
