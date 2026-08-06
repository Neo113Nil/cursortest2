package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class yv0 {
    public defpackage.j2 ZpBGe2uQfcn8;
    public defpackage.ga giKS3J6vZuNy;
    public float fWTAfUmVKrZq = 1.0f;
    public defpackage.sc0 JhCgjQRTAOCT = defpackage.sc0.WDYagTQQm9ns;

    public abstract long JhCgjQRTAOCT();

    public abstract void WDYagTQQm9ns(defpackage.ld0 ld0Var);

    public abstract void ZpBGe2uQfcn8(float f);

    public final void fWTAfUmVKrZq(defpackage.ld0 ld0Var, long j, float f, defpackage.ga gaVar) {
        defpackage.ld ldVar = ld0Var.WDYagTQQm9ns;
        if (this.fWTAfUmVKrZq != f) {
            ZpBGe2uQfcn8(f);
            this.fWTAfUmVKrZq = f;
        }
        if (!defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, gaVar)) {
            giKS3J6vZuNy(gaVar);
            this.giKS3J6vZuNy = gaVar;
        }
        defpackage.sc0 layoutDirection = ld0Var.getLayoutDirection();
        if (this.JhCgjQRTAOCT != layoutDirection) {
            this.JhCgjQRTAOCT = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (ldVar.JhCgjQRTAOCT() >> 32)) - java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (ldVar.JhCgjQRTAOCT() & 4294967295L)) - java.lang.Float.intBitsToFloat(i2);
        ((defpackage.k0) ldVar.oh71FJcDz6S2.giKS3J6vZuNy).gUjdnLbkVAaA(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (java.lang.Float.intBitsToFloat(i) > 0.0f && java.lang.Float.intBitsToFloat(i2) > 0.0f) {
                    WDYagTQQm9ns(ld0Var);
                }
            } finally {
                ((defpackage.k0) ldVar.oh71FJcDz6S2.giKS3J6vZuNy).gUjdnLbkVAaA(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract void giKS3J6vZuNy(defpackage.ga gaVar);
}
