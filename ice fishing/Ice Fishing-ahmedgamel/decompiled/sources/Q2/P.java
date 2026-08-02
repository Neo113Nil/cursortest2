package Q2;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class P extends I {

    /* renamed from: b, reason: collision with root package name */
    public final l3.h f2530b;

    public P(l3.h hVar) {
        super(4);
        this.f2530b = hVar;
    }

    @Override // Q2.I
    public final boolean a(C c9) {
        if (c9.f2494y.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // Q2.I
    public final O2.d[] b(C c9) {
        if (c9.f2494y.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // Q2.I
    public final void c(Status status) {
        this.f2530b.c(new P2.f(status));
    }

    @Override // Q2.I
    public final void d(RuntimeException runtimeException) {
        this.f2530b.c(runtimeException);
    }

    @Override // Q2.I
    public final void e(C c9) {
        try {
            h(c9);
        } catch (DeadObjectException e9) {
            c(I.g(e9));
            throw e9;
        } catch (RemoteException e10) {
            c(I.g(e10));
        } catch (RuntimeException e11) {
            this.f2530b.c(e11);
        }
    }

    public final void h(C c9) {
        if (c9.f2494y.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f2530b.d(Boolean.FALSE);
    }

    @Override // Q2.I
    public final /* bridge */ /* synthetic */ void f(S0.s sVar, boolean z6) {
    }
}
