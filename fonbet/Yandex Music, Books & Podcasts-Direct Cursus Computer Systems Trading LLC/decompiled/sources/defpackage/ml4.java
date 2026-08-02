package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ml4 {
    public final o3k a;
    public final int b;

    public ml4(fp7 fp7Var, int i) {
        fp7Var.getClass();
        this.a = fp7Var;
        this.b = i;
    }

    public final int a() {
        return this.a.j() % this.b;
    }

    public final ArrayList b() {
        List list = this.a.l().a;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((nfh) it.next()).a % this.b));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml4)) {
            return false;
        }
        ml4 ml4Var = (ml4) obj;
        return Intrinsics.d(this.a, ml4Var.a) && this.b == ml4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CircularPagerState(pagerState=" + this.a + ", pageCount=" + this.b + ")";
    }
}
