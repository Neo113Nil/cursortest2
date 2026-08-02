package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3854rK implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public C4016uK f34324n;

    /* renamed from: u, reason: collision with root package name */
    public C4016uK f34325u;

    /* renamed from: v, reason: collision with root package name */
    public int f34326v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C4070vK f34327w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f34328x;

    public C3854rK(C4070vK c4070vK, int i) {
        this.f34328x = i;
        Objects.requireNonNull(c4070vK);
        this.f34327w = c4070vK;
        this.f34324n = c4070vK.f35455x.f35295w;
        this.f34325u = null;
        this.f34326v = c4070vK.f35454w;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4016uK a() {
        C4016uK c4016uK = this.f34324n;
        C4070vK c4070vK = this.f34327w;
        if (c4016uK == c4070vK.f35455x) {
            throw new NoSuchElementException();
        }
        if (c4070vK.f35454w != this.f34326v) {
            throw new ConcurrentModificationException();
        }
        this.f34324n = c4016uK.f35295w;
        this.f34325u = c4016uK;
        return c4016uK;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34324n != this.f34327w.f35455x;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f34328x) {
            case 1:
                return a().f35297y;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C4016uK c4016uK = this.f34325u;
        if (c4016uK == null) {
            throw new IllegalStateException();
        }
        C4070vK c4070vK = this.f34327w;
        c4070vK.b(c4016uK, true);
        this.f34325u = null;
        this.f34326v = c4070vK.f35454w;
    }
}
