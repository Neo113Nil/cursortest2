package p8;

import com.icefishing.icefishinglive2.AbstractC4404f;
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
    public static final Logger f39913w;

    /* renamed from: n, reason: collision with root package name */
    public final y8.r f39914n;

    /* renamed from: u, reason: collision with root package name */
    public final u f39915u;

    /* renamed from: v, reason: collision with root package name */
    public final C4859e f39916v;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        kotlin.jvm.internal.h.d(logger, "getLogger(...)");
        f39913w = logger;
    }

    public v(y8.r source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f39914n = source;
        u uVar = new u(source);
        this.f39915u = uVar;
        this.f39916v = new C4859e(uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0250, code lost:
    
        throw new java.io.IOException(com.icefishing.icefishinglive2.AbstractC4404f.e(r8, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
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
            this.f39914n.E(9L);
            int k9 = j8.c.k(this.f39914n);
            if (k9 > 16384) {
                throw new IOException(AbstractC4404f.e(k9, "FRAME_SIZE_ERROR: "));
            }
            int z6 = this.f39914n.z() & 255;
            byte z9 = this.f39914n.z();
            int i9 = z9 & 255;
            int B9 = this.f39914n.B();
            int i10 = Integer.MAX_VALUE & B9;
            if (z6 != 8) {
                Logger logger = f39913w;
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
                    y8.r rVar = this.f39914n;
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
                    int B10 = this.f39914n.B();
                    EnumC4856b.f39815u.getClass();
                    EnumC4856b[] values = EnumC4856b.values();
                    int length = values.length;
                    while (true) {
                        if (i6 < length) {
                            EnumC4856b enumC4856b3 = values[i6];
                            if (enumC4856b3.f39821n == B10) {
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
                    r rVar2 = qVar.f39873u;
                    rVar2.getClass();
                    if (i10 == 0 || (B9 & 1) != 0) {
                        z n9 = rVar2.n(i10);
                        if (n9 != null) {
                            synchronized (n9) {
                                if (n9.h() == null) {
                                    n9.f39932E = enumC4856b;
                                    n9.notifyAll();
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                    l8.c.c(rVar2.f39876B, rVar2.f39894v + '[' + i10 + "] onReset", new l(rVar2, i10, enumC4856b, i));
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
                            y8.r rVar3 = this.f39914n;
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
                    r rVar4 = qVar.f39873u;
                    l8.c.c(rVar4.f39875A, u1.h.g(new StringBuilder(), rVar4.f39894v, " applyAndAckSettings"), new p(i, qVar, d2));
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
                    final int B12 = this.f39914n.B();
                    final int B13 = this.f39914n.B();
                    if ((z9 & 1) == 0) {
                        l8.c cVar = qVar.f39873u.f39875A;
                        String g4 = u1.h.g(new StringBuilder(), qVar.f39873u.f39894v, " ping");
                        final r rVar5 = qVar.f39873u;
                        l8.c.c(cVar, g4, new I7.a() { // from class: p8.o
                            @Override // I7.a
                            public final Object invoke() {
                                int i15 = B12;
                                int i16 = B13;
                                r rVar6 = r.this;
                                rVar6.getClass();
                                try {
                                    rVar6.f39889P.l(i15, i16, true);
                                } catch (IOException e9) {
                                    EnumC4856b enumC4856b4 = EnumC4856b.f39817w;
                                    rVar6.a(enumC4856b4, enumC4856b4, e9);
                                }
                                return u7.v.f41350a;
                            }
                        });
                        return true;
                    }
                    r rVar6 = qVar.f39873u;
                    synchronized (rVar6) {
                        try {
                            if (B12 == 1) {
                                rVar6.f39879E++;
                            } else if (B12 == 2) {
                                rVar6.f39881G++;
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
                    int B14 = this.f39914n.B();
                    int B15 = this.f39914n.B();
                    int i15 = k9 - 8;
                    EnumC4856b.f39815u.getClass();
                    EnumC4856b[] values2 = EnumC4856b.values();
                    int length2 = values2.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 < length2) {
                            EnumC4856b enumC4856b4 = values2[i16];
                            if (enumC4856b4.f39821n == B15) {
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
                    y8.h debugData = y8.h.f41951w;
                    if (i15 > 0) {
                        debugData = this.f39914n.A(i15);
                    }
                    kotlin.jvm.internal.h.e(debugData, "debugData");
                    debugData.a();
                    r rVar7 = qVar.f39873u;
                    synchronized (rVar7) {
                        array = rVar7.f39893u.values().toArray(new z[0]);
                        rVar7.f39897y = true;
                    }
                    z[] zVarArr = (z[]) array;
                    int length3 = zVarArr.length;
                    while (i6 < length3) {
                        z zVar = zVarArr[i6];
                        if (zVar.f39934n > B14 && zVar.i()) {
                            EnumC4856b enumC4856b5 = EnumC4856b.f39820z;
                            synchronized (zVar) {
                                if (zVar.h() == null) {
                                    zVar.f39932E = enumC4856b5;
                                    zVar.notifyAll();
                                }
                            }
                            qVar.f39873u.n(zVar.f39934n);
                        }
                        i6++;
                    }
                    return true;
                case 8:
                    try {
                        if (k9 != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + k9);
                        }
                        long B16 = this.f39914n.B() & 2147483647L;
                        if (B16 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f39913w;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(h.c(i10, k9, B16, true));
                        }
                        if (i10 == 0) {
                            r rVar8 = qVar.f39873u;
                            synchronized (rVar8) {
                                rVar8.f39887N += B16;
                                rVar8.notifyAll();
                            }
                            return true;
                        }
                        z b9 = qVar.f39873u.b(i10);
                        if (b9 != null) {
                            synchronized (b9) {
                                b9.f39938x += B16;
                                if (B16 > 0) {
                                    b9.notifyAll();
                                }
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e9) {
                        f39913w.fine(h.b(i10, k9, 8, i9, true));
                        throw e9;
                    }
                default:
                    this.f39914n.F(k9);
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
            byte z10 = this.f39914n.z();
            byte[] bArr = j8.c.f38482a;
            i10 = z10 & 255;
        } else {
            i10 = 0;
        }
        final int a9 = t.a(i, i6, i10);
        y8.r source = this.f39914n;
        kotlin.jvm.internal.h.e(source, "source");
        qVar.f39873u.getClass();
        if (i9 == 0 || (i9 & 1) != 0) {
            z b9 = qVar.f39873u.b(i9);
            if (b9 == null) {
                qVar.f39873u.y(i9, EnumC4856b.f39817w);
                long j6 = a9;
                qVar.f39873u.w(j6);
                source.F(j6);
            } else {
                TimeZone timeZone = j8.d.f38483a;
                x xVar = b9.f39928A;
                long j9 = a9;
                xVar.getClass();
                long j10 = j9;
                while (true) {
                    if (j10 <= 0) {
                        TimeZone timeZone2 = j8.d.f38483a;
                        xVar.f39926y.f39935u.w(j9);
                        xVar.f39926y.f39935u.f39883I.getClass();
                        break;
                    }
                    synchronized (xVar.f39926y) {
                        z3 = xVar.f39922u;
                        z6 = xVar.f39924w.f41950u + j10 > xVar.f39921n;
                    }
                    if (z6) {
                        source.F(j10);
                        xVar.f39926y.g(EnumC4856b.f39819y);
                        break;
                    }
                    if (z3) {
                        source.F(j10);
                        break;
                    }
                    long d2 = source.d(j10, xVar.f39923v);
                    if (d2 == -1) {
                        throw new EOFException();
                    }
                    j10 -= d2;
                    z zVar = xVar.f39926y;
                    synchronized (zVar) {
                        try {
                            if (xVar.f39925x) {
                                y8.e eVar = xVar.f39923v;
                                eVar.H(eVar.f41950u);
                            } else {
                                y8.e eVar2 = xVar.f39924w;
                                boolean z11 = eVar2.f41950u == 0;
                                eVar2.W(xVar.f39923v);
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
            final r rVar = qVar.f39873u;
            rVar.getClass();
            final y8.e eVar3 = new y8.e();
            long j11 = a9;
            source.E(j11);
            source.d(j11, eVar3);
            l8.c.c(rVar.f39876B, rVar.f39894v + '[' + i9 + "] onData", new I7.a(i9, eVar3, a9, z9) { // from class: p8.k

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f39859u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ y8.e f39860v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f39861w;

                @Override // I7.a
                public final Object invoke() {
                    r rVar2 = r.this;
                    int i11 = this.f39859u;
                    y8.e eVar4 = this.f39860v;
                    int i12 = this.f39861w;
                    try {
                        rVar2.f39878D.getClass();
                        eVar4.H(i12);
                        rVar2.f39889P.m(i11, EnumC4856b.f39813A);
                        synchronized (rVar2) {
                            rVar2.f39891R.remove(Integer.valueOf(i11));
                        }
                    } catch (IOException unused) {
                    }
                    return u7.v.f41350a;
                }
            });
        }
        this.f39914n.F(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39914n.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f39831a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List i(int i, int i6, int i9, int i10) {
        int e9;
        u uVar = this.f39915u;
        uVar.f39911x = i;
        uVar.f39908u = i;
        uVar.f39912y = i6;
        uVar.f39909v = i9;
        uVar.f39910w = i10;
        while (true) {
            C4859e c4859e = this.f39916v;
            y8.r rVar = c4859e.f39833c;
            boolean b9 = rVar.b();
            ArrayList arrayList = c4859e.f39832b;
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
                    C4858d[] c4858dArr = g.f39846a;
                    if (i12 <= c4858dArr.length - 1) {
                        arrayList.add(c4858dArr[i12]);
                    }
                }
                int length = c4859e.f39835e + 1 + (i12 - g.f39846a.length);
                if (length < 0) {
                    break;
                }
                C4858d[] c4858dArr2 = c4859e.f39834d;
                if (length >= c4858dArr2.length) {
                    break;
                }
                C4858d c4858d = c4858dArr2[length];
                kotlin.jvm.internal.h.b(c4858d);
                arrayList.add(c4858d);
            } else if (i11 == 64) {
                C4858d[] c4858dArr3 = g.f39846a;
                y8.h d2 = c4859e.d();
                g.a(d2);
                c4859e.c(new C4858d(d2, c4859e.d()));
            } else if ((z3 & com.anythink.core.common.s.a.c.f16317b) == 64) {
                c4859e.c(new C4858d(c4859e.b(c4859e.e(i11, 63) - 1), c4859e.d()));
            } else if ((z3 & 32) == 32) {
                int e10 = c4859e.e(i11, 31);
                c4859e.f39831a = e10;
                if (e10 < 0 || e10 > 4096) {
                    break;
                }
                int i13 = c4859e.f39837g;
                if (e10 < i13) {
                    if (e10 == 0) {
                        C4858d[] c4858dArr4 = c4859e.f39834d;
                        AbstractC5128i.v(c4858dArr4, 0, c4858dArr4.length);
                        c4859e.f39835e = c4859e.f39834d.length - 1;
                        c4859e.f39836f = 0;
                        c4859e.f39837g = 0;
                    } else {
                        c4859e.a(i13 - e10);
                    }
                }
            } else if (i11 == 16 || i11 == 0) {
                C4858d[] c4858dArr5 = g.f39846a;
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
            byte z6 = this.f39914n.z();
            byte[] bArr = j8.c.f38482a;
            i10 = z6 & 255;
        } else {
            i10 = 0;
        }
        if ((i6 & 32) != 0) {
            y8.r rVar = this.f39914n;
            rVar.B();
            rVar.z();
            byte[] bArr2 = j8.c.f38482a;
            i -= 5;
        }
        List i12 = i(t.a(i, i6, i10), i10, i6, i9);
        qVar.f39873u.getClass();
        if (i9 != 0 && (i9 & 1) == 0) {
            r rVar2 = qVar.f39873u;
            rVar2.getClass();
            l8.c.c(rVar2.f39876B, rVar2.f39894v + '[' + i9 + "] onHeaders", new l(rVar2, i9, i12, z3));
            return;
        }
        r rVar3 = qVar.f39873u;
        synchronized (rVar3) {
            z b9 = rVar3.b(i9);
            if (b9 != null) {
                b9.k(j8.d.h(i12), z3);
                return;
            }
            if (rVar3.f39897y) {
                return;
            }
            if (i9 <= rVar3.f39895w) {
                return;
            }
            if (i9 % 2 == rVar3.f39896x % 2) {
                return;
            }
            z zVar = new z(i9, rVar3, false, z3, j8.d.h(i12));
            rVar3.f39895w = i9;
            rVar3.f39893u.put(Integer.valueOf(i9), zVar);
            l8.c.c(rVar3.f39898z.d(), rVar3.f39894v + '[' + i9 + "] onStream", new p(i11, rVar3, zVar));
        }
    }

    public final void k(q qVar, int i, int i6, int i9) {
        int i10;
        int i11 = 0;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i6 & 8) != 0) {
            byte z3 = this.f39914n.z();
            byte[] bArr = j8.c.f38482a;
            i10 = z3 & 255;
        } else {
            i10 = 0;
        }
        int B9 = this.f39914n.B() & Integer.MAX_VALUE;
        List i12 = i(t.a(i - 4, i6, i10), i10, i6, i9);
        r rVar = qVar.f39873u;
        rVar.getClass();
        synchronized (rVar) {
            if (rVar.f39891R.contains(Integer.valueOf(B9))) {
                rVar.y(B9, EnumC4856b.f39817w);
                return;
            }
            rVar.f39891R.add(Integer.valueOf(B9));
            l8.c.c(rVar.f39876B, rVar.f39894v + '[' + B9 + "] onRequest", new l(rVar, B9, i12, i11));
        }
    }
}
