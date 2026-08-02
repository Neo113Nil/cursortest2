package com.yandex.passport.internal.storage.datastore;

import defpackage.aur;
import defpackage.hmm;
import defpackage.lpi;
import defpackage.nm6;
import defpackage.qgg;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class c extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ hmm.a k;
    public final /* synthetic */ LinkedHashSet l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hmm.a aVar, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.k = aVar;
        this.l = linkedHashSet;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.k, this.l, continuation);
        cVar.j = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.getClass();
        lpiVar.h(this.k, this.l);
        return Unit.a;
    }
}
