package defpackage;

/* loaded from: classes3.dex */
public final class ije implements kje {
    public final float a;

    public ije(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ije) && Float.compare(this.a, ((ije) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.p(new StringBuilder("Default(spaceBetweenCenters="), this.a, ')');
    }
}
