package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.dC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3071dC extends AbstractC4255zC {

    /* renamed from: u, reason: collision with root package name */
    public final Object f29726u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29727v;

    public C3071dC(Object obj) {
        super(0);
        this.f29726u = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f29727v;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4255zC, java.util.Iterator
    public final Object next() {
        if (this.f29727v) {
            throw new NoSuchElementException();
        }
        this.f29727v = true;
        return this.f29726u;
    }
}
