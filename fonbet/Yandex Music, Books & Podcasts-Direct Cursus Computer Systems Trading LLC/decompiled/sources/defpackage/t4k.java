package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t4k {
    public final List a;
    public final Integer b;
    public final hyd c;
    public final int d;

    public t4k(List list, Integer num, hyd hydVar, int i) {
        list.getClass();
        this.a = list;
        this.b = num;
        this.c = hydVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t4k)) {
            return false;
        }
        t4k t4kVar = (t4k) obj;
        return Intrinsics.d(this.a, t4kVar.a) && Intrinsics.d(this.b, t4kVar.b) && this.c.equals(t4kVar.c) && this.d == t4kVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        Integer num = this.b;
        return Integer.hashCode(this.d) + this.c.hashCode() + hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.a);
        sb.append(", anchorPosition=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", leadingPlaceholderCount=");
        return vz1.r(sb, this.d, ')');
    }
}
