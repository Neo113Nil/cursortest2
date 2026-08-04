package com.gamericefishpro.space.u8;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends h0 {
    public final com.gamericefishpro.space.r9.h b;

    public n0(com.gamericefishpro.space.r9.h hVar) {
        super(4);
        this.b = hVar;
    }

    @Override // com.gamericefishpro.space.u8.h0
    public final boolean a(a0 a0Var) {
        if (a0Var.i.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // com.gamericefishpro.space.u8.h0
    public final com.gamericefishpro.space.s8.d[] b(a0 a0Var) {
        if (a0Var.i.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // com.gamericefishpro.space.u8.h0
    public final void c(Status status) {
        this.b.b(new com.gamericefishpro.space.t8.d(status));
    }

    @Override // com.gamericefishpro.space.u8.h0
    public final void d(Exception exc) {
        this.b.b(exc);
    }

    @Override // com.gamericefishpro.space.u8.h0
    public final void e(a0 a0Var) throws DeadObjectException {
        try {
            h(a0Var);
        } catch (DeadObjectException e) {
            c(h0.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(h0.g(e2));
        } catch (RuntimeException e3) {
            this.b.b(e3);
        }
    }

    public final void h(a0 a0Var) {
        if (a0Var.i.remove(null) != null) {
            throw new ClassCastException();
        }
        this.b.c(Boolean.FALSE);
    }

    @Override // com.gamericefishpro.space.u8.h0
    public final /* bridge */ /* synthetic */ void f(com.gamericefishpro.space.u6.c cVar, boolean z) {
    }
}
