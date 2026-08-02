package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.consent_sdk.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4342f2 implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public int f36441n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final int f36442u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4350h2 f36443v;

    public C4342f2(C4350h2 c4350h2) {
        this.f36443v = c4350h2;
        this.f36442u = c4350h2.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36441n < this.f36442u;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f36441n;
        if (i >= this.f36442u) {
            throw new NoSuchElementException();
        }
        this.f36441n = i + 1;
        return Byte.valueOf(this.f36443v.c(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
