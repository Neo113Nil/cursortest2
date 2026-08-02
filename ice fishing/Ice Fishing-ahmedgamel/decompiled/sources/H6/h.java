package H6;

import c6.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends c6.f {

    /* renamed from: z, reason: collision with root package name */
    public static final g f1266z;

    /* renamed from: v, reason: collision with root package name */
    public final String f1267v;

    /* renamed from: w, reason: collision with root package name */
    public final String f1268w;

    /* renamed from: x, reason: collision with root package name */
    public final List f1269x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1270y;

    static {
        c6.d dVar = c6.d.f5754u;
        n nVar = n.f5794u;
        f1266z = new g(h.class);
    }

    public h(String str, String str2, d6.d dVar, int i, y8.h hVar) {
        super(f1266z, hVar);
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        this.f1267v = str;
        if (str2 == null) {
            throw new IllegalArgumentException("version == null");
        }
        this.f1268w = str2;
        this.f1269x = A8.b.m("attributes", dVar);
        this.f1270y = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a().equals(hVar.a()) && A8.b.i(this.f1267v, hVar.f1267v) && A8.b.i(this.f1268w, hVar.f1268w) && this.f1269x.equals(hVar.f1269x) && A8.b.i(Integer.valueOf(this.f1270y), Integer.valueOf(hVar.f1270y));
    }

    public final int hashCode() {
        int i = this.f5763u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f1267v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f1268w;
        int hashCode3 = Integer.hashCode(this.f1270y) + ((this.f1269x.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37)) * 37);
        this.f5763u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f1267v;
        if (str != null) {
            sb.append(", name=");
            sb.append(A8.b.u(str));
        }
        String str2 = this.f1268w;
        if (str2 != null) {
            sb.append(", version=");
            sb.append(A8.b.u(str2));
        }
        List list = this.f1269x;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f1270y);
        StringBuilder replace = sb.replace(0, 2, "InstrumentationScope{");
        replace.append('}');
        return replace.toString();
    }
}
