package defpackage;

/* loaded from: classes.dex */
public final class kx7 implements jx7 {
    public final float a;
    public final float b;

    public kx7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx7)) {
            return false;
        }
        kx7 kx7Var = (kx7) obj;
        return Float.compare(this.a, kx7Var.a) == 0 && Float.compare(this.b, kx7Var.b) == 0;
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.a);
        sb.append(", fontScale=");
        return ouj.p(sb, this.b, ')');
    }
}
