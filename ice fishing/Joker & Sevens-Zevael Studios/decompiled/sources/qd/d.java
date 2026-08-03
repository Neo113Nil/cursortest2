package qd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5832a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5833b;

    /* renamed from: c, reason: collision with root package name */
    public final e f5834c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5835d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5836e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5837f;

    public d(String str, String str2, e eVar, int i10, boolean z10, boolean z11) {
        this.f5832a = str;
        this.f5833b = str2;
        this.f5834c = eVar;
        this.f5835d = i10;
        this.f5836e = z10;
        this.f5837f = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5832a.equals(dVar.f5832a) && this.f5833b.equals(dVar.f5833b) && this.f5834c == dVar.f5834c && this.f5835d == dVar.f5835d && this.f5836e == dVar.f5836e && this.f5837f == dVar.f5837f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5837f) + a4.d.d(v.f.b(this.f5835d, (this.f5834c.hashCode() + ((this.f5833b.hashCode() + (this.f5832a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f5836e);
    }

    public final String toString() {
        return "CardSkin(id=" + this.f5832a + ", name=" + this.f5833b + ", skinType=" + this.f5834c + ", price=" + this.f5835d + ", isPurchased=" + this.f5836e + ", isActive=" + this.f5837f + ")";
    }
}
