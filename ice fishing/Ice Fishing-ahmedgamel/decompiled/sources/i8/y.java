package i8;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C4603a f38381a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f38382b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f38383c;

    public y(C4603a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(socketAddress, "socketAddress");
        this.f38381a = address;
        this.f38382b = proxy;
        this.f38383c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.h.a(yVar.f38381a, this.f38381a) && kotlin.jvm.internal.h.a(yVar.f38382b, this.f38382b) && kotlin.jvm.internal.h.a(yVar.f38383c, this.f38383c);
    }

    public final int hashCode() {
        return this.f38383c.hashCode() + ((this.f38382b.hashCode() + ((this.f38381a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C4603a c4603a = this.f38381a;
        String str = c4603a.f38193h.f38281d;
        InetSocketAddress inetSocketAddress = this.f38383c;
        InetAddress address = inetSocketAddress.getAddress();
        String b9 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : j8.b.b(hostAddress);
        if (Q7.j.l0(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        n nVar = c4603a.f38193h;
        if (nVar.f38282e != inetSocketAddress.getPort() || str.equals(b9)) {
            sb.append(":");
            sb.append(nVar.f38282e);
        }
        if (!str.equals(b9)) {
            if (this.f38382b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (b9 == null) {
                sb.append("<unresolved>");
            } else if (Q7.j.l0(b9, ':')) {
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
