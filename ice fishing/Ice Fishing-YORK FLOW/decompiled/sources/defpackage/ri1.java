package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ri1 implements defpackage.hp, defpackage.kl {
    public final /* synthetic */ defpackage.si1 GE9mJIPrb8gP;
    public defpackage.dd QiMR8OkAhezm;
    public final /* synthetic */ defpackage.si1 WDYagTQQm9ns;
    public final defpackage.dd oh71FJcDz6S2;
    public defpackage.wz0 P05cfTpS5W5L = defpackage.wz0.oh71FJcDz6S2;
    public final defpackage.xu e6mdH7fiFuta = defpackage.xu.WDYagTQQm9ns;

    public ri1(defpackage.si1 si1Var, defpackage.dd ddVar) {
        this.GE9mJIPrb8gP = si1Var;
        this.WDYagTQQm9ns = si1Var;
        this.oh71FJcDz6S2 = ddVar;
    }

    @Override // defpackage.hp
    public final float BXaznwstz2U0(long j) {
        return this.WDYagTQQm9ns.BXaznwstz2U0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Ns0WNyEWdPsk(long j, defpackage.c20 c20Var, defpackage.ll llVar) {
        defpackage.qi1 qi1Var;
        int i;
        try {
            if (llVar instanceof defpackage.qi1) {
                qi1Var = (defpackage.qi1) llVar;
                int i2 = qi1Var.GE9mJIPrb8gP;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    qi1Var.GE9mJIPrb8gP = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = qi1Var.P05cfTpS5W5L;
                    i = qi1Var.GE9mJIPrb8gP;
                    if (i == 0) {
                        if (i == 1) {
                            defpackage.b80.KrtOTfE6jiS2(obj);
                            return obj;
                        }
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    qi1Var.GE9mJIPrb8gP = 1;
                    java.lang.Object QiMR8OkAhezm = QiMR8OkAhezm(j, c20Var, qi1Var);
                    java.lang.Object obj2 = defpackage.tm.WDYagTQQm9ns;
                    return QiMR8OkAhezm == obj2 ? obj2 : QiMR8OkAhezm;
                }
            }
            if (i == 0) {
            }
        } catch (defpackage.xz0 unused) {
            return null;
        }
        qi1Var = new defpackage.qi1(this, llVar);
        java.lang.Object obj3 = qi1Var.P05cfTpS5W5L;
        i = qi1Var.GE9mJIPrb8gP;
    }

    @Override // defpackage.hp
    public final int OVwOqzUGHcCU(float f) {
        return this.WDYagTQQm9ns.OVwOqzUGHcCU(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object QiMR8OkAhezm(long j, defpackage.c20 c20Var, defpackage.ll llVar) {
        defpackage.pi1 pi1Var;
        int i;
        java.lang.Throwable th;
        defpackage.yf1 yf1Var;
        defpackage.dd ddVar;
        if (llVar instanceof defpackage.pi1) {
            pi1Var = (defpackage.pi1) llVar;
            int i2 = pi1Var.Ns0WNyEWdPsk;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pi1Var.Ns0WNyEWdPsk = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = pi1Var.e6mdH7fiFuta;
                i = pi1Var.Ns0WNyEWdPsk;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    if (j <= 0 && (ddVar = this.QiMR8OkAhezm) != null) {
                        ddVar.e6mdH7fiFuta(new defpackage.g51(new defpackage.xz0(j)));
                    }
                    defpackage.yf1 zJPqDeoF0Os1 = defpackage.ok0.zJPqDeoF0Os1(this.GE9mJIPrb8gP.XuMcJunjB8iA(), null, new defpackage.bb1(j, this, (defpackage.kl) null), 3);
                    try {
                        pi1Var.P05cfTpS5W5L = zJPqDeoF0Os1;
                        pi1Var.Ns0WNyEWdPsk = 1;
                        obj = c20Var.QiMR8OkAhezm(this, pi1Var);
                        java.lang.Object obj2 = defpackage.tm.WDYagTQQm9ns;
                        if (obj == obj2) {
                            return obj2;
                        }
                        yf1Var = zJPqDeoF0Os1;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        yf1Var = zJPqDeoF0Os1;
                        yf1Var.JhCgjQRTAOCT(defpackage.ad.oh71FJcDz6S2);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yf1Var = pi1Var.P05cfTpS5W5L;
                    try {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        yf1Var.JhCgjQRTAOCT(defpackage.ad.oh71FJcDz6S2);
                        throw th;
                    }
                }
                yf1Var.JhCgjQRTAOCT(defpackage.ad.oh71FJcDz6S2);
                return obj;
            }
        }
        pi1Var = new defpackage.pi1(this, llVar);
        java.lang.Object obj3 = pi1Var.e6mdH7fiFuta;
        i = pi1Var.Ns0WNyEWdPsk;
        if (i != 0) {
        }
        yf1Var.JhCgjQRTAOCT(defpackage.ad.oh71FJcDz6S2);
        return obj3;
    }

    @Override // defpackage.hp
    public final long ULjnV488Y6RO(float f) {
        return this.WDYagTQQm9ns.ULjnV488Y6RO(f);
    }

    @Override // defpackage.hp
    public final long VFeft99leXEK(float f) {
        return this.WDYagTQQm9ns.VFeft99leXEK(f);
    }

    public final defpackage.cu1 WDYagTQQm9ns() {
        return defpackage.la0.UmgHb6n58gfG(this.GE9mJIPrb8gP).qjMheFZ0l9kA;
    }

    public final java.lang.Object ZpBGe2uQfcn8(defpackage.wz0 wz0Var, defpackage.m9 m9Var) {
        defpackage.dd ddVar = new defpackage.dd(1, defpackage.q70.OcTWLQzke1i2(m9Var));
        ddVar.IJ0hOnjhPOri();
        this.P05cfTpS5W5L = wz0Var;
        this.QiMR8OkAhezm = ddVar;
        return ddVar.w7APNrr0aGRc();
    }

    @Override // defpackage.hp
    public final float a6r05ZxsOP0A(float f) {
        return f / this.WDYagTQQm9ns.giKS3J6vZuNy();
    }

    @Override // defpackage.hp
    public final float dG7RjM6DqYVL(float f) {
        return this.WDYagTQQm9ns.giKS3J6vZuNy() * f;
    }

    @Override // defpackage.kl
    public final void e6mdH7fiFuta(java.lang.Object obj) {
        defpackage.si1 si1Var = this.GE9mJIPrb8gP;
        synchronized (si1Var.oCu53ZX2v4Ju) {
            si1Var.VFeft99leXEK.GE9mJIPrb8gP(this);
        }
        this.oh71FJcDz6S2.e6mdH7fiFuta(obj);
    }

    public final long fWTAfUmVKrZq() {
        defpackage.si1 si1Var = this.GE9mJIPrb8gP;
        long fhbmYuu9J3cT = si1Var.fhbmYuu9J3cT(defpackage.la0.UmgHb6n58gfG(si1Var).qjMheFZ0l9kA.QiMR8OkAhezm());
        long j = si1Var.blKFvluuDQOf;
        float max = java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (fhbmYuu9J3cT >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (fhbmYuu9J3cT & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (java.lang.Float.floatToRawIntBits(max) << 32) | (java.lang.Float.floatToRawIntBits(max2) & 4294967295L);
    }

    @Override // defpackage.hp
    public final long fhbmYuu9J3cT(long j) {
        return this.WDYagTQQm9ns.fhbmYuu9J3cT(j);
    }

    @Override // defpackage.hp
    public final float giKS3J6vZuNy() {
        return this.WDYagTQQm9ns.giKS3J6vZuNy();
    }

    @Override // defpackage.hp
    public final float h3m55N1URyyK() {
        return this.WDYagTQQm9ns.h3m55N1URyyK();
    }

    @Override // defpackage.hp
    public final long oCu53ZX2v4Ju(long j) {
        return this.WDYagTQQm9ns.oCu53ZX2v4Ju(j);
    }

    @Override // defpackage.kl
    public final defpackage.jm oh71FJcDz6S2() {
        return this.e6mdH7fiFuta;
    }

    @Override // defpackage.hp
    public final float omM9cAlgeGXx(long j) {
        return this.WDYagTQQm9ns.omM9cAlgeGXx(j);
    }

    @Override // defpackage.hp
    public final float pf0OXpZQoaz3(int i) {
        return this.WDYagTQQm9ns.pf0OXpZQoaz3(i);
    }
}
