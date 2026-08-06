package defpackage;

/* loaded from: classes.dex */
public final class an implements defpackage.sd0 {
    public final java.lang.Object AARZUJiTa;
    public final /* synthetic */ int adDC3e2L = 1;
    public final java.lang.Object xiZrDbcSW0;

    public an(defpackage.td0 td0Var) {
        this.xiZrDbcSW0 = td0Var;
        defpackage.ad adVar = defpackage.ad.r1MBDhnF;
        java.lang.Class<?> cls = td0Var.getClass();
        defpackage.yc ycVar = (defpackage.yc) adVar.IHQe1A4L2xu.get(cls);
        this.AARZUJiTa = ycVar == null ? adVar.IHQe1A4L2xu(cls, null) : ycVar;
    }

    @Override // defpackage.sd0
    public final void riuEU0zW4(defpackage.ud0 ud0Var, defpackage.md0 md0Var) {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        java.lang.Object obj2 = this.AARZUJiTa;
        switch (i) {
            case 0:
                defpackage.ym ymVar = (defpackage.ym) obj;
                switch (defpackage.zm.IHQe1A4L2xu[md0Var.ordinal()]) {
                    case 1:
                        ymVar.getClass();
                        break;
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        ymVar.F7NU4MC0GW(ud0Var);
                        break;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        ymVar.AARZUJiTa(ud0Var);
                        break;
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        ymVar.getClass();
                        break;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        ymVar.oh6vYeIP(ud0Var);
                        break;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        ymVar.getClass();
                        break;
                    case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.db.fnWB2E7cs("ON_ANY must not been send by anybody");
                        break;
                    default:
                        defpackage.db.F7NU4MC0GW();
                        break;
                }
                defpackage.sd0 sd0Var = (defpackage.sd0) obj2;
                if (sd0Var != null) {
                    sd0Var.riuEU0zW4(ud0Var, md0Var);
                    break;
                }
                break;
            case 1:
                if (md0Var == defpackage.md0.ON_START) {
                    ((defpackage.xd0) obj).xiZrDbcSW0(this);
                    ((defpackage.F7NU4MC0GW) obj2).C0U8sNJm();
                    break;
                }
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.nq0 nq0Var = (defpackage.nq0) obj;
                int i2 = defpackage.sq0.IHQe1A4L2xu[md0Var.ordinal()];
                if (i2 == 1) {
                    nq0Var.AARZUJiTa(true);
                    break;
                } else if (i2 == 2) {
                    nq0Var.AARZUJiTa(false);
                    break;
                } else if (i2 == 3) {
                    nq0Var.adDC3e2L();
                    ((defpackage.xd0) obj2).xiZrDbcSW0(this);
                    break;
                }
                break;
            default:
                java.util.HashMap hashMap = ((defpackage.yc) obj2).IHQe1A4L2xu;
                defpackage.yc.IHQe1A4L2xu((java.util.List) hashMap.get(md0Var), ud0Var, md0Var, obj);
                defpackage.yc.IHQe1A4L2xu((java.util.List) hashMap.get(defpackage.md0.ON_ANY), ud0Var, md0Var, obj);
                break;
        }
    }

    public an(defpackage.ym ymVar, defpackage.sd0 sd0Var) {
        ymVar.getClass();
        this.xiZrDbcSW0 = ymVar;
        this.AARZUJiTa = sd0Var;
    }

    public an(defpackage.F7NU4MC0GW f7nu4mc0gw, defpackage.xd0 xd0Var) {
        this.xiZrDbcSW0 = xd0Var;
        this.AARZUJiTa = f7nu4mc0gw;
    }

    public an(defpackage.nq0 nq0Var, defpackage.tq0 tq0Var, defpackage.xd0 xd0Var) {
        this.xiZrDbcSW0 = nq0Var;
        this.AARZUJiTa = xd0Var;
    }
}
