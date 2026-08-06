package defpackage;

/* loaded from: classes.dex */
public abstract class eo1 {
    public final android.graphics.Rect[][] F7NU4MC0GW;
    public final defpackage.ro1 IHQe1A4L2xu;
    public defpackage.i60[] oh6vYeIP;
    public final android.graphics.Rect[][] r1MBDhnF;

    public eo1(defpackage.ro1 ro1Var) {
        this.r1MBDhnF = new android.graphics.Rect[10][];
        this.F7NU4MC0GW = new android.graphics.Rect[10][];
        this.IHQe1A4L2xu = ro1Var;
        r1MBDhnF(ro1Var);
    }

    public abstract void EXtogiMhuM(defpackage.i60 i60Var);

    public void F7NU4MC0GW(int i, defpackage.i60 i60Var) {
        if (this.oh6vYeIP == null) {
            this.oh6vYeIP = new defpackage.i60[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.oh6vYeIP[defpackage.c80.fnWB2E7cs(i2)] = i60Var;
            }
        }
    }

    public final void IHQe1A4L2xu() {
        defpackage.i60[] i60VarArr = this.oh6vYeIP;
        if (i60VarArr != null) {
            defpackage.i60 i60Var = i60VarArr[0];
            defpackage.i60 i60Var2 = i60VarArr[1];
            defpackage.ro1 ro1Var = this.IHQe1A4L2xu;
            if (i60Var2 == null) {
                i60Var2 = ro1Var.IHQe1A4L2xu.EXtogiMhuM(2);
            }
            if (i60Var == null) {
                i60Var = ro1Var.IHQe1A4L2xu.EXtogiMhuM(1);
            }
            EXtogiMhuM(defpackage.i60.IHQe1A4L2xu(i60Var, i60Var2));
            defpackage.i60 i60Var3 = this.oh6vYeIP[defpackage.c80.fnWB2E7cs(16)];
            if (i60Var3 != null) {
                AARZUJiTa(i60Var3);
            }
            defpackage.i60 i60Var4 = this.oh6vYeIP[defpackage.c80.fnWB2E7cs(32)];
            if (i60Var4 != null) {
                adDC3e2L(i60Var4);
            }
            defpackage.i60 i60Var5 = this.oh6vYeIP[defpackage.c80.fnWB2E7cs(64)];
            if (i60Var5 != null) {
                riuEU0zW4(i60Var5);
            }
        }
    }

    public abstract defpackage.ro1 oh6vYeIP();

    public void r1MBDhnF(defpackage.ro1 ro1Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            java.util.List<android.graphics.Rect> adDC3e2L = ro1Var.IHQe1A4L2xu.adDC3e2L(i);
            int fnWB2E7cs = defpackage.c80.fnWB2E7cs(i);
            this.r1MBDhnF[fnWB2E7cs] = (android.graphics.Rect[]) adDC3e2L.toArray(new android.graphics.Rect[adDC3e2L.size()]);
            if (i != 8) {
                java.util.List<android.graphics.Rect> xiZrDbcSW0 = ro1Var.IHQe1A4L2xu.xiZrDbcSW0(i);
                this.F7NU4MC0GW[fnWB2E7cs] = (android.graphics.Rect[]) xiZrDbcSW0.toArray(new android.graphics.Rect[xiZrDbcSW0.size()]);
            }
        }
    }

    public abstract void xiZrDbcSW0(defpackage.i60 i60Var);

    public eo1() {
        this(new defpackage.ro1());
    }

    public void AARZUJiTa(defpackage.i60 i60Var) {
    }

    public void adDC3e2L(defpackage.i60 i60Var) {
    }

    public void riuEU0zW4(defpackage.i60 i60Var) {
    }
}
