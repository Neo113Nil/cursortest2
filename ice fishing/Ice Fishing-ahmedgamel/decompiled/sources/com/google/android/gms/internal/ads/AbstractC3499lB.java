package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.lB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3499lB extends AbstractC4255zC implements ListIterator {

    /* renamed from: u, reason: collision with root package name */
    public final int f31743u;

    /* renamed from: v, reason: collision with root package name */
    public int f31744v;

    public AbstractC3499lB(int i, int i6) {
        super(0);
        AbstractC2772Sd.L(i6, i);
        this.f31743u = i;
        this.f31744v = i6;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f31744v < this.f31743u;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f31744v > 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4255zC, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f31744v;
        this.f31744v = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f31744v;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f31744v - 1;
        this.f31744v = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f31744v - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
