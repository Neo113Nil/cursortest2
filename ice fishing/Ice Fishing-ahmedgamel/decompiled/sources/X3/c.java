package X3;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3764a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3765b;

    public c(String str, Map map) {
        this.f3764a = str;
        this.f3765b = map;
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
        return this.f3764a.equals(cVar.f3764a) && this.f3765b.equals(cVar.f3765b);
    }

    public final int hashCode() {
        return this.f3765b.hashCode() + (this.f3764a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f3764a + ", properties=" + this.f3765b.values() + "}";
    }
}
