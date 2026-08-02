package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.aur;
import defpackage.dkn;
import defpackage.fkn;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjt;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.zsd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class g extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ com.yandex.passport.internal.social.esia.o l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.yandex.passport.internal.social.esia.o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = oVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new g(this.l, continuation, 0);
            default:
                return new g(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((g) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.social.esia.o oVar = this.l;
                    dkn dknVar = ((com.yandex.passport.internal.usecase.vpn.e) oVar.d).n;
                    pjt pjtVar = new pjt(oVar, null, 19);
                    this.k = 1;
                    if (zsd.O(dknVar, pjtVar, this) == nm6Var) {
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
                    com.yandex.passport.internal.social.esia.o oVar2 = this.l;
                    fkn fknVar = ((com.yandex.passport.internal.usecase.vpn.e) oVar2.d).l;
                    com.yandex.passport.internal.storage.a aVar = new com.yandex.passport.internal.storage.a(oVar2, null, 12);
                    this.k = 1;
                    if (zsd.O(fknVar, aVar, this) == nm6Var2) {
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
