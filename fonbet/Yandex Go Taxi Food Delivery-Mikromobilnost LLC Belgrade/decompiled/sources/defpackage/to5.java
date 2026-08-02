package defpackage;

/* loaded from: classes.dex */
public final class to5 {
    public final float a;

    public to5(float f) {
        this.a = f;
    }

    public final int a(int i, int i2) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof to5) && Float.compare(this.a, ((to5) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return n.n(new StringBuilder("Vertical(bias="), this.a, ')');
    }
}
