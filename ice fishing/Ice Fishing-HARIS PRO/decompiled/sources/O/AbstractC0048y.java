package O;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* renamed from: O.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0048y {

    /* renamed from: a, reason: collision with root package name */
    public int f836a;

    /* renamed from: b, reason: collision with root package name */
    public int f837b;

    /* renamed from: c, reason: collision with root package name */
    public int f838c;

    /* renamed from: d, reason: collision with root package name */
    public Object f839d;

    public AbstractC0048y() {
        if (S0.e.f1059b == null) {
            S0.e.f1059b = new S0.e(13);
        }
    }

    public int a(int i) {
        if (i < this.f838c) {
            return ((ByteBuffer) this.f839d).getShort(this.f837b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f837b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f837b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f836a);
            if (!((Class) this.f839d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate c2 = K.c(view);
            C0026b c0026b = c2 == null ? null : c2 instanceof C0025a ? ((C0025a) c2).f783a : new C0026b(c2);
            if (c0026b == null) {
                c0026b = new C0026b();
            }
            K.l(view, c0026b);
            view.setTag(this.f836a, obj);
            K.g(view, this.f838c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
