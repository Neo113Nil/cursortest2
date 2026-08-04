package com.gamericefishpro.space.u8;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.gamericefishpro.space.i9.g4;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends h0 {
    public final g4 b;
    public final com.gamericefishpro.space.r9.h c;
    public final com.gamericefishpro.space.u4.b d;

    public m0(g4 g4Var, com.gamericefishpro.space.r9.h hVar, com.gamericefishpro.space.u4.b bVar) {
        super(2);
        this.c = hVar;
        this.b = g4Var;
        this.d = bVar;
        if (g4Var.a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.gamericefishpro.space.u8.h0
    public final boolean a(a0 a0Var) {
        return this.b.a;
    }

    @Override // com.gamericefishpro.space.u8.h0
    public final com.gamericefishpro.space.s8.d[] b(a0 a0Var) {
        return (com.gamericefishpro.space.s8.d[]) this.b.b;
    }

    @Override // com.gamericefishpro.space.u8.h0
    public final void c(Status status) {
        this.d.getClass();
        this.c.b(status.i != null ? new com.gamericefishpro.space.t8.h(status) : new com.gamericefishpro.space.t8.d(status));
    }

    @Override // com.gamericefishpro.space.u8.h0
    public final void d(Exception exc) {
        this.c.b(exc);
    }

    @Override // com.gamericefishpro.space.u8.h0
    public final void e(a0 a0Var) throws DeadObjectException {
        com.gamericefishpro.space.r9.h hVar = this.c;
        try {
            this.b.b(a0Var.e, hVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(h0.g(e2));
        } catch (RuntimeException e3) {
            hVar.b(e3);
        }
    }

    @Override // com.gamericefishpro.space.u8.h0
    public final void f(com.gamericefishpro.space.u6.c cVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) cVar.e;
        com.gamericefishpro.space.r9.h hVar = this.c;
        map.put(hVar, boolValueOf);
        hVar.a.addOnCompleteListener(new com.gamericefishpro.space.u6.s(cVar, hVar));
    }
}
