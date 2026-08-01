package a1;

import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f1680a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1681b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1682c;

    public d(int i, String str, List list) {
        this.f1680a = i;
        this.f1681b = str;
        this.f1682c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1680a == dVar.f1680a && this.f1681b.equals(dVar.f1681b) && this.f1682c.equals(dVar.f1682c);
    }

    public final int hashCode() {
        return this.f1682c.hashCode() + D1.h.b(this.f1681b, Integer.hashCode(this.f1680a) * 31, 31);
    }

    public final String toString() {
        return "CalculatorType(id=" + this.f1680a + ", title=" + this.f1681b + ", fields=" + this.f1682c + ")";
    }
}
