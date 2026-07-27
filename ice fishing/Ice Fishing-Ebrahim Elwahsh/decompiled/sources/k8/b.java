package k8;

import u8.i;
import u8.p;
import u8.v;
import u8.z;

/* loaded from: classes2.dex */
public final class b implements v {

    /* renamed from: n, reason: collision with root package name */
    public final i f38834n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f38835u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f38836v;

    public b(g gVar) {
        this.f38836v = gVar;
        this.f38834n = new i(((p) gVar.f38849c.f3965w).f41304n.L());
    }

    @Override // u8.v
    public final z L() {
        return this.f38834n;
    }

    @Override // u8.v
    public final void N(long j9, u8.e eVar) {
        if (this.f38835u) {
            throw new IllegalStateException("closed");
        }
        if (j9 == 0) {
            return;
        }
        p pVar = (p) this.f38836v.f38849c.f3965w;
        if (pVar.f41306v) {
            throw new IllegalStateException("closed");
        }
        pVar.f41305u.Z(j9);
        pVar.b();
        pVar.u("\r\n");
        pVar.N(j9, eVar);
        pVar.u("\r\n");
    }

    @Override // u8.v, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f38835u) {
            return;
        }
        this.f38835u = true;
        ((p) this.f38836v.f38849c.f3965w).u("0\r\n\r\n");
        g gVar = this.f38836v;
        i iVar = this.f38834n;
        gVar.getClass();
        z zVar = iVar.f41282e;
        iVar.f41282e = z.f41323d;
        zVar.a();
        zVar.b();
        this.f38836v.f38850d = 3;
    }

    @Override // u8.v, java.io.Flushable
    public final synchronized void flush() {
        if (this.f38835u) {
            return;
        }
        ((p) this.f38836v.f38849c.f3965w).flush();
    }
}
