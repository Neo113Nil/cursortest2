package defpackage;

/* loaded from: classes3.dex */
public final class w5r {
    public final jyr a = btf.b(new nrq(13));

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, cg6 cg6Var) {
        v5r v5rVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof v5r) {
            v5rVar = (v5r) cg6Var;
            int i2 = v5rVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v5rVar.l = i2 - Integer.MIN_VALUE;
                Object obj = v5rVar.j;
                nm6 nm6Var = nm6.a;
                i = v5rVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    b6r b6rVar = (b6r) this.a.getValue();
                    v5rVar.l = 1;
                    obj = b6rVar.a(z, v5rVar);
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
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return (u5r) ((qj6) rj6Var).a;
                }
                if (rj6Var instanceof pj6) {
                    return null;
                }
                b6e.s();
                return null;
            }
        }
        v5rVar = new v5r(this, cg6Var);
        Object obj2 = v5rVar.j;
        nm6 nm6Var2 = nm6.a;
        i = v5rVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }
}
