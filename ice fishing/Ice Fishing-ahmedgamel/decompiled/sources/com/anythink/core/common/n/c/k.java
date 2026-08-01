package com.anythink.core.common.n.c;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    private final d f15869a;

    /* renamed from: b, reason: collision with root package name */
    private final Deflater f15870b;

    /* renamed from: c, reason: collision with root package name */
    private final g f15871c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15872d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f15873e = new CRC32();

    private k(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        Deflater deflater = new Deflater(-1, true);
        this.f15870b = deflater;
        d a9 = n.a(vVar);
        this.f15869a = a9;
        this.f15871c = new g(a9, deflater);
        c c9 = a9.c();
        c9.k(8075);
        c9.l(8);
        c9.l(0);
        c9.i(0);
        c9.l(0);
        c9.l(0);
    }

    private Deflater b() {
        return this.f15870b;
    }

    private void c() {
        c c9 = this.f15869a.c();
        c9.k(8075);
        c9.l(8);
        c9.l(0);
        c9.i(0);
        c9.l(0);
        c9.l(0);
    }

    private void d() {
        this.f15869a.h((int) this.f15873e.getValue());
        this.f15869a.h((int) this.f15870b.getBytesRead());
    }

    @Override // com.anythink.core.common.n.c.v
    public final void a(c cVar, long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
        }
        if (j6 == 0) {
            return;
        }
        b(cVar, j6);
        this.f15871c.a(cVar, j6);
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15872d) {
            return;
        }
        try {
            this.f15871c.b();
            this.f15869a.h((int) this.f15873e.getValue());
            this.f15869a.h((int) this.f15870b.getBytesRead());
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f15870b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f15869a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f15872d = true;
        if (th != null) {
            y.a(th);
        }
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Flushable
    public final void flush() {
        this.f15871c.flush();
    }

    private void b(c cVar, long j6) {
        s sVar = cVar.f15846b;
        while (j6 > 0) {
            int min = (int) Math.min(j6, sVar.f15916e - sVar.f15915d);
            this.f15873e.update(sVar.f15914c, sVar.f15915d, min);
            j6 -= min;
            sVar = sVar.f15919h;
        }
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.f15869a.a();
    }
}
