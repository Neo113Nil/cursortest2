package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vy0 extends d71 implements lv {
    public final /* synthetic */ wy0 E7jCp8Ls;
    public int JFJ3QoxA;
    public long mOu10nynGul;
    public /* synthetic */ long rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy0(wy0 wy0Var, vg vgVar) {
        super(2, vgVar);
        this.E7jCp8Ls = wy0Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        long j = ((yd1) obj).GWasM1elztuh;
        vy0 vy0Var = new vy0(this.E7jCp8Ls, (vg) obj2);
        vy0Var.rQPn8YBR = j;
        return vy0Var.WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.JFJ3QoxA;
        wy0 wy0Var = this.E7jCp8Ls;
        qh qhVar = qh.OOA6hdeuvCS;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            j = this.rQPn8YBR;
            rx0 rx0Var = wy0Var.EljAMC1QTz;
            this.rQPn8YBR = j;
            this.JFJ3QoxA = 1;
            obj = rx0Var.encWxUiV2(j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = this.mOu10nynGul;
                    j3 = this.rQPn8YBR;
                    o50.A1EKNP6CxJ(obj);
                    return new yd1(yd1.xqGvceK5x(j3, yd1.xqGvceK5x(j4, ((yd1) obj).GWasM1elztuh)));
                }
                j2 = this.mOu10nynGul;
                j = this.rQPn8YBR;
                o50.A1EKNP6CxJ(obj);
                long j5 = ((yd1) obj).GWasM1elztuh;
                rx0 rx0Var2 = wy0Var.EljAMC1QTz;
                long xqGvceK5x = yd1.xqGvceK5x(j2, j5);
                this.rQPn8YBR = j;
                this.mOu10nynGul = j5;
                this.JFJ3QoxA = 3;
                obj = rx0Var2.AvO7iQsrTN(xqGvceK5x, j5, this);
                if (obj != qhVar) {
                    j3 = j;
                    j4 = j5;
                    return new yd1(yd1.xqGvceK5x(j3, yd1.xqGvceK5x(j4, ((yd1) obj).GWasM1elztuh)));
                }
                return qhVar;
            }
            j = this.rQPn8YBR;
            o50.A1EKNP6CxJ(obj);
        }
        long xqGvceK5x2 = yd1.xqGvceK5x(j, ((yd1) obj).GWasM1elztuh);
        this.rQPn8YBR = j;
        this.mOu10nynGul = xqGvceK5x2;
        this.JFJ3QoxA = 2;
        obj = wy0Var.GWasM1elztuh(xqGvceK5x2, this);
        if (obj != qhVar) {
            j2 = xqGvceK5x2;
            long j52 = ((yd1) obj).GWasM1elztuh;
            rx0 rx0Var22 = wy0Var.EljAMC1QTz;
            long xqGvceK5x3 = yd1.xqGvceK5x(j2, j52);
            this.rQPn8YBR = j;
            this.mOu10nynGul = j52;
            this.JFJ3QoxA = 3;
            obj = rx0Var22.AvO7iQsrTN(xqGvceK5x3, j52, this);
            if (obj != qhVar) {
            }
        }
        return qhVar;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        vy0 vy0Var = new vy0(this.E7jCp8Ls, vgVar);
        vy0Var.rQPn8YBR = ((yd1) obj).GWasM1elztuh;
        return vy0Var;
    }
}
