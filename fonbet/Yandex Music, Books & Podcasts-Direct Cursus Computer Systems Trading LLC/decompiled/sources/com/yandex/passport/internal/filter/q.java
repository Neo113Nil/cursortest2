package com.yandex.passport.internal.filter;

import defpackage.aur;
import defpackage.hmm;
import defpackage.lpi;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.tah;
import defpackage.w3f;
import defpackage.x3f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class q extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ LinkedHashMap k;
    public final /* synthetic */ r l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(LinkedHashMap linkedHashMap, r rVar, Continuation continuation) {
        super(2, continuation);
        this.k = linkedHashMap;
        this.l = rVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        q qVar = new q(this.k, this.l, continuation);
        qVar.j = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        r.d.getClass();
        hmm.a aVar = r.f;
        w3f w3fVar = x3f.d;
        m mVar = m.a;
        LinkedHashMap linkedHashMap = this.k;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            com.yandex.passport.data.models.j jVar = (com.yandex.passport.data.models.j) entry.getValue();
            this.l.getClass();
            com.yandex.passport.data.models.i iVar = jVar.a;
            Set set = jVar.b;
            linkedHashMap2.put(key, iVar == com.yandex.passport.data.models.i.a ? new u(set, (Set) null, 2) : new u((Set) null, set, 1));
        }
        lpiVar.g(aVar, w3fVar.c(mVar, linkedHashMap2));
        return Unit.a;
    }
}
