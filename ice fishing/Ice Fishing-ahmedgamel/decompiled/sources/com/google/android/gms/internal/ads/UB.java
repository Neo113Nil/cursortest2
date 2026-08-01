package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class UB extends AbstractC4255zC {

    /* renamed from: u, reason: collision with root package name */
    public final PB f27909u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC4255zC f27910v;

    public UB(ZB zb) {
        super(0);
        Objects.requireNonNull(zb);
        this.f27909u = ((RB) zb.f28848w.values()).listIterator(0);
        this.f27910v = C2964bC.f29243x;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27910v.hasNext() || this.f27909u.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4255zC, java.util.Iterator
    public final Object next() {
        if (!this.f27910v.hasNext()) {
            this.f27910v = ((NB) this.f27909u.next()).a();
        }
        return this.f27910v.next();
    }
}
