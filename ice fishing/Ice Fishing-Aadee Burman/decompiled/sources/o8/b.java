package o8;

import y8.i;
import y8.p;
import y8.v;
import y8.z;

/* loaded from: classes2.dex */
public final class b implements v {

    /* renamed from: n, reason: collision with root package name */
    public final i f39655n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39656u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f39657v;

    public b(g gVar) {
        this.f39657v = gVar;
        this.f39655n = new i(((p) gVar.f39670c.f38406w).f41977n.L());
    }

    @Override // y8.v
    public final z L() {
        return this.f39655n;
    }

    @Override // y8.v
    public final void T(long j6, y8.e eVar) {
        if (this.f39656u) {
            throw new IllegalStateException("closed");
        }
        if (j6 == 0) {
            return;
        }
        p pVar = (p) this.f39657v.f39670c.f38406w;
        if (pVar.f41979v) {
            throw new IllegalStateException("closed");
        }
        pVar.f41978u.Z(j6);
        pVar.b();
        pVar.u("\r\n");
        pVar.T(j6, eVar);
        pVar.u("\r\n");
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f39656u) {
            return;
        }
        this.f39656u = true;
        ((p) this.f39657v.f39670c.f38406w).u("0\r\n\r\n");
        g gVar = this.f39657v;
        i iVar = this.f39655n;
        gVar.getClass();
        z zVar = iVar.f41955e;
        iVar.f41955e = z.f41996d;
        zVar.a();
        zVar.b();
        this.f39657v.f39671d = 3;
    }

    @Override // y8.v, java.io.Flushable
    public final synchronized void flush() {
        if (this.f39656u) {
            return;
        }
        ((p) this.f39657v.f39670c.f38406w).flush();
    }
}
