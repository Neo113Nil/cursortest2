package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.core.openapi.a;
import com.yandex.plus.home.datasource.openapi.apis.CrossPlaqueControllerApi;
import com.yandex.plus.home.datasource.openapi.models.g5;
import defpackage.aur;
import defpackage.b6e;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends aur implements Function2 {
    public p j;
    public com.yandex.plus.core.openapi.f k;
    public int l;
    public final /* synthetic */ o m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.m = oVar;
        this.n = str;
        this.o = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        p pVar;
        com.yandex.plus.core.openapi.f fVar;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        o oVar = this.m;
        if (i == 0) {
            qgg.h0(obj);
            pVar = (p) oVar.k.invoke();
            g5 g5Var = new g5(this.n, this.o);
            com.yandex.plus.log.api.b bVar = oVar.m;
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "RestPlaqueRepository", "reportPlaqueClicked() request=" + g5Var);
            }
            pVar.G();
            CrossPlaqueControllerApi crossPlaqueControllerApi = oVar.a;
            this.j = pVar;
            com.yandex.plus.core.openapi.f fVar2 = com.yandex.plus.core.openapi.f.a;
            this.k = fVar2;
            this.l = 1;
            obj = crossPlaqueControllerApi.c(g5Var, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
            fVar = fVar2;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = this.k;
            pVar = this.j;
            qgg.h0(obj);
        }
        com.yandex.plus.core.openapi.a aVar2 = (com.yandex.plus.core.openapi.a) obj;
        com.yandex.plus.core.openapi.g gVar = oVar.c;
        fVar.getClass();
        aVar2.getClass();
        gVar.getClass();
        gVar.a(aVar2);
        boolean z = aVar2 instanceof a.b;
        if (z) {
            p.E(pVar);
        } else if (!(aVar2 instanceof a.AbstractC0017a)) {
            b6e.s();
            return null;
        }
        if (z) {
            return aVar2;
        }
        if (aVar2 instanceof a.AbstractC0017a) {
            pVar.F();
            return aVar2;
        }
        b6e.s();
        return null;
    }
}
