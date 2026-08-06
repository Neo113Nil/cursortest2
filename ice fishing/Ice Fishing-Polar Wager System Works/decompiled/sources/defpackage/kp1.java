package defpackage;

/* loaded from: classes.dex */
public final class kp1 implements defpackage.sd0 {
    public final /* synthetic */ defpackage.gz0 AARZUJiTa;
    public final /* synthetic */ defpackage.rz0 EXtogiMhuM;
    public final /* synthetic */ defpackage.dj adDC3e2L;
    public final /* synthetic */ defpackage.o3 xiZrDbcSW0;

    public kp1(defpackage.dj djVar, defpackage.o3 o3Var, defpackage.gz0 gz0Var, defpackage.rz0 rz0Var) {
        this.adDC3e2L = djVar;
        this.xiZrDbcSW0 = o3Var;
        this.AARZUJiTa = gz0Var;
        this.EXtogiMhuM = rz0Var;
    }

    @Override // defpackage.sd0
    public final void riuEU0zW4(defpackage.ud0 ud0Var, defpackage.md0 md0Var) {
        boolean z;
        defpackage.ab abVar = null;
        switch (defpackage.jp1.IHQe1A4L2xu[md0Var.ordinal()]) {
            case 1:
                defpackage.fm.SiPhmbmu(this.adDC3e2L, null, new defpackage.x3(this.EXtogiMhuM, this.AARZUJiTa, ud0Var, this, null, 9), 1);
                return;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.o3 o3Var = this.xiZrDbcSW0;
                if (o3Var != null) {
                    defpackage.q90 q90Var = (defpackage.q90) o3Var.AARZUJiTa;
                    synchronized (q90Var.oh6vYeIP) {
                        try {
                            synchronized (q90Var.oh6vYeIP) {
                                z = q90Var.IHQe1A4L2xu;
                            }
                            if (!z) {
                                java.util.ArrayList arrayList = (java.util.ArrayList) q90Var.r1MBDhnF;
                                q90Var.r1MBDhnF = (java.util.ArrayList) q90Var.F7NU4MC0GW;
                                q90Var.F7NU4MC0GW = arrayList;
                                q90Var.IHQe1A4L2xu = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((defpackage.ej) arrayList.get(i)).SH1y5HwkJhh(defpackage.ok1.IHQe1A4L2xu);
                                }
                                arrayList.clear();
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
                defpackage.gz0 gz0Var = this.AARZUJiTa;
                synchronized (gz0Var.r1MBDhnF) {
                    if (gz0Var.fnWB2E7cs) {
                        gz0Var.fnWB2E7cs = false;
                        abVar = gz0Var.NHJTzaLwkd();
                    }
                }
                if (abVar != null) {
                    ((defpackage.bb) abVar).SH1y5HwkJhh(defpackage.ok1.IHQe1A4L2xu);
                    return;
                }
                return;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.gz0 gz0Var2 = this.AARZUJiTa;
                synchronized (gz0Var2.r1MBDhnF) {
                    gz0Var2.fnWB2E7cs = true;
                }
                return;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                this.AARZUJiTa.abhbClRa();
                return;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                defpackage.db.F7NU4MC0GW();
                return;
        }
    }
}
