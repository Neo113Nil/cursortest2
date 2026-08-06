package defpackage;

/* loaded from: classes.dex */
public abstract class vn1 {
    public final long F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public float oh6vYeIP;
    public final android.view.animation.Interpolator r1MBDhnF;

    public vn1(int i, android.view.animation.Interpolator interpolator, long j) {
        this.IHQe1A4L2xu = i;
        this.r1MBDhnF = interpolator;
        this.F7NU4MC0GW = j;
    }

    public int F7NU4MC0GW() {
        return this.IHQe1A4L2xu;
    }

    public float IHQe1A4L2xu() {
        return 1.0f;
    }

    public void adDC3e2L(float f) {
        this.oh6vYeIP = f;
    }

    public long oh6vYeIP() {
        return this.F7NU4MC0GW;
    }

    public float r1MBDhnF() {
        float f = this.oh6vYeIP;
        android.view.animation.Interpolator interpolator = this.r1MBDhnF;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }
}
