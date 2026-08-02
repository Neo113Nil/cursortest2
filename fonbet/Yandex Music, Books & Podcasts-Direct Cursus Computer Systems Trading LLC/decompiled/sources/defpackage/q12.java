package defpackage;

import java.util.List;

/* loaded from: classes6.dex */
public final class q12 {
    public final jyr a;
    public final jyr b;

    public q12() {
        bdt I = hag.I(c72.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(a72.class), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        p12 p12Var;
        int i;
        if (cg6Var instanceof p12) {
            p12Var = (p12) cg6Var;
            int i2 = p12Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p12Var.l = i2 - Integer.MIN_VALUE;
                Object obj = p12Var.j;
                nm6 nm6Var = nm6.a;
                i = p12Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    a72 a72Var = (a72) this.b.getValue();
                    p12Var.l = 1;
                    a72Var.getClass();
                    obj = x97.V(dm6.a, new ox1(null, a72Var), p12Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new Integer(((List) obj).size());
            }
        }
        p12Var = new p12(this, cg6Var);
        Object obj2 = p12Var.j;
        nm6 nm6Var2 = nm6.a;
        i = p12Var.l;
        if (i != 0) {
        }
        return new Integer(((List) obj2).size());
    }
}
