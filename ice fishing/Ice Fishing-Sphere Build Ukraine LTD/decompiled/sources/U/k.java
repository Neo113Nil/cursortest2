package U;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1042a;

    public k(List list) {
        this.f1042a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.class.equals(obj.getClass())) {
            return false;
        }
        return this.f1042a.equals(((k) obj).f1042a);
    }

    public final int hashCode() {
        return this.f1042a.hashCode();
    }

    public final String toString() {
        return u0.d.D((Collection) this.f1042a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
