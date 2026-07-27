package p8;

import h.C4540H;
import java.io.IOException;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class x implements y8.x {

    /* renamed from: n, reason: collision with root package name */
    public final long f39921n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39922u;

    /* renamed from: v, reason: collision with root package name */
    public final y8.e f39923v = new y8.e();

    /* renamed from: w, reason: collision with root package name */
    public final y8.e f39924w = new y8.e();

    /* renamed from: x, reason: collision with root package name */
    public boolean f39925x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f39926y;

    public x(z zVar, long j6, boolean z3) {
        this.f39926y = zVar;
        this.f39921n = j6;
        this.f39922u = z3;
    }

    @Override // y8.x
    public final y8.z L() {
        return this.f39926y.f39930C;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j6;
        z zVar = this.f39926y;
        synchronized (zVar) {
            this.f39925x = true;
            y8.e eVar = this.f39924w;
            j6 = eVar.f41950u;
            eVar.H(j6);
            zVar.notifyAll();
        }
        if (j6 > 0) {
            TimeZone timeZone = j8.d.f38483a;
            this.f39926y.f39935u.w(j6);
        }
        this.f39926y.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000c, B:7:0x0019, B:12:0x0023, B:32:0x00aa, B:59:0x00d0, B:60:0x00d5, B:14:0x002c, B:16:0x0032, B:18:0x0036, B:20:0x003a, B:21:0x004b, B:23:0x004f, B:25:0x005b, B:27:0x0076, B:29:0x0085, B:45:0x009b, B:48:0x00a1, B:52:0x00c6, B:53:0x00cd), top: B:4:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:14:0x002c, B:16:0x0032, B:18:0x0036, B:20:0x003a, B:21:0x004b, B:23:0x004f, B:25:0x005b, B:27:0x0076, B:29:0x0085, B:45:0x009b, B:48:0x00a1, B:52:0x00c6, B:53:0x00cd), top: B:13:0x002c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6 A[SYNTHETIC] */
    @Override // y8.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(long j6, y8.e sink) {
        boolean z3;
        boolean z6;
        Throwable th;
        long j9;
        kotlin.jvm.internal.h.e(sink, "sink");
        do {
            z zVar = this.f39926y;
            synchronized (zVar) {
                zVar.f39935u.getClass();
                w wVar = zVar.f39929B;
                z3 = true;
                try {
                    if (!wVar.f39919v && !wVar.f39917n) {
                        z6 = false;
                        if (z6) {
                            zVar.f39930C.h();
                        }
                        if (zVar.h() != null || this.f39922u) {
                            th = null;
                        } else {
                            th = zVar.f39933F;
                            if (th == null) {
                                EnumC4856b h9 = zVar.h();
                                kotlin.jvm.internal.h.b(h9);
                                th = new E(h9);
                            }
                        }
                        if (!this.f39925x) {
                            throw new IOException("stream closed");
                        }
                        y8.e eVar = this.f39924w;
                        long j10 = eVar.f41950u;
                        if (j10 > 0) {
                            j9 = eVar.d(Math.min(8192L, j10), sink);
                            C4540H.c(zVar.f39936v, j9, 0L, 2);
                            long b9 = zVar.f39936v.b();
                            if (th == null && b9 >= zVar.f39935u.J.a() / 2) {
                                zVar.f39935u.z(zVar.f39934n, b9);
                                C4540H.c(zVar.f39936v, 0L, b9, 1);
                            }
                            z3 = false;
                        } else {
                            if (this.f39922u || th != null) {
                                z3 = false;
                            } else {
                                zVar.l();
                            }
                            j9 = -1;
                        }
                    }
                    if (zVar.h() != null) {
                    }
                    th = null;
                    if (!this.f39925x) {
                    }
                } finally {
                    if (z6) {
                        zVar.f39930C.l();
                    }
                }
                z6 = true;
                if (z6) {
                }
            }
            this.f39926y.f39935u.f39883I.getClass();
        } while (z3);
        if (j9 != -1) {
            return j9;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }
}
