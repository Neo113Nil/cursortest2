package p8;

import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class w implements y8.v {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39917n;

    /* renamed from: u, reason: collision with root package name */
    public final y8.e f39918u = new y8.e();

    /* renamed from: v, reason: collision with root package name */
    public boolean f39919v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f39920w;

    public w(z zVar, boolean z3) {
        this.f39920w = zVar;
        this.f39917n = z3;
    }

    @Override // y8.v
    public final y8.z L() {
        return this.f39920w.f39931D;
    }

    @Override // y8.v
    public final void T(long j6, y8.e eVar) {
        TimeZone timeZone = j8.d.f38483a;
        y8.e eVar2 = this.f39918u;
        eVar2.T(j6, eVar);
        while (eVar2.f41950u >= 16384) {
            a(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z3) {
        long min;
        boolean z6;
        z zVar = this.f39920w;
        synchronized (zVar) {
            zVar.f39931D.h();
            while (zVar.f39937w >= zVar.f39938x && !this.f39917n && !this.f39919v && zVar.h() == null) {
                try {
                    zVar.l();
                } catch (Throwable th) {
                    zVar.f39931D.l();
                    throw th;
                }
            }
            zVar.f39931D.l();
            zVar.b();
            min = Math.min(zVar.f39938x - zVar.f39937w, this.f39918u.f41950u);
            zVar.f39937w += min;
            z6 = z3 && min == this.f39918u.f41950u;
        }
        this.f39920w.f39931D.h();
        try {
            z zVar2 = this.f39920w;
            zVar2.f39935u.x(zVar2.f39934n, z6, this.f39918u, min);
        } finally {
            this.f39920w.f39931D.l();
        }
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f39920w;
        TimeZone timeZone = j8.d.f38483a;
        synchronized (zVar) {
            if (this.f39919v) {
                return;
            }
            boolean z3 = zVar.h() == null;
            z zVar2 = this.f39920w;
            if (!zVar2.f39929B.f39917n) {
                if (this.f39918u.f41950u > 0) {
                    while (this.f39918u.f41950u > 0) {
                        a(true);
                    }
                } else if (z3) {
                    zVar2.f39935u.x(zVar2.f39934n, true, null, 0L);
                }
            }
            z zVar3 = this.f39920w;
            synchronized (zVar3) {
                this.f39919v = true;
                zVar3.notifyAll();
            }
            this.f39920w.f39935u.flush();
            this.f39920w.a();
        }
    }

    @Override // y8.v, java.io.Flushable
    public final void flush() {
        z zVar = this.f39920w;
        TimeZone timeZone = j8.d.f38483a;
        synchronized (zVar) {
            zVar.b();
        }
        while (this.f39918u.f41950u > 0) {
            a(false);
            this.f39920w.f39935u.flush();
        }
    }
}
