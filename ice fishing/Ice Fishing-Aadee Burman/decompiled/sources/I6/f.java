package I6;

import c6.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class f extends c6.f {

    /* renamed from: y, reason: collision with root package name */
    public static final e f1330y;

    /* renamed from: v, reason: collision with root package name */
    public final H6.h f1331v;

    /* renamed from: w, reason: collision with root package name */
    public final List f1332w;

    /* renamed from: x, reason: collision with root package name */
    public final String f1333x;

    static {
        c6.d dVar = c6.d.f5578u;
        n nVar = n.f5618u;
        f1330y = new e(f.class);
    }

    public f(H6.h hVar, d6.d dVar, String str, y8.h hVar2) {
        super(f1330y, hVar2);
        this.f1331v = hVar;
        this.f1332w = V2.a.o("log_records", dVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f1333x = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a().equals(fVar.a()) && V2.a.i(this.f1331v, fVar.f1331v) && this.f1332w.equals(fVar.f1332w) && V2.a.i(this.f1333x, fVar.f1333x);
    }

    public final int hashCode() {
        int i = this.f5587u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        H6.h hVar = this.f1331v;
        int hashCode2 = (this.f1332w.hashCode() + ((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 37)) * 37;
        String str = this.f1333x;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f5587u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        H6.h hVar = this.f1331v;
        if (hVar != null) {
            sb.append(", scope=");
            sb.append(hVar);
        }
        List list = this.f1332w;
        if (!list.isEmpty()) {
            sb.append(", log_records=");
            sb.append(list);
        }
        String str = this.f1333x;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(V2.a.t(str));
        }
        StringBuilder replace = sb.replace(0, 2, "ScopeLogs{");
        replace.append('}');
        return replace.toString();
    }
}
