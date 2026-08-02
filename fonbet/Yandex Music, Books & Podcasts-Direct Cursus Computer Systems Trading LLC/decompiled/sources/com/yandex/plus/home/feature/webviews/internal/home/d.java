package com.yandex.plus.home.feature.webviews.internal.home;

import com.yandex.passport.data.network.l;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.c4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.e2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.j3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.k6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.p5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.q6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.s5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.y1;
import defpackage.c5b;
import defpackage.jk6;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.ocu;
import defpackage.r7o;
import defpackage.rar;
import defpackage.t7o;
import defpackage.x97;
import defpackage.xdr;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class d extends com.yandex.plus.home.feature.webviews.internal.bridge.b {
    public final /* synthetic */ g t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(g gVar) {
        super(r8, r9, r10, r11, r12, r13, r14, r8, r9, r10, r11, gVar.z, gVar.C, gVar.E, gVar.H, gVar.K, gVar.Z, new l(gVar.G), r1);
        this.t = gVar;
        kotlinx.coroutines.a aVar = gVar.i;
        kotlinx.coroutines.a aVar2 = gVar.k;
        kotlinx.coroutines.a aVar3 = gVar.j;
        com.yandex.passport.internal.core.accounts.h hVar = gVar.l;
        a1 a1Var = gVar.m;
        com.yandex.plus.bdui.plus.content.controller.f fVar = gVar.n;
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar4 = gVar.p;
        com.yandex.plus.home.analytics.diagnostic.webview.a aVar5 = gVar.q;
        com.yandex.plus.home.analytics.diagnostic.messaging.b bVar = gVar.r;
        com.yandex.plus.home.analytics.f fVar2 = gVar.s;
        Function0 function0 = gVar.t;
        jk6 jk6Var = new jk6(0, 14, g.class, gVar, "mainScope", "getMainScope()Lkotlinx/coroutines/CoroutineScope;");
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void B(String str) {
        str.getClass();
        ((a) this.t.e).g(str);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void a(y1 y1Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleCallbackEvent() outMessage=" + y1Var, null);
        com.yandex.plus.home.feature.webviews.internal.container.d dVar = this.t.o;
        String str = y1Var.b;
        dVar.getClass();
        str.getClass();
        dVar.a.a(new com.yandex.plus.home.api.state.b(str));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void b(e2 e2Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleCloseCurrentWebViewMessage() outMessage=" + e2Var, null);
        ((a) this.t.e).dismiss();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void d(l2 l2Var) {
        super.d(l2Var);
        ((a) this.t.e).c(l2Var.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void e(u2 u2Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleGetProductsRequest() outMessage=" + u2Var, null);
        this.t.h0().b("GetProductsRequest");
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void g(o3 o3Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleNeedAuthorizationMessage() outMessage=" + o3Var, null);
        this.t.i0(o3Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void h(x2 x2Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleNeedLogoutMessage() outMessage=" + x2Var, null);
        this.t.F0.f(x2Var, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, d.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 12));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void i(r3 r3Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleOpenNativeSharingMessage() outMessage=" + r3Var, null);
        ((t) this.t.H).t(r3Var.b, r3Var.c, r3Var.d);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void j(d4 d4Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleOpenStoriesListMessage() outMessage=" + d4Var, null);
        g gVar = this.t;
        u uVar = gVar.H;
        List<c4> list = d4Var.b;
        ArrayList arrayList = new ArrayList();
        for (c4 c4Var : list) {
            Object D = l.D(c4Var);
            r7o r7oVar = z7o.b;
            if (!(D instanceof t7o)) {
                D = new com.yandex.plus.home.feature.webviews.internal.stories.list.j((com.yandex.plus.home.feature.webviews.internal.uri.g) D, c4Var.b, c4Var.c);
            }
            Throwable a = z7o.a(D);
            if (a != null) {
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, com.yandex.plus.core.analytics.logging.b.c, "handleOpenStoriesListMessage() outMessage=" + d4Var, a);
                gVar.r.c(c4Var.a);
                D = null;
            }
            com.yandex.plus.home.feature.webviews.internal.stories.list.j jVar = (com.yandex.plus.home.feature.webviews.internal.stories.list.j) D;
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        u.a(uVar, arrayList);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void k(x3 x3Var) {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.c;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "handleOpenStoriesMessage() outMessage=" + x3Var, null);
        Object C = l.C(x3Var);
        r7o r7oVar = z7o.b;
        boolean z = C instanceof t7o;
        g gVar = this.t;
        if (!z) {
            u.b(gVar.H, (com.yandex.plus.home.feature.webviews.internal.uri.g) C, true, x3Var.d, 56);
        }
        Throwable a = z7o.a(C);
        if (a != null) {
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, "handleOpenStoriesMessage() outMessage=" + x3Var, a);
            gVar.r.c(x3Var.b);
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void m(r4 r4Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handlePurchaseButtonShown() outMessage=" + r4Var, null);
        this.t.h0().i(r4Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void n(u4 u4Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handlePurchaseProductRequest() outMessage=" + u4Var, null);
        this.t.h0().b("PurchaseProductRequest");
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void o(a5 a5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleReadyForMessagingMessage() outMessage=" + a5Var, null);
        this.t.C0.i();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void p(x4 x4Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleReadyMessage() outMessage=" + x4Var, null);
        g gVar = this.t;
        rar rarVar = gVar.A0;
        if (rarVar != null) {
            rarVar.g(null);
        }
        gVar.A0 = null;
        ((a) gVar.e).s();
        ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.a) gVar.I0.getValue()).getClass();
        gVar.B0 = true;
        gVar.C0.l();
        xdr xdrVar = gVar.h0().g;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void q(d5 d5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleSendBroadcastEvent() outMessage=" + d5Var, null);
        x97.y((mm6) this.s.get(), null, null, new com.yandex.plus.bdui.ui.b(this.t, d5Var, null, 20), 3);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void t(p5 p5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleShowPurchaseButton() outMessage=" + p5Var, null);
        String str = p5Var.a;
        g gVar = this.t;
        gVar.h.e = str;
        xdr xdrVar = gVar.h0().h;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void u(s5 s5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleShowServiceInfo() outMessage=" + s5Var, null);
        ((a) this.t.e).h(s5Var.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void v(b6 b6Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        Continuation continuation = null;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleTreasuryStateRequest() outMessage=" + b6Var, null);
        com.yandex.plus.home.feature.webviews.internal.treasury.e eVar = (com.yandex.plus.home.feature.webviews.internal.treasury.e) this.t.G0.getValue();
        if (eVar != null) {
            x97.y((mm6) this.s.get(), null, null, new ocu(eVar, b6Var, this, continuation, 29), 3);
        } else {
            z(b6Var, "TREASURY_ABSENT");
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void w(k6 k6Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleUserBoughtSubscriptionMessage() outMessage=" + k6Var, null);
        this.t.A.R(com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.a, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f.c, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d.c, k6Var.b, c5b.a);
        super.w(k6Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void x(q6 q6Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleUserTappedSubscription() outMessage=" + q6Var, null);
        g gVar = this.t;
        gVar.h0().g();
        gVar.o.a.a(com.yandex.plus.home.api.state.a.c);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void y(j3 j3Var) {
        ((a) this.t.e).f(com.yandex.plus.bdui.flex.ui.a.O(j3Var.b));
    }
}
