package o6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m0 extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public final g7.m f5307b;

    /* renamed from: c, reason: collision with root package name */
    public final g7.h f5308c;

    /* renamed from: d, reason: collision with root package name */
    public final m6.i f5309d;

    public m0(g7.m mVar, g7.h hVar, m6.i iVar) {
        super(2);
        this.f5308c = hVar;
        this.f5307b = mVar;
        this.f5309d = iVar;
        if (mVar.f2548a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // o6.h0
    public final boolean a(b0 b0Var) {
        return this.f5307b.f2548a;
    }

    @Override // o6.h0
    public final m6.d[] b(b0 b0Var) {
        return (m6.d[]) this.f5307b.f2549b;
    }

    @Override // o6.h0
    public final void c(Status status) {
        this.f5309d.getClass();
        this.f5308c.b(status.f1423i != null ? new n6.h(status) : new n6.d(status));
    }

    @Override // o6.h0
    public final void d(Exception exc) {
        this.f5308c.b(exc);
    }

    @Override // o6.h0
    public final void e(b0 b0Var) {
        g7.h hVar = this.f5308c;
        try {
            this.f5307b.a(b0Var.f5233e, hVar);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            c(h0.g(e11));
        } catch (RuntimeException e12) {
            hVar.b(e12);
        }
    }

    @Override // o6.h0
    public final void f(x4.c cVar, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = (Map) cVar.f8291h;
        g7.h hVar = this.f5308c;
        map.put(hVar, valueOf);
        g7.o oVar = hVar.f2537a;
        x4.s sVar = new x4.s(cVar, hVar);
        oVar.getClass();
        oVar.f2553b.b(new g7.k(g7.i.f2538a, sVar));
        oVar.o();
    }
}
