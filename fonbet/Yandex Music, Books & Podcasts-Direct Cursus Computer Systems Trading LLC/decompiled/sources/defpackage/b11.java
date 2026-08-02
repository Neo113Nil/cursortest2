package defpackage;

/* loaded from: classes4.dex */
public final class b11 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        a11 a11Var;
        int i;
        if (cg6Var instanceof a11) {
            a11Var = (a11) cg6Var;
            int i2 = a11Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a11Var.l = i2 - Integer.MIN_VALUE;
                Object obj = a11Var.j;
                nm6 nm6Var = nm6.a;
                i = a11Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    mn7 mn7Var = dm6.a;
                    z01 z01Var = new z01(str, null);
                    a11Var.l = 1;
                    obj = x97.V(mn7Var, z01Var, a11Var);
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
                obj.getClass();
                return obj;
            }
        }
        a11Var = new a11(this, cg6Var);
        Object obj2 = a11Var.j;
        nm6 nm6Var2 = nm6.a;
        i = a11Var.l;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
