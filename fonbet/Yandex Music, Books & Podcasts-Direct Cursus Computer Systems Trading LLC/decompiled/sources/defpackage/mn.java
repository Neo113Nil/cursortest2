package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mn {
    public final i9w a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final ha4 e;
    public final imp f;
    public final ProxySelector g;
    public final u7e h;
    public final List i;
    public final List j;

    public mn(String str, int i, i9w i9wVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, ha4 ha4Var, imp impVar, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        i9wVar.getClass();
        socketFactory.getClass();
        impVar.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = i9wVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = ha4Var;
        this.f = impVar;
        this.g = proxySelector;
        s7e s7eVar = new s7e();
        s7eVar.n(sSLSocketFactory != null ? "https" : "http");
        s7eVar.g(str);
        s7eVar.i(i);
        this.h = s7eVar.e();
        this.i = cvt.x(list);
        this.j = cvt.x(list2);
    }

    public final boolean a(mn mnVar) {
        mnVar.getClass();
        return Intrinsics.d(this.a, mnVar.a) && Intrinsics.d(this.f, mnVar.f) && Intrinsics.d(this.i, mnVar.i) && Intrinsics.d(this.j, mnVar.j) && Intrinsics.d(this.g, mnVar.g) && Intrinsics.d(this.c, mnVar.c) && Intrinsics.d(this.d, mnVar.d) && Intrinsics.d(this.e, mnVar.e) && this.h.e == mnVar.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        return Intrinsics.d(this.h, mnVar.h) && a(mnVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + k5r.d(k5r.d((this.f.hashCode() + ((this.a.hashCode() + k5r.c(527, 31, this.h.i)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        u7e u7eVar = this.h;
        sb.append(u7eVar.d);
        sb.append(':');
        sb.append(u7eVar.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
