package h3;

import O2.w;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final n f38206a = new n();

    public final void a(Exception exc) {
        this.f38206a.k(exc);
    }

    public final void b(Object obj) {
        this.f38206a.l(obj);
    }

    public final boolean c(Exception exc) {
        n nVar = this.f38206a;
        nVar.getClass();
        w.i(exc, "Exception must not be null");
        synchronized (nVar.f38220a) {
            try {
                if (nVar.f38222c) {
                    return false;
                }
                nVar.f38222c = true;
                nVar.f38225f = exc;
                nVar.f38221b.j(nVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        n nVar = this.f38206a;
        synchronized (nVar.f38220a) {
            try {
                if (nVar.f38222c) {
                    return;
                }
                nVar.f38222c = true;
                nVar.f38224e = obj;
                nVar.f38221b.j(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
