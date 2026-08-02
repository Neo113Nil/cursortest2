package defpackage;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class xu1 {
    public static final xu1 b = new xu1(new IdentityHashMap());
    public final IdentityHashMap a;

    public xu1(IdentityHashMap identityHashMap) {
        this.a = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xu1.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = ((xu1) obj).a;
        IdentityHashMap identityHashMap2 = this.a;
        if (identityHashMap2.size() != identityHashMap.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap2.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey()) || !hdg.S(entry.getValue(), identityHashMap.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
