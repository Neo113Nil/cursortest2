package o8;

import y8.i;
import y8.p;
import y8.v;
import y8.z;

/* loaded from: classes2.dex */
public final class e implements v {

    /* renamed from: n, reason: collision with root package name */
    public final i f39663n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39664u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f39665v;

    public e(g gVar) {
        this.f39665v = gVar;
        this.f39663n = new i(((p) gVar.f39670c.f38406w).f41977n.L());
    }

    @Override // y8.v
    public final z L() {
        return this.f39663n;
    }

    @Override // y8.v
    public final void T(long j6, y8.e eVar) {
        if (this.f39664u) {
            throw new IllegalStateException("closed");
        }
        long j9 = eVar.f41950u;
        byte[] bArr = j8.c.f38482a;
        if (j6 >= 0 && 0 <= j9 && j9 >= j6) {
            ((p) this.f39665v.f39670c.f38406w).T(j6, eVar);
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + j9 + ", offset=0, count=0");
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39664u) {
            return;
        }
        this.f39664u = true;
        g gVar = this.f39665v;
        gVar.getClass();
        i iVar = this.f39663n;
        z zVar = iVar.f41955e;
        iVar.f41955e = z.f41996d;
        zVar.a();
        zVar.b();
        gVar.f39671d = 3;
    }

    @Override // y8.v, java.io.Flushable
    public final void flush() {
        if (this.f39664u) {
            return;
        }
        ((p) this.f39665v.f39670c.f38406w).flush();
    }
}
