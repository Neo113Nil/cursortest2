package com.gamericefishpro.space.q4;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Map.Entry, Comparable {
    public final Comparable d;
    public Object e;
    public final /* synthetic */ v0 i;

    public w0(v0 v0Var, Comparable comparable, Object obj) {
        this.i = v0Var;
        this.d = comparable;
        this.e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.d.compareTo(((w0) obj).d);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.d;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.e;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.d;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.e;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.i.b();
        Object obj2 = this.e;
        this.e = obj;
        return obj2;
    }

    public final String toString() {
        return this.d + "=" + this.e;
    }
}
