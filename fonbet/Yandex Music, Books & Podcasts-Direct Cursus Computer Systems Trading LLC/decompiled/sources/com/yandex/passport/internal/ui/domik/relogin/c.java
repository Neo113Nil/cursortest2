package com.yandex.passport.internal.ui.domik.relogin;

import com.yandex.passport.internal.usecase.ui.e1;
import com.yandex.passport.internal.usecase.ui.i1;
import com.yandex.passport.internal.usecase.ui.o0;
import com.yandex.passport.internal.usecase.ui.r0;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r0w;
import defpackage.w4i;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class c extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ d l;
    public final /* synthetic */ com.yandex.passport.internal.ui.domik.d m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, com.yandex.passport.internal.ui.domik.d dVar2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = dVar;
        this.m = dVar2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new c(this.l, this.m, continuation, 0);
            default:
                return new c(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((c) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    d dVar = this.l;
                    r0 r0Var = dVar.u;
                    o0 o0Var = new o0(this.m, true, new r0w(7, dVar), new com.yandex.passport.internal.storage.d(13), new b(dVar, 0), new b(dVar, 1));
                    this.k = 1;
                    if (r0Var.g(o0Var, this) == nm6Var) {
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
                    d dVar2 = this.l;
                    i1 i1Var = dVar2.v;
                    e1 e1Var = new e1(this.m, new b(dVar2, 2), new com.yandex.passport.internal.ui.challenge.vpn.c(1, this.l, d.class, "onCanRegister", "onCanRegister(Lcom/yandex/passport/internal/ui/domik/AuthTrack;)V", 0, 3), new com.yandex.passport.internal.ui.challenge.vpn.c(1, this.l, d.class, "onSocialAuth", "onSocialAuth(Lcom/yandex/passport/internal/ui/domik/AuthTrack;)V", 0, 4), new w4i(2, this.l, d.class, "onError", "onError(Lcom/yandex/passport/internal/ui/domik/AuthTrack;Lcom/yandex/passport/internal/ui/EventError;)V", 0, 28));
                    this.k = 1;
                    if (i1Var.g(e1Var, this) == nm6Var2) {
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
