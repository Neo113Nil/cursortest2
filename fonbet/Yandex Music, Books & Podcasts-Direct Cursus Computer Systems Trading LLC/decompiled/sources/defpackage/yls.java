package defpackage;

/* loaded from: classes3.dex */
public final class yls implements ams {
    public final Number a;

    public final boolean equals(Object obj) {
        if (obj instanceof yls) {
            return this.a.equals(((yls) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Num(value=" + this.a + ')';
    }
}
