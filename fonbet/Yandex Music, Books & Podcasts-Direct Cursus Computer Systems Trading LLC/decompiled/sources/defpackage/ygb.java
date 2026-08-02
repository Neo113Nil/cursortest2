package defpackage;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class ygb {
    public final gc8 a;
    public final boolean b;
    public final fdu c;
    public final ky9 d;
    public final f4e e;
    public boolean f;
    public final sf7 g;
    public ViewGroup h;
    public if7 i;

    public ygb(efb efbVar, gc8 gc8Var, boolean z, boolean z2, fdu fduVar, ky9 ky9Var) {
        this.a = gc8Var;
        this.b = z2;
        this.c = fduVar;
        this.d = ky9Var;
        f4e f4eVar = new f4e(gc8Var);
        this.e = f4eVar;
        this.f = z;
        this.g = new sf7(efbVar, gc8Var, z, z2, f4eVar);
        c();
    }

    public static final boolean a(ygb ygbVar) {
        return ygbVar.b || ygbVar.f || ygbVar.e.h;
    }

    public final void b(ViewGroup viewGroup) {
        gc8 gc8Var = this.a;
        d51 d51Var = d51.l;
        synchronized (d51Var) {
        }
        if (!qht.a.a()) {
            g23 d = gc8Var.getViewComponent$div_release().d();
            f23 a = d.a();
            try {
                d51Var.p(new zg(d, a, this, viewGroup, 7));
                return;
            } catch (Throwable th) {
                g23.b(a);
                throw th;
            }
        }
        this.h = viewGroup;
        if (a(this)) {
            if7 if7Var = this.i;
            if (if7Var != null) {
                if7Var.close();
            }
            this.i = new if7(viewGroup, this.a, this.g, this.d);
        }
    }

    public final void c() {
        gc8 gc8Var = this.a;
        d51 d51Var = d51.l;
        synchronized (d51Var) {
        }
        if (!qht.a.a()) {
            g23 d = gc8Var.getViewComponent$div_release().d();
            f23 a = d.a();
            try {
                d51Var.p(new t03(12, d, a, this));
                return;
            } catch (Throwable th) {
                g23.b(a);
                throw th;
            }
        }
        if (!a(this)) {
            if7 if7Var = this.i;
            if (if7Var != null) {
                if7Var.close();
            }
            this.i = null;
            return;
        }
        fdu fduVar = this.c;
        kma kmaVar = new kma(4, this);
        kmaVar.invoke(fduVar.a);
        fduVar.b.add(kmaVar);
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            b(viewGroup);
        }
    }
}
