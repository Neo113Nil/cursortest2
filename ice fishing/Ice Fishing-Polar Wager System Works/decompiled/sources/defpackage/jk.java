package defpackage;

/* loaded from: classes.dex */
public final class jk implements defpackage.vz {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ jk(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                return ((defpackage.li1) obj).F7NU4MC0GW.getValue();
            case 1:
                return ((defpackage.li1) obj).xiZrDbcSW0();
            default:
                java.util.ArrayList arrayList = ((defpackage.w10) obj).IHQe1A4L2xu;
                defpackage.nl0 nl0Var = new defpackage.nl0(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    defpackage.m90 m90Var = (defpackage.m90) arrayList.get(i2);
                    java.lang.Object obj2 = m90Var.oh6vYeIP;
                    int i3 = m90Var.IHQe1A4L2xu;
                    java.lang.Object d90Var = obj2 != null ? new defpackage.d90(java.lang.Integer.valueOf(i3), m90Var.oh6vYeIP) : java.lang.Integer.valueOf(i3);
                    int xiZrDbcSW0 = nl0Var.xiZrDbcSW0(d90Var);
                    boolean z = xiZrDbcSW0 < 0;
                    java.lang.Object obj3 = z ? null : nl0Var.r1MBDhnF[xiZrDbcSW0];
                    if (obj3 != null) {
                        if (obj3 instanceof defpackage.gl0) {
                            defpackage.gl0 gl0Var = (defpackage.gl0) obj3;
                            gl0Var.IHQe1A4L2xu(m90Var);
                            m90Var = gl0Var;
                        } else {
                            java.lang.Object[] objArr = defpackage.vp0.IHQe1A4L2xu;
                            defpackage.gl0 gl0Var2 = new defpackage.gl0(2);
                            gl0Var2.IHQe1A4L2xu(obj3);
                            gl0Var2.IHQe1A4L2xu(m90Var);
                            m90Var = gl0Var2;
                        }
                    }
                    if (z) {
                        int i4 = ~xiZrDbcSW0;
                        nl0Var.oh6vYeIP[i4] = d90Var;
                        nl0Var.r1MBDhnF[i4] = m90Var;
                    } else {
                        nl0Var.r1MBDhnF[xiZrDbcSW0] = m90Var;
                    }
                }
                return new defpackage.tk0(nl0Var);
        }
    }
}
