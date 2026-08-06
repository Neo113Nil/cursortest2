package defpackage;

/* loaded from: classes.dex */
public final class qc0 {
    public final /* synthetic */ int AARZUJiTa;
    public final /* synthetic */ defpackage.c8 EXtogiMhuM;
    public final long F7NU4MC0GW;
    public final defpackage.xk0 IHQe1A4L2xu;
    public final /* synthetic */ defpackage.yc0 JlrlGoKF;
    public final /* synthetic */ int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.xb0 adDC3e2L;
    public final /* synthetic */ long ez2rX8ReCYw;
    public final defpackage.oc0 oh6vYeIP;
    public final defpackage.xb0 r1MBDhnF;
    public final /* synthetic */ int riuEU0zW4;
    public final /* synthetic */ int xiZrDbcSW0;

    public qc0(long j, defpackage.oc0 oc0Var, defpackage.xb0 xb0Var, int i, int i2, defpackage.c8 c8Var, int i3, int i4, long j2, defpackage.yc0 yc0Var) {
        this.adDC3e2L = xb0Var;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = i2;
        this.EXtogiMhuM = c8Var;
        this.riuEU0zW4 = i3;
        this.SH1y5HwkJhh = i4;
        this.ez2rX8ReCYw = j2;
        this.JlrlGoKF = yc0Var;
        defpackage.xk0 xk0Var = defpackage.y60.IHQe1A4L2xu;
        this.IHQe1A4L2xu = new defpackage.xk0();
        this.oh6vYeIP = oc0Var;
        this.r1MBDhnF = xb0Var;
        this.F7NU4MC0GW = defpackage.li.oh6vYeIP(defpackage.ki.EXtogiMhuM(j), Integer.MAX_VALUE, 5);
    }

    public final defpackage.tc0 IHQe1A4L2xu(int i, long j) {
        long j2;
        java.util.List list;
        defpackage.oc0 oc0Var = this.oh6vYeIP;
        java.lang.Object F7NU4MC0GW = oc0Var.F7NU4MC0GW(i);
        java.lang.Object oh6vYeIP = oc0Var.oh6vYeIP(i);
        defpackage.xk0 xk0Var = this.IHQe1A4L2xu;
        java.util.List list2 = (java.util.List) xk0Var.oh6vYeIP(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            defpackage.xb0 xb0Var = this.r1MBDhnF;
            defpackage.oc0 oc0Var2 = xb0Var.AARZUJiTa;
            defpackage.xk0 xk0Var2 = xb0Var.EXtogiMhuM;
            java.util.List list3 = (java.util.List) xk0Var2.oh6vYeIP(i);
            if (list3 == null) {
                java.lang.Object F7NU4MC0GW2 = oc0Var2.F7NU4MC0GW(i);
                list3 = xb0Var.xiZrDbcSW0.NHJTzaLwkd(xb0Var.adDC3e2L.IHQe1A4L2xu(i, F7NU4MC0GW2, oc0Var2.oh6vYeIP(i)), F7NU4MC0GW2);
                xk0Var2.EXtogiMhuM(i, list3);
            }
            int size = list3.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((defpackage.di0) list3.get(i2)).xiZrDbcSW0(j));
            }
            j2 = j;
            xk0Var.EXtogiMhuM(i, arrayList);
            list = arrayList;
        }
        return new defpackage.tc0(i, list, this.EXtogiMhuM, this.adDC3e2L.xiZrDbcSW0.getLayoutDirection(), this.riuEU0zW4, this.SH1y5HwkJhh, i != this.xiZrDbcSW0 + (-1) ? this.AARZUJiTa : 0, this.ez2rX8ReCYw, F7NU4MC0GW, oh6vYeIP, this.JlrlGoKF.SyNS6RMn, j2);
    }
}
