package E0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f291f;

    /* renamed from: g, reason: collision with root package name */
    public int f292g;

    public a(Object[] objArr) {
        this.f291f = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f292g < this.f291f.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f291f;
            int i2 = this.f292g;
            this.f292g = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f292g--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
