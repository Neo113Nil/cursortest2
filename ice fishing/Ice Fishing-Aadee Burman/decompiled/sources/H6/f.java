package H6;

import c6.n;
import java.util.List;
import v7.AbstractC5129j;

/* loaded from: classes2.dex */
public final class f extends c6.f {

    /* renamed from: z, reason: collision with root package name */
    public static final e f1236z;

    /* renamed from: v, reason: collision with root package name */
    public final String f1237v;

    /* renamed from: w, reason: collision with root package name */
    public final String f1238w;

    /* renamed from: x, reason: collision with root package name */
    public final List f1239x;

    /* renamed from: y, reason: collision with root package name */
    public final List f1240y;

    static {
        c6.d dVar = c6.d.f5578u;
        n nVar = n.f5618u;
        f1236z = new e(f.class);
    }

    public f(String str, String str2, d6.d dVar, d6.d dVar2, y8.h hVar) {
        super(f1236z, hVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f1237v = str;
        if (str2 == null) {
            throw new IllegalArgumentException("type == null");
        }
        this.f1238w = str2;
        this.f1239x = V2.a.o("id_keys", dVar);
        this.f1240y = V2.a.o("description_keys", dVar2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a().equals(fVar.a()) && V2.a.i(this.f1237v, fVar.f1237v) && V2.a.i(this.f1238w, fVar.f1238w) && this.f1239x.equals(fVar.f1239x) && this.f1240y.equals(fVar.f1240y);
    }

    public final int hashCode() {
        int i = this.f5587u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f1237v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f1238w;
        int hashCode3 = this.f1240y.hashCode() + ((this.f1239x.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37)) * 37);
        this.f5587u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f1237v;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(V2.a.t(str));
        }
        String str2 = this.f1238w;
        if (str2 != null) {
            sb.append(", type=");
            sb.append(V2.a.t(str2));
        }
        List list = this.f1239x;
        if (!list.isEmpty()) {
            sb.append(", id_keys=");
            sb.append(AbstractC5129j.E(list, null, "[", "]", d6.b.f37074v, 25));
        }
        List list2 = this.f1240y;
        if (!list2.isEmpty()) {
            sb.append(", description_keys=");
            sb.append(AbstractC5129j.E(list2, null, "[", "]", d6.b.f37074v, 25));
        }
        StringBuilder replace = sb.replace(0, 2, "EntityRef{");
        replace.append('}');
        return replace.toString();
    }
}
