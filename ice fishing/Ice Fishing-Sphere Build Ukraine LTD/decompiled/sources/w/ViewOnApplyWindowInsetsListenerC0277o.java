package w;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: w.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0277o implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public S f3072a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3073b;

    public ViewOnApplyWindowInsetsListenerC0277o(View view, InterfaceC0272j interfaceC0272j) {
        this.f3073b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        S a2 = S.a(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0278p.a(windowInsets, this.f3073b);
            if (a2.equals(this.f3072a)) {
                throw null;
            }
        }
        this.f3072a = a2;
        throw null;
    }
}
