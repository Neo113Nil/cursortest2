package N6;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2039a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2040b;

    public a(int i, String str) {
        this.f2039a = i;
        this.f2040b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2039a == aVar.f2039a && this.f2040b.equals(aVar.f2040b);
    }

    public final int hashCode() {
        return this.f2040b.hashCode() ^ ((this.f2039a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoEnumInfo{enumNumber=");
        sb.append(this.f2039a);
        sb.append(", jsonName=");
        return Wv.i(sb, this.f2040b, "}");
    }
}
