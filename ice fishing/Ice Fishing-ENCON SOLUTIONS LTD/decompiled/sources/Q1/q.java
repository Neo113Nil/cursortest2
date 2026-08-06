package Q1;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class q implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final D f1625z;

    /* renamed from: a, reason: collision with root package name */
    public final i f1626a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1627b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f1628c;

    /* renamed from: d, reason: collision with root package name */
    public int f1629d;

    /* renamed from: e, reason: collision with root package name */
    public int f1630e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1631f;

    /* renamed from: g, reason: collision with root package name */
    public final M1.d f1632g;

    /* renamed from: h, reason: collision with root package name */
    public final M1.c f1633h;

    /* renamed from: i, reason: collision with root package name */
    public final M1.c f1634i;

    /* renamed from: j, reason: collision with root package name */
    public final M1.c f1635j;

    /* renamed from: k, reason: collision with root package name */
    public final C f1636k;

    /* renamed from: l, reason: collision with root package name */
    public long f1637l;

    /* renamed from: m, reason: collision with root package name */
    public long f1638m;

    /* renamed from: n, reason: collision with root package name */
    public long f1639n;

    /* renamed from: o, reason: collision with root package name */
    public long f1640o;

    /* renamed from: p, reason: collision with root package name */
    public final D f1641p;

    /* renamed from: q, reason: collision with root package name */
    public D f1642q;

    /* renamed from: r, reason: collision with root package name */
    public long f1643r;

    /* renamed from: s, reason: collision with root package name */
    public long f1644s;
    public long t;

    /* renamed from: u, reason: collision with root package name */
    public long f1645u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f1646v;

    /* renamed from: w, reason: collision with root package name */
    public final z f1647w;

    /* renamed from: x, reason: collision with root package name */
    public final l f1648x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f1649y;

    static {
        D d2 = new D();
        d2.c(7, 65535);
        d2.c(5, 16384);
        f1625z = d2;
    }

    public q(Q0.c cVar) {
        this.f1626a = (i) cVar.f1523f;
        String str = (String) cVar.f1520c;
        if (str == null) {
            kotlin.jvm.internal.i.i("connectionName");
            throw null;
        }
        this.f1628c = str;
        this.f1630e = 3;
        M1.d dVar = (M1.d) cVar.f1518a;
        this.f1632g = dVar;
        this.f1633h = dVar.e();
        this.f1634i = dVar.e();
        this.f1635j = dVar.e();
        this.f1636k = C.f1560a;
        D d2 = new D();
        d2.c(7, 16777216);
        this.f1641p = d2;
        this.f1642q = f1625z;
        this.f1645u = r0.a();
        Socket socket = (Socket) cVar.f1519b;
        if (socket == null) {
            kotlin.jvm.internal.i.i("socket");
            throw null;
        }
        this.f1646v = socket;
        W1.p pVar = (W1.p) cVar.f1522e;
        if (pVar == null) {
            kotlin.jvm.internal.i.i("sink");
            throw null;
        }
        this.f1647w = new z(pVar);
        W1.q qVar = (W1.q) cVar.f1521d;
        if (qVar == null) {
            kotlin.jvm.internal.i.i(AdRevenueConstants.SOURCE_KEY);
            throw null;
        }
        this.f1648x = new l(this, new u(qVar));
        this.f1649y = new LinkedHashSet();
    }

    public final void a(EnumC0079b enumC0079b, EnumC0079b enumC0079b2, IOException iOException) {
        int i2;
        Object[] objArr;
        byte[] bArr = K1.b.f1051a;
        try {
            k(enumC0079b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f1627b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f1627b.values().toArray(new y[0]);
                if (objArr == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                this.f1627b.clear();
            }
        }
        y[] yVarArr = (y[]) objArr;
        if (yVarArr != null) {
            for (y yVar : yVarArr) {
                try {
                    yVar.c(enumC0079b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f1647w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f1646v.close();
        } catch (IOException unused4) {
        }
        this.f1633h.e();
        this.f1634i.e();
        this.f1635j.e();
    }

    public final void b(IOException iOException) {
        EnumC0079b enumC0079b = EnumC0079b.PROTOCOL_ERROR;
        a(enumC0079b, enumC0079b, iOException);
    }

    public final synchronized y c(int i2) {
        return (y) this.f1627b.get(Integer.valueOf(i2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC0079b.NO_ERROR, EnumC0079b.CANCEL, null);
    }

    public final void flush() {
        this.f1647w.flush();
    }

    public final synchronized y j(int i2) {
        y yVar;
        yVar = (y) this.f1627b.remove(Integer.valueOf(i2));
        notifyAll();
        return yVar;
    }

    public final void k(EnumC0079b enumC0079b) {
        synchronized (this.f1647w) {
            synchronized (this) {
                if (this.f1631f) {
                    return;
                }
                this.f1631f = true;
                this.f1647w.j(this.f1629d, enumC0079b, K1.b.f1051a);
            }
        }
    }

    public final synchronized void l(long j2) {
        long j3 = this.f1643r + j2;
        this.f1643r = j3;
        long j4 = j3 - this.f1644s;
        if (j4 >= this.f1641p.a() / 2) {
            o(0, j4);
            this.f1644s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f1647w.f1696c);
        r6 = r2;
        r8.t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i2, boolean z2, W1.g gVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f1647w.b(z2, i2, gVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.t;
                            long j5 = this.f1645u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f1627b.containsKey(Integer.valueOf(i2))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j2 -= j3;
            this.f1647w.b(z2 && j2 == 0, i2, gVar, min);
        }
    }

    public final void n(int i2, EnumC0079b enumC0079b) {
        this.f1633h.c(new o(this.f1628c + '[' + i2 + "] writeSynReset", this, i2, enumC0079b), 0L);
    }

    public final void o(int i2, long j2) {
        this.f1633h.c(new p(this.f1628c + '[' + i2 + "] windowUpdate", this, i2, j2), 0L);
    }
}
