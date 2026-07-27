package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.sC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3890sC extends UB {

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f34211v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f34212w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f34213x;

    public C3890sC(Object[] objArr, int i, int i4) {
        this.f34211v = objArr;
        this.f34212w = i;
        this.f34213x = i4;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        PA.a0(i, this.f34213x);
        Object obj = this.f34211v[i + i + this.f34212w];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34213x;
    }
}
