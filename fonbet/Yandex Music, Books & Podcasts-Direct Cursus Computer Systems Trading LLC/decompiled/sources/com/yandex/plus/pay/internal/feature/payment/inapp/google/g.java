package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import com.yandex.plus.pay.api.feature.tarifficator.payment.p;
import defpackage.aur;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class g extends aur implements pyc {
    public int j;
    public /* synthetic */ rjc k;
    public /* synthetic */ p l;

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g gVar = new g(3, (Continuation) obj3);
        gVar.k = (rjc) obj;
        gVar.l = (p) obj2;
        return gVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        rjc rjcVar = this.k;
        p pVar = this.l;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            this.k = null;
            this.l = pVar;
            this.j = 1;
            if (rjcVar.emit(pVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Boolean.valueOf(!com.yandex.plus.bdui.plus.analytics.b.q(pVar));
    }
}
