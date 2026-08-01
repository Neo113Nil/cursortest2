package R3;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final r f2737a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2738b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2739c;

    public j(int i, int i6, Class cls) {
        this(r.a(cls), i, i6);
    }

    public static j a(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f2737a.equals(jVar.f2737a) && this.f2738b == jVar.f2738b && this.f2739c == jVar.f2739c;
    }

    public final int hashCode() {
        return ((((this.f2737a.hashCode() ^ 1000003) * 1000003) ^ this.f2738b) * 1000003) ^ this.f2739c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2737a);
        sb.append(", type=");
        int i = this.f2738b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i6 = this.f2739c;
        if (i6 == 0) {
            str = L5.e.DIRECT_TAG;
        } else if (i6 == 1) {
            str = "provider";
        } else {
            if (i6 != 2) {
                throw new AssertionError(AbstractC4404f.e(i6, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return u1.h.g(sb, str, "}");
    }

    public j(r rVar, int i, int i6) {
        this.f2737a = rVar;
        this.f2738b = i;
        this.f2739c = i6;
    }
}
