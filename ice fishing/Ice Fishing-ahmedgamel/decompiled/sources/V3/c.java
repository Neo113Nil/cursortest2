package V3;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3276a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3277b;

    public c(String str, Map map) {
        this.f3276a = str;
        this.f3277b = map;
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
        return this.f3276a.equals(cVar.f3276a) && this.f3277b.equals(cVar.f3277b);
    }

    public final int hashCode() {
        return this.f3277b.hashCode() + (this.f3276a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f3276a + ", properties=" + this.f3277b.values() + "}";
    }
}
