package com.yandex.passport.internal.ui.social;

import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.passport.sloth.a0;
import com.yandex.passport.sloth.d1;
import com.yandex.passport.sloth.data.o0;
import com.yandex.passport.sloth.j0;
import com.yandex.passport.sloth.ui.b0;
import com.yandex.passport.sloth.v;
import com.yandex.plus.home.common.network.NetworkResponse;
import com.yandex.plus.pay.adapter.api.g0;
import com.yandex.plus.pay.adapter.internal.c1;
import com.yandex.plus.pay.api.model.PlusPayGoogleBillingConfig;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import defpackage.arf;
import defpackage.aur;
import defpackage.b6e;
import defpackage.bca;
import defpackage.buu;
import defpackage.ci0;
import defpackage.eno;
import defpackage.fkn;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.q6k;
import defpackage.qgg;
import defpackage.rj7;
import defpackage.tf6;
import defpackage.u21;
import defpackage.wp3;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.zsd;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class i extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new i((j) this.l, continuation, 0);
            case 1:
                return new i((o) this.l, continuation, 1);
            case 2:
                return new i((j0) this.l, continuation, 2);
            case 3:
                return new i((d1) this.l, continuation, 3);
            case 4:
                return new i((b0) this.l, continuation, 4);
            case 5:
                return new i((com.yandex.plus.bdui.plus.auth.a) this.l, continuation, 5);
            case 6:
                return new i((com.yandex.plus.bdui.plus.checkout.content.controller.b0) this.l, continuation, 6);
            case 7:
                return new i((com.yandex.plus.core.activity.result.internal.h) this.l, continuation, 7);
            case 8:
                return new i((com.yandex.plus.core.debug.panel.internal.presentation.controller.b) this.l, continuation, 8);
            case 9:
                return new i((com.yandex.plus.core.network.api.interceptors.a) this.l, continuation, 9);
            case 10:
                return new i((com.yandex.plus.core.network.api.interceptors.f) this.l, continuation, 10);
            case 11:
                return new i((com.yandex.plus.domain.auth.impl.i) this.l, continuation, 11);
            case 12:
                return new i((com.yandex.plus.home.auth.f) this.l, continuation, 12);
            case 13:
                return new i((com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.m) this.l, continuation, 13);
            case 14:
                return new i((com.yandex.plus.home.feature.webviews.internal.bridge.b) this.l, continuation, 14);
            case 15:
                return new i((com.yandex.plus.home.feature.webviews.internal.bridge.g) this.l, continuation, 15);
            case 16:
                return new i((com.yandex.plus.home.feature.webviews.internal.container.t) this.l, continuation, 16);
            case 17:
                return new i((com.yandex.passport.sloth.ui.dependencies.m) this.l, continuation, 17);
            case 18:
                return new i((com.yandex.plus.home.feature.webviews.internal.smart.e) this.l, continuation, 18);
            case 19:
                return new i((com.yandex.plus.home.feature.webviews.internal.stories.k) this.l, continuation, 19);
            case 20:
                return new i((com.yandex.plus.home.feature.webviews.internal.webview.b) this.l, continuation, 20);
            case 21:
                return new i((com.yandex.plus.home.graphql.configuration.j) this.l, continuation, 21);
            case 22:
                return new i((com.yandex.plus.home.payment.google.d) this.l, continuation, 22);
            case 23:
                return new i((com.yandex.plus.home.plaque.feature.internal.presentation.b) this.l, continuation, 23);
            case 24:
                return new i((com.yandex.plus.home.plaque.feature.internal.presentation.b) this.l, continuation, 24);
            case 25:
                return new i((com.yandex.plus.pay.internal.g) this.l, continuation, 25);
            case 26:
                return new i((com.yandex.plus.pay.internal.feature.payment.inapp.google.n) this.l, continuation, 26);
            case 27:
                return new i((com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.b) this.l, continuation, 27);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new i((com.yandex.plus.pay.internal.feature.user.h) this.l, continuation, 28);
            default:
                return new i((com.yandex.plus.core.network.api.interceptors.a) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                ((i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 1:
                ((i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v48, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v74, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        com.yandex.plus.bdui.plus.auth.f fVar;
        Object d;
        Object a;
        Object f;
        com.yandex.plus.pay.common.api.utils.b r;
        Object e;
        int i = 10;
        int i2 = 18;
        int i3 = 2;
        int i4 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (this.j) {
            case 0:
                j jVar = (j) this.l;
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    fkn fknVar = ((com.yandex.passport.internal.ui.social.authenticators.f) jVar.h.getValue()).r;
                    com.yandex.passport.common.ui.compose.a aVar = new com.yandex.passport.common.ui.compose.a(12, jVar);
                    this.k = 1;
                    if (fknVar.a.collect(aVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 1:
                o oVar = (o) this.l;
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    String str = o.k;
                    fkn fknVar2 = ((com.yandex.passport.internal.ui.social.authenticators.f) oVar.j.getValue()).r;
                    com.yandex.passport.common.ui.compose.a aVar2 = new com.yandex.passport.common.ui.compose.a(13, oVar);
                    this.k = 1;
                    if (fknVar2.a.collect(aVar2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    v vVar = ((j0) this.l).e;
                    a0 a0Var = new a0(new NullPointerException(), "cookie not found");
                    this.k = 1;
                    if (vVar.c(a0Var, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    d1 d1Var = (d1) this.l;
                    com.yandex.passport.sloth.url.v vVar2 = d1Var.f;
                    o0 o0Var = d1Var.a.a;
                    this.k = 1;
                    if (vVar2.m(o0Var, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = ((b0) this.l).A;
                    this.k = 1;
                    if (x0qVar.emit(null, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    buu buuVar = ((com.yandex.plus.bdui.plus.auth.a) this.l).a;
                    this.k = 1;
                    invoke = buuVar.invoke(this);
                    if (invoke == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    invoke = obj;
                }
                com.yandex.plus.bdui.plus.auth.f fVar2 = (com.yandex.plus.bdui.plus.auth.f) invoke;
                com.yandex.plus.bdui.plus.auth.a aVar3 = (com.yandex.plus.bdui.plus.auth.a) this.l;
                if (fVar2 instanceof com.yandex.plus.bdui.plus.auth.e) {
                    com.yandex.plus.bdui.plus.auth.e eVar = (com.yandex.plus.bdui.plus.auth.e) fVar2;
                    fVar = new com.yandex.plus.bdui.plus.auth.e(eVar.a, "[hidden]", eVar.c);
                } else {
                    if (!(fVar2 instanceof com.yandex.plus.bdui.plus.auth.d) && !Intrinsics.d(fVar2, com.yandex.plus.bdui.plus.auth.c.a)) {
                        b6e.s();
                        return null;
                    }
                    fVar = fVar2;
                }
                com.yandex.plus.log.api.b bVar = aVar3.b;
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                if (bVar.b(aVar4)) {
                    bVar.c(aVar4, "DefaultPlusAuthController", "handleAuthResult(); authResult = " + fVar);
                }
                ReentrantLock reentrantLock = aVar3.e;
                reentrantLock.lock();
                try {
                    if (aVar3.f) {
                        aVar3.f = false;
                        fVar2.getClass();
                        com.yandex.plus.bdui.plus.auth.e eVar2 = fVar2 instanceof com.yandex.plus.bdui.plus.auth.e ? (com.yandex.plus.bdui.plus.auth.e) fVar2 : null;
                        aVar3.d = eVar2 != null ? new com.yandex.plus.bdui.plus.auth.b(eVar2.a, eVar2.b, eVar2.c) : null;
                        Iterator it = aVar3.g.iterator();
                        while (it.hasNext()) {
                            ((Function1) it.next()).invoke(fVar2);
                        }
                    } else {
                        i4 = 0;
                    }
                    aVar3.g.clear();
                    reentrantLock.unlock();
                    com.yandex.plus.log.api.b bVar2 = aVar3.b;
                    if (i4 != 0) {
                        com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.c;
                        if (bVar2.b(aVar5)) {
                            bVar2.c(aVar5, "DefaultPlusAuthController", "handleAuthResult(); handled");
                        }
                    } else {
                        com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.d;
                        if (bVar2.b(aVar6)) {
                            bVar2.c(aVar6, "DefaultPlusAuthController", "handleAuthResult(); was not launched! (Maybe already handled or cancelled)");
                        }
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i11 = this.k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.pay.inapp.api.b bVar3 = (com.yandex.plus.pay.inapp.api.b) ((com.yandex.plus.bdui.plus.checkout.content.controller.b0) this.l).d;
                com.yandex.plus.pay.inapp.api.e eVar3 = com.yandex.plus.pay.inapp.api.e.a;
                this.k = 1;
                Object b = bVar3.b(eVar3, this);
                return b == nm6Var7 ? nm6Var7 : b;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i12 = this.k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.core.activity.result.internal.h hVar = (com.yandex.plus.core.activity.result.internal.h) this.l;
                this.k = 1;
                Object g0 = zsd.g0(new com.yandex.passport.internal.t(hVar.c, 24), this);
                return g0 == nm6Var8 ? nm6Var8 : g0;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i13 = this.k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.core.debug.panel.internal.presentation.controller.b bVar4 = (com.yandex.plus.core.debug.panel.internal.presentation.controller.b) this.l;
                xdr xdrVar = (xdr) bVar4.a.g;
                com.yandex.passport.common.ui.compose.a aVar7 = new com.yandex.passport.common.ui.compose.a(16, bVar4);
                this.k = 1;
                xdrVar.collect(aVar7, this);
                return nm6Var9;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i14 = this.k;
                if (i14 != 0) {
                    if (i14 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ?? r2 = (aur) ((com.yandex.plus.core.network.api.interceptors.a) this.l).b;
                this.k = 1;
                Object invoke2 = r2.invoke(this);
                return invoke2 == nm6Var10 ? nm6Var10 : invoke2;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i15 = this.k;
                if (i15 != 0) {
                    if (i15 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ?? r22 = ((com.yandex.plus.core.network.api.interceptors.f) this.l).a;
                this.k = 1;
                Object invoke3 = r22.invoke(this);
                return invoke3 == nm6Var11 ? nm6Var11 : invoke3;
            case 11:
                com.yandex.plus.domain.auth.impl.i iVar = (com.yandex.plus.domain.auth.impl.i) this.l;
                nm6 nm6Var12 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar2 = iVar.a.b;
                    com.yandex.plus.bdui.q qVar = new com.yandex.plus.bdui.q(2, iVar, com.yandex.plus.domain.auth.impl.i.class, "onUserIdStateChanged", "onUserIdStateChanged(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 19);
                    this.k = 1;
                    if (zsd.O(xdrVar2, qVar, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i17 = this.k;
                if (i17 != 0) {
                    if (i17 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.domain.auth.api.g gVar = com.yandex.plus.domain.auth.api.g.a;
                com.yandex.plus.domain.auth.impl.i iVar2 = ((com.yandex.plus.home.auth.f) this.l).a;
                this.k = 1;
                Object a2 = gVar.a(iVar2, this);
                return a2 == nm6Var13 ? nm6Var13 : a2;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.m mVar = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.m) this.l;
                    this.k = 1;
                    if (mVar.Q(this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar8 = ((com.yandex.plus.home.feature.webviews.internal.bridge.b) this.l).g;
                    this.k = 1;
                    if (aVar8.u(this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var16 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    ?? r23 = ((com.yandex.plus.home.feature.webviews.internal.bridge.g) this.l).b;
                    this.k = 1;
                    if (r23.invoke(this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                com.yandex.plus.home.feature.webviews.internal.container.t tVar = (com.yandex.plus.home.feature.webviews.internal.container.t) this.l;
                nm6 nm6Var17 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) tVar.w.invoke();
                    com.yandex.passport.common.ui.compose.a aVar9 = new com.yandex.passport.common.ui.compose.a(i2, tVar);
                    this.k = 1;
                    if (pjcVar.collect(aVar9, this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                com.yandex.passport.sloth.ui.dependencies.m mVar2 = (com.yandex.passport.sloth.ui.dependencies.m) this.l;
                nm6 nm6Var18 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    ((Function0) mVar2.h).invoke();
                    ((com.yandex.passport.internal.ui.bouncer.model.middleware.o) mVar2.j).a.a(com.yandex.plus.home.api.purchase.b.a);
                    com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar10 = (com.yandex.plus.home.plaque.plugin.internal.proxy.a) mVar2.f;
                    this.k = 1;
                    if (aVar10.u(this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                com.yandex.plus.home.feature.webviews.internal.smart.e eVar4 = (com.yandex.plus.home.feature.webviews.internal.smart.e) this.l;
                nm6 nm6Var19 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    ci0 ci0Var = eVar4.E;
                    this.k = 1;
                    if (ci0Var.e(this) == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                eVar4.i0();
                return Unit.a;
            case 19:
                com.yandex.plus.home.feature.webviews.internal.stories.k kVar = (com.yandex.plus.home.feature.webviews.internal.stories.k) this.l;
                ci0 ci0Var2 = kVar.Y;
                nm6 nm6Var20 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (ci0Var2.e(this) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                kVar.i0("loading timeout", kVar.B0.g);
                kVar.p.d(ci0Var2.a, kVar.h.c.c);
                return Unit.a;
            case 20:
                nm6 nm6Var21 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar11 = ((com.yandex.plus.home.feature.webviews.internal.webview.b) this.l).k;
                    this.k = 1;
                    if (aVar11.u(this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                nm6 nm6Var22 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.graphql.configuration.j jVar2 = (com.yandex.plus.home.graphql.configuration.j) this.l;
                    this.k = 1;
                    if (jVar2.d(this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 22:
                nm6 nm6Var23 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    g0 g0Var = ((com.yandex.plus.home.payment.google.d) this.l).a;
                    this.k = 1;
                    d = ((c1) g0Var).d(this);
                    if (d == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d = obj;
                }
                com.yandex.plus.pay.adapter.api.r rVar = (com.yandex.plus.pay.adapter.api.r) d;
                if (rVar != null) {
                    return rVar;
                }
                throw new wp3("Google billing config is null", (Throwable) null);
            case 23:
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = (com.yandex.plus.home.plaque.feature.internal.presentation.b) this.l;
                nm6 nm6Var24 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.plaque.feature.internal.presentation.h hVar2 = (com.yandex.plus.home.plaque.feature.internal.presentation.h) ((arf) bVar5.d).getValue();
                    pjc k0 = zsd.k0(zsd.b0(new com.yandex.passport.common.mvi.d(new eno(new com.yandex.plus.bdui.ui.b((Object) new u21(i, new com.yandex.plus.home.graphql.plusstate.e(hVar2.k, 3), q6k.m((xdr) ((com.yandex.passport.internal.flags.experiments.p) hVar2.a.a).d, new com.yandex.plus.home.feature.webviews.internal.webview.e(7), q6k.g), com.yandex.plus.home.plaque.feature.internal.presentation.c.a), (Continuation) (objArr == true ? 1 : 0), i4)), hVar2, 19)), hVar2.i);
                    com.yandex.passport.common.mvi.j jVar3 = new com.yandex.passport.common.mvi.j(i3, bVar5);
                    this.k = 1;
                    if (k0.collect(jVar3, this) == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var25 = nm6.a;
                int i29 = this.k;
                if (i29 != 0) {
                    if (i29 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar6 = (com.yandex.plus.home.plaque.feature.internal.presentation.b) this.l;
                this.k = 1;
                Object g02 = zsd.g0(zsd.I(new com.yandex.plus.home.feature.webviews.internal.treasury.d(bVar6, objArr2 == true ? 1 : 0, i)), this);
                return g02 == nm6Var25 ? nm6Var25 : g02;
            case 25:
                com.yandex.plus.pay.internal.g gVar2 = (com.yandex.plus.pay.internal.g) this.l;
                nm6 nm6Var26 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.internal.feature.experiments.listener.b bVar7 = (com.yandex.plus.pay.internal.feature.experiments.listener.b) gVar2.b.e.h.getValue();
                    com.yandex.plus.experiments.impl.providers.h hVar3 = (com.yandex.plus.experiments.impl.providers.h) gVar2.a.getValue();
                    tf6 tf6Var = hVar3.a;
                    kotlinx.coroutines.a aVar12 = hVar3.b;
                    x97.y(tf6Var, aVar12, null, new com.yandex.plus.experiments.impl.providers.a(hVar3, objArr4 == true ? 1 : 0, i4), 2);
                    pjc k02 = zsd.k0(zsd.b0(new bca(hVar3.k, i2)), aVar12);
                    com.yandex.plus.home.feature.webviews.internal.treasury.d dVar = new com.yandex.plus.home.feature.webviews.internal.treasury.d(bVar7, objArr3 == true ? 1 : 0, 11);
                    this.k = 1;
                    if (zsd.O(k02, dVar, this) == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 26:
                nm6 nm6Var27 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.internal.feature.payment.inapp.google.n nVar = (com.yandex.plus.pay.internal.feature.payment.inapp.google.n) this.l;
                    this.k = 1;
                    if (com.yandex.plus.pay.internal.feature.payment.inapp.google.n.b(nVar, this) == nm6Var27) {
                        return nm6Var27;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 27:
                com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.b bVar8 = (com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.b) this.l;
                nm6 nm6Var28 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    a = com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.b.a(bVar8, this);
                    if (a == nm6Var28) {
                        return nm6Var28;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                com.yandex.plus.pay.api.google.model.f fVar3 = (com.yandex.plus.pay.api.google.model.f) a;
                if (fVar3 == null) {
                    return null;
                }
                String upperCase = StringsKt.t0(fVar3.a).toString().toUpperCase(Locale.ROOT);
                upperCase.getClass();
                Iterable iterable = (Iterable) bVar8.c.invoke();
                HashSet hashSet = new HashSet();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String upperCase2 = StringsKt.t0((String) it2.next()).toString().toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    hashSet.add(upperCase2);
                }
                return new PlusPayGoogleBillingConfig(upperCase, hashSet.contains(upperCase));
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var29 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    ExternalMediaBillingApi externalMediaBillingApi = ((com.yandex.plus.pay.internal.feature.user.h) this.l).b;
                    this.k = 1;
                    f = externalMediaBillingApi.f(this);
                    if (f == nm6Var29) {
                        return nm6Var29;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    f = obj;
                }
                r = com.yandex.plus.bdui.flex.ui.a.r((NetworkResponse) f, new v0(18));
                return r;
            default:
                nm6 nm6Var30 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.domain.auth.impl.i iVar3 = (com.yandex.plus.domain.auth.impl.i) ((com.yandex.plus.core.network.api.interceptors.a) this.l).b;
                    this.k = 1;
                    e = iVar3.e(this);
                    if (e == nm6Var30) {
                        return nm6Var30;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    e = obj;
                }
                return ((com.yandex.plus.domain.auth.api.e) e).e();
        }
    }
}
