package D6;

import Y5.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class l extends Y5.f {

    /* renamed from: w, reason: collision with root package name */
    public static final k f728w;

    /* renamed from: v, reason: collision with root package name */
    public final List f729v;

    static {
        Y5.d dVar = Y5.d.f3983u;
        n nVar = n.f4023u;
        f728w = new k(l.class);
    }

    public l(Z5.d dVar, u8.h hVar) {
        super(f728w, hVar);
        this.f729v = com.bumptech.glide.f.k("values", dVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return a().equals(lVar.a()) && this.f729v.equals(lVar.f729v);
    }

    public final int hashCode() {
        int i = this.f3992u;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f729v.hashCode() + (a().hashCode() * 37);
        this.f3992u = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f729v;
        if (!list.isEmpty()) {
            sb.append(", values=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "KeyValueList{");
        replace.append('}');
        return replace.toString();
    }
}
