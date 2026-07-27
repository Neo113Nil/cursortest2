package O;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class K implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public A0 f2046a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0345u f2048c;

    public K(View view, InterfaceC0345u interfaceC0345u) {
        this.f2047b = view;
        this.f2048c = interfaceC0345u;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        A0 h9 = A0.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0345u interfaceC0345u = this.f2048c;
        if (i < 30) {
            L.a(windowInsets, this.f2047b);
            if (h9.equals(this.f2046a)) {
                return interfaceC0345u.q(view, h9).g();
            }
        }
        this.f2046a = h9;
        A0 q8 = interfaceC0345u.q(view, h9);
        if (i >= 30) {
            return q8.g();
        }
        WeakHashMap weakHashMap = X.f2054a;
        J.c(view);
        return q8.g();
    }
}
