package H6;

import c6.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class l extends c6.f {

    /* renamed from: w, reason: collision with root package name */
    public static final k f1274w;

    /* renamed from: v, reason: collision with root package name */
    public final List f1275v;

    static {
        c6.d dVar = c6.d.f5754u;
        n nVar = n.f5794u;
        f1274w = new k(l.class);
    }

    public l(d6.d dVar, y8.h hVar) {
        super(f1274w, hVar);
        this.f1275v = A8.b.m("values", dVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return a().equals(lVar.a()) && this.f1275v.equals(lVar.f1275v);
    }

    public final int hashCode() {
        int i = this.f5763u;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f1275v.hashCode() + (a().hashCode() * 37);
        this.f5763u = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f1275v;
        if (!list.isEmpty()) {
            sb.append(", values=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "KeyValueList{");
        replace.append('}');
        return replace.toString();
    }
}
