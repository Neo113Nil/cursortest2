package O;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import w7.C5158f;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: n, reason: collision with root package name */
    public int f2130n;

    /* renamed from: u, reason: collision with root package name */
    public int f2131u;

    /* renamed from: v, reason: collision with root package name */
    public int f2132v;

    /* renamed from: w, reason: collision with root package name */
    public Object f2133w;

    public I() {
        if (G3.e.f1076u == null) {
            G3.e.f1076u = new G3.e(14);
        }
    }

    public int a(int i) {
        if (i < this.f2132v) {
            return ((ByteBuffer) this.f2133w).getShort(this.f2131u + i);
        }
        return 0;
    }

    public void b() {
        if (((C5158f) this.f2133w).f41732A != this.f2132v) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f2130n;
            C5158f c5158f = (C5158f) this.f2133w;
            if (i >= c5158f.f41743y || c5158f.f41740v[i] >= 0) {
                return;
            } else {
                this.f2130n = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f2131u) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f2131u) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f2130n);
            if (!((Class) this.f2133w).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate d9 = X.d(view);
            C0328b c0328b = d9 == null ? null : d9 instanceof C0326a ? ((C0326a) d9).f2148a : new C0328b(d9);
            if (c0328b == null) {
                c0328b = new C0328b();
            }
            X.o(view, c0328b);
            view.setTag(this.f2130n, obj);
            X.i(this.f2132v, view);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f2130n < ((C5158f) this.f2133w).f41743y;
    }

    public void remove() {
        b();
        if (this.f2131u == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C5158f c5158f = (C5158f) this.f2133w;
        c5158f.d();
        c5158f.m(this.f2131u);
        this.f2131u = -1;
        this.f2132v = c5158f.f41732A;
    }
}
