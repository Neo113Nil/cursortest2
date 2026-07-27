package O2;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class Q extends J {

    /* renamed from: b, reason: collision with root package name */
    public final j3.h f2212b;

    public Q(j3.h hVar) {
        super(4);
        this.f2212b = hVar;
    }

    @Override // O2.J
    public final boolean a(D d2) {
        if (d2.f2176y.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // O2.J
    public final M2.d[] b(D d2) {
        if (d2.f2176y.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // O2.J
    public final void c(Status status) {
        this.f2212b.c(new N2.f(status));
    }

    @Override // O2.J
    public final void d(RuntimeException runtimeException) {
        this.f2212b.c(runtimeException);
    }

    @Override // O2.J
    public final void e(D d2) {
        try {
            h(d2);
        } catch (DeadObjectException e9) {
            c(J.g(e9));
            throw e9;
        } catch (RemoteException e10) {
            c(J.g(e10));
        } catch (RuntimeException e11) {
            this.f2212b.c(e11);
        }
    }

    public final void h(D d2) {
        if (d2.f2176y.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f2212b.d(Boolean.FALSE);
    }

    @Override // O2.J
    public final /* bridge */ /* synthetic */ void f(C0361k c0361k, boolean z3) {
    }
}
