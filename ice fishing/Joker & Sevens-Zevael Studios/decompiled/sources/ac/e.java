package ac;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: h, reason: collision with root package name */
    public static final e f267h = new e();

    /* renamed from: g, reason: collision with root package name */
    public final int f268g = 131093;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        pc.j.e(eVar, "other");
        return this.f268g - eVar.f268g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.f268g == eVar.f268g;
    }

    public final int hashCode() {
        return this.f268g;
    }

    public final String toString() {
        return "2.0.21";
    }
}
