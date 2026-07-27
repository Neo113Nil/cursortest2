package O;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class K implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public A0 f2232a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0358u f2234c;

    public K(View view, InterfaceC0358u interfaceC0358u) {
        this.f2233b = view;
        this.f2234c = interfaceC0358u;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        A0 h9 = A0.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0358u interfaceC0358u = this.f2234c;
        if (i < 30) {
            L.a(windowInsets, this.f2233b);
            if (h9.equals(this.f2232a)) {
                return interfaceC0358u.k(view, h9).g();
            }
        }
        this.f2232a = h9;
        A0 k6 = interfaceC0358u.k(view, h9);
        if (i >= 30) {
            return k6.g();
        }
        WeakHashMap weakHashMap = X.f2240a;
        J.c(view);
        return k6.g();
    }
}
