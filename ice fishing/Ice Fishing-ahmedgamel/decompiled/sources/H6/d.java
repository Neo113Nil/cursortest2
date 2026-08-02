package H6;

import c6.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends c6.f {

    /* renamed from: w, reason: collision with root package name */
    public static final c f1259w;

    /* renamed from: v, reason: collision with root package name */
    public final List f1260v;

    static {
        c6.d dVar = c6.d.f5754u;
        n nVar = n.f5794u;
        f1259w = new c(d.class);
    }

    public d(d6.d dVar, y8.h hVar) {
        super(f1259w, hVar);
        this.f1260v = A8.b.m("values", dVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return a().equals(dVar.a()) && this.f1260v.equals(dVar.f1260v);
    }

    public final int hashCode() {
        int i = this.f5763u;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f1260v.hashCode() + (a().hashCode() * 37);
        this.f5763u = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f1260v;
        if (!list.isEmpty()) {
            sb.append(", values=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "ArrayValue{");
        replace.append('}');
        return replace.toString();
    }
}
