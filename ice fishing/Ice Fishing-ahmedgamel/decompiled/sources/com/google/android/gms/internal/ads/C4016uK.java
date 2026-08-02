package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.uK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4016uK implements Map.Entry {

    /* renamed from: A, reason: collision with root package name */
    public int f35291A;

    /* renamed from: n, reason: collision with root package name */
    public C4016uK f35292n;

    /* renamed from: u, reason: collision with root package name */
    public C4016uK f35293u;

    /* renamed from: v, reason: collision with root package name */
    public C4016uK f35294v;

    /* renamed from: w, reason: collision with root package name */
    public C4016uK f35295w;

    /* renamed from: x, reason: collision with root package name */
    public C4016uK f35296x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f35297y;

    /* renamed from: z, reason: collision with root package name */
    public Object f35298z;

    public C4016uK() {
        this.f35297y = null;
        this.f35296x = this;
        this.f35295w = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f35297y;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f35298z;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f35297y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f35298z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f35297y;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f35298z;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f35298z;
        this.f35298z = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f35297y);
        String valueOf2 = String.valueOf(this.f35298z);
        return D.x.p(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }

    public C4016uK(C4016uK c4016uK, Object obj, C4016uK c4016uK2, C4016uK c4016uK3) {
        this.f35292n = c4016uK;
        this.f35297y = obj;
        this.f35291A = 1;
        this.f35295w = c4016uK2;
        this.f35296x = c4016uK3;
        c4016uK3.f35295w = this;
        c4016uK2.f35296x = this;
    }
}
