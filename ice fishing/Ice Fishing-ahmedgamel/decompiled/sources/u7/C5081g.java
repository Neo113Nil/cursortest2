package u7;

import java.io.Serializable;

/* renamed from: u7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5081g implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final Object f41052n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f41053u;

    public C5081g(Object obj, Object obj2) {
        this.f41052n = obj;
        this.f41053u = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5081g)) {
            return false;
        }
        C5081g c5081g = (C5081g) obj;
        return kotlin.jvm.internal.h.a(this.f41052n, c5081g.f41052n) && kotlin.jvm.internal.h.a(this.f41053u, c5081g.f41053u);
    }

    public final int hashCode() {
        Object obj = this.f41052n;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f41053u;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f41052n + ", " + this.f41053u + ')';
    }
}
