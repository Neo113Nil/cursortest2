package x4;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f8299a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8300b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8301c;

    public g(String str, int i10, int i11) {
        pc.j.e(str, "workSpecId");
        this.f8299a = str;
        this.f8300b = i10;
        this.f8301c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return pc.j.a(this.f8299a, gVar.f8299a) && this.f8300b == gVar.f8300b && this.f8301c == gVar.f8301c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8301c) + v.f.b(this.f8300b, this.f8299a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f8299a);
        sb.append(", generation=");
        sb.append(this.f8300b);
        sb.append(", systemId=");
        return a4.d.l(sb, this.f8301c, ')');
    }
}
