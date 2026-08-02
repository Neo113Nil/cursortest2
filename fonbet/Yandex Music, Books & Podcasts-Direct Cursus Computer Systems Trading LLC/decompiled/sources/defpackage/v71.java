package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v71 {
    public final b81 a;
    public final List b;
    public final boolean c;

    public v71(b81 b81Var, List list, boolean z) {
        b81Var.getClass();
        list.getClass();
        this.a = b81Var;
        this.b = list;
        this.c = z;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((e81) it.next()).a == this.a) {
                    return;
                }
            }
        }
        su4.s(2, null, "Selected familiar tab not found in items", null);
    }

    public static v71 a(v71 v71Var, b81 b81Var, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            b81Var = v71Var.a;
        }
        if ((i & 2) != 0) {
            list = v71Var.b;
        }
        if ((i & 4) != 0) {
            z = v71Var.c;
        }
        v71Var.getClass();
        b81Var.getClass();
        list.getClass();
        return new v71(b81Var, list, z);
    }

    public final int b() {
        Iterator it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((e81) it.next()).a == this.a) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final e81 c() {
        for (e81 e81Var : this.b) {
            if (e81Var.a == this.a) {
                return e81Var;
            }
        }
        wvs.h("Collection contains no element matching the predicate.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v71)) {
            return false;
        }
        v71 v71Var = (v71) obj;
        return this.a == v71Var.a && Intrinsics.d(this.b, v71Var.b) && this.c == v71Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistFamiliarScreenState(selectedTab=");
        sb.append(this.a);
        sb.append(", familiarTabStates=");
        sb.append(this.b);
        sb.append(", isRefreshing=");
        return ouj.r(sb, this.c, ")");
    }
}
