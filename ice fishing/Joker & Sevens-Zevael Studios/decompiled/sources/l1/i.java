package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4035c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4036d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4037e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4038f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4039g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4040h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4041i;

    public i(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(3);
        this.f4035c = f10;
        this.f4036d = f11;
        this.f4037e = f12;
        this.f4038f = z10;
        this.f4039g = z11;
        this.f4040h = f13;
        this.f4041i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f4035c, iVar.f4035c) == 0 && Float.compare(this.f4036d, iVar.f4036d) == 0 && Float.compare(this.f4037e, iVar.f4037e) == 0 && this.f4038f == iVar.f4038f && this.f4039g == iVar.f4039g && Float.compare(this.f4040h, iVar.f4040h) == 0 && Float.compare(this.f4041i, iVar.f4041i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4041i) + a4.d.b(this.f4040h, a4.d.d(a4.d.d(a4.d.b(this.f4037e, a4.d.b(this.f4036d, Float.hashCode(this.f4035c) * 31, 31), 31), 31, this.f4038f), 31, this.f4039g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f4035c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f4036d);
        sb.append(", theta=");
        sb.append(this.f4037e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f4038f);
        sb.append(", isPositiveArc=");
        sb.append(this.f4039g);
        sb.append(", arcStartX=");
        sb.append(this.f4040h);
        sb.append(", arcStartY=");
        return a4.d.k(sb, this.f4041i, ')');
    }
}
