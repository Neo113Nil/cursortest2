package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public abstract class wys extends xwy0 {
    public final ArrayList O;
    public final hbp0 P;
    public final LinkedHashMap Q;

    public wys(View view) {
        super(view);
        this.O = new ArrayList();
        String d = qoi0.a(getClass()).d();
        this.P = new hbp0(new czo0(14), d == null ? "" : d, null);
        this.Q = new LinkedHashMap();
    }

    public final void W(Object obj) {
        LinkedHashMap linkedHashMap = this.Q;
        l8x l8xVar = (l8x) linkedHashMap.get(obj);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        linkedHashMap.remove(obj);
    }

    public boolean X() {
        return !(this instanceof jau);
    }

    public void Y() {
        ArrayList arrayList = this.O;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((g18) it.next()).cancel();
        }
        arrayList.clear();
        this.P.b();
        this.Q.clear();
    }

    public final void Z(wls wlsVar, Object obj, boolean z) {
        hbp0 hbp0Var = this.P;
        if (!hbp0Var.d()) {
            hbp0Var.a();
        }
        if (obj == null) {
            hbp0.e(hbp0Var, null, null, wlsVar, 3);
            return;
        }
        LinkedHashMap linkedHashMap = this.Q;
        l8x l8xVar = (l8x) linkedHashMap.get(obj);
        if (l8xVar == null || l8xVar.k0()) {
            linkedHashMap.put(obj, hbp0.e(hbp0Var, null, null, wlsVar, 3));
        } else if (z) {
            l8xVar.a(null);
            linkedHashMap.put(obj, hbp0.e(hbp0Var, null, null, wlsVar, 3));
        }
    }

    public final void a0(g18 g18Var) {
        this.O.add(g18Var);
    }

    public final void b0(wls wlsVar) {
        Z(wlsVar, null, true);
    }

    public abstract void c(Object obj);
}
