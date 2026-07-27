package m8;

import C2.N;
import com.google.android.gms.internal.ads.Y5;
import g1.C4523c;
import i8.C4594a;
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
import q2.C4896n;
import v7.AbstractC5128i;
import v7.AbstractC5129j;
import v7.C5127h;
import w7.C5156c;

/* loaded from: classes2.dex */
public final class t implements x {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f39417A;

    /* renamed from: B, reason: collision with root package name */
    public final C4594a f39418B;

    /* renamed from: C, reason: collision with root package name */
    public final C4523c f39419C;

    /* renamed from: D, reason: collision with root package name */
    public final a f39420D;

    /* renamed from: E, reason: collision with root package name */
    public Y5 f39421E;

    /* renamed from: F, reason: collision with root package name */
    public y f39422F;

    /* renamed from: G, reason: collision with root package name */
    public i8.y f39423G;

    /* renamed from: H, reason: collision with root package name */
    public final C5127h f39424H;

    /* renamed from: n, reason: collision with root package name */
    public final l8.d f39425n;

    /* renamed from: u, reason: collision with root package name */
    public final s f39426u;

    /* renamed from: v, reason: collision with root package name */
    public final int f39427v;

    /* renamed from: w, reason: collision with root package name */
    public final int f39428w;

    /* renamed from: x, reason: collision with root package name */
    public final int f39429x;

    /* renamed from: y, reason: collision with root package name */
    public final int f39430y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f39431z;

