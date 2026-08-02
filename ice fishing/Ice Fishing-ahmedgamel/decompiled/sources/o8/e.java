package o8;

import y8.i;
import y8.p;
import y8.v;
import y8.z;

/* loaded from: classes2.dex */
public final class e implements v {

    /* renamed from: n, reason: collision with root package name */
    public final i f39774n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39775u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f39776v;

    public e(g gVar) {
        this.f39776v = gVar;
        this.f39774n = new i(((p) gVar.f39781c.f38918w).f41951n.L());
    }

    @Override // y8.v
    public final z L() {
        return this.f39774n;
    }

    @Override // y8.v
    public final void T(long j6, y8.e eVar) {
        if (this.f39775u) {
            throw new IllegalStateException("closed");
        }
        long j9 = eVar.f41924u;
        byte[] bArr = j8.c.f38494a;
        if (j6 >= 0 && 0 <= j9 && j9 >= j6) {
            ((p) this.f39776v.f39781c.f38918w).T(j6, eVar);
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + j9 + ", offset=0, count=0");
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39775u) {
            return;
        }
        this.f39775u = true;
        g gVar = this.f39776v;
        gVar.getClass();
        i iVar = this.f39774n;
        z zVar = iVar.f41929e;
        iVar.f41929e = z.f41970d;
        zVar.a();
        zVar.b();
        gVar.f39782d = 3;
    }

    @Override // y8.v, java.io.Flushable
    public final void flush() {
        if (this.f39775u) {
            return;
        }
        ((p) this.f39776v.f39781c.f38918w).flush();
    }
}
