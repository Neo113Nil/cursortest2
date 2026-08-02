package defpackage;

/* loaded from: classes.dex */
public abstract class y96 {
    public static final String a = jsg.n("ConstraintTrkngWrkr");

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(kpm kpmVar, t4w t4wVar, cg6 cg6Var) {
        x96 x96Var;
        int i;
        if (cg6Var instanceof x96) {
            x96Var = (x96) cg6Var;
            int i2 = x96Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x96Var.k = i2 - Integer.MIN_VALUE;
                Object obj = x96Var.j;
                nm6 nm6Var = nm6.a;
                i = x96Var.k;
                if (i != 0) {
                    qgg.h0(obj);
                    v81 v81Var = new v81(new ub7(12, kpmVar.L(t4wVar), new ox1(t4wVar, null, 11)), 3);
                    x96Var.k = 1;
                    obj = zsd.g0(v81Var, x96Var);
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
                return new Integer(((ma6) obj).a);
            }
        }
        x96Var = new x96(cg6Var);
        Object obj2 = x96Var.j;
        nm6 nm6Var2 = nm6.a;
        i = x96Var.k;
        if (i != 0) {
        }
        return new Integer(((ma6) obj2).a);
    }
}
