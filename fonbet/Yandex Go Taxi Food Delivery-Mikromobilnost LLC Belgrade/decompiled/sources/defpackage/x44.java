package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes.dex */
public final class x44 extends c3f.e.d.a.b {
    public final List a;
    public final c3f.e.d.a.b.c b;
    public final c3f.a c;
    public final c3f.e.d.a.b.AbstractC0018d d;
    public final List e;

    public x44(List list, c3f.e.d.a.b.c cVar, c3f.a aVar, c3f.e.d.a.b.AbstractC0018d abstractC0018d, List list2) {
        this.a = list;
        this.b = cVar;
        this.c = aVar;
        this.d = abstractC0018d;
        this.e = list2;
    }

    @Override // c3f.e.d.a.b
    public final c3f.a a() {
        return this.c;
    }

    @Override // c3f.e.d.a.b
    public final List b() {
        return this.e;
    }

    @Override // c3f.e.d.a.b
    public final c3f.e.d.a.b.c c() {
        return this.b;
    }

    @Override // c3f.e.d.a.b
    public final c3f.e.d.a.b.AbstractC0018d d() {
        return this.d;
    }

    @Override // c3f.e.d.a.b
    public final List e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.d.a.b)) {
            return false;
        }
        c3f.e.d.a.b bVar = (c3f.e.d.a.b) obj;
        List list = this.a;
        if (list == null) {
            if (bVar.e() != null) {
                return false;
            }
        } else if (!list.equals(bVar.e())) {
            return false;
        }
        c3f.e.d.a.b.c cVar = this.b;
        if (cVar == null) {
            if (bVar.c() != null) {
                return false;
            }
        } else if (!cVar.equals(bVar.c())) {
            return false;
        }
        c3f.a aVar = this.c;
        if (aVar == null) {
            if (bVar.a() != null) {
                return false;
            }
        } else if (!aVar.equals(bVar.a())) {
            return false;
        }
        return this.d.equals(bVar.d()) && this.e.equals(bVar.b());
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        c3f.e.d.a.b.c cVar = this.b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        c3f.a aVar = this.c;
        return this.e.hashCode() ^ (((((aVar != null ? aVar.hashCode() : 0) ^ hashCode2) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", signal=");
        sb.append(this.d);
        sb.append(", binaries=");
        return ly3.s(sb, this.e, "}");
    }
}
