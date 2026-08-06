package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bd1 {
    public static final n3 EljAMC1QTz = new n3(0.0f);
    public final td1 GWasM1elztuh;
    public float OOA6hdeuvCS;
    public boolean xqGvceK5x;
    public long Yi7zF1RB1 = Long.MIN_VALUE;
    public n3 X1lG3V04pd = EljAMC1QTz;

    public bd1(l3 l3Var) {
        this.GWasM1elztuh = l3Var.GWasM1elztuh(vc0.mOu10nynGul);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (r13 != 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        if (defpackage.o50.jivtDDk9H(r0).X1lG3V04pd(r8, r3) == r12) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r14v7, types: [hv] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a6 -> B:23:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object GWasM1elztuh(d2 d2Var, t5 t5Var, wg wgVar) {
        ad1 ad1Var;
        int i;
        n3 n3Var;
        float f;
        ad1 ad1Var2;
        d2 d2Var2;
        wu wuVar;
        try {
            if (wgVar instanceof ad1) {
                ad1Var = (ad1) wgVar;
                int i2 = ad1Var.XnEVoBF0td1l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ad1Var.XnEVoBF0td1l = i2 - Integer.MIN_VALUE;
                    Object obj = ad1Var.rQPn8YBR;
                    i = ad1Var.XnEVoBF0td1l;
                    n3Var = EljAMC1QTz;
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (i != 0) {
                        o50.A1EKNP6CxJ(obj);
                        if (this.xqGvceK5x) {
                            w10.X1lG3V04pd("animateToZero called while previous animation is running");
                        }
                        gh ghVar = ad1Var.EljAMC1QTz;
                        ghVar.getClass();
                        pe0 pe0Var = (pe0) ghVar.E7jCp8Ls(b9xEq24R1.YXi2hvwn7WL);
                        float Y6hRI1cF8 = pe0Var != null ? pe0Var.Y6hRI1cF8() : 1.0f;
                        this.xqGvceK5x = true;
                        f = Y6hRI1cF8;
                        ad1Var2 = ad1Var;
                        d2Var2 = d2Var;
                        wuVar = t5Var;
                        if (Math.abs(this.OOA6hdeuvCS) >= 0.01f) {
                            m91 m91Var = new m91(this, f, d2Var2);
                            ad1Var2.encWxUiV2 = d2Var2;
                            ad1Var2.mOu10nynGul = wuVar;
                            ad1Var2.JFJ3QoxA = f;
                            ad1Var2.XnEVoBF0td1l = 1;
                            gh ghVar2 = ad1Var2.EljAMC1QTz;
                            ghVar2.getClass();
                            if (o50.jivtDDk9H(ghVar2).X1lG3V04pd(m91Var, ad1Var2) == qhVar) {
                                return qhVar;
                            }
                            wuVar.GWasM1elztuh();
                        } else {
                            if (Math.abs(this.OOA6hdeuvCS) == 0.0f) {
                                this.Yi7zF1RB1 = Long.MIN_VALUE;
                                this.X1lG3V04pd = n3Var;
                                this.xqGvceK5x = false;
                                return kc1.GWasM1elztuh;
                            }
                            zc1 zc1Var = new zc1(0, this, d2Var2);
                            ad1Var2.encWxUiV2 = wuVar;
                            ad1Var2.mOu10nynGul = null;
                            ad1Var2.XnEVoBF0td1l = 2;
                            gh ghVar3 = ad1Var2.EljAMC1QTz;
                            ghVar3.getClass();
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            wuVar = (wu) ad1Var.encWxUiV2;
                            o50.A1EKNP6CxJ(obj);
                            wuVar.GWasM1elztuh();
                            this.Yi7zF1RB1 = Long.MIN_VALUE;
                            this.X1lG3V04pd = n3Var;
                            this.xqGvceK5x = false;
                            return kc1.GWasM1elztuh;
                        }
                        float f2 = ad1Var.JFJ3QoxA;
                        wu wuVar2 = ad1Var.mOu10nynGul;
                        ?? r14 = (hv) ad1Var.encWxUiV2;
                        o50.A1EKNP6CxJ(obj);
                        ad1Var2 = ad1Var;
                        wuVar = wuVar2;
                        f = f2;
                        d2Var2 = r14;
                        wuVar.GWasM1elztuh();
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.Yi7zF1RB1 = Long.MIN_VALUE;
            this.X1lG3V04pd = n3Var;
            this.xqGvceK5x = false;
            throw th;
        }
        ad1Var = new ad1(this, wgVar);
        Object obj2 = ad1Var.rQPn8YBR;
        i = ad1Var.XnEVoBF0td1l;
        n3Var = EljAMC1QTz;
        qh qhVar2 = qh.OOA6hdeuvCS;
    }
}
