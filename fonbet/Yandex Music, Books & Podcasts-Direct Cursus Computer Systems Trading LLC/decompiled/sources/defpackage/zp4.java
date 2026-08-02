package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Handler;
import android.os.HandlerThread;
import io.grpc.okhttp.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zp4 implements Closeable {
    public final /* synthetic */ int a;
    public final Closeable b;
    public final Object c;
    public final Object d;

    public zp4(bjo bjoVar, OutputStream outputStream) {
        this.a = 3;
        this.b = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper());
    }

    public void D(moj mojVar, int i, int i2) {
        afb afbVar;
        if (i != 4) {
            g5e.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            g5e.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int readInt = ((ikn) this.b).readInt();
        afb[] values = afb.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                afbVar = null;
                break;
            }
            afbVar = values[i3];
            if (afbVar.a == readInt) {
                break;
            } else {
                i3++;
            }
        }
        if (afbVar == null) {
            g5e.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        }
        boolean z = true;
        ((j6e) mojVar.c).n(1, i2, afbVar);
        sgr c = noj.v(afbVar).c("Rst Stream");
        rgr rgrVar = c.a;
        if (rgrVar != rgr.CANCELLED && rgrVar != rgr.DEADLINE_EXCEEDED) {
            z = false;
        }
        synchronized (((noj) mojVar.e).k) {
            try {
                a aVar = (a) ((noj) mojVar.e).n.get(Integer.valueOf(i2));
                if (aVar != null) {
                    e3s e3sVar = aVar.l.H;
                    jkk.a.getClass();
                    ((noj) mojVar.e).i(i2, c, afbVar == afb.REFUSED_STREAM ? no4.b : no4.a, z, null, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void H(moj mojVar, int i, byte b, int i2) {
        boolean z;
        int readInt;
        if (i2 != 0) {
            g5e.c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b & 1) != 0) {
            if (i == 0) {
                return;
            }
            g5e.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            throw null;
        }
        if (i % 6 != 0) {
            g5e.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        iqe iqeVar = new iqe(2, false);
        int i3 = 0;
        while (true) {
            short s = 4;
            if (i3 >= i) {
                ((j6e) mojVar.c).q(1, iqeVar);
                synchronized (((noj) mojVar.e).k) {
                    try {
                        if (iqeVar.a(4)) {
                            ((noj) mojVar.e).C = iqeVar.a[4];
                        }
                        if (iqeVar.a(7)) {
                            int i4 = iqeVar.a[7];
                            anx anxVar = ((noj) mojVar.e).j;
                            if (i4 >= 0) {
                                int i5 = i4 - anxVar.a;
                                anxVar.a = i4;
                                z = false;
                                for (pxj pxjVar : ((noj) anxVar.b).j()) {
                                    pxjVar.a(i5);
                                }
                                if (i5 > 0) {
                                    z = true;
                                }
                            } else {
                                anxVar.getClass();
                                xq0.x(k5r.i(i4, "Invalid initial window size: "));
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (mojVar.b) {
                            r0o r0oVar = ((noj) mojVar.e).h;
                            owe oweVar = (owe) r0oVar.d;
                            oweVar.i.I(2, "READY");
                            oweVar.j.execute(new mwe(r0oVar, 0));
                            mojVar.b = false;
                        }
                        ynb ynbVar = ((noj) mojVar.e).i;
                        j6e j6eVar = ynbVar.c;
                        if (j6eVar.h()) {
                            ((Logger) j6eVar.a).log((Level) j6eVar.b, "OUTBOUND".concat(" SETTINGS: ack=true"));
                        }
                        try {
                            ynbVar.b.a(iqeVar);
                        } catch (IOException e) {
                            ynbVar.a.o(e);
                        }
                        if (z) {
                            ((noj) mojVar.e).j.G();
                        }
                        ((noj) mojVar.e).s();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i6 = iqeVar.b;
                if (((i6 & 2) != 0 ? iqeVar.a[1] : -1) >= 0) {
                    r4e r4eVar = (r4e) this.d;
                    int i7 = (i6 & 2) != 0 ? iqeVar.a[1] : -1;
                    r4eVar.c = i7;
                    r4eVar.d = i7;
                    int i8 = r4eVar.h;
                    if (i7 < i8) {
                        if (i7 != 0) {
                            r4eVar.a(i8 - i7);
                            return;
                        }
                        Arrays.fill(r4eVar.e, (Object) null);
                        r4eVar.f = r4eVar.e.length - 1;
                        r4eVar.g = 0;
                        r4eVar.h = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            short readShort = ((ikn) this.b).readShort();
            readInt = ((ikn) this.b).readInt();
            switch (readShort) {
                case 1:
                case 6:
                    s = readShort;
                    iqeVar.h(s, readInt);
                    i3 += 6;
                case 2:
                    if (readInt != 0 && readInt != 1) {
                        g5e.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw null;
                    }
                    s = readShort;
                    iqeVar.h(s, readInt);
                    i3 += 6;
                case 3:
                    iqeVar.h(s, readInt);
                    i3 += 6;
                case 4:
                    if (readInt < 0) {
                        g5e.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                    s = 7;
                    iqeVar.h(s, readInt);
                    i3 += 6;
                case 5:
                    if (readInt < 16384 || readInt > 16777215) {
                    }
                    s = readShort;
                    iqeVar.h(s, readInt);
                    i3 += 6;
                    break;
                default:
                    i3 += 6;
            }
        }
        g5e.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
        throw null;
    }

    public boolean a(moj mojVar) {
        boolean z;
        r5e r5eVar;
        afb afbVar;
        pxj pxjVar;
        try {
            ((ikn) this.b).a0(9L);
            int a = g5e.a((ikn) this.b);
            if (a < 0 || a > 16384) {
                g5e.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
                throw null;
            }
            byte readByte = (byte) (((ikn) this.b).readByte() & 255);
            byte readByte2 = (byte) (((ikn) this.b).readByte() & 255);
            int readInt = ((ikn) this.b).readInt() & Integer.MAX_VALUE;
            Logger logger = g5e.a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(d5e.a(true, readInt, a, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    b(mojVar, a, readByte2, readInt);
                    return true;
                case 1:
                    o(mojVar, a, readByte2, readInt);
                    return true;
                case 2:
                    if (a != 5) {
                        g5e.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a));
                        throw null;
                    }
                    if (readInt == 0) {
                        g5e.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    ikn iknVar = (ikn) this.b;
                    iknVar.readInt();
                    iknVar.readByte();
                    return true;
                case 3:
                    D(mojVar, a, readInt);
                    return true;
                case 4:
                    H(mojVar, a, readByte2, readInt);
                    return true;
                case 5:
                    z(mojVar, a, readByte2, readInt);
                    return true;
                case 6:
                    z = true;
                    if (a != 8) {
                        g5e.c("TYPE_PING length != 8: %s", Integer.valueOf(a));
                        throw null;
                    }
                    if (readInt != 0) {
                        g5e.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int readInt2 = ((ikn) this.b).readInt();
                    int readInt3 = ((ikn) this.b).readInt();
                    r2 = (readByte2 & 1) != 0 ? 1 : 0;
                    long j = (readInt2 << 32) | (readInt3 & 4294967295L);
                    ((j6e) mojVar.c).m(1, j);
                    Object obj = ((noj) mojVar.e).k;
                    if (r2 == 0) {
                        synchronized (obj) {
                            ((noj) mojVar.e).i.g(readInt2, readInt3, true);
                        }
                    } else {
                        synchronized (obj) {
                            try {
                                noj nojVar = (noj) mojVar.e;
                                r5eVar = nojVar.x;
                                if (r5eVar != null) {
                                    long j2 = r5eVar.a;
                                    if (j2 == j) {
                                        nojVar.x = null;
                                    } else {
                                        Logger logger2 = noj.Q;
                                        Level level = Level.WARNING;
                                        Locale locale = Locale.US;
                                        logger2.log(level, "Received unexpected ping ack. Expecting " + j2 + ", got " + j);
                                    }
                                } else {
                                    noj.Q.warning("Received unexpected ping ack. No ping outstanding");
                                }
                                r5eVar = null;
                            } finally {
                            }
                        }
                        if (r5eVar != null) {
                            synchronized (r5eVar) {
                                try {
                                    if (!r5eVar.d) {
                                        r5eVar.d = true;
                                        long a2 = r5eVar.b.a();
                                        r5eVar.f = a2;
                                        LinkedHashMap linkedHashMap = r5eVar.c;
                                        r5eVar.c = null;
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            try {
                                                ((Executor) entry.getValue()).execute(new q5e((aaf) entry.getKey(), a2));
                                            } catch (Throwable th) {
                                                r5e.g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                    return z;
                case 7:
                    ikn iknVar2 = (ikn) this.b;
                    if (a < 8) {
                        g5e.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a));
                        throw null;
                    }
                    if (readInt != 0) {
                        g5e.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int readInt4 = iknVar2.readInt();
                    int readInt5 = iknVar2.readInt();
                    int i = a - 8;
                    afb[] values = afb.values();
                    int length = values.length;
                    while (true) {
                        if (r2 < length) {
                            afbVar = values[r2];
                            if (afbVar.a != readInt5) {
                                r2++;
                            }
                        } else {
                            afbVar = null;
                        }
                    }
                    if (afbVar == null) {
                        g5e.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt5));
                        throw null;
                    }
                    pn3 pn3Var = pn3.d;
                    if (i > 0) {
                        pn3Var = iknVar2.g0(i);
                    }
                    noj nojVar2 = (noj) mojVar.e;
                    ((j6e) mojVar.c).k(1, readInt4, afbVar, pn3Var);
                    if (afbVar == afb.ENHANCE_YOUR_CALM) {
                        String u = pn3Var.u();
                        noj.Q.log(Level.WARNING, mojVar + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + u);
                        if ("too_many_pings".equals(u)) {
                            nojVar2.J.run();
                        }
                    }
                    long j3 = afbVar.a;
                    wqd[] wqdVarArr = wqd.d;
                    wqd wqdVar = (j3 >= ((long) wqdVarArr.length) || j3 < 0) ? null : wqdVarArr[(int) j3];
                    sgr c = (wqdVar == null ? sgr.e(wqd.c.b.a.a).i("Unrecognized HTTP/2 error code: " + j3) : wqdVar.b).c("Received Goaway");
                    if (pn3Var.d() > 0) {
                        c = c.c(pn3Var.u());
                    }
                    Map map = noj.P;
                    nojVar2.r(readInt4, null, c);
                    return true;
                case 8:
                    if (a != 4) {
                        g5e.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a));
                        throw null;
                    }
                    long readInt6 = ((ikn) this.b).readInt() & 2147483647L;
                    if (readInt6 == 0) {
                        g5e.c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    ((j6e) mojVar.c).r(readInt6, 1, readInt);
                    noj nojVar3 = (noj) mojVar.e;
                    if (readInt6 == 0) {
                        if (readInt == 0) {
                            noj.e(nojVar3, "Received 0 flow control window increment.");
                            return true;
                        }
                        nojVar3.i(readInt, sgr.n.i("Received 0 flow control window increment."), no4.a, false, afb.PROTOCOL_ERROR, null);
                        return true;
                    }
                    z = true;
                    synchronized (nojVar3.k) {
                        noj nojVar4 = (noj) mojVar.e;
                        try {
                            if (readInt == 0) {
                                nojVar4.j.F(null, (int) readInt6);
                                return true;
                            }
                            a aVar = (a) nojVar4.n.get(Integer.valueOf(readInt));
                            noj nojVar5 = (noj) mojVar.e;
                            if (aVar != null) {
                                anx anxVar = nojVar5.j;
                                koj kojVar = aVar.l;
                                synchronized (kojVar.v) {
                                    pxjVar = kojVar.I;
                                }
                                anxVar.F(pxjVar, (int) readInt6);
                            } else if (!nojVar5.m(readInt)) {
                                r2 = 1;
                            }
                            if (r2 != 0) {
                                noj.e((noj) mojVar.e, "Received window_update for unknown stream: " + readInt);
                                return true;
                            }
                            return z;
                        } finally {
                        }
                    }
                default:
                    ((ikn) this.b).skip(a);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public void b(moj mojVar, int i, byte b, int i2) {
        a aVar;
        boolean z = (b & 1) != 0;
        if ((b & 32) != 0) {
            g5e.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short readByte = (b & 8) != 0 ? (short) (((ikn) this.b).readByte() & 255) : (short) 0;
        int b2 = g5e.b(readByte, i, b);
        ikn iknVar = (ikn) this.b;
        ((j6e) mojVar.c).j(1, i2, iknVar.b, b2, z);
        noj nojVar = (noj) mojVar.e;
        synchronized (nojVar.k) {
            aVar = (a) nojVar.n.get(Integer.valueOf(i2));
        }
        if (aVar == null) {
            boolean m = ((noj) mojVar.e).m(i2);
            noj nojVar2 = (noj) mojVar.e;
            if (!m) {
                noj.e(nojVar2, "Received data for unknown stream: " + i2);
                ((ikn) this.b).skip(readByte);
            }
            synchronized (nojVar2.k) {
                ((noj) mojVar.e).i.o(i2, afb.STREAM_CLOSED);
            }
            iknVar.skip(b2);
        } else {
            long j = b2;
            iknVar.a0(j);
            hi3 hi3Var = new hi3();
            hi3Var.t0(iknVar.b, j);
            e3s e3sVar = aVar.l.H;
            jkk.a.getClass();
            synchronized (((noj) mojVar.e).k) {
                aVar.l.j(i - b2, hi3Var, z);
            }
        }
        noj nojVar3 = (noj) mojVar.e;
        int i3 = nojVar3.s + i;
        nojVar3.s = i3;
        if (i3 >= nojVar3.f * 0.5f) {
            synchronized (nojVar3.k) {
                ((noj) mojVar.e).i.z(0, r11.s);
            }
            ((noj) mojVar.e).s = 0;
        }
        ((ikn) this.b).skip(readByte);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.c;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    try {
                        ((SQLiteStatement) it.next()).close();
                    } catch (IOException unused) {
                    }
                }
                arrayList2.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Cursor cursor = (Cursor) it2.next();
                    if (!cursor.isClosed()) {
                        try {
                            cursor.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
                arrayList.clear();
                break;
            case 1:
                ((ikn) this.b).close();
                break;
            case 2:
                ((evj) this.d).b(-1L, true, true, null);
                break;
            default:
                Handler handler = (Handler) this.d;
                HandlerThread handlerThread = (HandlerThread) this.c;
                Objects.requireNonNull(handlerThread);
                handler.post(new dyg(29, handlerThread));
                try {
                    handlerThread.join();
                    break;
                } catch (InterruptedException unused3) {
                    handlerThread.interrupt();
                }
        }
    }

    public ArrayList g(int i, short s, byte b, int i2) {
        c5e c5eVar = (c5e) this.c;
        c5eVar.e = i;
        c5eVar.b = i;
        c5eVar.f = s;
        c5eVar.c = b;
        c5eVar.d = i2;
        r4e r4eVar = (r4e) this.d;
        ikn iknVar = r4eVar.b;
        ArrayList arrayList = r4eVar.a;
        while (!iknVar.a()) {
            byte readByte = iknVar.readByte();
            int i3 = readByte & 255;
            if (i3 == 128) {
                kac.f("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int e = r4eVar.e(i3, 127);
                int i4 = e - 1;
                if (i4 >= 0) {
                    vtd[] vtdVarArr = u4e.b;
                    if (i4 <= vtdVarArr.length - 1) {
                        arrayList.add(vtdVarArr[i4]);
                    }
                }
                int length = r4eVar.f + 1 + (i4 - u4e.b.length);
                if (length >= 0) {
                    vtd[] vtdVarArr2 = r4eVar.e;
                    if (length <= vtdVarArr2.length - 1) {
                        arrayList.add(vtdVarArr2[length]);
                    }
                }
                kac.f(k5r.i(e, "Header index too large "));
                return null;
            }
            if (i3 == 64) {
                pn3 d = r4eVar.d();
                u4e.a(d);
                r4eVar.c(new vtd(d, r4eVar.d()));
            } else if ((readByte & 64) == 64) {
                r4eVar.c(new vtd(r4eVar.b(r4eVar.e(i3, 63) - 1), r4eVar.d()));
            } else if ((readByte & 32) == 32) {
                int e2 = r4eVar.e(i3, 31);
                r4eVar.d = e2;
                if (e2 < 0 || e2 > r4eVar.c) {
                    kac.i(r4eVar.d, "Invalid dynamic table size update ");
                    return null;
                }
                int i5 = r4eVar.h;
                if (e2 < i5) {
                    if (e2 == 0) {
                        Arrays.fill(r4eVar.e, (Object) null);
                        r4eVar.f = r4eVar.e.length - 1;
                        r4eVar.g = 0;
                        r4eVar.h = 0;
                    } else {
                        r4eVar.a(i5 - e2);
                    }
                }
            } else if (i3 == 16 || i3 == 0) {
                pn3 d2 = r4eVar.d();
                u4e.a(d2);
                arrayList.add(new vtd(d2, r4eVar.d()));
            } else {
                arrayList.add(new vtd(r4eVar.b(r4eVar.e(i3, 15) - 1), r4eVar.d()));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    public void o(moj mojVar, int i, byte b, int i2) {
        sgr sgrVar = null;
        boolean z = false;
        if (i2 == 0) {
            g5e.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z2 = (b & 1) != 0;
        short readByte = (b & 8) != 0 ? (short) (((ikn) this.b).readByte() & 255) : (short) 0;
        if ((b & 32) != 0) {
            ikn iknVar = (ikn) this.b;
            iknVar.readInt();
            iknVar.readByte();
            i -= 5;
        }
        ArrayList g = g(g5e.b(readByte, i, b), readByte, b, i2);
        j6e j6eVar = (j6e) mojVar.c;
        if (j6eVar.h()) {
            ((Logger) j6eVar.a).log((Level) j6eVar.b, "INBOUND HEADERS: streamId=" + i2 + " headers=" + g + " endStream=" + z2);
        }
        if (((noj) mojVar.e).K != Integer.MAX_VALUE) {
            long j = 0;
            for (int i3 = 0; i3 < g.size(); i3++) {
                vtd vtdVar = (vtd) g.get(i3);
                j += vtdVar.b.d() + vtdVar.a.d() + 32;
            }
            int min = (int) Math.min(j, 2147483647L);
            int i4 = ((noj) mojVar.e).K;
            if (min > i4) {
                sgr sgrVar2 = sgr.l;
                Locale locale = Locale.US;
                StringBuilder l = f1d.l(i4, "Response ", z2 ? "trailer" : "header", " metadata larger than ", ": ");
                l.append(min);
                sgrVar = sgrVar2.i(l.toString());
            }
        }
        synchronized (((noj) mojVar.e).k) {
            try {
                a aVar = (a) ((noj) mojVar.e).n.get(Integer.valueOf(i2));
                if (aVar == null) {
                    if (((noj) mojVar.e).m(i2)) {
                        ((noj) mojVar.e).i.o(i2, afb.STREAM_CLOSED);
                    } else {
                        z = true;
                    }
                } else if (sgrVar == null) {
                    e3s e3sVar = aVar.l.H;
                    jkk.a.getClass();
                    aVar.l.k(g, z2);
                } else {
                    if (!z2) {
                        ((noj) mojVar.e).i.o(i2, afb.CANCEL);
                    }
                    aVar.l.m(sgrVar, false, new s2i());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            noj.e((noj) mojVar.e, "Received header for unknown stream: " + i2);
        }
    }

    public void z(moj mojVar, int i, byte b, int i2) {
        if (i2 == 0) {
            g5e.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short readByte = (b & 8) != 0 ? (short) (((ikn) this.b).readByte() & 255) : (short) 0;
        int readInt = ((ikn) this.b).readInt() & Integer.MAX_VALUE;
        ArrayList g = g(g5e.b(readByte, i - 4, b), readByte, b, i2);
        j6e j6eVar = (j6e) mojVar.c;
        if (j6eVar.h()) {
            ((Logger) j6eVar.a).log((Level) j6eVar.b, "INBOUND PUSH_PROMISE: streamId=" + i2 + " promisedStreamId=" + readInt + " headers=" + g);
        }
        synchronized (((noj) mojVar.e).k) {
            ((noj) mojVar.e).i.o(i2, afb.PROTOCOL_ERROR);
        }
    }

    public zp4(ikn iknVar) {
        this.a = 1;
        this.b = iknVar;
        c5e c5eVar = new c5e(iknVar);
        this.c = c5eVar;
        this.d = new r4e(c5eVar);
    }

    public zp4(dg0 dg0Var) {
        this.a = 0;
        this.b = dg0Var;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public zp4(ij3 ij3Var, gj3 gj3Var, evj evjVar) {
        this.a = 2;
        this.d = evjVar;
        ij3Var.getClass();
        gj3Var.getClass();
        this.b = ij3Var;
        this.c = gj3Var;
    }
}
