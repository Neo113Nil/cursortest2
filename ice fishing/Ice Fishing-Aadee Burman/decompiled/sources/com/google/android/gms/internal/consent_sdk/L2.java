package com.google.android.gms.internal.consent_sdk;

import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class L2 implements Map.Entry, Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final Comparable f35565n;

    /* renamed from: u, reason: collision with root package name */
    public Object f35566u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ K2 f35567v;

    public L2(K2 k22, Comparable comparable, Object obj) {
        Objects.requireNonNull(k22);
        this.f35567v = k22;
        this.f35565n = comparable;
        this.f35566u = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f35565n.compareTo(((L2) obj).f35565n);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f35565n;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f35566u;
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
        return this.f35565n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f35566u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f35565n;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f35566u;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f35567v.g();
        Object obj2 = this.f35566u;
        this.f35566u = obj;
        return obj2;
    }

    public final String toString() {
        return AbstractC4404f.g(String.valueOf(this.f35565n), "=", String.valueOf(this.f35566u));
    }
}
