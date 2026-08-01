package O;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class A implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public j0 f740a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0039o f742c;

    public A(View view, InterfaceC0039o interfaceC0039o) {
        this.f741b = view;
        this.f742c = interfaceC0039o;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        j0 g2 = j0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0039o interfaceC0039o = this.f742c;
        if (i < 30) {
            B.a(windowInsets, this.f741b);
            if (g2.equals(this.f740a)) {
                return interfaceC0039o.s(view, g2).f();
            }
        }
        this.f740a = g2;
        j0 s2 = interfaceC0039o.s(view, g2);
        if (i >= 30) {
            return s2.f();
        }
        WeakHashMap weakHashMap = K.f747a;
        AbstractC0049z.c(view);
        return s2.f();
    }
}
