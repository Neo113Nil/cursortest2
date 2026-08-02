package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u9n {
    public final xab a;
    public final List b;
    public final List c;
    public final ArrayList d;

    public u9n(xab xabVar, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = xabVar;
        this.b = list;
        this.c = list2;
        this.d = CollectionsKt.g0(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9n)) {
            return false;
        }
        u9n u9nVar = (u9n) obj;
        return this.a.equals(u9nVar.a) && Intrinsics.d(this.b, u9nVar.b) && Intrinsics.d(this.c, u9nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueKey2(entityKey=");
        sb.append(this.a);
        sb.append(", playableWithKeys=");
        sb.append(this.b);
        sb.append(", recommendedPlayablesWithKeys=");
        return vz1.u(sb, this.c, ")");
    }
}
