package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c81 extends e81 {
    public final List b;
    public final List c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c81(List list, List list2, boolean z) {
        super(b81.Collection);
        list.getClass();
        list2.getClass();
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static c81 a(c81 c81Var, ArrayList arrayList, ArrayList arrayList2, int i) {
        ArrayList arrayList3 = arrayList;
        if ((i & 1) != 0) {
            arrayList3 = c81Var.b;
        }
        ArrayList arrayList4 = arrayList2;
        if ((i & 2) != 0) {
            arrayList4 = c81Var.c;
        }
        c81Var.getClass();
        arrayList3.getClass();
        arrayList4.getClass();
        return new c81(arrayList3, arrayList4, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c81)) {
            return false;
        }
        c81 c81Var = (c81) obj;
        return Intrinsics.d(this.b, c81Var.b) && Intrinsics.d(this.c, c81Var.c) && this.d == c81Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.d(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionFamiliarTabState(tracks=");
        sb.append(this.b);
        sb.append(", albums=");
        sb.append(this.c);
        sb.append(", isLoading=");
        return ouj.r(sb, this.d, ")");
    }
}
