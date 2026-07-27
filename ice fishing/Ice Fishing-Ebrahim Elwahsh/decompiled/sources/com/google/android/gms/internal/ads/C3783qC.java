package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3783qC extends AbstractC2917aC {

    /* renamed from: w, reason: collision with root package name */
    public final transient C3944tC f33666w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f33667x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f33668y;

    public C3783qC(C3944tC c3944tC, Object[] objArr, int i) {
        this.f33666w = c3944tC;
        this.f33667x = objArr;
        this.f33668y = i;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final CC a() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.QB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f33666w.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final int h(Object[] objArr, int i) {
        return f().h(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2917aC
    public final UB m() {
        return new C3729pC(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33668y;
    }
}
