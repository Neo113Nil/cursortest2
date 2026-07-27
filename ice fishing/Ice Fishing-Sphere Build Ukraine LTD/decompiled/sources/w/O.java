package w;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class O extends N {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f3041q = 0;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        S.a(windowInsets, null);
    }

    public O(S s2, WindowInsets windowInsets) {
        super(s2, windowInsets);
    }

    @Override // w.J, w.P
    public boolean m(int i2) {
        boolean isVisible;
        isVisible = this.f3032c.isVisible(Q.a(i2));
        return isVisible;
    }

    @Override // w.J, w.P
    public final void d(View view) {
    }
}
