package ru.yandex.taxi.masstransit.stoproute.ui.overlay;

import com.yandex.go.coroutines.b;
import defpackage.b340;
import defpackage.d240;
import defpackage.gw30;
import defpackage.i3y;
import defpackage.tje;
import defpackage.xm00;
import defpackage.z240;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes6.dex */
public final class a {
    public final b340 a;
    public final gw30 b;
    public final xm00 c;
    public final i3y d = kotlin.a.b(LazyThreadSafetyMode.NONE, new d240(1, this));

    public a(b340 b340Var, gw30 gw30Var, xm00 xm00Var) {
        this.a = b340Var;
        this.b = gw30Var;
        this.c = xm00Var;
    }

    public final void a() {
        z240 z240Var = new z240(this);
        b340 b340Var = this.a;
        b340Var.Bg(z240Var);
        b.g(b340Var.Jg(), null, null, new MtStopRouteOverlayPresenter$attachView$1(b340Var, z240Var, null), 3);
        if (b340Var.y) {
            tje.N(b340Var.Jg(), null, null, new MtStopRouteOverlayPresenter$attachView$2(b340Var, null), 3);
        } else {
            tje.N(b340Var.Jg(), null, null, new MtStopRouteOverlayPresenter$attachView$3(b340Var, null), 3);
        }
    }
}
