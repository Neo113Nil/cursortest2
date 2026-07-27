package k;

import D.C0013n;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final int f2651e;

    /* renamed from: f, reason: collision with root package name */
    public int f2652f;

    /* renamed from: g, reason: collision with root package name */
    public int f2653g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2654h = false;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0013n f2655i;

    public e(C0013n c0013n, int i2) {
        this.f2655i = c0013n;
        this.f2651e = i2;
        this.f2652f = ((C0189a) c0013n.f246d).f2669g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2653g < this.f2652f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f2655i.b(this.f2653g, this.f2651e);
        this.f2653g++;
        this.f2654h = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2654h) {
            throw new IllegalStateException();
        }
        int i2 = this.f2653g - 1;
        this.f2653g = i2;
        this.f2652f--;
        this.f2654h = false;
        this.f2655i.c(i2);
    }
}
