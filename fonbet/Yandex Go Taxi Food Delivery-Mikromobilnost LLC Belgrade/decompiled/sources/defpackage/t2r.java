package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public final class t2r {
    public final to3 a;
    public final Executor b;
    public final Looper c;
    public final kzq d;
    public final a1r e;
    public final wwf f;
    public final Handler g;
    public final HashMap h = new HashMap();

    public t2r(to3 to3Var, Executor executor, Looper looper, kzq kzqVar, a1r a1rVar, wwf wwfVar) {
        this.a = to3Var;
        this.b = executor;
        this.c = looper;
        this.d = kzqVar;
        this.e = a1rVar;
        this.f = wwfVar;
        this.g = new Handler(looper);
    }

    public final void a(g2r g2rVar) {
        q2r q2rVar = (q2r) this.h.get(g2rVar);
        if (q2rVar != null) {
            String key = q2rVar.a.getKey();
            if (key != null) {
                a1r a1rVar = q2rVar.z.e;
                a1rVar.d.post(new v0r(a1rVar, key, 0));
            }
            q2rVar.b.clear();
            q2rVar.a();
        }
    }

    public final v1b b(g2r g2rVar, o2r o2rVar) {
        z83.g(null, this.c, Looper.myLooper());
        HashMap hashMap = this.h;
        q2r q2rVar = (q2r) hashMap.get(g2rVar);
        if (q2rVar == null) {
            q2rVar = new q2r(this, g2rVar);
            hashMap.put(g2rVar, q2rVar);
        }
        v1b v1bVar = new v1b(this, q2rVar, o2rVar);
        t2r t2rVar = q2rVar.z;
        z83.g(null, t2rVar.c, Looper.myLooper());
        if (q2rVar.y) {
            return v1bVar;
        }
        q2rVar.y = true;
        t2rVar.b.execute(new qpo(9, t2rVar, q2rVar));
        return v1bVar;
    }

    public final e1k c(Iterator it, ArrayList arrayList, p2r p2rVar) {
        if (it.hasNext()) {
            return new s2r(this, (g2r) it.next(), arrayList, it, p2rVar);
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((k2r) it2.next()).a);
        }
        p2rVar.a(new k2r(tcc.o(arrayList2)));
        return e1k.M1;
    }
}
