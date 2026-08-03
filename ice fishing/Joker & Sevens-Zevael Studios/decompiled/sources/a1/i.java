package a1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f185a;

    /* renamed from: b, reason: collision with root package name */
    public final long f186b;

    /* renamed from: c, reason: collision with root package name */
    public final j f187c;

    /* renamed from: d, reason: collision with root package name */
    public final f8.c f188d;

    public i(int i10, long j3, j jVar, f8.c cVar) {
        this.f185a = i10;
        this.f186b = j3;
        this.f187c = jVar;
        this.f188d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f185a == iVar.f185a && this.f186b == iVar.f186b && this.f187c == iVar.f187c && pc.j.a(this.f188d, iVar.f188d);
    }

    public final int hashCode() {
        int hashCode = (this.f187c.hashCode() + a4.d.c(Integer.hashCode(this.f185a) * 31, 31, this.f186b)) * 31;
        f8.c cVar = this.f188d;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f185a + ", timestamp=" + this.f186b + ", type=" + this.f187c + ", structureCompat=" + this.f188d + ')';
    }
}
