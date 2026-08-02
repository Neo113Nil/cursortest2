package com.yandex.plus.home.feature.webviews.internal.smart;

import com.yandex.passport.data.network.l;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.datasource.openapi.models.u6;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.c4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.e2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.j3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.s5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.y1;
import defpackage.jk6;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.r7o;
import defpackage.rar;
import defpackage.t7o;
import defpackage.x97;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class c extends com.yandex.plus.home.feature.webviews.internal.bridge.b {
    public final /* synthetic */ e t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(e eVar) {
        super(r8, r9, r10, r11, r12, r13, r14, eVar.v, eVar.u, eVar.w, null, eVar.z, eVar.A, null, eVar.r, eVar.s, eVar.C, new l(eVar.q), r1);
        this.t = eVar;
        kotlinx.coroutines.a aVar = eVar.i;
        kotlinx.coroutines.a aVar2 = eVar.k;
        kotlinx.coroutines.a aVar3 = eVar.j;
        com.yandex.passport.internal.core.accounts.h hVar = eVar.l;
        a1 a1Var = eVar.m;
        com.yandex.plus.bdui.plus.content.controller.f fVar = eVar.n;
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar4 = eVar.p;
        jk6 jk6Var = new jk6(0, 15, e.class, eVar, "mainScope", "getMainScope()Lkotlinx/coroutines/CoroutineScope;");
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void B(String str) {
        str.getClass();
        ((j) this.t.e).g(str);
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
        ((j) this.t.e).dismiss();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void d(l2 l2Var) {
        super.d(l2Var);
        ((j) this.t.e).c(l2Var.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void g(o3 o3Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleNeedAuthorizationMessage() outMessage=" + o3Var, null);
        this.t.K.d(o3Var, new u6(15), new com.yandex.plus.bdui.plus.webview.navigation.a(26));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void h(x2 x2Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleNeedLogoutMessage() outMessage=" + x2Var, null);
        this.t.K.f(x2Var, new com.yandex.plus.home.feature.webviews.internal.simple.d(1, this, c.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 3));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void i(r3 r3Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleOpenNativeSharingMessage() outMessage=" + r3Var, null);
        ((t) this.t.r).t(r3Var.b, r3Var.c, r3Var.d);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void j(d4 d4Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleOpenStoriesListMessage() outMessage=" + d4Var, null);
        e eVar = this.t;
        u uVar = eVar.r;
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
                eVar.u.c(c4Var.a);
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
        e eVar = this.t;
        if (!z) {
            u.b(eVar.r, (com.yandex.plus.home.feature.webviews.internal.uri.g) C, true, x3Var.d, 56);
        }
        Throwable a = z7o.a(C);
        if (a != null) {
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, "handleOpenStoriesMessage() outMessage=" + x3Var, a);
            eVar.u.c(x3Var.b);
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void o(a5 a5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleReadyForMessagingMessage() outMessage=" + a5Var, null);
        this.t.I.i();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void p(x4 x4Var) {
        e eVar = this.t;
        eVar.h.q(eVar.K.g);
        ((j) eVar.e).q();
        eVar.z.a(eVar.A);
        rar rarVar = eVar.H;
        if (rarVar != null) {
            rarVar.g(null);
        }
        eVar.H = null;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleReadyMessage() outMessage=" + x4Var, null);
        eVar.I.l();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void q(d5 d5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleSendBroadcastEvent() outMessage=" + d5Var, null);
        x97.y((mm6) this.s.get(), null, null, new com.yandex.plus.bdui.ui.b(this.t, d5Var, null, 24), 3);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void u(s5 s5Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleShowServiceInfo() outMessage=" + s5Var, null);
        ((j) this.t.e).h(s5Var.b);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void v(b6 b6Var) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        Continuation continuation = null;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.c, "handleTreasuryStateRequest() outMessage=" + b6Var, null);
        com.yandex.plus.home.feature.webviews.internal.treasury.e eVar = (com.yandex.plus.home.feature.webviews.internal.treasury.e) this.t.J.getValue();
        if (eVar != null) {
            x97.y((mm6) this.s.get(), null, null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b(eVar, b6Var, this, continuation, 1), 3);
        } else {
            z(b6Var, "TREASURY_ABSENT");
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.b
    public final void y(j3 j3Var) {
        ((j) this.t.e).f(com.yandex.plus.bdui.flex.ui.a.O(j3Var.b));
    }
}
