package com.anythink.core.common.n.b;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    final C0545a f15690a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f15691b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f15692c;

    public ah(C0545a c0545a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c0545a == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f15690a = c0545a;
        this.f15691b = proxy;
        this.f15692c = inetSocketAddress;
    }

    public final C0545a a() {
        return this.f15690a;
    }

    public final Proxy b() {
        return this.f15691b;
    }

    public final InetSocketAddress c() {
        return this.f15692c;
    }

    public final boolean d() {
        return this.f15690a.i != null && this.f15691b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return ahVar.f15690a.equals(this.f15690a) && ahVar.f15691b.equals(this.f15691b) && ahVar.f15692c.equals(this.f15692c);
    }

    public final int hashCode() {
        return this.f15692c.hashCode() + ((this.f15691b.hashCode() + ((this.f15690a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f15692c + "}";
    }
}
