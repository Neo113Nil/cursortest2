package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.pjc;
import defpackage.x0q;

/* loaded from: classes4.dex */
public final class j1 implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.properties.x a;
    public final com.yandex.passport.internal.flags.i b;
    public final com.yandex.passport.internal.report.reporters.l c;
    public final com.yandex.passport.internal.core.accounts.p d;

    public j1(com.yandex.passport.internal.properties.x xVar, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.report.reporters.l lVar, com.yandex.passport.internal.core.accounts.p pVar) {
        xVar.getClass();
        iVar.getClass();
        lVar.getClass();
        pVar.getClass();
        this.a = xVar;
        this.b = iVar;
        this.c = lVar;
        this.d = pVar;
    }

    @Override // com.yandex.passport.common.mvi.e
    public final pjc a(x0q x0qVar) {
        x0qVar.getClass();
        return new com.yandex.passport.common.mvi.d(new com.yandex.passport.internal.t(x0qVar, 19), this, 10);
    }
}
