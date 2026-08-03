package s2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: g, reason: collision with root package name */
    public final float f6382g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6383h;

    public d(float f10, float f11) {
        this.f6382g = f10;
        this.f6383h = f11;
    }

    @Override // s2.c
    public final float c() {
        return this.f6382g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f6382g, dVar.f6382g) == 0 && Float.compare(this.f6383h, dVar.f6383h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6383h) + (Float.hashCode(this.f6382g) * 31);
    }

    @Override // s2.c
    public final float m() {
        return this.f6383h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f6382g);
        sb.append(", fontScale=");
        return a4.d.k(sb, this.f6383h, ')');
    }
}
