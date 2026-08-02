package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public final class qch extends cas {
    public final Map a;

    public qch(Map map) {
        this.a = map;
    }

    @Override // defpackage.cas, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return super.standardContainsValue(obj);
    }

    @Override // defpackage.das
    public final Object delegate() {
        return this.a;
    }

    @Override // defpackage.cas, java.util.Map
    public final Set entrySet() {
        return lab1.d(super.entrySet(), new pch(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.standardEquals(obj);
    }

    @Override // defpackage.cas, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.standardHashCode();
    }

    @Override // defpackage.cas, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // defpackage.cas, java.util.Map
    public final Set keySet() {
        return lab1.d(super.keySet(), new pch(1));
    }

    @Override // defpackage.cas, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // defpackage.cas, defpackage.das
    public final Map delegate() {
        return this.a;
    }
}
