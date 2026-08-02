package H6;

import c6.n;

/* loaded from: classes2.dex */
public final class j extends c6.f {

    /* renamed from: x, reason: collision with root package name */
    public static final i f1271x;

    /* renamed from: v, reason: collision with root package name */
    public final String f1272v;

    /* renamed from: w, reason: collision with root package name */
    public final b f1273w;

    static {
        c6.d dVar = c6.d.f5754u;
        n nVar = n.f5794u;
        f1271x = new i(j.class);
    }

    public j(String str, b bVar, y8.h hVar) {
        super(f1271x, hVar);
        if (str == null) {
            throw new IllegalArgumentException("key == null");
        }
        this.f1272v = str;
        this.f1273w = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return a().equals(jVar.a()) && A8.b.i(this.f1272v, jVar.f1272v) && A8.b.i(this.f1273w, jVar.f1273w);
    }

    public final int hashCode() {
        int i = this.f5763u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f1272v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        b bVar = this.f1273w;
        int hashCode3 = hashCode2 + (bVar != null ? bVar.hashCode() : 0);
        this.f5763u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f1272v;
        if (str != null) {
            sb.append(", key=");
            sb.append(A8.b.u(str));
        }
        b bVar = this.f1273w;
        if (bVar != null) {
            sb.append(", value=");
            sb.append(bVar);
        }
        StringBuilder replace = sb.replace(0, 2, "KeyValue{");
        replace.append('}');
        return replace.toString();
    }
}
