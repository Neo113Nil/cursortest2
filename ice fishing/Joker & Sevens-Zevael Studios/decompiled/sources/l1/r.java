package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4085c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4086d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4087e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4088f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4089g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4090h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4091i;

    public r(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(3);
        this.f4085c = f10;
        this.f4086d = f11;
        this.f4087e = f12;
        this.f4088f = z10;
        this.f4089g = z11;
        this.f4090h = f13;
        this.f4091i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f4085c, rVar.f4085c) == 0 && Float.compare(this.f4086d, rVar.f4086d) == 0 && Float.compare(this.f4087e, rVar.f4087e) == 0 && this.f4088f == rVar.f4088f && this.f4089g == rVar.f4089g && Float.compare(this.f4090h, rVar.f4090h) == 0 && Float.compare(this.f4091i, rVar.f4091i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4091i) + a4.d.b(this.f4090h, a4.d.d(a4.d.d(a4.d.b(this.f4087e, a4.d.b(this.f4086d, Float.hashCode(this.f4085c) * 31, 31), 31), 31, this.f4088f), 31, this.f4089g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f4085c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f4086d);
        sb.append(", theta=");
        sb.append(this.f4087e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f4088f);
        sb.append(", isPositiveArc=");
        sb.append(this.f4089g);
        sb.append(", arcStartDx=");
        sb.append(this.f4090h);
        sb.append(", arcStartDy=");
        return a4.d.k(sb, this.f4091i, ')');
    }
}
