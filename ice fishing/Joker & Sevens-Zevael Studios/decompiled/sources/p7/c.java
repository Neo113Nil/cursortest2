package p7;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f5654a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f5655b;

    public c(String str, Map map) {
        this.f5654a = str;
        this.f5655b = map;
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
        return this.f5654a.equals(cVar.f5654a) && this.f5655b.equals(cVar.f5655b);
    }

    public final int hashCode() {
        return this.f5655b.hashCode() + (this.f5654a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f5654a + ", properties=" + this.f5655b.values() + "}";
    }
}
