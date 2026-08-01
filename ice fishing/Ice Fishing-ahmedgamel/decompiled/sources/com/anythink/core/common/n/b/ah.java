package com.anythink.core.common.n.b;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    final C0546a f15532a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f15533b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f15534c;

    public ah(C0546a c0546a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c0546a == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f15532a = c0546a;
        this.f15533b = proxy;
        this.f15534c = inetSocketAddress;
    }

    public final C0546a a() {
        return this.f15532a;
    }

    public final Proxy b() {
        return this.f15533b;
    }

    public final InetSocketAddress c() {
        return this.f15534c;
    }

    public final boolean d() {
        return this.f15532a.i != null && this.f15533b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return ahVar.f15532a.equals(this.f15532a) && ahVar.f15533b.equals(this.f15533b) && ahVar.f15534c.equals(this.f15534c);
    }

    public final int hashCode() {
        return this.f15534c.hashCode() + ((this.f15533b.hashCode() + ((this.f15532a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f15534c + "}";
    }
}
