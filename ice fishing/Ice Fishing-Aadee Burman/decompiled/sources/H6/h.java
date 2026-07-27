package H6;

import c6.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends c6.f {

    /* renamed from: z, reason: collision with root package name */
    public static final g f1241z;

    /* renamed from: v, reason: collision with root package name */
    public final String f1242v;

    /* renamed from: w, reason: collision with root package name */
    public final String f1243w;

    /* renamed from: x, reason: collision with root package name */
    public final List f1244x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1245y;

    static {
        c6.d dVar = c6.d.f5578u;
        n nVar = n.f5618u;
        f1241z = new g(h.class);
    }

    public h(String str, String str2, d6.d dVar, int i, y8.h hVar) {
        super(f1241z, hVar);
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        this.f1242v = str;
        if (str2 == null) {
            throw new IllegalArgumentException("version == null");
        }
        this.f1243w = str2;
        this.f1244x = V2.a.o("attributes", dVar);
        this.f1245y = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a().equals(hVar.a()) && V2.a.i(this.f1242v, hVar.f1242v) && V2.a.i(this.f1243w, hVar.f1243w) && this.f1244x.equals(hVar.f1244x) && V2.a.i(Integer.valueOf(this.f1245y), Integer.valueOf(hVar.f1245y));
    }

    public final int hashCode() {
        int i = this.f5587u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f1242v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f1243w;
        int hashCode3 = Integer.hashCode(this.f1245y) + ((this.f1244x.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37)) * 37);
        this.f5587u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f1242v;
        if (str != null) {
            sb.append(", name=");
            sb.append(V2.a.t(str));
        }
        String str2 = this.f1243w;
        if (str2 != null) {
            sb.append(", version=");
            sb.append(V2.a.t(str2));
        }
        List list = this.f1244x;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f1245y);
        StringBuilder replace = sb.replace(0, 2, "InstrumentationScope{");
        replace.append('}');
        return replace.toString();
    }
}
