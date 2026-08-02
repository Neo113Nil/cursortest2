package com.yandex.plus.pay.internal.feature.payment.p000native;

import com.yandex.plus.pay.api.feature.tarifficator.payment.o;
import com.yandex.plus.pay.api.feature.tarifficator.payment.q;
import defpackage.aur;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class b extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ String l;
    public /* synthetic */ q m;
    public final /* synthetic */ rjc n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(rjc rjcVar, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.n = rjcVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        q qVar = (q) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                b bVar = new b(this.n, continuation, 0);
                bVar.l = str;
                bVar.m = qVar;
                return bVar.invokeSuspend(Unit.a);
            default:
                b bVar2 = new b(this.n, continuation, 1);
                bVar2.l = str;
                bVar2.m = qVar;
                return bVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                String str = this.l;
                q qVar = this.m;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    o oVar = new o(str, qVar);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (this.n.emit(oVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                String str2 = this.l;
                q qVar2 = this.m;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    o oVar2 = new o(str2, qVar2);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (this.n.emit(oVar2, this) == nm6Var2) {
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
