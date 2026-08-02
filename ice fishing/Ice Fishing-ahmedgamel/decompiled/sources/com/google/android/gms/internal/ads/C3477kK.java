package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.kK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3477kK extends AbstractC3531lK implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f32196n = new ArrayList();

    @Override // com.google.android.gms.internal.ads.AbstractC3531lK
    public final String a() {
        ArrayList arrayList = this.f32196n;
        int size = arrayList.size();
        if (size == 1) {
            return ((AbstractC3531lK) arrayList.get(0)).a();
        }
        throw new IllegalStateException(D.x.k(size, "Array must have size 1, but has size ", new StringBuilder(String.valueOf(size).length() + 37)));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3477kK) && ((C3477kK) obj).f32196n.equals(this.f32196n);
        }
        return true;
    }

    public final int hashCode() {
        return this.f32196n.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f32196n.iterator();
    }
}
