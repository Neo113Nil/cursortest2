package defpackage;

/* loaded from: classes.dex */
public final class z7p {
    public final float a;
    public final qar b;

    public z7p(float f, qar qarVar) {
        this.a = f;
        this.b = qarVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7p)) {
            return false;
        }
        z7p z7pVar = (z7p) obj;
        return Float.compare(this.a, z7pVar.a) == 0 && jl40.l(this.b, z7pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
