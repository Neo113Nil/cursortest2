package ru.yandex.taxi.masstransit.domain;

import defpackage.fq30;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.yvf0;

/* loaded from: classes6.dex */
public final class e {
    public final yvf0 a;
    public final h b;

    public e(yvf0 yvf0Var, h hVar) {
        this.a = yvf0Var;
        this.b = hVar;
    }

    public final void a(String str, String str2, String str3) {
        fq30 fq30Var = this.b.a;
        tse tseVar = fq30Var.d;
        fq30Var.e.getClass();
        sjh sjhVar = uyj.a;
        tje.N(tseVar, mdh.b, null, new MtNotificationsRepository$showNotification$1(str3, fq30Var, str, str2, 0L, 6000L, null), 2);
    }
}
