package p8;

import com.icefishingapp.icefishing.AbstractC4404f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import v7.AbstractC5128i;
import v7.AbstractC5129j;

/* loaded from: classes2.dex */
public final class v implements Closeable {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f39916w;

    /* renamed from: n, reason: collision with root package name */
    public final y8.r f39917n;

    /* renamed from: u, reason: collision with root package name */
    public final u f39918u;

    /* renamed from: v, reason: collision with root package name */
    public final C4859e f39919v;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        kotlin.jvm.internal.h.d(logger, "getLogger(...)");
        f39916w = logger;
    }

    public v(y8.r source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f39917n = source;
        u uVar = new u(source);
        this.f39918u = uVar;
        this.f39919v = new C4859e(uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0250, code lost:
    
        throw new java.io.IOException(com.icefishingapp.icefishing.AbstractC4404f.e(r8, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z3, q qVar) {
        EnumC4856b enumC4856b;
        EnumC4856b enumC4856b2;
        Object[] array;
        int i = 1;
        int i6 = 0;
        try {
            this.f39917n.E(9L);
            int k9 = j8.c.k(this.f39917n);
            if (k9 > 16384) {
                throw new IOException(AbstractC4404f.e(k9, "FRAME_SIZE_ERROR: "));
            }
            int z6 = this.f39917n.z() & 255;
            byte z9 = this.f39917n.z();
            int i9 = z9 & 255;
            int B9 = this.f39917n.B();
            int i10 = Integer.MAX_VALUE & B9;
            if (z6 != 8) {
                Logger logger = f39916w;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.b(i10, k9, z6, i9, true));
                }
            }
            if (z3 && z6 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + h.a(z6));
            }
            switch (z6) {
                case 0:
                    b(qVar, k9, i9, i10);
                    return true;
                case 1:
                    j(qVar, k9, i9, i10);
                    return true;
                case 2:
                    if (k9 != 5) {
                        throw new IOException(D.y.k(k9, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i10 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    y8.r rVar = this.f39917n;
                    rVar.B();
                    rVar.z();
                    return true;
                case 3:
                    if (k9 != 4) {
                        throw new IOException(D.y.k(k9, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i10 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int B10 = this.f39917n.B();
                    EnumC4856b.f39818u.getClass();
                    EnumC4856b[] values = EnumC4856b.values();
                    int length = values.length;
                    while (true) {
                        if (i6 < length) {
                            EnumC4856b enumC4856b3 = values[i6];
                            if (enumC4856b3.f39824n == B10) {
                                enumC4856b = enumC4856b3;
                            } else {
                                i6++;
                            }
                        } else {
                            enumC4856b = null;
                        }
                    }
                    if (enumC4856b == null) {
                        throw new IOException(AbstractC4404f.e(B10, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    r rVar2 = qVar.f39876u;
                    rVar2.getClass();
                    if (i10 == 0 || (B9 & 1) != 0) {
                        z n9 = rVar2.n(i10);
                        if (n9 != null) {
                            synchronized (n9) {
                                if (n9.h() == null) {
                                    n9.f39935E = enumC4856b;
                                    n9.notifyAll();
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                    l8.c.c(rVar2.f39879B, rVar2.f39897v + '[' + i10 + "] onReset", new l(rVar2, i10, enumC4856b, i));
                    return true;
                case 4:
                    if (i10 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((z9 & 1) != 0) {
                        if (k9 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (k9 % 6 != 0) {
                        throw new IOException(AbstractC4404f.e(k9, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    D d2 = new D();
                    N7.a v9 = V2.a.v(V2.a.x(0, k9), 6);
                    int i11 = v9.f2017n;
                    int i12 = v9.f2018u;
                    int i13 = v9.f2019v;
                    if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                        while (true) {
                            y8.r rVar3 = this.f39917n;
                            short C8 = rVar3.C();
                            byte[] bArr = j8.c.f38482a;
                            int i14 = C8 & 65535;
                            int B11 = rVar3.B();
                            if (i14 != 2) {
                                if (i14 != 4) {
                                    if (i14 == 5 && (B11 < 16384 || B11 > 16777215)) {
                                    }
                                } else if (B11 < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (B11 != 0 && B11 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            d2.c(i14, B11);
                            if (i11 != i12) {
                                i11 += i13;
                            }
                        }
                    }
                    r rVar4 = qVar.f39876u;
                    l8.c.c(rVar4.f39878A, u1.h.g(new StringBuilder(), rVar4.f39897v, " applyAndAckSettings"), new p(i, qVar, d2));
                    return true;
                case 5:
                    k(qVar, k9, i9, i10);
                    return true;
                case 6:
                    if (k9 != 8) {
                        throw new IOException(AbstractC4404f.e(k9, "TYPE_PING length != 8: "));
                    }
                    if (i10 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    final int B12 = this.f39917n.B();
                    final int B13 = this.f39917n.B();
                    if ((z9 & 1) == 0) {
                        l8.c cVar = qVar.f39876u.f39878A;
                        String g4 = u1.h.g(new StringBuilder(), qVar.f39876u.f39897v, " ping");
                        final r rVar5 = qVar.f39876u;
                        l8.c.c(cVar, g4, new I7.a() { // from class: p8.o
                            @Override // I7.a
                            public final Object invoke() {
                                int i15 = B12;
                                int i16 = B13;
                                r rVar6 = r.this;
                                rVar6.getClass();
                                try {
                                    rVar6.f39892P.l(i15, i16, true);
                                } catch (IOException e9) {
                                    EnumC4856b enumC4856b4 = EnumC4856b.f39820w;
                                    rVar6.a(enumC4856b4, enumC4856b4, e9);
                                }
                                return u7.v.f41353a;
                            }
                        });
                        return true;
                    }
                    r rVar6 = qVar.f39876u;
                    synchronized (rVar6) {
                        try {
                            if (B12 == 1) {
                                rVar6.f39882E++;
                            } else if (B12 == 2) {
                                rVar6.f39884G++;
                            } else if (B12 == 3) {
                                rVar6.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (k9 < 8) {
                        throw new IOException(AbstractC4404f.e(k9, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i10 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int B14 = this.f39917n.B();
                    int B15 = this.f39917n.B();
                    int i15 = k9 - 8;
                    EnumC4856b.f39818u.getClass();
                    EnumC4856b[] values2 = EnumC4856b.values();
                    int length2 = values2.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 < length2) {
                            EnumC4856b enumC4856b4 = values2[i16];
                            if (enumC4856b4.f39824n == B15) {
                                enumC4856b2 = enumC4856b4;
                            } else {
                                i16++;
                            }
                        } else {
                            enumC4856b2 = null;
                        }
                    }
                    if (enumC4856b2 == null) {
                        throw new IOException(AbstractC4404f.e(B15, "TYPE_GOAWAY unexpected error code: "));
                    }
                    y8.h debugData = y8.h.f41954w;
                    if (i15 > 0) {
                        debugData = this.f39917n.A(i15);
                    }
                    kotlin.jvm.internal.h.e(debugData, "debugData");
                    debugData.a();
                    r rVar7 = qVar.f39876u;
                    synchronized (rVar7) {
                        array = rVar7.f39896u.values().toArray(new z[0]);
                        rVar7.f39900y = true;
                    }
                    z[] zVarArr = (z[]) array;
                    int length3 = zVarArr.length;
                    while (i6 < length3) {
                        z zVar = zVarArr[i6];
                        if (zVar.f39937n > B14 && zVar.i()) {
                            EnumC4856b enumC4856b5 = EnumC4856b.f39823z;
                            synchronized (zVar) {
                                if (zVar.h() == null) {
                                    zVar.f39935E = enumC4856b5;
                                    zVar.notifyAll();
                                }
                            }
                            qVar.f39876u.n(zVar.f39937n);
                        }
                        i6++;
                    }
                    return true;
                case 8:
                    try {
                        if (k9 != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + k9);
                        }
                        long B16 = this.f39917n.B() & 2147483647L;
                        if (B16 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f39916w;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(h.c(i10, k9, B16, true));
                        }
                        if (i10 == 0) {
                            r rVar8 = qVar.f39876u;
                            synchronized (rVar8) {
                                rVar8.f39890N += B16;
                                rVar8.notifyAll();
                            }
                            return true;
                        }
                        z b9 = qVar.f39876u.b(i10);
                        if (b9 != null) {
                            synchronized (b9) {
                                b9.f39941x += B16;
                                if (B16 > 0) {
                                    b9.notifyAll();
                                }
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e9) {
                        f39916w.fine(h.b(i10, k9, 8, i9, true));
                        throw e9;
                    }
                default:
                    this.f39917n.F(k9);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(q qVar, int i, int i6, final int i9) {
        int i10;
        boolean z3;
        boolean z6;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final boolean z9 = (i6 & 1) != 0;
        if ((i6 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i6 & 8) != 0) {
            byte z10 = this.f39917n.z();
            byte[] bArr = j8.c.f38482a;
            i10 = z10 & 255;
        } else {
            i10 = 0;
        }
        final int a9 = t.a(i, i6, i10);
        y8.r source = this.f39917n;
        kotlin.jvm.internal.h.e(source, "source");
        qVar.f39876u.getClass();
        if (i9 == 0 || (i9 & 1) != 0) {
            z b9 = qVar.f39876u.b(i9);
            if (b9 == null) {
                qVar.f39876u.y(i9, EnumC4856b.f39820w);
                long j6 = a9;
                qVar.f39876u.w(j6);
                source.F(j6);
            } else {
                TimeZone timeZone = j8.d.f38483a;
                x xVar = b9.f39931A;
                long j9 = a9;
                xVar.getClass();
                long j10 = j9;
                while (true) {
                    if (j10 <= 0) {
                        TimeZone timeZone2 = j8.d.f38483a;
                        xVar.f39929y.f39938u.w(j9);
                        xVar.f39929y.f39938u.f39886I.getClass();
                        break;
                    }
                    synchronized (xVar.f39929y) {
                        z3 = xVar.f39925u;
                        z6 = xVar.f39927w.f41953u + j10 > xVar.f39924n;
                    }
                    if (z6) {
                        source.F(j10);
                        xVar.f39929y.g(EnumC4856b.f39822y);
                        break;
                    }
                    if (z3) {
                        source.F(j10);
                        break;
                    }
                    long d2 = source.d(j10, xVar.f39926v);
                    if (d2 == -1) {
                        throw new EOFException();
                    }
                    j10 -= d2;
                    z zVar = xVar.f39929y;
                    synchronized (zVar) {
                        try {
                            if (xVar.f39928x) {
                                y8.e eVar = xVar.f39926v;
                                eVar.H(eVar.f41953u);
                            } else {
                                y8.e eVar2 = xVar.f39927w;
                                boolean z11 = eVar2.f41953u == 0;
                                eVar2.W(xVar.f39926v);
                                if (z11) {
                                    zVar.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z9) {
                    b9.k(i8.l.f38149u, true);
                }
            }
        } else {
            final r rVar = qVar.f39876u;
            rVar.getClass();
            final y8.e eVar3 = new y8.e();
            long j11 = a9;
            source.E(j11);
            source.d(j11, eVar3);
            l8.c.c(rVar.f39879B, rVar.f39897v + '[' + i9 + "] onData", new I7.a(i9, eVar3, a9, z9) { // from class: p8.k

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f39862u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ y8.e f39863v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f39864w;

                @Override // I7.a
                public final Object invoke() {
                    r rVar2 = r.this;
                    int i11 = this.f39862u;
                    y8.e eVar4 = this.f39863v;
                    int i12 = this.f39864w;
                    try {
                        rVar2.f39881D.getClass();
                        eVar4.H(i12);
                        rVar2.f39892P.m(i11, EnumC4856b.f39816A);
                        synchronized (rVar2) {
                            rVar2.f39894R.remove(Integer.valueOf(i11));
                        }
                    } catch (IOException unused) {
                    }
                    return u7.v.f41353a;
                }
            });
        }
        this.f39917n.F(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39917n.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f39834a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List i(int i, int i6, int i9, int i10) {
        int e9;
        u uVar = this.f39918u;
        uVar.f39914x = i;
        uVar.f39911u = i;
        uVar.f39915y = i6;
        uVar.f39912v = i9;
        uVar.f39913w = i10;
        while (true) {
            C4859e c4859e = this.f39919v;
            y8.r rVar = c4859e.f39836c;
            boolean b9 = rVar.b();
            ArrayList arrayList = c4859e.f39835b;
            if (b9) {
                List L6 = AbstractC5129j.L(arrayList);
                arrayList.clear();
                return L6;
            }
            byte z3 = rVar.z();
            byte[] bArr = j8.c.f38482a;
            int i11 = z3 & 255;
            if (i11 == 128) {
                throw new IOException("index == 0");
            }
            if ((z3 & com.anythink.core.common.s.a.c.f16316a) == 128) {
                e9 = c4859e.e(i11, com.anythink.expressad.video.module.a.a.f21728R);
                int i12 = e9 - 1;
                if (i12 >= 0) {
                    C4858d[] c4858dArr = g.f39849a;
                    if (i12 <= c4858dArr.length - 1) {
                        arrayList.add(c4858dArr[i12]);
                    }
                }
                int length = c4859e.f39838e + 1 + (i12 - g.f39849a.length);
                if (length < 0) {
                    break;
                }
                C4858d[] c4858dArr2 = c4859e.f39837d;
                if (length >= c4858dArr2.length) {
                    break;
                }
                C4858d c4858d = c4858dArr2[length];
                kotlin.jvm.internal.h.b(c4858d);
                arrayList.add(c4858d);
            } else if (i11 == 64) {
                C4858d[] c4858dArr3 = g.f39849a;
                y8.h d2 = c4859e.d();
                g.a(d2);
                c4859e.c(new C4858d(d2, c4859e.d()));
            } else if ((z3 & com.anythink.core.common.s.a.c.f16317b) == 64) {
                c4859e.c(new C4858d(c4859e.b(c4859e.e(i11, 63) - 1), c4859e.d()));
            } else if ((z3 & 32) == 32) {
                int e10 = c4859e.e(i11, 31);
                c4859e.f39834a = e10;
                if (e10 < 0 || e10 > 4096) {
                    break;
                }
                int i13 = c4859e.f39840g;
                if (e10 < i13) {
                    if (e10 == 0) {
                        C4858d[] c4858dArr4 = c4859e.f39837d;
                        AbstractC5128i.v(c4858dArr4, 0, c4858dArr4.length);
                        c4859e.f39838e = c4859e.f39837d.length - 1;
                        c4859e.f39839f = 0;
                        c4859e.f39840g = 0;
                    } else {
                        c4859e.a(i13 - e10);
                    }
                }
            } else if (i11 == 16 || i11 == 0) {
                C4858d[] c4858dArr5 = g.f39849a;
                y8.h d9 = c4859e.d();
                g.a(d9);
                arrayList.add(new C4858d(d9, c4859e.d()));
            } else {
                arrayList.add(new C4858d(c4859e.b(c4859e.e(i11, 15) - 1), c4859e.d()));
            }
        }
        throw new IOException(AbstractC4404f.e(e9, "Header index too large "));
    }

    public final void j(q qVar, int i, int i6, int i9) {
        int i10;
        int i11 = 0;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z3 = (i6 & 1) != 0;
        if ((i6 & 8) != 0) {
            byte z6 = this.f39917n.z();
            byte[] bArr = j8.c.f38482a;
            i10 = z6 & 255;
        } else {
            i10 = 0;
        }
        if ((i6 & 32) != 0) {
            y8.r rVar = this.f39917n;
            rVar.B();
            rVar.z();
            byte[] bArr2 = j8.c.f38482a;
            i -= 5;
        }
        List i12 = i(t.a(i, i6, i10), i10, i6, i9);
        qVar.f39876u.getClass();
        if (i9 != 0 && (i9 & 1) == 0) {
            r rVar2 = qVar.f39876u;
            rVar2.getClass();
            l8.c.c(rVar2.f39879B, rVar2.f39897v + '[' + i9 + "] onHeaders", new l(rVar2, i9, i12, z3));
            return;
        }
        r rVar3 = qVar.f39876u;
        synchronized (rVar3) {
            z b9 = rVar3.b(i9);
            if (b9 != null) {
                b9.k(j8.d.h(i12), z3);
                return;
            }
            if (rVar3.f39900y) {
                return;
            }
            if (i9 <= rVar3.f39898w) {
                return;
            }
            if (i9 % 2 == rVar3.f39899x % 2) {
                return;
            }
            z zVar = new z(i9, rVar3, false, z3, j8.d.h(i12));
            rVar3.f39898w = i9;
            rVar3.f39896u.put(Integer.valueOf(i9), zVar);
            l8.c.c(rVar3.f39901z.d(), rVar3.f39897v + '[' + i9 + "] onStream", new p(i11, rVar3, zVar));
        }
    }

    public final void k(q qVar, int i, int i6, int i9) {
        int i10;
        int i11 = 0;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i6 & 8) != 0) {
            byte z3 = this.f39917n.z();
            byte[] bArr = j8.c.f38482a;
            i10 = z3 & 255;
        } else {
            i10 = 0;
        }
        int B9 = this.f39917n.B() & Integer.MAX_VALUE;
        List i12 = i(t.a(i - 4, i6, i10), i10, i6, i9);
        r rVar = qVar.f39876u;
        rVar.getClass();
        synchronized (rVar) {
            if (rVar.f39894R.contains(Integer.valueOf(B9))) {
                rVar.y(B9, EnumC4856b.f39820w);
                return;
            }
            rVar.f39894R.add(Integer.valueOf(B9));
            l8.c.c(rVar.f39879B, rVar.f39897v + '[' + B9 + "] onRequest", new l(rVar, B9, i12, i11));
        }
    }
}
