package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3631nC extends XB {

    /* renamed from: w, reason: collision with root package name */
    public final transient C3793qC f33485w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f33486x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f33487y;

    public C3631nC(C3793qC c3793qC, Object[] objArr, int i) {
        this.f33485w = c3793qC;
        this.f33486x = objArr;
        this.f33487y = i;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final AbstractC4278zC a() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.NB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f33485w.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int h(Object[] objArr, int i) {
        return f().h(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.XB
    public final RB m() {
        return new C3577mC(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33487y;
    }
}
