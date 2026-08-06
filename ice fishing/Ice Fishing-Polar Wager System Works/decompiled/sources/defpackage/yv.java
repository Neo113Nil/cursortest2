package defpackage;

/* loaded from: classes.dex */
public final class yv {
    public final float IHQe1A4L2xu;
    public final float oh6vYeIP;

    public yv(float f, defpackage.qn qnVar) {
        this.IHQe1A4L2xu = f;
        float oh6vYeIP = qnVar.oh6vYeIP();
        float f2 = defpackage.zv.IHQe1A4L2xu;
        this.oh6vYeIP = oh6vYeIP * 386.0878f * 160.0f * 0.84f;
    }

    public final defpackage.xv IHQe1A4L2xu(float f) {
        double oh6vYeIP = oh6vYeIP(f);
        double d = defpackage.zv.IHQe1A4L2xu;
        double d2 = d - 1.0d;
        return new defpackage.xv(f, (float) (java.lang.Math.exp((d / d2) * oh6vYeIP) * this.IHQe1A4L2xu * this.oh6vYeIP), (long) (java.lang.Math.exp(oh6vYeIP / d2) * 1000.0d));
    }

    public final double oh6vYeIP(float f) {
        float[] fArr = defpackage.j2.IHQe1A4L2xu;
        return java.lang.Math.log((java.lang.Math.abs(f) * 0.35f) / (this.IHQe1A4L2xu * this.oh6vYeIP));
    }
}
