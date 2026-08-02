package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d9c {
    public final String a;
    public final Map b;

    public d9c(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static d9c a(String str) {
        return new d9c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9c)) {
            return false;
        }
        d9c d9cVar = (d9c) obj;
        return this.a.equals(d9cVar.a) && this.b.equals(d9cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
