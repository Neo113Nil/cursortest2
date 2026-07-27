package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.kK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3454kK extends AbstractC3508lK implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f31417n = new ArrayList();

    @Override // com.google.android.gms.internal.ads.AbstractC3508lK
    public final String a() {
        ArrayList arrayList = this.f31417n;
        int size = arrayList.size();
        if (size == 1) {
            return ((AbstractC3508lK) arrayList.get(0)).a();
        }
        throw new IllegalStateException(D.y.m(size, "Array must have size 1, but has size ", new StringBuilder(String.valueOf(size).length() + 37)));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3454kK) && ((C3454kK) obj).f31417n.equals(this.f31417n);
        }
        return true;
    }

    public final int hashCode() {
        return this.f31417n.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f31417n.iterator();
    }
}
