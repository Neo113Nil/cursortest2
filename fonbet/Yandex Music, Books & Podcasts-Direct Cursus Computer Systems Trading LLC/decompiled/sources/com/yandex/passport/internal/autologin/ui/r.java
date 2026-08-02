package com.yandex.passport.internal.autologin.ui;

import defpackage.aur;
import defpackage.avf;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class r extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ x0q l;
    public final /* synthetic */ com.yandex.passport.internal.account.f m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(x0q x0qVar, Continuation continuation, com.yandex.passport.internal.account.f fVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = x0qVar;
        this.m = fVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r(this.l, continuation, this.m, 0);
            default:
                return new r(this.l, continuation, this.m, 1);
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
                    z7o z7oVar = new z7o(avf.u(this.m));
                    this.k = 1;
                    if (this.l.emit(z7oVar, this) == nm6Var) {
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
                    z7o z7oVar2 = new z7o(avf.u(this.m));
                    this.k = 1;
                    if (this.l.emit(z7oVar2, this) == nm6Var2) {
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
