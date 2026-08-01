package u7;

import java.io.Serializable;

/* renamed from: u7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5089g implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final Object f41332n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f41333u;

    public C5089g(Object obj, Object obj2) {
        this.f41332n = obj;
        this.f41333u = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5089g)) {
            return false;
        }
        C5089g c5089g = (C5089g) obj;
        return kotlin.jvm.internal.h.a(this.f41332n, c5089g.f41332n) && kotlin.jvm.internal.h.a(this.f41333u, c5089g.f41333u);
    }

    public final int hashCode() {
        Object obj = this.f41332n;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f41333u;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f41332n + ", " + this.f41333u + ')';
    }
}
