package defpackage;

/* loaded from: classes3.dex */
public final class efn extends pcg {
    public final float a;

    public efn(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efn) && Float.compare(this.a, ((efn) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.p(new StringBuilder("Fixed(value="), this.a, ')');
    }
}
