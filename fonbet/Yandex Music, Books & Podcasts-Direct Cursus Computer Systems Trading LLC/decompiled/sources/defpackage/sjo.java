package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class sjo {
    public final vx6 a;
    public final efb b;
    public final Map c = Collections.synchronizedMap(new LinkedHashMap());
    public final WeakHashMap d = new WeakHashMap();

    public sjo(vx6 vx6Var, efb efbVar) {
        this.a = vx6Var;
        this.b = efbVar;
    }

    public final void a(gc8 gc8Var) {
        WeakHashMap weakHashMap = this.d;
        Set set = (Set) weakHashMap.get(gc8Var);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                rjo rjoVar = (rjo) this.c.get((String) it.next());
                if (rjoVar != null) {
                    rjoVar.d = false;
                    ckj ckjVar = rjoVar.g;
                    ckjVar.getClass();
                    akj akjVar = new akj(ckjVar);
                    while (akjVar.hasNext()) {
                        d0c d0cVar = (d0c) akjVar.next();
                        if (!d0cVar.d) {
                            d0cVar.d = true;
                            rdk rdkVar = d0cVar.c;
                            if (rdkVar != null) {
                                rdkVar.u(gc8Var);
                            }
                            d0cVar.a.d.s();
                        }
                    }
                }
            }
        }
        weakHashMap.remove(gc8Var);
    }
}
