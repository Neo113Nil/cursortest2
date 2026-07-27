package w;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: w.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0283o implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public S f3067a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3068b;

    public ViewOnApplyWindowInsetsListenerC0283o(View view, InterfaceC0278j interfaceC0278j) {
        this.f3068b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        S a2 = S.a(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0284p.a(windowInsets, this.f3068b);
            if (a2.equals(this.f3067a)) {
                throw null;
            }
        }
        this.f3067a = a2;
        throw null;
    }
}
