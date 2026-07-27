package N6;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1951a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1952b;

    public a(int i, String str) {
        this.f1951a = i;
        this.f1952b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1951a == aVar.f1951a && this.f1952b.equals(aVar.f1952b);
    }

    public final int hashCode() {
        return this.f1952b.hashCode() ^ ((this.f1951a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoEnumInfo{enumNumber=");
        sb.append(this.f1951a);
        sb.append(", jsonName=");
        return u1.h.g(sb, this.f1952b, "}");
    }
}
