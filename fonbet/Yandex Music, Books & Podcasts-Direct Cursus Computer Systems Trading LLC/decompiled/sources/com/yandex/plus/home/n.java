package com.yandex.plus.home;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.x97;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class n extends aur implements pyc {
    public /* synthetic */ mm6 j;
    public /* synthetic */ long k;
    public final /* synthetic */ t l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, Continuation continuation) {
        super(3, continuation);
        this.l = tVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((nsa) obj2).a;
        n nVar = new n(this.l, (Continuation) obj3);
        nVar.j = (mm6) obj;
        nVar.k = j;
        return nVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        mm6 mm6Var = this.j;
        long j = this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        t tVar = this.l;
        com.yandex.plus.core.analytics.logging.d dVar = tVar.b.x;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        Continuation continuation = null;
        if (dVar.b(aVar)) {
            dVar.a(aVar, "PlusHomeSdkImpl", "Collect cooldown: rechargeTime=" + ((Object) nsa.t(j)), null);
        }
        x97.y(mm6Var, null, null, new m(tVar, j, continuation, 0), 3);
        x97.y(mm6Var, null, null, new m(tVar, j, continuation, 1), 3);
        return Unit.a;
    }
}
