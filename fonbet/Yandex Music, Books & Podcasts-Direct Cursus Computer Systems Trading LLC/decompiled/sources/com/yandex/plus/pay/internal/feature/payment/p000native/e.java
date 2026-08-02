package com.yandex.plus.pay.internal.feature.payment.p000native;

import com.yandex.plus.bdui.plus.analytics.b;
import com.yandex.plus.pay.api.feature.tarifficator.payment.p;
import com.yandex.plus.pay.common.internal.log.a;
import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ f k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.k = fVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.k, continuation);
        eVar.j = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((p) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        p pVar = (p) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        this.k.p.g(a.a, "Collect silent payment state: ".concat(b.m(pVar)), null);
        return Unit.a;
    }
}
