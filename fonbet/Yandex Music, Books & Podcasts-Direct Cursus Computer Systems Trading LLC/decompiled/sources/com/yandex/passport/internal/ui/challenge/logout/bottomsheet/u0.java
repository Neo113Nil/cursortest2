package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class u0 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ g0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(g0 g0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = g0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new u0(this.k, continuation, 0);
            case 1:
                return new u0(this.k, continuation, 1);
            default:
                return new u0(this.k, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((u0) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        g0 g0Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                g0Var.i.invoke();
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                g0Var.h.invoke();
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                g0Var.j.invoke();
                break;
        }
        return Unit.a;
    }
}
