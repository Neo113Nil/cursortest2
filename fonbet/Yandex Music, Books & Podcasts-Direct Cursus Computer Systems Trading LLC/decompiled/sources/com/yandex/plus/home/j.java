package com.yandex.plus.home;

import com.yandex.plus.home.internal.di.u;
import defpackage.btf;
import defpackage.jyr;

/* loaded from: classes5.dex */
public final class j {
    public final com.yandex.plus.home.internal.di.t a;
    public final u b;
    public final com.yandex.plus.home.internal.di.e c;
    public final com.yandex.plus.home.internal.di.d d;
    public final com.yandex.plus.home.internal.di.l e;
    public final com.yandex.plus.home.plaque.feature.internal.presentation.b f;
    public final com.yandex.plus.domain.auth.impl.i g;
    public final com.yandex.plus.home.api.b h;
    public final jyr i;
    public final jyr j;

    public j(com.yandex.plus.home.internal.di.t tVar, u uVar, com.yandex.plus.home.internal.di.e eVar, com.yandex.plus.home.internal.di.d dVar, com.yandex.plus.home.internal.di.l lVar, com.yandex.plus.home.plaque.feature.internal.presentation.b bVar, com.yandex.plus.domain.auth.impl.i iVar, com.yandex.plus.home.api.b bVar2) {
        uVar.getClass();
        eVar.getClass();
        dVar.getClass();
        lVar.getClass();
        bVar.getClass();
        iVar.getClass();
        bVar2.getClass();
        this.a = tVar;
        this.b = uVar;
        this.c = eVar;
        this.d = dVar;
        this.e = lVar;
        this.f = bVar;
        this.g = iVar;
        this.h = bVar2;
        this.i = btf.b(new h(this, 0));
        this.j = btf.b(new h(this, 1));
        i iVar2 = new i(this);
        com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.a;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar3, "Init PlusHomeSdkComponent\nselectedCardId=null\nhomeLoadingAnimator=null\npanelLoadingAnimator=null\n", null);
        tVar.b.k(iVar2);
    }
}
