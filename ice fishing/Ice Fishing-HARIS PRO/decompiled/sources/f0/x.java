package f0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import r.AbstractC0341i;
import r.C0343k;

/* loaded from: classes.dex */
public final class x implements Iterator, E1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f2995a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f2997c;

    public x(y yVar) {
        this.f2997c = yVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2995a + 1 < this.f2997c.f2999k.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2996b = true;
        C0343k c0343k = this.f2997c.f2999k;
        int i = this.f2995a + 1;
        this.f2995a = i;
        return (w) c0343k.f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2996b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        C0343k c0343k = this.f2997c.f2999k;
        ((w) c0343k.f(this.f2995a)).f2989b = null;
        int i = this.f2995a;
        Object[] objArr = c0343k.f4325c;
        Object obj = objArr[i];
        Object obj2 = AbstractC0341i.f4319b;
        if (obj != obj2) {
            objArr[i] = obj2;
            c0343k.f4323a = true;
        }
        this.f2995a = i - 1;
        this.f2996b = false;
    }
}
