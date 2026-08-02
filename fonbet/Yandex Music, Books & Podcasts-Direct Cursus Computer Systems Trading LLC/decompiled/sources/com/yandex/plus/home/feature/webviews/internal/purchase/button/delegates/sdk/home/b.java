package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home;

import android.net.Uri;
import com.yandex.plus.core.graphql.a3;
import com.yandex.plus.core.graphql.b3;
import com.yandex.plus.core.graphql.w2;
import com.yandex.plus.home.common.network.NetworkResponse;
import com.yandex.plus.home.datasource.openapi.models.r0;
import com.yandex.plus.home.feature.webviews.internal.treasury.e;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.i1;
import com.yandex.plus.home.graphql.panel.g;
import com.yandex.plus.home.plaque.repository.rest.o;
import com.yandex.plus.home.repository.api.model.d;
import com.yandex.plus.home.repository.api.model.panel.i;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
import com.yandex.plus.pay.adapter.api.j;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.internal.feature.closing.f;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.k;
import defpackage.aur;
import defpackage.bqi;
import defpackage.cdk;
import defpackage.dp0;
import defpackage.f1d;
import defpackage.fkn;
import defpackage.kp0;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.r0w;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tc4;
import defpackage.wis;
import defpackage.x0q;
import defpackage.xdr;
import defpackage.xpi;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.z7o;
import defpackage.zsd;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, Continuation continuation, o oVar, List list, Map map) {
        super(2, continuation);
        this.j = 6;
        this.l = obj;
        this.m = oVar;
        this.n = list;
        this.o = map;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b((c) this.l, (String) this.m, (a0) this.n, (j) this.o, continuation, 0);
            case 1:
                b bVar = new b((e) this.m, (b6) this.n, (com.yandex.plus.home.feature.webviews.internal.smart.c) this.o, continuation, 1);
                bVar.l = obj;
                return bVar;
            case 2:
                b bVar2 = new b((e) this.m, (b6) this.n, (com.yandex.plus.home.feature.webviews.internal.webview.b) this.o, continuation, 2);
                bVar2.l = obj;
                return bVar2;
            case 3:
                return new b((xqn) this.n, (g) this.o, (String) this.m, continuation);
            case 4:
                b bVar3 = new b((com.yandex.plus.home.graphql.user.e) this.o, continuation);
                bVar3.n = obj;
                return bVar3;
            case 5:
                return new b((pjc) this.l, (fkn) this.m, (com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b) this.n, (com.yandex.plus.home.plaque.feature.internal.e) this.o, continuation, 5);
            case 6:
                return new b(this.l, continuation, (o) this.m, (List) this.n, (Map) this.o);
            case 7:
                return new b(7, (f) this.l, (List) this.n, (String) this.m, (String) this.o, continuation);
            case 8:
                return new b(8, (com.yandex.plus.pay.internal.feature.presale.f) this.l, (List) this.n, (String) this.m, (String) this.o, continuation);
            case 9:
                return new b(9, (com.yandex.plus.pay.ui.core.api.domain.a) this.l, (Uri) this.n, (String) this.m, (String) this.o, continuation);
            case 10:
                b bVar4 = new b((String) this.n, (h) this.o, continuation, 10);
                bVar4.l = obj;
                return bVar4;
            case 11:
                return new b((k) this.n, (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) this.o, continuation, 11);
            default:
                return new b((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j) this.l, (String) this.m, (String) this.n, (String) this.o, continuation, 12);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((b) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:32|33|(1:(4:36|37|38|39)(2:64|65))(6:66|67|68|(1:70)|51|52)|40|41|42|(2:44|(1:46))|47|(1:49)|50|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0367, code lost:
    
        if (r0 == r7) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0123, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0124, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0120, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0121, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0397 A[Catch: all -> 0x033d, CancellationException -> 0x0340, wis -> 0x0343, TryCatch #1 {CancellationException -> 0x0340, blocks: (B:161:0x0337, B:163:0x038f, B:165:0x0397, B:167:0x039d, B:182:0x03a1, B:183:0x03a8, B:198:0x0374), top: B:155:0x0327 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x039d A[Catch: all -> 0x033d, CancellationException -> 0x0340, wis -> 0x0343, TryCatch #1 {CancellationException -> 0x0340, blocks: (B:161:0x0337, B:163:0x038f, B:165:0x0397, B:167:0x039d, B:182:0x03a1, B:183:0x03a8, B:198:0x0374), top: B:155:0x0327 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a1 A[Catch: all -> 0x033d, CancellationException -> 0x0340, wis -> 0x0343, TryCatch #1 {CancellationException -> 0x0340, blocks: (B:161:0x0337, B:163:0x038f, B:165:0x0397, B:167:0x039d, B:182:0x03a1, B:183:0x03a8, B:198:0x0374), top: B:155:0x0327 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0162  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object c2;
        bqi bqiVar;
        Object obj2;
        xpi xpiVar;
        Object a;
        d eVar;
        String l;
        xpi xpiVar2;
        Object f;
        t7o t7oVar;
        Object obj3;
        Object h;
        Object b;
        Object d;
        String str;
        Object w;
        String str2;
        t7o t7oVar2;
        Throwable a2;
        xdr xdrVar;
        Object a3;
        com.yandex.plus.pay.ui.common.internal.error.content.h hVar;
        int i = this.j;
        Object obj4 = this.o;
        int i2 = 1;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((c) this.l).c.C((String) this.m, (a0) this.n, (j) obj4, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                com.yandex.plus.home.feature.webviews.internal.smart.c cVar = (com.yandex.plus.home.feature.webviews.internal.smart.c) obj4;
                e eVar2 = (e) this.m;
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    b6 b6Var = (b6) this.n;
                    this.l = mm6Var;
                    this.k = 1;
                    c = eVar2.c(b6Var, this);
                    if (c == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = obj;
                }
                cVar.A((i1) c);
                eVar2.b(mm6Var, new com.yandex.plus.home.feature.webviews.internal.simple.d(1, cVar, com.yandex.plus.home.feature.webviews.internal.smart.c.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 4));
                return Unit.a;
            case 2:
                com.yandex.plus.home.feature.webviews.internal.webview.b bVar = (com.yandex.plus.home.feature.webviews.internal.webview.b) obj4;
                e eVar3 = (e) this.m;
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    b6 b6Var2 = (b6) this.n;
                    this.l = mm6Var2;
                    this.k = 1;
                    c2 = eVar3.c(b6Var2, this);
                    if (c2 == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c2 = obj;
                }
                i1 i1Var = (i1) c2;
                com.yandex.plus.log.api.b bVar2 = bVar.u;
                String A = bVar.A();
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                if (bVar2.b(aVar)) {
                    bVar2.c(aVar, A, "handleTreasuryStateRequest() sendMessage");
                }
                bVar.C(i1Var);
                eVar3.b(mm6Var2, new com.yandex.plus.home.feature.webviews.internal.webview.a(1, (com.yandex.plus.home.feature.webviews.internal.webview.b) obj4, com.yandex.plus.home.feature.webviews.internal.webview.b.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 0));
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    bqi bqiVar2 = (bqi) ((xqn) this.n).a;
                    String str3 = (String) this.m;
                    this.l = bqiVar2;
                    this.k = 1;
                    Object b2 = g.b((g) obj4, str3, this);
                    if (b2 == nm6Var4) {
                        return nm6Var4;
                    }
                    bqiVar = bqiVar2;
                    obj2 = b2;
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bqiVar = (bqi) this.l;
                    qgg.h0(obj);
                    obj2 = ((z7o) obj).a;
                }
                Throwable a4 = z7o.a(obj2);
                Object eVar4 = a4 == null ? new com.yandex.plus.home.repository.api.model.e((i) obj2) : new com.yandex.plus.home.repository.api.model.b(a4);
                xdr xdrVar2 = (xdr) bqiVar;
                xdrVar2.getClass();
                xdrVar2.m(null, eVar4);
                return Unit.a;
            case 4:
                com.yandex.plus.home.graphql.user.e eVar5 = (com.yandex.plus.home.graphql.user.e) obj4;
                mm6 mm6Var3 = (mm6) this.n;
                nm6 nm6Var5 = nm6.a;
                int i7 = this.k;
                try {
                    if (i7 == 0) {
                        qgg.h0(obj);
                        xpiVar = eVar5.h;
                        com.yandex.plus.home.internal.di.i iVar = eVar5.b;
                        this.n = mm6Var3;
                        this.l = xpiVar;
                        this.k = 1;
                        a = iVar.a(this);
                        break;
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            xpiVar2 = (bqi) this.m;
                            eVar5 = (com.yandex.plus.home.graphql.user.e) this.l;
                            try {
                                qgg.h0(obj);
                                f = obj;
                                w2 w2Var = (w2) ((kp0) f).c;
                                obj3 = w2Var == null ? w2Var.a : null;
                            } catch (wis e) {
                                e = e;
                                r7o r7oVar = z7o.b;
                                t7oVar = new t7o(e);
                                obj3 = t7oVar;
                                xpiVar = xpiVar2;
                                com.yandex.plus.bdui.plus.content.controller.f fVar = eVar5.f;
                                if (!(obj3 instanceof t7o)) {
                                }
                                Throwable a5 = z7o.a(obj3);
                                if (a5 == null) {
                                }
                                xdr xdrVar3 = (xdr) xpiVar;
                                xdrVar3.getClass();
                                xdrVar3.m(null, eVar);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                r7o r7oVar2 = z7o.b;
                                t7oVar = new t7o(th);
                                obj3 = t7oVar;
                                xpiVar = xpiVar2;
                                com.yandex.plus.bdui.plus.content.controller.f fVar2 = eVar5.f;
                                if (!(obj3 instanceof t7o)) {
                                }
                                Throwable a52 = z7o.a(obj3);
                                if (a52 == null) {
                                }
                                xdr xdrVar32 = (xdr) xpiVar;
                                xdrVar32.getClass();
                                xdrVar32.m(null, eVar);
                                return Unit.a;
                            }
                            if (obj3 != null) {
                                throw new IllegalArgumentException("User data is null!");
                            }
                            r7o r7oVar3 = z7o.b;
                            xpiVar = xpiVar2;
                            com.yandex.plus.bdui.plus.content.controller.f fVar22 = eVar5.f;
                            if (!(obj3 instanceof t7o)) {
                                try {
                                    obj3 = fVar22.o((a3) obj3);
                                } catch (Throwable th2) {
                                    r7o r7oVar4 = z7o.b;
                                    obj3 = new t7o(th2);
                                }
                            }
                            Throwable a522 = z7o.a(obj3);
                            eVar = a522 == null ? new com.yandex.plus.home.repository.api.model.e((com.yandex.plus.home.repository.api.model.user.f) obj3) : new com.yandex.plus.home.repository.api.model.b(a522);
                            xdr xdrVar322 = (xdr) xpiVar;
                            xdrVar322.getClass();
                            xdrVar322.m(null, eVar);
                            return Unit.a;
                        }
                        xpi xpiVar3 = (bqi) this.l;
                        qgg.h0(obj);
                        xpiVar = xpiVar3;
                        a = obj;
                    }
                    Long l2 = (Long) a;
                    if (l2 == null || (l = l2.toString()) == null) {
                        eVar = new com.yandex.plus.home.repository.api.model.e(com.yandex.plus.home.repository.api.model.user.e.a);
                        xdr xdrVar3222 = (xdr) xpiVar;
                        xdrVar3222.getClass();
                        xdrVar3222.m(null, eVar);
                        return Unit.a;
                    }
                    try {
                        r7o r7oVar5 = z7o.b;
                        b3 b3Var = new b3(l);
                        dp0 dp0Var = eVar5.a;
                        this.n = null;
                        this.l = eVar5;
                        this.m = xpiVar;
                        this.k = 2;
                        f = com.yandex.plus.bdui.flex.ui.a.f(dp0Var, b3Var, this);
                        if (f != nm6Var5) {
                            xpiVar2 = xpiVar;
                            w2 w2Var2 = (w2) ((kp0) f).c;
                            if (w2Var2 == null) {
                            }
                            if (obj3 != null) {
                            }
                        }
                        return nm6Var5;
                    } catch (wis e2) {
                        e = e2;
                        xpiVar2 = xpiVar;
                        r7o r7oVar6 = z7o.b;
                        t7oVar = new t7o(e);
                        obj3 = t7oVar;
                        xpiVar = xpiVar2;
                        com.yandex.plus.bdui.plus.content.controller.f fVar222 = eVar5.f;
                        if (!(obj3 instanceof t7o)) {
                        }
                        Throwable a5222 = z7o.a(obj3);
                        if (a5222 == null) {
                        }
                        xdr xdrVar32222 = (xdr) xpiVar;
                        xdrVar32222.getClass();
                        xdrVar32222.m(null, eVar);
                        return Unit.a;
                    } catch (Throwable th3) {
                        th = th3;
                        xpiVar2 = xpiVar;
                        r7o r7oVar22 = z7o.b;
                        t7oVar = new t7o(th);
                        obj3 = t7oVar;
                        xpiVar = xpiVar2;
                        com.yandex.plus.bdui.plus.content.controller.f fVar2222 = eVar5.f;
                        if (!(obj3 instanceof t7o)) {
                        }
                        Throwable a52222 = z7o.a(obj3);
                        if (a52222 == null) {
                        }
                        xdr xdrVar322222 = (xdr) xpiVar;
                        xdrVar322222.getClass();
                        xdrVar322222.m(null, eVar);
                        return Unit.a;
                    }
                } catch (CancellationException e3) {
                    throw e3;
                }
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    tc4 u0 = zsd.u0(new com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b(4, zsd.d0((pjc) this.l, 1)), zsd.d0((fkn) this.m, 1), (com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b) this.n);
                    com.yandex.passport.common.ui.compose.a aVar2 = new com.yandex.passport.common.ui.compose.a(21, (com.yandex.plus.home.plaque.feature.internal.e) obj4);
                    this.k = 1;
                    if (u0.collect(aVar2, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                o oVar = (o) this.m;
                Object obj5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    r0 r0Var = (r0) this.l;
                    this.k = 1;
                    Object A2 = oVar.s.A(r0Var, (List) this.n, (Map) obj4, this);
                    if (A2 != obj5) {
                        obj5 = A2;
                    }
                    return obj5;
                }
                if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                obj5 = ((z7o) obj).a;
                Throwable a6 = z7o.a(obj5);
                if (a6 != null) {
                    com.yandex.plus.log.api.b bVar3 = oVar.m;
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                    if (bVar3.b(aVar3)) {
                        bVar3.a(aVar3, "RestPlaqueRepository", "can't map conditional plaque", a6);
                    }
                }
                if (obj5 instanceof t7o) {
                    return null;
                }
                return obj5;
            case 7:
                f fVar3 = (f) this.l;
                nm6 nm6Var7 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    ExternalMediaBillingApi externalMediaBillingApi = fVar3.a;
                    com.yandex.plus.pay.data.mb.dto.i iVar2 = new com.yandex.plus.pay.data.mb.dto.i((String) this.m, (String) obj4, com.yandex.plus.core.locale.b.m(fVar3.b), (List) this.n);
                    this.k = 1;
                    h = externalMediaBillingApi.h(iVar2, this);
                    if (h == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    h = obj;
                }
                return com.yandex.plus.bdui.flex.ui.a.r((NetworkResponse) h, new r0w(29, fVar3));
            case 8:
                com.yandex.plus.pay.internal.feature.presale.f fVar4 = (com.yandex.plus.pay.internal.feature.presale.f) this.l;
                nm6 nm6Var8 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    ExternalMediaBillingApi externalMediaBillingApi2 = fVar4.a;
                    com.yandex.plus.pay.data.mb.dto.b3 b3Var2 = new com.yandex.plus.pay.data.mb.dto.b3((String) this.m, (String) obj4, com.yandex.plus.core.locale.b.m(fVar4.b), (List) this.n);
                    this.k = 1;
                    b = externalMediaBillingApi2.b(b3Var2, this);
                    if (b == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                return com.yandex.plus.bdui.flex.ui.a.r((NetworkResponse) b, new com.yandex.plus.pay.internal.feature.counter_offers.f(i2, fVar4));
            case 9:
                String str4 = (String) obj4;
                com.yandex.plus.pay.ui.core.api.domain.a aVar4 = (com.yandex.plus.pay.ui.core.api.domain.a) this.l;
                com.yandex.plus.pay.log.impl.b bVar4 = aVar4.c;
                nm6 nm6Var9 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.domain.auth.impl.i iVar3 = aVar4.a;
                    String uri = ((Uri) this.n).toString();
                    uri.getClass();
                    String str5 = (String) this.m;
                    this.k = 1;
                    d = iVar3.d(uri, str5, this);
                    if (d == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d = ((z7o) obj).a;
                }
                Object obj6 = d;
                Throwable a7 = z7o.a(obj6);
                if (a7 != null) {
                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.e;
                    bVar4.getClass();
                    bVar4.a(aVar5, "PlusPayGetAuthorizedUrlInteractorImpl", "Failed to authorize url = \"" + str4 + '\"', a7);
                }
                boolean z = obj6 instanceof t7o;
                if (!z) {
                    com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.c;
                    bVar4.getClass();
                    bVar4.c(aVar6, "PlusPayGetAuthorizedUrlInteractorImpl", "Authorized url = \"" + ((String) obj6) + '\"');
                }
                return z ? str4 : obj6;
            case 10:
                h hVar2 = (h) obj4;
                String str6 = (String) this.n;
                Object obj7 = nm6.a;
                int i13 = this.k;
                try {
                    if (i13 == 0) {
                        qgg.h0(obj);
                        try {
                            r7o r7oVar7 = z7o.b;
                            com.yandex.plus.bdui.plus.content.controller.f b3 = ((com.yandex.plus.coil.b) hVar2.c).b(str6);
                            this.l = null;
                            this.m = str6;
                            this.k = 1;
                            w = b3.w(this);
                            if (w != obj7) {
                                str2 = str6;
                            }
                        } catch (wis e4) {
                            e = e4;
                            str = str6;
                            r7o r7oVar8 = z7o.b;
                            t7oVar2 = new t7o(e);
                            t7o t7oVar3 = t7oVar2;
                            str2 = str;
                            w = t7oVar3;
                            a2 = z7o.a(w);
                            if (a2 != null) {
                            }
                            obj7 = new Pair(str2, w instanceof t7o ? null : w);
                            return obj7;
                        } catch (Throwable th4) {
                            th = th4;
                            str = str6;
                            r7o r7oVar9 = z7o.b;
                            t7oVar2 = new t7o(th);
                            t7o t7oVar32 = t7oVar2;
                            str2 = str;
                            w = t7oVar32;
                            a2 = z7o.a(w);
                            if (a2 != null) {
                            }
                            obj7 = new Pair(str2, w instanceof t7o ? null : w);
                            return obj7;
                        }
                        return obj7;
                    }
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.m;
                    try {
                        qgg.h0(obj);
                        str2 = str;
                        w = obj;
                    } catch (wis e5) {
                        e = e5;
                        r7o r7oVar82 = z7o.b;
                        t7oVar2 = new t7o(e);
                        t7o t7oVar322 = t7oVar2;
                        str2 = str;
                        w = t7oVar322;
                        a2 = z7o.a(w);
                        if (a2 != null) {
                        }
                        obj7 = new Pair(str2, w instanceof t7o ? null : w);
                        return obj7;
                    } catch (Throwable th5) {
                        th = th5;
                        r7o r7oVar92 = z7o.b;
                        t7oVar2 = new t7o(th);
                        t7o t7oVar3222 = t7oVar2;
                        str2 = str;
                        w = t7oVar3222;
                        a2 = z7o.a(w);
                        if (a2 != null) {
                        }
                        obj7 = new Pair(str2, w instanceof t7o ? null : w);
                        return obj7;
                    }
                    r7o r7oVar10 = z7o.b;
                    a2 = z7o.a(w);
                    if (a2 != null) {
                        com.yandex.plus.log.api.b bVar5 = hVar2.d;
                        com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.e;
                        if (bVar5.b(aVar7)) {
                            bVar5.a(aVar7, "RichTextMapperImpl", f1d.g("Failed to load image: ", str6), a2);
                        }
                    }
                    obj7 = new Pair(str2, w instanceof t7o ? null : w);
                    return obj7;
                } catch (CancellationException e6) {
                    throw e6;
                }
            case 11:
                nm6 nm6Var10 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    k kVar = (k) this.n;
                    xdrVar = kVar.u;
                    com.yandex.plus.pay.ui.common.internal.error.content.h hVar3 = kVar.t;
                    this.l = xdrVar;
                    this.m = hVar3;
                    this.k = 1;
                    a3 = k.a(kVar, (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) obj4, this);
                    if (a3 == nm6Var10) {
                        return nm6Var10;
                    }
                    hVar = hVar3;
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hVar = (com.yandex.plus.pay.ui.common.internal.error.content.h) this.m;
                    xdr xdrVar4 = (xdr) this.l;
                    qgg.h0(obj);
                    xdrVar = xdrVar4;
                    a3 = obj;
                }
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.g gVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.g(hVar, (CharSequence) a3);
                xdrVar.getClass();
                xdrVar.m(null, gVar);
                return Unit.a;
            default:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j jVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j) this.l;
                nm6 nm6Var11 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = jVar.q;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.f fVar5 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.f((String) this.m, (String) this.n, (String) obj4);
                    this.k = 1;
                    if (x0qVar.emit(fVar5, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.a aVar8 = jVar.p;
                if (aVar8 != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a8 = jVar.k.a.a();
                    com.yandex.plus.pay.ui.webview.family.domain.a aVar9 = jVar.n;
                    String uuid = a8.a.toString();
                    uuid.getClass();
                    String str7 = aVar8.a;
                    String str8 = aVar8.c;
                    aVar9.getClass();
                    str8.getClass();
                    cdk cdkVar = aVar9.b;
                    cdkVar.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("purchase_session_id", uuid);
                    linkedHashMap.put("url", str7);
                    linkedHashMap.put("skipButtonText", str8);
                    linkedHashMap.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("FamilyInvite.Share.Clicked", linkedHashMap);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xqn xqnVar, g gVar, String str, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.n = xqnVar;
        this.o = gVar;
        this.m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, b6 b6Var, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = eVar;
        this.n = b6Var;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.yandex.plus.home.graphql.user.e eVar, Continuation continuation) {
        super(2, continuation);
        this.j = 4;
        this.o = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj, Object obj2, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.n = obj2;
        this.m = str;
        this.o = str2;
    }
}
