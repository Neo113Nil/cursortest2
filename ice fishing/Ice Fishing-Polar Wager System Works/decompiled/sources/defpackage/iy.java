package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class iy extends defpackage.v00 implements defpackage.k00 {
    public final /* synthetic */ int JlrlGoKF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iy(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.JlrlGoKF = i4;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        boolean IHQe1A4L2xu;
        int i = this.JlrlGoKF;
        java.lang.Object obj3 = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.fy fyVar = (defpackage.fy) obj;
                defpackage.fy fyVar2 = (defpackage.fy) obj2;
                defpackage.jy jyVar = (defpackage.jy) obj3;
                if (jyVar.kd6TUFXn && (IHQe1A4L2xu = fyVar2.IHQe1A4L2xu()) != fyVar.IHQe1A4L2xu()) {
                    defpackage.xiZrDbcSW0 xizrdbcsw0 = jyVar.V7bD7b8KA;
                    if (xizrdbcsw0 != null) {
                        xizrdbcsw0.AARZUJiTa(java.lang.Boolean.valueOf(IHQe1A4L2xu));
                    }
                    defpackage.ej ejVar = null;
                    if (IHQe1A4L2xu) {
                        defpackage.fm.SiPhmbmu(jyVar.dOmtpLcqqI1y(), null, new defpackage.ExFEDwBK(jyVar, ejVar, 3), 3);
                        defpackage.rz0 rz0Var = new defpackage.rz0();
                        defpackage.f70.V7bD7b8KA(jyVar, new defpackage.DSux0S2nxMSk(5, rz0Var, jyVar));
                        defpackage.zb0 zb0Var = (defpackage.zb0) rz0Var.adDC3e2L;
                        if (zb0Var != null) {
                            zb0Var.IHQe1A4L2xu();
                        } else {
                            zb0Var = null;
                        }
                        jyVar.abhbClRa = zb0Var;
                        defpackage.ip0 ip0Var = jyVar.NHJTzaLwkd;
                        if (ip0Var != null && ip0Var.GhHh9OOt4I().kd6TUFXn) {
                            jyVar.uLnPvzwk();
                        }
                    } else {
                        defpackage.zb0 zb0Var2 = jyVar.abhbClRa;
                        if (zb0Var2 != null) {
                            zb0Var2.oh6vYeIP();
                        }
                        jyVar.abhbClRa = null;
                        jyVar.uLnPvzwk();
                    }
                    defpackage.x80.C0U8sNJm(jyVar);
                    defpackage.zk0 zk0Var = jyVar.kNAkVymC;
                    if (zk0Var != null) {
                        defpackage.tx txVar = jyVar.PAEGRtP0bX;
                        if (IHQe1A4L2xu) {
                            if (txVar != null) {
                                jyVar.WnQbjbWuMR(zk0Var, new defpackage.ux(txVar));
                                jyVar.PAEGRtP0bX = null;
                            }
                            defpackage.tx txVar2 = new defpackage.tx();
                            jyVar.WnQbjbWuMR(zk0Var, txVar2);
                            jyVar.PAEGRtP0bX = txVar2;
                        } else if (txVar != null) {
                            jyVar.WnQbjbWuMR(zk0Var, new defpackage.ux(txVar));
                            jyVar.PAEGRtP0bX = null;
                        }
                    }
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case 1:
                return defpackage.s70.cnag84Bm((defpackage.q21) obj3, (defpackage.g00) obj, (defpackage.ej) obj2);
            default:
                return defpackage.s70.cnag84Bm((defpackage.q21) obj3, (defpackage.g00) obj, (defpackage.ej) obj2);
        }
    }
}
