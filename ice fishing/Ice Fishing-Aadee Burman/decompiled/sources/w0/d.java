package w0;

import Q7.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f41638a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41639b;

    /* renamed from: c, reason: collision with root package name */
    public final List f41640c;

    /* renamed from: d, reason: collision with root package name */
    public final List f41641d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public d(String str, List columns, List orders, boolean z3) {
        h.e(columns, "columns");
        h.e(orders, "orders");
        this.f41638a = str;
        this.f41639b = z3;
        this.f41640c = columns;
        this.f41641d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                orders.add("ASC");
            }
        }
        this.f41641d = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f41639b != dVar.f41639b || !h.a(this.f41640c, dVar.f41640c) || !h.a(this.f41641d, dVar.f41641d)) {
            return false;
        }
        String str = this.f41638a;
        boolean R8 = q.R(str, "index_");
        String str2 = dVar.f41638a;
        return R8 ? q.R(str2, "index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f41638a;
        return this.f41641d.hashCode() + ((this.f41640c.hashCode() + ((((q.R(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f41639b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f41638a + "', unique=" + this.f41639b + ", columns=" + this.f41640c + ", orders=" + this.f41641d + "'}";
    }
}
