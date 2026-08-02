package m8;

import E2.M;
import i1.C4586c;
import i8.C4603a;
import i8.y;
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
public final class q extends p8.n implements n8.e {

    /* renamed from: b, reason: collision with root package name */
    public final l8.d f39551b;

    /* renamed from: c, reason: collision with root package name */
    public final r f39552c;

    /* renamed from: d, reason: collision with root package name */
    public final y f39553d;

    /* renamed from: e, reason: collision with root package name */
    public final Socket f39554e;

    /* renamed from: f, reason: collision with root package name */
    public final Socket f39555f;

    /* renamed from: g, reason: collision with root package name */
    public final i8.k f39556g;

    /* renamed from: h, reason: collision with root package name */
    public final i8.s f39557h;
    public final l4.g i;

    /* renamed from: j, reason: collision with root package name */
    public final f f39558j;

    /* renamed from: k, reason: collision with root package name */
    public p8.r f39559k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f39560l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f39561m;

    /* renamed from: n, reason: collision with root package name */
    public int f39562n;

    /* renamed from: o, reason: collision with root package name */
    public int f39563o;

    /* renamed from: p, reason: collision with root package name */
    public int f39564p;

    /* renamed from: q, reason: collision with root package name */
    public int f39565q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f39566r;

    /* renamed from: s, reason: collision with root package name */
    public long f39567s;

