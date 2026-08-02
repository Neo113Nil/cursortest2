package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class DB implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public int f25106n;

    /* renamed from: u, reason: collision with root package name */
    public int f25107u;

    /* renamed from: v, reason: collision with root package name */
    public int f25108v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GB f25109w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f25110x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ GB f25111y;

    public DB(GB gb, char c9) {
        Objects.requireNonNull(gb);
        this.f25109w = gb;
        this.f25106n = gb.f25738x;
        this.f25107u = gb.isEmpty() ? -1 : 0;
        this.f25108v = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25107u >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        GB gb = this.f25109w;
        if (gb.f25738x != this.f25106n) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f25107u;
        this.f25108v = i;
        switch (this.f25110x) {
            case 0:
                obj = this.f25111y.c()[i];
                break;
            case 1:
                obj = new FB(this.f25111y, i);
                break;
            default:
                obj = this.f25111y.d()[i];
                break;
        }
        int i4 = this.f25107u + 1;
        if (i4 >= gb.f25739y) {
            i4 = -1;
        }
        this.f25107u = i4;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        GB gb = this.f25109w;
        if (gb.f25738x != this.f25106n) {
            throw new ConcurrentModificationException();
        }
        AbstractC2792Sd.I("no calls to next() since the last call to remove()", this.f25108v >= 0);
        this.f25106n += 32;
        gb.remove(gb.c()[this.f25108v]);
        this.f25107u--;
        this.f25108v = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DB(GB gb, int i) {
        this(gb, (char) 0);
        this.f25110x = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(gb);
                this.f25111y = gb;
                this(gb, (char) 0);
                break;
            case 2:
                Objects.requireNonNull(gb);
                this.f25111y = gb;
                this(gb, (char) 0);
                break;
            default:
                Objects.requireNonNull(gb);
                this.f25111y = gb;
                break;
        }
    }
}
