package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class gti extends s4k {
    public final jyr b = l18.b.b(hag.I(gui.class), true);

    @Override // defpackage.s4k
    public final Object c(t4k t4kVar) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.s4k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(o4k o4kVar, cg6 cg6Var) {
        fti ftiVar;
        int i;
        int intValue;
        rj6 rj6Var;
        if (cg6Var instanceof fti) {
            ftiVar = (fti) cg6Var;
            int i2 = ftiVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ftiVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ftiVar.k;
                nm6 nm6Var = nm6.a;
                i = ftiVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Integer num = (Integer) o4kVar.a();
                    intValue = num != null ? num.intValue() : 0;
                    gui guiVar = (gui) this.b.getValue();
                    ftiVar.j = intValue;
                    ftiVar.m = 1;
                    obj = guiVar.b(intValue, 20, ftiVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    intValue = ftiVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        return new p4k(new Exception());
                    }
                    b6e.s();
                    return null;
                }
                tui tuiVar = (tui) ((qj6) rj6Var).a;
                List list = tuiVar.b;
                ap0 ap0Var = tuiVar.c;
                return new q4k(list, (ap0Var == null || (ap0Var.a + 1) * ap0Var.b >= ap0Var.c) ? null : new Integer(intValue + 1));
            }
        }
        ftiVar = new fti(this, cg6Var);
        Object obj2 = ftiVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ftiVar.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
