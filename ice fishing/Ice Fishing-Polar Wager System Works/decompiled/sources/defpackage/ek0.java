package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ek0 implements defpackage.g00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.io.Serializable EXtogiMhuM;
    public final /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ int adDC3e2L = 0;
    public final /* synthetic */ java.lang.Object riuEU0zW4;
    public final /* synthetic */ defpackage.nz0 xiZrDbcSW0;

    public /* synthetic */ ek0(defpackage.ao aoVar, defpackage.rz0 rz0Var, defpackage.oz0 oz0Var, defpackage.i61 i61Var, defpackage.nz0 nz0Var) {
        this.AARZUJiTa = aoVar;
        this.EXtogiMhuM = rz0Var;
        this.riuEU0zW4 = oz0Var;
        this.SH1y5HwkJhh = i61Var;
        this.xiZrDbcSW0 = nz0Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        java.util.List list;
        int i = this.adDC3e2L;
        java.lang.Object obj2 = this.SH1y5HwkJhh;
        java.lang.Object obj3 = this.riuEU0zW4;
        java.io.Serializable serializable = this.EXtogiMhuM;
        java.lang.Object obj4 = this.AARZUJiTa;
        defpackage.nz0 nz0Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.ao aoVar = (defpackage.ao) obj4;
                defpackage.rz0 rz0Var = (defpackage.rz0) serializable;
                defpackage.oz0 oz0Var = (defpackage.oz0) obj3;
                defpackage.i61 i61Var = (defpackage.i61) obj2;
                float floatValue = ((java.lang.Float) obj).floatValue();
                defpackage.ck0 AARZUJiTa = defpackage.ao.AARZUJiTa((defpackage.x9) aoVar.xiZrDbcSW0);
                if (AARZUJiTa != null) {
                    aoVar.EXtogiMhuM(AARZUJiTa);
                    defpackage.ck0 IHQe1A4L2xu = ((defpackage.ck0) rz0Var.adDC3e2L).IHQe1A4L2xu(AARZUJiTa);
                    rz0Var.adDC3e2L = IHQe1A4L2xu;
                    oz0Var.adDC3e2L = i61Var.riuEU0zW4(i61Var.adDC3e2L(IHQe1A4L2xu.IHQe1A4L2xu));
                    nz0Var.adDC3e2L = !defpackage.a70.F7NU4MC0GW(r2 - floatValue);
                }
                return java.lang.Boolean.valueOf(AARZUJiTa != null);
            default:
                java.util.ArrayList arrayList = (java.util.ArrayList) obj4;
                defpackage.pz0 pz0Var = (defpackage.pz0) serializable;
                defpackage.ym0 ym0Var = (defpackage.ym0) obj3;
                android.os.Bundle bundle = (android.os.Bundle) obj2;
                defpackage.nm0 nm0Var = (defpackage.nm0) obj;
                nm0Var.getClass();
                nz0Var.adDC3e2L = true;
                int indexOf = arrayList.indexOf(nm0Var);
                if (indexOf != -1) {
                    int i2 = indexOf + 1;
                    list = arrayList.subList(pz0Var.adDC3e2L, i2);
                    pz0Var.adDC3e2L = i2;
                } else {
                    list = defpackage.nt.adDC3e2L;
                }
                ym0Var.IHQe1A4L2xu(nm0Var.xiZrDbcSW0, bundle, nm0Var, list);
                return defpackage.ok1.IHQe1A4L2xu;
        }
    }

    public /* synthetic */ ek0(defpackage.nz0 nz0Var, java.util.ArrayList arrayList, defpackage.pz0 pz0Var, defpackage.ym0 ym0Var, android.os.Bundle bundle) {
        this.xiZrDbcSW0 = nz0Var;
        this.AARZUJiTa = arrayList;
        this.EXtogiMhuM = pz0Var;
        this.riuEU0zW4 = ym0Var;
        this.SH1y5HwkJhh = bundle;
    }
}
