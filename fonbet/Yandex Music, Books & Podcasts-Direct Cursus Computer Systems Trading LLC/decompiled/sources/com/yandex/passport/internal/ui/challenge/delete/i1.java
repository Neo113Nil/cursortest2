package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.rzm;
import defpackage.toe;

/* loaded from: classes4.dex */
public final class i1 implements rzm {
    public final /* synthetic */ int a;
    public final Object b;
    public final rzm c;
    public final rzm d;
    public final rzm e;
    public final rzm f;
    public final rzm g;
    public final rzm h;
    public final rzm i;
    public final rzm j;

    public i1(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, toe toeVar, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8) {
        this.a = 0;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.b = toeVar;
        this.f = rzmVar4;
        this.g = rzmVar5;
        this.h = rzmVar6;
        this.i = rzmVar7;
        this.j = rzmVar8;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new h1((com.yandex.passport.internal.ui.challenge.o) this.c.get(), (q1) this.d.get(), (com.yandex.passport.internal.ui.challenge.s) this.e.get(), ((Boolean) ((toe) this.b).a).booleanValue(), (com.yandex.passport.internal.core.accounts.e) this.f.get(), (com.yandex.passport.internal.usecase.ui.w) this.g.get(), (com.yandex.passport.internal.usecase.ui.t) this.h.get(), (com.yandex.passport.internal.account.b) this.i.get(), (com.yandex.passport.internal.flags.i) this.j.get());
            case 1:
                return new com.yandex.passport.sloth.d1((com.yandex.passport.sloth.data.m) ((toe) this.b).a, (com.yandex.passport.sloth.command.g) this.c.get(), (com.yandex.passport.sloth.v) this.d.get(), (com.yandex.passport.sloth.url.b0) this.e.get(), (com.yandex.passport.sloth.i) this.f.get(), (com.yandex.passport.sloth.url.v) this.g.get(), (com.yandex.passport.sloth.ui.z0) this.h.get(), (com.yandex.passport.sloth.url.a) this.i.get(), (com.yandex.passport.sloth.a1) this.j.get());
            default:
                com.yandex.passport.internal.di.module.p pVar = (com.yandex.passport.internal.di.module.p) this.b;
                com.yandex.passport.internal.core.accounts.i iVar = (com.yandex.passport.internal.core.accounts.i) this.c.get();
                com.yandex.passport.common.a aVar = (com.yandex.passport.common.a) this.d.get();
                com.yandex.passport.internal.usecase.z zVar = (com.yandex.passport.internal.usecase.z) this.e.get();
                com.yandex.passport.internal.database.d dVar = (com.yandex.passport.internal.database.d) this.f.get();
                com.yandex.passport.common.ui.lang.b bVar = (com.yandex.passport.common.ui.lang.b) this.g.get();
                com.yandex.passport.internal.flags.i iVar2 = (com.yandex.passport.internal.flags.i) this.h.get();
                com.yandex.passport.internal.core.accounts.s sVar = (com.yandex.passport.internal.core.accounts.s) this.i.get();
                com.yandex.passport.data.mapper.a aVar2 = (com.yandex.passport.data.mapper.a) this.j.get();
                pVar.getClass();
                iVar.getClass();
                aVar.getClass();
                zVar.getClass();
                dVar.getClass();
                bVar.getClass();
                iVar2.getClass();
                sVar.getClass();
                aVar2.getClass();
                return new com.yandex.passport.internal.core.accounts.t(com.yandex.passport.common.time.a.c(((Number) iVar2.b(com.yandex.passport.internal.flags.o.p0)).intValue(), 0, 0, 14), iVar, aVar, zVar, dVar, sVar, bVar, aVar2);
        }
    }

    public /* synthetic */ i1(Object obj, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, int i) {
        this.a = i;
        this.b = obj;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.f = rzmVar4;
        this.g = rzmVar5;
        this.h = rzmVar6;
        this.i = rzmVar7;
        this.j = rzmVar8;
    }
}
