package defpackage;

import java.net.SocketAddress;

/* loaded from: classes5.dex */
public final class gg3 extends SocketAddress {
    private static final long serialVersionUID = 0;
    public final int a;

    public gg3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gg3) && this.a == ((gg3) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return f1d.i(new StringBuilder("BoundClientAddress["), this.a, "]");
    }
}
