package com.yandex.plus.home.feature.webviews.internal.treasury;

import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.common.network.NetworkResponse;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.i1;
import com.yandex.plus.home.graphql.plusstate.f;
import com.yandex.plus.home.internal.di.i;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.home.plaque.feature.internal.presentation.h;
import com.yandex.plus.home.plaque.plugin.internal.proxy.g;
import com.yandex.plus.pay.api.model.PlusPayUserStatus;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.data.mb.dto.n2;
import com.yandex.plus.pay.data.mb.dto.o2;
import com.yandex.plus.pay.data.mb.dto.r2;
import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsParams;
import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenParams;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h0;
import defpackage.aur;
import defpackage.b6e;
import defpackage.bqi;
import defpackage.c5b;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.gld;
import defpackage.jyr;
import defpackage.ltm;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.ptm;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rjc;
import defpackage.t7o;
import defpackage.tyf;
import defpackage.uah;
import defpackage.vat;
import defpackage.wis;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.y7g;
import defpackage.z7o;
import defpackage.zsd;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new d((e) this.l, (String) this.m, continuation, 0);
            case 1:
                return new d((com.yandex.plus.home.feature.webviews.internal.webview.b) this.l, (d5) this.m, continuation, 1);
            case 2:
                return new d((f) this.m, continuation, 2);
            case 3:
                return new d((f) this.m, continuation, 3);
            case 4:
                return new d((com.yandex.plus.home.graphql.user.e) this.m, continuation, 4);
            case 5:
                return new d((com.yandex.plus.home.plaque.feature.internal.e) this.l, (com.yandex.plus.home.plaque.feature.api.context.a) this.m, continuation, 5);
            case 6:
                d dVar = new d((h) this.m, continuation, 6);
                dVar.l = obj;
                return dVar;
            case 7:
                return new d((h) this.l, (com.yandex.plus.home.plaque.repository.api.model.a) this.m, continuation, 7);
            case 8:
                d dVar2 = new d((g) this.m, continuation, 8);
                dVar2.l = obj;
                return dVar2;
            case 9:
                return new d((com.yandex.plus.home.plaque.repository.graphql.g) this.l, (String) this.m, continuation, 9);
            case 10:
                d dVar3 = new d((com.yandex.plus.home.plaque.feature.internal.presentation.b) this.m, continuation, 10);
                dVar3.l = obj;
                return dVar3;
            case 11:
                d dVar4 = new d((com.yandex.plus.pay.internal.feature.experiments.listener.b) this.m, continuation, 11);
                dVar4.l = obj;
                return dVar4;
            case 12:
                return new d((com.yandex.plus.pay.internal.feature.payment.inapp.google.data.d) this.l, (r2) this.m, continuation, 12);
            case 13:
                return new d((com.yandex.plus.pay.internal.feature.success.c) this.l, (PlusPayWebSuccessScreenParams) this.m, continuation, 13);
            case 14:
                return new d((com.yandex.plus.pay.internal.feature.topup.b) this.l, (String) this.m, continuation, 14);
            case 15:
                d dVar5 = new d((com.yandex.plus.pay.ui.core.internal.common.f) this.m, continuation, 15);
                dVar5.l = obj;
                return dVar5;
            case 16:
                d dVar6 = new d((com.yandex.plus.pay.ui.core.mobile.domain.b) this.m, continuation, 16);
                dVar6.l = obj;
                return dVar6;
            case 17:
                return new d((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c) this.l, (PlusPayWebCollectContactsParams) this.m, continuation, 17);
            case 18:
                return new d((h0) this.m, continuation, 18);
            case 19:
                return new d((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.h) this.l, (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) this.m, continuation, 19);
            default:
                return new d((com.yandex.plus.webview.internal.contract.impl.loading.a) this.l, (String) this.m, continuation, 20);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((d) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x03f9, code lost:
    
        if (r15.collect(r2, r14) == r1) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03e3, code lost:
    
        if (r15 == r1) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01da, code lost:
    
        if (r1.emit(r4, r14) == r2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a7, code lost:
    
        if (r15 == r2) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0683  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        bqi bqiVar;
        Object eVar;
        Object a;
        bqi bqiVar2;
        Throwable a2;
        com.yandex.plus.home.repository.api.model.a aVar;
        com.yandex.plus.home.repository.api.model.a aVar2;
        Object value;
        Pair pair;
        Set set;
        com.yandex.plus.pay.common.api.utils.b r;
        String str;
        com.yandex.plus.pay.common.api.utils.b r2;
        com.yandex.plus.pay.common.api.utils.b r3;
        Object obj2;
        Object obj3;
        String str2;
        String str3;
        xdr xdrVar;
        boolean z = false;
        int i = 1;
        boolean z2 = false;
        switch (this.j) {
            case 0:
                e eVar2 = (e) this.l;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = e.a(eVar2, this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.treasury.api.c cVar = (com.yandex.plus.treasury.api.c) obj;
                eVar2.c = cVar;
                i1 l = a1.l(cVar, (String) this.m);
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.g, "requestTreasuryState() result inMessage=" + l, null);
                return l;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.bdui.plus.content.controller.f fVar = ((com.yandex.plus.home.feature.webviews.internal.webview.b) this.l).s;
                    d5 d5Var = (d5) this.m;
                    this.k = 1;
                    if (fVar.u(d5Var, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                f fVar2 = (f) this.m;
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar2 = fVar2.h;
                    i iVar = fVar2.d;
                    this.l = xdrVar2;
                    this.k = 1;
                    Object a3 = iVar.a(this);
                    if (a3 != nm6Var3) {
                        bqiVar = xdrVar2;
                        obj = a3;
                    }
                    return nm6Var3;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bqiVar2 = (bqi) this.l;
                    qgg.h0(obj);
                    a = ((z7o) obj).a;
                    r7o r7oVar = z7o.b;
                    if (!(a instanceof t7o)) {
                        a = new com.yandex.plus.home.repository.api.model.e((com.yandex.plus.home.repository.api.model.plusstate.f) a);
                    }
                    a2 = z7o.a(a);
                    if (a2 != null) {
                        a = new com.yandex.plus.home.repository.api.model.b(a2);
                    }
                    eVar = (com.yandex.plus.home.repository.api.model.d) a;
                    bqiVar = bqiVar2;
                    xdr xdrVar3 = (xdr) bqiVar;
                    xdrVar3.getClass();
                    xdrVar3.m(null, eVar);
                    return Unit.a;
                }
                bqiVar = (bqi) this.l;
                qgg.h0(obj);
                if (((Long) obj) == null) {
                    eVar = new com.yandex.plus.home.repository.api.model.e(com.yandex.plus.home.repository.api.model.plusstate.e.a);
                    xdr xdrVar32 = (xdr) bqiVar;
                    xdrVar32.getClass();
                    xdrVar32.m(null, eVar);
                    return Unit.a;
                }
                this.l = bqiVar;
                this.k = 2;
                a = f.a(fVar2, this);
                if (a != nm6Var3) {
                    bqiVar2 = bqiVar;
                    r7o r7oVar2 = z7o.b;
                    if (!(a instanceof t7o)) {
                    }
                    a2 = z7o.a(a);
                    if (a2 != null) {
                    }
                    eVar = (com.yandex.plus.home.repository.api.model.d) a;
                    bqiVar = bqiVar2;
                    xdr xdrVar322 = (xdr) bqiVar;
                    xdrVar322.getClass();
                    xdrVar322.m(null, eVar);
                    return Unit.a;
                }
                return nm6Var3;
            case 3:
                f fVar3 = (f) this.m;
                Object obj4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.repository.api.model.a aVar3 = com.yandex.plus.home.repository.api.model.a.a;
                    com.yandex.plus.home.graphql.plusstate.e eVar3 = new com.yandex.plus.home.graphql.plusstate.e(fVar3.d(), z ? 1 : 0);
                    this.l = aVar3;
                    this.k = 1;
                    Object g0 = zsd.g0(eVar3, this);
                    if (g0 != obj4) {
                        aVar = aVar3;
                        obj = g0;
                    }
                    return obj4;
                }
                if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (com.yandex.plus.home.repository.api.model.a) this.l;
                qgg.h0(obj);
                aVar.getClass();
                Object a4 = com.yandex.plus.home.repository.api.model.a.a((com.yandex.plus.home.repository.api.model.d) obj);
                obj4 = new z7o(a4);
                com.yandex.plus.core.analytics.logging.d dVar = fVar3.g;
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.b;
                if (dVar.b(aVar4)) {
                    dVar.a(aVar4, "PlusStateRepositoryImpl", "waitForPlusState(): " + ((Object) z7o.b(a4)), null);
                }
                return obj4;
            case 4:
                com.yandex.plus.home.graphql.user.e eVar4 = (com.yandex.plus.home.graphql.user.e) this.m;
                Object obj5 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.repository.api.model.a aVar5 = com.yandex.plus.home.repository.api.model.a.a;
                    com.yandex.plus.home.graphql.plusstate.e eVar5 = new com.yandex.plus.home.graphql.plusstate.e(eVar4.c(), i);
                    this.l = aVar5;
                    this.k = 1;
                    Object g02 = zsd.g0(eVar5, this);
                    if (g02 != obj5) {
                        aVar2 = aVar5;
                        obj = g02;
                    }
                    return obj5;
                }
                if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = (com.yandex.plus.home.repository.api.model.a) this.l;
                qgg.h0(obj);
                aVar2.getClass();
                Object a5 = com.yandex.plus.home.repository.api.model.a.a((com.yandex.plus.home.repository.api.model.d) obj);
                obj5 = new z7o(a5);
                com.yandex.plus.core.analytics.logging.d dVar2 = eVar4.e;
                com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.b;
                if (dVar2.b(aVar6)) {
                    dVar2.a(aVar6, "GraphQLUserRepository", "waitForUserWithFamily(): " + ((Object) z7o.b(a5)), null);
                }
                return obj5;
            case 5:
                com.yandex.plus.home.plaque.feature.api.context.a aVar7 = (com.yandex.plus.home.plaque.feature.api.context.a) this.m;
                com.yandex.plus.home.plaque.feature.internal.e eVar6 = (com.yandex.plus.home.plaque.feature.internal.e) this.l;
                p pVar = eVar6.c;
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.b bVar = eVar6.f;
                    com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar8)) {
                        bVar.c(aVar8, "PlaqueFeatureImpl", "setExternalPlaqueContext(" + aVar7 + ')');
                    }
                    xdr xdrVar4 = (xdr) pVar.d;
                    do {
                        value = xdrVar4.getValue();
                        Set set2 = (Set) pVar.b;
                        set2.getClass();
                        pair = new Pair("PlaquesShown", CollectionsKt.A0(set2));
                        set = (Set) pVar.c;
                        set.getClass();
                    } while (!xdrVar4.k(value, new com.yandex.plus.home.plaque.feature.api.context.b(uah.i(uah.e(pair, new Pair("PlaquesInteracted", CollectionsKt.A0(set))), aVar7.a), aVar7.b, aVar7.c)));
                    p pVar2 = eVar6.j;
                    Map map = ((com.yandex.plus.home.plaque.feature.api.context.b) ((xdr) pVar.d).getValue()).b;
                    this.k = 1;
                    Object d = ((com.yandex.plus.home.plaque.repository.api.a) pVar2.b).d(map, this);
                    if (d != nm6.a) {
                        d = Unit.a;
                    }
                    if (d == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                h hVar = (h) this.m;
                vat vatVar = (vat) this.l;
                nm6 nm6Var5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.plaque.feature.api.context.b bVar2 = (com.yandex.plus.home.plaque.feature.api.context.b) vatVar.a;
                    com.yandex.plus.home.plaque.repository.api.model.a aVar9 = (com.yandex.plus.home.plaque.repository.api.model.a) vatVar.b;
                    com.yandex.plus.home.plaque.repository.api.model.b bVar3 = (com.yandex.plus.home.plaque.repository.api.model.b) vatVar.c;
                    com.yandex.plus.log.api.b bVar4 = hVar.g;
                    com.yandex.plus.log.api.a aVar10 = com.yandex.plus.log.api.a.c;
                    if (bVar4.b(aVar10)) {
                        bVar4.c(aVar10, "PlaqueViewModel", "showPlaque(" + bVar2 + ", " + aVar9 + ", " + bVar3 + ')');
                    }
                    this.l = null;
                    this.k = 1;
                    if (h.a(hVar, bVar2, aVar9, bVar3, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                Object obj6 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    y yVar = ((h) this.l).b;
                    com.yandex.plus.home.plaque.repository.api.model.a aVar11 = (com.yandex.plus.home.plaque.repository.api.model.a) this.m;
                    String str4 = aVar11.b;
                    String str5 = aVar11.g;
                    this.k = 1;
                    Object V = x97.V((kotlinx.coroutines.a) yVar.b, new com.yandex.plus.home.plaque.feature.internal.domain.interactors.a(yVar, str4, str5, null, 1), this);
                    Object obj7 = V;
                    if (V != obj6) {
                        obj7 = Unit.a;
                    }
                    if (obj7 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var6 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    g gVar = (g) this.m;
                    this.l = rjcVar;
                    this.k = 1;
                    obj = gVar.f(this);
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                pjc e = ((com.yandex.plus.home.plaque.repository.api.a) obj).e();
                com.yandex.plus.home.common.utils.flow.c cVar2 = new com.yandex.plus.home.common.utils.flow.c(rjcVar, i);
                this.l = null;
                this.k = 2;
                break;
            case 9:
                nm6 nm6Var7 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.plaque.repository.graphql.g gVar2 = (com.yandex.plus.home.plaque.repository.graphql.g) this.l;
                    String str6 = (String) this.m;
                    p pVar3 = (p) gVar2.k.invoke();
                    this.k = 1;
                    if (com.yandex.plus.home.plaque.repository.graphql.g.g(gVar2, str6, pVar3, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = (com.yandex.plus.home.plaque.feature.internal.presentation.b) this.m;
                ltm ltmVar = (ltm) this.l;
                nm6 nm6Var8 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    String str7 = ((ptm) bVar5.a).c;
                    str7.getClass();
                    com.yandex.plus.pay.inapp.google.internal.operation.f fVar4 = new com.yandex.plus.pay.inapp.google.internal.operation.f(str7, (com.yandex.plus.log.api.b) bVar5.b, ltmVar);
                    ((List) bVar5.e).add(fVar4);
                    com.yandex.plus.bdui.content.b bVar6 = new com.yandex.plus.bdui.content.b(29, bVar5, fVar4);
                    this.l = null;
                    this.k = 1;
                    if (y7g.q(ltmVar, bVar6, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                com.yandex.plus.core.d dVar3 = (com.yandex.plus.core.d) this.l;
                nm6 nm6Var9 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.internal.feature.experiments.listener.b bVar7 = (com.yandex.plus.pay.internal.feature.experiments.listener.b) this.m;
                    Object value2 = dVar3.getValue();
                    this.l = null;
                    this.k = 1;
                    if (bVar7.invoke(value2, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var10 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    ExternalMediaBillingApi externalMediaBillingApi = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.data.d) this.l).a;
                    r2 r2Var = (r2) this.m;
                    this.k = 1;
                    obj = externalMediaBillingApi.a(r2Var, this);
                    if (obj == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r = com.yandex.plus.bdui.flex.ui.a.r((NetworkResponse) obj, new v0(18));
                return r;
            case 13:
                nm6 nm6Var11 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.internal.feature.success.c cVar3 = (com.yandex.plus.pay.internal.feature.success.c) this.l;
                    ExternalMediaBillingApi externalMediaBillingApi2 = cVar3.a;
                    PlusPayWebSuccessScreenParams plusPayWebSuccessScreenParams = (PlusPayWebSuccessScreenParams) this.m;
                    c5b c5bVar = c5b.a;
                    String m = com.yandex.plus.core.locale.b.m(cVar3.b);
                    int i16 = com.yandex.plus.pay.internal.feature.success.a.a[plusPayWebSuccessScreenParams.getPageTheme().ordinal()];
                    if (i16 == 1) {
                        str = "LIGHT";
                    } else {
                        if (i16 != 2) {
                            b6e.s();
                            return null;
                        }
                        str = "DARK";
                    }
                    o2 o2Var = new o2(c5bVar, m, str, new n2(plusPayWebSuccessScreenParams.getInvoiceIds()));
                    this.k = 1;
                    obj = externalMediaBillingApi2.c(o2Var, this);
                    if (obj == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r2 = com.yandex.plus.bdui.flex.ui.a.r((NetworkResponse) obj, new v0(18));
                return r2;
            case 14:
                nm6 nm6Var12 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.internal.feature.topup.b bVar8 = (com.yandex.plus.pay.internal.feature.topup.b) this.l;
                    ExternalMediaBillingApi externalMediaBillingApi3 = bVar8.a;
                    String m2 = com.yandex.plus.core.locale.b.m(bVar8.b);
                    String str8 = (String) this.m;
                    this.k = 1;
                    obj = externalMediaBillingApi3.g(m2, str8, this);
                    if (obj == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r3 = com.yandex.plus.bdui.flex.ui.a.r((NetworkResponse) obj, new v0(18));
                return r3;
            case 15:
                nm6 nm6Var13 = nm6.a;
                int i18 = this.k;
                try {
                    if (i18 == 0) {
                        qgg.h0(obj);
                        String str9 = ((com.yandex.plus.pay.ui.core.internal.common.f) this.m).e;
                        if (str9 != null) {
                            return str9;
                        }
                        com.yandex.plus.pay.ui.core.internal.common.f fVar5 = (com.yandex.plus.pay.ui.core.internal.common.f) this.m;
                        r7o r7oVar3 = z7o.b;
                        com.yandex.plus.pay.internal.feature.user.b bVar9 = (com.yandex.plus.pay.internal.feature.user.b) ((com.yandex.plus.pay.internal.g) fVar5.c).d.getValue();
                        this.l = null;
                        this.k = 1;
                        obj = bVar9.a(this);
                        if (obj == nm6Var13) {
                            return nm6Var13;
                        }
                    } else {
                        if (i18 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    obj3 = ((PlusPayUserStatus) obj).getLogin();
                    r7o r7oVar4 = z7o.b;
                } catch (wis e2) {
                    r7o r7oVar5 = z7o.b;
                    obj2 = new t7o(e2);
                    obj3 = obj2;
                    String str10 = (String) (obj3 instanceof t7o ? null : obj3);
                    ((com.yandex.plus.pay.ui.core.internal.common.f) this.m).e = str10;
                    return str10;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th) {
                    r7o r7oVar6 = z7o.b;
                    obj2 = new t7o(th);
                    obj3 = obj2;
                    String str102 = (String) (obj3 instanceof t7o ? null : obj3);
                    ((com.yandex.plus.pay.ui.core.internal.common.f) this.m).e = str102;
                    return str102;
                }
                String str1022 = (String) (obj3 instanceof t7o ? null : obj3);
                ((com.yandex.plus.pay.ui.core.internal.common.f) this.m).e = str1022;
                return str1022;
            case 16:
                com.yandex.plus.pay.ui.core.mobile.domain.b bVar10 = (com.yandex.plus.pay.ui.core.mobile.domain.b) this.m;
                rjc rjcVar2 = (rjc) this.l;
                nm6 nm6Var14 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.core.internal.common.f fVar6 = bVar10.a;
                    this.l = rjcVar2;
                    this.k = 1;
                    Long id = ((com.yandex.plus.domain.auth.api.e) fVar6.a.getValue()).getId();
                    if (id == null) {
                        obj = null;
                        break;
                    } else {
                        obj = gld.Q(new com.yandex.plus.pay.ui.core.internal.common.e(id.longValue(), fVar6, null), this);
                        if (obj != nm6Var14) {
                            obj = (com.yandex.plus.pay.ui.core.api.common.b) obj;
                            break;
                        }
                    }
                } else {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.ui.core.api.common.b bVar11 = (com.yandex.plus.pay.ui.core.api.common.b) obj;
                bVar10.getClass();
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h hVar2 = new com.yandex.plus.pay.ui.core.mobile.view.toolbar.h((bVar11 == null || (str3 = bVar11.d) == null) ? com.yandex.plus.pay.ui.core.mobile.view.toolbar.a.a : new com.yandex.plus.pay.ui.core.mobile.view.toolbar.c(str3, bVar11.c), (bVar11 == null || (str2 = bVar11.b) == null) ? com.yandex.plus.pay.ui.core.mobile.view.toolbar.e.a : new com.yandex.plus.pay.ui.core.mobile.view.toolbar.f(str2));
                this.l = null;
                this.k = 2;
                break;
            case 17:
                nm6 nm6Var15 = nm6.a;
                int i20 = this.k;
                if (i20 != 0) {
                    if (i20 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.pay.internal.feature.contacts.d dVar4 = (com.yandex.plus.pay.internal.feature.contacts.d) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c) this.l).a.k.getValue();
                PlusPayWebCollectContactsParams plusPayWebCollectContactsParams = (PlusPayWebCollectContactsParams) this.m;
                this.k = 1;
                Object a6 = dVar4.a(plusPayWebCollectContactsParams, this);
                return a6 == nm6Var15 ? nm6Var15 : a6;
            case 18:
                h0 h0Var = (h0) this.m;
                xdr xdrVar5 = h0Var.A;
                nm6 nm6Var16 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    Boolean bool = Boolean.TRUE;
                    xdrVar5.getClass();
                    xdrVar5.m(null, bool);
                    xdr xdrVar6 = h0Var.E;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a aVar12 = h0Var.u;
                    this.l = xdrVar6;
                    this.k = 1;
                    Object b = aVar12.a.b(this);
                    if (b == nm6Var16) {
                        return nm6Var16;
                    }
                    xdrVar = xdrVar6;
                    obj = b;
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar = (xdr) this.l;
                    qgg.h0(obj);
                }
                xdrVar.l(obj);
                Boolean bool2 = Boolean.FALSE;
                xdrVar5.getClass();
                xdrVar5.m(null, bool2);
                return Unit.a;
            case 19:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.h hVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.h) this.l;
                nm6 nm6Var17 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.c cVar4 = hVar3.k;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar13 = (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) this.m;
                    this.k = 1;
                    obj = cVar4.a(aVar13, this);
                    if (obj == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.a aVar14 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.a) obj;
                if (aVar14 == null) {
                    hVar3.G();
                } else {
                    String str11 = aVar14.b;
                    hVar3.o = aVar14;
                    if (str11 != null) {
                        xdr xdrVar7 = hVar3.p;
                        Long l2 = aVar14.c;
                        long longValue = l2 != null ? l2.longValue() : 10000L;
                        Long l3 = aVar14.d;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.e eVar7 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.e(str11, longValue, l3 != null ? l3.longValue() : 10000L);
                        xdrVar7.getClass();
                        xdrVar7.m(null, eVar7);
                        com.yandex.plus.pay.ui.core.tarifficator.api.domain.topup.a aVar15 = hVar3.m;
                        String str12 = aVar14.a;
                        aVar15.getClass();
                        str12.getClass();
                        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a7 = aVar15.a.a();
                        cdk cdkVar = aVar15.b;
                        String d2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a7.a);
                        cdkVar.getClass();
                        d2.getClass();
                        LinkedHashMap m3 = dfi.m("purchase_session_id", d2, "action_scenario", str12);
                        m3.put("url", str11);
                        m3.put("_meta", cdk.c(new HashMap()));
                        cdkVar.f("PostPaymentYB.Screen.Shown", m3);
                    } else {
                        hVar3.G();
                    }
                }
                return Unit.a;
            default:
                com.yandex.plus.webview.internal.contract.impl.loading.a aVar16 = (com.yandex.plus.webview.internal.contract.impl.loading.a) this.l;
                nm6 nm6Var18 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    long j = aVar16.a;
                    com.yandex.plus.pay.ui.core.debug.internal.ui.form.b bVar12 = new com.yandex.plus.pay.ui.core.debug.internal.ui.form.b(aVar16, z2 ? 1 : 0, 13);
                    this.k = 1;
                    obj = tyf.L(j, bVar12, this);
                    if (obj == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                aVar16.d((String) this.m, obj != null);
                aVar16.h = null;
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }
}
