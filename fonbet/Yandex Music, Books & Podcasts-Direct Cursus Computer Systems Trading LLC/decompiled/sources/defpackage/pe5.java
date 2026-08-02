package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pe5 {
    public final v80 a;
    public final List b;

    public pe5(v80 v80Var, List list) {
        v80Var.getClass();
        this.a = v80Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe5)) {
            return false;
        }
        pe5 pe5Var = (pe5) obj;
        return Intrinsics.d(this.a, pe5Var.a) && Intrinsics.d(this.b, pe5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "CommonQueueAnalyticValues(forQueue=" + this.a + ", forPlayables=" + this.b + ")";
    }
}
