package com.yandex.passport.internal.ui.sloth;

import android.app.Activity;

/* loaded from: classes4.dex */
public final class h {
    public final Activity a;
    public final g b;
    public final com.yandex.passport.common.coroutine.e c;
    public final d d;
    public final com.yandex.passport.internal.sloth.n e;
    public final com.yandex.passport.internal.common.d f;
    public final e g;
    public final com.yandex.passport.internal.sloth.w h;

    public h(Activity activity, g gVar, com.yandex.passport.common.coroutine.e eVar, d dVar, com.yandex.passport.internal.sloth.n nVar, com.yandex.passport.internal.common.d dVar2, e eVar2, com.yandex.passport.internal.sloth.w wVar) {
        activity.getClass();
        gVar.getClass();
        eVar.getClass();
        dVar.getClass();
        nVar.getClass();
        dVar2.getClass();
        eVar2.getClass();
        wVar.getClass();
        this.a = activity;
        this.b = gVar;
        this.c = eVar;
        this.d = dVar;
        this.e = nVar;
        this.f = dVar2;
        this.g = eVar2;
        this.h = wVar;
    }

    public static /* synthetic */ com.yandex.passport.sloth.ui.dependencies.m b(h hVar, com.yandex.passport.sloth.ui.dependencies.q qVar, com.yandex.passport.sloth.ui.dependencies.o oVar, int i) {
        if ((i & 2) != 0) {
            oVar = new b(0);
        }
        return hVar.a(qVar, oVar, new j());
    }

    public final com.yandex.passport.sloth.ui.dependencies.m a(com.yandex.passport.sloth.ui.dependencies.q qVar, com.yandex.passport.sloth.ui.dependencies.o oVar, com.yandex.passport.sloth.ui.dependencies.p pVar) {
        qVar.getClass();
        oVar.getClass();
        pVar.getClass();
        return new com.yandex.passport.sloth.ui.dependencies.m(this.a, this.b, qVar, this.c, this.d, this.e, oVar, this.f, pVar, this.g, this.h);
    }
}
