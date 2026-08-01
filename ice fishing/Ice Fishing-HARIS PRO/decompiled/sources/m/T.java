package m;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class T extends F.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3886h;
    public final /* synthetic */ int i;
    public final /* synthetic */ WeakReference j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X f3887k;

    public T(X x2, int i, int i2, WeakReference weakReference) {
        this.f3887k = x2;
        this.f3886h = i;
        this.i = i2;
        this.j = weakReference;
    }

    @Override // F.b
    public final void g(int i) {
    }

    @Override // F.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f3886h) != -1) {
            typeface = W.a(typeface, i, (this.i & 2) != 0);
        }
        X x2 = this.f3887k;
        if (x2.f3900m) {
            x2.f3899l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new B0.b(textView, typeface, x2.j));
                } else {
                    textView.setTypeface(typeface, x2.j);
                }
            }
        }
    }
}
