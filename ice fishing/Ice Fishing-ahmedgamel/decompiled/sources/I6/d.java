package I6;

import c6.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends c6.f {

    /* renamed from: y, reason: collision with root package name */
    public static final c f1356y;

    /* renamed from: v, reason: collision with root package name */
    public final J6.b f1357v;

    /* renamed from: w, reason: collision with root package name */
    public final List f1358w;

    /* renamed from: x, reason: collision with root package name */
    public final String f1359x;

    static {
        c6.d dVar = c6.d.f5754u;
        n nVar = n.f5794u;
        f1356y = new c(d.class);
    }

    public d(J6.b bVar, d6.d dVar, String str, y8.h hVar) {
        super(f1356y, hVar);
        this.f1357v = bVar;
        this.f1358w = A8.b.m("scope_logs", dVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f1359x = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return a().equals(dVar.a()) && A8.b.i(this.f1357v, dVar.f1357v) && this.f1358w.equals(dVar.f1358w) && A8.b.i(this.f1359x, dVar.f1359x);
    }

    public final int hashCode() {
        int i = this.f5763u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        J6.b bVar = this.f1357v;
        int hashCode2 = (this.f1358w.hashCode() + ((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 37)) * 37;
        String str = this.f1359x;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f5763u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        J6.b bVar = this.f1357v;
        if (bVar != null) {
            sb.append(", resource=");
            sb.append(bVar);
        }
        List list = this.f1358w;
        if (!list.isEmpty()) {
            sb.append(", scope_logs=");
            sb.append(list);
        }
        String str = this.f1359x;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(A8.b.u(str));
        }
        StringBuilder replace = sb.replace(0, 2, "ResourceLogs{");
        replace.append('}');
        return replace.toString();
    }
}
