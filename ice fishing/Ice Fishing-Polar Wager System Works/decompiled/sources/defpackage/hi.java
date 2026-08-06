package defpackage;

/* loaded from: classes.dex */
public class hi {
    public final float[] F7NU4MC0GW;
    public final defpackage.ie IHQe1A4L2xu;
    public final defpackage.ie oh6vYeIP;
    public final defpackage.ie r1MBDhnF;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hi(defpackage.ie ieVar, defpackage.ie ieVar2, int i) {
        this(ieVar2, r0, r1, r4);
        float[] fArr;
        defpackage.ie SH1y5HwkJhh = defpackage.x70.QQUzIjv3iOC5(ieVar.oh6vYeIP, 12884901888L) ? defpackage.ci0.SH1y5HwkJhh(ieVar) : ieVar;
        defpackage.ie SH1y5HwkJhh2 = defpackage.x70.QQUzIjv3iOC5(ieVar2.oh6vYeIP, 12884901888L) ? defpackage.ci0.SH1y5HwkJhh(ieVar2) : ieVar2;
        float[] fArr2 = defpackage.mj1.JlrlGoKF;
        if (i == 3) {
            boolean QQUzIjv3iOC5 = defpackage.x70.QQUzIjv3iOC5(ieVar.oh6vYeIP, 12884901888L);
            boolean QQUzIjv3iOC52 = defpackage.x70.QQUzIjv3iOC5(ieVar2.oh6vYeIP, 12884901888L);
            if ((!QQUzIjv3iOC5 || !QQUzIjv3iOC52) && (QQUzIjv3iOC5 || QQUzIjv3iOC52)) {
                defpackage.kn1 kn1Var = ((defpackage.d21) (QQUzIjv3iOC5 ? ieVar : ieVar2)).F7NU4MC0GW;
                float[] IHQe1A4L2xu = QQUzIjv3iOC5 ? kn1Var.IHQe1A4L2xu() : fArr2;
                fArr2 = QQUzIjv3iOC52 ? kn1Var.IHQe1A4L2xu() : fArr2;
                fArr = new float[]{IHQe1A4L2xu[0] / fArr2[0], IHQe1A4L2xu[1] / fArr2[1], IHQe1A4L2xu[2] / fArr2[2]};
            }
        }
        fArr = null;
    }

    public long IHQe1A4L2xu(long j) {
        float EXtogiMhuM = defpackage.ae.EXtogiMhuM(j);
        float AARZUJiTa = defpackage.ae.AARZUJiTa(j);
        float adDC3e2L = defpackage.ae.adDC3e2L(j);
        float F7NU4MC0GW = defpackage.ae.F7NU4MC0GW(j);
        defpackage.ie ieVar = this.oh6vYeIP;
        long F7NU4MC0GW2 = ieVar.F7NU4MC0GW(EXtogiMhuM, AARZUJiTa, adDC3e2L);
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (F7NU4MC0GW2 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (F7NU4MC0GW2 & 4294967295L));
        float adDC3e2L2 = ieVar.adDC3e2L(EXtogiMhuM, AARZUJiTa, adDC3e2L);
        float[] fArr = this.F7NU4MC0GW;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            adDC3e2L2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.r1MBDhnF.xiZrDbcSW0(f, f2, adDC3e2L2, F7NU4MC0GW, this.IHQe1A4L2xu);
    }

    public hi(defpackage.ie ieVar, defpackage.ie ieVar2, defpackage.ie ieVar3, float[] fArr) {
        this.IHQe1A4L2xu = ieVar;
        this.oh6vYeIP = ieVar2;
        this.r1MBDhnF = ieVar3;
        this.F7NU4MC0GW = fArr;
    }
}
