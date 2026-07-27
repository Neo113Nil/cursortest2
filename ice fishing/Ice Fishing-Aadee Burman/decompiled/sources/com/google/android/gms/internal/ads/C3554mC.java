package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3554mC extends RB {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C3608nC f31912v;

    public C3554mC(C3608nC c3608nC) {
        Objects.requireNonNull(c3608nC);
        this.f31912v = c3608nC;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C3608nC c3608nC = this.f31912v;
        AbstractC2772Sd.K(i, c3608nC.f32709y);
        int i6 = i + i;
        Object[] objArr = c3608nC.f32708x;
        Object obj = objArr[i6];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i6 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31912v.f32709y;
    }
}
