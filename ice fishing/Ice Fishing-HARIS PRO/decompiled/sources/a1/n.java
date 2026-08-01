package a1;

import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f1720a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1721b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1722c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1723d;

    public n(int i, String str, String str2, List list) {
        this.f1720a = i;
        this.f1721b = str;
        this.f1722c = str2;
        this.f1723d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f1720a == nVar.f1720a && this.f1721b.equals(nVar.f1721b) && this.f1722c.equals(nVar.f1722c) && this.f1723d.equals(nVar.f1723d);
    }

    public final int hashCode() {
        return this.f1723d.hashCode() + D1.h.b(this.f1722c, D1.h.b(this.f1721b, Integer.hashCode(this.f1720a) * 31, 31), 31);
    }

    public final String toString() {
        return "Quiz(id=" + this.f1720a + ", title=" + this.f1721b + ", icon=" + this.f1722c + ", questions=" + this.f1723d + ")";
    }
}
