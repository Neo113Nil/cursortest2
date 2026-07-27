package U;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1034a;

    public k(List list) {
        this.f1034a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.class.equals(obj.getClass())) {
            return false;
        }
        return this.f1034a.equals(((k) obj).f1034a);
    }

    public final int hashCode() {
        return this.f1034a.hashCode();
    }

    public final String toString() {
        return u0.d.F((Collection) this.f1034a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
