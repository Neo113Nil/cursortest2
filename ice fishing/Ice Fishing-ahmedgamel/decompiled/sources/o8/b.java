package o8;

import y8.i;
import y8.p;
import y8.v;
import y8.z;

/* loaded from: classes2.dex */
public final class b implements v {

    /* renamed from: n, reason: collision with root package name */
    public final i f39658n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39659u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f39660v;

    public b(g gVar) {
        this.f39660v = gVar;
        this.f39658n = new i(((p) gVar.f39673c.f38406w).f41980n.L());
    }

    @Override // y8.v
    public final z L() {
        return this.f39658n;
    }

    @Override // y8.v
    public final void T(long j6, y8.e eVar) {
        if (this.f39659u) {
            throw new IllegalStateException("closed");
        }
        if (j6 == 0) {
            return;
        }
        p pVar = (p) this.f39660v.f39673c.f38406w;
        if (pVar.f41982v) {
            throw new IllegalStateException("closed");
        }
        pVar.f41981u.Z(j6);
        pVar.b();
        pVar.u("\r\n");
        pVar.T(j6, eVar);
        pVar.u("\r\n");
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f39659u) {
            return;
        }
        this.f39659u = true;
        ((p) this.f39660v.f39673c.f38406w).u("0\r\n\r\n");
        g gVar = this.f39660v;
        i iVar = this.f39658n;
        gVar.getClass();
        z zVar = iVar.f41958e;
        iVar.f41958e = z.f41999d;
        zVar.a();
        zVar.b();
        this.f39660v.f39674d = 3;
    }

    @Override // y8.v, java.io.Flushable
    public final synchronized void flush() {
        if (this.f39659u) {
            return;
        }
        ((p) this.f39660v.f39673c.f38406w).flush();
    }
}
