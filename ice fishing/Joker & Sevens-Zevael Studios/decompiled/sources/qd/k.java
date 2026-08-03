package qd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final l f5865a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5866b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5867c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5868d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5869e;

    public k(l lVar, String str, String str2, int i10, int i11) {
        this.f5865a = lVar;
        this.f5866b = str;
        this.f5867c = str2;
        this.f5868d = i10;
        this.f5869e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f5865a == kVar.f5865a && pc.j.a(this.f5866b, kVar.f5866b) && pc.j.a(this.f5867c, kVar.f5867c) && this.f5868d == kVar.f5868d && this.f5869e == kVar.f5869e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5869e) + v.f.b(this.f5868d, (this.f5867c.hashCode() + ((this.f5866b.hashCode() + (this.f5865a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "PowerUp(id=" + this.f5865a + ", name=" + this.f5866b + ", description=" + this.f5867c + ", price=" + this.f5868d + ", quantity=" + this.f5869e + ")";
    }
}
