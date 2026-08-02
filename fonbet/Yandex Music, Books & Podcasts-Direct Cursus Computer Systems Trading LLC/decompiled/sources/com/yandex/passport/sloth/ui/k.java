package com.yandex.passport.sloth.ui;

import defpackage.dfi;
import java.util.Map;

/* loaded from: classes4.dex */
public final class k implements com.yandex.passport.sloth.ui.dependencies.q {
    public final /* synthetic */ com.yandex.passport.sloth.ui.dependencies.q a;
    public final /* synthetic */ g b;

    public k(com.yandex.passport.sloth.ui.dependencies.q qVar, g gVar) {
        this.a = qVar;
        this.b = gVar;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.q
    public final void a(e1 e1Var) {
        this.a.a(e1Var);
        String obj = e1Var.toString();
        obj.getClass();
        com.yandex.passport.sloth.r0 r0Var = com.yandex.passport.sloth.r0.UI_WISH;
        Map n = dfi.n("ui_wish", obj);
        com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) this.b).a;
        oVar.getClass();
        if (oVar.a()) {
            r0Var.getClass();
            oVar.a.a("sloth.reportWebAmEvent.".concat("sloth_ui_wish"), n);
        }
    }
}
