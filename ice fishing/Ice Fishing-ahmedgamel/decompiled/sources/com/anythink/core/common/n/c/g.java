package com.anythink.core.common.n.c;

import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class g implements v {

    /* renamed from: a, reason: collision with root package name */
    private final d f16650a;

    /* renamed from: b, reason: collision with root package name */
    private final Deflater f16651b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16652c;

    private g(v vVar, Deflater deflater) {
        this(n.a(vVar), deflater);
    }

    @Override // com.anythink.core.common.n.c.v
    public final void a(c cVar, long j6) {
        y.a(cVar.f16634c, 0L, j6);
        while (j6 > 0) {
            s sVar = cVar.f16633b;
            int min = (int) Math.min(j6, sVar.f16703e - sVar.f16702d);
            this.f16651b.setInput(sVar.f16701c, sVar.f16702d, min);
            a(false);
            long j9 = min;
            cVar.f16634c -= j9;
            int i = sVar.f16702d + min;
            sVar.f16702d = i;
            if (i == sVar.f16703e) {
                cVar.f16633b = sVar.c();
                t.a(sVar);
            }
            j6 -= j9;
        }
    }

    public final void b() {
        this.f16651b.finish();
        a(false);
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16652c) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f16651b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f16650a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f16652c = true;
        if (th != null) {
            y.a(th);
        }
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Flushable
    public final void flush() {
        a(true);
        this.f16650a.flush();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f16650a + ")";
    }

    public g(d dVar, Deflater deflater) {
        if (dVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f16650a = dVar;
        this.f16651b = deflater;
    }

    private void a(boolean z6) {
        s g9;
        int deflate;
        c c9 = this.f16650a.c();
        while (true) {
            g9 = c9.g(1);
            if (z6) {
                Deflater deflater = this.f16651b;
                byte[] bArr = g9.f16701c;
                int i = g9.f16703e;
                deflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                Deflater deflater2 = this.f16651b;
                byte[] bArr2 = g9.f16701c;
                int i4 = g9.f16703e;
                deflate = deflater2.deflate(bArr2, i4, 8192 - i4);
            }
            if (deflate > 0) {
                g9.f16703e += deflate;
                c9.f16634c += deflate;
                this.f16650a.A();
            } else if (this.f16651b.needsInput()) {
                break;
            }
        }
        if (g9.f16702d == g9.f16703e) {
            c9.f16633b = g9.c();
            t.a(g9);
        }
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.f16650a.a();
    }
}
