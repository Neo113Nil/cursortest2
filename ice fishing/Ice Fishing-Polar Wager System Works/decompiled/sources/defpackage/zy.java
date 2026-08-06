package defpackage;

/* loaded from: classes.dex */
public abstract class zy {
    public static final float[] IHQe1A4L2xu = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile defpackage.qb1 oh6vYeIP = new defpackage.qb1();
    public static final java.lang.Object[] r1MBDhnF;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        r1MBDhnF = objArr;
        synchronized (objArr) {
            oh6vYeIP.F7NU4MC0GW(115, new defpackage.az(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            oh6vYeIP.F7NU4MC0GW(130, new defpackage.az(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            oh6vYeIP.F7NU4MC0GW(150, new defpackage.az(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            oh6vYeIP.F7NU4MC0GW(180, new defpackage.az(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            oh6vYeIP.F7NU4MC0GW(200, new defpackage.az(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((oh6vYeIP.r1MBDhnF(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        defpackage.z50.oh6vYeIP("You should only apply non-linear scaling to font scales > 1");
    }

    public static defpackage.yy IHQe1A4L2xu(float f) {
        float r1MBDhnF2;
        defpackage.yy yyVar;
        float[] fArr = IHQe1A4L2xu;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        defpackage.yy yyVar2 = (defpackage.yy) oh6vYeIP.oh6vYeIP(i);
        if (yyVar2 != null) {
            return yyVar2;
        }
        defpackage.qb1 qb1Var = oh6vYeIP;
        if (qb1Var.adDC3e2L) {
            defpackage.mj1.QoRHpC4k(qb1Var);
        }
        int G3OKOH3wZRC = defpackage.s21.G3OKOH3wZRC(qb1Var.xiZrDbcSW0, qb1Var.EXtogiMhuM, i);
        if (G3OKOH3wZRC >= 0) {
            return (defpackage.yy) oh6vYeIP.xiZrDbcSW0(G3OKOH3wZRC);
        }
        int i2 = -(G3OKOH3wZRC + 1);
        int i3 = i2 - 1;
        if (i2 >= oh6vYeIP.adDC3e2L()) {
            defpackage.az azVar = new defpackage.az(new float[]{1.0f}, new float[]{f});
            oh6vYeIP(f, azVar);
            return azVar;
        }
        if (i3 < 0) {
            yyVar = new defpackage.az(fArr, fArr);
            r1MBDhnF2 = 1.0f;
        } else {
            r1MBDhnF2 = oh6vYeIP.r1MBDhnF(i3) / 100.0f;
            yyVar = (defpackage.yy) oh6vYeIP.xiZrDbcSW0(i3);
        }
        float r1MBDhnF3 = oh6vYeIP.r1MBDhnF(i2) / 100.0f;
        float max = (java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, r1MBDhnF2 == r1MBDhnF3 ? 0.0f : (f - r1MBDhnF2) / (r1MBDhnF3 - r1MBDhnF2))) * 1.0f) + 0.0f;
        defpackage.yy yyVar3 = (defpackage.yy) oh6vYeIP.xiZrDbcSW0(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float oh6vYeIP2 = yyVar.oh6vYeIP(f2);
            fArr2[i4] = ((yyVar3.oh6vYeIP(f2) - oh6vYeIP2) * max) + oh6vYeIP2;
        }
        defpackage.az azVar2 = new defpackage.az(fArr, fArr2);
        oh6vYeIP(f, azVar2);
        return azVar2;
    }

    public static void oh6vYeIP(float f, defpackage.az azVar) {
        synchronized (r1MBDhnF) {
            defpackage.qb1 clone = oh6vYeIP.clone();
            clone.F7NU4MC0GW((int) (f * 100.0f), azVar);
            oh6vYeIP = clone;
        }
    }
}
