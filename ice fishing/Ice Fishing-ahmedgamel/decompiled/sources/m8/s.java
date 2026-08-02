package m8;

import E2.M;
import com.google.android.gms.internal.ads.Y5;
import i1.C4586c;
import i8.C4603a;
import i8.y;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import s2.C4945n;
import v7.AbstractC5118i;
import v7.AbstractC5119j;
import v7.C5117h;
import w7.C5155c;

/* loaded from: classes2.dex */
public final class s implements w {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f39574A;

    /* renamed from: B, reason: collision with root package name */
    public final C4603a f39575B;

    /* renamed from: C, reason: collision with root package name */
    public final C4586c f39576C;

    /* renamed from: D, reason: collision with root package name */
    public final a f39577D;

    /* renamed from: E, reason: collision with root package name */
    public Y5 f39578E;

    /* renamed from: F, reason: collision with root package name */
    public x f39579F;

    /* renamed from: G, reason: collision with root package name */
    public y f39580G;

    /* renamed from: H, reason: collision with root package name */
    public final C5117h f39581H;

    /* renamed from: n, reason: collision with root package name */
    public final l8.d f39582n;

    /* renamed from: u, reason: collision with root package name */
    public final r f39583u;

    /* renamed from: v, reason: collision with root package name */
    public final int f39584v;

    /* renamed from: w, reason: collision with root package name */
    public final int f39585w;

    /* renamed from: x, reason: collision with root package name */
    public final int f39586x;

    /* renamed from: y, reason: collision with root package name */
    public final int f39587y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f39588z;

