package com.yandex.plus.home.plaque.feature.internal;

import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.home.r;
import defpackage.bsd;
import defpackage.fkn;
import defpackage.rar;
import defpackage.tf6;
import defpackage.x97;
import defpackage.xdr;
import defpackage.ydr;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class e {
    public final r a;
    public final com.yandex.plus.home.plaque.repository.api.a b;
    public final p c;
    public final com.yandex.plus.home.dailyquests.plugin.internal.proxy.a d;
    public final com.yandex.plus.home.dailyquests.plugin.internal.proxy.d e;
    public final com.yandex.plus.log.api.b f;
    public final tf6 g;
    public final com.yandex.plus.core.dispatcher.b h;
    public final j i;
    public final p j;
    public final ReentrantLock k;
    public rar l;

    public e(r rVar, com.yandex.plus.home.plaque.repository.api.a aVar, p pVar, com.yandex.plus.home.dailyquests.plugin.internal.proxy.a aVar2, com.yandex.plus.home.dailyquests.plugin.internal.proxy.d dVar, xdr xdrVar, fkn fknVar, com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b bVar, com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a aVar3, com.yandex.plus.log.api.b bVar2, tf6 tf6Var, com.yandex.plus.core.dispatcher.b bVar3) {
        xdrVar.getClass();
        bVar3.getClass();
        this.a = rVar;
        this.b = aVar;
        this.c = pVar;
        this.d = aVar2;
        this.e = dVar;
        this.f = bVar2;
        this.g = tf6Var;
        this.h = bVar3;
        j jVar = new j();
        jVar.a = aVar3;
        Boolean bool = Boolean.FALSE;
        jVar.b = ydr.a(bool);
        jVar.c = ydr.a(bool);
        jVar.e = new ReentrantLock();
        this.i = jVar;
        this.j = new p(aVar, jVar, com.yandex.plus.core.dispatcher.a.f);
        this.k = new ReentrantLock();
        com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
        if (bVar2.b(aVar4)) {
            bVar2.c(aVar4, "PlaqueFeatureImpl", "Init");
        }
        bsd bsdVar = com.yandex.plus.core.dispatcher.a.d;
        x97.y(tf6Var, bsdVar, null, new c(this, null, 0), 2);
        x97.y(tf6Var, bsdVar, null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b(xdrVar, fknVar, bVar, this, (Continuation) null, 5), 2);
    }

    public final rar a(boolean z) {
        ReentrantLock reentrantLock = this.k;
        reentrantLock.lock();
        Continuation continuation = null;
        if (!z) {
            try {
                if (this.l != null) {
                    return null;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        rar rarVar = this.l;
        if (rarVar != null) {
            rarVar.g(null);
        }
        rar y = x97.y(this.g, null, null, new c(this, continuation, 1), 3);
        this.l = y;
        return y;
    }
}
