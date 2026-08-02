package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class UB extends AbstractC4278zC {

    /* renamed from: u, reason: collision with root package name */
    public final PB f28706u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC4278zC f28707v;

    public UB(ZB zb) {
        super(0);
        Objects.requireNonNull(zb);
        this.f28706u = ((RB) zb.f29628w.values()).listIterator(0);
        this.f28707v = C2987bC.f30031x;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28707v.hasNext() || this.f28706u.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4278zC, java.util.Iterator
    public final Object next() {
        if (!this.f28707v.hasNext()) {
            this.f28707v = ((NB) this.f28706u.next()).a();
        }
        return this.f28707v.next();
    }
}
