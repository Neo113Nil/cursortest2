package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class wf7 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public jld c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public u76 h;
    public pwj i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public daf n;
    public nsm o;
    public x68 p;
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
                jci jciVar = (jci) b.get(i);
                daf dafVar = jciVar.a;
                List list = jciVar.b;
                if (!arrayList.contains(dafVar)) {
                    arrayList.add(jciVar.a);
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
            List f = this.c.a().f(this.d);
            int size = f.size();
            for (int i = 0; i < size; i++) {
                jci a = ((kci) f.get(i)).a(this.d, this.e, this.f, this.i);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dfg c(Class cls) {
        dfg dfgVar;
        Class cls2;
        Class cls3;
        Class cls4;
        dfg dfgVar2;
        ArrayList arrayList;
        z2o z2oVar;
        Class cls5 = cls;
        nsn a = this.c.a();
        Class cls6 = this.g;
        Class cls7 = this.k;
        efg efgVar = a.i;
        fgi fgiVar = (fgi) efgVar.b.getAndSet(null);
        if (fgiVar == null) {
            fgiVar = new fgi();
        }
        fgiVar.a = cls5;
        fgiVar.b = cls6;
        fgiVar.c = cls7;
        synchronized (efgVar.a) {
            dfgVar = (dfg) efgVar.a.get(fgiVar);
        }
        efgVar.b.set(fgiVar);
        a.i.getClass();
        if (efg.c.equals(dfgVar)) {
            return null;
        }
        if (dfgVar != null) {
            return dfgVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a.c.c(cls5, cls6).iterator();
        while (it.hasNext()) {
            Class<?> cls8 = (Class) it.next();
            Iterator it2 = a.f.e(cls8, cls7).iterator();
            while (it2.hasNext()) {
                Class cls9 = (Class) it2.next();
                rc6 rc6Var = a.c;
                synchronized (rc6Var) {
                    arrayList = new ArrayList();
                    Iterator it3 = rc6Var.a.iterator();
                    while (it3.hasNext()) {
                        List<p2o> list = (List) rc6Var.b.get((String) it3.next());
                        if (list != null) {
                            for (p2o p2oVar : list) {
                                if (p2oVar.a.isAssignableFrom(cls5) && cls8.isAssignableFrom(p2oVar.b)) {
                                    arrayList.add(p2oVar.c);
                                }
                            }
                        }
                    }
                }
                ik0 ik0Var = a.f;
                synchronized (ik0Var) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        Iterator it4 = ik0Var.a.iterator();
                        while (it4.hasNext()) {
                            s6t s6tVar = (s6t) it4.next();
                            if (s6tVar.a.isAssignableFrom(cls8) && cls9.isAssignableFrom(s6tVar.b)) {
                                z2oVar = s6tVar.c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    z2oVar = l48.j;
                }
                arrayList2.add(new yf7(cls5, cls8, cls9, arrayList, z2oVar, a.j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            dfgVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            dfgVar2 = new dfg(cls2, cls3, cls4, arrayList2, a.j);
        }
        efg efgVar2 = a.i;
        synchronized (efgVar2.a) {
            efgVar2.a.put(new fgi(cls2, cls3, cls4), dfgVar2 != null ? dfgVar2 : efg.c);
        }
        return dfgVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = r3.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m6b d(Object obj) {
        m6b m6bVar;
        l3a l3aVar = this.c.a().b;
        Class<?> cls = obj.getClass();
        synchronized (l3aVar) {
            Iterator it = l3aVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    m6bVar = null;
                    break;
                }
                o6b o6bVar = (o6b) it.next();
                if (o6bVar.a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (m6bVar != null) {
            return m6bVar;
        }
        throw new lsn(tlm.j("Failed to find source encoder for data class: ", obj.getClass()));
    }

    public final d7t e(Class cls) {
        d7t d7tVar = (d7t) this.j.get(cls);
        if (d7tVar == null) {
            Iterator it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    d7tVar = (d7t) entry.getValue();
                    break;
                }
            }
        }
        if (d7tVar != null) {
            return d7tVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return wit.b;
        }
        wvs.g(cls, ". If you wish to ignore unknown resource types, use the optional transformation methods.", "Missing transformation for ");
        return null;
    }
}
