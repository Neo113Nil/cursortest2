package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class r21 {
    public final bh0 GWasM1elztuh = new bh0();
    public final j6IIN2O8eOU Yi7zF1RB1 = new j6IIN2O8eOU(4);
    public final si X1lG3V04pd = new si(2, new s1(2, null, 2));

    public r21(String str) {
    }

    public final Integer GWasM1elztuh() {
        return new Integer(((AtomicInteger) this.Yi7zF1RB1.EljAMC1QTz).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object X1lG3V04pd(lv lvVar, wg wgVar) {
        q21 q21Var;
        int i;
        bh0 bh0Var;
        boolean z;
        Throwable th;
        if (wgVar instanceof q21) {
            q21Var = (q21) wgVar;
            int i2 = q21Var.E7jCp8Ls;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q21Var.E7jCp8Ls = i2 - Integer.MIN_VALUE;
                Object obj = q21Var.JFJ3QoxA;
                i = q21Var.E7jCp8Ls;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    bh0 bh0Var2 = this.GWasM1elztuh;
                    boolean OOA6hdeuvCS = bh0Var2.OOA6hdeuvCS();
                    try {
                        Object valueOf = Boolean.valueOf(OOA6hdeuvCS);
                        q21Var.encWxUiV2 = bh0Var2;
                        q21Var.mOu10nynGul = OOA6hdeuvCS;
                        q21Var.E7jCp8Ls = 1;
                        Object EljAMC1QTz = lvVar.EljAMC1QTz(valueOf, q21Var);
                        Object obj2 = qh.OOA6hdeuvCS;
                        if (EljAMC1QTz == obj2) {
                            return obj2;
                        }
                        bh0Var = bh0Var2;
                        z = OOA6hdeuvCS;
                        obj = EljAMC1QTz;
                    } catch (Throwable th2) {
                        bh0Var = bh0Var2;
                        z = OOA6hdeuvCS;
                        th = th2;
                        if (z) {
                            bh0Var.AvO7iQsrTN(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = q21Var.mOu10nynGul;
                    bh0Var = q21Var.encWxUiV2;
                    try {
                        o50.A1EKNP6CxJ(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    bh0Var.AvO7iQsrTN(null);
                }
                return obj;
            }
        }
        q21Var = new q21(this, wgVar);
        Object obj3 = q21Var.JFJ3QoxA;
        i = q21Var.E7jCp8Ls;
        if (i != 0) {
        }
        if (z) {
        }
        return obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [bh0] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Yi7zF1RB1(hv hvVar, wg wgVar) {
        p21 p21Var;
        int i;
        bh0 bh0Var;
        try {
            if (wgVar instanceof p21) {
                p21Var = (p21) wgVar;
                int i2 = p21Var.E7jCp8Ls;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    p21Var.E7jCp8Ls = i2 - Integer.MIN_VALUE;
                    Object obj = p21Var.JFJ3QoxA;
                    i = p21Var.E7jCp8Ls;
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (i != 0) {
                        o50.A1EKNP6CxJ(obj);
                        p21Var.encWxUiV2 = hvVar;
                        bh0 bh0Var2 = this.GWasM1elztuh;
                        p21Var.mOu10nynGul = bh0Var2;
                        p21Var.E7jCp8Ls = 1;
                        Object xqGvceK5x = bh0Var2.xqGvceK5x(p21Var);
                        bh0Var = bh0Var2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            bh0 bh0Var3 = (bh0) p21Var.encWxUiV2;
                            o50.A1EKNP6CxJ(obj);
                            this = bh0Var3;
                            return obj;
                        }
                        bh0 bh0Var4 = p21Var.mOu10nynGul;
                        hvVar = (hv) p21Var.encWxUiV2;
                        o50.A1EKNP6CxJ(obj);
                        bh0Var = bh0Var4;
                    }
                    p21Var.encWxUiV2 = bh0Var;
                    p21Var.mOu10nynGul = null;
                    p21Var.E7jCp8Ls = 2;
                    obj = hvVar.mOu10nynGul(p21Var);
                    this = bh0Var;
                }
            }
            if (i != 0) {
            }
            p21Var.encWxUiV2 = bh0Var;
            p21Var.mOu10nynGul = null;
            p21Var.E7jCp8Ls = 2;
            obj = hvVar.mOu10nynGul(p21Var);
            this = bh0Var;
        } finally {
            this.AvO7iQsrTN(null);
        }
        p21Var = new p21(this, wgVar);
        Object obj2 = p21Var.JFJ3QoxA;
        i = p21Var.E7jCp8Ls;
        qh qhVar2 = qh.OOA6hdeuvCS;
    }
}
