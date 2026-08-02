package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2998bN implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public int f30077n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3051cN f30078u;

    public C2998bN(C3051cN c3051cN) {
        this.f30078u = c3051cN;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f30077n;
        C3051cN c3051cN = this.f30078u;
        return i < c3051cN.f30254n.size() || c3051cN.f30255u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f30077n;
        C3051cN c3051cN = this.f30078u;
        ArrayList arrayList = c3051cN.f30254n;
        if (i >= arrayList.size()) {
            arrayList.add(c3051cN.f30255u.next());
            return next();
        }
        int i4 = this.f30077n;
        this.f30077n = i4 + 1;
        return arrayList.get(i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
