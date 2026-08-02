package com.anythink.core.common.n.b;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    final C0565a f16319a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f16320b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f16321c;

    public ah(C0565a c0565a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c0565a == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f16319a = c0565a;
        this.f16320b = proxy;
        this.f16321c = inetSocketAddress;
    }

    public final C0565a a() {
        return this.f16319a;
    }

    public final Proxy b() {
        return this.f16320b;
    }

    public final InetSocketAddress c() {
        return this.f16321c;
    }

    public final boolean d() {
        return this.f16319a.i != null && this.f16320b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return ahVar.f16319a.equals(this.f16319a) && ahVar.f16320b.equals(this.f16320b) && ahVar.f16321c.equals(this.f16321c);
    }

    public final int hashCode() {
        return this.f16321c.hashCode() + ((this.f16320b.hashCode() + ((this.f16319a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f16321c + "}";
    }
}
