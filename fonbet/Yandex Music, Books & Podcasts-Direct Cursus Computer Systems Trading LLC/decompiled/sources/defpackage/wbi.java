package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class wbi implements ubi {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.ubi
    public final void a(wn5 wn5Var) {
        this.a.add(new kf3(wn5Var, false));
    }

    @Override // defpackage.ubi
    public final void b(wn5 wn5Var) {
        this.a.add(new kf3(wn5Var, true));
    }

    public final void c(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1483008160);
        if ((((oq5Var.f(this) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((kf3) next).b) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((kf3) it2.next()).a.invoke(oq5Var, 0);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vbi(this, i, 1);
        }
    }

    public final void d(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(601130022);
        if ((((oq5Var.f(this) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((kf3) next).b) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((kf3) it2.next()).a.invoke(oq5Var, 0);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vbi(this, i, 0);
        }
    }
}
