package com.yandex.passport.internal.upgrader;

import androidx.core.app.n0;
import com.yandex.passport.internal.report.z;
import defpackage.rhw;
import kotlin.Pair;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class e extends n0 {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final q c;
    public final com.yandex.passport.internal.report.reporters.e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, q qVar, com.yandex.passport.internal.report.reporters.e eVar2) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        eVar.getClass();
        qVar.getClass();
        eVar2.getClass();
        this.b = eVar;
        this.c = qVar;
        this.d = eVar2;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) obj;
        com.yandex.passport.internal.report.reporters.e eVar = this.d;
        eVar.getClass();
        fVar.getClass();
        eVar.o(z.d, fVar);
        com.yandex.passport.internal.l e = this.b.a().e(fVar);
        if (e != null) {
            q qVar = this.c;
            qVar.getClass();
            com.yandex.passport.internal.core.accounts.i iVar = qVar.a;
            com.yandex.passport.internal.stash.b bVar = com.yandex.passport.internal.stash.b.UPGRADE_POSTPONED_AT;
            qVar.b.getClass();
            Pair pair = new Pair(bVar, String.valueOf(System.currentTimeMillis()));
            com.yandex.passport.internal.stash.b bVar2 = com.yandex.passport.internal.stash.b.UPGRADE_STATUS;
            com.yandex.passport.api.o oVar = com.yandex.passport.api.o.a;
            com.yandex.passport.internal.core.accounts.i.j(iVar, e, new Pair[]{pair, new Pair(bVar2, String.valueOf(2))});
        }
        return Unit.a;
    }
}
