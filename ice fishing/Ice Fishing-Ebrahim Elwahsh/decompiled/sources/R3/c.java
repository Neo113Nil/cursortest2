package R3;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2797a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2798b;

    public c(String str, Map map) {
        this.f2797a = str;
        this.f2798b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2797a.equals(cVar.f2797a) && this.f2798b.equals(cVar.f2798b);
    }

    public final int hashCode() {
        return this.f2798b.hashCode() + (this.f2797a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f2797a + ", properties=" + this.f2798b.values() + "}";
    }
}
