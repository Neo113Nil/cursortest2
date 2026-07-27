package com.anythink.core.common.n.c;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    private final d f16027a;

    /* renamed from: b, reason: collision with root package name */
    private final Deflater f16028b;

    /* renamed from: c, reason: collision with root package name */
    private final g f16029c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16030d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f16031e = new CRC32();

    private k(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        Deflater deflater = new Deflater(-1, true);
        this.f16028b = deflater;
        d a9 = n.a(vVar);
        this.f16027a = a9;
        this.f16029c = new g(a9, deflater);
        c c4 = a9.c();
        c4.k(8075);
        c4.l(8);
        c4.l(0);
        c4.i(0);
        c4.l(0);
        c4.l(0);
    }

    private Deflater b() {
        return this.f16028b;
    }

    private void c() {
        c c4 = this.f16027a.c();
        c4.k(8075);
        c4.l(8);
        c4.l(0);
        c4.i(0);
        c4.l(0);
        c4.l(0);
    }

    private void d() {
        this.f16027a.h((int) this.f16031e.getValue());
        this.f16027a.h((int) this.f16028b.getBytesRead());
    }

    @Override // com.anythink.core.common.n.c.v
    public final void a(c cVar, long j9) {
        if (j9 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j9)));
        }
        if (j9 == 0) {
            return;
        }
        b(cVar, j9);
        this.f16029c.a(cVar, j9);
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16030d) {
            return;
        }
        try {
            this.f16029c.b();
            this.f16027a.h((int) this.f16031e.getValue());
            this.f16027a.h((int) this.f16028b.getBytesRead());
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f16028b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f16027a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f16030d = true;
        if (th != null) {
            y.a(th);
        }
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Flushable
    public final void flush() {
        this.f16029c.flush();
    }

    private void b(c cVar, long j9) {
        s sVar = cVar.f16004b;
        while (j9 > 0) {
            int min = (int) Math.min(j9, sVar.f16074e - sVar.f16073d);
            this.f16031e.update(sVar.f16072c, sVar.f16073d, min);
            j9 -= min;
            sVar = sVar.f16077h;
        }
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.f16027a.a();
    }
}
