package defpackage;

/* loaded from: classes3.dex */
public final class mce implements oce {
    public final Exception a;

    public final boolean equals(Object obj) {
        if (obj instanceof mce) {
            return this.a.equals(((mce) obj).a);
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
