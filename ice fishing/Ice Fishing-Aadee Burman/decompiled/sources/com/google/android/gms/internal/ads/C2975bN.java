package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2975bN implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public int f29289n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3028cN f29290u;

    public C2975bN(C3028cN c3028cN) {
        this.f29290u = c3028cN;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f29289n;
        C3028cN c3028cN = this.f29290u;
        return i < c3028cN.f29471n.size() || c3028cN.f29472u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f29289n;
        C3028cN c3028cN = this.f29290u;
        ArrayList arrayList = c3028cN.f29471n;
        if (i >= arrayList.size()) {
            arrayList.add(c3028cN.f29472u.next());
            return next();
        }
        int i6 = this.f29289n;
        this.f29289n = i6 + 1;
        return arrayList.get(i6);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
