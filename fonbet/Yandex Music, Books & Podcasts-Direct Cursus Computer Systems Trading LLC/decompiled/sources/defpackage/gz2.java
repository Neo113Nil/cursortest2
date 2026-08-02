package defpackage;

/* loaded from: classes.dex */
public final class gz2 {
    public final float a;

    public gz2(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, xof xofVar) {
        float f = (i2 - i) / 2.0f;
        xof xofVar2 = xof.a;
        float f2 = this.a;
        if (xofVar != xofVar2) {
            f2 *= -1;
        }
        return dfi.a(1, f2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gz2) && Float.compare(this.a, ((gz2) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.p(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
