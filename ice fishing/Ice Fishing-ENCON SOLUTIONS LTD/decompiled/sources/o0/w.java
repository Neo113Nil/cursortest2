package o0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class w extends q {

    /* renamed from: b, reason: collision with root package name */
    public final D0.d f8321b;

    public w(D0.d dVar) {
        super(4);
        this.f8321b = dVar;
    }

    @Override // o0.q
    public final boolean a(l lVar) {
        if (lVar.f8279f.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // o0.q
    public final m0.d[] b(l lVar) {
        if (lVar.f8279f.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // o0.q
    public final void c(Status status) {
        this.f8321b.a(new n0.d(status));
    }

    @Override // o0.q
    public final void d(RuntimeException runtimeException) {
        this.f8321b.a(runtimeException);
    }

    @Override // o0.q
    public final void e(l lVar) {
        try {
            h(lVar);
        } catch (DeadObjectException e2) {
            c(q.g(e2));
            throw e2;
        } catch (RemoteException e3) {
            c(q.g(e3));
        } catch (RuntimeException e4) {
            this.f8321b.a(e4);
        }
    }

    public final void h(l lVar) {
        if (lVar.f8279f.remove(null) != null) {
            throw new ClassCastException();
        }
        D0.d dVar = this.f8321b;
        Boolean bool = Boolean.FALSE;
        D0.m mVar = dVar.f210a;
        synchronized (mVar.f229a) {
            try {
                if (mVar.f231c) {
                    return;
                }
                mVar.f231c = true;
                mVar.f233e = bool;
                mVar.f230b.d(mVar);
            } finally {
            }
        }
    }

    @Override // o0.q
    public final /* bridge */ /* synthetic */ void f(o.b bVar, boolean z2) {
    }
}
