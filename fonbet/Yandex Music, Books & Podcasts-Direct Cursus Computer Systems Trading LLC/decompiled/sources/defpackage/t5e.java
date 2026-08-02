package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.a;

/* loaded from: classes5.dex */
public final class t5e implements Closeable {
    public static final Logger d;
    public final ij3 a;
    public final s5e b;
    public final q4e c;

    static {
        Logger logger = Logger.getLogger(f5e.class.getName());
        logger.getClass();
        d = logger;
    }

    public t5e(ikn iknVar) {
        iknVar.getClass();
        this.a = iknVar;
        s5e s5eVar = new s5e(iknVar);
        this.b = s5eVar;
        this.c = new q4e(s5eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0239, code lost:
    
        defpackage.kac.f(defpackage.k5r.i(r2, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0242, code lost:
    
        return r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z, uv uvVar) {
        int i;
        int i2;
        Object[] array;
        try {
            this.a.a0(9L);
            int t = cvt.t(this.a);
            if (t > 16384) {
                kac.f(k5r.i(t, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int readByte = this.a.readByte() & 255;
            byte readByte2 = this.a.readByte();
            int i3 = readByte2 & 255;
            int readInt = this.a.readInt();
            int i4 = readInt & Integer.MAX_VALUE;
            Logger logger = d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f5e.a(true, i4, t, readByte, i3));
            }
            if (z && readByte != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = f5e.b;
                sb.append(readByte < strArr.length ? strArr[readByte] : cvt.i("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            int i5 = 3;
            int i6 = 2;
            switch (readByte) {
                case 0:
                    b(uvVar, t, i3, i4);
                    return true;
                case 1:
                    o(uvVar, t, i3, i4);
                    return true;
                case 2:
                    if (t != 5) {
                        kac.f(dfi.c(t, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i4 == 0) {
                        kac.f("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    ij3 ij3Var = this.a;
                    ij3Var.readInt();
                    ij3Var.readByte();
                    return true;
                case 3:
                    if (t != 4) {
                        kac.f(dfi.c(t, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i4 == 0) {
                        kac.f("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int readInt2 = this.a.readInt();
                    int[] E = ouj.E(14);
                    int length = E.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length) {
                            int i8 = E[i7];
                            if (ouj.D(i8) == readInt2) {
                                i = i8;
                            } else {
                                i7++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        kac.f(k5r.i(readInt2, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    o5e o5eVar = (o5e) uvVar.c;
                    if ((i4 != 0 && (readInt & 1) == 0) == true) {
                        o5eVar.i.c(new k5e(o5eVar.c + '[' + i4 + "] onReset", o5eVar, i4, i, 1), 0L);
                        return true;
                    }
                    x5e g = o5eVar.g(i4);
                    if (g == null) {
                        return true;
                    }
                    synchronized (g) {
                        if (i == 0) {
                            throw null;
                        }
                        if (g.m == 0) {
                            g.m = i;
                            g.notifyAll();
                        }
                    }
                    return true;
                case 4:
                    ij3 ij3Var2 = this.a;
                    if (i4 != 0) {
                        kac.f("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((readByte2 & 1) == 0) {
                        if (t % 6 != 0) {
                            kac.f(k5r.i(t, "TYPE_SETTINGS length % 6 != 0: "));
                            return false;
                        }
                        app appVar = new app();
                        a l = yhn.l(6, yhn.m(0, t));
                        int i9 = l.a;
                        int i10 = l.b;
                        int i11 = l.c;
                        if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                            while (true) {
                                short readShort = ij3Var2.readShort();
                                byte[] bArr = cvt.a;
                                int i12 = readShort & 65535;
                                boolean z2 = r2;
                                int readInt3 = ij3Var2.readInt();
                                if (i12 != 2) {
                                    if (i12 == i5) {
                                        i12 = 4;
                                    } else if (i12 != 4) {
                                        if (i12 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                        }
                                    } else {
                                        if (readInt3 < 0) {
                                            kac.f("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                            return z2;
                                        }
                                        i12 = 7;
                                    }
                                } else if (readInt3 != 0 && readInt3 != 1) {
                                    kac.f("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                    return z2;
                                }
                                appVar.b(i12, readInt3);
                                if (i9 != i10) {
                                    i9 += i11;
                                    r2 = z2 ? 1 : 0;
                                    i5 = 3;
                                }
                            }
                        }
                        o5e o5eVar2 = (o5e) uvVar.c;
                        o5eVar2.h.c(new j5e(su4.o(new StringBuilder(), o5eVar2.c, " applyAndAckSettings"), uvVar, appVar, i6), 0L);
                        return true;
                    }
                    if (t != 0) {
                        kac.f("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    break;
                case 5:
                    z(uvVar, t, i3, i4);
                    return true;
                case 6:
                    if (t != 8) {
                        kac.f(k5r.i(t, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        kac.f("TYPE_PING streamId != 0");
                        return false;
                    }
                    int readInt4 = this.a.readInt();
                    int readInt5 = this.a.readInt();
                    r2 = (readByte2 & 1) != 0 ? 1 : 0;
                    o5e o5eVar3 = (o5e) uvVar.c;
                    if (r2 == 0) {
                        o5eVar3.h.c(new k5e(su4.o(new StringBuilder(), ((o5e) uvVar.c).c, " ping"), (o5e) uvVar.c, readInt4, readInt5, 0), 0L);
                        return true;
                    }
                    synchronized (o5eVar3) {
                        try {
                            if (readInt4 == 1) {
                                o5eVar3.l++;
                            } else if (readInt4 == 2) {
                                o5eVar3.n++;
                            } else if (readInt4 == 3) {
                                o5eVar3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (t < 8) {
                        kac.f(k5r.i(t, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        kac.f("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int readInt6 = this.a.readInt();
                    int readInt7 = this.a.readInt();
                    int i13 = t - 8;
                    int[] E2 = ouj.E(14);
                    int length2 = E2.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length2) {
                            i2 = E2[i14];
                            if (ouj.D(i2) != readInt7) {
                                i14++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        kac.f(k5r.i(readInt7, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    pn3 pn3Var = pn3.d;
                    if (i13 > 0) {
                        pn3Var = this.a.g0(i13);
                    }
                    pn3Var.getClass();
                    pn3Var.d();
                    o5e o5eVar4 = (o5e) uvVar.c;
                    synchronized (o5eVar4) {
                        array = o5eVar4.b.values().toArray(new x5e[0]);
                        o5eVar4.f = true;
                    }
                    x5e[] x5eVarArr = (x5e[]) array;
                    int length3 = x5eVarArr.length;
                    while (r2 < length3) {
                        x5e x5eVar = x5eVarArr[r2];
                        if (x5eVar.a > readInt6 && x5eVar.g()) {
                            synchronized (x5eVar) {
                                if (x5eVar.m == 0) {
                                    x5eVar.m = 8;
                                    x5eVar.notifyAll();
                                }
                            }
                            ((o5e) uvVar.c).g(x5eVar.a);
                        }
                        r2++;
                    }
                    break;
                case 8:
                    if (t != 4) {
                        kac.f(k5r.i(t, "TYPE_WINDOW_UPDATE length !=4: "));
                        return false;
                    }
                    long readInt8 = 2147483647L & this.a.readInt();
                    if (readInt8 == 0) {
                        kac.f("windowSizeIncrement was 0");
                        return false;
                    }
                    o5e o5eVar5 = (o5e) uvVar.c;
                    if (i4 == 0) {
                        synchronized (o5eVar5) {
                            o5eVar5.u += readInt8;
                            o5eVar5.notifyAll();
                        }
                        return true;
                    }
                    x5e b = o5eVar5.b(i4);
                    if (b != null) {
                        synchronized (b) {
                            b.f += readInt8;
                            if (readInt8 > 0) {
                                b.notifyAll();
                            }
                        }
                        return true;
                    }
                    break;
                default:
                    this.a.skip(t);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(uv uvVar, int i, int i2, int i3) {
        int i4;
        boolean z;
        long j;
        boolean z2;
        if (i3 == 0) {
            kac.f("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            kac.f("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.a.readByte();
            byte[] bArr = cvt.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int J = tt0.J(i, i2, i4);
        ij3 ij3Var = this.a;
        ij3Var.getClass();
        o5e o5eVar = (o5e) uvVar.c;
        long j2 = 0;
        if (i3 != 0 && (i3 & 1) == 0) {
            hi3 hi3Var = new hi3();
            long j3 = J;
            ij3Var.a0(j3);
            ij3Var.e0(hi3Var, j3);
            o5eVar.i.c(new l5e(o5eVar.c + '[' + i3 + "] onData", o5eVar, i3, hi3Var, J, z3), 0L);
        } else {
            x5e b = o5eVar.b(i3);
            if (b == null) {
                ((o5e) uvVar.c).H(i3, 2);
                long j4 = J;
                ((o5e) uvVar.c).z(j4);
                ij3Var.skip(j4);
            } else {
                byte[] bArr2 = cvt.a;
                v5e v5eVar = b.i;
                long j5 = J;
                v5eVar.getClass();
                long j6 = j5;
                while (true) {
                    x5e x5eVar = v5eVar.f;
                    if (j6 <= j2) {
                        byte[] bArr3 = cvt.a;
                        x5eVar.b.z(j5);
                        break;
                    }
                    synchronized (x5eVar) {
                        z = v5eVar.b;
                        j = j2;
                        z2 = v5eVar.d.b + j6 > v5eVar.a;
                    }
                    if (z2) {
                        ij3Var.skip(j6);
                        v5eVar.f.e(4);
                        break;
                    }
                    if (z) {
                        ij3Var.skip(j6);
                        break;
                    }
                    long e0 = ij3Var.e0(v5eVar.c, j6);
                    if (e0 == -1) {
                        xq0.v();
                        return;
                    }
                    j6 -= e0;
                    x5e x5eVar2 = v5eVar.f;
                    synchronized (x5eVar2) {
                        try {
                            if (v5eVar.e) {
                                v5eVar.c.b();
                            } else {
                                hi3 hi3Var2 = v5eVar.d;
                                boolean z4 = hi3Var2.b == j;
                                hi3Var2.o0(v5eVar.c);
                                if (z4) {
                                    x5eVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j2 = j;
                }
                if (z3) {
                    b.i(cvt.b, true);
                }
            }
        }
        this.a.skip(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final List g(int i, int i2, int i3, int i4) {
        s5e s5eVar = this.b;
        s5eVar.e = i;
        s5eVar.b = i;
        s5eVar.f = i2;
        s5eVar.c = i3;
        s5eVar.d = i4;
        q4e q4eVar = this.c;
        ikn iknVar = q4eVar.c;
        ArrayList arrayList = q4eVar.b;
        while (!iknVar.a()) {
            byte readByte = iknVar.readByte();
            byte[] bArr = cvt.a;
            int i5 = readByte & 255;
            if (i5 == 128) {
                kac.f("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int e = q4eVar.e(i5, 127);
                int i6 = e - 1;
                if (i6 >= 0) {
                    wtd[] wtdVarArr = t4e.a;
                    if (i6 <= wtdVarArr.length - 1) {
                        arrayList.add(wtdVarArr[i6]);
                    }
                }
                int length = q4eVar.e + 1 + (i6 - t4e.a.length);
                if (length >= 0) {
                    wtd[] wtdVarArr2 = q4eVar.d;
                    if (length < wtdVarArr2.length) {
                        wtd wtdVar = wtdVarArr2[length];
                        wtdVar.getClass();
                        arrayList.add(wtdVar);
                    }
                }
                kac.f(k5r.i(e, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                wtd[] wtdVarArr3 = t4e.a;
                pn3 d2 = q4eVar.d();
                t4e.a(d2);
                q4eVar.c(new wtd(d2, q4eVar.d()));
            } else if ((readByte & 64) == 64) {
                q4eVar.c(new wtd(q4eVar.b(q4eVar.e(i5, 63) - 1), q4eVar.d()));
            } else if ((readByte & 32) == 32) {
                int e2 = q4eVar.e(i5, 31);
                q4eVar.a = e2;
                if (e2 < 0 || e2 > 4096) {
                    kac.i(q4eVar.a, "Invalid dynamic table size update ");
                    return null;
                }
                int i7 = q4eVar.g;
                if (e2 < i7) {
                    if (e2 == 0) {
                        uz0.l(0, r8.length, null, q4eVar.d);
                        q4eVar.e = q4eVar.d.length - 1;
                        q4eVar.f = 0;
                        q4eVar.g = 0;
                    } else {
                        q4eVar.a(i7 - e2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                wtd[] wtdVarArr4 = t4e.a;
                pn3 d3 = q4eVar.d();
                t4e.a(d3);
                arrayList.add(new wtd(d3, q4eVar.d()));
            } else {
                arrayList.add(new wtd(q4eVar.b(q4eVar.e(i5, 15) - 1), q4eVar.d()));
            }
        }
        List w0 = CollectionsKt.w0(arrayList);
        arrayList.clear();
        return w0;
    }

    public final void o(uv uvVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            kac.f("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        int i5 = 1;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.a.readByte();
            byte[] bArr = cvt.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            ij3 ij3Var = this.a;
            ij3Var.readInt();
            ij3Var.readByte();
            byte[] bArr2 = cvt.a;
            i -= 5;
        }
        List g = g(tt0.J(i, i2, i4), i4, i2, i3);
        g.getClass();
        o5e o5eVar = (o5e) uvVar.c;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            o5eVar.i.c(new m5e(o5eVar.c + '[' + i3 + "] onHeaders", o5eVar, i3, g, z2), 0L);
            return;
        }
        synchronized (o5eVar) {
            x5e b = o5eVar.b(i3);
            if (b != null) {
                b.i(cvt.v(g), z2);
                return;
            }
            if (o5eVar.f) {
                return;
            }
            if (i3 <= o5eVar.d) {
                return;
            }
            if (i3 % 2 == o5eVar.e % 2) {
                return;
            }
            x5e x5eVar = new x5e(i3, o5eVar, false, z2, cvt.v(g));
            o5eVar.d = i3;
            o5eVar.b.put(Integer.valueOf(i3), x5eVar);
            o5eVar.g.e().c(new j5e(o5eVar.c + '[' + i3 + "] onStream", o5eVar, x5eVar, i5), 0L);
        }
    }

    public final void z(uv uvVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            kac.f("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.a.readByte();
            byte[] bArr = cvt.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int readInt = this.a.readInt() & Integer.MAX_VALUE;
        List g = g(tt0.J(i - 4, i2, i4), i4, i2, i3);
        g.getClass();
        o5e o5eVar = (o5e) uvVar.c;
        synchronized (o5eVar) {
            if (o5eVar.y.contains(Integer.valueOf(readInt))) {
                o5eVar.H(readInt, 2);
                return;
            }
            o5eVar.y.add(Integer.valueOf(readInt));
            o5eVar.i.c(new m5e(o5eVar.c + '[' + readInt + "] onRequest", o5eVar, readInt, g), 0L);
        }
    }
}
