package uc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements Iterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f6738g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6739h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6740i;

    /* renamed from: j, reason: collision with root package name */
    public int f6741j;

    public c(int i10, int i11, int i12) {
        this.f6738g = i12;
        this.f6739h = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f6740i = z10;
        this.f6741j = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6740i;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i10 = this.f6741j;
        if (i10 != this.f6739h) {
            this.f6741j = this.f6738g + i10;
            return i10;
        }
        if (!this.f6740i) {
            throw new NoSuchElementException();
        }
        this.f6740i = false;
        return i10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
