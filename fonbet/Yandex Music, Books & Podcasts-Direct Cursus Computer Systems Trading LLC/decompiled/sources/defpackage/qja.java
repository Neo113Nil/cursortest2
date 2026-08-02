package defpackage;

/* loaded from: classes5.dex */
public final class qja {
    public final jyr a = l18.b.b(hag.I(yx4.class), true);

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        nja njaVar;
        int i;
        if (cg6Var instanceof nja) {
            njaVar = (nja) cg6Var;
            int i2 = njaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                njaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = njaVar.j;
                nm6 nm6Var = nm6.a;
                i = njaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    yx4 yx4Var = (yx4) this.a.getValue();
                    njaVar.l = 1;
                    obj = yx4Var.a(njaVar);
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
                return new Integer(((l4t) obj).a.a);
            }
        }
        njaVar = new nja(this, cg6Var);
        Object obj2 = njaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = njaVar.l;
        if (i != 0) {
        }
        return new Integer(((l4t) obj2).a.a);
    }
}
