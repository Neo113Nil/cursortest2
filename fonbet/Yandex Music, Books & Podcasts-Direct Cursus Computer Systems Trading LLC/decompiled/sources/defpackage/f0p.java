package defpackage;

/* loaded from: classes6.dex */
public final class f0p {
    public final /* synthetic */ jyr a;

    public f0p(jyr jyrVar) {
        this.a = jyrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        e0p e0pVar;
        int i;
        f7n f7nVar;
        if (cg6Var instanceof e0p) {
            e0pVar = (e0p) cg6Var;
            int i2 = e0pVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e0pVar.m = i2 - Integer.MIN_VALUE;
                Object obj = e0pVar.k;
                nm6 nm6Var = nm6.a;
                i = e0pVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    frt frtVar = (frt) this.a.getValue();
                    f7n f7nVar2 = f7n.a;
                    e0pVar.j = f7nVar2;
                    e0pVar.m = 1;
                    obj = frtVar.k(e0pVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    f7nVar = f7nVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f7nVar = e0pVar.j;
                    qgg.h0(obj);
                }
                f7nVar.getClass();
                return Boolean.valueOf(f7n.b((yxc) obj));
            }
        }
        e0pVar = new e0p(this, cg6Var);
        Object obj2 = e0pVar.k;
        nm6 nm6Var2 = nm6.a;
        i = e0pVar.m;
        if (i != 0) {
        }
        f7nVar.getClass();
        return Boolean.valueOf(f7n.b((yxc) obj2));
    }
}
