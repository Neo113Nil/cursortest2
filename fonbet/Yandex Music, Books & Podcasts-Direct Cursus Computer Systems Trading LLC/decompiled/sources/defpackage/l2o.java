package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class l2o implements ea7, ba7 {
    public final xf7 a;
    public final wf7 b;
    public int c;
    public int d = -1;
    public daf e;
    public List f;
    public int g;
    public volatile jci h;
    public File i;
    public m2o j;

    public l2o(wf7 wf7Var, xf7 xf7Var) {
        this.b = wf7Var;
        this.a = xf7Var;
    }

    @Override // defpackage.ea7
    public final boolean b() {
        List list;
        ArrayList t;
        ArrayList a = this.b.a();
        boolean z = false;
        if (!a.isEmpty()) {
            wf7 wf7Var = this.b;
            nsn a2 = wf7Var.c.a();
            Class<?> cls = wf7Var.d.getClass();
            Class cls2 = wf7Var.g;
            Class cls3 = wf7Var.k;
            aqd aqdVar = a2.h;
            fgi fgiVar = (fgi) ((AtomicReference) aqdVar.b).getAndSet(null);
            if (fgiVar == null) {
                fgiVar = new fgi(cls, cls2, cls3);
            } else {
                fgiVar.a = cls;
                fgiVar.b = cls2;
                fgiVar.c = cls3;
            }
            synchronized (((xy0) aqdVar.c)) {
                list = (List) ((xy0) aqdVar.c).get(fgiVar);
            }
            ((AtomicReference) aqdVar.b).set(fgiVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                nnd nndVar = a2.a;
                synchronized (nndVar) {
                    t = ((kkp) nndVar.b).t(cls);
                }
                Iterator it = t.iterator();
                while (it.hasNext()) {
                    Iterator it2 = a2.c.c((Class) it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!a2.f.e(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                aqd aqdVar2 = a2.h;
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((xy0) aqdVar2.c)) {
                    ((xy0) aqdVar2.c).put(new fgi(cls, cls2, cls3), unmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f;
                    if (list3 != null && this.g < list3.size()) {
                        this.h = null;
                        while (!z && this.g < this.f.size()) {
                            List list4 = this.f;
                            int i = this.g;
                            this.g = i + 1;
                            kci kciVar = (kci) list4.get(i);
                            File file = this.i;
                            wf7 wf7Var2 = this.b;
                            this.h = kciVar.a(file, wf7Var2.e, wf7Var2.f, wf7Var2.i);
                            if (this.h != null && this.b.c(this.h.c.a()) != null) {
                                this.h.c.d(this.b.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.c + 1;
                        this.c = i3;
                        if (i3 >= a.size()) {
                            break;
                        }
                        this.d = 0;
                    }
                    daf dafVar = (daf) a.get(this.c);
                    Class cls5 = (Class) list2.get(this.d);
                    d7t e = this.b.e(cls5);
                    wf7 wf7Var3 = this.b;
                    this.j = new m2o(wf7Var3.c.a, dafVar, wf7Var3.n, wf7Var3.e, wf7Var3.f, e, cls5, wf7Var3.i);
                    File l = wf7Var3.h.e().l(this.j);
                    this.i = l;
                    if (l != null) {
                        this.e = dafVar;
                        this.f = this.b.c.a().f(l);
                        this.g = 0;
                    }
                }
            } else if (!File.class.equals(this.b.k)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.b.d.getClass());
                Class cls6 = this.b.k;
                sb.append(" to ");
                sb.append(cls6);
                throw new IllegalStateException(sb.toString());
            }
        }
        return false;
    }

    @Override // defpackage.ba7
    public final void c(Exception exc) {
        this.a.a(this.j, exc, this.h.c, 4);
    }

    @Override // defpackage.ea7
    public final void cancel() {
        jci jciVar = this.h;
        if (jciVar != null) {
            jciVar.c.cancel();
        }
    }

    @Override // defpackage.ba7
    public final void g(Object obj) {
        this.a.c(this.e, obj, this.h.c, 4, this.j);
    }
}
