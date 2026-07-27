package i8;

import B2.N;
import e8.C4483a;
import e8.z;
import g1.C4523c;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import l8.A;
import l8.C4709a;
import l8.C4711c;
import l8.D;
import l8.E;
import l8.EnumC4710b;

/* loaded from: classes2.dex */
public final class r extends l8.n implements j8.e {

    /* renamed from: b, reason: collision with root package name */
    public final h8.e f38406b;

    /* renamed from: c, reason: collision with root package name */
    public final s f38407c;

    /* renamed from: d, reason: collision with root package name */
    public final z f38408d;

    /* renamed from: e, reason: collision with root package name */
    public final Socket f38409e;

    /* renamed from: f, reason: collision with root package name */
    public final Socket f38410f;

    /* renamed from: g, reason: collision with root package name */
    public final e8.l f38411g;

    /* renamed from: h, reason: collision with root package name */
    public final e8.t f38412h;
    public final Y2.e i;

    /* renamed from: j, reason: collision with root package name */
    public final f f38413j;

    /* renamed from: k, reason: collision with root package name */
    public l8.r f38414k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f38415l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f38416m;

    /* renamed from: n, reason: collision with root package name */
    public int f38417n;

    /* renamed from: o, reason: collision with root package name */
    public int f38418o;

    /* renamed from: p, reason: collision with root package name */
    public int f38419p;

    /* renamed from: q, reason: collision with root package name */
    public int f38420q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f38421r;

    /* renamed from: s, reason: collision with root package name */
    public long f38422s;

