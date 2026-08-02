package o8;

import y8.i;
import y8.p;
import y8.v;
import y8.z;

/* loaded from: classes2.dex */
public final class b implements v {

    /* renamed from: n, reason: collision with root package name */
    public final i f39766n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39767u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f39768v;

    public b(g gVar) {
        this.f39768v = gVar;
        this.f39766n = new i(((p) gVar.f39781c.f38918w).f41951n.L());
    }

    @Override // y8.v
    public final z L() {
        return this.f39766n;
    }

    @Override // y8.v
    public final void T(long j6, y8.e eVar) {
        if (this.f39767u) {
            throw new IllegalStateException("closed");
        }
        if (j6 == 0) {
            return;
        }
        p pVar = (p) this.f39768v.f39781c.f38918w;
        if (pVar.f41953v) {
            throw new IllegalStateException("closed");
        }
        pVar.f41952u.Z(j6);
        pVar.b();
        pVar.u("\r\n");
        pVar.T(j6, eVar);
        pVar.u("\r\n");
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f39767u) {
            return;
        }
        this.f39767u = true;
        ((p) this.f39768v.f39781c.f38918w).u("0\r\n\r\n");
        g gVar = this.f39768v;
        i iVar = this.f39766n;
        gVar.getClass();
        z zVar = iVar.f41929e;
        iVar.f41929e = z.f41970d;
        zVar.a();
        zVar.b();
        this.f39768v.f39782d = 3;
    }

    @Override // y8.v, java.io.Flushable
    public final synchronized void flush() {
        if (this.f39767u) {
            return;
        }
        ((p) this.f39768v.f39781c.f38918w).flush();
    }
}
