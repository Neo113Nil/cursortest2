package defpackage;

/* loaded from: classes.dex */
public final class yp0 extends defpackage.ce1 implements defpackage.l00 {
    public /* synthetic */ long SH1y5HwkJhh;
    public /* synthetic */ defpackage.n10 riuEU0zW4;

    @Override // defpackage.l00
    public final java.lang.Object F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long longValue = ((java.lang.Number) obj2).longValue();
        defpackage.yp0 yp0Var = new defpackage.yp0(3, (defpackage.ej) obj3);
        yp0Var.riuEU0zW4 = (defpackage.n10) obj;
        yp0Var.SH1y5HwkJhh = longValue;
        return yp0Var.SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.n10 n10Var = this.riuEU0zW4;
        long j = this.SH1y5HwkJhh;
        defpackage.f70.nBH8hAHy(obj);
        n10Var.getClass();
        java.util.Set set = n10Var.riuEU0zW4;
        int size = (set.size() * 2) + 20;
        defpackage.j11 lpprD5VAS = defpackage.x70.lpprD5VAS(n10Var.oh6vYeIP, size, n10Var.r1MBDhnF, j);
        long j2 = n10Var.F7NU4MC0GW;
        long DFo87pBq1E5 = j2 <= 0 ? 0L : defpackage.x80.DFo87pBq1E5((java.lang.Math.min(j2, j) + 86400000) - j, 0L, 86400000L);
        int i = lpprD5VAS.IHQe1A4L2xu;
        long j3 = lpprD5VAS.r1MBDhnF;
        java.util.Set QUKZkWRtw6 = defpackage.x70.QUKZkWRtw6(n10Var.EXtogiMhuM);
        boolean z = true;
        if (DFo87pBq1E5 > 0) {
            z = false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = defpackage.pm90rNzI5F.SH1y5HwkJhh.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            defpackage.pm90rNzI5F pm90rnzi5f = (defpackage.pm90rNzI5F) next;
            pm90rnzi5f.getClass();
            java.util.Set set2 = set;
            if (defpackage.x70.SyNS6RMn(pm90rnzi5f, n10Var) >= pm90rnzi5f.EXtogiMhuM) {
                arrayList.add(next);
            }
            set = set2;
        }
        return new defpackage.k11(n10Var, j, i, size, j3, QUKZkWRtw6, z, DFo87pBq1E5, defpackage.td.FisHbM7NmV(arrayList), set.size() == defpackage.o01.QoRHpC4k.IHQe1A4L2xu());
    }
}
