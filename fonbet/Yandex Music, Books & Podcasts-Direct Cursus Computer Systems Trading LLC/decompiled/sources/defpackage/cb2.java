package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cb2 {
    public final Boolean a;
    public final List b;

    public cb2(List list, Boolean bool) {
        list.getClass();
        this.a = bool;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb2)) {
            return false;
        }
        cb2 cb2Var = (cb2) obj;
        return Intrinsics.d(this.a, cb2Var.a) && Intrinsics.d(this.b, cb2Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
    }

    public final String toString() {
        return "AutoSkeletonTabsState(isOnlineContent=" + this.a + ", tabs=" + this.b + ")";
    }
}
