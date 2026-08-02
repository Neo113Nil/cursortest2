package defpackage;

/* loaded from: classes.dex */
public final class q38 extends x97 {
    public final int n;

    public q38(int i) {
        this.n = i;
        if (i > 0) {
            return;
        }
        xq0.x("px must be > 0.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q38) {
            return this.n == ((q38) obj).n;
        }
        return false;
    }

    public final int hashCode() {
        return this.n;
    }

    public final String toString() {
        return String.valueOf(this.n);
    }
}
