package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class xc11 {
    public final urw a;

    public xc11(urw urwVar) {
        this.a = urwVar;
    }

    public final ik31 a(ik31 ik31Var) {
        dk31 dk31Var = ik31Var.a;
        mi31 mi31Var = ik31Var.b;
        List list = dk31Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((za31) obj).a.o) {
                arrayList.add(obj);
            }
        }
        mi31 d = this.a.d(arrayList, mi31Var, false);
        dk31 a = dk31.a(ik31Var.a, arrayList);
        if (d != null) {
            mi31Var = d;
        }
        return new ik31(a, mi31Var, ik31Var.c, ik31Var.d);
    }
}
