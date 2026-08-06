package y;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: y.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1082o implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public Q f8594a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f8595b;

    public ViewOnApplyWindowInsetsListenerC1082o(View view, InterfaceC1077j interfaceC1077j) {
        this.f8595b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Q a2 = Q.a(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC1083p.a(windowInsets, this.f8595b);
            if (a2.equals(this.f8594a)) {
                throw null;
            }
        }
        this.f8594a = a2;
        throw null;
    }
}
