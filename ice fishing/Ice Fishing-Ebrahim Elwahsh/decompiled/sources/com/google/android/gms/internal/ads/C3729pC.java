package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.pC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3729pC extends UB {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C3783qC f33346v;

    public C3729pC(C3783qC c3783qC) {
        Objects.requireNonNull(c3783qC);
        this.f33346v = c3783qC;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C3783qC c3783qC = this.f33346v;
        PA.a0(i, c3783qC.f33668y);
        int i4 = i + i;
        Object[] objArr = c3783qC.f33667x;
        Object obj = objArr[i4];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i4 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33346v.f33668y;
    }
}
