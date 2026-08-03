package uc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: j, reason: collision with root package name */
    public static final d f6742j = new d(1, 0, 1);

    @Override // uc.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f6735g == dVar.f6735g && this.f6736h == dVar.f6736h;
    }

    @Override // uc.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f6735g * 31) + this.f6736h;
    }

    @Override // uc.b
    public final boolean isEmpty() {
        return this.f6735g > this.f6736h;
    }

    @Override // uc.b
    public final String toString() {
        return this.f6735g + ".." + this.f6736h;
    }
}
