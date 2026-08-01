package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class FB implements Map.Entry {

    /* renamed from: n, reason: collision with root package name */
    public final Object f24754n;

    /* renamed from: u, reason: collision with root package name */
    public int f24755u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ GB f24756v;

    public FB(GB gb, int i) {
        Objects.requireNonNull(gb);
        this.f24756v = gb;
        this.f24754n = gb.c()[i];
        this.f24755u = i;
    }

    public final void a() {
        int i = this.f24755u;
        Object obj = this.f24754n;
        GB gb = this.f24756v;
        if (i != -1 && i < gb.size()) {
            if (Objects.equals(obj, gb.c()[this.f24755u])) {
                return;
            }
        }
        this.f24755u = gb.j(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f24754n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        GB gb = this.f24756v;
        Map f3 = gb.f();
        if (f3 != null) {
            return f3.get(this.f24754n);
        }
        a();
        int i = this.f24755u;
        if (i == -1) {
            return null;
        }
        return gb.d()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        GB gb = this.f24756v;
        Map f3 = gb.f();
        Object obj2 = this.f24754n;
        if (f3 != null) {
            return f3.put(obj2, obj);
        }
        a();
        int i = this.f24755u;
        if (i == -1) {
            gb.put(obj2, obj);
            return null;
        }
        Object obj3 = gb.d()[i];
        gb.d()[this.f24755u] = obj;
        return obj3;
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return D.y.s(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
