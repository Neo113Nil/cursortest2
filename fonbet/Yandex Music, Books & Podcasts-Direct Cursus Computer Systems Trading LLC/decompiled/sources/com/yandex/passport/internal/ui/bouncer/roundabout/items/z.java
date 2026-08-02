package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import com.yandex.passport.internal.ui.bouncer.model.d2;
import defpackage.aur;
import defpackage.c5b;
import defpackage.nm6;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class z extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ a0 k;
    public final /* synthetic */ j0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a0 a0Var, j0 j0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = a0Var;
        this.l = j0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new z(this.k, this.l, continuation, 0);
            default:
                return new z(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        j0 j0Var = this.l;
        a0 a0Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                a0Var.l.a(new d2(j0Var.a, c5b.a));
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                a0Var.m.a(j0Var.a, j0Var.c);
                break;
        }
        return Unit.a;
    }
}
