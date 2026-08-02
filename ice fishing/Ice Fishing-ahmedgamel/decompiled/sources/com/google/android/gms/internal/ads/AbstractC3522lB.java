package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.lB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3522lB extends AbstractC4278zC implements ListIterator {

    /* renamed from: u, reason: collision with root package name */
    public final int f32523u;

    /* renamed from: v, reason: collision with root package name */
    public int f32524v;

    public AbstractC3522lB(int i, int i4) {
        super(0);
        AbstractC2792Sd.L(i4, i);
        this.f32523u = i;
        this.f32524v = i4;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f32524v < this.f32523u;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f32524v > 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4278zC, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f32524v;
        this.f32524v = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f32524v;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f32524v - 1;
        this.f32524v = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f32524v - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
