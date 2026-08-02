package com.yandex.plus.home.feature.webviews.internal.bridge;

import android.net.Uri;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.passport.internal.ui.social.i;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.api.prefetch.j;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.e2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.h2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.j3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.j5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.k6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.m5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.p5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.q6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.s5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.y1;
import com.yandex.plus.home.internal.di.y;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.t7o;
import defpackage.wxm;
import defpackage.x97;
import defpackage.z7o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class b implements c {
    public final kotlinx.coroutines.a a;
    public final kotlinx.coroutines.a b;
    public final kotlinx.coroutines.a c;
    public final h d;
    public final a1 e;
    public final com.yandex.plus.bdui.plus.content.controller.f f;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a g;
    public final com.yandex.plus.home.analytics.diagnostic.webview.a h;
    public final com.yandex.plus.home.analytics.diagnostic.messaging.b i;
    public final com.yandex.plus.home.analytics.f j;
    public final Function0 k;
    public final com.yandex.plus.home.feature.webviews.internalapi.analytics.a l;
    public final String m;
    public final o n;
    public final u o;
    public final y p;
    public final a1 q;
    public final l r;
    public final wxm s;

    public b(kotlinx.coroutines.a aVar, kotlinx.coroutines.a aVar2, kotlinx.coroutines.a aVar3, h hVar, a1 a1Var, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar4, com.yandex.plus.home.analytics.diagnostic.webview.a aVar5, com.yandex.plus.home.analytics.diagnostic.messaging.b bVar, com.yandex.plus.home.analytics.f fVar2, Function0 function0, com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar6, String str, o oVar, u uVar, y yVar, a1 a1Var2, l lVar, wxm wxmVar) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        hVar.getClass();
        a1Var.getClass();
        fVar.getClass();
        aVar4.getClass();
        aVar5.getClass();
        bVar.getClass();
        fVar2.getClass();
        aVar6.getClass();
        str.getClass();
        uVar.getClass();
        yVar.getClass();
        a1Var2.getClass();
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = hVar;
        this.e = a1Var;
        this.f = fVar;
        this.g = aVar4;
        this.h = aVar5;
        this.i = bVar;
        this.j = fVar2;
        this.k = function0;
        this.l = aVar6;
        this.m = str;
        this.n = oVar;
        this.o = uVar;
        this.p = yVar;
        this.q = a1Var2;
        this.r = lVar;
        this.s = wxmVar;
    }

    public final void A(v1 v1Var) {
        v1Var.getClass();
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "sendMessage() inMessage=" + v1Var, null);
        x97.y((mm6) this.s.get(), this.a, null, new j(this, v1Var, (Continuation) null, 11), 2);
    }

    public abstract void B(String str);

    public abstract void a(y1 y1Var);

    public abstract void b(e2 e2Var);

    public void c(h2 h2Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleCloseStoriesMessage() outMessage=" + h2Var, null);
        z(h2Var, "NOT_IMPLEMENTED");
    }

    public void d(l2 l2Var) {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.c;
        StringBuilder sb = new StringBuilder("handleCriticalErrorMessage() Close with critical error: ");
        String str = l2Var.b;
        sb.append(str);
        String sb2 = sb.toString();
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, sb2, null);
        this.i.a(str);
    }

    public void e(u2 u2Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleGetProductsRequest() outMessage=" + u2Var, null);
        z(u2Var, "NOT_IMPLEMENTED");
    }

    public void f(a3 a3Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleMiniStoryIsReadyEvent() outMessage=" + a3Var, null);
        z(a3Var, "NOT_IMPLEMENTED");
    }

    public abstract void g(o3 o3Var);

    public abstract void h(x2 x2Var);

    public void i(r3 r3Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleOpenNativeSharingMessage() outMessage=" + r3Var, null);
        z(r3Var, "NOT_IMPLEMENTED");
    }

    public void j(d4 d4Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleOpenStoriesListMessage() outMessage=" + d4Var, null);
        z(d4Var, "NOT_IMPLEMENTED");
    }

    public void k(x3 x3Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleOpenStoriesMessage() outMessage=" + x3Var, null);
        z(x3Var, "NOT_IMPLEMENTED");
    }

    public void l(l4 l4Var) {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.c;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "handleOpenUrlMessage() openUrlMessage=" + l4Var, null);
        Uri uri = l4Var.b;
        u uVar = this.o;
        ((t) uVar).w(uri);
        Object E = this.r.E(l4Var);
        if (!(E instanceof t7o)) {
            u.b(uVar, (com.yandex.plus.home.feature.webviews.internal.uri.j) E, true, null, 60);
        }
        Throwable a = z7o.a(E);
        if (a != null) {
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, "handleOpenUrlMessage() outMessage=" + l4Var, a);
            String uri2 = uri.toString();
            uri2.getClass();
            this.i.c(uri2);
        }
    }

    public void m(r4 r4Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handlePurchaseButtonShown() outMessage=" + r4Var, null);
        z(r4Var, "NOT_IMPLEMENTED");
    }

    public void n(u4 u4Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handlePurchaseProductRequest() outMessage=" + u4Var, null);
        z(u4Var, "NOT_IMPLEMENTED");
    }

    public abstract void o(a5 a5Var);

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.c
    public final void onMessage(String str) {
        str.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.c;
        String concat = "onMessage() jsonMessage=".concat(str);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, concat, null);
        x97.y((mm6) this.s.get(), this.a, null, new com.yandex.plus.bdui.ui.b(this, str, null, 18), 2);
    }

    public abstract void p(x4 x4Var);

    public abstract void q(d5 d5Var);

    public void r(j5 j5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleShowNextStoryEvent() outMessage=" + j5Var, null);
        z(j5Var, "NOT_IMPLEMENTED");
    }

    public void s(m5 m5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleShowPrevStoryEvent() outMessage=" + m5Var, null);
        z(m5Var, "NOT_IMPLEMENTED");
    }

    public void t(p5 p5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleShowPurchaseButton() outMessage=" + p5Var, null);
        z(p5Var, "NOT_IMPLEMENTED");
    }

    public abstract void u(s5 s5Var);

    public void v(b6 b6Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleTreasuryStateRequest() outMessage=" + b6Var, null);
        z(b6Var, "NOT_IMPLEMENTED");
    }

    public void w(k6 k6Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        Continuation continuation = null;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleUserBoughtSubscriptionMessage() outMessage=" + k6Var, null);
        o oVar = this.n;
        if (oVar != null) {
            oVar.a.a(com.yandex.plus.home.api.purchase.b.a);
        }
        x97.y((mm6) this.s.get(), null, null, new i(this, continuation, 14), 3);
    }

    public void x(q6 q6Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleUserTappedSubscription() outMessage=" + q6Var, null);
        z(q6Var, "NOT_IMPLEMENTED");
    }

    public abstract void y(j3 j3Var);

    public final void z(r6 r6Var, String str) {
        r6Var.getClass();
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, com.yandex.plus.core.analytics.logging.b.c, "onMessageUnhandled() outMessage=" + r6Var + ", cause=" + str, null);
        this.i.b(r6Var.toString(), str);
    }
}
