package m;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class Q extends F.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f39054h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f39055j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V f39056k;

    public Q(V v9, int i, int i6, WeakReference weakReference) {
        this.f39056k = v9;
        this.f39054h = i;
        this.i = i6;
        this.f39055j = weakReference;
    }

    @Override // F.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f39054h) != -1) {
            typeface = U.a(typeface, i, (this.i & 2) != 0);
        }
        V v9 = this.f39056k;
        if (v9.f39075m) {
            v9.f39074l = typeface;
            TextView textView = (TextView) this.f39055j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new M0.i(v9.f39072j, 2, textView, typeface));
                } else {
                    textView.setTypeface(typeface, v9.f39072j);
                }
            }
        }
    }

    @Override // F.b
    public final void g(int i) {
    }
}
