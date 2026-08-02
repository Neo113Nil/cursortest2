package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.ui.sloth.authsdk.i0;
import com.yandex.passport.internal.ui.sloth.k0;
import com.yandex.passport.internal.ui.sloth.webcard.e1;
import com.yandex.passport.internal.ui.sloth.webcard.z0;
import com.yandex.passport.internal.usecase.ui.a1;
import com.yandex.passport.internal.usecase.ui.j0;
import com.yandex.passport.internal.usecase.ui.y0;
import com.yandex.passport.internal.usecase.x0;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class d implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;

    public /* synthetic */ d(rzm rzmVar, rzm rzmVar2, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new c((Activity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get());
            case 1:
                return new x((Activity) this.b.get(), (m) this.c.get());
            case 2:
                return new f0((Activity) this.b.get(), (com.yandex.passport.common.ui.lang.b) this.c.get());
            case 3:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.items.v((Activity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get());
            case 4:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.items.y((Activity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get());
            case 5:
                return new com.yandex.passport.internal.ui.bouncer.sloth.a((com.yandex.passport.internal.properties.v) this.b.get(), new com.yandex.passport.internal.ui.sloth.a(), (com.yandex.passport.internal.properties.x) this.c.get());
            case 6:
                return new com.yandex.passport.internal.ui.lang.a((Context) this.b.get(), (com.yandex.passport.internal.helper.h) this.c.get());
            case 7:
                return new i0((com.yandex.passport.internal.ui.sloth.h) this.b.get(), (k0) this.c.get());
            case 8:
                return new com.yandex.passport.internal.ui.sloth.menu.p((com.yandex.passport.internal.ui.sloth.menu.i) this.b.get(), (com.yandex.passport.sloth.ui.string.b) this.c.get());
            case 9:
                return new e1((Activity) this.b.get(), (z0) this.c.get());
            case 10:
                return new com.yandex.passport.internal.upgrader.q((com.yandex.passport.internal.core.accounts.i) this.b.get(), (com.yandex.passport.common.a) this.c.get());
            case 11:
                return new com.yandex.passport.internal.usecase.p((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.storage.m) this.c.get());
            case 12:
                return new com.yandex.passport.internal.usecase.v((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get());
            case 13:
                return new x0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get());
            case 14:
                return new com.yandex.passport.internal.usecase.ui.b((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.flags.i) this.c.get());
            case 15:
                com.yandex.passport.common.coroutine.a aVar = (com.yandex.passport.common.coroutine.a) this.b.get();
                com.yandex.passport.internal.usecase.ui.i iVar = (com.yandex.passport.internal.usecase.ui.i) this.c.get();
                aVar.getClass();
                iVar.getClass();
                com.yandex.passport.internal.usecase.ui.g gVar = new com.yandex.passport.internal.usecase.ui.g(((com.yandex.passport.common.coroutine.b) aVar).d, iVar);
                gVar.e = com.yandex.passport.common.time.a.c(0, 1, 0, 11);
                gVar.f = com.yandex.passport.common.domain.b.a;
                gVar.g = 30;
                return gVar;
            case 16:
                return new com.yandex.passport.internal.usecase.ui.d0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.database.d) this.c.get());
            case 17:
                return new j0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.network.r) this.c.get());
            case 18:
                com.yandex.passport.common.coroutine.a aVar2 = (com.yandex.passport.common.coroutine.a) this.b.get();
                a1 a1Var = (a1) this.c.get();
                aVar2.getClass();
                a1Var.getClass();
                y0 y0Var = new y0(((com.yandex.passport.common.coroutine.b) aVar2).d, a1Var);
                y0Var.e = com.yandex.passport.common.time.a.c(0, 1, 0, 11);
                y0Var.f = com.yandex.passport.common.domain.b.a;
                y0Var.g = 30;
                return y0Var;
            case 19:
                return new com.yandex.passport.legacy.analytics.a((com.yandex.passport.internal.core.accounts.k) this.b.get(), (o0) this.c.get());
            case 20:
                return new com.yandex.passport.sloth.command.performers.q((com.yandex.passport.sloth.v) this.b.get(), (com.yandex.passport.sloth.command.performers.o) this.c.get());
            case 21:
                return new com.yandex.passport.sloth.command.performers.a0((com.yandex.passport.sloth.v) this.b.get(), (com.yandex.passport.sloth.a1) this.c.get());
            default:
                return new com.yandex.passport.sloth.command.performers.e0((com.yandex.passport.sloth.v) this.c.get(), (com.yandex.passport.sloth.a1) this.b.get());
        }
    }
}
