package nd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f5107a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5108b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5109c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5110d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5111e;

    public o(String str, String str2, String str3, long j3, long j6) {
        this.f5107a = str;
        this.f5108b = str2;
        this.f5109c = str3;
        this.f5110d = j3;
        this.f5111e = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return pc.j.a(this.f5107a, oVar.f5107a) && pc.j.a(this.f5108b, oVar.f5108b) && pc.j.a(this.f5109c, oVar.f5109c) && this.f5110d == oVar.f5110d && this.f5111e == oVar.f5111e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5111e) + a4.d.c((this.f5109c.hashCode() + ((this.f5108b.hashCode() + (this.f5107a.hashCode() * 31)) * 31)) * 31, 31, this.f5110d);
    }

    public final String toString() {
        return "Power_ups(id=" + this.f5107a + ", name=" + this.f5108b + ", description=" + this.f5109c + ", price=" + this.f5110d + ", quantity=" + this.f5111e + ")";
    }
}
