package qd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f5830a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5831b;

    public c(float f10, float f11) {
        this.f5830a = f10;
        this.f5831b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f5830a, cVar.f5830a) == 0 && Float.compare(this.f5831b, cVar.f5831b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5831b) + (Float.hashCode(this.f5830a) * 31);
    }

    public final String toString() {
        return "CardPosition(x=" + this.f5830a + ", y=" + this.f5831b + ")";
    }
}
