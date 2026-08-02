package defpackage;

/* loaded from: classes.dex */
public final class a2o {
    public final float a;

    public a2o(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a2o) {
            return this.a == ((a2o) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(10.0f) + eta.a(Float.hashCode(this.a) * 31, 10.0f, 31);
    }

    public final String toString() {
        return su4.m(this.a, ", factorAtMin=10.0, factorAtMax=10.0)", new StringBuilder("ResistanceConfig(basis="));
    }
}
