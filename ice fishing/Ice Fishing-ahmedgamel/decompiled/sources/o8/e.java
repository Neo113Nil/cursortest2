package o8;

import y8.i;
import y8.p;
import y8.v;
import y8.z;

/* loaded from: classes2.dex */
public final class e implements v {

    /* renamed from: n, reason: collision with root package name */
    public final i f39666n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39667u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f39668v;

    public e(g gVar) {
        this.f39668v = gVar;
        this.f39666n = new i(((p) gVar.f39673c.f38406w).f41980n.L());
    }

    @Override // y8.v
    public final z L() {
        return this.f39666n;
    }

    @Override // y8.v
    public final void T(long j6, y8.e eVar) {
        if (this.f39667u) {
            throw new IllegalStateException("closed");
        }
        long j9 = eVar.f41953u;
        byte[] bArr = j8.c.f38482a;
        if (j6 >= 0 && 0 <= j9 && j9 >= j6) {
            ((p) this.f39668v.f39673c.f38406w).T(j6, eVar);
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + j9 + ", offset=0, count=0");
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39667u) {
            return;
        }
        this.f39667u = true;
        g gVar = this.f39668v;
        gVar.getClass();
        i iVar = this.f39666n;
        z zVar = iVar.f41958e;
        iVar.f41958e = z.f41999d;
        zVar.a();
        zVar.b();
        gVar.f39674d = 3;
    }

    @Override // y8.v, java.io.Flushable
    public final void flush() {
        if (this.f39667u) {
            return;
        }
        ((p) this.f39668v.f39673c.f38406w).flush();
    }
}
