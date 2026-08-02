package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class r1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ pjc l;
    public final /* synthetic */ t1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(pjc pjcVar, Continuation continuation, t1 t1Var, int i) {
        super(2, continuation);
        this.j = i;
        this.l = pjcVar;
        this.m = t1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r1(this.l, continuation, this.m, 0);
            case 1:
                return new r1(this.l, continuation, this.m, 1);
            default:
                return new r1(this.l, continuation, this.m, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((r1) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    q1 q1Var = new q1(this.m, 0);
                    this.k = 1;
                    if (this.l.collect(q1Var, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    q1 q1Var2 = new q1(this.m, 1);
                    this.k = 1;
                    if (this.l.collect(q1Var2, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    q1 q1Var3 = new q1(this.m, 2);
                    this.k = 1;
                    if (this.l.collect(q1Var3, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
