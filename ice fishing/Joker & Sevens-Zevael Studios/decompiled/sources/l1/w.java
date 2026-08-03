package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4103c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4104d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4105e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4106f;

    public w(float f10, float f11, float f12, float f13) {
        super(1);
        this.f4103c = f10;
        this.f4104d = f11;
        this.f4105e = f12;
        this.f4106f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f4103c, wVar.f4103c) == 0 && Float.compare(this.f4104d, wVar.f4104d) == 0 && Float.compare(this.f4105e, wVar.f4105e) == 0 && Float.compare(this.f4106f, wVar.f4106f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4106f) + a4.d.b(this.f4105e, a4.d.b(this.f4104d, Float.hashCode(this.f4103c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f4103c);
        sb.append(", dy1=");
        sb.append(this.f4104d);
        sb.append(", dx2=");
        sb.append(this.f4105e);
        sb.append(", dy2=");
        return a4.d.k(sb, this.f4106f, ')');
    }
}
