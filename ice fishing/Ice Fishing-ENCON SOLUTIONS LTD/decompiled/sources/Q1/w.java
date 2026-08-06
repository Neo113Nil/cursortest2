package Q1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class w implements W1.w {

    /* renamed from: a, reason: collision with root package name */
    public final long f1672a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1673b;

    /* renamed from: c, reason: collision with root package name */
    public final W1.g f1674c;

    /* renamed from: d, reason: collision with root package name */
    public final W1.g f1675d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f1677f;

    public w(y this$0, long j2, boolean z2) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this.f1677f = this$0;
        this.f1672a = j2;
        this.f1673b = z2;
        this.f1674c = new W1.g();
        this.f1675d = new W1.g();
    }

    public final void a(long j2) {
        byte[] bArr = K1.b.f1051a;
        this.f1677f.f1680b.l(j2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        y yVar = this.f1677f;
        synchronized (yVar) {
            this.f1676e = true;
            W1.g gVar = this.f1675d;
            j2 = gVar.f1875b;
            gVar.o(j2);
            yVar.notifyAll();
        }
        if (j2 > 0) {
            a(j2);
        }
        this.f1677f.a();
    }

    @Override // W1.w
    public final W1.y d() {
        return this.f1677f.f1689k;
    }

    @Override // W1.w
    public final long e(W1.g sink, long j2) {
        Throwable th;
        boolean z2;
        long j3;
        kotlin.jvm.internal.i.e(sink, "sink");
        do {
            y yVar = this.f1677f;
            synchronized (yVar) {
                yVar.f1689k.h();
                try {
                    if (yVar.f() == null || this.f1673b) {
                        th = null;
                    } else {
                        th = yVar.f1692n;
                        if (th == null) {
                            EnumC0079b f2 = yVar.f();
                            kotlin.jvm.internal.i.b(f2);
                            th = new E(f2);
                        }
                    }
                    if (this.f1676e) {
                        throw new IOException("stream closed");
                    }
                    W1.g gVar = this.f1675d;
                    long j4 = gVar.f1875b;
                    z2 = false;
                    if (j4 > 0) {
                        j3 = gVar.e(sink, Math.min(8192L, j4));
                        long j5 = yVar.f1681c + j3;
                        yVar.f1681c = j5;
                        long j6 = j5 - yVar.f1682d;
                        if (th == null && j6 >= yVar.f1680b.f1641p.a() / 2) {
                            yVar.f1680b.o(yVar.f1679a, j6);
                            yVar.f1682d = yVar.f1681c;
                        }
                    } else {
                        if (!this.f1673b && th == null) {
                            yVar.l();
                            z2 = true;
                        }
                        j3 = -1;
                    }
                    yVar.f1689k.k();
                } finally {
                }
            }
        } while (z2);
        if (j3 != -1) {
            a(j3);
            return j3;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }
}
