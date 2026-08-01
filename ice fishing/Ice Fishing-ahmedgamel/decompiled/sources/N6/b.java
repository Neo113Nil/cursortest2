package N6;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1953a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1954b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1955c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1956d;

    public b(int i, String str, int i6, int i9) {
        this.f1953a = i;
        this.f1954b = i6;
        this.f1955c = i9;
        this.f1956d = str;
    }

    public static b a(int i, int i6, String str) {
        return new b(i, str, i6, d.b(i << 3));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1953a == bVar.f1953a && this.f1954b == bVar.f1954b && this.f1955c == bVar.f1955c && this.f1956d.equals(bVar.f1956d);
    }

    public final int hashCode() {
        return this.f1956d.hashCode() ^ ((((((this.f1953a ^ 1000003) * 1000003) ^ this.f1954b) * 1000003) ^ this.f1955c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoFieldInfo{fieldNumber=");
        sb.append(this.f1953a);
        sb.append(", tag=");
        sb.append(this.f1954b);
        sb.append(", tagSize=");
        sb.append(this.f1955c);
        sb.append(", jsonName=");
        return u1.h.g(sb, this.f1956d, "}");
    }
}
