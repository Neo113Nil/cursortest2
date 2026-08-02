package com.yandex.passport.internal.sloth;

import android.content.Context;
import defpackage.b6e;

/* loaded from: classes4.dex */
public final class k {
    public final Context a;
    public final com.yandex.passport.common.coroutine.a b;
    public final i c;
    public final w d;
    public final j e;
    public final com.yandex.passport.internal.flags.i f;
    public final o g;
    public final com.yandex.passport.common.ui.lang.b h;
    public final z i;
    public final p j;
    public final g k;
    public final e l;

    public k(Context context, com.yandex.passport.common.coroutine.a aVar, i iVar, w wVar, j jVar, com.yandex.passport.internal.flags.i iVar2, o oVar, com.yandex.passport.common.ui.lang.b bVar, z zVar, p pVar, g gVar, e eVar) {
        context.getClass();
        aVar.getClass();
        iVar.getClass();
        wVar.getClass();
        jVar.getClass();
        iVar2.getClass();
        oVar.getClass();
        bVar.getClass();
        zVar.getClass();
        pVar.getClass();
        gVar.getClass();
        eVar.getClass();
        this.a = context;
        this.b = aVar;
        this.c = iVar;
        this.d = wVar;
        this.e = jVar;
        this.f = iVar2;
        this.g = oVar;
        this.h = bVar;
        this.i = zVar;
        this.j = pVar;
        this.k = gVar;
        this.l = eVar;
    }

    public final com.yandex.passport.sloth.dependencies.b a() {
        com.yandex.passport.sloth.data.n nVar;
        Context applicationContext = this.a.getApplicationContext();
        applicationContext.getClass();
        com.yandex.passport.internal.flags.b bVar = com.yandex.passport.internal.flags.o.n;
        com.yandex.passport.internal.flags.i iVar = this.f;
        com.yandex.passport.internal.ui.domik.webam.a aVar = (com.yandex.passport.internal.ui.domik.webam.a) iVar.b(bVar);
        aVar.getClass();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            nVar = com.yandex.passport.sloth.data.n.Portal;
        } else if (ordinal == 1) {
            nVar = com.yandex.passport.sloth.data.n.Neophonish;
        } else if (ordinal == 2) {
            nVar = com.yandex.passport.sloth.data.n.Doregish;
        } else {
            if (ordinal != 3) {
                b6e.s();
                return null;
            }
            nVar = com.yandex.passport.sloth.data.n.Nothing;
        }
        com.yandex.passport.sloth.data.n nVar2 = nVar;
        boolean booleanValue = ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.I)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.J)).booleanValue();
        boolean booleanValue3 = ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.N)).booleanValue();
        return new com.yandex.passport.sloth.dependencies.b(applicationContext, this.b, this.c, this.d, this.e, this.j, new com.yandex.passport.sloth.dependencies.d(nVar2, booleanValue, booleanValue2, ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.K)).booleanValue(), ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.L)).booleanValue(), ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.M)).booleanValue(), booleanValue3, ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.O)).booleanValue(), ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.P)).booleanValue(), ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.z)).booleanValue()), this.g, this.h, this.i, this.k, this.l);
    }
}
