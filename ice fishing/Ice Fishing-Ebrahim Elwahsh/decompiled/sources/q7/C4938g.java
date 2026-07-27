package q7;

import java.io.Serializable;

/* renamed from: q7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4938g implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final Object f40162n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f40163u;

    public C4938g(Object obj, Object obj2) {
        this.f40162n = obj;
        this.f40163u = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4938g)) {
            return false;
        }
        C4938g c4938g = (C4938g) obj;
        return kotlin.jvm.internal.h.a(this.f40162n, c4938g.f40162n) && kotlin.jvm.internal.h.a(this.f40163u, c4938g.f40163u);
    }

    public final int hashCode() {
        Object obj = this.f40162n;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f40163u;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f40162n + ", " + this.f40163u + ')';
    }
}
