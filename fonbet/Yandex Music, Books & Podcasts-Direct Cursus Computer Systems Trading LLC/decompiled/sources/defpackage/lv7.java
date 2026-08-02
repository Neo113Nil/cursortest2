package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class lv7 implements mo4 {
    public volatile boolean a;
    public oo4 b;
    public mo4 c;
    public sgr d;
    public qv7 f;
    public long g;
    public long h;
    public final dsk j;
    public final qo4[] l;
    public final /* synthetic */ mv7 m;
    public List e = new ArrayList();
    public ArrayList i = new ArrayList();
    public final we6 k = we6.z();

    public lv7(mv7 mv7Var, dsk dskVar, qo4[] qo4VarArr) {
        this.m = mv7Var;
        this.j = dskVar;
        this.l = qo4VarArr;
    }

    @Override // defpackage.bjr
    public final void E(rym rymVar) {
        o2g.U("May only be called after start", this.b != null);
        if (this.a) {
            this.c.E(rymVar);
        } else {
            b(new x8x(this, rymVar, false, 28));
        }
    }

    @Override // defpackage.mo4
    public final void M(int i) {
        o2g.U("May only be called before start", this.b == null);
        this.i.add(new ov7(this, i, 0));
    }

    @Override // defpackage.bjr
    public final void X() {
        o2g.U("May only be called before start", this.b == null);
        this.i.add(new nv7(this, 1));
    }

    @Override // defpackage.bjr
    public final void a() {
        o2g.U("May only be called after start", this.b != null);
        if (this.a) {
            this.c.a();
        } else {
            b(new nv7(this, 0));
        }
    }

    @Override // defpackage.mo4
    public final void a0(ch7 ch7Var) {
        o2g.U("May only be called before start", this.b == null);
        o2g.O(ch7Var, "decompressorRegistry");
        this.i.add(new x8x(this, ch7Var, false, 26));
    }

    public final void b(Runnable runnable) {
        o2g.U("May only be called after start", this.b != null);
        synchronized (this) {
            try {
                if (this.a) {
                    runnable.run();
                } else {
                    this.e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        qv7 qv7Var;
        List list;
        List list2;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.e.isEmpty()) {
                    break;
                }
                list2 = this.e;
                this.e = arrayList;
            }
            if (qv7Var != null) {
                return;
            }
            List arrayList2 = new ArrayList();
            while (true) {
                synchronized (qv7Var) {
                    try {
                        if (((List) qv7Var.c).isEmpty()) {
                            qv7Var.c = null;
                            qv7Var.a = true;
                            return;
                        } else {
                            list = (List) qv7Var.c;
                            qv7Var.c = arrayList2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList2 = list;
            }
            list2.clear();
            arrayList = list2;
        }
        this.e = null;
        this.a = true;
        qv7Var = this.f;
        if (qv7Var != null) {
        }
    }

    public final nv7 d(mo4 mo4Var) {
        synchronized (this) {
            try {
                if (this.c != null) {
                    return null;
                }
                o2g.O(mo4Var, "stream");
                mo4 mo4Var2 = this.c;
                o2g.S(mo4Var2, "realStream already set to %s", mo4Var2 == null);
                this.c = mo4Var;
                this.h = System.nanoTime();
                oo4 oo4Var = this.b;
                if (oo4Var == null) {
                    this.e = null;
                    this.a = true;
                }
                if (oo4Var == null) {
                    return null;
                }
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.i = null;
                this.c.v0(oo4Var);
                return new nv7(this, 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mo4
    public final void f(sgr sgrVar) {
        boolean z = false;
        boolean z2 = true;
        o2g.U("May only be called after start", this.b != null);
        o2g.O(sgrVar, "reason");
        synchronized (this) {
            try {
                mo4 mo4Var = this.c;
                if (mo4Var == null) {
                    lej lejVar = lej.a;
                    if (mo4Var != null) {
                        z2 = false;
                    }
                    o2g.S(mo4Var, "realStream already set to %s", z2);
                    this.c = lejVar;
                    this.h = System.nanoTime();
                    this.d = sgrVar;
                } else {
                    z = true;
                }
            } finally {
            }
        }
        if (z) {
            b(new x8x(this, sgrVar, false, 29));
        } else {
            c();
            for (qo4 qo4Var : this.l) {
                qo4Var.m(sgrVar);
            }
            this.b.n(sgrVar, no4.a, new s2i());
        }
        synchronized (this.m.b) {
            try {
                mv7 mv7Var = this.m;
                if (mv7Var.g != null) {
                    boolean remove = mv7Var.i.remove(this);
                    if (!this.m.g() && remove) {
                        mv7 mv7Var2 = this.m;
                        mv7Var2.d.b(mv7Var2.f);
                        mv7 mv7Var3 = this.m;
                        if (mv7Var3.j != null) {
                            mv7Var3.d.b(mv7Var3.g);
                            this.m.g = null;
                        }
                    }
                }
            } finally {
            }
        }
        this.m.d.a();
    }

    @Override // defpackage.bjr
    public final void flush() {
        o2g.U("May only be called after start", this.b != null);
        if (this.a) {
            this.c.flush();
        } else {
            b(new nv7(this, 3));
        }
    }

    @Override // defpackage.mo4
    public final void h0(ce7 ce7Var) {
        o2g.U("May only be called before start", this.b == null);
        this.i.add(new x8x(this, ce7Var, false, 27));
    }

    @Override // defpackage.mo4
    public final void l(int i) {
        o2g.U("May only be called before start", this.b == null);
        this.i.add(new ov7(this, i, 1));
    }

    @Override // defpackage.mo4
    public final void l0() {
        o2g.U("May only be called after start", this.b != null);
        b(new nv7(this, 4));
    }

    @Override // defpackage.bjr
    public final boolean p() {
        if (this.a) {
            return this.c.p();
        }
        return false;
    }

    @Override // defpackage.bjr
    public final void r(nq4 nq4Var) {
        o2g.U("May only be called before start", this.b == null);
        this.i.add(new x8x(this, nq4Var, false, 25));
    }

    @Override // defpackage.mo4
    public final void v0(oo4 oo4Var) {
        sgr sgrVar;
        boolean z;
        o2g.O(oo4Var, "listener");
        o2g.U("already started", this.b == null);
        synchronized (this) {
            try {
                sgrVar = this.d;
                z = this.a;
                if (!z) {
                    qv7 qv7Var = new qv7(oo4Var);
                    this.f = qv7Var;
                    oo4Var = qv7Var;
                }
                this.b = oo4Var;
                this.g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sgrVar != null) {
            oo4Var.n(sgrVar, no4.a, new s2i());
            return;
        }
        if (z) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.i = null;
            this.c.v0(oo4Var);
        }
    }

    @Override // defpackage.mo4
    public final void y0(joe joeVar) {
        if (Boolean.TRUE.equals(this.j.a.e)) {
            joeVar.b.add("wait_for_ready");
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    return;
                }
                if (this.c != null) {
                    joeVar.f(Long.valueOf(this.h - this.g), "buffered_nanos");
                    this.c.y0(joeVar);
                } else {
                    joeVar.f(Long.valueOf(System.nanoTime() - this.g), "buffered_nanos");
                    joeVar.b.add("waiting_for_connection");
                }
            } finally {
            }
        }
    }
}
