package o6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n0 extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public final g7.h f5311b;

    public n0(g7.h hVar) {
        super(4);
        this.f5311b = hVar;
    }

    @Override // o6.h0
    public final boolean a(b0 b0Var) {
        if (b0Var.f5237i.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // o6.h0
    public final m6.d[] b(b0 b0Var) {
        if (b0Var.f5237i.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // o6.h0
    public final void c(Status status) {
        this.f5311b.b(new n6.d(status));
    }

    @Override // o6.h0
    public final void d(Exception exc) {
        this.f5311b.b(exc);
    }

    @Override // o6.h0
    public final void e(b0 b0Var) {
        try {
            h(b0Var);
        } catch (DeadObjectException e10) {
            c(h0.g(e10));
            throw e10;
        } catch (RemoteException e11) {
            c(h0.g(e11));
        } catch (RuntimeException e12) {
            this.f5311b.b(e12);
        }
    }

    public final void h(b0 b0Var) {
        if (b0Var.f5237i.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f5311b.c(Boolean.FALSE);
    }

    @Override // o6.h0
    public final /* bridge */ /* synthetic */ void f(x4.c cVar, boolean z10) {
    }
}
