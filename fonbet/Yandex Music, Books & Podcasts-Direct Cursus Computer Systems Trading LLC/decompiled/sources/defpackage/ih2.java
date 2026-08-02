package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class ih2 implements wci {
    public boolean a;
    public zt3 b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        hh2 hh2Var;
        int i;
        zt3 zt3Var;
        if (cg6Var instanceof hh2) {
            hh2Var = (hh2) cg6Var;
            int i2 = hh2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hh2Var.m = i2 - Integer.MIN_VALUE;
                Object obj = hh2Var.k;
                nm6 nm6Var = nm6.a;
                i = hh2Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!this.a) {
                        zt3 zt3Var2 = this.b;
                        hh2Var.j = zt3Var2;
                        hh2Var.m = 1;
                        zt3 zt3Var3 = new zt3(1, qxe.b(hh2Var));
                        zt3Var3.s();
                        this.b = zt3Var3;
                        if (zt3Var3.q() == nm6Var) {
                            return nm6Var;
                        }
                        zt3Var = zt3Var2;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zt3Var = hh2Var.j;
                qgg.h0(obj);
                if (zt3Var != null) {
                    r7o r7oVar = z7o.b;
                    zt3Var.resumeWith(Unit.a);
                }
                return Unit.a;
            }
        }
        hh2Var = new hh2(this, cg6Var);
        Object obj2 = hh2Var.k;
        nm6 nm6Var2 = nm6.a;
        i = hh2Var.m;
        if (i != 0) {
        }
        if (zt3Var != null) {
        }
        return Unit.a;
    }
}
