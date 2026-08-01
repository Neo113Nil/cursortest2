package I6;

import c6.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends c6.f {

    /* renamed from: y, reason: collision with root package name */
    public static final c f1326y;

    /* renamed from: v, reason: collision with root package name */
    public final J6.b f1327v;

    /* renamed from: w, reason: collision with root package name */
    public final List f1328w;

    /* renamed from: x, reason: collision with root package name */
    public final String f1329x;

    static {
        c6.d dVar = c6.d.f5578u;
        n nVar = n.f5618u;
        f1326y = new c(d.class);
    }

    public d(J6.b bVar, d6.d dVar, String str, y8.h hVar) {
        super(f1326y, hVar);
        this.f1327v = bVar;
        this.f1328w = V2.a.o("scope_logs", dVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f1329x = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return a().equals(dVar.a()) && V2.a.i(this.f1327v, dVar.f1327v) && this.f1328w.equals(dVar.f1328w) && V2.a.i(this.f1329x, dVar.f1329x);
    }

    public final int hashCode() {
        int i = this.f5587u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        J6.b bVar = this.f1327v;
        int hashCode2 = (this.f1328w.hashCode() + ((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 37)) * 37;
        String str = this.f1329x;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f5587u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        J6.b bVar = this.f1327v;
        if (bVar != null) {
            sb.append(", resource=");
            sb.append(bVar);
        }
        List list = this.f1328w;
        if (!list.isEmpty()) {
            sb.append(", scope_logs=");
            sb.append(list);
        }
        String str = this.f1329x;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(V2.a.t(str));
        }
        StringBuilder replace = sb.replace(0, 2, "ResourceLogs{");
        replace.append('}');
        return replace.toString();
    }
}
