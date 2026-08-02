package defpackage;

import android.os.Parcel;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes5.dex */
public final class oxj {
    public final y13 a;
    public final int b;
    public final qgr c;
    public int d = 1;
    public boolean e;
    public InputStream f;
    public ConcurrentLinkedQueue g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public s2i l;
    public sgr m;
    public s2i n;

    public oxj(y13 y13Var, int i, qgr qgrVar) {
        this.a = y13Var;
        this.b = i;
        this.c = qgrVar;
    }

    public final boolean a() {
        return this.g != null ? !r0.isEmpty() : this.f != null && this.j == 0;
    }

    public final void b(int i) {
        int i2 = this.d;
        int D = ouj.D(i);
        if (D == 1) {
            o2g.V(i2 == 1);
        } else if (D == 2) {
            o2g.V(i2 == 2);
        } else if (D == 3) {
            o2g.V(i2 == 3);
        } else if (D != 4) {
            wvs.b();
            return;
        }
        this.d = i;
    }

    public final void c() {
        while (true) {
            int D = ouj.D(this.d);
            boolean z = false;
            if (D == 0 ? this.e : D == 1 ? a() || this.h : D == 2 && this.h) {
                z = this.a.i();
            }
            if (!z) {
                return;
            }
            try {
                d();
            } catch (tgr e) {
                b(5);
                throw e;
            }
        }
    }

    public final void d() {
        InputStream inputStream;
        ConcurrentHashMap concurrentHashMap;
        qgr qgrVar = this.c;
        try {
            fo7 o = fo7.o();
            try {
                o.b().writeInt(0);
                Parcel b = o.b();
                int i = this.i;
                this.i = i + 1;
                b.writeInt(i);
                int D = ouj.D(this.d);
                int i2 = this.b;
                y13 y13Var = this.a;
                int i3 = 1;
                if (D == 0) {
                    s7g.G(o.b(), this.l);
                    b(2);
                    if (!a() && !this.h) {
                        Parcel b2 = o.b();
                        int dataPosition = b2.dataPosition();
                        b2.setDataPosition(0);
                        b2.writeInt(i3);
                        b2.setDataPosition(dataPosition);
                        int dataSize = o.b().dataSize();
                        y13Var.m(i2, o);
                        long j = dataSize;
                        qgrVar.f(j);
                        qgrVar.e(j);
                        o.close();
                    }
                } else {
                    if (D != 1) {
                        if (D != 2) {
                            throw new AssertionError();
                        }
                        i3 = 0;
                        int i4 = i3 | 4;
                        Parcel b3 = o.b();
                        int S = a4g.S(b3, this.m);
                        s7g.G(b3, this.n);
                        concurrentHashMap = y13Var.e;
                        if (concurrentHashMap.remove(Integer.valueOf(i2)) != null && concurrentHashMap.isEmpty()) {
                            y13Var.b.execute(new he0(11, y13Var));
                        }
                        i3 = i4 | S;
                        b(4);
                        Parcel b22 = o.b();
                        int dataPosition2 = b22.dataPosition();
                        b22.setDataPosition(0);
                        b22.writeInt(i3);
                        b22.setDataPosition(dataPosition2);
                        int dataSize2 = o.b().dataSize();
                        y13Var.m(i2, o);
                        long j2 = dataSize2;
                        qgrVar.f(j2);
                        qgrVar.e(j2);
                        o.close();
                    }
                    i3 = 0;
                }
                if (this.j == 0) {
                    inputStream = this.f;
                } else {
                    ConcurrentLinkedQueue concurrentLinkedQueue = this.g;
                    inputStream = concurrentLinkedQueue != null ? (InputStream) concurrentLinkedQueue.peek() : null;
                }
                if (inputStream != null) {
                    i3 = e(o.b(), inputStream) | i3 | 2;
                } else {
                    o2g.V(this.h);
                }
                if (this.h && !a()) {
                    b(3);
                    int i42 = i3 | 4;
                    Parcel b32 = o.b();
                    int S2 = a4g.S(b32, this.m);
                    s7g.G(b32, this.n);
                    concurrentHashMap = y13Var.e;
                    if (concurrentHashMap.remove(Integer.valueOf(i2)) != null) {
                        y13Var.b.execute(new he0(11, y13Var));
                    }
                    i3 = i42 | S2;
                    b(4);
                }
                Parcel b222 = o.b();
                int dataPosition22 = b222.dataPosition();
                b222.setDataPosition(0);
                b222.writeInt(i3);
                b222.setDataPosition(dataPosition22);
                int dataSize22 = o.b().dataSize();
                y13Var.m(i2, o);
                long j22 = dataSize22;
                qgrVar.f(j22);
                qgrVar.e(j22);
                o.close();
            } finally {
            }
        } catch (IOException e) {
            throw sgr.n.h(e).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(Parcel parcel, InputStream inputStream) {
        boolean z;
        int i;
        if (inputStream instanceof s6k) {
            parcel.dataPosition();
            throw null;
        }
        byte[] a = y63.a(y63.a);
        try {
            int read = inputStream.read(a);
            if (read <= 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(read);
                parcel.writeByteArray(a, 0, read);
                this.k += read;
                if (read == a.length) {
                    z = true;
                    i = 128;
                    y63.b(a);
                    if (!z) {
                        inputStream.close();
                        int i2 = this.j;
                        this.j = i2 + 1;
                        if (i2 > 0) {
                            ConcurrentLinkedQueue concurrentLinkedQueue = this.g;
                            concurrentLinkedQueue.getClass();
                            concurrentLinkedQueue.poll();
                        }
                        this.c.c(i2);
                        long j = this.k;
                        this.c.d(i2, j, j);
                        this.k = 0;
                    }
                    return i;
                }
            }
            z = false;
            i = 0;
            y63.b(a);
            if (!z) {
            }
            return i;
        } catch (Throwable th) {
            y63.b(a);
            throw th;
        }
    }

    public final synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(oxj.class.getSimpleName());
        sb.append("[S=");
        int i = this.d;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL");
        sb.append("/NDM=");
        sb.append(this.j);
        sb.append("]");
        return sb.toString();
    }
}
