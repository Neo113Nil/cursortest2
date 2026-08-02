package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ rjc l;
    public final /* synthetic */ q0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(rjc rjcVar, Continuation continuation, q0 q0Var, int i) {
        super(2, continuation);
        this.j = i;
        this.l = rjcVar;
        this.m = q0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new p0(this.l, continuation, this.m, 0);
            case 1:
                return new p0(this.l, continuation, this.m, 1);
            default:
                return new p0(this.l, continuation, this.m, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((p0) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.properties.u uVar = this.m.p;
                    if (uVar == null) {
                        Intrinsics.j("currentProperties");
                        throw null;
                    }
                    l0 l0Var = new l0(uVar, com.yandex.passport.internal.ui.challenge.logout.d.b);
                    this.k = 1;
                    if (this.l.emit(l0Var, this) == nm6Var) {
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
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.properties.u uVar2 = this.m.p;
                    if (uVar2 == null) {
                        Intrinsics.j("currentProperties");
                        throw null;
                    }
                    l0 l0Var2 = new l0(uVar2, com.yandex.passport.internal.ui.challenge.logout.d.c);
                    this.k = 1;
                    if (this.l.emit(l0Var2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.properties.u uVar3 = this.m.p;
                    if (uVar3 == null) {
                        Intrinsics.j("currentProperties");
                        throw null;
                    }
                    j0 j0Var = new j0(uVar3);
                    this.k = 1;
                    if (this.l.emit(j0Var, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
