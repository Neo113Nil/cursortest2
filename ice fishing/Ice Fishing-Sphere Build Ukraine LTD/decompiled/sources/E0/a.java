package E0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f292e;

    /* renamed from: f, reason: collision with root package name */
    public int f293f;

    public a(Object[] objArr) {
        this.f292e = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f293f < this.f292e.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f292e;
            int i2 = this.f293f;
            this.f293f = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f293f--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
