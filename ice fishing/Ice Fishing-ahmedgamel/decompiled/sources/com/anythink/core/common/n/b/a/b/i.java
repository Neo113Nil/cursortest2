package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.C0565a;
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
    private final C0565a f15796a;

    /* renamed from: b, reason: collision with root package name */
    private final g f15797b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.b.e f15798c;

    /* renamed from: d, reason: collision with root package name */
    private final r f15799d;

    /* renamed from: e, reason: collision with root package name */
    private List<Proxy> f15800e;

    /* renamed from: f, reason: collision with root package name */
    private int f15801f;

    /* renamed from: g, reason: collision with root package name */
    private List<InetSocketAddress> f15802g;

    /* renamed from: h, reason: collision with root package name */
    private final List<ah> f15803h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<ah> f15804a;

        /* renamed from: b, reason: collision with root package name */
        private int f15805b = 0;

        public a(List<ah> list) {
            this.f15804a = list;
        }

        public final boolean a() {
            return this.f15805b < this.f15804a.size();
        }

        public final ah b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            List<ah> list = this.f15804a;
            int i = this.f15805b;
            this.f15805b = i + 1;
            return list.get(i);
        }

        public final List<ah> c() {
            return new ArrayList(this.f15804a);
        }
    }

    public i(C0565a c0565a, g gVar, com.anythink.core.common.n.b.e eVar, r rVar) {
        List<Proxy> a9;
        List list = Collections.EMPTY_LIST;
        this.f15800e = list;
        this.f15802g = list;
        this.f15803h = new ArrayList();
        this.f15796a = c0565a;
        this.f15797b = gVar;
        this.f15798c = eVar;
        this.f15799d = rVar;
        v a10 = c0565a.a();
        Proxy h3 = c0565a.h();
        if (h3 != null) {
            a9 = Collections.singletonList(h3);
        } else {
            List<Proxy> select = c0565a.g().select(a10.a());
            a9 = (select == null || select.isEmpty()) ? com.anythink.core.common.n.b.a.c.a(Proxy.NO_PROXY) : com.anythink.core.common.n.b.a.c.a(select);
        }
        this.f15800e = a9;
        this.f15801f = 0;
    }

    private boolean c() {
        return this.f15801f < this.f15800e.size();
    }

    private Proxy d() {
        if (!c()) {
            throw new SocketException("No route to " + this.f15796a.a().f() + "; exhausted proxy configurations: " + this.f15800e);
        }
        List<Proxy> list = this.f15800e;
        int i = this.f15801f;
        this.f15801f = i + 1;
        Proxy proxy = list.get(i);
        a(proxy);
        return proxy;
    }

    public final boolean a() {
        return c() || !this.f15803h.isEmpty();
    }

    public final a b() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            if (!c()) {
                throw new SocketException("No route to " + this.f15796a.a().f() + "; exhausted proxy configurations: " + this.f15800e);
            }
            List<Proxy> list = this.f15800e;
            int i = this.f15801f;
            this.f15801f = i + 1;
            Proxy proxy = list.get(i);
            a(proxy);
            int size = this.f15802g.size();
            for (int i4 = 0; i4 < size; i4++) {
                ah ahVar = new ah(this.f15796a, proxy, this.f15802g.get(i4));
                if (this.f15797b.c(ahVar)) {
                    this.f15803h.add(ahVar);
                } else {
                    arrayList.add(ahVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f15803h);
            this.f15803h.clear();
        }
        return new a(arrayList);
    }

    private void a(v vVar, Proxy proxy) {
        List<Proxy> a9;
        if (proxy != null) {
            a9 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f15796a.g().select(vVar.a());
            a9 = (select == null || select.isEmpty()) ? com.anythink.core.common.n.b.a.c.a(Proxy.NO_PROXY) : com.anythink.core.common.n.b.a.c.a(select);
        }
        this.f15800e = a9;
        this.f15801f = 0;
    }

    private void a(Proxy proxy) {
        String f2;
        int g9;
        this.f15802g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    f2 = inetSocketAddress.getHostName();
                } else {
                    f2 = address2.getHostAddress();
                }
                g9 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        } else {
            f2 = this.f15796a.a().f();
            g9 = this.f15796a.a().g();
        }
        if (g9 > 0 && g9 <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f15802g.add(InetSocketAddress.createUnresolved(f2, g9));
                return;
            }
            List<InetAddress> lookup = this.f15796a.b().lookup(f2);
            if (!lookup.isEmpty()) {
                int size = lookup.size();
                for (int i = 0; i < size; i++) {
                    this.f15802g.add(new InetSocketAddress(lookup.get(i), g9));
                }
                return;
            }
            throw new UnknownHostException(this.f15796a.b() + " returned no addresses for " + f2);
        }
        throw new SocketException("No route to " + f2 + ":" + g9 + "; port is out of range");
    }

    private static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
