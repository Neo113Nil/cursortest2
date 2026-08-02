package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class s6v implements t6v {
    public final LinkedHashMap a;

    public s6v(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6v) && this.a.equals(((s6v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.a + ")";
    }
}
