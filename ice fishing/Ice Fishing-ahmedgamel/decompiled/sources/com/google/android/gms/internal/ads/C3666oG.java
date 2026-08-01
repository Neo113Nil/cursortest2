package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.oG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3666oG implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f32888n;

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f32889u;

    public /* synthetic */ C3666oG(Iterator it, Iterator it2) {
        this.f32888n = it;
        this.f32889u = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32888n.hasNext() || this.f32889u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f32888n;
        return it.hasNext() ? it.next() : this.f32889u.next();
    }
}
