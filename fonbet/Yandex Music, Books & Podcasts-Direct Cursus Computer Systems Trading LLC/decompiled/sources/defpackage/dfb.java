package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class dfb implements y7k {
    public final rv8 b;
    public final Object c = new Object();
    public final ckj d = new ckj();
    public final ArrayList e = new ArrayList();
    public List f = c5b.a;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i = true;

    public dfb(rv8 rv8Var, dw8 dw8Var) {
        this.b = rv8Var;
    }

    @Override // defpackage.y7k
    public final void a(Exception exc) {
        exc.getClass();
        d(exc);
    }

    public final void b() {
        List list;
        synchronized (this.c) {
            try {
                rv8 rv8Var = this.b;
                if (rv8Var != null) {
                    list = rv8Var.h;
                    if (list == null) {
                    }
                    this.f = list;
                    f();
                }
                list = c5b.a;
                this.f = list;
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.c) {
            this.g.clear();
            this.e.clear();
            f();
        }
    }

    public final void d(Throwable th) {
        synchronized (this.c) {
            this.e.add(th);
            f();
        }
    }

    public final void e(Throwable th) {
        synchronized (this.c) {
            this.g.add(th);
            f();
        }
    }

    public final void f() {
        synchronized (this.c) {
            this.i = false;
            if (this.d.c == 0) {
                return;
            }
            g();
            Iterator it = this.d.iterator();
            while (true) {
                akj akjVar = (akj) it;
                if (!akjVar.hasNext()) {
                    return;
                } else {
                    ((Function2) akjVar.next()).invoke(this.h, this.g);
                }
            }
        }
    }

    public final void g() {
        if (this.i) {
            return;
        }
        ArrayList arrayList = this.h;
        arrayList.clear();
        arrayList.addAll(this.f);
        arrayList.addAll(this.e);
        this.i = true;
    }
}
