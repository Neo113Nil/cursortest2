package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class t3 implements defpackage.g00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object riuEU0zW4;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ t3(defpackage.nz0 nz0Var, defpackage.ym0 ym0Var, defpackage.gn0 gn0Var, android.os.Bundle bundle) {
        this.adDC3e2L = 4;
        this.riuEU0zW4 = nz0Var;
        this.xiZrDbcSW0 = ym0Var;
        this.AARZUJiTa = gn0Var;
        this.EXtogiMhuM = bundle;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj2 = this.EXtogiMhuM;
        java.lang.Object obj3 = this.AARZUJiTa;
        java.lang.Object obj4 = this.xiZrDbcSW0;
        java.lang.Object obj5 = this.riuEU0zW4;
        switch (i) {
            case 0:
                defpackage.w3 w3Var = (defpackage.w3) obj4;
                defpackage.d5 d5Var = (defpackage.d5) obj3;
                defpackage.g00 g00Var = (defpackage.g00) obj2;
                defpackage.nz0 nz0Var = (defpackage.nz0) obj5;
                defpackage.b5 b5Var = (defpackage.b5) obj;
                defpackage.l80.UsuH8pd5P(b5Var, w3Var.r1MBDhnF);
                defpackage.qt0 qt0Var = b5Var.adDC3e2L;
                java.lang.Object IHQe1A4L2xu = defpackage.w3.IHQe1A4L2xu(w3Var, qt0Var.getValue());
                if (!defpackage.x70.QoRHpC4k(IHQe1A4L2xu, qt0Var.getValue())) {
                    w3Var.r1MBDhnF.xiZrDbcSW0.setValue(IHQe1A4L2xu);
                    d5Var.xiZrDbcSW0.setValue(IHQe1A4L2xu);
                    if (g00Var != null) {
                        g00Var.AARZUJiTa(w3Var);
                    }
                    b5Var.riuEU0zW4.setValue(java.lang.Boolean.FALSE);
                    b5Var.F7NU4MC0GW.IHQe1A4L2xu();
                    nz0Var.adDC3e2L = true;
                    break;
                } else if (g00Var != null) {
                    g00Var.AARZUJiTa(w3Var);
                    break;
                }
                break;
            case 1:
                defpackage.oz0 oz0Var = (defpackage.oz0) obj4;
                defpackage.qm qmVar = (defpackage.qm) obj5;
                defpackage.b5 b5Var2 = (defpackage.b5) obj;
                float floatValue = ((java.lang.Number) b5Var2.adDC3e2L.getValue()).floatValue() - oz0Var.adDC3e2L;
                float IHQe1A4L2xu2 = ((defpackage.e61) obj3).IHQe1A4L2xu(floatValue);
                oz0Var.adDC3e2L = ((java.lang.Number) b5Var2.adDC3e2L.getValue()).floatValue();
                ((defpackage.oz0) obj2).adDC3e2L = ((java.lang.Number) ((defpackage.g00) b5Var2.IHQe1A4L2xu.AARZUJiTa).AARZUJiTa(b5Var2.xiZrDbcSW0)).floatValue();
                if (java.lang.Math.abs(floatValue - IHQe1A4L2xu2) > 0.5f) {
                    b5Var2.riuEU0zW4.setValue(java.lang.Boolean.FALSE);
                    b5Var2.F7NU4MC0GW.IHQe1A4L2xu();
                }
                qmVar.getClass();
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.ec0 ec0Var = (defpackage.ec0) obj4;
                ec0Var.r1MBDhnF = new defpackage.q90((defpackage.sb0) obj3, (defpackage.fd1) obj2, (defpackage.kx0) obj5);
                break;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.oz0 oz0Var2 = (defpackage.oz0) obj4;
                defpackage.ao aoVar = (defpackage.ao) obj3;
                defpackage.g61 g61Var = (defpackage.g61) obj2;
                defpackage.ek0 ek0Var = (defpackage.ek0) obj5;
                defpackage.b5 b5Var3 = (defpackage.b5) obj;
                defpackage.qt0 qt0Var2 = b5Var3.adDC3e2L;
                defpackage.vz vzVar = b5Var3.F7NU4MC0GW;
                defpackage.qt0 qt0Var3 = b5Var3.riuEU0zW4;
                float floatValue2 = ((java.lang.Number) qt0Var2.getValue()).floatValue() - oz0Var2.adDC3e2L;
                if (!defpackage.a70.F7NU4MC0GW(floatValue2)) {
                    if (!defpackage.a70.F7NU4MC0GW(floatValue2 - aoVar.r1MBDhnF(g61Var, floatValue2))) {
                        qt0Var3.setValue(java.lang.Boolean.FALSE);
                        vzVar.IHQe1A4L2xu();
                        break;
                    } else {
                        oz0Var2.adDC3e2L += floatValue2;
                    }
                }
                if (((java.lang.Boolean) ek0Var.AARZUJiTa(java.lang.Float.valueOf(oz0Var2.adDC3e2L))).booleanValue()) {
                    qt0Var3.setValue(java.lang.Boolean.FALSE);
                    vzVar.IHQe1A4L2xu();
                    break;
                }
                break;
            default:
                defpackage.nm0 nm0Var = (defpackage.nm0) obj;
                nm0Var.getClass();
                ((defpackage.nz0) obj5).adDC3e2L = true;
                ((defpackage.ym0) obj4).IHQe1A4L2xu((defpackage.gn0) obj3, (android.os.Bundle) obj2, nm0Var, defpackage.nt.adDC3e2L);
                break;
        }
        return ok1Var;
    }

    public /* synthetic */ t3(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
        this.AARZUJiTa = obj2;
        this.EXtogiMhuM = obj3;
        this.riuEU0zW4 = obj4;
    }
}
