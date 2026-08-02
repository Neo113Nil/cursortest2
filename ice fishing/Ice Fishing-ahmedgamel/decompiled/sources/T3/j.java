package T3;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final r f3192a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3193b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3194c;

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
        return this.f3192a.equals(jVar.f3192a) && this.f3193b == jVar.f3193b && this.f3194c == jVar.f3194c;
    }

    public final int hashCode() {
        return ((((this.f3192a.hashCode() ^ 1000003) * 1000003) ^ this.f3193b) * 1000003) ^ this.f3194c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f3192a);
        sb.append(", type=");
        int i = this.f3193b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i4 = this.f3194c;
        if (i4 == 0) {
            str = L5.e.DIRECT_TAG;
        } else if (i4 == 1) {
            str = "provider";
        } else {
            if (i4 != 2) {
                throw new AssertionError(Wv.f(i4, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return Wv.i(sb, str, "}");
    }

    public j(r rVar, int i, int i4) {
        this.f3192a = rVar;
        this.f3193b = i;
        this.f3194c = i4;
    }
}
