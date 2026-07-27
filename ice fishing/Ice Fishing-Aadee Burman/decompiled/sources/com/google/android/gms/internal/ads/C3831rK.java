package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3831rK implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public C3993uK f33556n;

    /* renamed from: u, reason: collision with root package name */
    public C3993uK f33557u;

    /* renamed from: v, reason: collision with root package name */
    public int f33558v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C4047vK f33559w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f33560x;

    public C3831rK(C4047vK c4047vK, int i) {
        this.f33560x = i;
        Objects.requireNonNull(c4047vK);
        this.f33559w = c4047vK;
        this.f33556n = c4047vK.f34692x.f34521w;
        this.f33557u = null;
        this.f33558v = c4047vK.f34691w;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C3993uK a() {
        C3993uK c3993uK = this.f33556n;
        C4047vK c4047vK = this.f33559w;
        if (c3993uK == c4047vK.f34692x) {
            throw new NoSuchElementException();
        }
        if (c4047vK.f34691w != this.f33558v) {
            throw new ConcurrentModificationException();
        }
        this.f33556n = c3993uK.f34521w;
        this.f33557u = c3993uK;
        return c3993uK;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33556n != this.f33559w.f34692x;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f33560x) {
            case 1:
                return a().f34523y;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3993uK c3993uK = this.f33557u;
        if (c3993uK == null) {
            throw new IllegalStateException();
        }
        C4047vK c4047vK = this.f33559w;
        c4047vK.b(c3993uK, true);
        this.f33557u = null;
        this.f33558v = c4047vK.f34691w;
    }
}
