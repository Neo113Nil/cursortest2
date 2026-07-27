package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.tK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3952tK extends AbstractC4006uK implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f34396n = new ArrayList();

    @Override // com.google.android.gms.internal.ads.AbstractC4006uK
    public final String a() {
        ArrayList arrayList = this.f34396n;
        int size = arrayList.size();
        if (size == 1) {
            return ((AbstractC4006uK) arrayList.get(0)).a();
        }
        throw new IllegalStateException(D.y.j(size, "Array must have size 1, but has size ", new StringBuilder(String.valueOf(size).length() + 37)));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3952tK) && ((C3952tK) obj).f34396n.equals(this.f34396n);
        }
        return true;
    }

    public final int hashCode() {
        return this.f34396n.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f34396n.iterator();
    }
}
