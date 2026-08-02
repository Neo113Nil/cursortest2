package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.Wv;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class L2 implements Map.Entry, Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final Comparable f36334n;

    /* renamed from: u, reason: collision with root package name */
    public Object f36335u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ K2 f36336v;

    public L2(K2 k22, Comparable comparable, Object obj) {
        Objects.requireNonNull(k22);
        this.f36336v = k22;
        this.f36334n = comparable;
        this.f36335u = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f36334n.compareTo(((L2) obj).f36334n);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f36334n;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f36335u;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f36334n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f36335u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f36334n;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f36335u;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f36336v.g();
        Object obj2 = this.f36335u;
        this.f36335u = obj;
        return obj2;
    }

    public final String toString() {
        return Wv.h(String.valueOf(this.f36334n), "=", String.valueOf(this.f36335u));
    }
}
