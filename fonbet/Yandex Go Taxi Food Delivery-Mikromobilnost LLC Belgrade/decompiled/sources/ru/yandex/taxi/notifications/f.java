package ru.yandex.taxi.notifications;

import defpackage.h3y;
import defpackage.jy60;
import defpackage.jyn;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.xi60;

/* loaded from: classes9.dex */
public final class f implements jy60 {
    public final h3y a;
    public final jyn b;

    public f(h3y h3yVar, jyn jynVar) {
        this.a = h3yVar;
        this.b = jynVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "NotificationPermissionInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        this.b.getClass();
        xi60 xi60Var = (xi60) this.a.get();
        tse tseVar = xi60Var.a;
        xi60Var.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(tseVar, mdh.b, null, new NotificationPermissionInteractor$onFirstContentfulPaint$1(xi60Var, null), 2);
    }
}
