package defpackage;

import android.os.HandlerThread;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes11.dex */
public final class qqg implements pqg, pjb1 {
    public final int a;
    public final int b;
    public final Object c;
    public final Serializable w;
    public final Serializable x;
    public final Collection y;
    public final Object z;

    public qqg(int i, int i2) {
        this.w = new LinkedList();
        this.x = new HashSet();
        this.y = new HashSet();
        this.z = new HashMap();
        this.c = "Sqflite";
        this.a = i;
        this.b = i2;
    }

    public synchronized nqg a(oqg oqgVar) {
        nqg nqgVar;
        oqg oqgVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.w).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                nqgVar = (nqg) listIterator.next();
                oqgVar2 = nqgVar.a() != null ? (oqg) ((HashMap) this.z).get(nqgVar.a()) : null;
                if (oqgVar2 == null) {
                    break;
                }
            } while (oqgVar2 != oqgVar);
            listIterator.remove();
            return nqgVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(oqg oqgVar) {
        try {
            nqg a = a(oqgVar);
            if (a != null) {
                ((HashSet) this.y).add(oqgVar);
                ((HashSet) this.x).remove(oqgVar);
                if (a.a() != null) {
                    ((HashMap) this.z).put(a.a(), oqgVar);
                }
                oqgVar.d.post(new j9f(24, oqgVar, a));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.pqg
    public synchronized void e(nqg nqgVar) {
        ((LinkedList) this.w).add(nqgVar);
        Iterator it = new HashSet((HashSet) this.x).iterator();
        while (it.hasNext()) {
            b((oqg) it.next());
        }
    }

    @Override // defpackage.pqg
    public synchronized void k() {
        try {
            Iterator it = ((HashSet) this.x).iterator();
            while (it.hasNext()) {
                oqg oqgVar = (oqg) it.next();
                synchronized (oqgVar) {
                    HandlerThread handlerThread = oqgVar.c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        oqgVar.c = null;
                        oqgVar.d = null;
                    }
                }
            }
            Iterator it2 = ((HashSet) this.y).iterator();
            while (it2.hasNext()) {
                oqg oqgVar2 = (oqg) it2.next();
                synchronized (oqgVar2) {
                    HandlerThread handlerThread2 = oqgVar2.c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        oqgVar2.c = null;
                        oqgVar2.d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.pjb1
    public mvt0 s(mvt0 mvt0Var) {
        Integer num = (Integer) this.c;
        Long l = (Long) this.w;
        Long l2 = (Long) this.x;
        List list = (List) this.y;
        List list2 = (List) this.z;
        if (mvt0Var == null) {
            mvt0Var = mvt0.b(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList());
        }
        int g = num == null ? mvt0Var.g() : num.intValue();
        long a = l == null ? mvt0Var.a() : l.longValue();
        long i = l2 == null ? mvt0Var.i() : l2.longValue();
        if (list == null) {
            list = mvt0Var.e();
        }
        List list3 = list;
        if (list2 == null) {
            list2 = mvt0Var.d();
        }
        return mvt0.b(g, this.a, this.b, a, i, list3, list2);
    }

    @Override // defpackage.pqg
    public synchronized void start() {
        for (int i = 0; i < this.a; i++) {
            oqg oqgVar = new oqg(((String) this.c) + i, this.b);
            oqgVar.a(new j9f(25, this, oqgVar));
            ((HashSet) this.x).add(oqgVar);
        }
    }

    public /* synthetic */ qqg(Integer num, int i, int i2, Long l, Long l2, List list, List list2) {
        this.c = num;
        this.a = i;
        this.b = i2;
        this.w = l;
        this.x = l2;
        this.y = list;
        this.z = list2;
    }
}
