package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class xc1 extends defpackage.vb {
    public defpackage.ci1 ZpBGe2uQfcn8;
    public long giKS3J6vZuNy = 9205357640488583168L;

    @Override // defpackage.vb
    public final void ZpBGe2uQfcn8(float f, long j, defpackage.j2 j2Var) {
        android.graphics.Paint paint = (android.graphics.Paint) j2Var.giKS3J6vZuNy;
        defpackage.ci1 ci1Var = this.ZpBGe2uQfcn8;
        if (ci1Var == null || !defpackage.ae1.ZpBGe2uQfcn8(this.giKS3J6vZuNy, j)) {
            if (defpackage.ae1.fWTAfUmVKrZq(j)) {
                this.ZpBGe2uQfcn8 = null;
                this.giKS3J6vZuNy = 9205357640488583168L;
                ci1Var = null;
            } else {
                ci1Var = this.ZpBGe2uQfcn8;
                if (ci1Var == null) {
                    ci1Var = new defpackage.ci1(2);
                    this.ZpBGe2uQfcn8 = ci1Var;
                }
                ci1Var.oh71FJcDz6S2 = giKS3J6vZuNy(j);
                this.ZpBGe2uQfcn8 = ci1Var;
                this.giKS3J6vZuNy = j;
            }
        }
        long JhCgjQRTAOCT = defpackage.ok0.JhCgjQRTAOCT(paint.getColor());
        long j2 = defpackage.pf.giKS3J6vZuNy;
        if (!defpackage.pf.fWTAfUmVKrZq(JhCgjQRTAOCT, j2)) {
            j2Var.WDYagTQQm9ns(j2);
        }
        if (!defpackage.ma0.QiMR8OkAhezm((android.graphics.Shader) j2Var.fWTAfUmVKrZq, ci1Var != null ? (android.graphics.Shader) ci1Var.oh71FJcDz6S2 : null)) {
            j2Var.P05cfTpS5W5L(ci1Var != null ? (android.graphics.Shader) ci1Var.oh71FJcDz6S2 : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        j2Var.fWTAfUmVKrZq(f);
    }

    public abstract android.graphics.Shader giKS3J6vZuNy(long j);
}
