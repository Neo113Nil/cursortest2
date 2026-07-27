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
public final class C0546a {

    /* renamed from: a, reason: collision with root package name */
    final v f14859a;

    /* renamed from: b, reason: collision with root package name */
    final q f14860b;

    /* renamed from: c, reason: collision with root package name */
    final SocketFactory f14861c;

    /* renamed from: d, reason: collision with root package name */
    final b f14862d;

    /* renamed from: e, reason: collision with root package name */
    final List<ab> f14863e;

    /* renamed from: f, reason: collision with root package name */
    final List<l> f14864f;

    /* renamed from: g, reason: collision with root package name */
    final ProxySelector f14865g;

    /* renamed from: h, reason: collision with root package name */
    final Proxy f14866h;
    final SSLSocketFactory i;

    /* renamed from: j, reason: collision with root package name */
    final HostnameVerifier f14867j;

    /* renamed from: k, reason: collision with root package name */
    final g f14868k;

    public C0546a(String str, int i, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<ab> list, List<l> list2, ProxySelector proxySelector) {
        v.a aVar = new v.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            aVar.f15742a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            aVar.f15742a = "https";
        }
        v.a a9 = aVar.a(str);
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
        }
        a9.f15746e = i;
        this.f14859a = a9.b();
        if (qVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f14860b = qVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f14861c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f14862d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f14863e = com.anythink.core.common.n.b.a.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f14864f = com.anythink.core.common.n.b.a.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f14865g = proxySelector;
        this.f14866h = proxy;
        this.i = sSLSocketFactory;
        this.f14867j = hostnameVerifier;
        this.f14868k = gVar;
    }

    public final v a() {
        return this.f14859a;
    }

    public final q b() {
        return this.f14860b;
    }

    public final SocketFactory c() {
        return this.f14861c;
    }

    public final b d() {
        return this.f14862d;
    }

    public final List<ab> e() {
        return this.f14863e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0546a)) {
            return false;
        }
        C0546a c0546a = (C0546a) obj;
        return this.f14859a.equals(c0546a.f14859a) && a(c0546a);
    }

    public final List<l> f() {
        return this.f14864f;
    }

    public final ProxySelector g() {
        return this.f14865g;
    }

    public final Proxy h() {
        return this.f14866h;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f14868k) + ((Objects.hashCode(this.f14867j) + ((Objects.hashCode(this.i) + ((Objects.hashCode(this.f14866h) + ((this.f14865g.hashCode() + ((this.f14864f.hashCode() + ((this.f14863e.hashCode() + ((this.f14862d.hashCode() + ((this.f14860b.hashCode() + ((this.f14859a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final SSLSocketFactory i() {
        return this.i;
    }

    public final HostnameVerifier j() {
        return this.f14867j;
    }

    public final g k() {
        return this.f14868k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f14859a.f15734m);
        sb.append(":");
        sb.append(this.f14859a.f15735n);
        if (this.f14866h != null) {
            sb.append(", proxy=");
            sb.append(this.f14866h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f14865g);
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean a(C0546a c0546a) {
        return this.f14860b.equals(c0546a.f14860b) && this.f14862d.equals(c0546a.f14862d) && this.f14863e.equals(c0546a.f14863e) && this.f14864f.equals(c0546a.f14864f) && this.f14865g.equals(c0546a.f14865g) && Objects.equals(this.f14866h, c0546a.f14866h) && Objects.equals(this.i, c0546a.i) && Objects.equals(this.f14867j, c0546a.f14867j) && Objects.equals(this.f14868k, c0546a.f14868k) && this.f14859a.f15735n == c0546a.f14859a.f15735n;
    }
}
