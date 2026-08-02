package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class reb {
    public static final wu1 d = new wu1("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List a;
    public final xu1 b;
    public final int c;

    public reb(SocketAddress socketAddress) {
        xu1 xu1Var = xu1.b;
        List singletonList = Collections.singletonList(socketAddress);
        o2g.J("addrs is empty", !singletonList.isEmpty());
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(singletonList));
        this.a = unmodifiableList;
        o2g.O(xu1Var, "attrs");
        this.b = xu1Var;
        this.c = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reb)) {
            return false;
        }
        reb rebVar = (reb) obj;
        List list = rebVar.a;
        List list2 = this.a;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!((SocketAddress) list2.get(i)).equals(list.get(i))) {
                return false;
            }
        }
        return this.b.equals(rebVar.b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return "[" + this.a + "/" + this.b + "]";
    }
}
