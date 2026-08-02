package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class GL implements Map.Entry, Comparable {

    /* renamed from: n, reason: collision with root package name */
    public Object f25758n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ FL f25759u;

    public GL(FL fl, Object obj) {
        Objects.requireNonNull(fl);
        this.f25759u = fl;
        this.f25758n = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ((GL) obj).getClass();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null) {
                    return false;
                }
                Object obj2 = this.f25758n;
                Object value = entry.getValue();
                if (obj2 == null ? value == null : obj2.equals(value)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f25758n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f25758n;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f25759u.e();
        Object obj2 = this.f25758n;
        this.f25758n = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25758n);
        return Wv.i(new StringBuilder("null".length() + 1 + valueOf.length()), "null=", valueOf);
    }
}
