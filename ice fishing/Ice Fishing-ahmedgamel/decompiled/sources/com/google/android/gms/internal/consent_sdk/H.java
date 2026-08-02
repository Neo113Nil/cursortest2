package com.google.android.gms.internal.consent_sdk;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class H extends Q implements ListIterator {

    /* renamed from: n, reason: collision with root package name */
    public final int f36291n;

    /* renamed from: u, reason: collision with root package name */
    public int f36292u;

    /* renamed from: v, reason: collision with root package name */
    public final J f36293v;

    public H(J j6, int i) {
        int size = j6.size();
        E.d(i, size);
        this.f36291n = size;
        this.f36292u = i;
        this.f36293v = j6;
    }

    public final Object a(int i) {
        return this.f36293v.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f36292u < this.f36291n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f36292u > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f36292u;
        this.f36292u = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f36292u;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f36292u - 1;
        this.f36292u = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f36292u - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
