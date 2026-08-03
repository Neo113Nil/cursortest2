package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4101c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4102d;

    public v(float f10, float f11) {
        super(3);
        this.f4101c = f10;
        this.f4102d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f4101c, vVar.f4101c) == 0 && Float.compare(this.f4102d, vVar.f4102d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4102d) + (Float.hashCode(this.f4101c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f4101c);
        sb.append(", dy=");
        return a4.d.k(sb, this.f4102d, ')');
    }
}
