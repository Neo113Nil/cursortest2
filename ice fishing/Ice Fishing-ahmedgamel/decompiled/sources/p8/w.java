package p8;

import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class w implements y8.v {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39920n;

    /* renamed from: u, reason: collision with root package name */
    public final y8.e f39921u = new y8.e();

    /* renamed from: v, reason: collision with root package name */
    public boolean f39922v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f39923w;

    public w(z zVar, boolean z3) {
        this.f39923w = zVar;
        this.f39920n = z3;
    }

    @Override // y8.v
    public final y8.z L() {
        return this.f39923w.f39934D;
    }

    @Override // y8.v
    public final void T(long j6, y8.e eVar) {
        TimeZone timeZone = j8.d.f38483a;
        y8.e eVar2 = this.f39921u;
        eVar2.T(j6, eVar);
        while (eVar2.f41953u >= 16384) {
            a(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z3) {
        long min;
        boolean z6;
        z zVar = this.f39923w;
        synchronized (zVar) {
            zVar.f39934D.h();
            while (zVar.f39940w >= zVar.f39941x && !this.f39920n && !this.f39922v && zVar.h() == null) {
                try {
                    zVar.l();
                } catch (Throwable th) {
                    zVar.f39934D.l();
                    throw th;
                }
            }
            zVar.f39934D.l();
            zVar.b();
            min = Math.min(zVar.f39941x - zVar.f39940w, this.f39921u.f41953u);
            zVar.f39940w += min;
            z6 = z3 && min == this.f39921u.f41953u;
        }
        this.f39923w.f39934D.h();
        try {
            z zVar2 = this.f39923w;
            zVar2.f39938u.x(zVar2.f39937n, z6, this.f39921u, min);
        } finally {
            this.f39923w.f39934D.l();
        }
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f39923w;
        TimeZone timeZone = j8.d.f38483a;
        synchronized (zVar) {
            if (this.f39922v) {
                return;
            }
            boolean z3 = zVar.h() == null;
            z zVar2 = this.f39923w;
            if (!zVar2.f39932B.f39920n) {
                if (this.f39921u.f41953u > 0) {
                    while (this.f39921u.f41953u > 0) {
                        a(true);
                    }
                } else if (z3) {
                    zVar2.f39938u.x(zVar2.f39937n, true, null, 0L);
                }
            }
            z zVar3 = this.f39923w;
            synchronized (zVar3) {
                this.f39922v = true;
                zVar3.notifyAll();
            }
            this.f39923w.f39938u.flush();
            this.f39923w.a();
        }
    }

    @Override // y8.v, java.io.Flushable
    public final void flush() {
        z zVar = this.f39923w;
        TimeZone timeZone = j8.d.f38483a;
        synchronized (zVar) {
            zVar.b();
        }
        while (this.f39921u.f41953u > 0) {
            a(false);
            this.f39923w.f39938u.flush();
        }
    }
}
