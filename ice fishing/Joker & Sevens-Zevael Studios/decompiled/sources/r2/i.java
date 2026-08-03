package r2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f6025c = new i(17, f.f6021c);

    /* renamed from: a, reason: collision with root package name */
    public final float f6026a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6027b;

    public i(int i10, float f10) {
        this.f6026a = f10;
        this.f6027b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f10 = iVar.f6026a;
        float f11 = f.f6020b;
        return Float.compare(this.f6026a, f10) == 0 && this.f6027b == iVar.f6027b;
    }

    public final int hashCode() {
        float f10 = f.f6020b;
        return Integer.hashCode(0) + v.f.b(this.f6027b, Float.hashCode(this.f6026a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) f.b(this.f6026a));
        sb.append(", trim=");
        int i10 = this.f6027b;
        sb.append((Object) (i10 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i10 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i10 == 17 ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
