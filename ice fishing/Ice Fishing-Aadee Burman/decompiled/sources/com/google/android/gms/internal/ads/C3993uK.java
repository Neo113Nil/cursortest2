package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.uK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3993uK implements Map.Entry {

    /* renamed from: A, reason: collision with root package name */
    public int f34517A;

    /* renamed from: n, reason: collision with root package name */
    public C3993uK f34518n;

    /* renamed from: u, reason: collision with root package name */
    public C3993uK f34519u;

    /* renamed from: v, reason: collision with root package name */
    public C3993uK f34520v;

    /* renamed from: w, reason: collision with root package name */
    public C3993uK f34521w;

    /* renamed from: x, reason: collision with root package name */
    public C3993uK f34522x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f34523y;

    /* renamed from: z, reason: collision with root package name */
    public Object f34524z;

    public C3993uK() {
        this.f34523y = null;
        this.f34522x = this;
        this.f34521w = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f34523y;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f34524z;
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
        return this.f34523y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f34524z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f34523y;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f34524z;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f34524z;
        this.f34524z = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f34523y);
        String valueOf2 = String.valueOf(this.f34524z);
        return D.y.s(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }

    public C3993uK(C3993uK c3993uK, Object obj, C3993uK c3993uK2, C3993uK c3993uK3) {
        this.f34518n = c3993uK;
        this.f34523y = obj;
        this.f34517A = 1;
        this.f34521w = c3993uK2;
        this.f34522x = c3993uK3;
        c3993uK3.f34521w = this;
        c3993uK2.f34522x = this;
    }
}
