package t0;

import E0.i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Object f2982f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2983g;

    public b(Object obj, Object obj2) {
        this.f2982f = obj;
        this.f2983g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.f2982f, bVar.f2982f) && i.a(this.f2983g, bVar.f2983g);
    }

    public final int hashCode() {
        Object obj = this.f2982f;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2983g;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2982f + ", " + this.f2983g + ')';
    }
}
