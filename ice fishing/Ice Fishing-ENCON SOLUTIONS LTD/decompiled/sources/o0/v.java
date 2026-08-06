package o0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import f1.C0163N;
import java.util.Map;

/* loaded from: classes.dex */
public final class v extends q {

    /* renamed from: b, reason: collision with root package name */
    public final K.a f8318b;

    /* renamed from: c, reason: collision with root package name */
    public final D0.d f8319c;

    /* renamed from: d, reason: collision with root package name */
    public final C0163N f8320d;

    public v(int i2, K.a aVar, D0.d dVar, C0163N c0163n) {
        super(i2);
        this.f8319c = dVar;
        this.f8318b = aVar;
        this.f8320d = c0163n;
        if (i2 == 2 && aVar.f1018c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // o0.q
    public final boolean a(l lVar) {
        return this.f8318b.f1018c;
    }

    @Override // o0.q
    public final m0.d[] b(l lVar) {
        return (m0.d[]) this.f8318b.f1019d;
    }

    @Override // o0.q
    public final void c(Status status) {
        this.f8320d.getClass();
        this.f8319c.a(status.f2682c != null ? new n0.j(status) : new n0.d(status));
    }

    @Override // o0.q
    public final void d(RuntimeException runtimeException) {
        this.f8319c.a(runtimeException);
    }

    @Override // o0.q
    public final void e(l lVar) {
        D0.d dVar = this.f8319c;
        try {
            K.a aVar = this.f8318b;
            ((h) ((K.a) aVar.f1020e).f1019d).c(lVar.f8275b, dVar);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            c(q.g(e3));
        } catch (RuntimeException e4) {
            dVar.a(e4);
        }
    }

    @Override // o0.q
    public final void f(o.b bVar, boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        Map map = (Map) bVar.f8227c;
        D0.d dVar = this.f8319c;
        map.put(dVar, valueOf);
        o.b bVar2 = new o.b(1, bVar, dVar);
        D0.m mVar = dVar.f210a;
        mVar.getClass();
        mVar.f230b.c(new D0.g(D0.e.f211a, bVar2));
        mVar.h();
    }
}
