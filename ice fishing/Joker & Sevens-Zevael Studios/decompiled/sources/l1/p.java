package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4079c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4080d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4081e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4082f;

    public p(float f10, float f11, float f12, float f13) {
        super(2);
        this.f4079c = f10;
        this.f4080d = f11;
        this.f4081e = f12;
        this.f4082f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f4079c, pVar.f4079c) == 0 && Float.compare(this.f4080d, pVar.f4080d) == 0 && Float.compare(this.f4081e, pVar.f4081e) == 0 && Float.compare(this.f4082f, pVar.f4082f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4082f) + a4.d.b(this.f4081e, a4.d.b(this.f4080d, Float.hashCode(this.f4079c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f4079c);
        sb.append(", y1=");
        sb.append(this.f4080d);
        sb.append(", x2=");
        sb.append(this.f4081e);
        sb.append(", y2=");
        return a4.d.k(sb, this.f4082f, ')');
    }
}
