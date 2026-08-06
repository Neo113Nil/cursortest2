package w1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1061b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f8519a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8520b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8521c;

    /* renamed from: d, reason: collision with root package name */
    public int f8522d;

    public C1061b(int i2, int i3, int i4) {
        this.f8519a = i4;
        this.f8520b = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f8521c = z2;
        this.f8522d = z2 ? i2 : i3;
    }

    public final int a() {
        int i2 = this.f8522d;
        if (i2 != this.f8520b) {
            this.f8522d = this.f8519a + i2;
        } else {
            if (!this.f8521c) {
                throw new NoSuchElementException();
            }
            this.f8521c = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8521c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
