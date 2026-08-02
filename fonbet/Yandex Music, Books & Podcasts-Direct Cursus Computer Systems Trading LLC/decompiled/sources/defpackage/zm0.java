package defpackage;

/* loaded from: classes.dex */
public final class zm0 extends cn0 {
    public float a;
    public float b;

    public zm0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cn0
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.cn0
    public final int b() {
        return 2;
    }

    @Override // defpackage.cn0
    public final cn0 c() {
        return new zm0(0.0f, 0.0f);
    }

    @Override // defpackage.cn0
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.cn0
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zm0)) {
            return false;
        }
        zm0 zm0Var = (zm0) obj;
        return zm0Var.a == this.a && zm0Var.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
