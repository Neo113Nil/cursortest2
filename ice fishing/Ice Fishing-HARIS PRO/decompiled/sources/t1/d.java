package t1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4378a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4379b;

    public d(Object obj, Object obj2) {
        this.f4378a = obj;
        this.f4379b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return D1.i.a(this.f4378a, dVar.f4378a) && D1.i.a(this.f4379b, dVar.f4379b);
    }

    public final int hashCode() {
        Object obj = this.f4378a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4379b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f4378a + ", " + this.f4379b + ')';
    }
}
