package ru.yandex.taxi.masstransit.stop.ui.overlay;

import defpackage.c240;
import defpackage.e240;
import defpackage.j741;
import defpackage.tje;
import defpackage.uo21;

/* loaded from: classes6.dex */
public final class a {
    public final e240 a;
    public final j741 b;
    public final uo21 c;

    public a(e240 e240Var, j741 j741Var, uo21 uo21Var) {
        this.a = e240Var;
        this.b = j741Var;
        this.c = uo21Var;
    }

    public final void a() {
        c240 c240Var = new c240(this);
        e240 e240Var = this.a;
        e240Var.Bg(c240Var);
        tje.N(e240Var.Jg(), null, null, new MtStopOverlayPresenter$attachView$1(e240Var, null), 3);
        tje.N(e240Var.Jg(), null, null, new MtStopOverlayPresenter$attachView$2(e240Var, null), 3);
        tje.N(e240Var.Jg(), null, null, new MtStopOverlayPresenter$attachView$3(e240Var, c240Var, null), 3);
    }
}
