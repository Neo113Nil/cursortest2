package r;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334b implements Iterator, E1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f4299a;

    /* renamed from: b, reason: collision with root package name */
    public int f4300b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4301c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4302d;
    public final /* synthetic */ Object e;

    public C0334b(int i) {
        this.f4299a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4300b < this.f4299a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f2;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f4300b;
        switch (this.f4302d) {
            case 0:
                f2 = ((C0338f) this.e).f(i);
                break;
            case 1:
                f2 = ((C0338f) this.e).i(i);
                break;
            default:
                f2 = ((C0339g) this.e).f4312b[i];
                break;
        }
        this.f4300b++;
        this.f4301c = true;
        return f2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4301c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f4300b - 1;
        this.f4300b = i;
        switch (this.f4302d) {
            case 0:
                ((C0338f) this.e).g(i);
                break;
            case 1:
                ((C0338f) this.e).g(i);
                break;
            default:
                ((C0339g) this.e).a(i);
                break;
        }
        this.f4299a--;
        this.f4301c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0334b(C0339g c0339g) {
        this(c0339g.f4313c);
        this.f4302d = 2;
        this.e = c0339g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0334b(C0338f c0338f, int i) {
        this(c0338f.f4322c);
        this.f4302d = i;
        switch (i) {
            case 1:
                this.e = c0338f;
                this(c0338f.f4322c);
                break;
            default:
                this.e = c0338f;
                break;
        }
    }
}
