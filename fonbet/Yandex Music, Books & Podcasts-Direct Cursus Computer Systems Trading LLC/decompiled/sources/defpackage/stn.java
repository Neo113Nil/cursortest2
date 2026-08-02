package defpackage;

import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class stn {
    public final sjo a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final ru2 d = new ru2(6, this);

    public stn(sjo sjoVar) {
        this.a = sjoVar;
    }

    public final void a(dzf dzfVar, gc8 gc8Var) {
        dzf dzfVar2;
        synchronized (this.c) {
            try {
                HashMap hashMap = this.b;
                Object obj = hashMap.get(dzfVar);
                if (obj == null) {
                    d51 d51Var = d51.l;
                    synchronized (d51Var) {
                    }
                    if (qht.a.a()) {
                        dzfVar.getLifecycle().a(this.d);
                        dzfVar2 = dzfVar;
                    } else {
                        g23 d = gc8Var.getViewComponent$div_release().d();
                        f23 a = d.a();
                        try {
                            dzfVar2 = dzfVar;
                            d51Var.p(new zg(d, a, dzfVar2, this, 16));
                        } catch (Throwable th) {
                            g23.b(a);
                            throw th;
                        }
                    }
                    obj = new WeakHashMap();
                    hashMap.put(dzfVar2, obj);
                }
                ((WeakHashMap) obj).put(gc8Var, new Object());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
