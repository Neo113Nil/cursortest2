package N6;

import java.io.UncheckedIOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class o implements AutoCloseable {

    /* renamed from: n, reason: collision with root package name */
    public static final i f2000n;

    static {
        AtomicInteger atomicInteger = j.f1975n;
        f2000n = new i();
    }

    public abstract void B();

    public abstract void C();

    public abstract void D(b bVar, a aVar);

    public abstract void E(b bVar, int i);

    public abstract void F(b bVar, long j6);

    public abstract void G(b bVar, long j6);

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

    public final void b(b bVar, f6.g gVar, j jVar) {
        P6.a aVar = P6.a.f2560b;
        K(bVar, jVar.e());
        aVar.c(this, gVar, jVar);
        z();
    }

    public abstract void b0(b bVar, int i);

    public final void i(b bVar, Object obj, Object obj2, p pVar, j jVar) {
        K(bVar, jVar.e());
        pVar.b(this, obj, obj2, jVar);
        z();
    }

    public abstract void j(b bVar, List list);

    public abstract void k(b bVar, f[] fVarArr);

    public abstract void l(b bVar, List list, q qVar, j jVar);

    public final void m(b bVar, Map map, p pVar, j jVar, i iVar) {
        V(bVar);
        if (!map.isEmpty()) {
            n nVar = (n) jVar.d(iVar, new H5.a(5));
            nVar.f1996a = bVar;
            nVar.f1997b = this;
            nVar.f1998c = pVar;
            nVar.f1999d = jVar;
            try {
                map.forEach(nVar);
            } catch (UncheckedIOException e9) {
                throw e9.getCause();
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
        if (jVar.f1976a) {
            X(bVar, str, jVar.e(), jVar);
        } else {
            Y(bVar, (byte[]) jVar.c(byte[].class));
        }
    }

    public abstract void q(b bVar, boolean z3);

    public abstract void w(b bVar, byte[] bArr);

    public abstract void x(b bVar, double d2);

    public abstract void z();
}
