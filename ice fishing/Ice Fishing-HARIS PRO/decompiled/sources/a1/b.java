package a1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1675a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1676b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1677c;

    public b(String str, String str2, String str3) {
        this.f1675a = str;
        this.f1676b = str2;
        this.f1677c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return D1.i.a(this.f1675a, bVar.f1675a) && D1.i.a(this.f1676b, bVar.f1676b) && D1.i.a(this.f1677c, bVar.f1677c);
    }

    public final int hashCode() {
        return this.f1677c.hashCode() + D1.h.b(this.f1676b, this.f1675a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Benchmark(label=");
        sb.append(this.f1675a);
        sb.append(", value=");
        sb.append(this.f1676b);
        sb.append(", context=");
        return D1.h.h(sb, this.f1677c, ")");
    }
}
