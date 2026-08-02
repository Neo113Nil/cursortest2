package defpackage;

/* loaded from: classes.dex */
public final class hz2 {
    public final float a;

    public hz2(float f) {
        this.a = f;
    }

    public final int a(int i, int i2) {
        return dfi.a(1, this.a, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz2) && Float.compare(this.a, ((hz2) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.p(new StringBuilder("Vertical(bias="), this.a, ')');
    }
}