    public q(l8.d taskRunner, r connectionPool, y route, Socket rawSocket, Socket javaNetSocket, i8.k kVar, i8.s protocol, l4.g socket, f fVar) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.h.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.h.e(route, "route");
        kotlin.jvm.internal.h.e(rawSocket, "rawSocket");
        kotlin.jvm.internal.h.e(javaNetSocket, "javaNetSocket");
        kotlin.jvm.internal.h.e(protocol, "protocol");
        kotlin.jvm.internal.h.e(socket, "socket");
        this.f39551b = taskRunner;
        this.f39552c = connectionPool;
        this.f39553d = route;
        this.f39554e = rawSocket;
        this.f39555f = javaNetSocket;
        this.f39556g = kVar;
        this.f39557h = protocol;
        this.i = socket;
        this.f39558j = fVar;
        this.f39565q = 1;
        this.f39566r = new ArrayList();
        this.f39567s = Long.MAX_VALUE;
    }

    public static void c(i8.r client, y failedRoute, IOException failure) {
        kotlin.jvm.internal.h.e(client, "client");
        kotlin.jvm.internal.h.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.h.e(failure, "failure");
        if (failedRoute.f38382b.type() != Proxy.Type.DIRECT) {
            C4603a c4603a = failedRoute.f38381a;
            c4603a.f38192g.connectFailed(c4603a.f38193h.g(), failedRoute.f38382b.address(), failure);
        }
        C4586c c4586c = client.f38338z;
        synchronized (c4586c) {
            ((LinkedHashSet) c4586c.f38154u).add(failedRoute);
        }
    }

    @Override // p8.n
    public final void a(p8.r connection, D settings) {
        kotlin.jvm.internal.h.e(connection, "connection");
        kotlin.jvm.internal.h.e(settings, "settings");
        synchronized (this) {
            try {
                int i = this.f39565q;
                int i4 = (settings.f39860a & 8) != 0 ? settings.f39861b[3] : Integer.MAX_VALUE;
                this.f39565q = i4;
                if (i4 < i) {
                    r rVar = this.f39552c;
                    C4603a address = this.f39553d.f38381a;
                    rVar.getClass();
                    kotlin.jvm.internal.h.e(address, "address");
                    if (rVar.f39570c.get(address) != null) {
                        throw new ClassCastException();
                    }
                } else if (i4 > i) {
                    r rVar2 = this.f39552c;
                    rVar2.f39571d.d(rVar2.f39572e, 0L);
                }
            } finally {
            }
        }
    }

    @Override // p8.n
    public final void b(z zVar) {
        zVar.c(EnumC4856b.f39870z, null);
    }

    @Override // n8.e
    public final void cancel() {
        j8.d.c(this.f39554e);
    }

    @Override // n8.e
    public final void d() {
        synchronized (this) {
            this.f39560l = true;
        }
        this.f39558j.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (w8.c.b(r1, (java.security.cert.X509Certificate) r11) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(C4603a address, ArrayList arrayList) {
        kotlin.jvm.internal.h.e(address, "address");
        TimeZone timeZone = j8.d.f38495a;
        if (this.f39566r.size() < this.f39565q && !this.f39560l) {
            y yVar = this.f39553d;
            if (yVar.f38381a.a(address)) {
                i8.n nVar = address.f38193h;
                String str = nVar.f38281d;
                C4603a c4603a = yVar.f38381a;
                if (kotlin.jvm.internal.h.a(str, c4603a.f38193h.f38281d)) {
                    return true;
                }
                if (this.f39559k != null && arrayList != null && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        y yVar2 = (y) it.next();
                        Proxy.Type type = yVar2.f38382b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && yVar.f38382b.type() == type2) {
                            if (kotlin.jvm.internal.h.a(yVar.f38383c, yVar2.f38383c)) {
                                if (address.f38189d == w8.c.f41752a) {
                                    TimeZone timeZone2 = j8.d.f38495a;
                                    i8.n nVar2 = c4603a.f38193h;
                                    if (nVar.f38282e == nVar2.f38282e) {
                                        String str2 = nVar2.f38281d;
                                        String hostname = nVar.f38281d;
                                        boolean a9 = kotlin.jvm.internal.h.a(hostname, str2);
                                        i8.k kVar = this.f39556g;
                                        if (!a9) {
                                            if (!this.f39561m && kVar != null) {
                                                List a10 = kVar.a();
                                                if (!a10.isEmpty()) {
                                                    Object obj = a10.get(0);
                                                    kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                                }
                                            }
                                        }
                                        try {
                                            i8.d dVar = address.f38190e;
                                            kotlin.jvm.internal.h.b(dVar);
                                            kotlin.jvm.internal.h.b(kVar);
                                            List peerCertificates = kVar.a();
                                            kotlin.jvm.internal.h.e(hostname, "hostname");
                                            kotlin.jvm.internal.h.e(peerCertificates, "peerCertificates");
                                            Iterator it2 = dVar.f38212a.iterator();
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
    public final void f(p call, IOException iOException) {
        kotlin.jvm.internal.h.e(call, "call");
        synchronized (this) {
            try {
                if (!(iOException instanceof E)) {
                    if (!(this.f39559k != null) || (iOException instanceof C4855a)) {
                        this.f39560l = true;
                        if (this.f39563o == 0) {
                            if (iOException != null) {
                                c(call.f39544n, this.f39553d, iOException);
                            }
                            this.f39562n++;
                        }
                    }
                } else if (((E) iOException).f39862n == EnumC4856b.f39870z) {
                    int i = this.f39564p + 1;
                    this.f39564p = i;
                    if (i > 1) {
                        this.f39560l = true;
                        this.f39562n++;
                    }
                } else if (((E) iOException).f39862n != EnumC4856b.f39863A || !call.f39541G) {
                    this.f39560l = true;
                    this.f39562n++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n8.e
    public final y g() {
        return this.f39553d;
    }

    public final boolean h(boolean z6) {
        long j6;
        TimeZone timeZone = j8.d.f38495a;
        long nanoTime = System.nanoTime();
        if (this.f39554e.isClosed() || this.f39555f.isClosed() || this.f39555f.isInputShutdown() || this.f39555f.isOutputShutdown()) {
            return false;
        }
        p8.r rVar = this.f39559k;
        if (rVar != null) {
            synchronized (rVar) {
                if (rVar.f39947y) {
                    return false;
                }
                if (rVar.f39931G < rVar.f39930F) {
                    if (nanoTime >= rVar.f39932H) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j6 = nanoTime - this.f39567s;
        }
        if (j6 < 10000000000L || !z6) {
            return true;
        }
        Socket socket = this.f39555f;
        y8.r source = (y8.r) this.i.f38917v;
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
        this.f39567s = System.nanoTime();
        i8.s sVar = this.f39557h;
        if (sVar == i8.s.f38346y || sVar == i8.s.f38347z) {
            this.f39555f.setSoTimeout(0);
            C4857c c4857c = C4857c.f39872a;
            M m9 = new M(this.f39551b);
            l4.g socket = this.i;
            String peerName = this.f39553d.f38381a.f38193h.f38281d;
            kotlin.jvm.internal.h.e(socket, "socket");
            kotlin.jvm.internal.h.e(peerName, "peerName");
            m9.f762v = socket;
            String str = j8.d.f38496b + ' ' + peerName;
            kotlin.jvm.internal.h.e(str, "<set-?>");
            m9.f763w = str;
            m9.f764x = this;
            m9.f765y = c4857c;
            p8.r rVar = new p8.r(m9);
            this.f39559k = rVar;
            D d9 = p8.r.f39924S;
            this.f39565q = (d9.f39860a & 8) != 0 ? d9.f39861b[3] : Integer.MAX_VALUE;
            A a9 = rVar.f39939P;
            synchronized (a9) {
                try {
                    if (a9.f39854w) {
                        throw new IOException("closed");
                    }
                    Logger logger = A.f39850y;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(j8.d.e(">> CONNECTION " + p8.h.f39898a.c(), new Object[0]));
                    }
                    a9.f39851n.v(p8.h.f39898a);
                    a9.f39851n.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            A a10 = rVar.f39939P;
            D settings = rVar.J;
            a10.getClass();
            kotlin.jvm.internal.h.e(settings, "settings");
            synchronized (a10) {
                try {
                    if (a10.f39854w) {
                        throw new IOException("closed");
                    }
                    a10.i(0, Integer.bitCount(settings.f39860a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z6 = true;
                        if (((1 << i) & settings.f39860a) == 0) {
                            z6 = false;
                        }
                        if (z6) {
                            y8.p pVar = a10.f39851n;
                            if (pVar.f41953v) {
                                throw new IllegalStateException("closed");
                            }
                            y8.e eVar = pVar.f41952u;
                            y8.s J = eVar.J(2);
                            int i4 = J.f41960c;
                            byte b9 = (byte) ((i >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
                            byte[] bArr = J.f41958a;
                            bArr[i4] = b9;
                            bArr[i4 + 1] = (byte) (i & com.anythink.basead.exoplayer.k.p.f9259b);
                            J.f41960c = i4 + 2;
                            eVar.f41924u += 2;
                            pVar.b();
                            a10.f39851n.n(settings.f39861b[i]);
                        }
                    }
                    a10.f39851n.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (rVar.J.a() != 65535) {
                rVar.f39939P.n(0, r2 - 65535);
            }
            l8.c.c(rVar.f39948z.d(), rVar.f39944v, rVar.f39940Q);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        y yVar = this.f39553d;
        sb.append(yVar.f38381a.f38193h.f38281d);
        sb.append(':');
        sb.append(yVar.f38381a.f38193h.f38282e);
        sb.append(", proxy=");
        sb.append(yVar.f38382b);
        sb.append(" hostAddress=");
        sb.append(yVar.f38383c);
        sb.append(" cipherSuite=");
        i8.k kVar = this.f39556g;
        if (kVar == null || (obj = kVar.f38265b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f39557h);
        sb.append('}');
        return sb.toString();
    }
}
