package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4107c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4108d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4109e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4110f;

    public x(float f10, float f11, float f12, float f13) {
        super(2);
        this.f4107c = f10;
        this.f4108d = f11;
        this.f4109e = f12;
        this.f4110f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f4107c, xVar.f4107c) == 0 && Float.compare(this.f4108d, xVar.f4108d) == 0 && Float.compare(this.f4109e, xVar.f4109e) == 0 && Float.compare(this.f4110f, xVar.f4110f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4110f) + a4.d.b(this.f4109e, a4.d.b(this.f4108d, Float.hashCode(this.f4107c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f4107c);
        sb.append(", dy1=");
        sb.append(this.f4108d);
        sb.append(", dx2=");
        sb.append(this.f4109e);
        sb.append(", dy2=");
        return a4.d.k(sb, this.f4110f, ')');
    }
}
