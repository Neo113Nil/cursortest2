package N2;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class O extends I {

    /* renamed from: b, reason: collision with root package name */
    public final D3.f f2026b;

    /* renamed from: c, reason: collision with root package name */
    public final h3.h f2027c;

    /* renamed from: d, reason: collision with root package name */
    public final C3.e f2028d;

    public O(int i, D3.f fVar, h3.h hVar, C3.e eVar) {
        super(i);
        this.f2027c = hVar;
        this.f2026b = fVar;
        this.f2028d = eVar;
        if (i == 2 && fVar.f696b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // N2.I
    public final boolean a(C c4) {
        return this.f2026b.f696b;
    }

    @Override // N2.I
    public final L2.d[] b(C c4) {
        return (L2.d[]) this.f2026b.f698d;
    }

    @Override // N2.I
    public final void c(Status status) {
        this.f2028d.getClass();
        this.f2027c.c(status.f23770v != null ? new M2.k(status) : new M2.f(status));
    }

    @Override // N2.I
    public final void d(RuntimeException runtimeException) {
        this.f2027c.c(runtimeException);
    }

    @Override // N2.I
    public final void e(C c4) {
        h3.h hVar = this.f2027c;
        try {
            D3.f fVar = this.f2026b;
            ((InterfaceC0323i) ((D3.f) fVar.f699e).f698d).accept(c4.f1989u, hVar);
        } catch (DeadObjectException e6) {
            throw e6;
        } catch (RemoteException e9) {
            c(I.g(e9));
        } catch (RuntimeException e10) {
            hVar.c(e10);
        }
    }

    @Override // N2.I
    public final void f(S0.c cVar, boolean z8) {
        Boolean valueOf = Boolean.valueOf(z8);
        Map map = (Map) cVar.f2887v;
        h3.h hVar = this.f2027c;
        map.put(hVar, valueOf);
        S0.s sVar = new S0.s(cVar, hVar, 4, false);
        h3.n nVar = hVar.f38206a;
        nVar.getClass();
        nVar.f38221b.f(new h3.k(h3.i.f38207a, sVar));
        nVar.o();
    }
}
