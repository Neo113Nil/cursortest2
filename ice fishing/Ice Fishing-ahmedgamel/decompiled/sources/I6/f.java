package I6;

import c6.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class f extends c6.f {

    /* renamed from: y, reason: collision with root package name */
    public static final e f1360y;

    /* renamed from: v, reason: collision with root package name */
    public final H6.h f1361v;

    /* renamed from: w, reason: collision with root package name */
    public final List f1362w;

    /* renamed from: x, reason: collision with root package name */
    public final String f1363x;

    static {
        c6.d dVar = c6.d.f5754u;
        n nVar = n.f5794u;
        f1360y = new e(f.class);
    }

    public f(H6.h hVar, d6.d dVar, String str, y8.h hVar2) {
        super(f1360y, hVar2);
        this.f1361v = hVar;
        this.f1362w = A8.b.m("log_records", dVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f1363x = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a().equals(fVar.a()) && A8.b.i(this.f1361v, fVar.f1361v) && this.f1362w.equals(fVar.f1362w) && A8.b.i(this.f1363x, fVar.f1363x);
    }

    public final int hashCode() {
        int i = this.f5763u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        H6.h hVar = this.f1361v;
        int hashCode2 = (this.f1362w.hashCode() + ((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 37)) * 37;
        String str = this.f1363x;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f5763u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        H6.h hVar = this.f1361v;
        if (hVar != null) {
            sb.append(", scope=");
            sb.append(hVar);
        }
        List list = this.f1362w;
        if (!list.isEmpty()) {
            sb.append(", log_records=");
            sb.append(list);
        }
        String str = this.f1363x;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(A8.b.u(str));
        }
        StringBuilder replace = sb.replace(0, 2, "ScopeLogs{");
        replace.append('}');
        return replace.toString();
    }
}
