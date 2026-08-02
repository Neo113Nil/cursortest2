package defpackage;

import android.os.Build;
import android.view.View;
import androidx.core.view.a;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public abstract class e9h {
    public int a;
    public int b;
    public int c;
    public Object d;

    public e9h() {
        if (euk.a == null) {
            euk.a = new euk();
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public void b() {
        if (((f9h) this.d).h == this.c) {
            return;
        }
        xq0.i();
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.a;
            f9h f9hVar = (f9h) this.d;
            if (i >= f9hVar.f || f9hVar.c[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            a e = wdu.e(view);
            if (e == null) {
                e = new a();
            }
            wdu.q(view, e);
            view.setTag(this.a, obj);
            wdu.k(this.c, view);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.a < ((f9h) this.d).f;
    }

    public void remove() {
        f9h f9hVar = (f9h) this.d;
        b();
        if (this.b == -1) {
            xq0.q("Call next() before removing element from the iterator.");
            return;
        }
        f9hVar.c();
        f9hVar.l(this.b);
        this.b = -1;
        this.c = f9hVar.h;
    }
}
