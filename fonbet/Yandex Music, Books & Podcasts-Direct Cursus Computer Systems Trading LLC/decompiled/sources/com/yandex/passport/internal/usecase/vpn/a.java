package com.yandex.passport.internal.usecase.vpn;

import com.yandex.passport.internal.entities.x;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.zsd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class a extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ e l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = eVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a(this.l, continuation, 0);
            case 1:
                return new a(this.l, continuation, 1);
            default:
                return new a(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((a) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        e eVar = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    pjc X = zsd.X(zsd.u0(zsd.d0(eVar.i.f, 1), eVar.g.c), 300L);
                    com.yandex.passport.common.ui.compose.a aVar = new com.yandex.passport.common.ui.compose.a(14, eVar);
                    this.k = 1;
                    if (X.collect(aVar, this) == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (e.a(eVar, this) == nm6Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar = eVar.k;
                    this.k = 1;
                    xdrVar.getClass();
                    xdrVar.m(null, x.a);
                    if (Unit.a == nm6Var3) {
                        break;
                    }
                } else if (i4 != 1) {
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
