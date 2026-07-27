package O;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import w7.C5159f;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: n, reason: collision with root package name */
    public int f2042n;

    /* renamed from: u, reason: collision with root package name */
    public int f2043u;

    /* renamed from: v, reason: collision with root package name */
    public int f2044v;

    /* renamed from: w, reason: collision with root package name */
    public Object f2045w;

    public I() {
        if (a4.e.f4347n == null) {
            a4.e.f4347n = new a4.e();
        }
    }

    public int a(int i) {
        if (i < this.f2044v) {
            return ((ByteBuffer) this.f2045w).getShort(this.f2043u + i);
        }
        return 0;
    }

    public void b() {
        if (((C5159f) this.f2045w).f41675A != this.f2044v) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f2042n;
            C5159f c5159f = (C5159f) this.f2045w;
            if (i >= c5159f.f41686y || c5159f.f41683v[i] >= 0) {
                return;
            } else {
                this.f2042n = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f2043u) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f2043u) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f2042n);
            if (!((Class) this.f2045w).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate d2 = X.d(view);
            C0323b c0323b = d2 == null ? null : d2 instanceof C0321a ? ((C0321a) d2).f2060a : new C0323b(d2);
            if (c0323b == null) {
                c0323b = new C0323b();
            }
            X.o(view, c0323b);
            view.setTag(this.f2042n, obj);
            X.i(this.f2044v, view);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f2042n < ((C5159f) this.f2045w).f41686y;
    }

    public void remove() {
        b();
        if (this.f2043u == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C5159f c5159f = (C5159f) this.f2045w;
        c5159f.d();
        c5159f.m(this.f2043u);
        this.f2043u = -1;
        this.f2044v = c5159f.f41675A;
    }
}
