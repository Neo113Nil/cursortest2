package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
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
public final class r extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ pjc l;
    public final /* synthetic */ PassportProcessGlobalComponent m;
    public final /* synthetic */ com.yandex.passport.sloth.data.c0 n;
    public final /* synthetic */ t o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(pjc pjcVar, Continuation continuation, PassportProcessGlobalComponent passportProcessGlobalComponent, com.yandex.passport.sloth.data.c0 c0Var, t tVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = pjcVar;
        this.m = passportProcessGlobalComponent;
        this.n = c0Var;
        this.o = tVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r(this.l, continuation, this.m, this.n, this.o, 0);
            default:
                return new r(this.l, continuation, this.m, this.n, this.o, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((r) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    q qVar = new q(this.m, this.n, this.o, 0);
                    this.k = 1;
                    if (this.l.collect(qVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    q qVar2 = new q(this.m, this.n, this.o, 1);
                    this.k = 1;
                    if (this.l.collect(qVar2, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
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
