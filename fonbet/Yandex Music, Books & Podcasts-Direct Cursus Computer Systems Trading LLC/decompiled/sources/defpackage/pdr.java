package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pdr {
    public final boolean a;
    public final boolean b;
    public final i4e c;
    public final List d;
    public final List e;

    public pdr(boolean z, boolean z2, i4e i4eVar, List list, List list2) {
        this.a = z;
        this.b = z2;
        this.c = i4eVar;
        this.d = list;
        this.e = list2;
    }

    public static pdr a(pdr pdrVar, boolean z, boolean z2, i4e i4eVar, List list, List list2, int i) {
        if ((i & 1) != 0) {
            z = pdrVar.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = pdrVar.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            i4eVar = pdrVar.c;
        }
        i4e i4eVar2 = i4eVar;
        if ((i & 8) != 0) {
            list = pdrVar.d;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = pdrVar.e;
        }
        pdrVar.getClass();
        return new pdr(z3, z4, i4eVar2, list3, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdr)) {
            return false;
        }
        pdr pdrVar = (pdr) obj;
        return this.a == pdrVar.a && this.b == pdrVar.b && Intrinsics.d(this.c, pdrVar.c) && Intrinsics.d(this.d, pdrVar.d) && Intrinsics.d(this.e, pdrVar.e);
    }

    public final int hashCode() {
        int e = k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        i4e i4eVar = this.c;
        return this.e.hashCode() + k5r.d((e + (i4eVar == null ? 0 : i4eVar.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(showDetails=");
        sb.append(this.a);
        sb.append(", hotReloadActive=");
        sb.append(this.b);
        sb.append(", hotReloadStatus=");
        sb.append(this.c);
        sb.append(", errors=");
        sb.append(this.d);
        sb.append(", warnings=");
        return eta.h(sb, this.e, ')');
    }
}
