package O2;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class P extends J {

    /* renamed from: b, reason: collision with root package name */
    public final F3.e f2209b;

    /* renamed from: c, reason: collision with root package name */
    public final j3.h f2210c;

    /* renamed from: d, reason: collision with root package name */
    public final a4.e f2211d;

    public P(int i, F3.e eVar, j3.h hVar, a4.e eVar2) {
        super(i);
        this.f2210c = hVar;
        this.f2209b = eVar;
        this.f2211d = eVar2;
        if (i == 2 && eVar.f960b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // O2.J
    public final boolean a(D d2) {
        return this.f2209b.f960b;
    }

    @Override // O2.J
    public final M2.d[] b(D d2) {
        return (M2.d[]) this.f2209b.f962d;
    }

    @Override // O2.J
    public final void c(Status status) {
        this.f2211d.getClass();
        this.f2210c.c(status.f23617v != null ? new N2.k(status) : new N2.f(status));
    }

    @Override // O2.J
    public final void d(RuntimeException runtimeException) {
        this.f2210c.c(runtimeException);
    }

    @Override // O2.J
    public final void e(D d2) {
        j3.h hVar = this.f2210c;
        try {
            F3.e eVar = this.f2209b;
            ((InterfaceC0359i) ((F3.e) eVar.f963e).f962d).accept(d2.f2172u, hVar);
        } catch (DeadObjectException e9) {
            throw e9;
        } catch (RemoteException e10) {
            c(J.g(e10));
        } catch (RuntimeException e11) {
            hVar.c(e11);
        }
    }

    @Override // O2.J
    public final void f(C0361k c0361k, boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        Map map = c0361k.f2256b;
        j3.h hVar = this.f2210c;
        map.put(hVar, valueOf);
        S0.c cVar = new S0.c(c0361k, hVar, 4, false);
        j3.m mVar = hVar.f38358a;
        mVar.getClass();
        mVar.f38370b.f(new j3.k(j3.i.f38359a, cVar));
        mVar.o();
    }
}
