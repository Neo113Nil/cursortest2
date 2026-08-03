package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4111c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4112d;

    public y(float f10, float f11) {
        super(1);
        this.f4111c = f10;
        this.f4112d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f4111c, yVar.f4111c) == 0 && Float.compare(this.f4112d, yVar.f4112d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4112d) + (Float.hashCode(this.f4111c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f4111c);
        sb.append(", dy=");
        return a4.d.k(sb, this.f4112d, ')');
    }
}
