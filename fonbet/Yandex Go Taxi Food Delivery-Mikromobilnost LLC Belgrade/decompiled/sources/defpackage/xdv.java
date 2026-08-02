package defpackage;

/* loaded from: classes.dex */
public final class xdv implements zdv {
    public final Exception a;

    public final boolean equals(Object obj) {
        if (obj instanceof xdv) {
            return this.a.equals(((xdv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(value=" + this.a + ')';
    }
}
