package defpackage;

/* loaded from: classes5.dex */
public final class tli {
    public final jyr a = l18.b.b(hag.I(frt.class), true);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        sli sliVar;
        int i;
        f7n f7nVar;
        if (cg6Var instanceof sli) {
            sliVar = (sli) cg6Var;
            int i2 = sliVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sliVar.m = i2 - Integer.MIN_VALUE;
                Object obj = sliVar.k;
                nm6 nm6Var = nm6.a;
                i = sliVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    frt frtVar = (frt) this.a.getValue();
                    f7n f7nVar2 = f7n.a;
                    sliVar.j = f7nVar2;
                    sliVar.m = 1;
                    obj = frtVar.k(sliVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    f7nVar = f7nVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f7nVar = sliVar.j;
                    qgg.h0(obj);
                }
                f7nVar.getClass();
                return Boolean.valueOf(f7n.b((yxc) obj));
            }
        }
        sliVar = new sli(this, cg6Var);
        Object obj2 = sliVar.k;
        nm6 nm6Var2 = nm6.a;
        i = sliVar.m;
        if (i != 0) {
        }
        f7nVar.getClass();
        return Boolean.valueOf(f7n.b((yxc) obj2));
    }
}
