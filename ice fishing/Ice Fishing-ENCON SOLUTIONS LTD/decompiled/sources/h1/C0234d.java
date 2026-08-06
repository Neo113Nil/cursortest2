package h1;

import java.io.Serializable;

/* renamed from: h1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3386a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3387b;

    public C0234d(Object obj, Object obj2) {
        this.f3386a = obj;
        this.f3387b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0234d)) {
            return false;
        }
        C0234d c0234d = (C0234d) obj;
        return kotlin.jvm.internal.i.a(this.f3386a, c0234d.f3386a) && kotlin.jvm.internal.i.a(this.f3387b, c0234d.f3387b);
    }

    public final int hashCode() {
        Object obj = this.f3386a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f3387b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f3386a + ", " + this.f3387b + ')';
    }
}
