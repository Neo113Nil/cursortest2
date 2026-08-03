package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4075c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4076d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4077e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4078f;

    public o(float f10, float f11, float f12, float f13) {
        super(1);
        this.f4075c = f10;
        this.f4076d = f11;
        this.f4077e = f12;
        this.f4078f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f4075c, oVar.f4075c) == 0 && Float.compare(this.f4076d, oVar.f4076d) == 0 && Float.compare(this.f4077e, oVar.f4077e) == 0 && Float.compare(this.f4078f, oVar.f4078f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4078f) + a4.d.b(this.f4077e, a4.d.b(this.f4076d, Float.hashCode(this.f4075c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f4075c);
        sb.append(", y1=");
        sb.append(this.f4076d);
        sb.append(", x2=");
        sb.append(this.f4077e);
        sb.append(", y2=");
        return a4.d.k(sb, this.f4078f, ')');
    }
}
