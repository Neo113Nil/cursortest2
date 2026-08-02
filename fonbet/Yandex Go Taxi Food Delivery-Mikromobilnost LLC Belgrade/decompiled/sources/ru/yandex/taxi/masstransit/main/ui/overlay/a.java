package ru.yandex.taxi.masstransit.main.ui.overlay;

import defpackage.ah00;
import defpackage.f4c0;
import defpackage.gh00;
import defpackage.l30;
import defpackage.qfu0;
import defpackage.tje;
import defpackage.uo21;
import defpackage.vo30;
import defpackage.xm00;
import defpackage.yo30;

/* loaded from: classes6.dex */
public final class a {
    public final yo30 a;
    public final uo21 b;
    public final ah00 c;
    public xm00 d;
    public f4c0 e;
    public f4c0 f;
    public l30 g;

    public a(yo30 yo30Var, uo21 uo21Var, ah00 ah00Var) {
        this.a = yo30Var;
        this.b = uo21Var;
        this.c = ah00Var;
    }

    public static final void a(a aVar, qfu0 qfu0Var, float f) {
        Float f2 = qfu0Var.e;
        boolean z = f2 == null || f2.floatValue() <= f;
        f4c0 f4c0Var = aVar.e;
        if (f4c0Var != null) {
            f4c0Var.i(z);
        }
        f4c0 f4c0Var2 = aVar.f;
        if (f4c0Var2 != null) {
            f4c0Var2.i(z);
        }
    }

    public final void b() {
        this.b.attach();
        vo30 vo30Var = new vo30(this);
        yo30 yo30Var = this.a;
        yo30Var.Bg(vo30Var);
        tje.N(yo30Var.Jg(), null, null, new MtMainOverlayPresenter$attachView$1(yo30Var, vo30Var, null), 3);
        ((gh00) yo30Var.C).e(yo30Var.J);
        tje.N(yo30Var.Jg(), null, null, new MtMainOverlayPresenter$attachView$2(yo30Var, null), 3);
        xm00 p = ((gh00) this.c).i.p();
        p.k(4.0f);
        this.d = p;
    }
}
