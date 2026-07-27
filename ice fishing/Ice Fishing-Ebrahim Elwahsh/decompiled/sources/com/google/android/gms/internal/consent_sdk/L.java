package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class L extends Q {

    /* renamed from: n, reason: collision with root package name */
    public final Object f35726n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f35727u;

    public L(Object obj) {
        this.f35726n = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f35727u;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f35727u) {
            throw new NoSuchElementException();
        }
        this.f35727u = true;
        return this.f35726n;
    }
}
