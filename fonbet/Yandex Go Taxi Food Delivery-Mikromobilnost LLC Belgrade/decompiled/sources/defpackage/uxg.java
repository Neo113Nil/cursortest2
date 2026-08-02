package defpackage;

import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class uxg {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public GlideContext c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public g1o h;
    public mg70 i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public khx n;
    public Priority o;
    public exj p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList b = b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                p430 p430Var = (p430) b.get(i);
                khx khxVar = p430Var.a;
                List list = p430Var.b;
                if (!arrayList.contains(khxVar)) {
                    arrayList.add(p430Var.a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add(list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List f = this.c.getRegistry().f(this.d);
            int size = f.size();
            for (int i = 0; i < size; i++) {
                p430 a = ((q430) f.get(i)).a(this.d, this.e, this.f, this.i);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fxy c(Class cls) {
        fxy fxyVar;
        Class cls2;
        Class cls3;
        Class cls4;
        fxy fxyVar2;
        ArrayList arrayList;
        puj0 puj0Var;
        Class cls5 = cls;
        Registry registry = this.c.getRegistry();
        Class cls6 = this.g;
        Class cls7 = this.k;
        gxy gxyVar = registry.i;
        cl40 cl40Var = (cl40) gxyVar.b.getAndSet(null);
        if (cl40Var == null) {
            cl40Var = new cl40();
        }
        cl40Var.a = cls5;
        cl40Var.b = cls6;
        cl40Var.c = cls7;
        synchronized (gxyVar.a) {
            fxyVar = (fxy) gxyVar.a.get(cl40Var);
        }
        gxyVar.b.set(cl40Var);
        registry.i.getClass();
        if (gxy.c.equals(fxyVar)) {
            return null;
        }
        if (fxyVar != null) {
            return fxyVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = registry.c.b(cls5, cls6).iterator();
        while (it.hasNext()) {
            Class<?> cls8 = (Class) it.next();
            Iterator it2 = registry.f.a(cls8, cls7).iterator();
            while (it2.hasNext()) {
                Class cls9 = (Class) it2.next();
                ttj0 ttj0Var = registry.c;
                synchronized (ttj0Var) {
                    arrayList = new ArrayList();
                    Iterator it3 = ttj0Var.a.iterator();
                    while (it3.hasNext()) {
                        List<stj0> list = (List) ttj0Var.b.get((String) it3.next());
                        if (list != null) {
                            for (stj0 stj0Var : list) {
                                if (stj0Var.a.isAssignableFrom(cls5) && cls8.isAssignableFrom(stj0Var.b)) {
                                    arrayList.add(stj0Var.c);
                                }
                            }
                        }
                    }
                }
                og01 og01Var = registry.f;
                synchronized (og01Var) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        Iterator it4 = og01Var.a.iterator();
                        while (it4.hasNext()) {
                            ng01 ng01Var = (ng01) it4.next();
                            if (ng01Var.a.isAssignableFrom(cls8) && cls9.isAssignableFrom(ng01Var.b)) {
                                puj0Var = ng01Var.c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    puj0Var = ez11.a;
                }
                arrayList2.add(new vxg(cls5, cls8, cls9, arrayList, puj0Var, registry.j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            fxyVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            fxyVar2 = new fxy(cls2, cls3, cls4, arrayList2, registry.j);
        }
        gxy gxyVar2 = registry.i;
        synchronized (gxyVar2.a) {
            gxyVar2.a.put(new cl40(cls2, cls3, cls4), fxyVar2 != null ? fxyVar2 : gxy.c);
        }
        return fxyVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r0 = r2.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wyn d(Object obj) {
        wyn wynVar;
        ozn oznVar = this.c.getRegistry().b;
        Class<?> cls = obj.getClass();
        synchronized (oznVar) {
            Iterator it = oznVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wynVar = null;
                    break;
                }
                nzn nznVar = (nzn) it.next();
                if (nznVar.a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (wynVar != null) {
            return wynVar;
        }
        throw new Registry.NoSourceEncoderAvailableException(qv10.l(obj.getClass(), "Failed to find source encoder for data class: "));
    }

    public final nw01 e(Class cls) {
        nw01 nw01Var = (nw01) this.j.get(cls);
        if (nw01Var == null) {
            Iterator it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    nw01Var = (nw01) entry.getValue();
                    break;
                }
            }
        }
        if (nw01Var != null) {
            return nw01Var;
        }
        if (!this.j.isEmpty() || !this.q) {
            return fz11.b;
        }
        ny61.g(qv10.m(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        return null;
    }
}