    public r(h8.e taskRunner, s connectionPool, z route, Socket rawSocket, Socket javaNetSocket, e8.l lVar, e8.t protocol, Y2.e socket, f fVar) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.h.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.h.e(route, "route");
        kotlin.jvm.internal.h.e(rawSocket, "rawSocket");
        kotlin.jvm.internal.h.e(javaNetSocket, "javaNetSocket");
        kotlin.jvm.internal.h.e(protocol, "protocol");
        kotlin.jvm.internal.h.e(socket, "socket");
        this.f38406b = taskRunner;
        this.f38407c = connectionPool;
        this.f38408d = route;
        this.f38409e = rawSocket;
        this.f38410f = javaNetSocket;
        this.f38411g = lVar;
        this.f38412h = protocol;
        this.i = socket;
        this.f38413j = fVar;
        this.f38420q = 1;
        this.f38421r = new ArrayList();
        this.f38422s = Long.MAX_VALUE;
    }

    public static void c(e8.s client, z failedRoute, IOException failure) {
        kotlin.jvm.internal.h.e(client, "client");
        kotlin.jvm.internal.h.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.h.e(failure, "failure");
        if (failedRoute.f37541b.type() != Proxy.Type.DIRECT) {
            C4483a c4483a = failedRoute.f37540a;
            c4483a.f37350g.connectFailed(c4483a.f37351h.g(), failedRoute.f37541b.address(), failure);
        }
        C4523c c4523c = client.f37497z;
        synchronized (c4523c) {
            ((LinkedHashSet) c4523c.f37856u).add(failedRoute);
        }
    }

    @Override // l8.n
    public final void a(l8.r connection, D settings) {
        kotlin.jvm.internal.h.e(connection, "connection");
        kotlin.jvm.internal.h.e(settings, "settings");
        synchronized (this) {
            try {
                int i = this.f38420q;
                int i4 = (settings.f39093a & 8) != 0 ? settings.f39094b[3] : Integer.MAX_VALUE;
                this.f38420q = i4;
                if (i4 < i) {
                    s sVar = this.f38407c;
                    C4483a address = this.f38408d.f37540a;
                    sVar.getClass();
                    kotlin.jvm.internal.h.e(address, "address");
                    if (sVar.f38425c.get(address) != null) {
                        throw new ClassCastException();
                    }
                } else if (i4 > i) {
                    s sVar2 = this.f38407c;
                    sVar2.f38426d.d(sVar2.f38427e, 0L);
                }
            } finally {
            }
        }
    }

    @Override // l8.n
    public final void b(l8.z zVar) {
        zVar.d(EnumC4710b.f39103z, null);
    }

    @Override // j8.e
    public final void cancel() {
        f8.d.c(this.f38409e);
    }

    @Override // j8.e
    public final void d(q call, IOException iOException) {
        kotlin.jvm.internal.h.e(call, "call");
        synchronized (this) {
            try {
                if (!(iOException instanceof E)) {
                    if (!(this.f38414k != null) || (iOException instanceof C4709a)) {
                        this.f38415l = true;
                        if (this.f38418o == 0) {
                            if (iOException != null) {
                                c(call.f38399n, this.f38408d, iOException);
                            }
                            this.f38417n++;
                        }
                    }
                } else if (((E) iOException).f39095n == EnumC4710b.f39103z) {
                    int i = this.f38419p + 1;
                    this.f38419p = i;
                    if (i > 1) {
                        this.f38415l = true;
                        this.f38417n++;
                    }
                } else if (((E) iOException).f39095n != EnumC4710b.f39096A || !call.f38396G) {
                    this.f38415l = true;
                    this.f38417n++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j8.e
    public final void e() {
        synchronized (this) {
            this.f38415l = true;
        }
        this.f38413j.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (s8.c.b(r1, (java.security.cert.X509Certificate) r11) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(C4483a address, ArrayList arrayList) {
        kotlin.jvm.internal.h.e(address, "address");
        TimeZone timeZone = f8.d.f37815a;
        if (this.f38421r.size() < this.f38420q && !this.f38415l) {
            z zVar = this.f38408d;
            if (zVar.f37540a.a(address)) {
                e8.o oVar = address.f37351h;
                String str = oVar.f37440d;
                C4483a c4483a = zVar.f37540a;
                if (kotlin.jvm.internal.h.a(str, c4483a.f37351h.f37440d)) {
                    return true;
                }
                if (this.f38414k != null && arrayList != null && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        z zVar2 = (z) it.next();
                        Proxy.Type type = zVar2.f37541b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && zVar.f37541b.type() == type2) {
                            if (kotlin.jvm.internal.h.a(zVar.f37542c, zVar2.f37542c)) {
                                if (address.f37347d == s8.c.f40527a) {
                                    TimeZone timeZone2 = f8.d.f37815a;
                                    e8.o oVar2 = c4483a.f37351h;
                                    if (oVar.f37441e == oVar2.f37441e) {
                                        String str2 = oVar2.f37440d;
                                        String hostname = oVar.f37440d;
                                        boolean a9 = kotlin.jvm.internal.h.a(hostname, str2);
                                        e8.l lVar = this.f38411g;
                                        if (!a9) {
                                            if (!this.f38416m && lVar != null) {
                                                List a10 = lVar.a();
                                                if (!a10.isEmpty()) {
                                                    Object obj = a10.get(0);
                                                    kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                                }
                                            }
                                        }
                                        try {
                                            e8.d dVar = address.f37348e;
                                            kotlin.jvm.internal.h.b(dVar);
                                            kotlin.jvm.internal.h.b(lVar);
                                            List peerCertificates = lVar.a();
                                            kotlin.jvm.internal.h.e(hostname, "hostname");
                                            kotlin.jvm.internal.h.e(peerCertificates, "peerCertificates");
                                            Iterator it2 = dVar.f37370a.iterator();
                                            if (!it2.hasNext()) {
                                                return true;
                                            }
                                            it2.next().getClass();
                                            throw new ClassCastException();
                                        } catch (SSLPeerUnverifiedException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // j8.e
    public final z g() {
        return this.f38408d;
    }

    public final boolean h(boolean z8) {
        long j9;
        TimeZone timeZone = f8.d.f37815a;
        long nanoTime = System.nanoTime();
        if (this.f38409e.isClosed() || this.f38410f.isClosed() || this.f38410f.isInputShutdown() || this.f38410f.isOutputShutdown()) {
            return false;
        }
        l8.r rVar = this.f38414k;
        if (rVar != null) {
            synchronized (rVar) {
                if (rVar.f39180y) {
                    return false;
                }
                if (rVar.f39164G < rVar.f39163F) {
                    if (nanoTime >= rVar.f39165H) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j9 = nanoTime - this.f38422s;
        }
        if (j9 < 10000000000L || !z8) {
            return true;
        }
        Socket socket = this.f38410f;
        u8.r source = (u8.r) this.i.f3964v;
        kotlin.jvm.internal.h.e(socket, "<this>");
        kotlin.jvm.internal.h.e(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.b();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void i() {
        this.f38422s = System.nanoTime();
        e8.t tVar = this.f38412h;
        if (tVar == e8.t.f37505y || tVar == e8.t.f37506z) {
            this.f38410f.setSoTimeout(0);
            C4711c c4711c = C4711c.f39105a;
            N n9 = new N(this.f38406b);
            Y2.e socket = this.i;
            String peerName = this.f38408d.f37540a.f37351h.f37440d;
            kotlin.jvm.internal.h.e(socket, "socket");
            kotlin.jvm.internal.h.e(peerName, "peerName");
            n9.f197v = socket;
            String str = f8.d.f37816b + ' ' + peerName;
            kotlin.jvm.internal.h.e(str, "<set-?>");
            n9.f198w = str;
            n9.f199x = this;
            n9.f200y = c4711c;
            l8.r rVar = new l8.r(n9);
            this.f38414k = rVar;
            D d2 = l8.r.f39157S;
            this.f38420q = (d2.f39093a & 8) != 0 ? d2.f39094b[3] : Integer.MAX_VALUE;
            A a9 = rVar.f39172P;
            synchronized (a9) {
                try {
                    if (a9.f39087w) {
                        throw new IOException("closed");
                    }
                    Logger logger = A.f39083y;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(f8.d.e(">> CONNECTION " + l8.h.f39131a.c(), new Object[0]));
                    }
                    a9.f39084n.v(l8.h.f39131a);
                    a9.f39084n.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            A a10 = rVar.f39172P;
            D settings = rVar.J;
            a10.getClass();
            kotlin.jvm.internal.h.e(settings, "settings");
            synchronized (a10) {
                try {
                    if (a10.f39087w) {
                        throw new IOException("closed");
                    }
                    a10.g(0, Integer.bitCount(settings.f39093a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z8 = true;
                        if (((1 << i) & settings.f39093a) == 0) {
                            z8 = false;
                        }
                        if (z8) {
                            u8.p pVar = a10.f39084n;
                            if (pVar.f41306v) {
                                throw new IllegalStateException("closed");
                            }
                            u8.e eVar = pVar.f41305u;
                            u8.s J = eVar.J(2);
                            int i4 = J.f41313c;
                            byte b9 = (byte) ((i >>> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
                            byte[] bArr = J.f41311a;
                            bArr[i4] = b9;
                            bArr[i4 + 1] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8630b);
                            J.f41313c = i4 + 2;
                            eVar.f41277u += 2;
                            pVar.b();
                            a10.f39084n.g(settings.f39094b[i]);
                        }
                    }
                    a10.f39084n.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (rVar.J.a() != 65535) {
                rVar.f39172P.n(0, r2 - 65535);
            }
            h8.c.c(rVar.f39181z.d(), rVar.f39177v, rVar.f39173Q);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        z zVar = this.f38408d;
        sb.append(zVar.f37540a.f37351h.f37440d);
        sb.append(':');
        sb.append(zVar.f37540a.f37351h.f37441e);
        sb.append(", proxy=");
        sb.append(zVar.f37541b);
        sb.append(" hostAddress=");
        sb.append(zVar.f37542c);
        sb.append(" cipherSuite=");
        e8.l lVar = this.f38411g;
        if (lVar == null || (obj = lVar.f37424b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f38412h);
        sb.append('}');
        return sb.toString();
    }
}
