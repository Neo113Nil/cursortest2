package Q1;

import i1.AbstractC0251h;
import i1.AbstractC0252i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import u0.AbstractC1050a;
import w1.C1060a;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f1664d;

    /* renamed from: a, reason: collision with root package name */
    public final W1.q f1665a;

    /* renamed from: b, reason: collision with root package name */
    public final t f1666b;

    /* renamed from: c, reason: collision with root package name */
    public final C0081d f1667c;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        kotlin.jvm.internal.i.d(logger, "getLogger(Http2::class.java.name)");
        f1664d = logger;
    }

    public u(W1.q source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f1665a = source;
        t tVar = new t(source);
        this.f1666b = tVar;
        this.f1667c = new C0081d(tVar);
    }

    public final boolean a(boolean z2, l handler) {
        EnumC0079b enumC0079b;
        int l2;
        Object[] array;
        int i2 = 2;
        kotlin.jvm.internal.i.e(handler, "handler");
        int i3 = 0;
        try {
            this.f1665a.q(9L);
            int s2 = K1.b.s(this.f1665a);
            if (s2 > 16384) {
                throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(s2), "FRAME_SIZE_ERROR: "));
            }
            int c2 = this.f1665a.c() & 255;
            byte c3 = this.f1665a.c();
            int i4 = c3 & 255;
            int l3 = this.f1665a.l();
            int i5 = Integer.MAX_VALUE & l3;
            Logger logger = f1664d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(true, i5, s2, c2, i4));
            }
            if (z2 && c2 != 4) {
                String[] strArr = g.f1600b;
                throw new IOException(kotlin.jvm.internal.i.h(c2 < strArr.length ? strArr[c2] : K1.b.i("0x%02x", Integer.valueOf(c2)), "Expected a SETTINGS frame but was "));
            }
            EnumC0079b enumC0079b2 = null;
            switch (c2) {
                case 0:
                    c(handler, s2, i4, i5);
                    return true;
                case 1:
                    k(handler, s2, i4, i5);
                    return true;
                case 2:
                    if (s2 != 5) {
                        throw new IOException(C1.a.g(s2, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    W1.q qVar = this.f1665a;
                    qVar.l();
                    qVar.c();
                    return true;
                case 3:
                    if (s2 != 4) {
                        throw new IOException(C1.a.g(s2, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int l4 = this.f1665a.l();
                    EnumC0079b[] values = EnumC0079b.values();
                    int length = values.length;
                    while (true) {
                        if (i3 < length) {
                            enumC0079b = values[i3];
                            if (enumC0079b.f1571a != l4) {
                                i3++;
                            }
                        } else {
                            enumC0079b = null;
                        }
                    }
                    if (enumC0079b == null) {
                        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(l4), "TYPE_RST_STREAM unexpected error code: "));
                    }
                    q qVar2 = handler.f1611b;
                    qVar2.getClass();
                    if (i5 == 0 || (l3 & 1) != 0) {
                        y j2 = qVar2.j(i5);
                        if (j2 != null) {
                            j2.k(enumC0079b);
                        }
                    } else {
                        qVar2.f1634i.c(new n(qVar2.f1628c + '[' + i5 + "] onReset", qVar2, i5, enumC0079b, 2), 0L);
                    }
                    return true;
                case 4:
                    if (i5 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((c3 & 1) != 0) {
                        if (s2 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                    } else {
                        if (s2 % 6 != 0) {
                            throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(s2), "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        D d2 = new D();
                        C1060a C2 = AbstractC1050a.C(AbstractC1050a.E(0, s2), 6);
                        int i6 = C2.f8516a;
                        int i7 = C2.f8517b;
                        int i8 = C2.f8518c;
                        if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                            while (true) {
                                int i9 = i6 + i8;
                                W1.q qVar3 = this.f1665a;
                                short n2 = qVar3.n();
                                byte[] bArr = K1.b.f1051a;
                                int i10 = n2 & 65535;
                                l2 = qVar3.l();
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        i10 = 4;
                                    } else if (i10 != 4) {
                                        if (i10 == 5 && (l2 < 16384 || l2 > 16777215)) {
                                        }
                                    } else {
                                        if (l2 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i10 = 7;
                                    }
                                } else if (l2 != 0 && l2 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                d2.c(i10, l2);
                                if (i6 != i7) {
                                    i6 = i9;
                                }
                            }
                            throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(l2), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        }
                        q qVar4 = handler.f1611b;
                        qVar4.f1633h.c(new j(kotlin.jvm.internal.i.h(" applyAndAckSettings", qVar4.f1628c), handler, d2, i2), 0L);
                    }
                    return true;
                case 5:
                    l(handler, s2, i4, i5);
                    return true;
                case 6:
                    if (s2 != 8) {
                        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(s2), "TYPE_PING length != 8: "));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int l5 = this.f1665a.l();
                    int l6 = this.f1665a.l();
                    if ((c3 & 1) != 0) {
                        q qVar5 = handler.f1611b;
                        synchronized (qVar5) {
                            try {
                                if (l5 == 1) {
                                    qVar5.f1637l++;
                                } else if (l5 == 2) {
                                    qVar5.f1639n++;
                                } else if (l5 == 3) {
                                    qVar5.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        q qVar6 = handler.f1611b;
                        qVar6.f1633h.c(new k(kotlin.jvm.internal.i.h(" ping", qVar6.f1628c), handler.f1611b, l5, l6), 0L);
                    }
                    return true;
                case 7:
                    if (s2 < 8) {
                        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(s2), "TYPE_GOAWAY length < 8: "));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int l7 = this.f1665a.l();
                    int l8 = this.f1665a.l();
                    int i11 = s2 - 8;
                    EnumC0079b[] values2 = EnumC0079b.values();
                    int length2 = values2.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            EnumC0079b enumC0079b3 = values2[i12];
                            if (enumC0079b3.f1571a == l8) {
                                enumC0079b2 = enumC0079b3;
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (enumC0079b2 == null) {
                        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(l8), "TYPE_GOAWAY unexpected error code: "));
                    }
                    W1.j debugData = W1.j.f1876d;
                    if (i11 > 0) {
                        debugData = this.f1665a.j(i11);
                    }
                    kotlin.jvm.internal.i.e(debugData, "debugData");
                    debugData.a();
                    q qVar7 = handler.f1611b;
                    synchronized (qVar7) {
                        array = qVar7.f1627b.values().toArray(new y[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        qVar7.f1631f = true;
                    }
                    y[] yVarArr = (y[]) array;
                    int length3 = yVarArr.length;
                    while (i3 < length3) {
                        y yVar = yVarArr[i3];
                        i3++;
                        if (yVar.f1679a > l7 && yVar.h()) {
                            yVar.k(EnumC0079b.REFUSED_STREAM);
                            handler.f1611b.j(yVar.f1679a);
                        }
                    }
                    return true;
                case 8:
                    if (s2 != 4) {
                        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(s2), "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long l9 = this.f1665a.l() & 2147483647L;
                    if (l9 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i5 == 0) {
                        q qVar8 = handler.f1611b;
                        synchronized (qVar8) {
                            qVar8.f1645u += l9;
                            qVar8.notifyAll();
                        }
                    } else {
                        y c4 = handler.f1611b.c(i5);
                        if (c4 != null) {
                            synchronized (c4) {
                                c4.f1684f += l9;
                                if (l9 > 0) {
                                    c4.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                default:
                    this.f1665a.r(s2);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(l handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        if (!a(true, handler)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public final void c(l lVar, int i2, int i3, int i4) {
        int i5;
        int i6;
        y yVar;
        boolean z2;
        boolean z3;
        long j2;
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z4 = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i3 & 8) != 0) {
            byte c2 = this.f1665a.c();
            byte[] bArr = K1.b.f1051a;
            i6 = c2 & 255;
            i5 = i2;
        } else {
            i5 = i2;
            i6 = 0;
        }
        int a2 = s.a(i5, i3, i6);
        W1.q source = this.f1665a;
        lVar.getClass();
        kotlin.jvm.internal.i.e(source, "source");
        lVar.f1611b.getClass();
        if (i4 != 0 && (i4 & 1) == 0) {
            q qVar = lVar.f1611b;
            qVar.getClass();
            W1.g gVar = new W1.g();
            long j3 = a2;
            source.q(j3);
            source.e(gVar, j3);
            qVar.f1634i.c(new m(qVar.f1628c + '[' + i4 + "] onData", qVar, i4, gVar, a2, z4), 0L);
        } else {
            y c3 = lVar.f1611b.c(i4);
            if (c3 == null) {
                lVar.f1611b.n(i4, EnumC0079b.PROTOCOL_ERROR);
                long j4 = a2;
                lVar.f1611b.l(j4);
                source.r(j4);
            } else {
                byte[] bArr2 = K1.b.f1051a;
                w wVar = c3.f1687i;
                long j5 = a2;
                wVar.getClass();
                while (true) {
                    if (j5 <= 0) {
                        yVar = c3;
                        break;
                    }
                    synchronized (wVar.f1677f) {
                        z2 = wVar.f1673b;
                        yVar = c3;
                        z3 = wVar.f1675d.f1875b + j5 > wVar.f1672a;
                    }
                    if (z3) {
                        source.r(j5);
                        wVar.f1677f.e(EnumC0079b.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        source.r(j5);
                        break;
                    }
                    long e2 = source.e(wVar.f1674c, j5);
                    if (e2 == -1) {
                        throw new EOFException();
                    }
                    j5 -= e2;
                    y yVar2 = wVar.f1677f;
                    synchronized (yVar2) {
                        if (wVar.f1676e) {
                            W1.g gVar2 = wVar.f1674c;
                            j2 = gVar2.f1875b;
                            gVar2.o(j2);
                        } else {
                            W1.g gVar3 = wVar.f1675d;
                            boolean z5 = gVar3.f1875b == 0;
                            gVar3.t(wVar.f1674c);
                            if (z5) {
                                yVar2.notifyAll();
                            }
                            j2 = 0;
                        }
                    }
                    if (j2 > 0) {
                        wVar.a(j2);
                    }
                    c3 = yVar;
                }
                if (z4) {
                    yVar.j(K1.b.f1052b, true);
                }
            }
        }
        this.f1665a.r(i6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1665a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(r6.f1581a), "Invalid dynamic table size update "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List j(int i2, int i3, int i4, int i5) {
        int e2;
        t tVar = this.f1666b;
        tVar.f1662e = i2;
        tVar.f1659b = i2;
        tVar.f1663f = i3;
        tVar.f1660c = i4;
        tVar.f1661d = i5;
        while (true) {
            C0081d c0081d = this.f1667c;
            W1.q qVar = c0081d.f1583c;
            boolean a2 = qVar.a();
            ArrayList arrayList = c0081d.f1582b;
            if (a2) {
                List R2 = AbstractC0252i.R(arrayList);
                arrayList.clear();
                return R2;
            }
            byte c2 = qVar.c();
            byte[] bArr = K1.b.f1051a;
            int i6 = c2 & 255;
            if (i6 == 128) {
                throw new IOException("index == 0");
            }
            if ((c2 & 128) == 128) {
                e2 = c0081d.e(i6, 127);
                int i7 = e2 - 1;
                if (i7 >= 0) {
                    C0080c[] c0080cArr = f.f1597a;
                    if (i7 <= c0080cArr.length - 1) {
                        arrayList.add(c0080cArr[i7]);
                    }
                }
                int length = c0081d.f1585e + 1 + (i7 - f.f1597a.length);
                if (length < 0) {
                    break;
                }
                C0080c[] c0080cArr2 = c0081d.f1584d;
                if (length >= c0080cArr2.length) {
                    break;
                }
                C0080c c0080c = c0080cArr2[length];
                kotlin.jvm.internal.i.b(c0080c);
                arrayList.add(c0080c);
            } else if (i6 == 64) {
                C0080c[] c0080cArr3 = f.f1597a;
                W1.j d2 = c0081d.d();
                f.a(d2);
                c0081d.c(new C0080c(d2, c0081d.d()));
            } else if ((c2 & 64) == 64) {
                c0081d.c(new C0080c(c0081d.b(c0081d.e(i6, 63) - 1), c0081d.d()));
            } else if ((c2 & 32) == 32) {
                int e3 = c0081d.e(i6, 31);
                c0081d.f1581a = e3;
                if (e3 < 0 || e3 > 4096) {
                    break;
                }
                int i8 = c0081d.f1587g;
                if (e3 < i8) {
                    if (e3 == 0) {
                        C0080c[] c0080cArr4 = c0081d.f1584d;
                        AbstractC0251h.P(c0080cArr4, 0, c0080cArr4.length);
                        c0081d.f1585e = c0081d.f1584d.length - 1;
                        c0081d.f1586f = 0;
                        c0081d.f1587g = 0;
                    } else {
                        c0081d.a(i8 - e3);
                    }
                }
            } else if (i6 == 16 || i6 == 0) {
                C0080c[] c0080cArr5 = f.f1597a;
                W1.j d3 = c0081d.d();
                f.a(d3);
                arrayList.add(new C0080c(d3, c0081d.d()));
            } else {
                arrayList.add(new C0080c(c0081d.b(c0081d.e(i6, 15) - 1), c0081d.d()));
            }
        }
        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(e2), "Header index too large "));
    }

    public final void k(l lVar, int i2, int i3, int i4) {
        int i5;
        int i6 = 1;
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = false;
        boolean z3 = (i3 & 1) != 0;
        if ((i3 & 8) != 0) {
            byte c2 = this.f1665a.c();
            byte[] bArr = K1.b.f1051a;
            i5 = c2 & 255;
        } else {
            i5 = 0;
        }
        if ((i3 & 32) != 0) {
            W1.q qVar = this.f1665a;
            qVar.l();
            qVar.c();
            byte[] bArr2 = K1.b.f1051a;
            lVar.getClass();
            i2 -= 5;
        }
        List j2 = j(s.a(i2, i3, i5), i5, i3, i4);
        lVar.getClass();
        lVar.f1611b.getClass();
        if (i4 != 0 && (i4 & 1) == 0) {
            z2 = true;
        }
        if (z2) {
            q qVar2 = lVar.f1611b;
            qVar2.getClass();
            qVar2.f1634i.c(new n(qVar2.f1628c + '[' + i4 + "] onHeaders", qVar2, i4, j2, z3), 0L);
            return;
        }
        q qVar3 = lVar.f1611b;
        synchronized (qVar3) {
            y c3 = qVar3.c(i4);
            if (c3 != null) {
                c3.j(K1.b.u(j2), z3);
                return;
            }
            if (qVar3.f1631f) {
                return;
            }
            if (i4 <= qVar3.f1629d) {
                return;
            }
            if (i4 % 2 == qVar3.f1630e % 2) {
                return;
            }
            y yVar = new y(i4, qVar3, false, z3, K1.b.u(j2));
            qVar3.f1629d = i4;
            qVar3.f1627b.put(Integer.valueOf(i4), yVar);
            qVar3.f1632g.e().c(new j(qVar3.f1628c + '[' + i4 + "] onStream", qVar3, yVar, i6), 0L);
        }
    }

    public final void l(l lVar, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i3 & 8) != 0) {
            byte c2 = this.f1665a.c();
            byte[] bArr = K1.b.f1051a;
            i5 = c2 & 255;
        } else {
            i5 = 0;
        }
        int l2 = this.f1665a.l() & Integer.MAX_VALUE;
        List j2 = j(s.a(i2 - 4, i3, i5), i5, i3, i4);
        lVar.getClass();
        q qVar = lVar.f1611b;
        qVar.getClass();
        synchronized (qVar) {
            if (qVar.f1649y.contains(Integer.valueOf(l2))) {
                qVar.n(l2, EnumC0079b.PROTOCOL_ERROR);
                return;
            }
            qVar.f1649y.add(Integer.valueOf(l2));
            qVar.f1634i.c(new n(qVar.f1628c + '[' + l2 + "] onRequest", qVar, l2, j2, 1), 0L);
        }
    }
}
