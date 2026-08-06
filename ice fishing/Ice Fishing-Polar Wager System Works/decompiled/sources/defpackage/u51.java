package defpackage;

/* loaded from: classes.dex */
public abstract class u51 {
    public static final defpackage.r41 IHQe1A4L2xu = new defpackage.r41(3);
    public static final defpackage.r51 oh6vYeIP = new defpackage.r51();
    public static final defpackage.vp r1MBDhnF = new defpackage.vp(1);
    public static final defpackage.s51 F7NU4MC0GW = new defpackage.s51();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object IHQe1A4L2xu(defpackage.i61 i61Var, long j, defpackage.fj fjVar) {
        defpackage.t51 t51Var;
        int i;
        defpackage.oz0 oz0Var;
        defpackage.i61 i61Var2;
        if (fjVar instanceof defpackage.t51) {
            t51Var = (defpackage.t51) fjVar;
            int i2 = t51Var.ez2rX8ReCYw;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t51Var.ez2rX8ReCYw = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = t51Var.SH1y5HwkJhh;
                i = t51Var.ez2rX8ReCYw;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    oz0Var = new defpackage.oz0();
                    defpackage.EXtogiMhuM eXtogiMhuM = new defpackage.EXtogiMhuM(i61Var, j, oz0Var, null, 1);
                    t51Var.EXtogiMhuM = i61Var;
                    t51Var.riuEU0zW4 = oz0Var;
                    t51Var.ez2rX8ReCYw = 1;
                    java.lang.Object xiZrDbcSW0 = i61Var.xiZrDbcSW0(defpackage.am0.adDC3e2L, eXtogiMhuM, t51Var);
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    if (xiZrDbcSW0 == vjVar) {
                        return vjVar;
                    }
                    i61Var2 = i61Var;
                } else {
                    if (i != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.oz0 oz0Var2 = t51Var.riuEU0zW4;
                    defpackage.i61 i61Var3 = t51Var.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                    oz0Var = oz0Var2;
                    i61Var2 = i61Var3;
                }
                return new defpackage.gq0(i61Var2.EXtogiMhuM(oz0Var.adDC3e2L));
            }
        }
        t51Var = new defpackage.t51(fjVar);
        java.lang.Object obj2 = t51Var.SH1y5HwkJhh;
        i = t51Var.ez2rX8ReCYw;
        if (i != 0) {
        }
        return new defpackage.gq0(i61Var2.EXtogiMhuM(oz0Var.adDC3e2L));
    }
}
