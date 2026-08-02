package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment;

import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.aur;
import defpackage.ezc;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ m k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = mVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a(this.k, continuation, 0);
            default:
                return new a(this.k, continuation, 1);
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

    /* JADX WARN: Type inference failed for: r3v2, types: [ezc, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        m mVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ?? r3 = (ezc) mVar.i;
                com.yandex.plus.home.pay.a aVar = com.yandex.plus.home.pay.a.b;
                r3.invoke(aVar);
                o oVar = (o) mVar.j;
                oVar.a.a(new com.yandex.plus.home.api.purchase.a(aVar));
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ?? r32 = (ezc) mVar.i;
                com.yandex.plus.home.pay.a aVar2 = com.yandex.plus.home.pay.a.a;
                r32.invoke(aVar2);
                o oVar2 = (o) mVar.j;
                oVar2.a.a(new com.yandex.plus.home.api.purchase.a(aVar2));
                break;
        }
        return Unit.a;
    }
}
