package D1;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import r.C0343k;

/* loaded from: classes.dex */
public class a implements Iterator, E1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149a;

    /* renamed from: b, reason: collision with root package name */
    public int f150b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f151c;

    public /* synthetic */ a(int i, Object obj) {
        this.f149a = i;
        this.f151c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f149a) {
            case 0:
                if (this.f150b < ((Object[]) this.f151c).length) {
                }
                break;
            case 1:
                if (this.f150b < ((ViewGroup) this.f151c).getChildCount()) {
                }
                break;
            case 2:
                if (this.f150b < ((C0343k) this.f151c).e()) {
                }
                break;
            default:
                if (this.f150b < ((u1.c) this.f151c).a()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f149a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f151c;
                    int i = this.f150b;
                    this.f150b = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f150b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 1:
                int i2 = this.f150b;
                this.f150b = i2 + 1;
                View childAt = ((ViewGroup) this.f151c).getChildAt(i2);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                int i3 = this.f150b;
                this.f150b = i3 + 1;
                return ((C0343k) this.f151c).f(i3);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i4 = this.f150b;
                this.f150b = i4 + 1;
                return ((u1.c) this.f151c).get(i4);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f149a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.f150b - 1;
                this.f150b = i;
                ((ViewGroup) this.f151c).removeViewAt(i);
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
