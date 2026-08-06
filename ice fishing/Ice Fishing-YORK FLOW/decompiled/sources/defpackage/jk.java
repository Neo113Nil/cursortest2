package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class jk {
    public final float[] JhCgjQRTAOCT;
    public final defpackage.xf ZpBGe2uQfcn8;
    public final defpackage.xf fWTAfUmVKrZq;
    public final defpackage.xf giKS3J6vZuNy;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jk(defpackage.xf xfVar, defpackage.xf xfVar2, int i) {
        this(xfVar2, r0, r1, r4);
        float[] fArr;
        defpackage.xf QiMR8OkAhezm = defpackage.jr0.maCixPsq4ml2(xfVar.giKS3J6vZuNy, 12884901888L) ? defpackage.i61.QiMR8OkAhezm(xfVar) : xfVar;
        defpackage.xf QiMR8OkAhezm2 = defpackage.jr0.maCixPsq4ml2(xfVar2.giKS3J6vZuNy, 12884901888L) ? defpackage.i61.QiMR8OkAhezm(xfVar2) : xfVar2;
        float[] fArr2 = defpackage.h0.Ns0WNyEWdPsk;
        if (i == 3) {
            boolean maCixPsq4ml2 = defpackage.jr0.maCixPsq4ml2(xfVar.giKS3J6vZuNy, 12884901888L);
            boolean maCixPsq4ml22 = defpackage.jr0.maCixPsq4ml2(xfVar2.giKS3J6vZuNy, 12884901888L);
            if ((!maCixPsq4ml2 || !maCixPsq4ml22) && (maCixPsq4ml2 || maCixPsq4ml22)) {
                defpackage.av1 av1Var = ((defpackage.u51) (maCixPsq4ml2 ? xfVar : xfVar2)).JhCgjQRTAOCT;
                float[] ZpBGe2uQfcn8 = maCixPsq4ml2 ? av1Var.ZpBGe2uQfcn8() : fArr2;
                fArr2 = maCixPsq4ml22 ? av1Var.ZpBGe2uQfcn8() : fArr2;
                fArr = new float[]{ZpBGe2uQfcn8[0] / fArr2[0], ZpBGe2uQfcn8[1] / fArr2[1], ZpBGe2uQfcn8[2] / fArr2[2]};
            }
        }
        fArr = null;
    }

    public long ZpBGe2uQfcn8(long j) {
        float P05cfTpS5W5L = defpackage.pf.P05cfTpS5W5L(j);
        float QiMR8OkAhezm = defpackage.pf.QiMR8OkAhezm(j);
        float WDYagTQQm9ns = defpackage.pf.WDYagTQQm9ns(j);
        float JhCgjQRTAOCT = defpackage.pf.JhCgjQRTAOCT(j);
        defpackage.xf xfVar = this.giKS3J6vZuNy;
        long JhCgjQRTAOCT2 = xfVar.JhCgjQRTAOCT(P05cfTpS5W5L, QiMR8OkAhezm, WDYagTQQm9ns);
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (JhCgjQRTAOCT2 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (JhCgjQRTAOCT2 & 4294967295L));
        float WDYagTQQm9ns2 = xfVar.WDYagTQQm9ns(P05cfTpS5W5L, QiMR8OkAhezm, WDYagTQQm9ns);
        float[] fArr = this.JhCgjQRTAOCT;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            WDYagTQQm9ns2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.fWTAfUmVKrZq.oh71FJcDz6S2(f, f2, WDYagTQQm9ns2, JhCgjQRTAOCT, this.ZpBGe2uQfcn8);
    }

    public jk(defpackage.xf xfVar, defpackage.xf xfVar2, defpackage.xf xfVar3, float[] fArr) {
        this.ZpBGe2uQfcn8 = xfVar;
        this.giKS3J6vZuNy = xfVar2;
        this.fWTAfUmVKrZq = xfVar3;
        this.JhCgjQRTAOCT = fArr;
    }
}
