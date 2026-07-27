package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class IB implements Map.Entry {

    /* renamed from: n, reason: collision with root package name */
    public final Object f25536n;

    /* renamed from: u, reason: collision with root package name */
    public int f25537u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ JB f25538v;

    public IB(JB jb, int i) {
        Objects.requireNonNull(jb);
        this.f25538v = jb;
        this.f25536n = jb.c()[i];
        this.f25537u = i;
    }

    public final void a() {
        int i = this.f25537u;
        Object obj = this.f25536n;
        JB jb = this.f25538v;
        if (i != -1 && i < jb.size()) {
            if (Objects.equals(obj, jb.c()[this.f25537u])) {
                return;
            }
        }
        this.f25537u = jb.j(obj);
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
        return this.f25536n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        JB jb = this.f25538v;
        Map f6 = jb.f();
        if (f6 != null) {
            return f6.get(this.f25536n);
        }
        a();
        int i = this.f25537u;
        if (i == -1) {
            return null;
        }
        return jb.d()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        JB jb = this.f25538v;
        Map f6 = jb.f();
        Object obj2 = this.f25536n;
        if (f6 != null) {
            return f6.put(obj2, obj);
        }
        a();
        int i = this.f25537u;
        if (i == -1) {
            jb.put(obj2, obj);
            return null;
        }
        Object obj3 = jb.d()[i];
        jb.d()[this.f25537u] = obj;
        return obj3;
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return D.y.o(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
