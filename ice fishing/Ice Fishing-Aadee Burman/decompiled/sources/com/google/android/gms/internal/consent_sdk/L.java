package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class L extends Q {

    /* renamed from: n, reason: collision with root package name */
    public final Object f35563n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f35564u;

    public L(Object obj) {
        this.f35563n = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f35564u;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f35564u) {
            throw new NoSuchElementException();
        }
        this.f35564u = true;
        return this.f35563n;
    }
}
