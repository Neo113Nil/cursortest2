package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class FB implements Map.Entry {

    /* renamed from: n, reason: collision with root package name */
    public final Object f25510n;

    /* renamed from: u, reason: collision with root package name */
    public int f25511u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ GB f25512v;

    public FB(GB gb, int i) {
        Objects.requireNonNull(gb);
        this.f25512v = gb;
        this.f25510n = gb.c()[i];
        this.f25511u = i;
    }

    public final void a() {
        int i = this.f25511u;
        Object obj = this.f25510n;
        GB gb = this.f25512v;
        if (i != -1 && i < gb.size()) {
            if (Objects.equals(obj, gb.c()[this.f25511u])) {
                return;
            }
        }
        this.f25511u = gb.j(obj);
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
        return this.f25510n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        GB gb = this.f25512v;
        Map f2 = gb.f();
        if (f2 != null) {
            return f2.get(this.f25510n);
        }
        a();
        int i = this.f25511u;
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
        GB gb = this.f25512v;
        Map f2 = gb.f();
        Object obj2 = this.f25510n;
        if (f2 != null) {
            return f2.put(obj2, obj);
        }
        a();
        int i = this.f25511u;
        if (i == -1) {
            gb.put(obj2, obj);
            return null;
        }
        Object obj3 = gb.d()[i];
        gb.d()[this.f25511u] = obj;
        return obj3;
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return D.x.p(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
