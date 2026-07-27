package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.oB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3674oB extends CC implements ListIterator {

    /* renamed from: u, reason: collision with root package name */
    public final int f33113u;

    /* renamed from: v, reason: collision with root package name */
    public int f33114v;

    public AbstractC3674oB(int i, int i4) {
        super(0);
        PA.b0(i4, i);
        this.f33113u = i;
        this.f33114v = i4;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f33114v < this.f33113u;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33114v > 0;
    }

    @Override // com.google.android.gms.internal.ads.CC, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f33114v;
        this.f33114v = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33114v;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f33114v - 1;
        this.f33114v = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33114v - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
