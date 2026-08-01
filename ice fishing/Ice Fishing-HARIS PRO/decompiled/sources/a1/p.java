package a1;

import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f1726a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1727b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1728c;

    public p(int i, String str, List list) {
        this.f1726a = i;
        this.f1727b = str;
        this.f1728c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f1726a == pVar.f1726a && this.f1727b.equals(pVar.f1727b) && this.f1728c.equals(pVar.f1728c);
    }

    public final int hashCode() {
        return this.f1728c.hashCode() + D1.h.b(this.f1727b, Integer.hashCode(this.f1726a) * 31, 31);
    }

    public final String toString() {
        return "Roadmap(id=" + this.f1726a + ", title=" + this.f1727b + ", steps=" + this.f1728c + ")";
    }
}
