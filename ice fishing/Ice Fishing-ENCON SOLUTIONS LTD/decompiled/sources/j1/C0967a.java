package j1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0967a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final C0969c f8034a;

    /* renamed from: b, reason: collision with root package name */
    public int f8035b;

    /* renamed from: c, reason: collision with root package name */
    public int f8036c;

    /* renamed from: d, reason: collision with root package name */
    public int f8037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8038e;

    public C0967a(C0969c map, int i2) {
        this.f8038e = i2;
        i.e(map, "map");
        this.f8034a = map;
        this.f8036c = -1;
        this.f8037d = map.f8050h;
        b();
    }

    public final void a() {
        if (this.f8034a.f8050h != this.f8037d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i2 = this.f8035b;
            C0969c c0969c = this.f8034a;
            if (i2 >= c0969c.f8048f || c0969c.f8045c[i2] >= 0) {
                return;
            } else {
                this.f8035b = i2 + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8035b < this.f8034a.f8048f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8038e) {
            case 0:
                a();
                int i2 = this.f8035b;
                C0969c c0969c = this.f8034a;
                if (i2 >= c0969c.f8048f) {
                    throw new NoSuchElementException();
                }
                this.f8035b = i2 + 1;
                this.f8036c = i2;
                C0968b c0968b = new C0968b(c0969c, i2);
                b();
                return c0968b;
            case 1:
                a();
                int i3 = this.f8035b;
                C0969c c0969c2 = this.f8034a;
                if (i3 >= c0969c2.f8048f) {
                    throw new NoSuchElementException();
                }
                this.f8035b = i3 + 1;
                this.f8036c = i3;
                Object obj = c0969c2.f8043a[i3];
                b();
                return obj;
            default:
                a();
                int i4 = this.f8035b;
                C0969c c0969c3 = this.f8034a;
                if (i4 >= c0969c3.f8048f) {
                    throw new NoSuchElementException();
                }
                this.f8035b = i4 + 1;
                this.f8036c = i4;
                Object[] objArr = c0969c3.f8044b;
                i.b(objArr);
                Object obj2 = objArr[this.f8036c];
                b();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        if (this.f8036c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C0969c c0969c = this.f8034a;
        c0969c.b();
        c0969c.k(this.f8036c);
        this.f8036c = -1;
        this.f8037d = c0969c.f8050h;
    }
}
