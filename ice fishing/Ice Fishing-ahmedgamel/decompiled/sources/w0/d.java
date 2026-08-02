package w0;

import Q7.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f41420a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41421b;

    /* renamed from: c, reason: collision with root package name */
    public final List f41422c;

    /* renamed from: d, reason: collision with root package name */
    public final List f41423d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public d(String str, List columns, List orders, boolean z6) {
        h.e(columns, "columns");
        h.e(orders, "orders");
        this.f41420a = str;
        this.f41421b = z6;
        this.f41422c = columns;
        this.f41423d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                orders.add("ASC");
            }
        }
        this.f41423d = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f41421b != dVar.f41421b || !h.a(this.f41422c, dVar.f41422c) || !h.a(this.f41423d, dVar.f41423d)) {
            return false;
        }
        String str = this.f41420a;
        boolean h02 = q.h0(str, "index_");
        String str2 = dVar.f41420a;
        return h02 ? q.h0(str2, "index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f41420a;
        return this.f41423d.hashCode() + ((this.f41422c.hashCode() + ((((q.h0(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f41421b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f41420a + "', unique=" + this.f41421b + ", columns=" + this.f41422c + ", orders=" + this.f41423d + "'}";
    }
}
