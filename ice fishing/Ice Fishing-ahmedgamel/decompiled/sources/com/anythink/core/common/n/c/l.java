package com.anythink.core.common.n.c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f15874a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final byte f15875b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final byte f15876c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static final byte f15877d = 4;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f15878e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final byte f15879f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f15880g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final byte f15881h = 3;

    /* renamed from: j, reason: collision with root package name */
    private final e f15882j;

    /* renamed from: k, reason: collision with root package name */
    private final Inflater f15883k;

    /* renamed from: l, reason: collision with root package name */
    private final m f15884l;
    private int i = 0;

    /* renamed from: m, reason: collision with root package name */
    private final CRC32 f15885m = new CRC32();

    public l(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f15883k = inflater;
        e a9 = n.a(wVar);
        this.f15882j = a9;
        this.f15884l = new m(a9, inflater);
    }

    private void b() {
        this.f15882j.a(10L);
        byte c9 = this.f15882j.c().c(3L);
        boolean z3 = ((c9 >> 1) & 1) == 1;
        if (z3) {
            a(this.f15882j.c(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f15882j.l());
        this.f15882j.i(8L);
        if (((c9 >> 2) & 1) == 1) {
            this.f15882j.a(2L);
            if (z3) {
                a(this.f15882j.c(), 0L, 2L);
            }
            long a9 = y.a(this.f15882j.c().l());
            this.f15882j.a(a9);
            if (z3) {
                a(this.f15882j.c(), 0L, a9);
            }
            this.f15882j.i(a9);
        }
        if (((c9 >> 3) & 1) == 1) {
            long a10 = this.f15882j.a(f15878e);
            if (a10 == -1) {
                throw new EOFException();
            }
            if (z3) {
                a(this.f15882j.c(), 0L, a10 + 1);
            }
            this.f15882j.i(a10 + 1);
        }
        if (((c9 >> 4) & 1) == 1) {
            long a11 = this.f15882j.a(f15878e);
            if (a11 == -1) {
                throw new EOFException();
            }
            if (z3) {
                a(this.f15882j.c(), 0L, a11 + 1);
            }
            this.f15882j.i(a11 + 1);
        }
        if (z3) {
            a("FHCRC", this.f15882j.o(), (short) this.f15885m.getValue());
            this.f15885m.reset();
        }
    }

    private void c() {
        a("CRC", this.f15882j.p(), (int) this.f15885m.getValue());
        a("ISIZE", this.f15882j.p(), (int) this.f15883k.getBytesWritten());
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f15882j.a();
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
            this.f15882j.a(10L);
            byte c9 = this.f15882j.c().c(3L);
            boolean z3 = ((c9 >> 1) & 1) == 1;
            if (z3) {
                a(this.f15882j.c(), 0L, 10L);
            }
            a("ID1ID2", 8075, this.f15882j.l());
            this.f15882j.i(8L);
            if (((c9 >> 2) & 1) == 1) {
                this.f15882j.a(2L);
                if (z3) {
                    a(this.f15882j.c(), 0L, 2L);
                }
                long o6 = this.f15882j.c().o();
                this.f15882j.a(o6);
                if (z3) {
                    a(this.f15882j.c(), 0L, o6);
                }
                this.f15882j.i(o6);
            }
            if (((c9 >> 3) & 1) == 1) {
                long a9 = this.f15882j.a(f15878e);
                if (a9 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    a(this.f15882j.c(), 0L, a9 + 1);
                }
                this.f15882j.i(a9 + 1);
            }
            if (((c9 >> 4) & 1) == 1) {
                long a10 = this.f15882j.a(f15878e);
                if (a10 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    a(this.f15882j.c(), 0L, a10 + 1);
                }
                this.f15882j.i(a10 + 1);
            }
            if (z3) {
                a("FHCRC", this.f15882j.o(), (short) this.f15885m.getValue());
                this.f15885m.reset();
            }
            this.i = 1;
        }
        if (this.i == 1) {
            long j9 = cVar.f15847c;
            long a_ = this.f15884l.a_(cVar, j6);
            if (a_ != -1) {
                a(cVar, j9, a_);
                return a_;
            }
            this.i = 2;
        }
        if (this.i == 2) {
            a("CRC", this.f15882j.p(), (int) this.f15885m.getValue());
            a("ISIZE", this.f15882j.p(), (int) this.f15883k.getBytesWritten());
            this.i = 3;
            if (!this.f15882j.g()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15884l.close();
    }

    private void a(c cVar, long j6, long j9) {
        s sVar = cVar.f15846b;
        while (true) {
            int i = sVar.f15916e;
            int i6 = sVar.f15915d;
            if (j6 < i - i6) {
                break;
            }
            j6 -= i - i6;
            sVar = sVar.f15919h;
        }
        while (j9 > 0) {
            int min = (int) Math.min(sVar.f15916e - r6, j9);
            this.f15885m.update(sVar.f15914c, (int) (sVar.f15915d + j6), min);
            j9 -= min;
            sVar = sVar.f15919h;
            j6 = 0;
        }
    }

    private static void a(String str, int i, int i6) {
        if (i6 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i6), Integer.valueOf(i)));
        }
    }
}
