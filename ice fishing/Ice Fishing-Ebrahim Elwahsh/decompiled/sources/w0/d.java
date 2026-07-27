package w0;

import M7.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f41576a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41577b;

    /* renamed from: c, reason: collision with root package name */
    public final List f41578c;

    /* renamed from: d, reason: collision with root package name */
    public final List f41579d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public d(String str, List columns, List orders, boolean z8) {
        h.e(columns, "columns");
        h.e(orders, "orders");
        this.f41576a = str;
        this.f41577b = z8;
        this.f41578c = columns;
        this.f41579d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                orders.add("ASC");
            }
        }
        this.f41579d = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f41577b != dVar.f41577b || !h.a(this.f41578c, dVar.f41578c) || !h.a(this.f41579d, dVar.f41579d)) {
            return false;
        }
        String str = this.f41576a;
        boolean I2 = q.I(str, "index_");
        String str2 = dVar.f41576a;
        return I2 ? q.I(str2, "index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f41576a;
        return this.f41579d.hashCode() + ((this.f41578c.hashCode() + ((((q.I(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f41577b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f41576a + "', unique=" + this.f41577b + ", columns=" + this.f41578c + ", orders=" + this.f41579d + "'}";
    }
}
