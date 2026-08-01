package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.consent_sdk.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4319f2 implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public int f35672n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final int f35673u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4327h2 f35674v;

    public C4319f2(C4327h2 c4327h2) {
        this.f35674v = c4327h2;
        this.f35673u = c4327h2.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35672n < this.f35673u;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f35672n;
        if (i >= this.f35673u) {
            throw new NoSuchElementException();
        }
        this.f35672n = i + 1;
        return Byte.valueOf(this.f35674v.c(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
