package com.yandex.plus.home.feature.webviews.internal.stories;

import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.e2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.h2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.j3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.j5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.k4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.k6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.m5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.p5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.q6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.s5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.y1;
import com.yandex.plus.home.internal.di.y;
import defpackage.c5b;
import defpackage.jk6;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.rar;
import defpackage.x97;
import defpackage.xdr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class f extends com.yandex.plus.home.feature.webviews.internal.bridge.b {
    public final /* synthetic */ k t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(k kVar) {
        super(r8, r9, r10, r11, r12, r13, r14, r8, r9, r10, r11, kVar.G0, kVar.y, r14, kVar.L, r2, r3, r4, r1);
        this.t = kVar;
        kotlinx.coroutines.a aVar = kVar.i;
        kotlinx.coroutines.a aVar2 = kVar.k;
        kotlinx.coroutines.a aVar3 = kVar.j;
        com.yandex.passport.internal.core.accounts.h hVar = kVar.l;
        a1 a1Var = kVar.m;
        com.yandex.plus.bdui.plus.content.controller.f fVar = kVar.n;
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar4 = kVar.o;
        com.yandex.plus.home.analytics.diagnostic.webview.a aVar5 = kVar.p;
        com.yandex.plus.home.analytics.diagnostic.messaging.b bVar = kVar.q;
        com.yandex.plus.home.analytics.f fVar2 = kVar.r;
        Function0 function0 = kVar.s;
        jk6 jk6Var = new jk6(0, 16, k.class, kVar, "mainScope", "getMainScope()Lkotlinx/coroutines/CoroutineScope;");
        com.yandex.passport.internal.ui.bouncer.model.middleware.o oVar = kVar.B;
        y yVar = kVar.G;
        a1 a1Var2 = kVar.J;
        com.yandex.passport.data.network.l lVar = new com.yandex.passport.data.network.l(kVar.K);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void B(String str) {
        str.getClass();
        ((c) this.t.e).g(str);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void a(y1 y1Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleCallbackEvent() outMessage=" + y1Var, null);
        com.yandex.plus.home.feature.webviews.internal.container.d dVar = this.t.w;
        String str = y1Var.b;
        dVar.getClass();
        str.getClass();
        dVar.a.a(new com.yandex.plus.home.api.state.b(str));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void b(e2 e2Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleCloseCurrentWebViewMessage() outMessage=" + e2Var, null);
        ((c) this.t.e).n(true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void c(h2 h2Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleCloseStoriesMessage() outMessage=" + h2Var, null);
        ((c) this.t.e).n(true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void d(l2 l2Var) {
        super.d(l2Var);
        ((c) this.t.e).c(l2Var.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void e(u2 u2Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleGetProductsRequest() outMessage=" + u2Var, null);
        this.t.h0().b("GetProductsRequest");
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void f(a3 a3Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleMiniStoryIsReadyEvent() outMessage=" + a3Var, null);
        xdr xdrVar = this.t.y0;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void g(o3 o3Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleNeedAuthorizationMessage() outMessage=" + o3Var, null);
        this.t.j0(o3Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void h(x2 x2Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleNeedLogoutMessage() outMessage=" + x2Var, null);
        this.t.B0.f(x2Var, new com.yandex.plus.home.feature.webviews.internal.simple.d(1, this, f.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 12));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void l(l4 l4Var) {
        super.l(l4Var);
        if (l4Var.c == k4.b) {
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "onDismiss()", null);
            ((c) this.t.e).n(true);
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
        this.t.w0.i();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void p(x4 x4Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleReadyMessage() outMessage=" + x4Var, null);
        k kVar = this.t;
        kVar.k0();
        rar rarVar = kVar.v0;
        if (rarVar != null) {
            rarVar.g(null);
        }
        kVar.v0 = null;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void q(d5 d5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleSendBroadcastEvent() outMessage=" + d5Var, null);
        x97.y((mm6) this.s.get(), null, null, new com.yandex.plus.bdui.ui.b(this.t, d5Var, null, 26), 3);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void r(j5 j5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleShowNextStoryEvent() outMessage=" + j5Var, null);
        ((c) this.t.e).v(b.a);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void s(m5 m5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleShowPrevStoryEvent() outMessage=" + m5Var, null);
        ((c) this.t.e).v(b.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void t(p5 p5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleShowPurchaseButton() outMessage=" + p5Var, null);
        String str = p5Var.a;
        k kVar = this.t;
        kVar.h.c.e = str;
        xdr xdrVar = kVar.h0().h;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void u(s5 s5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleShowServiceInfo() outMessage=" + s5Var, null);
        ((c) this.t.e).h(s5Var.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void w(k6 k6Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleUserBoughtSubscriptionMessage() outMessage=" + k6Var, null);
        this.t.x.R(com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.b, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f.c, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d.c, k6Var.b, c5b.a);
        super.w(k6Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void x(q6 q6Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleUserTappedSubscription() outMessage=" + q6Var, null);
        k kVar = this.t;
        kVar.h0().g();
        kVar.w.a.a(com.yandex.plus.home.api.state.a.c);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void y(j3 j3Var) {
        ((c) this.t.e).f(com.yandex.plus.bdui.flex.ui.a.O(j3Var.b));
    }
}
