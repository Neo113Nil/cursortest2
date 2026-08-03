package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4071c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4072d;

    public m(float f10, float f11) {
        super(3);
        this.f4071c = f10;
        this.f4072d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f4071c, mVar.f4071c) == 0 && Float.compare(this.f4072d, mVar.f4072d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4072d) + (Float.hashCode(this.f4071c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f4071c);
        sb.append(", y=");
        return a4.d.k(sb, this.f4072d, ')');
    }
}
