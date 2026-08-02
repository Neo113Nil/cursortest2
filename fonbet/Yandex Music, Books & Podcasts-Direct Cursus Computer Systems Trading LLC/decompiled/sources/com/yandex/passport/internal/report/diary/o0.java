package com.yandex.passport.internal.report.diary;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.up6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class o0 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ q0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(q0 q0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = q0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new o0(this.k, continuation, 0);
            default:
                return new o0(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((o0) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        q0 q0Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return (Long) up6.F(q0Var.a.a, true, false, new com.yandex.passport.common.network.r(10));
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return (Long) up6.F(q0Var.a.a, true, false, new com.yandex.passport.common.network.r(9));
        }
    }
}
