package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class L extends Q {

    /* renamed from: n, reason: collision with root package name */
    public final Object f36332n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f36333u;

    public L(Object obj) {
        this.f36332n = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f36333u;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f36333u) {
            throw new NoSuchElementException();
        }
        this.f36333u = true;
        return this.f36332n;
    }
}
