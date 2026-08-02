package defpackage;

/* loaded from: classes10.dex */
public final class qj2 extends sj2 {
    public float a;
    public float b;
    public float c;

    public qj2(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.sj2
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.sj2
    public final int b() {
        return 3;
    }

    @Override // defpackage.sj2
    public final sj2 c() {
        return new qj2(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.sj2
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.sj2
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qj2)) {
            return false;
        }
        qj2 qj2Var = (qj2) obj;
        return qj2Var.a == this.a && qj2Var.b == this.b && qj2Var.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
