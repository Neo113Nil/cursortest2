package defpackage;

/* loaded from: classes3.dex */
public final class xls implements ams {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof xls) {
            return this.a == ((xls) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "Bool(value=" + this.a + ')';
    }
}
