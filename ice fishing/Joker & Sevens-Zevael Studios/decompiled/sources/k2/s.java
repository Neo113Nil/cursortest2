package k2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r f3620a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3621b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3622c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3623d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3624e;

    public s(r rVar, l lVar, int i10, int i11, Object obj) {
        this.f3620a = rVar;
        this.f3621b = lVar;
        this.f3622c = i10;
        this.f3623d = i11;
        this.f3624e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return pc.j.a(this.f3620a, sVar.f3620a) && pc.j.a(this.f3621b, sVar.f3621b) && this.f3622c == sVar.f3622c && this.f3623d == sVar.f3623d && pc.j.a(this.f3624e, sVar.f3624e);
    }

    public final int hashCode() {
        r rVar = this.f3620a;
        int b2 = v.f.b(this.f3623d, v.f.b(this.f3622c, (((rVar == null ? 0 : rVar.hashCode()) * 31) + this.f3621b.f3615g) * 31, 31), 31);
        Object obj = this.f3624e;
        return b2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f3620a);
        sb.append(", fontWeight=");
        sb.append(this.f3621b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i10 = this.f3622c;
        sb.append((Object) (i10 == 0 ? "Normal" : i10 == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i11 = this.f3623d;
        if (i11 == 0) {
            str = "None";
        } else if (i11 == 1) {
            str = "Weight";
        } else if (i11 == 2) {
            str = "Style";
        } else if (i11 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f3624e);
        sb.append(')');
        return sb.toString();
    }
}
