package H0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final int f400e;

    /* renamed from: f, reason: collision with root package name */
    public final int f401f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f402g;

    /* renamed from: h, reason: collision with root package name */
    public int f403h;

    public b(int i2, int i3, int i4) {
        this.f400e = i4;
        this.f401f = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f402g = z2;
        this.f403h = z2 ? i2 : i3;
    }

    public final int a() {
        int i2 = this.f403h;
        if (i2 != this.f401f) {
            this.f403h = this.f400e + i2;
        } else {
            if (!this.f402g) {
                throw new NoSuchElementException();
            }
            this.f402g = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f402g;
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
