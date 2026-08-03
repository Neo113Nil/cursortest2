package b0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f831a;

    /* renamed from: b, reason: collision with root package name */
    public final int f832b;

    public i(int i10, int i11) {
        this.f831a = i10;
        this.f832b = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException("negative start index");
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f831a == iVar.f831a && this.f832b == iVar.f832b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f832b) + (Integer.hashCode(this.f831a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f831a);
        sb.append(", end=");
        return a4.d.l(sb, this.f832b, ')');
    }
}
