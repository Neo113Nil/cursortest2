package E6;

import Y5.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends Y5.f {

    /* renamed from: y, reason: collision with root package name */
    public static final c f858y;

    /* renamed from: v, reason: collision with root package name */
    public final F6.b f859v;

    /* renamed from: w, reason: collision with root package name */
    public final List f860w;

    /* renamed from: x, reason: collision with root package name */
    public final String f861x;

    static {
        Y5.d dVar = Y5.d.f3983u;
        n nVar = n.f4023u;
        f858y = new c(d.class);
    }

    public d(F6.b bVar, Z5.d dVar, String str, u8.h hVar) {
        super(f858y, hVar);
        this.f859v = bVar;
        this.f860w = com.bumptech.glide.f.k("scope_logs", dVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f861x = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return a().equals(dVar.a()) && com.bumptech.glide.f.f(this.f859v, dVar.f859v) && this.f860w.equals(dVar.f860w) && com.bumptech.glide.f.f(this.f861x, dVar.f861x);
    }

    public final int hashCode() {
        int i = this.f3992u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        F6.b bVar = this.f859v;
        int hashCode2 = (this.f860w.hashCode() + ((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 37)) * 37;
        String str = this.f861x;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f3992u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        F6.b bVar = this.f859v;
        if (bVar != null) {
            sb.append(", resource=");
            sb.append(bVar);
        }
        List list = this.f860w;
        if (!list.isEmpty()) {
            sb.append(", scope_logs=");
            sb.append(list);
        }
        String str = this.f861x;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(com.bumptech.glide.f.n(str));
        }
        StringBuilder replace = sb.replace(0, 2, "ResourceLogs{");
        replace.append('}');
        return replace.toString();
    }
}
