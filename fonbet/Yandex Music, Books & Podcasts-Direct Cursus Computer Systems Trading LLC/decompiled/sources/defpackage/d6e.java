package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class d6e extends wzm {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 0;
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;

    public d6e(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        o2g.O(inetSocketAddress, "proxyAddress");
        o2g.O(inetSocketAddress2, "targetAddress");
        o2g.S(inetSocketAddress, "The proxy address %s is not resolved", !inetSocketAddress.isUnresolved());
        this.a = inetSocketAddress;
        this.b = inetSocketAddress2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d6e)) {
            return false;
        }
        d6e d6eVar = (d6e) obj;
        return hdg.S(this.a, d6eVar.a) && hdg.S(this.b, d6eVar.b) && hdg.S(this.c, d6eVar.c) && hdg.S(this.d, d6eVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a, "proxyAddr");
        Y.q(this.b, "targetAddr");
        Y.q(this.c, "username");
        Y.t("hasPassword", this.d != null);
        return Y.toString();
    }
}
