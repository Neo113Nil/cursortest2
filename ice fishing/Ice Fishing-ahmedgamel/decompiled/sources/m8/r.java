package m8;

import C2.N;
import g1.C4523c;
import i8.C4594a;
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
import p8.A;
import p8.C4855a;
import p8.C4857c;
import p8.D;
import p8.E;
import p8.EnumC4856b;
import p8.z;

/* loaded from: classes2.dex */
public final class r extends p8.n implements n8.e {

    /* renamed from: b, reason: collision with root package name */
    public final l8.d f39394b;

    /* renamed from: c, reason: collision with root package name */
    public final s f39395c;

    /* renamed from: d, reason: collision with root package name */
    public final i8.y f39396d;

    /* renamed from: e, reason: collision with root package name */
    public final Socket f39397e;

    /* renamed from: f, reason: collision with root package name */
    public final Socket f39398f;

    /* renamed from: g, reason: collision with root package name */
    public final i8.k f39399g;

    /* renamed from: h, reason: collision with root package name */
    public final i8.s f39400h;
    public final j4.g i;

    /* renamed from: j, reason: collision with root package name */
    public final f f39401j;

    /* renamed from: k, reason: collision with root package name */
    public p8.r f39402k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f39403l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f39404m;

    /* renamed from: n, reason: collision with root package name */
    public int f39405n;

    /* renamed from: o, reason: collision with root package name */
    public int f39406o;

    /* renamed from: p, reason: collision with root package name */
    public int f39407p;

    /* renamed from: q, reason: collision with root package name */
    public int f39408q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f39409r;

    /* renamed from: s, reason: collision with root package name */
    public long f39410s;

