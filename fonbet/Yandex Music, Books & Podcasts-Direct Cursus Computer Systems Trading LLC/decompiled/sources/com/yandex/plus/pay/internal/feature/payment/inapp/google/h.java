package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import defpackage.aur;
import defpackage.gld;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class h extends aur implements Function2 {
    public int j;
    public final /* synthetic */ n k;
    public final /* synthetic */ kotlinx.coroutines.a l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, kotlinx.coroutines.a aVar, Continuation continuation) {
        super(2, continuation);
        this.k = nVar;
        this.l = aVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        n nVar = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.plus.experiments.impl.providers.h hVar = nVar.k;
            this.j = 1;
            if (hVar.e(this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            ((z7o) obj).getClass();
        }
        nVar.o.c();
        x97.y(gld.e(this.l), null, null, new com.yandex.passport.internal.ui.social.i(nVar, null, 26), 3);
        return Unit.a;
    }
}
