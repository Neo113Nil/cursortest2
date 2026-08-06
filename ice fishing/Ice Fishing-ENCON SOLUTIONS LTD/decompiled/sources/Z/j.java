package Z;

import i1.AbstractC0252i;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1947a;

    public j(List list) {
        this.f1947a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j.class.equals(obj.getClass())) {
            return false;
        }
        return this.f1947a.equals(((j) obj).f1947a);
    }

    public final int hashCode() {
        return this.f1947a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return AbstractC0252i.K(this.f1947a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
