package J6;

import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1398a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1399b;

    public a(int i, String str) {
        this.f1398a = i;
        this.f1399b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1398a == aVar.f1398a && this.f1399b.equals(aVar.f1399b);
    }

    public final int hashCode() {
        return this.f1399b.hashCode() ^ ((this.f1398a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoEnumInfo{enumNumber=");
        sb.append(this.f1398a);
        sb.append(", jsonName=");
        return AbstractC5051n.g(sb, this.f1399b, "}");
    }
}
