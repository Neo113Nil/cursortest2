package com.yandex.passport.internal.storage.datastore;

import defpackage.aur;
import defpackage.hmm;
import defpackage.lpi;
import defpackage.nm6;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class b extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ hmm.a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hmm.a aVar, Continuation continuation) {
        super(2, continuation);
        this.k = aVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.k, continuation);
        bVar.j = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.f(this.k);
        return Unit.a;
    }
}
