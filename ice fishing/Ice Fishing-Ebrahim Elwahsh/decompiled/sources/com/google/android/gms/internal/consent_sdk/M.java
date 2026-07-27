package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class M extends J {

    /* renamed from: x, reason: collision with root package name */
    public static final M f35731x = new M(new Object[0], 0);

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f35732v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f35733w;

    public M(Object[] objArr, int i) {
        this.f35732v = objArr;
        this.f35733w = i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.J, com.google.android.gms.internal.consent_sdk.G
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f35732v;
        int i = this.f35733w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int c() {
        return this.f35733w;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final Object[] e() {
        return this.f35732v;
    }

    @Override // java.util.List
    public final Object get(int i) {
        E.b(i, this.f35733w);
        Object obj = this.f35732v[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35733w;
    }
}
