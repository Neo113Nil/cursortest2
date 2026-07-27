package N3;

import com.google.android.gms.internal.ads.CL;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final r f2177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2178b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2179c;

    public j(int i, int i4, Class cls) {
        this(r.a(cls), i, i4);
    }

    public static j a(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f2177a.equals(jVar.f2177a) && this.f2178b == jVar.f2178b && this.f2179c == jVar.f2179c;
    }

    public final int hashCode() {
        return ((((this.f2177a.hashCode() ^ 1000003) * 1000003) ^ this.f2178b) * 1000003) ^ this.f2179c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2177a);
        sb.append(", type=");
        int i = this.f2178b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i4 = this.f2179c;
        if (i4 == 0) {
            str = H5.e.DIRECT_TAG;
        } else if (i4 == 1) {
            str = "provider";
        } else {
            if (i4 != 2) {
                throw new AssertionError(CL.i(i4, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return AbstractC5051n.g(sb, str, "}");
    }

    public j(r rVar, int i, int i4) {
        this.f2177a = rVar;
        this.f2178b = i;
        this.f2179c = i4;
    }
}
