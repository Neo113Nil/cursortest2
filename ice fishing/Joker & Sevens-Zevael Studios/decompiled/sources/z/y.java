package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f9042a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9043b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9044c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9045d;

    public y(int i10, int i11, int i12, int i13) {
        this.f9042a = i10;
        this.f9043b = i11;
        this.f9044c = i12;
        this.f9045d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f9042a == yVar.f9042a && this.f9043b == yVar.f9043b && this.f9044c == yVar.f9044c && this.f9045d == yVar.f9045d;
    }

    public final int hashCode() {
        return (((((this.f9042a * 31) + this.f9043b) * 31) + this.f9044c) * 31) + this.f9045d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f9042a);
        sb.append(", top=");
        sb.append(this.f9043b);
        sb.append(", right=");
        sb.append(this.f9044c);
        sb.append(", bottom=");
        return a4.d.l(sb, this.f9045d, ')');
    }
}
