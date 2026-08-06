package defpackage;

/* loaded from: classes.dex */
public class c41 implements defpackage.ek, defpackage.q91, defpackage.kj, defpackage.pl1 {
    public static defpackage.c41 xiZrDbcSW0;
    public final /* synthetic */ int adDC3e2L;

    public /* synthetic */ c41(int i) {
        this.adDC3e2L = i;
    }

    public static defpackage.wo1 AARZUJiTa(defpackage.t10 t10Var) {
        defpackage.wo1 wo1Var;
        android.view.View view = (android.view.View) t10Var.SH1y5HwkJhh(defpackage.j1.adDC3e2L);
        java.util.WeakHashMap weakHashMap = defpackage.wo1.PAEGRtP0bX;
        synchronized (weakHashMap) {
            try {
                java.lang.Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new defpackage.wo1(view);
                    weakHashMap.put(view, obj);
                }
                wo1Var = (defpackage.wo1) obj;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        boolean EXtogiMhuM = t10Var.EXtogiMhuM(wo1Var) | t10Var.EXtogiMhuM(view);
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        if (EXtogiMhuM || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
            mAr5m2L7gYDP = new defpackage.oi1(2, wo1Var, view);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
        }
        defpackage.s21.oh6vYeIP(wo1Var, (defpackage.g00) mAr5m2L7gYDP, t10Var);
        return wo1Var;
    }

    public static final defpackage.s3 F7NU4MC0GW(java.lang.String str, int i) {
        java.util.WeakHashMap weakHashMap = defpackage.wo1.PAEGRtP0bX;
        return new defpackage.s3(str, i);
    }

    public static final int adDC3e2L(int i, long j) {
        int i2 = defpackage.s21.ez2rX8ReCYw;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static final defpackage.ll1 xiZrDbcSW0(java.lang.String str, int i) {
        java.util.WeakHashMap weakHashMap = defpackage.wo1.PAEGRtP0bX;
        return new defpackage.ll1(new defpackage.q60(0, 0, 0, 0), str);
    }

    public boolean EXtogiMhuM(java.lang.CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.pl1
    public int SyNS6RMn() {
        return 0;
    }

    @Override // defpackage.nl1
    public defpackage.i5 cnag84Bm(long j, defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        return j < 0 ? i5Var : i5Var2;
    }

    @Override // defpackage.pl1
    public int ez2rX8ReCYw() {
        return 0;
    }

    @Override // defpackage.q91
    public defpackage.hw r1MBDhnF(defpackage.jd1 jd1Var) {
        switch (this.adDC3e2L) {
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.mw();
            default:
                return new defpackage.pl(2, new defpackage.t01(jd1Var, null, 6));
        }
    }

    public java.lang.String toString() {
        switch (this.adDC3e2L) {
            case 0:
                int hashCode = hashCode();
                defpackage.x70.G3OKOH3wZRC(16);
                java.lang.String num = java.lang.Integer.toString(hashCode, 16);
                num.getClass();
                return "CreationExtras.Key@" + num + "<" + defpackage.sz0.IHQe1A4L2xu(android.os.Bundle.class).r1MBDhnF() + ">";
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return "SharingStarted.Eagerly";
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return "SharingStarted.Lazily";
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                return "ReusedSlotId";
            case 16:
                int hashCode2 = hashCode();
                defpackage.x70.G3OKOH3wZRC(16);
                java.lang.String num2 = java.lang.Integer.toString(hashCode2, 16);
                num2.getClass();
                return "CreationExtras.Key@" + num2 + "<" + defpackage.sz0.IHQe1A4L2xu(android.app.Application.class).r1MBDhnF() + ">";
            case 17:
                int hashCode3 = hashCode();
                defpackage.x70.G3OKOH3wZRC(16);
                java.lang.String num3 = java.lang.Integer.toString(hashCode3, 16);
                num3.getClass();
                return "CreationExtras.Key@" + num3 + "<" + defpackage.sz0.IHQe1A4L2xu(java.lang.String.class).r1MBDhnF() + ">";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nl1
    public defpackage.i5 JlrlGoKF(long j, defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        return i5Var3;
    }
}
