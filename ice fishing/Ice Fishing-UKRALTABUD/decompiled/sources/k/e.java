package k;

import D.C0013n;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public final int f2643f;

    /* renamed from: g, reason: collision with root package name */
    public int f2644g;

    /* renamed from: h, reason: collision with root package name */
    public int f2645h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2646i = false;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0013n f2647j;

    public e(C0013n c0013n, int i2) {
        this.f2647j = c0013n;
        this.f2643f = i2;
        this.f2644g = ((C0189a) c0013n.f245d).f2661h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2645h < this.f2644g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f2647j.b(this.f2645h, this.f2643f);
        this.f2645h++;
        this.f2646i = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2646i) {
            throw new IllegalStateException();
        }
        int i2 = this.f2645h - 1;
        this.f2645h = i2;
        this.f2644g--;
        this.f2646i = false;
        this.f2647j.c(i2);
    }
}
