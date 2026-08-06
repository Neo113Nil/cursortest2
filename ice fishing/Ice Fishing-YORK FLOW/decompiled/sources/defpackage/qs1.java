package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qs1 {
    public static final defpackage.c6 oh71FJcDz6S2 = new defpackage.c6(0.0f);
    public boolean JhCgjQRTAOCT;
    public float WDYagTQQm9ns;
    public final defpackage.ft1 ZpBGe2uQfcn8;
    public long giKS3J6vZuNy = Long.MIN_VALUE;
    public defpackage.c6 fWTAfUmVKrZq = oh71FJcDz6S2;

    public qs1(defpackage.a6 a6Var) {
        this.ZpBGe2uQfcn8 = a6Var.ZpBGe2uQfcn8(defpackage.nn.ZVVdXbWmyCSK);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (r13 != 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        if (defpackage.j80.VFeft99leXEK(r0).ZpBGe2uQfcn8(r3, r8) == r12) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r14v7, types: [y10] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a6 -> B:23:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object ZpBGe2uQfcn8(defpackage.eSwlWMUpitz8 eswlwmupitz8, defpackage.v8 v8Var, defpackage.ll llVar) {
        defpackage.ps1 ps1Var;
        int i;
        defpackage.c6 c6Var;
        float f;
        defpackage.ps1 ps1Var2;
        defpackage.eSwlWMUpitz8 eswlwmupitz82;
        defpackage.n10 n10Var;
        try {
            if (llVar instanceof defpackage.ps1) {
                ps1Var = (defpackage.ps1) llVar;
                int i2 = ps1Var.h3m55N1URyyK;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ps1Var.h3m55N1URyyK = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = ps1Var.Ns0WNyEWdPsk;
                    i = ps1Var.h3m55N1URyyK;
                    c6Var = oh71FJcDz6S2;
                    defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (i != 0) {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        if (this.JhCgjQRTAOCT) {
                            defpackage.h80.fWTAfUmVKrZq("animateToZero called while previous animation is running");
                        }
                        defpackage.jm jmVar = ps1Var.oh71FJcDz6S2;
                        jmVar.getClass();
                        defpackage.cm0 cm0Var = (defpackage.cm0) jmVar.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.CZa7MwI9IzLd);
                        float maCixPsq4ml2 = cm0Var != null ? cm0Var.maCixPsq4ml2() : 1.0f;
                        this.JhCgjQRTAOCT = true;
                        f = maCixPsq4ml2;
                        ps1Var2 = ps1Var;
                        eswlwmupitz82 = eswlwmupitz8;
                        n10Var = v8Var;
                        if (java.lang.Math.abs(this.WDYagTQQm9ns) >= 0.01f) {
                            defpackage.u0 u0Var = new defpackage.u0(this, f, eswlwmupitz82);
                            ps1Var2.P05cfTpS5W5L = eswlwmupitz82;
                            ps1Var2.e6mdH7fiFuta = n10Var;
                            ps1Var2.GE9mJIPrb8gP = f;
                            ps1Var2.h3m55N1URyyK = 1;
                            defpackage.jm jmVar2 = ps1Var2.oh71FJcDz6S2;
                            jmVar2.getClass();
                            if (defpackage.j80.VFeft99leXEK(jmVar2).ZpBGe2uQfcn8(ps1Var2, u0Var) == tmVar) {
                                return tmVar;
                            }
                            n10Var.ZpBGe2uQfcn8();
                        } else {
                            if (java.lang.Math.abs(this.WDYagTQQm9ns) == 0.0f) {
                                this.giKS3J6vZuNy = Long.MIN_VALUE;
                                this.fWTAfUmVKrZq = c6Var;
                                this.JhCgjQRTAOCT = false;
                                return defpackage.gs1.ZpBGe2uQfcn8;
                            }
                            defpackage.m91 m91Var = new defpackage.m91(12, this, eswlwmupitz82);
                            ps1Var2.P05cfTpS5W5L = n10Var;
                            ps1Var2.e6mdH7fiFuta = null;
                            ps1Var2.h3m55N1URyyK = 2;
                            defpackage.jm jmVar3 = ps1Var2.oh71FJcDz6S2;
                            jmVar3.getClass();
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            n10Var = (defpackage.n10) ps1Var.P05cfTpS5W5L;
                            defpackage.b80.KrtOTfE6jiS2(obj);
                            n10Var.ZpBGe2uQfcn8();
                            this.giKS3J6vZuNy = Long.MIN_VALUE;
                            this.fWTAfUmVKrZq = c6Var;
                            this.JhCgjQRTAOCT = false;
                            return defpackage.gs1.ZpBGe2uQfcn8;
                        }
                        float f2 = ps1Var.GE9mJIPrb8gP;
                        defpackage.n10 n10Var2 = ps1Var.e6mdH7fiFuta;
                        ?? r14 = (defpackage.y10) ps1Var.P05cfTpS5W5L;
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        ps1Var2 = ps1Var;
                        n10Var = n10Var2;
                        f = f2;
                        eswlwmupitz82 = r14;
                        n10Var.ZpBGe2uQfcn8();
                    }
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th) {
            this.giKS3J6vZuNy = Long.MIN_VALUE;
            this.fWTAfUmVKrZq = c6Var;
            this.JhCgjQRTAOCT = false;
            throw th;
        }
        ps1Var = new defpackage.ps1(this, llVar);
        java.lang.Object obj2 = ps1Var.Ns0WNyEWdPsk;
        i = ps1Var.h3m55N1URyyK;
        c6Var = oh71FJcDz6S2;
        defpackage.tm tmVar2 = defpackage.tm.WDYagTQQm9ns;
    }
}
