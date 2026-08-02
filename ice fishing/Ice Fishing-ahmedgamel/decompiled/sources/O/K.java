package O;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class K implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public A0 f2134a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0350u f2136c;

    public K(View view, InterfaceC0350u interfaceC0350u) {
        this.f2135b = view;
        this.f2136c = interfaceC0350u;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        A0 h3 = A0.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0350u interfaceC0350u = this.f2136c;
        if (i < 30) {
            L.a(windowInsets, this.f2135b);
            if (h3.equals(this.f2134a)) {
                return interfaceC0350u.p(view, h3).g();
            }
        }
        this.f2134a = h3;
        A0 p9 = interfaceC0350u.p(view, h3);
        if (i >= 30) {
            return p9.g();
        }
        WeakHashMap weakHashMap = X.f2142a;
        J.c(view);
        return p9.g();
    }
}
