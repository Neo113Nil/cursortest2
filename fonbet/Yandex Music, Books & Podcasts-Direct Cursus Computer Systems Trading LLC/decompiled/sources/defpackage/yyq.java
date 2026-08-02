package defpackage;

/* loaded from: classes5.dex */
public final class yyq {
    public final oyq a = oyq.a;
    public final jyr b = l18.b.b(hag.I(c72.class), true);

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        xyq xyqVar;
        int i;
        if (cg6Var instanceof xyq) {
            xyqVar = (xyq) cg6Var;
            int i2 = xyqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xyqVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xyqVar.j;
                nm6 nm6Var = nm6.a;
                i = xyqVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    c72 c72Var = (c72) this.b.getValue();
                    xyqVar.l = 1;
                    obj = ((z22) c72Var).h(xyqVar);
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
                return new Integer(ocg.q(((Number) obj).longValue()));
            }
        }
        xyqVar = new xyq(this, cg6Var);
        Object obj2 = xyqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xyqVar.l;
        if (i != 0) {
        }
        return new Integer(ocg.q(((Number) obj2).longValue()));
    }
}
