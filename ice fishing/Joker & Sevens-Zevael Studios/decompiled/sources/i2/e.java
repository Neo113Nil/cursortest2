package i2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f3119a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3120b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3121c;

    public e(int i10, int i11, boolean z10) {
        this.f3119a = i10;
        this.f3120b = i11;
        this.f3121c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3119a == eVar.f3119a && this.f3120b == eVar.f3120b && this.f3121c == eVar.f3121c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3121c) + v.f.b(this.f3120b, Integer.hashCode(this.f3119a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f3119a + ", end=" + this.f3120b + ", isRtl=" + this.f3121c + ')';
    }
}
