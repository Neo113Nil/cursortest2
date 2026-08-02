package defpackage;

/* loaded from: classes5.dex */
public final class e4a extends g4a {
    public final int n;

    public e4a(int i) {
        this.n = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e4a) {
            return this.n == ((e4a) obj).n;
        }
        return false;
    }

    public final int hashCode() {
        return this.n;
    }

    public final String toString() {
        return dfi.c(this.n, "OnScrollStateChanged(newState=", ")");
    }
}
