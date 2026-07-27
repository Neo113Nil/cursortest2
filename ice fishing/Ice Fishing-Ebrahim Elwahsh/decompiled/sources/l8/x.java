package l8;

import h.I;
import java.io.IOException;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class x implements u8.x {

    /* renamed from: n, reason: collision with root package name */
    public final long f39204n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39205u;

    /* renamed from: v, reason: collision with root package name */
    public final u8.e f39206v = new u8.e();

    /* renamed from: w, reason: collision with root package name */
    public final u8.e f39207w = new u8.e();

    /* renamed from: x, reason: collision with root package name */
    public boolean f39208x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f39209y;

    public x(z zVar, long j9, boolean z8) {
        this.f39209y = zVar;
        this.f39204n = j9;
        this.f39205u = z8;
    }

    @Override // u8.x
    public final u8.z L() {
        return this.f39209y.f39213C;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j9;
        z zVar = this.f39209y;
        synchronized (zVar) {
            this.f39208x = true;
            u8.e eVar = this.f39207w;
            j9 = eVar.f41277u;
            eVar.H(j9);
            zVar.notifyAll();
        }
        if (j9 > 0) {
            TimeZone timeZone = f8.d.f37815a;
            this.f39209y.f39218u.j(j9);
        }
        this.f39209y.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000c, B:7:0x0019, B:12:0x0023, B:32:0x00aa, B:59:0x00d0, B:60:0x00d5, B:14:0x002c, B:16:0x0032, B:18:0x0036, B:20:0x003a, B:21:0x004b, B:23:0x004f, B:25:0x005b, B:27:0x0076, B:29:0x0085, B:45:0x009b, B:48:0x00a1, B:52:0x00c6, B:53:0x00cd), top: B:4:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:14:0x002c, B:16:0x0032, B:18:0x0036, B:20:0x003a, B:21:0x004b, B:23:0x004f, B:25:0x005b, B:27:0x0076, B:29:0x0085, B:45:0x009b, B:48:0x00a1, B:52:0x00c6, B:53:0x00cd), top: B:13:0x002c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6 A[SYNTHETIC] */
    @Override // u8.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(long j9, u8.e sink) {
        boolean z8;
        boolean z9;
        Throwable th;
        long j10;
        kotlin.jvm.internal.h.e(sink, "sink");
        do {
            z zVar = this.f39209y;
            synchronized (zVar) {
                zVar.f39218u.getClass();
                w wVar = zVar.f39212B;
                z8 = true;
                try {
                    if (!wVar.f39202v && !wVar.f39200n) {
                        z9 = false;
                        if (z9) {
                            zVar.f39213C.h();
                        }
                        if (zVar.g() != null || this.f39205u) {
                            th = null;
                        } else {
                            th = zVar.f39216F;
                            if (th == null) {
                                EnumC4710b g9 = zVar.g();
                                kotlin.jvm.internal.h.b(g9);
                                th = new E(g9);
                            }
                        }
                        if (!this.f39208x) {
                            throw new IOException("stream closed");
                        }
                        u8.e eVar = this.f39207w;
                        long j11 = eVar.f41277u;
                        if (j11 > 0) {
                            j10 = eVar.f(Math.min(8192L, j11), sink);
                            I.c(zVar.f39219v, j10, 0L, 2);
                            long b9 = zVar.f39219v.b();
                            if (th == null && b9 >= zVar.f39218u.J.a() / 2) {
                                zVar.f39218u.n(zVar.f39217n, b9);
                                I.c(zVar.f39219v, 0L, b9, 1);
                            }
                            z8 = false;
                        } else {
                            if (this.f39205u || th != null) {
                                z8 = false;
                            } else {
                                zVar.l();
                            }
                            j10 = -1;
                        }
                    }
                    if (zVar.g() != null) {
                    }
                    th = null;
                    if (!this.f39208x) {
                    }
                } finally {
                    if (z9) {
                        zVar.f39213C.l();
                    }
                }
                z9 = true;
                if (z9) {
                }
            }
            this.f39209y.f39218u.f39166I.getClass();
        } while (z8);
        if (j10 != -1) {
            return j10;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }
}
