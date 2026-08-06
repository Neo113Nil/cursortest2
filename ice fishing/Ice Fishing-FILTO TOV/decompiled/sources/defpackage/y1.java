package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class y1 implements eh {
    public final Object AvO7iQsrTN;
    public final Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public y1(bt0 bt0Var) {
        this.OOA6hdeuvCS = 1;
        this.EljAMC1QTz = bt0Var;
        this.AvO7iQsrTN = new v5(0);
    }

    @Override // defpackage.gh
    public final eh E7jCp8Ls(fh fhVar) {
        switch (this.OOA6hdeuvCS) {
        }
        return n30.arNh8D4Z5gB(this, fhVar);
    }

    @Override // defpackage.gh
    public final Object WIEu4Ya2g8(lv lvVar, Object obj) {
        switch (this.OOA6hdeuvCS) {
        }
        return lvVar.EljAMC1QTz(obj, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object X1lG3V04pd(hv hvVar, wg wgVar) {
        wo0 wo0Var;
        qh qhVar;
        int i;
        boolean z;
        Object jivtDDk9H;
        Object X1lG3V04pd;
        int i2 = 0;
        int i3 = 1;
        switch (this.OOA6hdeuvCS) {
            case 0:
                v1 v1Var = (v1) this.AvO7iQsrTN;
                n9 n9Var = new n9(1, rj0.M3K9sHhK(wgVar));
                n9Var.cilMamHF();
                x1 x1Var = new x1(n9Var, this, hvVar);
                if (o30.rQPn8YBR(v1Var.AvO7iQsrTN, (Choreographer) this.EljAMC1QTz)) {
                    synchronized (v1Var.mOu10nynGul) {
                        v1Var.rQPn8YBR.add(x1Var);
                        if (!v1Var.uFEq9NpZ) {
                            v1Var.uFEq9NpZ = true;
                            v1Var.AvO7iQsrTN.postFrameCallback(v1Var.iwATDS1i01k);
                        }
                    }
                    n9Var.WdrkLMV3xh(new w1(i2, v1Var, x1Var));
                } else {
                    ((Choreographer) this.EljAMC1QTz).postFrameCallback(x1Var);
                    n9Var.WdrkLMV3xh(new w1(i3, this, x1Var));
                }
                return n9Var.jivtDDk9H();
            case 1:
                n9 n9Var2 = new n9(1, rj0.M3K9sHhK(wgVar));
                n9Var2.cilMamHF();
                v5 v5Var = (v5) this.AvO7iQsrTN;
                h8 h8Var = new h8();
                h8Var.GWasM1elztuh = n9Var2;
                h8Var.Yi7zF1RB1 = hvVar;
                n9Var2.WdrkLMV3xh(new i8(i2, v5Var.xqGvceK5x(h8Var, (bt0) this.EljAMC1QTz)));
                return n9Var2.jivtDDk9H();
            default:
                if (wgVar instanceof wo0) {
                    wo0Var = (wo0) wgVar;
                    int i4 = wo0Var.rQPn8YBR;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        wo0Var.rQPn8YBR = i4 - Integer.MIN_VALUE;
                        Object obj = wo0Var.mOu10nynGul;
                        qhVar = qh.OOA6hdeuvCS;
                        i = wo0Var.rQPn8YBR;
                        if (i != 0) {
                            o50.A1EKNP6CxJ(obj);
                            i50 i50Var = (i50) this.AvO7iQsrTN;
                            wo0Var.encWxUiV2 = hvVar;
                            wo0Var.rQPn8YBR = 1;
                            synchronized (i50Var.Yi7zF1RB1) {
                                z = i50Var.GWasM1elztuh;
                            }
                            if (!z) {
                                n9 n9Var3 = new n9(1, rj0.M3K9sHhK(wo0Var));
                                n9Var3.cilMamHF();
                                synchronized (i50Var.Yi7zF1RB1) {
                                    ((ArrayList) i50Var.X1lG3V04pd).add(n9Var3);
                                }
                                n9Var3.WdrkLMV3xh(new iy(i3, i50Var, n9Var3));
                                jivtDDk9H = n9Var3.jivtDDk9H();
                                if (jivtDDk9H != qhVar) {
                                    jivtDDk9H = kc1.GWasM1elztuh;
                                    break;
                                }
                            } else {
                                jivtDDk9H = kc1.GWasM1elztuh;
                                break;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    o50.A1EKNP6CxJ(obj);
                                    return obj;
                                }
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hvVar = wo0Var.encWxUiV2;
                            o50.A1EKNP6CxJ(obj);
                        }
                        y1 y1Var = (y1) this.EljAMC1QTz;
                        wo0Var.encWxUiV2 = null;
                        wo0Var.rQPn8YBR = 2;
                        X1lG3V04pd = y1Var.X1lG3V04pd(hvVar, wo0Var);
                        if (X1lG3V04pd != qhVar) {
                            return X1lG3V04pd;
                        }
                        return qhVar;
                    }
                }
                wo0Var = new wo0(this, wgVar);
                Object obj2 = wo0Var.mOu10nynGul;
                qhVar = qh.OOA6hdeuvCS;
                i = wo0Var.rQPn8YBR;
                if (i != 0) {
                }
                y1 y1Var2 = (y1) this.EljAMC1QTz;
                wo0Var.encWxUiV2 = null;
                wo0Var.rQPn8YBR = 2;
                X1lG3V04pd = y1Var2.X1lG3V04pd(hvVar, wo0Var);
                if (X1lG3V04pd != qhVar) {
                }
                return qhVar;
        }
    }

    @Override // defpackage.eh
    public fh getKey() {
        return b9xEq24R1.z19UFEN2I;
    }

    @Override // defpackage.gh
    public final gh jivtDDk9H(fh fhVar) {
        switch (this.OOA6hdeuvCS) {
        }
        return n30.DmJncFq5(this, fhVar);
    }

    @Override // defpackage.gh
    public final gh mOu10nynGul(gh ghVar) {
        switch (this.OOA6hdeuvCS) {
        }
        return n30.HFYAaqMd6(this, ghVar);
    }

    public y1(y1 y1Var) {
        this.OOA6hdeuvCS = 2;
        this.EljAMC1QTz = y1Var;
        this.AvO7iQsrTN = new i50();
    }

    public y1(Choreographer choreographer, v1 v1Var) {
        this.OOA6hdeuvCS = 0;
        this.EljAMC1QTz = choreographer;
        this.AvO7iQsrTN = v1Var;
    }
}
