package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import defpackage.aur;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class j extends aur implements pyc {
    public int j;
    public /* synthetic */ rjc k;
    public /* synthetic */ Throwable l;

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j jVar = new j(3, (Continuation) obj3);
        jVar.k = (rjc) obj;
        jVar.l = (Throwable) obj2;
        return jVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        rjc rjcVar = this.k;
        Throwable th = this.l;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            com.yandex.plus.pay.api.feature.tarifficator.payment.k kVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.k(null, new com.yandex.plus.pay.api.feature.tarifficator.payment.e(message));
            this.k = null;
            this.l = null;
            this.j = 1;
            if (rjcVar.emit(kVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
