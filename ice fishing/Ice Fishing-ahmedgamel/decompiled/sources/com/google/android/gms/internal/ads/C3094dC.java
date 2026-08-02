package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.dC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3094dC extends AbstractC4278zC {

    /* renamed from: u, reason: collision with root package name */
    public final Object f30498u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30499v;

    public C3094dC(Object obj) {
        super(0);
        this.f30498u = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f30499v;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4278zC, java.util.Iterator
    public final Object next() {
        if (this.f30499v) {
            throw new NoSuchElementException();
        }
        this.f30499v = true;
        return this.f30498u;
    }
}
