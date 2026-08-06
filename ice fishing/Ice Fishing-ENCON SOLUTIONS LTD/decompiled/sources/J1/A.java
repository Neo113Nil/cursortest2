package J1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final C0050a f803a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f804b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f805c;

    public A(C0050a c0050a, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.i.e(socketAddress, "socketAddress");
        this.f803a = c0050a;
        this.f804b = proxy;
        this.f805c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            A a2 = (A) obj;
            if (kotlin.jvm.internal.i.a(a2.f803a, this.f803a) && kotlin.jvm.internal.i.a(a2.f804b, this.f804b) && kotlin.jvm.internal.i.a(a2.f805c, this.f805c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f805c.hashCode() + ((this.f804b.hashCode() + ((this.f803a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f805c + '}';
    }
}
