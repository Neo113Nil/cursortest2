package com.yandex.passport.internal.filter;

import defpackage.aur;
import defpackage.lpi;
import defpackage.nm6;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class o extends aur implements Function2 {
    public /* synthetic */ Object j;

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        o oVar = new o(2, continuation);
        oVar.j = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        r.d.getClass();
        lpiVar.f(r.f);
        return Unit.a;
    }
}
