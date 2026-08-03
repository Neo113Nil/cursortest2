package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4073c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4074d;

    public n(float f10, float f11) {
        super(3);
        this.f4073c = f10;
        this.f4074d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f4073c, nVar.f4073c) == 0 && Float.compare(this.f4074d, nVar.f4074d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4074d) + (Float.hashCode(this.f4073c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f4073c);
        sb.append(", y=");
        return a4.d.k(sb, this.f4074d, ')');
    }
}
