package defpackage;

import android.window.OnBackInvokedDispatcher;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes7.dex */
public final class qe81 implements c881 {
    public final AdActivity a;
    public final ch81 b;
    public final frr c = new frr(3, this);

    public qe81(AdActivity adActivity, ch81 ch81Var) {
        this.a = adActivity;
        this.b = ch81Var;
    }

    @Override // defpackage.c881
    public final void a() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = this.a.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.c);
    }

    @Override // defpackage.c881
    public final void destroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = this.a.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.c);
    }
}
