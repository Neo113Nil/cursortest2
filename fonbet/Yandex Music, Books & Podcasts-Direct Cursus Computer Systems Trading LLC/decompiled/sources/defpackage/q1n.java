package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q1n {
    public static final q1n c;
    public final List a;
    public final List b;

    static {
        c5b c5bVar = c5b.a;
        c = new q1n(c5bVar, c5bVar);
    }

    public q1n(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1n)) {
            return false;
        }
        q1n q1nVar = (q1n) obj;
        return Intrinsics.d(this.a, q1nVar.a) && Intrinsics.d(this.b, q1nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CastSourceDevices(onlineDevices=" + this.a + ", offlineDevices=" + this.b + ")";
    }
}
