package androidx.window.layout;

import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2262a;

    public z(List list) {
        this.f2262a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z.class.equals(obj.getClass())) {
            return false;
        }
        return this.f2262a.equals(((z) obj).f2262a);
    }

    public final int hashCode() {
        return this.f2262a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return u1.g.Q(this.f2262a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