    public t(l8.d taskRunner, s connectionPool, int i, int i6, int i9, int i10, boolean z3, boolean z6, C4594a address, C4523c routeDatabase, a connectionUser) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.h.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.h.e(connectionUser, "connectionUser");
        this.f39425n = taskRunner;
        this.f39426u = connectionPool;
        this.f39427v = i;
        this.f39428w = i6;
        this.f39429x = i9;
        this.f39430y = i10;
        this.f39431z = z3;
        this.f39417A = z6;
        this.f39418B = address;
        this.f39419C = routeDatabase;
        this.f39420D = connectionUser;
        this.f39424H = new C5127h();
    }

    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.util.List] */
    public final e a() {
        String str;
        int i;
        List list;
        boolean contains;
        i8.y yVar = this.f39423G;
        if (yVar != null) {
            this.f39423G = null;
            return b(yVar, null);
        }
        Y5 y52 = this.f39421E;
        if (y52 != null && y52.f28654b < y52.f28653a.size()) {
            int i6 = y52.f28654b;
            ArrayList arrayList = y52.f28653a;
            if (i6 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i9 = y52.f28654b;
            y52.f28654b = 1 + i9;
            return b((i8.y) arrayList.get(i9), null);
        }
        y yVar2 = this.f39422F;
        if (yVar2 == null) {
            yVar2 = new y(this.f39418B, this.f39419C, this.f39420D, this.f39417A);
            this.f39422F = yVar2;
        }
        if (!yVar2.a()) {
            throw new IOException("exhausted all routes");
        }
        if (!yVar2.a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (yVar2.f39441f < yVar2.f39440e.size()) {
            boolean z3 = yVar2.f39441f < yVar2.f39440e.size();
            C4594a c4594a = yVar2.f39436a;
            if (!z3) {
                throw new SocketException("No route to " + c4594a.f38074h.f38162d + "; exhausted proxy configurations: " + yVar2.f39440e);
            }
            List list2 = yVar2.f39440e;
            int i10 = yVar2.f39441f;
            yVar2.f39441f = i10 + 1;
            Proxy proxy = (Proxy) list2.get(i10);
            ArrayList arrayList3 = new ArrayList();
            yVar2.f39442g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                i8.n nVar = c4594a.f38074h;
                str = nVar.f38162d;
                i = nVar.f38163e;
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
                Q7.i iVar = j8.b.f38481a;
                kotlin.jvm.internal.h.e(str, "<this>");
                Q7.i iVar2 = j8.b.f38481a;
                iVar2.getClass();
                if (iVar2.f2685n.matcher(str).matches()) {
                    list = d6.c.k(InetAddress.getByName(str));
                } else {
                    a aVar = yVar2.f39438c;
                    aVar.f39319a.getClass();
                    c4594a.f38067a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(str);
                        kotlin.jvm.internal.h.d(allByName, "getAllByName(...)");
                        List y7 = AbstractC5128i.y(allByName);
                        if (y7.isEmpty()) {
                            throw new UnknownHostException(c4594a.f38067a + " returned no addresses for " + str);
                        }
                        aVar.f39319a.getClass();
                        list = y7;
                    } catch (NullPointerException e9) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                        unknownHostException.initCause(e9);
                        throw unknownHostException;
                    }
                }
                if (yVar2.f39439d && list.size() >= 2) {
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
                        byte[] bArr = j8.c.f38482a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        C5156c c5156c = new C5156c(10);
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                c5156c.add(it.next());
                            }
                            if (it2.hasNext()) {
                                c5156c.add(it2.next());
                            }
                        }
                        list = d6.c.b(c5156c);
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), i));
                }
            }
            Iterator it4 = yVar2.f39442g.iterator();
            while (it4.hasNext()) {
                i8.y yVar3 = new i8.y(yVar2.f39436a, proxy, (InetSocketAddress) it4.next());
                C4523c c4523c = yVar2.f39437b;
                synchronized (c4523c) {
                    contains = ((LinkedHashSet) c4523c.f37627u).contains(yVar3);
                }
                if (contains) {
                    yVar2.f39443h.add(yVar3);
                } else {
                    arrayList2.add(yVar3);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            AbstractC5129j.z(yVar2.f39443h, arrayList2);
            yVar2.f39443h.clear();
        }
        Y5 y53 = new Y5(arrayList2);
        this.f39421E = y53;
        if (this.f39420D.k()) {
            throw new IOException("Canceled");
        }
        if (y53.f28654b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i11 = y53.f28654b;
        y53.f28654b = 1 + i11;
        return b((i8.y) arrayList2.get(i11), arrayList2);
    }

    public final e b(i8.y route, ArrayList arrayList) {
        kotlin.jvm.internal.h.e(route, "route");
        C4594a c4594a = route.f38262a;
        if (c4594a.f38069c == null) {
            if (!c4594a.f38075j.contains(i8.i.f38127f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f38262a.f38074h.f38162d;
            s8.f fVar = s8.f.f40497a;
            if (!s8.f.f40497a.i(str)) {
                throw new UnknownServiceException(D.y.o("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c4594a.i.contains(i8.s.f38228z)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        C4896n c4896n = null;
        if (route.f38263b.type() == Proxy.Type.HTTP) {
            C4594a c4594a2 = route.f38262a;
            if (c4594a2.f38069c != null || c4594a2.i.contains(i8.s.f38228z)) {
                N n9 = new N();
                i8.n url = route.f38262a.f38074h;
                kotlin.jvm.internal.h.e(url, "url");
                n9.f301u = url;
                n9.p("CONNECT", null);
                C4594a c4594a3 = route.f38262a;
                n9.o("Host", j8.d.i(c4594a3.f38074h, true));
                n9.o("Proxy-Connection", com.anythink.expressad.foundation.g.f.g.b.f19340c);
                n9.o("User-Agent", "okhttp/5.2.1");
                c4896n = new C4896n(n9);
                i8.w body = i8.x.f38261n;
                G1.e eVar = new G1.e(3);
                i8.b bVar = i8.s.f38223u;
                com.bumptech.glide.f.h("Proxy-Authenticate");
                com.bumptech.glide.f.i("OkHttp-Preemptive", "Proxy-Authenticate");
                eVar.d("Proxy-Authenticate");
                com.bumptech.glide.f.f(eVar, "Proxy-Authenticate", "OkHttp-Preemptive");
                eVar.b();
                kotlin.jvm.internal.h.e(body, "body");
                c4594a3.f38072f.getClass();
            }
        }
        return new e(this.f39425n, this.f39426u, this.f39427v, this.f39428w, this.f39429x, this.f39430y, this.f39431z, this.f39420D, this, route, arrayList, c4896n, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x004b, code lost:
    
        if ((r7.f39402k != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u c(e eVar, ArrayList arrayList) {
        r rVar;
        boolean z3;
        Socket m4;
        s sVar = this.f39426u;
        boolean j6 = this.f39420D.j();
        C4594a address = this.f39418B;
        a connectionUser = this.f39420D;
        boolean z6 = eVar != null && eVar.isReady();
        sVar.getClass();
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(connectionUser, "connectionUser");
        Iterator it = sVar.f39416f.iterator();
        kotlin.jvm.internal.h.d(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                rVar = null;
                break;
            }
            rVar = (r) it.next();
            kotlin.jvm.internal.h.b(rVar);
            synchronized (rVar) {
                if (z6) {
                }
                if (rVar.e(address, arrayList)) {
                    connectionUser.a(rVar);
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                if (rVar.h(j6)) {
                    break;
                }
                synchronized (rVar) {
                    rVar.f39403l = true;
                    m4 = connectionUser.m();
                }
                if (m4 != null) {
                    j8.d.c(m4);
                }
            }
        }
        if (rVar == null) {
            return null;
        }
        if (eVar != null) {
            this.f39423G = eVar.f39335j;
            Socket socket = eVar.f39342q;
            if (socket != null) {
                j8.d.c(socket);
            }
        }
        this.f39420D.g(rVar);
        this.f39420D.h(rVar);
        return new u(rVar);
    }

    @Override // m8.x
    public final boolean e(i8.n url) {
        kotlin.jvm.internal.h.e(url, "url");
        i8.n nVar = this.f39418B.f38074h;
        return url.f38163e == nVar.f38163e && kotlin.jvm.internal.h.a(url.f38162d, nVar.f38162d);
    }

    @Override // m8.x
    public final C4594a l() {
        return this.f39418B;
    }

    @Override // m8.x
    public final boolean m() {
        return this.f39420D.k();
    }

    @Override // m8.x
    public final boolean s(r rVar) {
        y yVar;
        i8.y yVar2;
        if (this.f39424H.isEmpty() && this.f39423G == null) {
            if (rVar != null) {
                synchronized (rVar) {
                    yVar2 = null;
                    if (rVar.f39405n == 0 && rVar.f39403l && j8.d.a(rVar.f39396d.f38262a.f38074h, this.f39418B.f38074h)) {
                        yVar2 = rVar.f39396d;
                    }
                }
                if (yVar2 != null) {
                    this.f39423G = yVar2;
                    return true;
                }
            }
            Y5 y52 = this.f39421E;
            if ((y52 == null || y52.f28654b >= y52.f28653a.size()) && (yVar = this.f39422F) != null) {
                return yVar.a();
            }
        }
        return true;
    }

    @Override // m8.x
    public final C5127h v() {
        return this.f39424H;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0088  */
    @Override // m8.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w w() {
        Socket m4;
        boolean z3;
        u uVar;
        r d2 = this.f39420D.d();
        if (d2 != null) {
            boolean h9 = d2.h(this.f39420D.j());
            synchronized (d2) {
                try {
                    if (h9) {
                        if (!d2.f39403l && e(d2.f39396d.f38262a.f38074h)) {
                            z3 = false;
                            m4 = null;
                        }
                        m4 = this.f39420D.m();
                        z3 = false;
                    } else {
                        z3 = !d2.f39403l;
                        d2.f39403l = true;
                        m4 = this.f39420D.m();
                    }
                } finally {
                }
            }
            if (this.f39420D.d() != null) {
                if (m4 != null) {
                    throw new IllegalStateException("Check failed.");
                }
                uVar = new u(d2);
                if (uVar == null) {
                    return uVar;
                }
                u c9 = c(null, null);
                if (c9 != null) {
                    return c9;
                }
                if (!this.f39424H.isEmpty()) {
                    return (w) this.f39424H.removeFirst();
                }
                e a9 = a();
                u c10 = c(a9, a9.f39336k);
                return c10 != null ? c10 : a9;
            }
            if (m4 != null) {
                j8.d.c(m4);
            }
            this.f39420D.f39319a.getClass();
            q call = this.f39420D.f39319a;
            kotlin.jvm.internal.h.e(call, "call");
            if (m4 != null) {
                this.f39420D.getClass();
            } else if (z3) {
                this.f39420D.getClass();
            }
        }
        uVar = null;
        if (uVar == null) {
        }
    }
}
