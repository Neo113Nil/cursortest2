package J6;

import c6.d;
import c6.f;
import c6.n;
import java.util.List;
import y8.h;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: y, reason: collision with root package name */
    public static final a f1471y;

    /* renamed from: v, reason: collision with root package name */
    public final List f1472v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1473w;

    /* renamed from: x, reason: collision with root package name */
    public final List f1474x;

    static {
        d dVar = d.f5578u;
        n nVar = n.f5618u;
        f1471y = new a(b.class);
    }

    public b(d6.d dVar, int i, d6.d dVar2, h hVar) {
        super(f1471y, hVar);
        this.f1472v = V2.a.o("attributes", dVar);
        this.f1473w = i;
        this.f1474x = V2.a.o("entity_refs", dVar2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && this.f1472v.equals(bVar.f1472v) && V2.a.i(Integer.valueOf(this.f1473w), Integer.valueOf(bVar.f1473w)) && this.f1474x.equals(bVar.f1474x);
    }

    public final int hashCode() {
        int i = this.f5587u;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f1474x.hashCode() + ((Integer.hashCode(this.f1473w) + ((this.f1472v.hashCode() + (a().hashCode() * 37)) * 37)) * 37);
        this.f5587u = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f1472v;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f1473w);
        List list2 = this.f1474x;
        if (!list2.isEmpty()) {
            sb.append(", entity_refs=");
            sb.append(list2);
        }
        StringBuilder replace = sb.replace(0, 2, "Resource{");
        replace.append('}');
        return replace.toString();
    }
}
