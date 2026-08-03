package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4092c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4093d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4094e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4095f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4096g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4097h;

    public s(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f4092c = f10;
        this.f4093d = f11;
        this.f4094e = f12;
        this.f4095f = f13;
        this.f4096g = f14;
        this.f4097h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f4092c, sVar.f4092c) == 0 && Float.compare(this.f4093d, sVar.f4093d) == 0 && Float.compare(this.f4094e, sVar.f4094e) == 0 && Float.compare(this.f4095f, sVar.f4095f) == 0 && Float.compare(this.f4096g, sVar.f4096g) == 0 && Float.compare(this.f4097h, sVar.f4097h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4097h) + a4.d.b(this.f4096g, a4.d.b(this.f4095f, a4.d.b(this.f4094e, a4.d.b(this.f4093d, Float.hashCode(this.f4092c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f4092c);
        sb.append(", dy1=");
        sb.append(this.f4093d);
        sb.append(", dx2=");
        sb.append(this.f4094e);
        sb.append(", dy2=");
        sb.append(this.f4095f);
        sb.append(", dx3=");
        sb.append(this.f4096g);
        sb.append(", dy3=");
        return a4.d.k(sb, this.f4097h, ')');
    }
}
