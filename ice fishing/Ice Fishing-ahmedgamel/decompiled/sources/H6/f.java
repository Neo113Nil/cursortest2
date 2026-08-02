package H6;

import c6.n;
import java.util.List;
import v7.AbstractC5119j;

/* loaded from: classes2.dex */
public final class f extends c6.f {

    /* renamed from: z, reason: collision with root package name */
    public static final e f1261z;

    /* renamed from: v, reason: collision with root package name */
    public final String f1262v;

    /* renamed from: w, reason: collision with root package name */
    public final String f1263w;

    /* renamed from: x, reason: collision with root package name */
    public final List f1264x;

    /* renamed from: y, reason: collision with root package name */
    public final List f1265y;

    static {
        c6.d dVar = c6.d.f5754u;
        n nVar = n.f5794u;
        f1261z = new e(f.class);
    }

    public f(String str, String str2, d6.d dVar, d6.d dVar2, y8.h hVar) {
        super(f1261z, hVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f1262v = str;
        if (str2 == null) {
            throw new IllegalArgumentException("type == null");
        }
        this.f1263w = str2;
        this.f1264x = A8.b.m("id_keys", dVar);
        this.f1265y = A8.b.m("description_keys", dVar2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a().equals(fVar.a()) && A8.b.i(this.f1262v, fVar.f1262v) && A8.b.i(this.f1263w, fVar.f1263w) && this.f1264x.equals(fVar.f1264x) && this.f1265y.equals(fVar.f1265y);
    }

    public final int hashCode() {
        int i = this.f5763u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f1262v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f1263w;
        int hashCode3 = this.f1265y.hashCode() + ((this.f1264x.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37)) * 37);
        this.f5763u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f1262v;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(A8.b.u(str));
        }
        String str2 = this.f1263w;
        if (str2 != null) {
            sb.append(", type=");
            sb.append(A8.b.u(str2));
        }
        List list = this.f1264x;
        if (!list.isEmpty()) {
            sb.append(", id_keys=");
            sb.append(AbstractC5119j.C(list, null, "[", "]", d6.b.f37183v, 25));
        }
        List list2 = this.f1265y;
        if (!list2.isEmpty()) {
            sb.append(", description_keys=");
            sb.append(AbstractC5119j.C(list2, null, "[", "]", d6.b.f37183v, 25));
        }
        StringBuilder replace = sb.replace(0, 2, "EntityRef{");
        replace.append('}');
        return replace.toString();
    }
}
