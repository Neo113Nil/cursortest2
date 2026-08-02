package defpackage;

/* loaded from: classes11.dex */
public final class vrv extends bb1 {
    public final float f;

    public vrv(float f) {
        this.f = f;
    }

    public static vrv p0(float f) {
        return new vrv(f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vrv) && Float.compare(this.f, ((vrv) obj).f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f);
    }

    public final float q0() {
        return this.f;
    }

    public final String toString() {
        return n.n(new StringBuilder("Circle(radius="), this.f, ')');
    }
}
