package defpackage;

/* loaded from: classes6.dex */
public final class hh1 {
    public final aoi a;
    public final g51 b = new g51();
    public final jyr c;
    public final jyr d;
    public final jyr e;

    public hh1(aoi aoiVar) {
        this.a = aoiVar;
        bdt I = hag.I(ol1.class);
        l18 l18Var = l18.b;
        this.c = l18Var.b(I, true);
        this.d = l18Var.b(hag.I(k21.class), false);
        this.e = l18Var.b(hag.I(k68.class), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ap0 ap0Var, boolean z, cg6 cg6Var) {
        gh1 gh1Var;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof gh1) {
            gh1Var = (gh1) cg6Var;
            int i2 = gh1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gh1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = gh1Var.j;
                nm6 nm6Var = nm6.a;
                i = gh1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ol1 ol1Var = (ol1) this.c.getValue();
                    gh1Var.l = 1;
                    obj = ol1Var.b(str, ap0Var, z, gh1Var);
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
                    return (ql1) ((qj6) rj6Var).a;
                }
                if (rj6Var instanceof pj6) {
                    throw ((pj6) rj6Var).a();
                }
                b6e.s();
                return null;
            }
        }
        gh1Var = new gh1(this, cg6Var);
        Object obj2 = gh1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = gh1Var.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }
}
