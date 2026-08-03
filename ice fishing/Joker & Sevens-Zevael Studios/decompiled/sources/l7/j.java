package l7;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final r f4236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4237b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4238c;

    public j(int i10, int i11, Class cls) {
        this(r.a(cls), i10, i11);
    }

    public static j a(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f4236a.equals(jVar.f4236a) && this.f4237b == jVar.f4237b && this.f4238c == jVar.f4238c;
    }

    public final int hashCode() {
        return ((((this.f4236a.hashCode() ^ 1000003) * 1000003) ^ this.f4237b) * 1000003) ^ this.f4238c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f4236a);
        sb.append(", type=");
        int i10 = this.f4237b;
        sb.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i11 = this.f4238c;
        if (i11 == 0) {
            str = bb.e.DIRECT_TAG;
        } else if (i11 == 1) {
            str = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(a4.d.g("Unsupported injection: ", i11));
            }
            str = "deferred";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public j(r rVar, int i10, int i11) {
        this.f4236a = rVar;
        this.f4237b = i10;
        this.f4238c = i11;
    }
}
