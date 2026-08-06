package defpackage;

/* loaded from: classes.dex */
public final class w3 {
    public final defpackage.i5 AARZUJiTa;
    public final defpackage.i5 EXtogiMhuM;
    public final defpackage.qt0 F7NU4MC0GW;
    public final defpackage.F7NU4MC0GW IHQe1A4L2xu;
    public final defpackage.i5 SH1y5HwkJhh;
    public final defpackage.qt0 adDC3e2L;
    public final java.lang.Object oh6vYeIP;
    public final defpackage.d5 r1MBDhnF;
    public final defpackage.i5 riuEU0zW4;
    public final defpackage.hm0 xiZrDbcSW0;

    public w3(java.lang.Object obj, defpackage.F7NU4MC0GW f7nu4mc0gw, java.lang.Object obj2) {
        this.IHQe1A4L2xu = f7nu4mc0gw;
        this.oh6vYeIP = obj2;
        defpackage.d5 d5Var = new defpackage.d5(f7nu4mc0gw, obj, null, 60);
        this.r1MBDhnF = d5Var;
        this.F7NU4MC0GW = defpackage.c80.nBH8hAHy(java.lang.Boolean.FALSE);
        this.adDC3e2L = defpackage.c80.nBH8hAHy(obj);
        this.xiZrDbcSW0 = new defpackage.hm0();
        new defpackage.ub1(1.0f, 1500.0f, obj2);
        defpackage.i5 i5Var = d5Var.AARZUJiTa;
        boolean z = i5Var instanceof defpackage.e5;
        defpackage.i5 i5Var2 = z ? defpackage.w70.adDC3e2L : i5Var instanceof defpackage.f5 ? defpackage.w70.xiZrDbcSW0 : i5Var instanceof defpackage.g5 ? defpackage.w70.AARZUJiTa : defpackage.w70.EXtogiMhuM;
        this.AARZUJiTa = i5Var2;
        defpackage.i5 i5Var3 = z ? defpackage.w70.IHQe1A4L2xu : i5Var instanceof defpackage.f5 ? defpackage.w70.oh6vYeIP : i5Var instanceof defpackage.g5 ? defpackage.w70.r1MBDhnF : defpackage.w70.F7NU4MC0GW;
        this.EXtogiMhuM = i5Var3;
        this.riuEU0zW4 = i5Var2;
        this.SH1y5HwkJhh = i5Var3;
    }

    public static final java.lang.Object IHQe1A4L2xu(defpackage.w3 w3Var, java.lang.Object obj) {
        defpackage.F7NU4MC0GW f7nu4mc0gw = w3Var.IHQe1A4L2xu;
        defpackage.i5 i5Var = w3Var.SH1y5HwkJhh;
        defpackage.i5 i5Var2 = w3Var.riuEU0zW4;
        if (!defpackage.x70.QoRHpC4k(i5Var2, w3Var.AARZUJiTa) || !defpackage.x70.QoRHpC4k(i5Var, w3Var.EXtogiMhuM)) {
            defpackage.i5 i5Var3 = (defpackage.i5) ((defpackage.g00) f7nu4mc0gw.xiZrDbcSW0).AARZUJiTa(obj);
            int oh6vYeIP = i5Var3.oh6vYeIP();
            boolean z = false;
            for (int i = 0; i < oh6vYeIP; i++) {
                if (i5Var3.IHQe1A4L2xu(i) < i5Var2.IHQe1A4L2xu(i) || i5Var3.IHQe1A4L2xu(i) > i5Var.IHQe1A4L2xu(i)) {
                    i5Var3.adDC3e2L(defpackage.x80.ez2rX8ReCYw(i5Var3.IHQe1A4L2xu(i), i5Var2.IHQe1A4L2xu(i), i5Var.IHQe1A4L2xu(i)), i);
                    z = true;
                }
            }
            if (z) {
                return ((defpackage.g00) f7nu4mc0gw.AARZUJiTa).AARZUJiTa(i5Var3);
            }
        }
        return obj;
    }

    public static final void oh6vYeIP(defpackage.w3 w3Var) {
        defpackage.d5 d5Var = w3Var.r1MBDhnF;
        d5Var.AARZUJiTa.F7NU4MC0GW();
        d5Var.EXtogiMhuM = Long.MIN_VALUE;
        w3Var.F7NU4MC0GW.setValue(java.lang.Boolean.FALSE);
    }

    public static java.lang.Object r1MBDhnF(defpackage.w3 w3Var, java.lang.Object obj, defpackage.c5 c5Var, defpackage.g00 g00Var, defpackage.ce1 ce1Var, int i) {
        java.lang.Object AARZUJiTa = ((defpackage.g00) w3Var.IHQe1A4L2xu.AARZUJiTa).AARZUJiTa(w3Var.r1MBDhnF.AARZUJiTa);
        defpackage.g00 g00Var2 = (i & 8) != 0 ? null : g00Var;
        java.lang.Object F7NU4MC0GW = w3Var.F7NU4MC0GW();
        defpackage.F7NU4MC0GW f7nu4mc0gw = w3Var.IHQe1A4L2xu;
        return defpackage.hm0.IHQe1A4L2xu(w3Var.xiZrDbcSW0, new defpackage.u3(w3Var, AARZUJiTa, new defpackage.ye1(c5Var, f7nu4mc0gw, F7NU4MC0GW, obj, (defpackage.i5) ((defpackage.g00) f7nu4mc0gw.xiZrDbcSW0).AARZUJiTa(AARZUJiTa)), w3Var.r1MBDhnF.EXtogiMhuM, g00Var2, null), ce1Var);
    }

    public final java.lang.Object F7NU4MC0GW() {
        return this.r1MBDhnF.xiZrDbcSW0.getValue();
    }

    public final java.lang.Object adDC3e2L(java.lang.Object obj, defpackage.ce1 ce1Var) {
        java.lang.Object IHQe1A4L2xu = defpackage.hm0.IHQe1A4L2xu(this.xiZrDbcSW0, new defpackage.v3(this, obj, null), ce1Var);
        return IHQe1A4L2xu == defpackage.vj.adDC3e2L ? IHQe1A4L2xu : defpackage.ok1.IHQe1A4L2xu;
    }

    public /* synthetic */ w3(java.lang.Object obj, defpackage.F7NU4MC0GW f7nu4mc0gw, java.lang.Float f, int i) {
        this(obj, f7nu4mc0gw, (i & 4) != 0 ? null : f);
    }
}
