package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class AbstractMultimap {
    public transient Map asMap;
    public transient Set keySet;
    public transient Collection values;

    public Map asMap() {
        Map map = this.asMap;
        if (map != null) {
            return map;
        }
        Map createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    public abstract Map createAsMap();

    public abstract Set createKeySet();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractMultimap) {
            return asMap().equals(((AbstractMultimap) obj).asMap());
        }
        return false;
    }

    public final int hashCode() {
        return asMap().hashCode();
    }

    public final String toString() {
        return asMap().toString();
    }
}
