package com.anythink.core.common.n.b;

import com.anythink.core.common.n.b.v;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.anythink.core.common.n.b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565a {

    /* renamed from: a, reason: collision with root package name */
    final v f15646a;

    /* renamed from: b, reason: collision with root package name */
    final q f15647b;

    /* renamed from: c, reason: collision with root package name */
    final SocketFactory f15648c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0566b f15649d;

    /* renamed from: e, reason: collision with root package name */
    final List<ab> f15650e;

    /* renamed from: f, reason: collision with root package name */
    final List<l> f15651f;

    /* renamed from: g, reason: collision with root package name */
    final ProxySelector f15652g;

    /* renamed from: h, reason: collision with root package name */
    final Proxy f15653h;
    final SSLSocketFactory i;

    /* renamed from: j, reason: collision with root package name */
    final HostnameVerifier f15654j;

    /* renamed from: k, reason: collision with root package name */
    final g f15655k;

    public C0565a(String str, int i, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, InterfaceC0566b interfaceC0566b, Proxy proxy, List<ab> list, List<l> list2, ProxySelector proxySelector) {
        v.a aVar = new v.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            aVar.f16529a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            aVar.f16529a = "https";
        }
        v.a a9 = aVar.a(str);
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
        }
        a9.f16533e = i;
        this.f15646a = a9.b();
        if (qVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f15647b = qVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f15648c = socketFactory;
        if (interfaceC0566b == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f15649d = interfaceC0566b;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f15650e = com.anythink.core.common.n.b.a.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f15651f = com.anythink.core.common.n.b.a.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f15652g = proxySelector;
        this.f15653h = proxy;
        this.i = sSLSocketFactory;
        this.f15654j = hostnameVerifier;
        this.f15655k = gVar;
    }

    public final v a() {
        return this.f15646a;
    }

    public final q b() {
        return this.f15647b;
    }

    public final SocketFactory c() {
        return this.f15648c;
    }

    public final InterfaceC0566b d() {
        return this.f15649d;
    }

    public final List<ab> e() {
        return this.f15650e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0565a)) {
            return false;
        }
        C0565a c0565a = (C0565a) obj;
        return this.f15646a.equals(c0565a.f15646a) && a(c0565a);
    }

    public final List<l> f() {
        return this.f15651f;
    }

    public final ProxySelector g() {
        return this.f15652g;
    }

    public final Proxy h() {
        return this.f15653h;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f15655k) + ((Objects.hashCode(this.f15654j) + ((Objects.hashCode(this.i) + ((Objects.hashCode(this.f15653h) + ((this.f15652g.hashCode() + ((this.f15651f.hashCode() + ((this.f15650e.hashCode() + ((this.f15649d.hashCode() + ((this.f15647b.hashCode() + ((this.f15646a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final SSLSocketFactory i() {
        return this.i;
    }

    public final HostnameVerifier j() {
        return this.f15654j;
    }

    public final g k() {
        return this.f15655k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f15646a.f16521m);
        sb.append(":");
        sb.append(this.f15646a.f16522n);
        if (this.f15653h != null) {
            sb.append(", proxy=");
            sb.append(this.f15653h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f15652g);
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean a(C0565a c0565a) {
        return this.f15647b.equals(c0565a.f15647b) && this.f15649d.equals(c0565a.f15649d) && this.f15650e.equals(c0565a.f15650e) && this.f15651f.equals(c0565a.f15651f) && this.f15652g.equals(c0565a.f15652g) && Objects.equals(this.f15653h, c0565a.f15653h) && Objects.equals(this.i, c0565a.i) && Objects.equals(this.f15654j, c0565a.f15654j) && Objects.equals(this.f15655k, c0565a.f15655k) && this.f15646a.f16522n == c0565a.f15646a.f16522n;
    }
}
