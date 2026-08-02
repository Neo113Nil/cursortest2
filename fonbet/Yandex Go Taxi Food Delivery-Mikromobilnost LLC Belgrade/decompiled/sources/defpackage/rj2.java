package defpackage;

/* loaded from: classes10.dex */
public final class rj2 extends sj2 {
    public float a;
    public float b;
    public float c;
    public float d;

    public rj2(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.sj2
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.sj2
    public final int b() {
        return 4;
    }

    @Override // defpackage.sj2
    public final sj2 c() {
        return new rj2(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.sj2
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.sj2
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rj2)) {
            return false;
        }
        rj2 rj2Var = (rj2) obj;
        return rj2Var.a == this.a && rj2Var.b == this.b && rj2Var.c == this.c && rj2Var.d == this.d;
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }

    public final float h() {
        return this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final float i() {
        return this.d;
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
