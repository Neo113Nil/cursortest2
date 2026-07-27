package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.C0546a;
import com.anythink.core.common.n.b.ah;
import com.anythink.core.common.n.b.r;
import com.anythink.core.common.n.b.v;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private final C0546a f15009a;

    /* renamed from: b, reason: collision with root package name */
    private final g f15010b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.b.e f15011c;

    /* renamed from: d, reason: collision with root package name */
    private final r f15012d;

    /* renamed from: e, reason: collision with root package name */
    private List<Proxy> f15013e;

    /* renamed from: f, reason: collision with root package name */
    private int f15014f;

    /* renamed from: g, reason: collision with root package name */
    private List<InetSocketAddress> f15015g;

    /* renamed from: h, reason: collision with root package name */
    private final List<ah> f15016h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<ah> f15017a;

        /* renamed from: b, reason: collision with root package name */
        private int f15018b = 0;

        public a(List<ah> list) {
            this.f15017a = list;
        }

        public final boolean a() {
            return this.f15018b < this.f15017a.size();
        }

        public final ah b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            List<ah> list = this.f15017a;
            int i = this.f15018b;
            this.f15018b = i + 1;
            return list.get(i);
        }

        public final List<ah> c() {
            return new ArrayList(this.f15017a);
        }
    }

    public i(C0546a c0546a, g gVar, com.anythink.core.common.n.b.e eVar, r rVar) {
        List<Proxy> a9;
        List list = Collections.EMPTY_LIST;
        this.f15013e = list;
        this.f15015g = list;
        this.f15016h = new ArrayList();
        this.f15009a = c0546a;
        this.f15010b = gVar;
        this.f15011c = eVar;
        this.f15012d = rVar;
        v a10 = c0546a.a();
        Proxy h9 = c0546a.h();
        if (h9 != null) {
            a9 = Collections.singletonList(h9);
        } else {
            List<Proxy> select = c0546a.g().select(a10.a());
            a9 = (select == null || select.isEmpty()) ? com.anythink.core.common.n.b.a.c.a(Proxy.NO_PROXY) : com.anythink.core.common.n.b.a.c.a(select);
        }
        this.f15013e = a9;
        this.f15014f = 0;
    }

    private boolean c() {
        return this.f15014f < this.f15013e.size();
    }

    private Proxy d() {
        if (!c()) {
            throw new SocketException("No route to " + this.f15009a.a().f() + "; exhausted proxy configurations: " + this.f15013e);
        }
        List<Proxy> list = this.f15013e;
        int i = this.f15014f;
        this.f15014f = i + 1;
        Proxy proxy = list.get(i);
        a(proxy);
        return proxy;
    }

    public final boolean a() {
        return c() || !this.f15016h.isEmpty();
    }

    public final a b() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            if (!c()) {
                throw new SocketException("No route to " + this.f15009a.a().f() + "; exhausted proxy configurations: " + this.f15013e);
            }
            List<Proxy> list = this.f15013e;
            int i = this.f15014f;
            this.f15014f = i + 1;
            Proxy proxy = list.get(i);
            a(proxy);
            int size = this.f15015g.size();
            for (int i6 = 0; i6 < size; i6++) {
                ah ahVar = new ah(this.f15009a, proxy, this.f15015g.get(i6));
                if (this.f15010b.c(ahVar)) {
                    this.f15016h.add(ahVar);
                } else {
                    arrayList.add(ahVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f15016h);
            this.f15016h.clear();
        }
        return new a(arrayList);
    }

    private void a(v vVar, Proxy proxy) {
        List<Proxy> a9;
        if (proxy != null) {
            a9 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f15009a.g().select(vVar.a());
            a9 = (select == null || select.isEmpty()) ? com.anythink.core.common.n.b.a.c.a(Proxy.NO_PROXY) : com.anythink.core.common.n.b.a.c.a(select);
        }
        this.f15013e = a9;
        this.f15014f = 0;
    }

    private void a(Proxy proxy) {
        String f3;
        int g4;
        this.f15015g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    f3 = inetSocketAddress.getHostName();
                } else {
                    f3 = address2.getHostAddress();
                }
                g4 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        } else {
            f3 = this.f15009a.a().f();
            g4 = this.f15009a.a().g();
        }
        if (g4 > 0 && g4 <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f15015g.add(InetSocketAddress.createUnresolved(f3, g4));
                return;
            }
            List<InetAddress> lookup = this.f15009a.b().lookup(f3);
            if (!lookup.isEmpty()) {
                int size = lookup.size();
                for (int i = 0; i < size; i++) {
                    this.f15015g.add(new InetSocketAddress(lookup.get(i), g4));
                }
                return;
            }
            throw new UnknownHostException(this.f15009a.b() + " returned no addresses for " + f3);
        }
        throw new SocketException("No route to " + f3 + ":" + g4 + "; port is out of range");
    }

    private static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
