package J6;

import c6.d;
import c6.f;
import c6.n;
import java.util.List;
import y8.h;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: y, reason: collision with root package name */
    public static final a f1580y;

    /* renamed from: v, reason: collision with root package name */
    public final List f1581v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1582w;

    /* renamed from: x, reason: collision with root package name */
    public final List f1583x;

    static {
        d dVar = d.f5754u;
        n nVar = n.f5794u;
        f1580y = new a(b.class);
    }

    public b(d6.d dVar, int i, d6.d dVar2, h hVar) {
        super(f1580y, hVar);
        this.f1581v = A8.b.m("attributes", dVar);
        this.f1582w = i;
        this.f1583x = A8.b.m("entity_refs", dVar2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && this.f1581v.equals(bVar.f1581v) && A8.b.i(Integer.valueOf(this.f1582w), Integer.valueOf(bVar.f1582w)) && this.f1583x.equals(bVar.f1583x);
    }

    public final int hashCode() {
        int i = this.f5763u;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f1583x.hashCode() + ((Integer.hashCode(this.f1582w) + ((this.f1581v.hashCode() + (a().hashCode() * 37)) * 37)) * 37);
        this.f5763u = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f1581v;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f1582w);
        List list2 = this.f1583x;
        if (!list2.isEmpty()) {
            sb.append(", entity_refs=");
            sb.append(list2);
        }
        StringBuilder replace = sb.replace(0, 2, "Resource{");
        replace.append('}');
        return replace.toString();
    }
}
