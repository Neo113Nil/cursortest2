package d4;

import java.util.ArrayList;
import java.util.List;
import pc.j;
import xc.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1671a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1672b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1673c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1674d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public d(String str, boolean z10, List list, List list2) {
        j.e(list, "columns");
        j.e(list2, "orders");
        this.f1671a = str;
        this.f1672b = z10;
        this.f1673c = list;
        this.f1674d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                list2.add("ASC");
            }
        }
        this.f1674d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = dVar.f1671a;
        if (this.f1672b != dVar.f1672b || !j.a(this.f1673c, dVar.f1673c) || !j.a(this.f1674d, dVar.f1674d)) {
            return false;
        }
        String str2 = this.f1671a;
        return h.x(str2, "index_") ? h.x(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f1671a;
        return this.f1674d.hashCode() + ((this.f1673c.hashCode() + ((((h.x(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f1672b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f1671a + "', unique=" + this.f1672b + ", columns=" + this.f1673c + ", orders=" + this.f1674d + "'}";
    }
}
