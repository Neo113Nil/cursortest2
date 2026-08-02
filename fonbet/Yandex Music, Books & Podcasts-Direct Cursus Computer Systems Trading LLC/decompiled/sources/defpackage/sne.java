package defpackage;

/* loaded from: classes.dex */
public final class sne {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof sne) {
            return this.a == ((sne) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
