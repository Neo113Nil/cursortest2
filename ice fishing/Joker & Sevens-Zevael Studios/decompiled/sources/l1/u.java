package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4099c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4100d;

    public u(float f10, float f11) {
        super(3);
        this.f4099c = f10;
        this.f4100d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f4099c, uVar.f4099c) == 0 && Float.compare(this.f4100d, uVar.f4100d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4100d) + (Float.hashCode(this.f4099c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f4099c);
        sb.append(", dy=");
        return a4.d.k(sb, this.f4100d, ')');
    }
}
