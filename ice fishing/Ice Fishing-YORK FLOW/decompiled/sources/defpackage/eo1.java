package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class eo1 {
    public long JhCgjQRTAOCT;
    public float[] QiMR8OkAhezm;
    public long WDYagTQQm9ns;
    public final defpackage.gn0 ZpBGe2uQfcn8;
    public long fWTAfUmVKrZq;
    public defpackage.do1 giKS3J6vZuNy;
    public long oh71FJcDz6S2;

    public eo1() {
        defpackage.gn0 gn0Var = defpackage.k90.ZpBGe2uQfcn8;
        this.ZpBGe2uQfcn8 = new defpackage.gn0();
        this.fWTAfUmVKrZq = -1L;
        this.JhCgjQRTAOCT = 0L;
        this.WDYagTQQm9ns = 0L;
    }

    public final void ZpBGe2uQfcn8(defpackage.do1 do1Var, long j, long j2, float[] fArr, long j3) {
        long j4 = do1Var.QiMR8OkAhezm;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            do1Var.QiMR8OkAhezm = j3;
            do1Var.ZpBGe2uQfcn8(do1Var.WDYagTQQm9ns, do1Var.oh71FJcDz6S2, j, j2, fArr);
        }
    }

    public final boolean giKS3J6vZuNy(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (defpackage.l90.ZpBGe2uQfcn8(j2, this.JhCgjQRTAOCT)) {
            z = false;
        } else {
            this.JhCgjQRTAOCT = j2;
            z = true;
        }
        if (!defpackage.l90.ZpBGe2uQfcn8(j, this.WDYagTQQm9ns)) {
            this.WDYagTQQm9ns = j;
            z = true;
        }
        if (fArr != null) {
            this.QiMR8OkAhezm = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.oh71FJcDz6S2) {
            return z;
        }
        this.oh71FJcDz6S2 = j3;
        return true;
    }
}
