package p8;

import com.google.android.gms.internal.ads.Wv;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import v7.AbstractC5118i;
import v7.AbstractC5119j;

/* loaded from: classes2.dex */
public final class v implements Closeable {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f39963w;

    /* renamed from: n, reason: collision with root package name */
    public final y8.r f39964n;

    /* renamed from: u, reason: collision with root package name */
    public final u f39965u;

    /* renamed from: v, reason: collision with root package name */
    public final C4859e f39966v;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        kotlin.jvm.internal.h.d(logger, "getLogger(...)");
        f39963w = logger;
    }

    public v(y8.r source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f39964n = source;
        u uVar = new u(source);
        this.f39965u = uVar;
        this.f39966v = new C4859e(uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0250, code lost:
    
        throw new java.io.IOException(com.google.android.gms.internal.ads.Wv.f(r8, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z6, q qVar) {
        EnumC4856b enumC4856b;
        EnumC4856b enumC4856b2;
        Object[] array;
        int i = 1;
        int i4 = 0;
        try {
            this.f39964n.E(9L);
            int k9 = j8.c.k(this.f39964n);
            if (k9 > 16384) {
                throw new IOException(Wv.f(k9, "FRAME_SIZE_ERROR: "));
            }
            int z9 = this.f39964n.z() & 255;
            byte z10 = this.f39964n.z();
            int i6 = z10 & 255;
            int B3 = this.f39964n.B();
            int i9 = Integer.MAX_VALUE & B3;
            if (z9 != 8) {
                Logger logger = f39963w;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.b(i9, k9, z9, i6, true));
                }
            }
            if (z6 && z9 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + h.a(z9));
            }
            switch (z9) {
                case 0:
                    b(qVar, k9, i6, i9);
                    return true;
                case 1:
                    j(qVar, k9, i6, i9);
                    return true;
                case 2:
                    if (k9 != 5) {
                        throw new IOException(D.x.j(k9, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i9 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    y8.r rVar = this.f39964n;
                    rVar.B();
                    rVar.z();
                    return true;
                case 3:
                    if (k9 != 4) {
                        throw new IOException(D.x.j(k9, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i9 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int B9 = this.f39964n.B();
                    EnumC4856b.f39865u.getClass();
                    EnumC4856b[] values = EnumC4856b.values();
                    int length = values.length;
                    while (true) {
                        if (i4 < length) {
                            EnumC4856b enumC4856b3 = values[i4];
                            if (enumC4856b3.f39871n == B9) {
                                enumC4856b = enumC4856b3;
                            } else {
                                i4++;
                            }
                        } else {
                            enumC4856b = null;
                        }
                    }
                    if (enumC4856b == null) {
                        throw new IOException(Wv.f(B9, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    r rVar2 = qVar.f39923u;
                    rVar2.getClass();
                    if (i9 == 0 || (B3 & 1) != 0) {
                        z n9 = rVar2.n(i9);
                        if (n9 != null) {
                            synchronized (n9) {
                                if (n9.h() == null) {
                                    n9.f39982E = enumC4856b;
                                    n9.notifyAll();
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                    l8.c.c(rVar2.f39926B, rVar2.f39944v + '[' + i9 + "] onReset", new l(rVar2, i9, enumC4856b, i));
                    return true;
                case 4:
                    if (i9 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((z10 & 1) != 0) {
                        if (k9 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (k9 % 6 != 0) {
                        throw new IOException(Wv.f(k9, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    D d9 = new D();
                    N7.a t6 = S0.f.t(S0.f.x(0, k9), 6);
                    int i10 = t6.f2105n;
                    int i11 = t6.f2106u;
                    int i12 = t6.f2107v;
                    if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                        while (true) {
                            y8.r rVar3 = this.f39964n;
                            short C8 = rVar3.C();
                            byte[] bArr = j8.c.f38494a;
                            int i13 = C8 & 65535;
                            int B10 = rVar3.B();
                            if (i13 != 2) {
                                if (i13 != 4) {
                                    if (i13 == 5 && (B10 < 16384 || B10 > 16777215)) {
                                    }
                                } else if (B10 < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (B10 != 0 && B10 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            d9.c(i13, B10);
                            if (i10 != i11) {
                                i10 += i12;
                            }
                        }
                    }
                    r rVar4 = qVar.f39923u;
                    l8.c.c(rVar4.f39925A, Wv.i(new StringBuilder(), rVar4.f39944v, " applyAndAckSettings"), new p(i, qVar, d9));
                    return true;
                case 5:
                    k(qVar, k9, i6, i9);
                    return true;
                case 6:
                    if (k9 != 8) {
                        throw new IOException(Wv.f(k9, "TYPE_PING length != 8: "));
                    }
                    if (i9 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    final int B11 = this.f39964n.B();
                    final int B12 = this.f39964n.B();
                    if ((z10 & 1) == 0) {
                        l8.c cVar = qVar.f39923u.f39925A;
                        String i14 = Wv.i(new StringBuilder(), qVar.f39923u.f39944v, " ping");
                        final r rVar5 = qVar.f39923u;
                        l8.c.c(cVar, i14, new I7.a() { // from class: p8.o
                            @Override // I7.a
                            public final Object invoke() {
                                int i15 = B11;
                                int i16 = B12;
                                r rVar6 = r.this;
                                rVar6.getClass();
                                try {
                                    rVar6.f39939P.l(i15, i16, true);
                                } catch (IOException e9) {
                                    EnumC4856b enumC4856b4 = EnumC4856b.f39867w;
                                    rVar6.a(enumC4856b4, enumC4856b4, e9);
                                }
                                return u7.v.f41073a;
                            }
                        });
                        return true;
                    }
                    r rVar6 = qVar.f39923u;
                    synchronized (rVar6) {
                        try {
                            if (B11 == 1) {
                                rVar6.f39929E++;
                            } else if (B11 == 2) {
                                rVar6.f39931G++;
                            } else if (B11 == 3) {
                                rVar6.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (k9 < 8) {
                        throw new IOException(Wv.f(k9, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i9 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int B13 = this.f39964n.B();
                    int B14 = this.f39964n.B();
                    int i15 = k9 - 8;
                    EnumC4856b.f39865u.getClass();
                    EnumC4856b[] values2 = EnumC4856b.values();
                    int length2 = values2.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 < length2) {
                            EnumC4856b enumC4856b4 = values2[i16];
                            if (enumC4856b4.f39871n == B14) {
                                enumC4856b2 = enumC4856b4;
                            } else {
                                i16++;
                            }
                        } else {
                            enumC4856b2 = null;
                        }
                    }
                    if (enumC4856b2 == null) {
                        throw new IOException(Wv.f(B14, "TYPE_GOAWAY unexpected error code: "));
                    }
                    y8.h debugData = y8.h.f41925w;
                    if (i15 > 0) {
                        debugData = this.f39964n.A(i15);
                    }
                    kotlin.jvm.internal.h.e(debugData, "debugData");
                    debugData.a();
                    r rVar7 = qVar.f39923u;
                    synchronized (rVar7) {
                        array = rVar7.f39943u.values().toArray(new z[0]);
                        rVar7.f39947y = true;
                    }
                    z[] zVarArr = (z[]) array;
                    int length3 = zVarArr.length;
                    while (i4 < length3) {
                        z zVar = zVarArr[i4];
                        if (zVar.f39984n > B13 && zVar.i()) {
                            EnumC4856b enumC4856b5 = EnumC4856b.f39870z;
                            synchronized (zVar) {
                                if (zVar.h() == null) {
                                    zVar.f39982E = enumC4856b5;
                                    zVar.notifyAll();
                                }
                            }
                            qVar.f39923u.n(zVar.f39984n);
                        }
                        i4++;
                    }
                    return true;
                case 8:
                    try {
                        if (k9 != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + k9);
                        }
                        long B15 = this.f39964n.B() & 2147483647L;
                        if (B15 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f39963w;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(h.c(i9, k9, B15, true));
                        }
                        if (i9 == 0) {
                            r rVar8 = qVar.f39923u;
                            synchronized (rVar8) {
                                rVar8.f39937N += B15;
                                rVar8.notifyAll();
                            }
                            return true;
                        }
                        z b9 = qVar.f39923u.b(i9);
                        if (b9 != null) {
                            synchronized (b9) {
                                b9.f39988x += B15;
                                if (B15 > 0) {
                                    b9.notifyAll();
                                }
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e9) {
                        f39963w.fine(h.b(i9, k9, 8, i6, true));
                        throw e9;
                    }
                default:
                    this.f39964n.F(k9);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(q qVar, int i, int i4, final int i6) {
        int i9;
        boolean z6;
        boolean z9;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final boolean z10 = (i4 & 1) != 0;
        if ((i4 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i4 & 8) != 0) {
            byte z11 = this.f39964n.z();
            byte[] bArr = j8.c.f38494a;
            i9 = z11 & 255;
        } else {
            i9 = 0;
        }
        final int a9 = t.a(i, i4, i9);
        y8.r source = this.f39964n;
        kotlin.jvm.internal.h.e(source, "source");
        qVar.f39923u.getClass();
        if (i6 == 0 || (i6 & 1) != 0) {
            z b9 = qVar.f39923u.b(i6);
            if (b9 == null) {
                qVar.f39923u.y(i6, EnumC4856b.f39867w);
                long j6 = a9;
                qVar.f39923u.w(j6);
                source.F(j6);
            } else {
                TimeZone timeZone = j8.d.f38495a;
                x xVar = b9.f39978A;
                long j9 = a9;
                xVar.getClass();
                long j10 = j9;
                while (true) {
                    if (j10 <= 0) {
                        TimeZone timeZone2 = j8.d.f38495a;
                        xVar.f39976y.f39985u.w(j9);
                        xVar.f39976y.f39985u.f39933I.getClass();
                        break;
                    }
                    synchronized (xVar.f39976y) {
                        z6 = xVar.f39972u;
                        z9 = xVar.f39974w.f41924u + j10 > xVar.f39971n;
                    }
                    if (z9) {
                        source.F(j10);
                        xVar.f39976y.f(EnumC4856b.f39869y);
                        break;
                    }
                    if (z6) {
                        source.F(j10);
                        break;
                    }
                    long d9 = source.d(j10, xVar.f39973v);
                    if (d9 == -1) {
                        throw new EOFException();
                    }
                    j10 -= d9;
                    z zVar = xVar.f39976y;
                    synchronized (zVar) {
                        try {
                            if (xVar.f39975x) {
                                y8.e eVar = xVar.f39973v;
                                eVar.H(eVar.f41924u);
                            } else {
                                y8.e eVar2 = xVar.f39974w;
                                boolean z12 = eVar2.f41924u == 0;
                                eVar2.W(xVar.f39973v);
                                if (z12) {
                                    zVar.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z10) {
                    b9.k(i8.l.f38268u, true);
                }
            }
        } else {
            final r rVar = qVar.f39923u;
            rVar.getClass();
            final y8.e eVar3 = new y8.e();
            long j11 = a9;
            source.E(j11);
            source.d(j11, eVar3);
            l8.c.c(rVar.f39926B, rVar.f39944v + '[' + i6 + "] onData", new I7.a(i6, eVar3, a9, z10) { // from class: p8.k

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f39909u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ y8.e f39910v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f39911w;

                @Override // I7.a
                public final Object invoke() {
                    r rVar2 = r.this;
                    int i10 = this.f39909u;
                    y8.e eVar4 = this.f39910v;
                    int i11 = this.f39911w;
                    try {
                        rVar2.f39928D.getClass();
                        eVar4.H(i11);
                        rVar2.f39939P.m(i10, EnumC4856b.f39863A);
                        synchronized (rVar2) {
                            rVar2.f39941R.remove(Integer.valueOf(i10));
                        }
                    } catch (IOException unused) {
                    }
                    return u7.v.f41073a;
                }
            });
        }
        this.f39964n.F(i9);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39964n.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f39881a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List i(int i, int i4, int i6, int i9) {
        int e9;
        u uVar = this.f39965u;
        uVar.f39961x = i;
        uVar.f39958u = i;
        uVar.f39962y = i4;
        uVar.f39959v = i6;
        uVar.f39960w = i9;
        while (true) {
            C4859e c4859e = this.f39966v;
            y8.r rVar = c4859e.f39883c;
            boolean b9 = rVar.b();
            ArrayList arrayList = c4859e.f39882b;
            if (b9) {
                List J = AbstractC5119j.J(arrayList);
                arrayList.clear();
                return J;
            }
            byte z6 = rVar.z();
            byte[] bArr = j8.c.f38494a;
            int i10 = z6 & 255;
            if (i10 == 128) {
                throw new IOException("index == 0");
            }
            if ((z6 & com.anythink.core.common.s.a.c.f17103a) == 128) {
                e9 = c4859e.e(i10, com.anythink.expressad.video.module.a.a.f22515R);
                int i11 = e9 - 1;
                if (i11 >= 0) {
                    C4858d[] c4858dArr = g.f39896a;
                    if (i11 <= c4858dArr.length - 1) {
                        arrayList.add(c4858dArr[i11]);
                    }
                }
                int length = c4859e.f39885e + 1 + (i11 - g.f39896a.length);
                if (length < 0) {
                    break;
                }
                C4858d[] c4858dArr2 = c4859e.f39884d;
                if (length >= c4858dArr2.length) {
                    break;
                }
                C4858d c4858d = c4858dArr2[length];
                kotlin.jvm.internal.h.b(c4858d);
                arrayList.add(c4858d);
            } else if (i10 == 64) {
                C4858d[] c4858dArr3 = g.f39896a;
                y8.h d9 = c4859e.d();
                g.a(d9);
                c4859e.c(new C4858d(d9, c4859e.d()));
            } else if ((z6 & com.anythink.core.common.s.a.c.f17104b) == 64) {
                c4859e.c(new C4858d(c4859e.b(c4859e.e(i10, 63) - 1), c4859e.d()));
            } else if ((z6 & 32) == 32) {
                int e10 = c4859e.e(i10, 31);
                c4859e.f39881a = e10;
                if (e10 < 0 || e10 > 4096) {
                    break;
                }
                int i12 = c4859e.f39887g;
                if (e10 < i12) {
                    if (e10 == 0) {
                        C4858d[] c4858dArr4 = c4859e.f39884d;
                        AbstractC5118i.y(c4858dArr4, 0, c4858dArr4.length);
                        c4859e.f39885e = c4859e.f39884d.length - 1;
                        c4859e.f39886f = 0;
                        c4859e.f39887g = 0;
                    } else {
                        c4859e.a(i12 - e10);
                    }
                }
            } else if (i10 == 16 || i10 == 0) {
                C4858d[] c4858dArr5 = g.f39896a;
                y8.h d10 = c4859e.d();
                g.a(d10);
                arrayList.add(new C4858d(d10, c4859e.d()));
            } else {
                arrayList.add(new C4858d(c4859e.b(c4859e.e(i10, 15) - 1), c4859e.d()));
            }
        }
        throw new IOException(Wv.f(e9, "Header index too large "));
    }

    public final void j(q qVar, int i, int i4, int i6) {
        int i9;
        int i10 = 0;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z6 = (i4 & 1) != 0;
        if ((i4 & 8) != 0) {
            byte z9 = this.f39964n.z();
            byte[] bArr = j8.c.f38494a;
            i9 = z9 & 255;
        } else {
            i9 = 0;
        }
        if ((i4 & 32) != 0) {
            y8.r rVar = this.f39964n;
            rVar.B();
            rVar.z();
            byte[] bArr2 = j8.c.f38494a;
            i -= 5;
        }
        List i11 = i(t.a(i, i4, i9), i9, i4, i6);
        qVar.f39923u.getClass();
        if (i6 != 0 && (i6 & 1) == 0) {
            r rVar2 = qVar.f39923u;
            rVar2.getClass();
            l8.c.c(rVar2.f39926B, rVar2.f39944v + '[' + i6 + "] onHeaders", new l(rVar2, i6, i11, z6));
            return;
        }
        r rVar3 = qVar.f39923u;
        synchronized (rVar3) {
            z b9 = rVar3.b(i6);
            if (b9 != null) {
                b9.k(j8.d.h(i11), z6);
                return;
            }
            if (rVar3.f39947y) {
                return;
            }
            if (i6 <= rVar3.f39945w) {
                return;
            }
            if (i6 % 2 == rVar3.f39946x % 2) {
                return;
            }
            z zVar = new z(i6, rVar3, false, z6, j8.d.h(i11));
            rVar3.f39945w = i6;
            rVar3.f39943u.put(Integer.valueOf(i6), zVar);
            l8.c.c(rVar3.f39948z.d(), rVar3.f39944v + '[' + i6 + "] onStream", new p(i10, rVar3, zVar));
        }
    }

    public final void k(q qVar, int i, int i4, int i6) {
        int i9;
        int i10 = 0;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i4 & 8) != 0) {
            byte z6 = this.f39964n.z();
            byte[] bArr = j8.c.f38494a;
            i9 = z6 & 255;
        } else {
            i9 = 0;
        }
        int B3 = this.f39964n.B() & Integer.MAX_VALUE;
        List i11 = i(t.a(i - 4, i4, i9), i9, i4, i6);
        r rVar = qVar.f39923u;
        rVar.getClass();
        synchronized (rVar) {
            if (rVar.f39941R.contains(Integer.valueOf(B3))) {
                rVar.y(B3, EnumC4856b.f39867w);
                return;
            }
            rVar.f39941R.add(Integer.valueOf(B3));
            l8.c.c(rVar.f39926B, rVar.f39944v + '[' + B3 + "] onRequest", new l(rVar, B3, i11, i10));
        }
    }
}
