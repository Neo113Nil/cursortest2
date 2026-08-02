package defpackage;

/* loaded from: classes.dex */
public final class ym0 extends cn0 {
    public float a;

    public ym0(float f) {
        this.a = f;
    }

    @Override // defpackage.cn0
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.cn0
    public final int b() {
        return 1;
    }

    @Override // defpackage.cn0
    public final cn0 c() {
        return new ym0(0.0f);
    }

    @Override // defpackage.cn0
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.cn0
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ym0) && ((ym0) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
