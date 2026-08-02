package defpackage;

/* loaded from: classes11.dex */
public final class s5i0 extends u5i0 {
    public final float a;

    public s5i0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5i0) && Float.compare(this.a, ((s5i0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return n.n(new StringBuilder("Fixed(value="), this.a, ')');
    }
}
