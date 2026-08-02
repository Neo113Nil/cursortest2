package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class nsn {
    public final nnd a;
    public final l3a b;
    public final rc6 c;
    public final ls5 d;
    public final pa7 e;
    public final ik0 f;
    public final ik0 g;
    public final aqd h = new aqd(9);
    public final efg i = new efg();
    public final vx6 j;

    public nsn() {
        vx6 vx6Var = new vx6((Object) new ehm(20), (Object) new klx(22), (Object) new bs4(23), false, 19);
        this.j = vx6Var;
        this.a = new nnd(vx6Var);
        this.b = new l3a(1);
        this.c = new rc6(1);
        this.d = new ls5(2);
        this.e = new pa7(0);
        this.f = new ik0(6, false);
        this.g = new ik0(2, false);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        rc6 rc6Var = this.c;
        synchronized (rc6Var) {
            try {
                ArrayList arrayList2 = new ArrayList(rc6Var.a);
                rc6Var.a.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    rc6Var.a.add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        rc6Var.a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, m6b m6bVar) {
        l3a l3aVar = this.b;
        synchronized (l3aVar) {
            l3aVar.a.add(new o6b(cls, m6bVar));
        }
    }

    public final void b(Class cls, r2o r2oVar) {
        ls5 ls5Var = this.d;
        synchronized (ls5Var) {
            ls5Var.a.add(new s2o(cls, r2oVar));
        }
    }

    public final void c(Class cls, Class cls2, lci lciVar) {
        nnd nndVar = this.a;
        synchronized (nndVar) {
            kkp kkpVar = (kkp) nndVar.b;
            synchronized (kkpVar) {
                try {
                    mgi mgiVar = new mgi(cls, cls2, lciVar);
                    ArrayList arrayList = (ArrayList) kkpVar.b;
                    arrayList.add(arrayList.size(), mgiVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((h5h) nndVar.c).a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, o2o o2oVar) {
        rc6 rc6Var = this.c;
        synchronized (rc6Var) {
            rc6Var.b(str).add(new p2o(cls, cls2, o2oVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        ik0 ik0Var = this.g;
        synchronized (ik0Var) {
            arrayList = ik0Var.a;
        }
        if (arrayList.isEmpty()) {
            throw new lsn("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List list;
        nnd nndVar = this.a;
        nndVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (nndVar) {
            mci mciVar = (mci) ((h5h) nndVar.c).a.get(cls);
            list = mciVar == null ? null : mciVar.a;
            if (list == null) {
                list = Collections.unmodifiableList(((kkp) nndVar.b).o(cls));
                if (((mci) ((h5h) nndVar.c).a.put(cls, new mci(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (list.isEmpty()) {
            throw new lsn("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = list.size();
        List list2 = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            kci kciVar = (kci) list.get(i);
            if (kciVar.b(obj)) {
                if (z) {
                    list2 = new ArrayList(size - i);
                    z = false;
                }
                list2.add(kciVar);
            }
        }
        if (!list2.isEmpty()) {
            return list2;
        }
        throw new lsn("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
    }

    public final oa7 g(Object obj) {
        oa7 b;
        pa7 pa7Var = this.e;
        synchronized (pa7Var) {
            try {
                w1g.r(obj);
                na7 na7Var = (na7) pa7Var.a.get(obj.getClass());
                if (na7Var == null) {
                    Iterator it = pa7Var.a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        na7 na7Var2 = (na7) it.next();
                        if (na7Var2.a().isAssignableFrom(obj.getClass())) {
                            na7Var = na7Var2;
                            break;
                        }
                    }
                }
                if (na7Var == null) {
                    na7Var = pa7.b;
                }
                b = na7Var.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public final void h(na7 na7Var) {
        pa7 pa7Var = this.e;
        synchronized (pa7Var) {
            pa7Var.a.put(na7Var.a(), na7Var);
        }
    }

    public final void i(Class cls, Class cls2, z2o z2oVar) {
        ik0 ik0Var = this.f;
        synchronized (ik0Var) {
            ik0Var.a.add(new s6t(cls, cls2, z2oVar));
        }
    }
}
