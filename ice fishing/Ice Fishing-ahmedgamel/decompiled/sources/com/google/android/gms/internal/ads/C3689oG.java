package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.oG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3689oG implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f33675n;

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f33676u;

    public /* synthetic */ C3689oG(Iterator it, Iterator it2) {
        this.f33675n = it;
        this.f33676u = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33675n.hasNext() || this.f33676u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f33675n;
        return it.hasNext() ? it.next() : this.f33676u.next();
    }
}
