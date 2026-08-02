package com.yandex.plus.pay.internal;

import com.yandex.plus.experiments.impl.providers.h;
import defpackage.aur;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class e extends aur implements pyc {
    public int j;
    public /* synthetic */ long k;
    public final /* synthetic */ g l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Continuation continuation) {
        super(3, continuation);
        this.l = gVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((nsa) obj2).a;
        e eVar = new e(this.l, (Continuation) obj3);
        eVar.k = j;
        return eVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        long j = this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            h b = this.l.b.d.b();
            this.k = j;
            this.j = 1;
            if (b.d(j, this) == nm6Var) {
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
    }
}
