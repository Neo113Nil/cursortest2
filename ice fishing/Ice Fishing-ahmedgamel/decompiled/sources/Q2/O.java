package Q2;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class O extends I {

    /* renamed from: b, reason: collision with root package name */
    public final H3.e f2527b;

    /* renamed from: c, reason: collision with root package name */
    public final l3.h f2528c;

    /* renamed from: d, reason: collision with root package name */
    public final G3.e f2529d;

    public O(int i, H3.e eVar, l3.h hVar, G3.e eVar2) {
        super(i);
        this.f2528c = hVar;
        this.f2527b = eVar;
        this.f2529d = eVar2;
        if (i == 2 && eVar.f1245b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // Q2.I
    public final boolean a(C c9) {
        return this.f2527b.f1245b;
    }

    @Override // Q2.I
    public final O2.d[] b(C c9) {
        return (O2.d[]) this.f2527b.f1247d;
    }

    @Override // Q2.I
    public final void c(Status status) {
        this.f2529d.getClass();
        this.f2528c.c(status.f24397v != null ? new P2.k(status) : new P2.f(status));
    }

    @Override // Q2.I
    public final void d(RuntimeException runtimeException) {
        this.f2528c.c(runtimeException);
    }

    @Override // Q2.I
    public final void e(C c9) {
        l3.h hVar = this.f2528c;
        try {
            H3.e eVar = this.f2527b;
            ((InterfaceC0364i) ((H3.e) eVar.f1248e).f1247d).accept(c9.f2490u, hVar);
        } catch (DeadObjectException e9) {
            throw e9;
        } catch (RemoteException e10) {
            c(I.g(e10));
        } catch (RuntimeException e11) {
            hVar.c(e11);
        }
    }

    @Override // Q2.I
    public final void f(S0.s sVar, boolean z6) {
        Boolean valueOf = Boolean.valueOf(z6);
        Map map = (Map) sVar.f2970v;
        l3.h hVar = this.f2528c;
        map.put(hVar, valueOf);
        S0.l lVar = new S0.l(sVar, hVar, 4, false);
        l3.m mVar = hVar.f38870a;
        mVar.getClass();
        mVar.f38882b.f(new l3.k(l3.i.f38871a, lVar));
        mVar.o();
    }
}
