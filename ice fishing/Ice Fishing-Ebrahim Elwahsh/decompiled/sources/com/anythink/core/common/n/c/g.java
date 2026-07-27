package com.anythink.core.common.n.c;

import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class g implements v {

    /* renamed from: a, reason: collision with root package name */
    private final d f16021a;

    /* renamed from: b, reason: collision with root package name */
    private final Deflater f16022b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16023c;

    private g(v vVar, Deflater deflater) {
        this(n.a(vVar), deflater);
    }

    @Override // com.anythink.core.common.n.c.v
    public final void a(c cVar, long j9) {
        y.a(cVar.f16005c, 0L, j9);
        while (j9 > 0) {
            s sVar = cVar.f16004b;
            int min = (int) Math.min(j9, sVar.f16074e - sVar.f16073d);
            this.f16022b.setInput(sVar.f16072c, sVar.f16073d, min);
            a(false);
            long j10 = min;
            cVar.f16005c -= j10;
            int i = sVar.f16073d + min;
            sVar.f16073d = i;
            if (i == sVar.f16074e) {
                cVar.f16004b = sVar.c();
                t.a(sVar);
            }
            j9 -= j10;
        }
    }

    public final void b() {
        this.f16022b.finish();
        a(false);
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16023c) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f16022b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f16021a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f16023c = true;
        if (th != null) {
            y.a(th);
        }
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Flushable
    public final void flush() {
        a(true);
        this.f16021a.flush();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f16021a + ")";
    }

    public g(d dVar, Deflater deflater) {
        if (dVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f16021a = dVar;
        this.f16022b = deflater;
    }

    private void a(boolean z8) {
        s g9;
        int deflate;
        c c4 = this.f16021a.c();
        while (true) {
            g9 = c4.g(1);
            if (z8) {
                Deflater deflater = this.f16022b;
                byte[] bArr = g9.f16072c;
                int i = g9.f16074e;
                deflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                Deflater deflater2 = this.f16022b;
                byte[] bArr2 = g9.f16072c;
                int i4 = g9.f16074e;
                deflate = deflater2.deflate(bArr2, i4, 8192 - i4);
            }
            if (deflate > 0) {
                g9.f16074e += deflate;
                c4.f16005c += deflate;
                this.f16021a.A();
            } else if (this.f16022b.needsInput()) {
                break;
            }
        }
        if (g9.f16073d == g9.f16074e) {
            c4.f16004b = g9.c();
            t.a(g9);
        }
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.f16021a.a();
    }
}
