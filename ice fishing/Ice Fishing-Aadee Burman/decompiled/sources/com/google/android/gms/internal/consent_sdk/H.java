package com.google.android.gms.internal.consent_sdk;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class H extends Q implements ListIterator {

    /* renamed from: n, reason: collision with root package name */
    public final int f35522n;

    /* renamed from: u, reason: collision with root package name */
    public int f35523u;

    /* renamed from: v, reason: collision with root package name */
    public final J f35524v;

    public H(J j6, int i) {
        int size = j6.size();
        E.d(i, size);
        this.f35522n = size;
        this.f35523u = i;
        this.f35524v = j6;
    }

    public final Object a(int i) {
        return this.f35524v.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f35523u < this.f35522n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f35523u > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f35523u;
        this.f35523u = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f35523u;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f35523u - 1;
        this.f35523u = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f35523u - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
