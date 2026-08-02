package defpackage;

/* loaded from: classes.dex */
public final class wu2 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof wu2) {
            return Float.compare(this.a, ((wu2) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
