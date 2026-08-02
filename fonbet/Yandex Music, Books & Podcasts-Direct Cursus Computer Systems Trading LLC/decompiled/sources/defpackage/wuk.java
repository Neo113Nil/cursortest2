package defpackage;

/* loaded from: classes3.dex */
public final class wuk {
    public final /* synthetic */ frt a;

    public wuk(frt frtVar) {
        this.a = frtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        vuk vukVar;
        int i;
        if (cg6Var instanceof vuk) {
            vukVar = (vuk) cg6Var;
            int i2 = vukVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vukVar.l = i2 - Integer.MIN_VALUE;
                Object obj = vukVar.j;
                nm6 nm6Var = nm6.a;
                i = vukVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    vukVar.l = 1;
                    obj = this.a.f(vukVar);
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
                return ((xxq) obj).a;
            }
        }
        vukVar = new vuk(this, cg6Var);
        Object obj2 = vukVar.j;
        nm6 nm6Var2 = nm6.a;
        i = vukVar.l;
        if (i != 0) {
        }
        return ((xxq) obj2).a;
    }
}
