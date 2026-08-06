package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yd1 {
    public final java.lang.Object JhCgjQRTAOCT;
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public java.lang.Object fWTAfUmVKrZq;
    public boolean giKS3J6vZuNy;

    public yd1(boolean z, defpackage.oa1 oa1Var, defpackage.z20 z20Var) {
        this.ZpBGe2uQfcn8 = 0;
        this.giKS3J6vZuNy = z;
        this.fWTAfUmVKrZq = oa1Var;
        this.JhCgjQRTAOCT = z20Var;
    }

    public defpackage.an ZpBGe2uQfcn8() {
        defpackage.z20 z20Var = (defpackage.z20) this.JhCgjQRTAOCT;
        int i = z20Var.giKS3J6vZuNy;
        int i2 = z20Var.fWTAfUmVKrZq;
        return i < i2 ? defpackage.an.oh71FJcDz6S2 : i > i2 ? defpackage.an.WDYagTQQm9ns : defpackage.an.QiMR8OkAhezm;
    }

    public long fWTAfUmVKrZq(defpackage.nm1 nm1Var, long j, boolean z, defpackage.p81 p81Var) {
        defpackage.em1 em1Var = (defpackage.em1) this.JhCgjQRTAOCT;
        long fWTAfUmVKrZq = defpackage.em1.fWTAfUmVKrZq(em1Var, nm1Var, j, z, false, p81Var, false, null);
        if (!defpackage.in1.ZpBGe2uQfcn8(fWTAfUmVKrZq, (defpackage.in1) this.fWTAfUmVKrZq)) {
            this.giKS3J6vZuNy = false;
        }
        em1Var.WmetiUbpKU9I(defpackage.in1.fWTAfUmVKrZq(fWTAfUmVKrZq) ? defpackage.q40.QiMR8OkAhezm : defpackage.q40.oh71FJcDz6S2);
        return fWTAfUmVKrZq;
    }

    public void giKS3J6vZuNy() {
        if (this.giKS3J6vZuNy) {
            defpackage.em1.giKS3J6vZuNy((defpackage.em1) this.JhCgjQRTAOCT, (defpackage.in1) this.fWTAfUmVKrZq);
        }
    }

    public java.lang.String toString() {
        switch (this.ZpBGe2uQfcn8) {
            case 0:
                return "SingleSelectionLayout(isStartHandle=" + this.giKS3J6vZuNy + ", crossed=" + ZpBGe2uQfcn8() + ", info=\n\t" + ((defpackage.z20) this.JhCgjQRTAOCT) + ')';
            default:
                return super.toString();
        }
    }

    public yd1(defpackage.em1 em1Var) {
        this.ZpBGe2uQfcn8 = 1;
        this.JhCgjQRTAOCT = em1Var;
        this.giKS3J6vZuNy = true;
    }
}
