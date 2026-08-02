package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ikd {
    public final Map a;
    public final Map b;

    public ikd(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikd)) {
            return false;
        }
        ikd ikdVar = (ikd) obj;
        return Intrinsics.d(this.a, ikdVar.a) && Intrinsics.d(this.b, ikdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(receiverToProviderName=");
        sb.append(this.a);
        sb.append(", providerNameToReceivers=");
        return k5r.p(sb, this.b, ')');
    }
}
