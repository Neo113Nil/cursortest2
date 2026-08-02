package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.dK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3102dK extends AbstractC2792Sd implements Map {

    /* renamed from: M, reason: collision with root package name */
    public final Map f30517M;

    public C3102dK(Map map) {
        super(28);
        this.f30517M = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f30517M.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f30517M.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((C4008uC) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC2659Kg.q(this.f30517M.entrySet(), Y0.f29407x);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && SK.u(obj, this);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f30517M.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC2659Kg.t(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f30517M;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC2659Kg.q(this.f30517M.keySet(), Y0.f29408y);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2792Sd
    public final /* synthetic */ Object m() {
        return this.f30517M;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f30517M.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f30517M.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f30517M.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f30517M;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f30517M.values();
    }
}
