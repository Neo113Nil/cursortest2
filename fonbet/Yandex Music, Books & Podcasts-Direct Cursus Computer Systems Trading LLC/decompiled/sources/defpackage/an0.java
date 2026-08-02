package defpackage;

/* loaded from: classes.dex */
public final class an0 extends cn0 {
    public float a;
    public float b;
    public float c;

    public an0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.cn0
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

    @Override // defpackage.cn0
    public final int b() {
        return 3;
    }

    @Override // defpackage.cn0
    public final cn0 c() {
        return new an0(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.cn0
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.cn0
    public final void e(int i, float f) {
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
        if (!(obj instanceof an0)) {
            return false;
        }
        an0 an0Var = (an0) obj;
        return an0Var.a == this.a && an0Var.b == this.b && an0Var.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + eta.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
