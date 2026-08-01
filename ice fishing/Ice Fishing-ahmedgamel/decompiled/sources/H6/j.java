package H6;

import c6.n;

/* loaded from: classes2.dex */
public final class j extends c6.f {

    /* renamed from: x, reason: collision with root package name */
    public static final i f1246x;

    /* renamed from: v, reason: collision with root package name */
    public final String f1247v;

    /* renamed from: w, reason: collision with root package name */
    public final b f1248w;

    static {
        c6.d dVar = c6.d.f5578u;
        n nVar = n.f5618u;
        f1246x = new i(j.class);
    }

    public j(String str, b bVar, y8.h hVar) {
        super(f1246x, hVar);
        if (str == null) {
            throw new IllegalArgumentException("key == null");
        }
        this.f1247v = str;
        this.f1248w = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return a().equals(jVar.a()) && V2.a.i(this.f1247v, jVar.f1247v) && V2.a.i(this.f1248w, jVar.f1248w);
    }

    public final int hashCode() {
        int i = this.f5587u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f1247v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        b bVar = this.f1248w;
        int hashCode3 = hashCode2 + (bVar != null ? bVar.hashCode() : 0);
        this.f5587u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f1247v;
        if (str != null) {
            sb.append(", key=");
            sb.append(V2.a.t(str));
        }
        b bVar = this.f1248w;
        if (bVar != null) {
            sb.append(", value=");
            sb.append(bVar);
        }
        StringBuilder replace = sb.replace(0, 2, "KeyValue{");
        replace.append('}');
        return replace.toString();
    }
}
