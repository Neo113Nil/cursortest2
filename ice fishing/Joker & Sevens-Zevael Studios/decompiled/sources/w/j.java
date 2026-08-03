package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public f1.g f7442a = null;

    /* renamed from: b, reason: collision with root package name */
    public f1.b f7443b = null;

    /* renamed from: c, reason: collision with root package name */
    public h1.b f7444c = null;

    /* renamed from: d, reason: collision with root package name */
    public f1.i f7445d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return pc.j.a(this.f7442a, jVar.f7442a) && pc.j.a(this.f7443b, jVar.f7443b) && pc.j.a(this.f7444c, jVar.f7444c) && pc.j.a(this.f7445d, jVar.f7445d);
    }

    public final int hashCode() {
        f1.g gVar = this.f7442a;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        f1.b bVar = this.f7443b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        h1.b bVar2 = this.f7444c;
        int hashCode3 = (hashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        f1.i iVar = this.f7445d;
        return hashCode3 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f7442a + ", canvas=" + this.f7443b + ", canvasDrawScope=" + this.f7444c + ", borderPath=" + this.f7445d + ')';
    }
}
