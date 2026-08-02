package ru.yandex.taxi.analytics.autologging;

import androidx.lifecycle.Lifecycle;
import defpackage.jy60;
import defpackage.t94;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class a implements jy60 {
    public final Lifecycle a;
    public final tse b;
    public final t94 c;

    public a(Lifecycle lifecycle, tse tseVar, t94 t94Var) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = t94Var;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AutologgingController";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.b, null, null, new AutologgingController$onFirstContentfulPaint$1(this, null), 3);
    }
}
