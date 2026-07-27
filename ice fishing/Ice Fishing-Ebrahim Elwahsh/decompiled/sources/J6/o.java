package J6;

import java.io.UncheckedIOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class o implements AutoCloseable {

    /* renamed from: n, reason: collision with root package name */
    public static final i f1447n;

    static {
        AtomicInteger atomicInteger = j.f1422n;
        f1447n = new i();
    }

    public abstract void B();

    public abstract void C();

    public abstract void D(b bVar, a aVar);

    public abstract void E(b bVar, int i);

    public abstract void F(b bVar, long j9);

    public abstract void G(b bVar, long j9);

    public abstract void H(String str, byte[] bArr);

    public abstract void I(b bVar, String str);

    public void J(b bVar, String str, j jVar) {
        I(bVar, str);
    }

    public abstract void K(b bVar, int i);

    public abstract void V(b bVar);

    public abstract void W(b bVar, int i);

    public abstract void X(b bVar, String str, int i, j jVar);

    public abstract void Y(b bVar, byte[] bArr);

    public abstract void Z(b bVar, String str);

    public final void a(b bVar, f fVar) {
        K(bVar, fVar.a());
        fVar.c(this);
        z();
    }

    public void a0(b bVar, String str, j jVar) {
        Z(bVar, str);
    }

    public final void b(b bVar, b6.g gVar, j jVar) {
        L6.a aVar = L6.a.f1748b;
        K(bVar, jVar.e());
        aVar.b(this, gVar, jVar);
        z();
    }

    public abstract void b0(b bVar, int i);

    public final void g(b bVar, Object obj, Object obj2, p pVar, j jVar) {
        K(bVar, jVar.e());
        pVar.d(this, obj, obj2, jVar);
        z();
    }

    public abstract void i(b bVar, List list);

    public abstract void j(b bVar, f[] fVarArr);

    public abstract void k(b bVar, List list, q qVar, j jVar);

    public final void m(b bVar, Map map, p pVar, j jVar, i iVar) {
        V(bVar);
        if (!map.isEmpty()) {
            n nVar = (n) jVar.d(iVar, new D5.a(5));
            nVar.f1443a = bVar;
            nVar.f1444b = this;
            nVar.f1445c = pVar;
            nVar.f1446d = jVar;
            try {
                map.forEach(nVar);
            } catch (UncheckedIOException e6) {
                throw e6.getCause();
            }
        }
        B();
    }

    public final void n(b bVar, byte[] bArr) {
        if (bArr.length == 0) {
            return;
        }
        Y(bVar, bArr);
    }

    public final void p(b bVar, String str, j jVar) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (jVar.f1423a) {
            X(bVar, str, jVar.e(), jVar);
        } else {
            Y(bVar, (byte[]) jVar.c(byte[].class));
        }
    }

    public abstract void q(b bVar, boolean z8);

    public abstract void w(b bVar, byte[] bArr);

    public abstract void x(b bVar, double d2);

    public abstract void z();
}
