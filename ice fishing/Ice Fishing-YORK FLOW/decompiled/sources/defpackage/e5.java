package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class e5 extends defpackage.lc0 implements defpackage.d20 {
    public final /* synthetic */ defpackage.q5 P05cfTpS5W5L;
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ defpackage.nh e6mdH7fiFuta;
    public final /* synthetic */ defpackage.ff1 oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(defpackage.ff1 ff1Var, java.lang.Object obj, defpackage.q5 q5Var, defpackage.nh nhVar) {
        super(3);
        this.oh71FJcDz6S2 = ff1Var;
        this.QiMR8OkAhezm = obj;
        this.P05cfTpS5W5L = q5Var;
        this.e6mdH7fiFuta = nhVar;
    }

    @Override // defpackage.d20
    public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.u5 u5Var = (defpackage.u5) obj;
        defpackage.e30 e30Var = (defpackage.e30) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? e30Var.oh71FJcDz6S2(u5Var) : e30Var.P05cfTpS5W5L(u5Var) ? 4 : 2;
        }
        if (e30Var.zJPqDeoF0Os1(intValue & 1, (intValue & 19) != 18)) {
            defpackage.ff1 ff1Var = this.oh71FJcDz6S2;
            boolean oh71FJcDz6S2 = e30Var.oh71FJcDz6S2(ff1Var);
            java.lang.Object obj4 = this.QiMR8OkAhezm;
            boolean P05cfTpS5W5L = oh71FJcDz6S2 | e30Var.P05cfTpS5W5L(obj4);
            defpackage.q5 q5Var = this.P05cfTpS5W5L;
            boolean P05cfTpS5W5L2 = P05cfTpS5W5L | e30Var.P05cfTpS5W5L(q5Var);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
            if (P05cfTpS5W5L2 || GcLuU6pT9wO9 == pa1Var) {
                GcLuU6pT9wO9 = new defpackage.d5(ff1Var, obj4, q5Var, 0);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.nq1.oh71FJcDz6S2(u5Var, (defpackage.y10) GcLuU6pT9wO9, e30Var);
            defpackage.yn0 yn0Var = q5Var.JhCgjQRTAOCT;
            u5Var.getClass();
            yn0Var.h3m55N1URyyK(obj4, ((defpackage.v5) u5Var).ZpBGe2uQfcn8);
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO92 == pa1Var) {
                GcLuU6pT9wO92 = new defpackage.k5();
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
            }
            this.e6mdH7fiFuta.h3m55N1URyyK((defpackage.k5) GcLuU6pT9wO92, obj4, e30Var, 0);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
