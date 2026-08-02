package defpackage;

/* loaded from: classes5.dex */
public final class s62 {
    public final jyr a = l18.b.b(hag.I(g2q.class), true);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rr5 rr5Var, cg6 cg6Var) {
        p62 p62Var;
        int i;
        if (cg6Var instanceof p62) {
            p62Var = (p62) cg6Var;
            int i2 = p62Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p62Var.l = i2 - Integer.MIN_VALUE;
                Object obj = p62Var.j;
                Object obj2 = nm6.a;
                i = p62Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    kxs kxsVar = ((g2q) this.a.getValue()).a;
                    p62Var.l = 1;
                    obj = kxsVar.e(rr5Var, p62Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(obj == j1g.a);
            }
        }
        p62Var = new p62(this, cg6Var);
        Object obj3 = p62Var.j;
        Object obj22 = nm6.a;
        i = p62Var.l;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 == j1g.a);
    }
}
