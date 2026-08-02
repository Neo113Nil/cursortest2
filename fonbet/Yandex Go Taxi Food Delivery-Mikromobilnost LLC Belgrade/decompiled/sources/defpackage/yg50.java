package defpackage;

import android.view.View;
import com.yandex.go.platform.navigation.impl.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class yg50 implements bx60 {
    public final /* synthetic */ d a;

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        k751 k751Var = n751Var.a;
        u1w h = k751Var.h(519);
        u1w g = k751Var.g(8);
        int i = h.b;
        d dVar = this.a;
        int max = Math.max(h.d, g.d - (dVar.c().getVisibility() == 0 ? dVar.c().getHeight() : 0));
        view.setPadding(0, i, 0, max);
        return k751Var.n(0, i, 0, max);
    }
}
