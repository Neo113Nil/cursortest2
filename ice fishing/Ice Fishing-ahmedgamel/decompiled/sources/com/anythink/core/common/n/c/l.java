package com.anythink.core.common.n.c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f16661a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final byte f16662b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final byte f16663c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static final byte f16664d = 4;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f16665e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final byte f16666f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f16667g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final byte f16668h = 3;

    /* renamed from: j, reason: collision with root package name */
    private final e f16669j;

    /* renamed from: k, reason: collision with root package name */
    private final Inflater f16670k;

    /* renamed from: l, reason: collision with root package name */
    private final m f16671l;
    private int i = 0;

    /* renamed from: m, reason: collision with root package name */
    private final CRC32 f16672m = new CRC32();

    public l(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f16670k = inflater;
        e a9 = n.a(wVar);
        this.f16669j = a9;
        this.f16671l = new m(a9, inflater);
    }

    private void b() {
        this.f16669j.a(10L);
        byte c9 = this.f16669j.c().c(3L);
        boolean z6 = ((c9 >> 1) & 1) == 1;
        if (z6) {
            a(this.f16669j.c(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f16669j.l());
        this.f16669j.i(8L);
        if (((c9 >> 2) & 1) == 1) {
            this.f16669j.a(2L);
            if (z6) {
                a(this.f16669j.c(), 0L, 2L);
            }
            long a9 = y.a(this.f16669j.c().l());
            this.f16669j.a(a9);
            if (z6) {
                a(this.f16669j.c(), 0L, a9);
            }
            this.f16669j.i(a9);
        }
        if (((c9 >> 3) & 1) == 1) {
            long a10 = this.f16669j.a(f16665e);
            if (a10 == -1) {
                throw new EOFException();
            }
            if (z6) {
                a(this.f16669j.c(), 0L, a10 + 1);
            }
            this.f16669j.i(a10 + 1);
        }
        if (((c9 >> 4) & 1) == 1) {
            long a11 = this.f16669j.a(f16665e);
            if (a11 == -1) {
                throw new EOFException();
            }
            if (z6) {
                a(this.f16669j.c(), 0L, a11 + 1);
            }
            this.f16669j.i(a11 + 1);
        }
        if (z6) {
            a("FHCRC", this.f16669j.o(), (short) this.f16672m.getValue());
            this.f16672m.reset();
        }
    }

    private void c() {
        a("CRC", this.f16669j.p(), (int) this.f16672m.getValue());
        a("ISIZE", this.f16669j.p(), (int) this.f16670k.getBytesWritten());
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f16669j.a();
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
        }
        if (j6 == 0) {
            return 0L;
        }
        if (this.i == 0) {
            this.f16669j.a(10L);
            byte c9 = this.f16669j.c().c(3L);
            boolean z6 = ((c9 >> 1) & 1) == 1;
            if (z6) {
                a(this.f16669j.c(), 0L, 10L);
            }
            a("ID1ID2", 8075, this.f16669j.l());
            this.f16669j.i(8L);
            if (((c9 >> 2) & 1) == 1) {
                this.f16669j.a(2L);
                if (z6) {
                    a(this.f16669j.c(), 0L, 2L);
                }
                long o4 = this.f16669j.c().o();
                this.f16669j.a(o4);
                if (z6) {
                    a(this.f16669j.c(), 0L, o4);
                }
                this.f16669j.i(o4);
            }
            if (((c9 >> 3) & 1) == 1) {
                long a9 = this.f16669j.a(f16665e);
                if (a9 == -1) {
                    throw new EOFException();
                }
                if (z6) {
                    a(this.f16669j.c(), 0L, a9 + 1);
                }
                this.f16669j.i(a9 + 1);
            }
            if (((c9 >> 4) & 1) == 1) {
                long a10 = this.f16669j.a(f16665e);
                if (a10 == -1) {
                    throw new EOFException();
                }
                if (z6) {
                    a(this.f16669j.c(), 0L, a10 + 1);
                }
                this.f16669j.i(a10 + 1);
            }
            if (z6) {
                a("FHCRC", this.f16669j.o(), (short) this.f16672m.getValue());
                this.f16672m.reset();
            }
            this.i = 1;
        }
        if (this.i == 1) {
            long j9 = cVar.f16634c;
            long a_ = this.f16671l.a_(cVar, j6);
            if (a_ != -1) {
                a(cVar, j9, a_);
                return a_;
            }
            this.i = 2;
        }
        if (this.i == 2) {
            a("CRC", this.f16669j.p(), (int) this.f16672m.getValue());
            a("ISIZE", this.f16669j.p(), (int) this.f16670k.getBytesWritten());
            this.i = 3;
            if (!this.f16669j.g()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16671l.close();
    }

    private void a(c cVar, long j6, long j9) {
        s sVar = cVar.f16633b;
        while (true) {
            int i = sVar.f16703e;
            int i4 = sVar.f16702d;
            if (j6 < i - i4) {
                break;
            }
            j6 -= i - i4;
            sVar = sVar.f16706h;
        }
        while (j9 > 0) {
            int min = (int) Math.min(sVar.f16703e - r6, j9);
            this.f16672m.update(sVar.f16701c, (int) (sVar.f16702d + j6), min);
            j9 -= min;
            sVar = sVar.f16706h;
            j6 = 0;
        }
    }

    private static void a(String str, int i, int i4) {
        if (i4 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }
}
