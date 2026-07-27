package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class BK implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public DK f24026n;

    /* renamed from: u, reason: collision with root package name */
    public DK f24027u;

    /* renamed from: v, reason: collision with root package name */
    public int f24028v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EK f24029w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f24030x;

    public BK(EK ek, int i) {
        this.f24030x = i;
        Objects.requireNonNull(ek);
        this.f24029w = ek;
        this.f24026n = ek.f24705x.f24421w;
        this.f24027u = null;
        this.f24028v = ek.f24704w;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DK a() {
        DK dk = this.f24026n;
        EK ek = this.f24029w;
        if (dk == ek.f24705x) {
            throw new NoSuchElementException();
        }
        if (ek.f24704w != this.f24028v) {
            throw new ConcurrentModificationException();
        }
        this.f24026n = dk.f24421w;
        this.f24027u = dk;
        return dk;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24026n != this.f24029w.f24705x;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f24030x) {
            case 1:
                return a().f24423y;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        DK dk = this.f24027u;
        if (dk == null) {
            throw new IllegalStateException();
        }
        EK ek = this.f24029w;
        ek.b(dk, true);
        this.f24027u = null;
        this.f24028v = ek.f24704w;
    }
}
