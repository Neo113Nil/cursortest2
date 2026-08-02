package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bho {
    public final mn a;
    public final Proxy b;
    public final InetSocketAddress c;

    public bho(mn mnVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.a = mnVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bho)) {
            return false;
        }
        bho bhoVar = (bho) obj;
        return bhoVar.a.equals(this.a) && bhoVar.b.equals(this.b) && Intrinsics.d(bhoVar.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
