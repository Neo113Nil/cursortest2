package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zt implements yt {
    public final k61 GWasM1elztuh;
    public final j6IIN2O8eOU OOA6hdeuvCS;
    public final d X1lG3V04pd;
    public final s0 Yi7zF1RB1;
    public final du xqGvceK5x;

    public zt(k61 k61Var, s0 s0Var) {
        d dVar = au.GWasM1elztuh;
        du duVar = new du();
        cu cuVar = du.GWasM1elztuh;
        dz dzVar = lm.GWasM1elztuh;
        cuVar.getClass();
        fb1.X1lG3V04pd(n30.HFYAaqMd6(cuVar, dzVar).mOu10nynGul(vp.OOA6hdeuvCS).mOu10nynGul(new u61(null)));
        j6IIN2O8eOU j6iin2o8eou = new j6IIN2O8eOU(20);
        this.GWasM1elztuh = k61Var;
        this.Yi7zF1RB1 = s0Var;
        this.X1lG3V04pd = dVar;
        this.xqGvceK5x = duVar;
        this.OOA6hdeuvCS = j6iin2o8eou;
        new E7jCp8Ls(4, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a A[Catch: Exception -> 0x00a2, TRY_ENTER, TryCatch #3 {Exception -> 0x00a2, blocks: (B:25:0x0040, B:27:0x0054, B:30:0x0059, B:32:0x005d, B:33:0x0072, B:48:0x009a, B:49:0x00a1, B:51:0x0064, B:52:0x0066, B:53:0x0069, B:54:0x006e), top: B:24:0x0040 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tb1 GWasM1elztuh(sb1 sb1Var) {
        Typeface E7jCp8Ls;
        Object remove;
        d dVar = this.X1lG3V04pd;
        synchronized (((x51) dVar.EljAMC1QTz)) {
            try {
                tb1 tb1Var = (tb1) ((bc0) dVar.AvO7iQsrTN).GWasM1elztuh(sb1Var);
                if (tb1Var != null) {
                    if (tb1Var.EljAMC1QTz) {
                        return tb1Var;
                    }
                    bc0 bc0Var = (bc0) dVar.AvO7iQsrTN;
                    synchronized (bc0Var.X1lG3V04pd) {
                        q10 q10Var = bc0Var.Yi7zF1RB1;
                        q10Var.getClass();
                        remove = q10Var.GWasM1elztuh.remove(sb1Var);
                        if (remove != null) {
                            bc0Var.xqGvceK5x--;
                        }
                    }
                }
                try {
                    this.xqGvceK5x.getClass();
                    o71 o71Var = sb1Var.GWasM1elztuh;
                    vt vtVar = (vt) this.OOA6hdeuvCS.EljAMC1QTz;
                    int i = sb1Var.X1lG3V04pd;
                    ou ouVar = sb1Var.Yi7zF1RB1;
                    tb1 tb1Var2 = null;
                    if (o71Var != null && !(o71Var instanceof gk)) {
                        if (o71Var instanceof dy) {
                            E7jCp8Ls = vtVar.uFEq9NpZ((dy) o71Var, ouVar, i);
                            tb1Var2 = new tb1(E7jCp8Ls);
                        }
                        if (tb1Var2 != null) {
                            throw new IllegalStateException("Could not load font");
                        }
                        synchronized (((x51) dVar.EljAMC1QTz)) {
                            if (((bc0) dVar.AvO7iQsrTN).GWasM1elztuh(sb1Var) == null && tb1Var2.EljAMC1QTz) {
                                ((bc0) dVar.AvO7iQsrTN).Yi7zF1RB1(sb1Var, tb1Var2);
                            }
                        }
                        return tb1Var2;
                    }
                    switch (vtVar.OOA6hdeuvCS) {
                        case 17:
                            E7jCp8Ls = vt.E7jCp8Ls(null, ouVar, i);
                            break;
                        default:
                            E7jCp8Ls = vt.XnEVoBF0td1l(null, ouVar, i);
                            break;
                    }
                    tb1Var2 = new tb1(E7jCp8Ls);
                    if (tb1Var2 != null) {
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final tb1 Yi7zF1RB1(o71 o71Var, ou ouVar, int i, int i2) {
        s0 s0Var = this.Yi7zF1RB1;
        s0Var.getClass();
        int i3 = s0Var.OOA6hdeuvCS;
        ou ouVar2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? ouVar : new ou(o50.encWxUiV2(ouVar.OOA6hdeuvCS + i3, 1, 1000));
        this.GWasM1elztuh.getClass();
        return GWasM1elztuh(new sb1(o71Var, ouVar2, i, i2, null));
    }
}
