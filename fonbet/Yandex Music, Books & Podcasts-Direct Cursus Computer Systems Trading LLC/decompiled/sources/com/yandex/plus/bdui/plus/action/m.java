package com.yandex.plus.bdui.plus.action;

import defpackage.f0g;
import defpackage.fjb;
import defpackage.r0w;
import defpackage.tf6;
import defpackage.x97;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class m extends b {
    public final com.yandex.passport.data.network.l g;
    public final tf6 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.yandex.plus.bdui.plus.scenario.g gVar, com.yandex.plus.bdui.plus.query.a aVar, com.yandex.plus.bdui.plus.scenario.h hVar, Function0 function0, com.yandex.passport.data.network.l lVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar) {
        super(gVar, aVar, new r0w(13, hVar), new f0g(7, function0), bVar, "PlusNextDocumentActionHandler");
        aVar.getClass();
        function0.getClass();
        bVar.getClass();
        this.g = lVar;
        this.h = tf6Var;
    }

    @Override // com.yandex.plus.bdui.plus.action.b
    public final void b(s sVar, com.yandex.plus.bdui.query.g gVar, com.yandex.plus.bdui.document.e eVar, com.yandex.plus.bdui.action.i iVar) {
        z zVar = (z) sVar;
        com.yandex.plus.bdui.query.e eVar2 = (com.yandex.plus.bdui.query.e) gVar;
        zVar.getClass();
        com.yandex.passport.data.network.l lVar = this.g;
        if (lVar == null) {
            super.b(zVar, eVar2, eVar, iVar);
            return;
        }
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.e;
        if (bVar.b(aVar)) {
            bVar.c(aVar, this.f, "handleInner(); query = " + eVar2);
        }
        x97.y(this.h, null, null, new fjb(zVar, this, lVar, eVar2, eVar, iVar, (Continuation) null), 3);
    }
}
