package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ix {
    public final float ZpBGe2uQfcn8;
    public final float giKS3J6vZuNy;

    public ix(float f, defpackage.hp hpVar) {
        this.ZpBGe2uQfcn8 = f;
        float giKS3J6vZuNy = hpVar.giKS3J6vZuNy();
        float f2 = defpackage.jx.ZpBGe2uQfcn8;
        this.giKS3J6vZuNy = giKS3J6vZuNy * 386.0878f * 160.0f * 0.84f;
    }

    public final defpackage.hx ZpBGe2uQfcn8(float f) {
        double giKS3J6vZuNy = giKS3J6vZuNy(f);
        double d = defpackage.jx.ZpBGe2uQfcn8;
        double d2 = d - 1.0d;
        return new defpackage.hx(f, (float) (java.lang.Math.exp((d / d2) * giKS3J6vZuNy) * this.ZpBGe2uQfcn8 * this.giKS3J6vZuNy), (long) (java.lang.Math.exp(giKS3J6vZuNy / d2) * 1000.0d));
    }

    public final double giKS3J6vZuNy(float f) {
        float[] fArr = defpackage.q1.ZpBGe2uQfcn8;
        return java.lang.Math.log((java.lang.Math.abs(f) * 0.35f) / (this.ZpBGe2uQfcn8 * this.giKS3J6vZuNy));
    }
}
