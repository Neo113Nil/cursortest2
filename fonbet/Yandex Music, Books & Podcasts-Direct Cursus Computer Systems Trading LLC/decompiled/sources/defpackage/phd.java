package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class phd {
    public static final phd c;
    public final List a;
    public final List b;

    static {
        c5b c5bVar = c5b.a;
        c = new phd(c5bVar, c5bVar);
    }

    public phd(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phd)) {
            return false;
        }
        phd phdVar = (phd) obj;
        return Intrinsics.d(this.a, phdVar.a) && Intrinsics.d(this.b, phdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GlagolDiscoveryResult(conversations=" + this.a + ", availableStations=" + this.b + ")";
    }
}
