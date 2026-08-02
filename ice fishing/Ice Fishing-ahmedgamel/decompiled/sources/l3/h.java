package l3;

import R2.w;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final m f38870a = new m();

    public final void a(Exception exc) {
        this.f38870a.k(exc);
    }

    public final void b(Object obj) {
        this.f38870a.l(obj);
    }

    public final boolean c(Exception exc) {
        m mVar = this.f38870a;
        mVar.getClass();
        w.i(exc, "Exception must not be null");
        synchronized (mVar.f38881a) {
            try {
                if (mVar.f38883c) {
                    return false;
                }
                mVar.f38883c = true;
                mVar.f38886f = exc;
                mVar.f38882b.j(mVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        m mVar = this.f38870a;
        synchronized (mVar.f38881a) {
            try {
                if (mVar.f38883c) {
                    return;
                }
                mVar.f38883c = true;
                mVar.f38885e = obj;
                mVar.f38882b.j(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
