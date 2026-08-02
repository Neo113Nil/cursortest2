package ru.yandex.taxi.widget;

import defpackage.c230;
import defpackage.d230;
import defpackage.ga1;
import defpackage.lxo0;
import defpackage.scs0;
import defpackage.u130;
import defpackage.v130;

/* loaded from: classes10.dex */
public final class h extends u130 {
    public final SlideableModalView d;

    public h(SlideableModalView slideableModalView) {
        super(slideableModalView);
        this.d = slideableModalView;
    }

    @Override // defpackage.u130
    public final void b(c230 c230Var) {
        a(c230Var, new ga1(16, c230Var, this, this.d));
    }

    @Override // defpackage.u130
    public final void c(d230 d230Var) {
        a(d230Var, new scs0(this, this.d, d230Var));
    }

    @Override // defpackage.u130
    public final void d(v130 v130Var) {
        a(v130Var, new lxo0(15, this, this.d, v130Var));
    }

    @Override // defpackage.u130
    public final ModalView e() {
        return this.d;
    }
}
