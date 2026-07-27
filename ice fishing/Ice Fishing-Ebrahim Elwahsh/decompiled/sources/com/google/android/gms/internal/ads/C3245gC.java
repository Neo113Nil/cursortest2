package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.gC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3245gC extends CC {

    /* renamed from: u, reason: collision with root package name */
    public final Object f30963u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30964v;

    public C3245gC(Object obj) {
        super(0);
        this.f30963u = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f30964v;
    }

    @Override // com.google.android.gms.internal.ads.CC, java.util.Iterator
    public final Object next() {
        if (this.f30964v) {
            throw new NoSuchElementException();
        }
        this.f30964v = true;
        return this.f30963u;
    }
}
