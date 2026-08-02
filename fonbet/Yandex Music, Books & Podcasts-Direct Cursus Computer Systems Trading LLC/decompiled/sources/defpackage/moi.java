package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class moi extends mg {
    public final LinkedHashMap a;

    public moi(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof moi) {
            return this.a.equals(((moi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
