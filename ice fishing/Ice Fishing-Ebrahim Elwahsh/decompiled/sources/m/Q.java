package m;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class Q extends F.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f39321h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f39322j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V f39323k;

    public Q(V v6, int i, int i4, WeakReference weakReference) {
        this.f39323k = v6;
        this.f39321h = i;
        this.i = i4;
        this.f39322j = weakReference;
    }

    @Override // F.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f39321h) != -1) {
            typeface = U.a(typeface, i, (this.i & 2) != 0);
        }
        V v6 = this.f39323k;
        if (v6.f39346m) {
            v6.f39345l = typeface;
            TextView textView = (TextView) this.f39322j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new M0.i(v6.f39343j, 2, textView, typeface));
                } else {
                    textView.setTypeface(typeface, v6.f39343j);
                }
            }
        }
    }

    @Override // F.b
    public final void g(int i) {
    }
}
