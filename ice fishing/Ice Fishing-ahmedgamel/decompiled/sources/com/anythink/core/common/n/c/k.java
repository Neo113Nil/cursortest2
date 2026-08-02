package com.anythink.core.common.n.c;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    private final d f16656a;

    /* renamed from: b, reason: collision with root package name */
    private final Deflater f16657b;

    /* renamed from: c, reason: collision with root package name */
    private final g f16658c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16659d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f16660e = new CRC32();

    private k(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        Deflater deflater = new Deflater(-1, true);
        this.f16657b = deflater;
        d a9 = n.a(vVar);
        this.f16656a = a9;
        this.f16658c = new g(a9, deflater);
        c c9 = a9.c();
        c9.k(8075);
        c9.l(8);
        c9.l(0);
        c9.i(0);
        c9.l(0);
        c9.l(0);
    }

    private Deflater b() {
        return this.f16657b;
    }

    private void c() {
        c c9 = this.f16656a.c();
        c9.k(8075);
        c9.l(8);
        c9.l(0);
        c9.i(0);
        c9.l(0);
        c9.l(0);
    }

    private void d() {
        this.f16656a.h((int) this.f16660e.getValue());
        this.f16656a.h((int) this.f16657b.getBytesRead());
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
        this.f16658c.a(cVar, j6);
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16659d) {
            return;
        }
        try {
            this.f16658c.b();
            this.f16656a.h((int) this.f16660e.getValue());
            this.f16656a.h((int) this.f16657b.getBytesRead());
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f16657b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f16656a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f16659d = true;
        if (th != null) {
            y.a(th);
        }
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Flushable
    public final void flush() {
        this.f16658c.flush();
    }

    private void b(c cVar, long j6) {
        s sVar = cVar.f16633b;
        while (j6 > 0) {
            int min = (int) Math.min(j6, sVar.f16703e - sVar.f16702d);
            this.f16660e.update(sVar.f16701c, sVar.f16702d, min);
            j6 -= min;
            sVar = sVar.f16706h;
        }
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.f16656a.a();
    }
}
