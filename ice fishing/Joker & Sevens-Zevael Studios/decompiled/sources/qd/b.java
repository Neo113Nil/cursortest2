package qd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5823a;

    /* renamed from: b, reason: collision with root package name */
    public final f f5824b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5825c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5826d;

    /* renamed from: e, reason: collision with root package name */
    public final c f5827e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5828f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5829g;

    public b(String str, f fVar, String str2, int i10, c cVar, long j3, long j6) {
        pc.j.e(str, "id");
        pc.j.e(str2, "value");
        this.f5823a = str;
        this.f5824b = fVar;
        this.f5825c = str2;
        this.f5826d = i10;
        this.f5827e = cVar;
        this.f5828f = j3;
        this.f5829g = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return pc.j.a(this.f5823a, bVar.f5823a) && this.f5824b == bVar.f5824b && pc.j.a(this.f5825c, bVar.f5825c) && this.f5826d == bVar.f5826d && pc.j.a(this.f5827e, bVar.f5827e) && this.f5828f == bVar.f5828f && this.f5829g == bVar.f5829g;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5829g) + a4.d.c((this.f5827e.hashCode() + v.f.b(this.f5826d, (this.f5825c.hashCode() + ((this.f5824b.hashCode() + (this.f5823a.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31, this.f5828f);
    }

    public final String toString() {
        return "Card(id=" + this.f5823a + ", type=" + this.f5824b + ", value=" + this.f5825c + ", imageRes=" + this.f5826d + ", position=" + this.f5827e + ", appearTime=" + this.f5828f + ", disappearTime=" + this.f5829g + ")";
    }
}
