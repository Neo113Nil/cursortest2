package j3;

import P2.w;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final m f38358a = new m();

    public final void a(Exception exc) {
        this.f38358a.k(exc);
    }

    public final void b(Object obj) {
        this.f38358a.l(obj);
    }

    public final boolean c(Exception exc) {
        m mVar = this.f38358a;
        mVar.getClass();
        w.i(exc, "Exception must not be null");
        synchronized (mVar.f38369a) {
            try {
                if (mVar.f38371c) {
                    return false;
                }
                mVar.f38371c = true;
                mVar.f38374f = exc;
                mVar.f38370b.j(mVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        m mVar = this.f38358a;
        synchronized (mVar.f38369a) {
            try {
                if (mVar.f38371c) {
                    return;
                }
                mVar.f38371c = true;
                mVar.f38373e = obj;
                mVar.f38370b.j(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
