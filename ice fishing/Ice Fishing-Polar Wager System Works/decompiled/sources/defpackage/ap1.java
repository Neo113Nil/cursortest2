package defpackage;

/* loaded from: classes.dex */
public abstract class ap1 {
    public static final defpackage.xk0 IHQe1A4L2xu;
    public static final defpackage.yo1[] oh6vYeIP;

    static {
        defpackage.xk0 xk0Var = new defpackage.xk0(8);
        defpackage.yo1.IHQe1A4L2xu.getClass();
        defpackage.zo1 zo1Var = defpackage.xo1.AARZUJiTa;
        xk0Var.EXtogiMhuM(1, zo1Var);
        defpackage.zo1 zo1Var2 = defpackage.xo1.xiZrDbcSW0;
        xk0Var.EXtogiMhuM(2, zo1Var2);
        defpackage.zo1 zo1Var3 = defpackage.xo1.oh6vYeIP;
        xk0Var.EXtogiMhuM(4, zo1Var3);
        defpackage.zo1 zo1Var4 = defpackage.xo1.F7NU4MC0GW;
        xk0Var.EXtogiMhuM(8, zo1Var4);
        defpackage.zo1 zo1Var5 = defpackage.xo1.EXtogiMhuM;
        xk0Var.EXtogiMhuM(16, zo1Var5);
        defpackage.zo1 zo1Var6 = defpackage.xo1.adDC3e2L;
        xk0Var.EXtogiMhuM(32, zo1Var6);
        defpackage.zo1 zo1Var7 = defpackage.xo1.riuEU0zW4;
        xk0Var.EXtogiMhuM(64, zo1Var7);
        defpackage.zo1 zo1Var8 = defpackage.xo1.r1MBDhnF;
        xk0Var.EXtogiMhuM(128, zo1Var8);
        IHQe1A4L2xu = xk0Var;
        oh6vYeIP = new defpackage.yo1[]{zo1Var, zo1Var2, zo1Var3, zo1Var7, zo1Var5, zo1Var6, zo1Var4, defpackage.xo1.SH1y5HwkJhh, zo1Var8};
    }

    public static final void IHQe1A4L2xu(defpackage.wf0 wf0Var, defpackage.e60 e60Var, long j, int i, int i2) {
        if (defpackage.l80.JlrlGoKF(j, -1L)) {
            return;
        }
        wf0Var.IHQe1A4L2xu(e60Var.oh6vYeIP(), (int) ((j >>> 48) & 65535));
        wf0Var.IHQe1A4L2xu(e60Var.F7NU4MC0GW(), (int) ((j >>> 32) & 65535));
        wf0Var.IHQe1A4L2xu(e60Var.r1MBDhnF(), i - ((int) ((j >>> 16) & 65535)));
        wf0Var.IHQe1A4L2xu(e60Var.IHQe1A4L2xu(), i2 - ((int) (j & 65535)));
    }
}
