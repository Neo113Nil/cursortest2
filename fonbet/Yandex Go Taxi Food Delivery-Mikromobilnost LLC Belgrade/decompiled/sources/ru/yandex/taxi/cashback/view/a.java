package ru.yandex.taxi.cashback.view;

import android.view.ViewGroup;
import defpackage.b7;
import defpackage.bxx0;
import defpackage.czo0;
import defpackage.fkd;
import defpackage.hbp0;
import defpackage.jbh;
import defpackage.k49;
import defpackage.kn4;
import defpackage.lb7;
import defpackage.o49;
import defpackage.qgb1;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tje;
import defpackage.xrd0;
import ru.yandex.taxi.cashback.experiments.PlusSdkWidgetExperiment;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes9.dex */
public final class a extends kn4 {
    public final ViewGroup b;
    public final String c;
    public final fkd d;
    public final xrd0 e;
    public final k49 f;
    public final lb7 g;
    public final int h;
    public final t1b0 i;
    public qgb1 j;
    public final hbp0 k;

    public a(ViewGroup viewGroup, String str, fkd fkdVar, xrd0 xrd0Var, rqo rqoVar, k49 k49Var, lb7 lb7Var) {
        super(viewGroup);
        this.b = viewGroup;
        this.c = str;
        this.d = fkdVar;
        this.e = xrd0Var;
        this.f = k49Var;
        this.g = lb7Var;
        this.h = (int) c.i(6.0f, viewGroup);
        this.i = ((jbh) rqoVar).e(PlusSdkWidgetExperiment.e);
        this.j = o49.a;
        this.k = new hbp0(new czo0(14), "CashbackTeaserViewHolder", null);
    }

    @Override // defpackage.kn4
    public final void a() {
        hbp0 hbp0Var = this.k;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new CashbackTeaserViewHolder$attach$1(this, null), 3);
        k49 k49Var = this.f;
        bxx0 bxx0Var = k49Var.a;
        if (k49Var.e) {
            return;
        }
        bxx0Var.a(k49Var.b);
        bxx0Var.a(k49Var.c);
        ru.yandex.taxi.lifecycle.c.a(k49Var.d, new b7(15, k49Var));
        k49Var.e = true;
    }

    @Override // defpackage.kn4
    public final void b() {
        this.k.b();
    }
}
