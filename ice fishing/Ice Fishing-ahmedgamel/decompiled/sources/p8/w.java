package p8;

import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class w implements y8.v {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39967n;

    /* renamed from: u, reason: collision with root package name */
    public final y8.e f39968u = new y8.e();

    /* renamed from: v, reason: collision with root package name */
    public boolean f39969v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f39970w;

    public w(z zVar, boolean z6) {
        this.f39970w = zVar;
        this.f39967n = z6;
    }

    @Override // y8.v
    public final y8.z L() {
        return this.f39970w.f39981D;
    }

    @Override // y8.v
    public final void T(long j6, y8.e eVar) {
        TimeZone timeZone = j8.d.f38495a;
        y8.e eVar2 = this.f39968u;
        eVar2.T(j6, eVar);
        while (eVar2.f41924u >= 16384) {
            a(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z6) {
        long min;
        boolean z9;
        z zVar = this.f39970w;
        synchronized (zVar) {
            zVar.f39981D.h();
            while (zVar.f39987w >= zVar.f39988x && !this.f39967n && !this.f39969v && zVar.h() == null) {
                try {
                    zVar.l();
                } catch (Throwable th) {
                    zVar.f39981D.l();
                    throw th;
                }
            }
            zVar.f39981D.l();
            zVar.b();
            min = Math.min(zVar.f39988x - zVar.f39987w, this.f39968u.f41924u);
            zVar.f39987w += min;
            z9 = z6 && min == this.f39968u.f41924u;
        }
        this.f39970w.f39981D.h();
        try {
            z zVar2 = this.f39970w;
            zVar2.f39985u.x(zVar2.f39984n, z9, this.f39968u, min);
        } finally {
            this.f39970w.f39981D.l();
        }
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f39970w;
        TimeZone timeZone = j8.d.f38495a;
        synchronized (zVar) {
            if (this.f39969v) {
                return;
            }
            boolean z6 = zVar.h() == null;
            z zVar2 = this.f39970w;
            if (!zVar2.f39979B.f39967n) {
                if (this.f39968u.f41924u > 0) {
                    while (this.f39968u.f41924u > 0) {
                        a(true);
                    }
                } else if (z6) {
                    zVar2.f39985u.x(zVar2.f39984n, true, null, 0L);
                }
            }
            z zVar3 = this.f39970w;
            synchronized (zVar3) {
                this.f39969v = true;
                zVar3.notifyAll();
            }
            this.f39970w.f39985u.flush();
            this.f39970w.a();
        }
    }

    @Override // y8.v, java.io.Flushable
    public final void flush() {
        z zVar = this.f39970w;
        TimeZone timeZone = j8.d.f38495a;
        synchronized (zVar) {
            zVar.b();
        }
        while (this.f39968u.f41924u > 0) {
            a(false);
            this.f39970w.f39985u.flush();
        }
    }
}
