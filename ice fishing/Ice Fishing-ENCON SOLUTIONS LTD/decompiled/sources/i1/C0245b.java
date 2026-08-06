package i1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0245b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3400a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f3401b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3402c;

    public C0245b(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        this.f3402c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f3400a) {
            case 0:
                return this.f3401b < ((AbstractC0248e) this.f3402c).a();
            case 1:
                return this.f3401b < ((Object[]) this.f3402c).length;
        }
        while (true) {
            int i2 = this.f3401b;
            it = (Iterator) this.f3402c;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f3401b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f3400a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f3401b;
                this.f3401b = i2 + 1;
                return ((AbstractC0248e) this.f3402c).get(i2);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f3402c;
                    int i3 = this.f3401b;
                    this.f3401b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f3401b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i4 = this.f3401b;
            it = (Iterator) this.f3402c;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f3401b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3400a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0245b(AbstractC0248e abstractC0248e) {
        this.f3402c = abstractC0248e;
    }

    public C0245b(y1.b bVar) {
        this.f3402c = bVar.f8605a.iterator();
        this.f3401b = bVar.f8606b;
    }
}
