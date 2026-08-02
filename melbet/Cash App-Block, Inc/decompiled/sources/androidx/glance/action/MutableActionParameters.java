package androidx.glance.action;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class MutableActionParameters {
    public final LinkedHashMap map;

    public MutableActionParameters(LinkedHashMap linkedHashMap) {
        this.map = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MutableActionParameters) {
            return this.map.equals(((MutableActionParameters) obj).map);
        }
        return false;
    }

    public final int hashCode() {
        return this.map.hashCode();
    }

    public final String toString() {
        return this.map.toString();
    }
}
