package com.yandex.passport.internal.di.module;

import com.yandex.passport.data.network.qa;
import com.yandex.passport.internal.report.reporters.h1;
import com.yandex.passport.internal.report.reporters.l1;
import com.yandex.passport.internal.sloth.z;
import com.yandex.passport.internal.ui.challenge.delete.p0;
import com.yandex.passport.internal.ui.sloth.a0;
import com.yandex.passport.internal.ui.sloth.webcard.k0;
import com.yandex.passport.internal.ui.sloth.webcard.l0;
import com.yandex.passport.internal.ui.sloth.webcard.x0;
import com.yandex.passport.internal.ui.sloth.webcard.y0;
import com.yandex.passport.internal.ui.sloth.x;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.data.d0;
import com.yandex.passport.sloth.ui.b1;
import com.yandex.passport.sloth.ui.d2;
import defpackage.rzm;
import defpackage.t75;
import defpackage.toe;

/* loaded from: classes4.dex */
public final class k implements rzm {
    public final /* synthetic */ int a;
    public final Object b;
    public final rzm c;

    public /* synthetic */ k(Object obj, rzm rzmVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                com.yandex.passport.internal.network.b bVar = (com.yandex.passport.internal.network.b) ((d) this.c).get();
                hVar.getClass();
                return bVar;
            case 1:
                h hVar2 = (h) this.b;
                com.yandex.passport.internal.network.c cVar = (com.yandex.passport.internal.network.c) ((qa) this.c).get();
                hVar2.getClass();
                return cVar;
            case 2:
                h hVar3 = (h) this.b;
                com.yandex.passport.internal.network.h hVar4 = (com.yandex.passport.internal.network.h) ((com.yandex.passport.data.network.n) this.c).get();
                hVar3.getClass();
                return hVar4;
            case 3:
                p pVar = (p) this.b;
                com.yandex.passport.internal.clipboard.a aVar = (com.yandex.passport.internal.clipboard.a) ((com.yandex.passport.common.coroutine.g) this.c).get();
                pVar.getClass();
                return aVar;
            case 4:
                return new com.yandex.passport.internal.sloth.p((com.yandex.passport.internal.config.g) ((rzm) this.b).get(), (com.yandex.passport.internal.ui.common.web.a) ((com.yandex.passport.internal.badges.f) this.c).get());
            case 5:
                com.yandex.passport.internal.ui.challenge.delete.c cVar2 = (com.yandex.passport.internal.ui.challenge.delete.c) this.b;
                com.yandex.passport.internal.ui.sloth.f fVar = (com.yandex.passport.internal.ui.sloth.f) this.c.get();
                cVar2.getClass();
                fVar.getClass();
                return fVar.a();
            case 6:
                p0 p0Var = (p0) this.b;
                com.yandex.passport.internal.properties.r rVar = (com.yandex.passport.internal.properties.r) this.c.get();
                p0Var.getClass();
                rVar.getClass();
                return new com.yandex.passport.internal.ui.sloth.j(rVar.d);
            case 7:
                x xVar = (x) this.b;
                com.yandex.passport.internal.sloth.k kVar = (com.yandex.passport.internal.sloth.k) this.c.get();
                xVar.getClass();
                kVar.getClass();
                return kVar.a();
            case 8:
                a0 a0Var = (a0) this.b;
                com.yandex.passport.internal.properties.x xVar2 = (com.yandex.passport.internal.properties.x) this.c.get();
                a0Var.getClass();
                xVar2.getClass();
                return xVar2.x ? new com.yandex.passport.internal.ui.sloth.b(1) : new com.yandex.passport.internal.ui.sloth.b(0);
            case 9:
                com.yandex.passport.internal.ui.sloth.authsdk.p pVar2 = (com.yandex.passport.internal.ui.sloth.authsdk.p) this.b;
                com.yandex.passport.internal.ui.sloth.f fVar2 = (com.yandex.passport.internal.ui.sloth.f) this.c.get();
                pVar2.getClass();
                fVar2.getClass();
                return fVar2.a();
            case 10:
                com.yandex.passport.internal.ui.sloth.ebs.c cVar3 = (com.yandex.passport.internal.ui.sloth.ebs.c) this.b;
                com.yandex.passport.internal.ui.sloth.f fVar3 = (com.yandex.passport.internal.ui.sloth.f) this.c.get();
                cVar3.getClass();
                fVar3.getClass();
                return fVar3.a();
            case 11:
                return new com.yandex.passport.internal.ui.sloth.menu.n((com.yandex.passport.internal.sloth.performers.usermenu.b) ((l1) this.b).get(), (com.yandex.passport.internal.sloth.performers.usermenu.b) ((l1) this.c).get());
            case 12:
                com.yandex.passport.internal.ui.sloth.plusdevices.k kVar2 = (com.yandex.passport.internal.ui.sloth.plusdevices.k) this.b;
                com.yandex.passport.internal.ui.sloth.f fVar4 = (com.yandex.passport.internal.ui.sloth.f) this.c.get();
                kVar2.getClass();
                fVar4.getClass();
                return fVar4.a();
            case 13:
                com.yandex.passport.internal.ui.sloth.screen.b bVar2 = (com.yandex.passport.internal.ui.sloth.screen.b) this.b;
                com.yandex.passport.internal.ui.sloth.d dVar = (com.yandex.passport.internal.ui.sloth.d) ((com.yandex.passport.internal.ui.bouncer.sloth.i) this.c).get();
                bVar2.getClass();
                return dVar;
            case 14:
                com.yandex.passport.internal.ui.sloth.screen.b bVar3 = (com.yandex.passport.internal.ui.sloth.screen.b) this.b;
                com.yandex.passport.internal.ui.sloth.c cVar4 = (com.yandex.passport.internal.ui.sloth.c) ((com.yandex.passport.internal.ui.bouncer.sloth.i) this.c).get();
                bVar3.getClass();
                return cVar4;
            case 15:
                com.yandex.passport.internal.ui.sloth.screen.b bVar4 = (com.yandex.passport.internal.ui.sloth.screen.b) this.b;
                com.yandex.passport.internal.sloth.n nVar = (com.yandex.passport.internal.sloth.n) ((h1) this.c).get();
                bVar4.getClass();
                return nVar;
            case 16:
                com.yandex.passport.internal.ui.sloth.screen.b bVar5 = (com.yandex.passport.internal.ui.sloth.screen.b) this.b;
                com.yandex.passport.internal.ui.sloth.g gVar = (com.yandex.passport.internal.ui.sloth.g) ((com.yandex.passport.common.coroutine.d) this.c).get();
                bVar5.getClass();
                return gVar;
            case 17:
                com.yandex.passport.internal.ui.sloth.webauthn.c cVar5 = (com.yandex.passport.internal.ui.sloth.webauthn.c) this.b;
                com.yandex.passport.internal.ui.sloth.f fVar5 = (com.yandex.passport.internal.ui.sloth.f) this.c.get();
                cVar5.getClass();
                fVar5.getClass();
                return fVar5.a();
            case 18:
                com.yandex.passport.internal.ui.sloth.webcard.g gVar2 = (com.yandex.passport.internal.ui.sloth.webcard.g) this.b;
                com.yandex.passport.internal.ui.sloth.webcard.b bVar6 = (com.yandex.passport.internal.ui.sloth.webcard.b) this.c.get();
                gVar2.getClass();
                bVar6.getClass();
                return new com.yandex.passport.sloth.dependencies.g(t75.c(bVar6.a));
            case 19:
                x0 x0Var = (x0) this.b;
                l0 l0Var = (l0) ((y0) this.c).get();
                x0Var.getClass();
                k0 k0Var = l0Var instanceof k0 ? (k0) l0Var : null;
                return (k0Var != null ? k0Var.a.a : null) instanceof d0 ? new com.yandex.passport.internal.ui.sloth.b(1) : new com.yandex.passport.internal.ui.sloth.b(0);
            case 20:
                return new com.yandex.passport.sloth.i((com.yandex.passport.common.coroutine.a) ((com.yandex.passport.sloth.dependencies.c) this.b).get(), (a1) this.c.get());
            case 21:
                return new com.yandex.passport.sloth.command.performers.g((com.yandex.passport.sloth.v) ((rzm) this.b).get(), (com.yandex.passport.sloth.data.m) ((toe) this.c).a);
            case 22:
                return new d2((com.yandex.passport.sloth.ui.dependencies.q) ((com.yandex.passport.sloth.ui.dependencies.n) this.b).get(), (b1) this.c.get());
            default:
                return new com.yandex.passport.sloth.url.x((com.yandex.passport.sloth.data.m) ((toe) this.b).a, (z) ((com.yandex.passport.sloth.dependencies.c) this.c).get());
        }
    }
}
