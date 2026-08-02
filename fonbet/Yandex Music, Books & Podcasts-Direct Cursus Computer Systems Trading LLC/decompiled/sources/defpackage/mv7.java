package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class mv7 implements s8h {
    public final Executor c;
    public final vq6 d;
    public kv7 e;
    public kv7 f;
    public kv7 g;
    public qzc h;
    public sgr j;
    public aeg k;
    public long l;
    public final sue a = sue.a(null, mv7.class);
    public final Object b = new Object();
    public Collection i = new LinkedHashSet();

    public mv7(Executor executor, vq6 vq6Var) {
        this.c = executor;
        this.d = vq6Var;
    }

    @Override // defpackage.pue
    public final sue a() {
        return this.a;
    }

    @Override // defpackage.s8h
    public final void b(sgr sgrVar) {
        kv7 kv7Var;
        synchronized (this.b) {
            try {
                if (this.j != null) {
                    return;
                }
                this.j = sgrVar;
                this.d.b(new x8x(this, sgrVar, false, 24));
                if (!g() && (kv7Var = this.g) != null) {
                    this.d.b(kv7Var);
                    this.g = null;
                }
                this.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s8h
    public final void c(sgr sgrVar) {
        Collection<lv7> collection;
        kv7 kv7Var;
        b(sgrVar);
        synchronized (this.b) {
            try {
                collection = this.i;
                kv7Var = this.g;
                this.g = null;
                if (!collection.isEmpty()) {
                    this.i = Collections.EMPTY_LIST;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kv7Var != null) {
            for (lv7 lv7Var : collection) {
                nv7 d = lv7Var.d(new r4c(sgrVar, no4.b, lv7Var.l));
                if (d != null) {
                    d.run();
                }
            }
            this.d.execute(kv7Var);
        }
    }

    @Override // defpackage.s8h
    public final Runnable d(r8h r8hVar) {
        qzc qzcVar = (qzc) r8hVar;
        this.h = qzcVar;
        this.e = new kv7(qzcVar, 0);
        this.f = new kv7(qzcVar, 1);
        this.g = new kv7(qzcVar, 2);
        return null;
    }

    public final lv7 e(dsk dskVar, qo4[] qo4VarArr) {
        int size;
        lv7 lv7Var = new lv7(this, dskVar, qo4VarArr);
        this.i.add(lv7Var);
        synchronized (this.b) {
            size = this.i.size();
        }
        if (size == 1) {
            this.d.b(this.e);
        }
        for (qo4 qo4Var : qo4VarArr) {
            qo4Var.a();
        }
        return lv7Var;
    }

    @Override // defpackage.ro4
    public final mo4 f(k3i k3iVar, s2i s2iVar, ks3 ks3Var, qo4[] qo4VarArr) {
        mo4 r4cVar;
        try {
            dsk dskVar = new dsk(k3iVar, s2iVar, ks3Var);
            aeg aegVar = null;
            long j = -1;
            while (true) {
                synchronized (this.b) {
                    sgr sgrVar = this.j;
                    if (sgrVar == null) {
                        aeg aegVar2 = this.k;
                        if (aegVar2 != null) {
                            if (aegVar != null && j == this.l) {
                                r4cVar = e(dskVar, qo4VarArr);
                                break;
                            }
                            j = this.l;
                            ro4 f = xqd.f(aegVar2.a(dskVar), Boolean.TRUE.equals(ks3Var.e));
                            if (f != null) {
                                r4cVar = f.f(dskVar.c, dskVar.b, dskVar.a, qo4VarArr);
                                break;
                            }
                            aegVar = aegVar2;
                        } else {
                            r4cVar = e(dskVar, qo4VarArr);
                            break;
                        }
                    } else {
                        r4cVar = new r4c(sgrVar, no4.a, qo4VarArr);
                        break;
                    }
                }
            }
            return r4cVar;
        } finally {
            this.d.a();
        }
    }

    public final boolean g() {
        boolean z;
        synchronized (this.b) {
            z = !this.i.isEmpty();
        }
        return z;
    }

    public final void h(aeg aegVar) {
        kv7 kv7Var;
        synchronized (this.b) {
            this.k = aegVar;
            this.l++;
            if (aegVar != null && g()) {
                ArrayList arrayList = new ArrayList(this.i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    lv7 lv7Var = (lv7) it.next();
                    xdg a = aegVar.a(lv7Var.j);
                    ks3 ks3Var = lv7Var.j.a;
                    ro4 f = xqd.f(a, Boolean.TRUE.equals(ks3Var.e));
                    if (f != null) {
                        Executor executor = this.c;
                        Executor executor2 = ks3Var.b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        we6 we6Var = lv7Var.k;
                        we6 b = we6Var.b();
                        try {
                            dsk dskVar = lv7Var.j;
                            mo4 f2 = f.f(dskVar.c, dskVar.b, dskVar.a, lv7Var.l);
                            we6Var.D(b);
                            nv7 d = lv7Var.d(f2);
                            if (d != null) {
                                executor.execute(d);
                            }
                            arrayList2.add(lv7Var);
                        } catch (Throwable th) {
                            we6Var.D(b);
                            throw th;
                        }
                    }
                }
                synchronized (this.b) {
                    try {
                        if (g()) {
                            this.i.removeAll(arrayList2);
                            if (this.i.isEmpty()) {
                                this.i = new LinkedHashSet();
                            }
                            if (!g()) {
                                this.d.b(this.f);
                                if (this.j != null && (kv7Var = this.g) != null) {
                                    this.d.b(kv7Var);
                                    this.g = null;
                                }
                            }
                            this.d.a();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
