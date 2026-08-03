package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4050c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4051d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4052e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4053f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4054g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4055h;

    public k(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f4050c = f10;
        this.f4051d = f11;
        this.f4052e = f12;
        this.f4053f = f13;
        this.f4054g = f14;
        this.f4055h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f4050c, kVar.f4050c) == 0 && Float.compare(this.f4051d, kVar.f4051d) == 0 && Float.compare(this.f4052e, kVar.f4052e) == 0 && Float.compare(this.f4053f, kVar.f4053f) == 0 && Float.compare(this.f4054g, kVar.f4054g) == 0 && Float.compare(this.f4055h, kVar.f4055h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4055h) + a4.d.b(this.f4054g, a4.d.b(this.f4053f, a4.d.b(this.f4052e, a4.d.b(this.f4051d, Float.hashCode(this.f4050c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f4050c);
        sb.append(", y1=");
        sb.append(this.f4051d);
        sb.append(", x2=");
        sb.append(this.f4052e);
        sb.append(", y2=");
        sb.append(this.f4053f);
        sb.append(", x3=");
        sb.append(this.f4054g);
        sb.append(", y3=");
        return a4.d.k(sb, this.f4055h, ')');
    }
}