    public s(l8.d taskRunner, r connectionPool, int i, int i4, int i6, int i9, boolean z6, boolean z9, C4603a address, C4586c routeDatabase, a connectionUser) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.h.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.h.e(connectionUser, "connectionUser");
        this.f39582n = taskRunner;
        this.f39583u = connectionPool;
        this.f39584v = i;
        this.f39585w = i4;
        this.f39586x = i6;
        this.f39587y = i9;
        this.f39588z = z6;
        this.f39574A = z9;
        this.f39575B = address;
        this.f39576C = routeDatabase;
        this.f39577D = connectionUser;
        this.f39581H = new C5117h();
    }

    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.util.List] */
    public final e a() {
        String str;
        int i;
        List list;
        boolean contains;
        y yVar = this.f39580G;
        if (yVar != null) {
            this.f39580G = null;
            return b(yVar, null);
        }
        Y5 y52 = this.f39578E;
        if (y52 != null && y52.f29431b < y52.f29430a.size()) {
            int i4 = y52.f29431b;
            ArrayList arrayList = y52.f29430a;
            if (i4 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i6 = y52.f29431b;
            y52.f29431b = 1 + i6;
            return b((y) arrayList.get(i6), null);
        }
        x xVar = this.f39579F;
        if (xVar == null) {
            xVar = new x(this.f39575B, this.f39576C, this.f39577D, this.f39574A);
            this.f39579F = xVar;
        }
        if (!xVar.a()) {
            throw new IOException("exhausted all routes");
        }
        if (!xVar.a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (xVar.f39598f < xVar.f39597e.size()) {
            boolean z6 = xVar.f39598f < xVar.f39597e.size();
            C4603a c4603a = xVar.f39593a;
            if (!z6) {
                throw new SocketException("No route to " + c4603a.f38193h.f38281d + "; exhausted proxy configurations: " + xVar.f39597e);
            }
            List list2 = xVar.f39597e;
            int i9 = xVar.f39598f;
            xVar.f39598f = i9 + 1;
            Proxy proxy = (Proxy) list2.get(i9);
            ArrayList arrayList3 = new ArrayList();
            xVar.f39599g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                i8.n nVar = c4603a.f38193h;
                str = nVar.f38281d;
                i = nVar.f38282e;
            } else {
                SocketAddress address = proxy.address();
                if (!(address instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                kotlin.jvm.internal.h.e(inetSocketAddress, "<this>");
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    str = inetSocketAddress.getHostName();
                    kotlin.jvm.internal.h.d(str, "getHostName(...)");
                } else {
                    str = address2.getHostAddress();
                    kotlin.jvm.internal.h.d(str, "getHostAddress(...)");
                }
                i = inetSocketAddress.getPort();
            }
            if (1 > i || i >= 65536) {
                throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(str, i));
            } else {
                Q7.i iVar = j8.b.f38493a;
                kotlin.jvm.internal.h.e(str, "<this>");
                Q7.i iVar2 = j8.b.f38493a;
                iVar2.getClass();
                if (iVar2.f2722n.matcher(str).matches()) {
                    list = Z2.d.n(InetAddress.getByName(str));
                } else {
                    a aVar = xVar.f39595c;
                    aVar.f39478a.getClass();
                    c4603a.f38186a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(str);
                        kotlin.jvm.internal.h.d(allByName, "getAllByName(...)");
                        List B3 = AbstractC5118i.B(allByName);
                        if (B3.isEmpty()) {
                            throw new UnknownHostException(c4603a.f38186a + " returned no addresses for " + str);
                        }
                        aVar.f39478a.getClass();
                        list = B3;
                    } catch (NullPointerException e9) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                        unknownHostException.initCause(e9);
                        throw unknownHostException;
                    }
                }
                if (xVar.f39596d && list.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : list) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = j8.c.f38494a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        C5155c c5155c = new C5155c(10);
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                c5155c.add(it.next());
                            }
                            if (it2.hasNext()) {
                                c5155c.add(it2.next());
                            }
                        }
                        list = Z2.d.g(c5155c);
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), i));
                }
            }
            Iterator it4 = xVar.f39599g.iterator();
            while (it4.hasNext()) {
                y yVar2 = new y(xVar.f39593a, proxy, (InetSocketAddress) it4.next());
                C4586c c4586c = xVar.f39594b;
                synchronized (c4586c) {
                    contains = ((LinkedHashSet) c4586c.f38154u).contains(yVar2);
                }
                if (contains) {
                    xVar.f39600h.add(yVar2);
                } else {
                    arrayList2.add(yVar2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            AbstractC5119j.x(xVar.f39600h, arrayList2);
            xVar.f39600h.clear();
        }
        Y5 y53 = new Y5(arrayList2);
        this.f39578E = y53;
        if (this.f39577D.k()) {
            throw new IOException("Canceled");
        }
        if (y53.f29431b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i10 = y53.f29431b;
        y53.f29431b = 1 + i10;
        return b((y) arrayList2.get(i10), arrayList2);
    }

    public final e b(y route, ArrayList arrayList) {
        kotlin.jvm.internal.h.e(route, "route");
        C4603a c4603a = route.f38381a;
        if (c4603a.f38188c == null) {
            if (!c4603a.f38194j.contains(i8.i.f38246f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f38381a.f38193h.f38281d;
            s8.f fVar = s8.f.f40554a;
            if (!s8.f.f40554a.i(str)) {
                throw new UnknownServiceException(D.x.l("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c4603a.i.contains(i8.s.f38347z)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        C4945n c4945n = null;
        if (route.f38382b.type() == Proxy.Type.HTTP) {
            C4603a c4603a2 = route.f38381a;
            if (c4603a2.f38188c != null || c4603a2.i.contains(i8.s.f38347z)) {
                M m9 = new M();
                i8.n url = route.f38381a.f38193h;
                kotlin.jvm.internal.h.e(url, "url");
                m9.f761u = url;
                m9.p("CONNECT", null);
                C4603a c4603a3 = route.f38381a;
                m9.o("Host", j8.d.i(c4603a3.f38193h, true));
                m9.o("Proxy-Connection", com.anythink.expressad.foundation.g.f.g.b.f20127c);
                m9.o("User-Agent", "okhttp/5.2.1");
                c4945n = new C4945n(m9);
                i8.w body = i8.x.f38380n;
                I1.d dVar = new I1.d(3);
                i8.b bVar = i8.s.f38342u;
                X2.a.k("Proxy-Authenticate");
                X2.a.l("OkHttp-Preemptive", "Proxy-Authenticate");
                dVar.g("Proxy-Authenticate");
                X2.a.b(dVar, "Proxy-Authenticate", "OkHttp-Preemptive");
                dVar.e();
                kotlin.jvm.internal.h.e(body, "body");
                c4603a3.f38191f.getClass();
            }
        }
        return new e(this.f39582n, this.f39583u, this.f39584v, this.f39585w, this.f39586x, this.f39587y, this.f39588z, this.f39577D, this, route, arrayList, c4945n, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x004b, code lost:
    
        if ((r7.f39559k != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t c(e eVar, ArrayList arrayList) {
        q qVar;
        boolean z6;
        Socket m9;
        r rVar = this.f39583u;
        boolean j6 = this.f39577D.j();
        C4603a address = this.f39575B;
        a connectionUser = this.f39577D;
        boolean z9 = eVar != null && eVar.isReady();
        rVar.getClass();
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(connectionUser, "connectionUser");
        Iterator it = rVar.f39573f.iterator();
        kotlin.jvm.internal.h.d(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                qVar = null;
                break;
            }
            qVar = (q) it.next();
            kotlin.jvm.internal.h.b(qVar);
            synchronized (qVar) {
                if (z9) {
                }
                if (qVar.e(address, arrayList)) {
                    connectionUser.a(qVar);
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            if (z6) {
                if (qVar.h(j6)) {
                    break;
                }
                synchronized (qVar) {
                    qVar.f39560l = true;
                    m9 = connectionUser.m();
                }
                if (m9 != null) {
                    j8.d.c(m9);
                }
            }
        }
        if (qVar == null) {
            return null;
        }
        if (eVar != null) {
            this.f39580G = eVar.f39494j;
            Socket socket = eVar.f39501q;
            if (socket != null) {
                j8.d.c(socket);
            }
        }
        this.f39577D.g(qVar);
        this.f39577D.h(qVar);
        return new t(qVar);
    }

    @Override // m8.w
    public final boolean d(i8.n url) {
        kotlin.jvm.internal.h.e(url, "url");
        i8.n nVar = this.f39575B.f38193h;
        return url.f38282e == nVar.f38282e && kotlin.jvm.internal.h.a(url.f38281d, nVar.f38281d);
    }

    @Override // m8.w
    public final C4603a f() {
        return this.f39575B;
    }

    @Override // m8.w
    public final boolean i() {
        return this.f39577D.k();
    }

    @Override // m8.w
    public final boolean k(q qVar) {
        x xVar;
        y yVar;
        if (this.f39581H.isEmpty() && this.f39580G == null) {
            if (qVar != null) {
                synchronized (qVar) {
                    yVar = null;
                    if (qVar.f39562n == 0 && qVar.f39560l && j8.d.a(qVar.f39553d.f38381a.f38193h, this.f39575B.f38193h)) {
                        yVar = qVar.f39553d;
                    }
                }
                if (yVar != null) {
                    this.f39580G = yVar;
                    return true;
                }
            }
            Y5 y52 = this.f39578E;
            if ((y52 == null || y52.f29431b >= y52.f29430a.size()) && (xVar = this.f39579F) != null) {
                return xVar.a();
            }
        }
        return true;
    }

    @Override // m8.w
    public final C5117h o() {
        return this.f39581H;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0088  */
    @Override // m8.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v q() {
        Socket m9;
        boolean z6;
        t tVar;
        q d9 = this.f39577D.d();
        if (d9 != null) {
            boolean h3 = d9.h(this.f39577D.j());
            synchronized (d9) {
                try {
                    if (h3) {
                        if (!d9.f39560l && d(d9.f39553d.f38381a.f38193h)) {
                            z6 = false;
                            m9 = null;
                        }
                        m9 = this.f39577D.m();
                        z6 = false;
                    } else {
                        z6 = !d9.f39560l;
                        d9.f39560l = true;
                        m9 = this.f39577D.m();
                    }
                } finally {
                }
            }
            if (this.f39577D.d() != null) {
                if (m9 != null) {
                    throw new IllegalStateException("Check failed.");
                }
                tVar = new t(d9);
                if (tVar == null) {
                    return tVar;
                }
                t c9 = c(null, null);
                if (c9 != null) {
                    return c9;
                }
                if (!this.f39581H.isEmpty()) {
                    return (v) this.f39581H.removeFirst();
                }
                e a9 = a();
                t c10 = c(a9, a9.f39495k);
                return c10 != null ? c10 : a9;
            }
            if (m9 != null) {
                j8.d.c(m9);
            }
            this.f39577D.f39478a.getClass();
            p call = this.f39577D.f39478a;
            kotlin.jvm.internal.h.e(call, "call");
            if (m9 != null) {
                this.f39577D.getClass();
            } else if (z6) {
                this.f39577D.getClass();
            }
        }
        tVar = null;
        if (tVar == null) {
        }
    }
}