    public r(l8.d taskRunner, s connectionPool, i8.y route, Socket rawSocket, Socket javaNetSocket, i8.k kVar, i8.s protocol, j4.g socket, f fVar) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.h.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.h.e(route, "route");
        kotlin.jvm.internal.h.e(rawSocket, "rawSocket");
        kotlin.jvm.internal.h.e(javaNetSocket, "javaNetSocket");
        kotlin.jvm.internal.h.e(protocol, "protocol");
        kotlin.jvm.internal.h.e(socket, "socket");
        this.f39394b = taskRunner;
        this.f39395c = connectionPool;
        this.f39396d = route;
        this.f39397e = rawSocket;
        this.f39398f = javaNetSocket;
        this.f39399g = kVar;
        this.f39400h = protocol;
        this.i = socket;
        this.f39401j = fVar;
        this.f39408q = 1;
        this.f39409r = new ArrayList();
        this.f39410s = Long.MAX_VALUE;
    }

    public static void c(i8.r client, i8.y failedRoute, IOException failure) {
        kotlin.jvm.internal.h.e(client, "client");
        kotlin.jvm.internal.h.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.h.e(failure, "failure");
        if (failedRoute.f38263b.type() != Proxy.Type.DIRECT) {
            C4594a c4594a = failedRoute.f38262a;
            c4594a.f38073g.connectFailed(c4594a.f38074h.g(), failedRoute.f38263b.address(), failure);
        }
        C4523c c4523c = client.f38219z;
        synchronized (c4523c) {
            ((LinkedHashSet) c4523c.f37627u).add(failedRoute);
        }
    }

    @Override // p8.n
    public final void a(p8.r connection, D settings) {
        kotlin.jvm.internal.h.e(connection, "connection");
        kotlin.jvm.internal.h.e(settings, "settings");
        synchronized (this) {
            try {
                int i = this.f39408q;
                int i6 = (settings.f39813a & 8) != 0 ? settings.f39814b[3] : Integer.MAX_VALUE;
                this.f39408q = i6;
                if (i6 < i) {
                    s sVar = this.f39395c;
                    C4594a address = this.f39396d.f38262a;
                    sVar.getClass();
                    kotlin.jvm.internal.h.e(address, "address");
                    if (sVar.f39413c.get(address) != null) {
                        throw new ClassCastException();
                    }
                } else if (i6 > i) {
                    s sVar2 = this.f39395c;
                    sVar2.f39414d.d(sVar2.f39415e, 0L);
                }
            } finally {
            }
        }
    }

    @Override // p8.n
    public final void b(z zVar) {
        zVar.c(EnumC4856b.f39823z, null);
    }

    @Override // n8.e
    public final void cancel() {
        j8.d.c(this.f39397e);
    }

    @Override // n8.e
    public final void d() {
        synchronized (this) {
            this.f39403l = true;
        }
        this.f39401j.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (w8.c.b(r1, (java.security.cert.X509Certificate) r11) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(C4594a address, ArrayList arrayList) {
        kotlin.jvm.internal.h.e(address, "address");
        TimeZone timeZone = j8.d.f38483a;
        if (this.f39409r.size() < this.f39408q && !this.f39403l) {
            i8.y yVar = this.f39396d;
            if (yVar.f38262a.a(address)) {
                i8.n nVar = address.f38074h;
                String str = nVar.f38162d;
                C4594a c4594a = yVar.f38262a;
                if (kotlin.jvm.internal.h.a(str, c4594a.f38074h.f38162d)) {
                    return true;
                }
                if (this.f39402k != null && arrayList != null && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        i8.y yVar2 = (i8.y) it.next();
                        Proxy.Type type = yVar2.f38263b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && yVar.f38263b.type() == type2) {
                            if (kotlin.jvm.internal.h.a(yVar.f38264c, yVar2.f38264c)) {
                                if (address.f38070d == w8.c.f41697a) {
                                    TimeZone timeZone2 = j8.d.f38483a;
                                    i8.n nVar2 = c4594a.f38074h;
                                    if (nVar.f38163e == nVar2.f38163e) {
                                        String str2 = nVar2.f38162d;
                                        String hostname = nVar.f38162d;
                                        boolean a9 = kotlin.jvm.internal.h.a(hostname, str2);
                                        i8.k kVar = this.f39399g;
                                        if (!a9) {
                                            if (!this.f39404m && kVar != null) {
                                                List a10 = kVar.a();
                                                if (!a10.isEmpty()) {
                                                    Object obj = a10.get(0);
                                                    kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                                }
                                            }
                                        }
                                        try {
                                            i8.d dVar = address.f38071e;
                                            kotlin.jvm.internal.h.b(dVar);
                                            kotlin.jvm.internal.h.b(kVar);
                                            List peerCertificates = kVar.a();
                                            kotlin.jvm.internal.h.e(hostname, "hostname");
                                            kotlin.jvm.internal.h.e(peerCertificates, "peerCertificates");
                                            Iterator it2 = dVar.f38093a.iterator();
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

    @Override // n8.e
    public final void f(q call, IOException iOException) {
        kotlin.jvm.internal.h.e(call, "call");
        synchronized (this) {
            try {
                if (!(iOException instanceof E)) {
                    if (!(this.f39402k != null) || (iOException instanceof C4855a)) {
                        this.f39403l = true;
                        if (this.f39406o == 0) {
                            if (iOException != null) {
                                c(call.f39387n, this.f39396d, iOException);
                            }
                            this.f39405n++;
                        }
                    }
                } else if (((E) iOException).f39815n == EnumC4856b.f39823z) {
                    int i = this.f39407p + 1;
                    this.f39407p = i;
                    if (i > 1) {
                        this.f39403l = true;
                        this.f39405n++;
                    }
                } else if (((E) iOException).f39815n != EnumC4856b.f39816A || !call.f39384G) {
                    this.f39403l = true;
                    this.f39405n++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n8.e
    public final i8.y g() {
        return this.f39396d;
    }

    public final boolean h(boolean z3) {
        long j6;
        TimeZone timeZone = j8.d.f38483a;
        long nanoTime = System.nanoTime();
        if (this.f39397e.isClosed() || this.f39398f.isClosed() || this.f39398f.isInputShutdown() || this.f39398f.isOutputShutdown()) {
            return false;
        }
        p8.r rVar = this.f39402k;
        if (rVar != null) {
            synchronized (rVar) {
                if (rVar.f39900y) {
                    return false;
                }
                if (rVar.f39884G < rVar.f39883F) {
                    if (nanoTime >= rVar.f39885H) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j6 = nanoTime - this.f39410s;
        }
        if (j6 < 10000000000L || !z3) {
            return true;
        }
        Socket socket = this.f39398f;
        y8.r source = (y8.r) this.i.f38405v;
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
        this.f39410s = System.nanoTime();
        i8.s sVar = this.f39400h;
        if (sVar == i8.s.f38227y || sVar == i8.s.f38228z) {
            this.f39398f.setSoTimeout(0);
            C4857c c4857c = C4857c.f39825a;
            N n9 = new N(this.f39394b);
            j4.g socket = this.i;
            String peerName = this.f39396d.f38262a.f38074h.f38162d;
            kotlin.jvm.internal.h.e(socket, "socket");
            kotlin.jvm.internal.h.e(peerName, "peerName");
            n9.f302v = socket;
            String str = j8.d.f38484b + ' ' + peerName;
            kotlin.jvm.internal.h.e(str, "<set-?>");
            n9.f303w = str;
            n9.f304x = this;
            n9.f305y = c4857c;
            p8.r rVar = new p8.r(n9);
            this.f39402k = rVar;
            D d2 = p8.r.f39877S;
            this.f39408q = (d2.f39813a & 8) != 0 ? d2.f39814b[3] : Integer.MAX_VALUE;
            A a9 = rVar.f39892P;
            synchronized (a9) {
                try {
                    if (a9.f39807w) {
                        throw new IOException("closed");
                    }
                    Logger logger = A.f39803y;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(j8.d.e(">> CONNECTION " + p8.h.f39851a.c(), new Object[0]));
                    }
                    a9.f39804n.v(p8.h.f39851a);
                    a9.f39804n.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            A a10 = rVar.f39892P;
            D settings = rVar.J;
            a10.getClass();
            kotlin.jvm.internal.h.e(settings, "settings");
            synchronized (a10) {
                try {
                    if (a10.f39807w) {
                        throw new IOException("closed");
                    }
                    a10.i(0, Integer.bitCount(settings.f39813a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z3 = true;
                        if (((1 << i) & settings.f39813a) == 0) {
                            z3 = false;
                        }
                        if (z3) {
                            y8.p pVar = a10.f39804n;
                            if (pVar.f41982v) {
                                throw new IllegalStateException("closed");
                            }
                            y8.e eVar = pVar.f41981u;
                            y8.s J = eVar.J(2);
                            int i6 = J.f41989c;
                            byte b9 = (byte) ((i >>> 8) & com.anythink.basead.exoplayer.k.p.f8473b);
                            byte[] bArr = J.f41987a;
                            bArr[i6] = b9;
                            bArr[i6 + 1] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8473b);
                            J.f41989c = i6 + 2;
                            eVar.f41953u += 2;
                            pVar.b();
                            a10.f39804n.n(settings.f39814b[i]);
                        }
                    }
                    a10.f39804n.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (rVar.J.a() != 65535) {
                rVar.f39892P.n(0, r2 - 65535);
            }
            l8.c.c(rVar.f39901z.d(), rVar.f39897v, rVar.f39893Q);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        i8.y yVar = this.f39396d;
        sb.append(yVar.f38262a.f38074h.f38162d);
        sb.append(':');
        sb.append(yVar.f38262a.f38074h.f38163e);
        sb.append(", proxy=");
        sb.append(yVar.f38263b);
        sb.append(" hostAddress=");
        sb.append(yVar.f38264c);
        sb.append(" cipherSuite=");
        i8.k kVar = this.f39399g;
        if (kVar == null || (obj = kVar.f38146b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f39400h);
        sb.append('}');
        return sb.toString();
    }
}
