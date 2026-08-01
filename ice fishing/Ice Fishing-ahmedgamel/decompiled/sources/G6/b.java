package G6;

import c6.d;
import c6.f;
import c6.n;
import java.util.List;
import y8.h;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: w, reason: collision with root package name */
    public static final a f1080w;

    /* renamed from: v, reason: collision with root package name */
    public final List f1081v;

    static {
        d dVar = d.f5578u;
        n nVar = n.f5618u;
        f1080w = new a(b.class);
    }

    public b(d6.d dVar, h hVar) {
        super(f1080w, hVar);
        this.f1081v = V2.a.o("resource_logs", dVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && this.f1081v.equals(bVar.f1081v);
    }

    public final int hashCode() {
        int i = this.f5587u;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f1081v.hashCode() + (a().hashCode() * 37);
        this.f5587u = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f1081v;
        if (!list.isEmpty()) {
            sb.append(", resource_logs=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "ExportLogsServiceRequest{");
        replace.append('}');
        return replace.toString();
    }
}
