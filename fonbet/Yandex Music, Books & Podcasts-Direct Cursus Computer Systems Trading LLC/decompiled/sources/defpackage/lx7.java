package defpackage;

/* loaded from: classes.dex */
public final class lx7 implements jx7 {
    public final float a;
    public final float b;
    public final lqc c;

    public lx7(float f, float f2, lqc lqcVar) {
        this.a = f;
        this.b = f2;
        this.c = lqcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx7)) {
            return false;
        }
        lx7 lx7Var = (lx7) obj;
        return Float.compare(this.a, lx7Var.a) == 0 && Float.compare(this.b, lx7Var.b) == 0 && this.c.equals(lx7Var.c);
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + eta.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.b;
    }

    @Override // defpackage.jx7
    public final long l(float f) {
        return v7g.D(this.c.a(f), 4294967296L);
    }

    @Override // defpackage.jx7
    public final float p(long j) {
        if (les.a(kes.b(j), 4294967296L)) {
            return this.c.b(kes.c(j));
        }
        xq0.q("Only Sp can convert to Px");
        return 0.0f;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }
}
