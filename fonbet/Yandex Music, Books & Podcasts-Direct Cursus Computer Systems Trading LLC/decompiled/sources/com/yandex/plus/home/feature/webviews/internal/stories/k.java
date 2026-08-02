package com.yandex.plus.home.feature.webviews.internal.stories;

import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.datasource.openapi.models.u6;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.internal.di.y;
import defpackage.bsh;
import defpackage.btf;
import defpackage.ci0;
import defpackage.evj;
import defpackage.ezc;
import defpackage.jyr;
import defpackage.rar;
import defpackage.rjf;
import defpackage.xdr;
import defpackage.ydr;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class k extends bsh implements com.yandex.plus.home.feature.webviews.internal.bridge.c, com.yandex.plus.webview.core.i, com.yandex.plus.home.feature.webviews.internal.purchase.pay.b {
    public final com.yandex.plus.home.analytics.payment.c A;
    public final jyr A0;
    public final com.yandex.passport.internal.ui.bouncer.model.middleware.o B;
    public final com.yandex.plus.home.feature.webviews.internal.home.f B0;
    public final ezc C;
    public final jyr C0;
    public final ezc D;
    public final jyr D0;
    public final boolean E;
    public boolean E0;
    public final String F;
    public boolean F0;
    public final y G;
    public final j G0;
    public final com.yandex.plus.home.api.prefetch.l H;
    public final rjf I;
    public final a1 J;
    public final s K;
    public final u L;
    public final com.yandex.plus.core.network.api.interceptors.e X;
    public final ci0 Y;
    public final com.yandex.plus.core.network.ssl.a Z;
    public final com.yandex.plus.home.feature.webviews.internal.uri.g g;
    public final q h;
    public final kotlinx.coroutines.a i;
    public final kotlinx.coroutines.a j;
    public final kotlinx.coroutines.a k;
    public final com.yandex.passport.internal.core.accounts.h l;
    public final a1 m;
    public final com.yandex.plus.bdui.plus.content.controller.f n;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a o;
    public final com.yandex.plus.home.analytics.diagnostic.webview.a p;
    public final com.yandex.plus.home.analytics.diagnostic.messaging.b q;
    public final com.yandex.plus.home.analytics.f r;
    public final Function0 s;
    public final com.yandex.plus.bdui.plus.content.controller.f t;
    public final com.yandex.plus.bdui.plus.content.controller.f u;
    public final com.yandex.plus.bdui.plus.content.controller.f v;
    public rar v0;
    public final com.yandex.plus.home.feature.webviews.internal.container.d w;
    public final evj w0;
    public final com.yandex.plus.home.analytics.payment.e x;
    public final jyr x0;
    public final String y;
    public final xdr y0;
    public final Map z;
    public rar z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(com.yandex.plus.home.feature.webviews.internal.uri.g gVar, q qVar, kotlinx.coroutines.a aVar, kotlinx.coroutines.a aVar2, kotlinx.coroutines.a aVar3, com.yandex.passport.internal.core.accounts.h hVar, a1 a1Var, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar4, com.yandex.plus.home.analytics.diagnostic.webview.a aVar5, com.yandex.plus.home.analytics.diagnostic.messaging.b bVar, com.yandex.plus.home.analytics.diagnostic.messaging.a aVar6, com.yandex.plus.home.analytics.f fVar2, Function0 function0, com.yandex.plus.home.auth.f fVar3, com.yandex.plus.bdui.plus.content.controller.f fVar4, com.yandex.plus.bdui.plus.content.controller.f fVar5, com.yandex.plus.bdui.plus.content.controller.f fVar6, com.yandex.plus.home.feature.webviews.internal.container.d dVar, com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar7, com.yandex.plus.home.analytics.payment.e eVar, String str, Map map, com.yandex.plus.home.analytics.payment.c cVar, com.yandex.passport.internal.ui.bouncer.model.middleware.o oVar, Function0 function02, Function0 function03, boolean z, boolean z2, String str2, y yVar, com.yandex.plus.home.api.prefetch.l lVar, rjf rjfVar, a1 a1Var2, s sVar, u uVar, com.yandex.plus.core.network.api.interceptors.e eVar2, ci0 ci0Var, com.yandex.plus.core.network.ssl.a aVar8) {
        super(new e(), aVar);
        gVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        hVar.getClass();
        a1Var.getClass();
        aVar4.getClass();
        aVar5.getClass();
        bVar.getClass();
        aVar6.getClass();
        fVar2.getClass();
        function0.getClass();
        fVar3.getClass();
        aVar7.getClass();
        eVar.getClass();
        str.getClass();
        cVar.getClass();
        yVar.getClass();
        lVar.getClass();
        uVar.getClass();
        eVar2.getClass();
        ci0Var.getClass();
        this.g = gVar;
        this.h = qVar;
        this.i = aVar;
        this.j = aVar2;
        this.k = aVar3;
        this.l = hVar;
        this.m = a1Var;
        this.n = fVar;
        this.o = aVar4;
        this.p = aVar5;
        this.q = bVar;
        this.r = fVar2;
        this.s = function0;
        this.t = fVar4;
        this.u = fVar5;
        this.v = fVar6;
        this.w = dVar;
        this.x = eVar;
        this.y = str;
        this.z = map;
        this.A = cVar;
        this.B = oVar;
        this.C = (ezc) function02;
        this.D = (ezc) function03;
        this.E = z;
        this.F = str2;
        this.G = yVar;
        this.H = lVar;
        this.I = rjfVar;
        this.J = a1Var2;
        this.K = sVar;
        this.L = uVar;
        this.X = eVar2;
        this.Y = ci0Var;
        this.Z = aVar8;
        this.w0 = new evj();
        this.x0 = btf.b(new d(this, 0));
        this.y0 = ydr.a(Boolean.FALSE);
        this.A0 = btf.b(new d(this, 1));
        this.B0 = new com.yandex.plus.home.feature.webviews.internal.home.f(this, gVar.a.toString(), fVar3, aVar6, uVar, sVar, z2, aVar);
        this.C0 = btf.b(new d(this, 2));
        this.D0 = btf.b(new d(this, 3));
        this.G0 = new j(this, aVar7);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, com.yandex.plus.core.analytics.logging.b.b, "init() bundle=" + qVar, null);
    }

    @Override // defpackage.bsh
    public final void L() {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onResume()", null);
        this.w0.j();
        com.yandex.plus.home.feature.webviews.internal.home.f fVar = this.B0;
        fVar.getClass();
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "onResume()", null);
        fVar.a(new u6(14));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.purchase.pay.b
    public final void a() {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g h0 = h0();
        rar rarVar = h0.i;
        if (rarVar != null) {
            rarVar.g(null);
        }
        h0.i = null;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.purchase.pay.b
    public final void b() {
        h0().f();
    }

    @Override // com.yandex.plus.webview.core.i
    public final void d(int i, String str, String str2, String str3, boolean z) {
        if (z) {
            i0("ssl error", str);
        }
        this.p.e(i, str, str2, str3, z);
    }

    @Override // defpackage.bsh
    public final void h() {
        super.h();
        rar rarVar = this.v0;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.v0 = null;
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "detachView()", null);
        com.yandex.plus.bdui.plus.analytics.b.d(h0().f);
        evj evjVar = this.w0;
        evjVar.a = false;
        evjVar.c();
        com.yandex.plus.bdui.plus.analytics.b.d(this.B0.h);
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "detachView()", null);
    }

    public final com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g h0() {
        return (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g) this.C0.getValue();
    }

    public final void i0(String str, String str2) {
        if (!this.E) {
            rar rarVar = this.v0;
            if (rarVar != null) {
                rarVar.g(null);
            }
            this.v0 = null;
        }
        this.t.p();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, str, null);
        ((c) this.e).c(str);
        if (str2 == null) {
            str2 = this.B0.g;
        }
        this.G0.d(this.y, str2);
    }

    public final void j0(o3 o3Var) {
        o3Var.getClass();
        int i = 0;
        this.B0.d(o3Var, new i(0, h0(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g.class, "onWebAuthorizationShow", "onWebAuthorizationShow()V", 0, i), new com.yandex.plus.home.feature.webviews.internal.simple.d(1, h0(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g.class, "onAuthorizationResult", "onAuthorizationResult(Lcom/yandex/plus/home/feature/webviews/internalapi/authorization/AuthorizationResult;)V", i, 14));
    }

    @Override // com.yandex.plus.webview.core.i
    public final void k(int i, String str, String str2, String str3, boolean z) {
        if (z) {
            i0(String.format("connection error, error code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
        this.p.c(i, str, str2, str3, z);
    }

    public final void k0() {
        this.t.q(this.B0.g);
        ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.a) this.D0.getValue()).getClass();
        this.E0 = true;
        this.w0.l();
        ((c) this.e).q();
        xdr xdrVar = h0().g;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        this.G0.a(this.y);
    }

    public final void l0(v1 v1Var) {
        if (this.E) {
            ((c) this.e).d(v1Var);
        } else {
            ((f) this.x0.getValue()).A(v1Var);
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.c
    public final void onMessage(String str) {
        str.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        String concat = "onMessage() jsonMessage=".concat(str);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, concat, null);
        ((f) this.x0.getValue()).onMessage(str);
    }

    @Override // com.yandex.plus.webview.core.i
    public final void u(int i, String str, String str2, String str3, boolean z) {
        str3.getClass();
        if (z) {
            i0(String.format("http error, status code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
        this.p.b(i, str, str2, str3, z);
    }

    @Override // defpackage.bsh
    public final void w() {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onPause()", null);
        this.w0.g();
        this.B0.getClass();
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "onPause()", null);
    }
}
