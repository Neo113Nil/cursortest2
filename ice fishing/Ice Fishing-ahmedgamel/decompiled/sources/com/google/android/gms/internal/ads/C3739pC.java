package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.pC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3739pC extends RB {

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f33829v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f33830w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f33831x;

    public C3739pC(Object[] objArr, int i, int i4) {
        this.f33829v = objArr;
        this.f33830w = i;
        this.f33831x = i4;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC2792Sd.K(i, this.f33831x);
        Object obj = this.f33829v[i + i + this.f33830w];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33831x;
    }
}
