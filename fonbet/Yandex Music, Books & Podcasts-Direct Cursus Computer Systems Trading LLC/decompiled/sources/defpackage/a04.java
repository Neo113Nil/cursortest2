package defpackage;

/* loaded from: classes5.dex */
public final class a04 implements u34 {
    public final jyr a;
    public final jyr b;

    public a04() {
        bdt I = hag.I(e15.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(yx4.class), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, cg6 cg6Var) {
        xz3 xz3Var;
        int i2;
        if (cg6Var instanceof xz3) {
            xz3Var = (xz3) cg6Var;
            int i3 = xz3Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xz3Var.m = i3 - Integer.MIN_VALUE;
                Object obj = xz3Var.k;
                nm6 nm6Var = nm6.a;
                i2 = xz3Var.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    yx4 yx4Var = (yx4) this.b.getValue();
                    xz3Var.j = i;
                    xz3Var.m = 1;
                    obj = yx4Var.g(xz3Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = xz3Var.j;
                    qgg.h0(obj);
                }
                int intValue = ((Number) obj).intValue();
                return new xgg(intValue, i < intValue);
            }
        }
        xz3Var = new xz3(this, cg6Var);
        Object obj2 = xz3Var.k;
        nm6 nm6Var2 = nm6.a;
        i2 = xz3Var.m;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        return new xgg(intValue2, i < intValue2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, cg6 cg6Var) {
        zz3 zz3Var;
        int i2;
        if (cg6Var instanceof zz3) {
            zz3Var = (zz3) cg6Var;
            int i3 = zz3Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zz3Var.m = i3 - Integer.MIN_VALUE;
                Object obj = zz3Var.k;
                nm6 nm6Var = nm6.a;
                i2 = zz3Var.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    e15 e15Var = (e15) this.a.getValue();
                    zz3Var.j = i;
                    zz3Var.m = 1;
                    e15Var.getClass();
                    obj = x97.V(dm6.b, new ux2(e15Var, null, 1), zz3Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = zz3Var.j;
                    qgg.h0(obj);
                }
                int intValue = ((Number) obj).intValue();
                return new xgg(intValue, i < intValue);
            }
        }
        zz3Var = new zz3(this, cg6Var);
        Object obj2 = zz3Var.k;
        nm6 nm6Var2 = nm6.a;
        i2 = zz3Var.m;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        return new xgg(intValue2, i < intValue2);
    }
}
