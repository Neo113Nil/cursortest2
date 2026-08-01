package com.anythink.core.common.n.c;

import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class g implements v {

    /* renamed from: a, reason: collision with root package name */
    private final d f15863a;

    /* renamed from: b, reason: collision with root package name */
    private final Deflater f15864b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15865c;

    private g(v vVar, Deflater deflater) {
        this(n.a(vVar), deflater);
    }

    @Override // com.anythink.core.common.n.c.v
    public final void a(c cVar, long j6) {
        y.a(cVar.f15847c, 0L, j6);
        while (j6 > 0) {
            s sVar = cVar.f15846b;
            int min = (int) Math.min(j6, sVar.f15916e - sVar.f15915d);
            this.f15864b.setInput(sVar.f15914c, sVar.f15915d, min);
            a(false);
            long j9 = min;
            cVar.f15847c -= j9;
            int i = sVar.f15915d + min;
            sVar.f15915d = i;
            if (i == sVar.f15916e) {
                cVar.f15846b = sVar.c();
                t.a(sVar);
            }
            j6 -= j9;
        }
    }

    public final void b() {
        this.f15864b.finish();
        a(false);
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15865c) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f15864b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f15863a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f15865c = true;
        if (th != null) {
            y.a(th);
        }
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Flushable
    public final void flush() {
        a(true);
        this.f15863a.flush();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f15863a + ")";
    }

    public g(d dVar, Deflater deflater) {
        if (dVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f15863a = dVar;
        this.f15864b = deflater;
    }

    private void a(boolean z3) {
        s g4;
        int deflate;
        c c9 = this.f15863a.c();
        while (true) {
            g4 = c9.g(1);
            if (z3) {
                Deflater deflater = this.f15864b;
                byte[] bArr = g4.f15914c;
                int i = g4.f15916e;
                deflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                Deflater deflater2 = this.f15864b;
                byte[] bArr2 = g4.f15914c;
                int i6 = g4.f15916e;
                deflate = deflater2.deflate(bArr2, i6, 8192 - i6);
            }
            if (deflate > 0) {
                g4.f15916e += deflate;
                c9.f15847c += deflate;
                this.f15863a.A();
            } else if (this.f15864b.needsInput()) {
                break;
            }
        }
        if (g4.f15915d == g4.f15916e) {
            c9.f15846b = g4.c();
            t.a(g4);
        }
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.f15863a.a();
    }
}
