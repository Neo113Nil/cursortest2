package defpackage;

/* loaded from: classes.dex */
public final class b4 implements defpackage.hq {
    public final /* synthetic */ java.lang.Object F7NU4MC0GW;
    public final /* synthetic */ int IHQe1A4L2xu;
    public final /* synthetic */ java.lang.Object oh6vYeIP;
    public final /* synthetic */ java.lang.Object r1MBDhnF;

    public b4(defpackage.no noVar, defpackage.nm0 nm0Var, defpackage.gb1 gb1Var) {
        this.IHQe1A4L2xu = 1;
        this.r1MBDhnF = noVar;
        this.F7NU4MC0GW = nm0Var;
        this.oh6vYeIP = gb1Var;
    }

    @Override // defpackage.hq
    public final void IHQe1A4L2xu() {
        int i = this.IHQe1A4L2xu;
        java.lang.Object obj = this.F7NU4MC0GW;
        java.lang.Object obj2 = this.r1MBDhnF;
        java.lang.Object obj3 = this.oh6vYeIP;
        switch (i) {
            case 0:
                ((defpackage.gb1) obj3).remove(obj2);
                ((defpackage.p4) obj).F7NU4MC0GW.ez2rX8ReCYw(obj2);
                break;
            case 1:
                defpackage.nm0 nm0Var = (defpackage.nm0) obj;
                ((defpackage.no) obj2).oh6vYeIP().r1MBDhnF(nm0Var);
                ((defpackage.gb1) obj3).remove(nm0Var);
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.ud0) obj3).EXtogiMhuM().xiZrDbcSW0((defpackage.qd0) obj2);
                defpackage.tw0 tw0Var = (defpackage.tw0) ((defpackage.rz0) obj).adDC3e2L;
                if (tw0Var != null) {
                    tw0Var.IHQe1A4L2xu();
                    break;
                }
                break;
            default:
                defpackage.s31 s31Var = (defpackage.s31) obj3;
                defpackage.x31 x31Var = (defpackage.x31) obj;
                if (s31Var.xiZrDbcSW0.ez2rX8ReCYw(obj2) == x31Var) {
                    java.util.Map map = s31Var.adDC3e2L;
                    java.util.Map adDC3e2L = x31Var.adDC3e2L();
                    if (!adDC3e2L.isEmpty()) {
                        map.put(obj2, adDC3e2L);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ b4(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = obj;
        this.r1MBDhnF = obj2;
        this.F7NU4MC0GW = obj3;
    }
}
