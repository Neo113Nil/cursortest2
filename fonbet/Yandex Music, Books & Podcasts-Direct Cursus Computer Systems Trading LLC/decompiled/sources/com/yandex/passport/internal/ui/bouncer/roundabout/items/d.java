package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import com.yandex.passport.internal.ui.bouncer.model.d2;
import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class d extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ e k;
    public final /* synthetic */ h0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, h0 h0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = eVar;
        this.l = h0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new d(this.k, this.l, continuation, 0);
            default:
                return new d(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        h0 h0Var = this.l;
        e eVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                eVar.m.a(new d2(h0Var.a, h0Var.j));
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                eVar.n.a(h0Var.a, h0Var.i);
                break;
        }
        return Unit.a;
    }
}
