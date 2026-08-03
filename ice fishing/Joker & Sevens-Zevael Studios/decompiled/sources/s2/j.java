package s2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f6390e = new j(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f6391a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6393c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6394d;

    public j(int i10, int i11, int i12, int i13) {
        this.f6391a = i10;
        this.f6392b = i11;
        this.f6393c = i12;
        this.f6394d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f6391a == jVar.f6391a && this.f6392b == jVar.f6392b && this.f6393c == jVar.f6393c && this.f6394d == jVar.f6394d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6394d) + v.f.b(this.f6393c, v.f.b(this.f6392b, Integer.hashCode(this.f6391a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f6391a);
        sb.append(", ");
        sb.append(this.f6392b);
        sb.append(", ");
        sb.append(this.f6393c);
        sb.append(", ");
        return a4.d.l(sb, this.f6394d, ')');
    }
}
