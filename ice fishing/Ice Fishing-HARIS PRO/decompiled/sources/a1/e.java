package a1;

import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f1683a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1684b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1685c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1686d;

    public e(int i, String str, String str2, List list) {
        this.f1683a = i;
        this.f1684b = str;
        this.f1685c = str2;
        this.f1686d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1683a == eVar.f1683a && this.f1684b.equals(eVar.f1684b) && this.f1685c.equals(eVar.f1685c) && this.f1686d.equals(eVar.f1686d);
    }

    public final int hashCode() {
        return this.f1686d.hashCode() + D1.h.b(this.f1685c, D1.h.b(this.f1684b, Integer.hashCode(this.f1683a) * 31, 31), 31);
    }

    public final String toString() {
        return "Checklist(id=" + this.f1683a + ", title=" + this.f1684b + ", icon=" + this.f1685c + ", items=" + this.f1686d + ")";
    }
}
