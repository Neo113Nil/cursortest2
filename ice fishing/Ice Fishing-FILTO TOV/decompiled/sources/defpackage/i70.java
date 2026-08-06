package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class i70 extends he0 implements w50 {
    public static final g70 cilMamHF = new g70();
    public xm0 Y6hRI1cF8;
    public x7 jivtDDk9H;
    public h80 mE4lRynR;

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(j);
        return dd0Var.MjxSquD6Av(OOA6hdeuvCS.OOA6hdeuvCS, OOA6hdeuvCS.EljAMC1QTz, yp.OOA6hdeuvCS, new f5(OOA6hdeuvCS, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001b, code lost:
    
        if (r4.Y6hRI1cF8 == defpackage.xm0.OOA6hdeuvCS) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x000d, code lost:
    
        if (r4.Y6hRI1cF8 == defpackage.xm0.EljAMC1QTz) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean gqMuANyCes(e70 e70Var, int i) {
        if (i != 5 && i != 6) {
            if (i != 3 && i != 4) {
                if (i != 1 && i != 2) {
                    o4.jivtDDk9H("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
            }
            return !sb9fmtV8A(i) ? e70Var.GWasM1elztuh <= 0 : e70Var.Yi7zF1RB1 >= this.mE4lRynR.GWasM1elztuh.AvO7iQsrTN().uFEq9NpZ - 1;
        }
    }

    public final boolean sb9fmtV8A(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int ordinal = vc0.eUH21U3apd(this).k8h8IjolWQ.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            o4.xqGvceK5x();
            return false;
        }
        if (i != 4) {
            o4.jivtDDk9H("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int ordinal2 = vc0.eUH21U3apd(this).k8h8IjolWQ.ordinal();
        if (ordinal2 == 0) {
            return true;
        }
        if (ordinal2 == 1) {
            return false;
        }
        o4.xqGvceK5x();
        return false;
    }
}
