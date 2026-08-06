package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jy0 {
    public final wy0 GWasM1elztuh;
    public boolean Yi7zF1RB1;

    public jy0(wy0 wy0Var, boolean z) {
        this.GWasM1elztuh = wy0Var;
        this.Yi7zF1RB1 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object GWasM1elztuh(long j, long j2, wg wgVar) {
        iy0 iy0Var;
        int i;
        long j3;
        if (wgVar instanceof iy0) {
            iy0Var = (iy0) wgVar;
            int i2 = iy0Var.rQPn8YBR;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iy0Var.rQPn8YBR = i2 - Integer.MIN_VALUE;
                Object obj = iy0Var.mOu10nynGul;
                i = iy0Var.rQPn8YBR;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    j3 = 0;
                    if (this.Yi7zF1RB1) {
                        wy0 wy0Var = this.GWasM1elztuh;
                        if (!wy0Var.mOu10nynGul) {
                            iy0Var.encWxUiV2 = j2;
                            iy0Var.rQPn8YBR = 1;
                            obj = wy0Var.GWasM1elztuh(j2, iy0Var);
                            qh qhVar = qh.OOA6hdeuvCS;
                            if (obj == qhVar) {
                                return qhVar;
                            }
                        }
                        j3 = yd1.xqGvceK5x(j2, j3);
                    }
                    return new yd1(j3);
                }
                if (i != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = iy0Var.encWxUiV2;
                o50.A1EKNP6CxJ(obj);
                j3 = ((yd1) obj).GWasM1elztuh;
                j3 = yd1.xqGvceK5x(j2, j3);
                return new yd1(j3);
            }
        }
        iy0Var = new iy0(this, wgVar);
        Object obj2 = iy0Var.mOu10nynGul;
        i = iy0Var.rQPn8YBR;
        if (i != 0) {
        }
        j3 = ((yd1) obj2).GWasM1elztuh;
        j3 = yd1.xqGvceK5x(j2, j3);
        return new yd1(j3);
    }
}
