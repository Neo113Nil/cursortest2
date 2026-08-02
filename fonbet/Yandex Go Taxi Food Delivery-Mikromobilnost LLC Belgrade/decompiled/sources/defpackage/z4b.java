package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class z4b implements e1k {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    public z4b(u7b u7bVar) {
        this.c = u7bVar;
        u7bVar.e++;
        u7bVar.a(u7bVar.c.f(new t7b(0, u7bVar)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x08 x08Var;
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                b5b b5bVar = (b5b) obj;
                z83.g(null, b5bVar.a, Looper.myLooper());
                if (!this.b) {
                    this.b = true;
                    int i2 = b5bVar.f - 1;
                    b5bVar.f = i2;
                    if (i2 == 0) {
                        w0j0 w0j0Var = b5bVar.g;
                        if (w0j0Var != null) {
                            w0j0Var.cancel();
                            b5bVar.g = null;
                        }
                        w0j0 w0j0Var2 = b5bVar.h;
                        if (w0j0Var2 != null) {
                            w0j0Var2.cancel();
                            b5bVar.h = null;
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (!this.b) {
                    this.b = true;
                    u7b u7bVar = (u7b) obj;
                    int i3 = u7bVar.e - 1;
                    u7bVar.e = i3;
                    if (i3 <= 0) {
                        u7bVar.a(null);
                        break;
                    }
                }
                break;
            default:
                rln rlnVar = (rln) obj;
                z83.g(null, rlnVar.b, Looper.myLooper());
                if (!this.b) {
                    this.b = true;
                    int i4 = rlnVar.h - 1;
                    rlnVar.h = i4;
                    z83.h(null, i4 >= 0);
                    if (rlnVar.h == 0 && (x08Var = rlnVar.g) != null) {
                        x08Var.cancel();
                        rlnVar.g = null;
                        break;
                    }
                }
                break;
        }
    }

    public z4b(b5b b5bVar) {
        this.c = b5bVar;
    }

    public z4b(rln rlnVar) {
        this.c = rlnVar;
        z83.g(null, rlnVar.b, Looper.myLooper());
        rlnVar.h++;
        rlnVar.b();
    }
}
