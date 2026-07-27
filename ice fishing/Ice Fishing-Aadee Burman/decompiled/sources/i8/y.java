package i8;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C4594a f38262a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f38263b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f38264c;

    public y(C4594a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(socketAddress, "socketAddress");
        this.f38262a = address;
        this.f38263b = proxy;
        this.f38264c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.h.a(yVar.f38262a, this.f38262a) && kotlin.jvm.internal.h.a(yVar.f38263b, this.f38263b) && kotlin.jvm.internal.h.a(yVar.f38264c, this.f38264c);
    }

    public final int hashCode() {
        return this.f38264c.hashCode() + ((this.f38263b.hashCode() + ((this.f38262a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C4594a c4594a = this.f38262a;
        String str = c4594a.f38074h.f38162d;
        InetSocketAddress inetSocketAddress = this.f38264c;
        InetAddress address = inetSocketAddress.getAddress();
        String b9 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : j8.b.b(hostAddress);
        if (Q7.j.V(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        n nVar = c4594a.f38074h;
        if (nVar.f38163e != inetSocketAddress.getPort() || str.equals(b9)) {
            sb.append(":");
            sb.append(nVar.f38163e);
        }
        if (!str.equals(b9)) {
            if (this.f38263b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (b9 == null) {
                sb.append("<unresolved>");
            } else if (Q7.j.V(b9, ':')) {
                sb.append("[");
                sb.append(b9);
                sb.append("]");
            } else {
                sb.append(b9);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
