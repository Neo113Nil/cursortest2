package N6;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2041a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2042b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2043c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2044d;

    public b(int i, String str, int i4, int i6) {
        this.f2041a = i;
        this.f2042b = i4;
        this.f2043c = i6;
        this.f2044d = str;
    }

    public static b a(int i, int i4, String str) {
        return new b(i, str, i4, d.b(i << 3));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2041a == bVar.f2041a && this.f2042b == bVar.f2042b && this.f2043c == bVar.f2043c && this.f2044d.equals(bVar.f2044d);
    }

    public final int hashCode() {
        return this.f2044d.hashCode() ^ ((((((this.f2041a ^ 1000003) * 1000003) ^ this.f2042b) * 1000003) ^ this.f2043c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoFieldInfo{fieldNumber=");
        sb.append(this.f2041a);
        sb.append(", tag=");
        sb.append(this.f2042b);
        sb.append(", tagSize=");
        sb.append(this.f2043c);
        sb.append(", jsonName=");
        return Wv.i(sb, this.f2044d, "}");
    }
}
