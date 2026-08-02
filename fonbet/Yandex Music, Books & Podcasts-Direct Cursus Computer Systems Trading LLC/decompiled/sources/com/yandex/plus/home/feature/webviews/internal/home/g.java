package com.yandex.plus.home.feature.webviews.internal.home;

import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.api.prefetch.l;
import com.yandex.plus.home.datasource.openapi.models.u6;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.adapter.api.g0;
import com.yandex.plus.pay.adapter.api.h0;
import defpackage.bsh;
import defpackage.btf;
import defpackage.ci0;
import defpackage.e5b;
import defpackage.evj;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.qs;
import defpackage.rar;
import defpackage.rjf;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class g extends bsh implements com.yandex.plus.home.feature.webviews.internal.bridge.c, com.yandex.plus.webview.core.i, com.yandex.plus.home.feature.webviews.internal.purchase.pay.b {
    public final com.yandex.plus.home.analytics.payment.e A;
    public rar A0;
    public final com.yandex.plus.home.analytics.payment.c B;
    public boolean B0;
    public final String C;
    public final evj C0;
    public final Map D;
    public final jyr D0;
    public final o E;
    public final jyr E0;
    public final com.yandex.plus.bdui.plus.content.controller.f F;
    public final f F0;
    public final s G;
    public final jyr G0;
    public final u H;
    public final jyr H0;
    public final boolean I;
    public final jyr I0;
    public final String J;
    public final y K;
    public final l L;
    public final rjf X;
    public final com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b Y;
    public final a1 Z;
    public final com.yandex.plus.home.feature.webviews.internal.uri.b g;
    public final com.yandex.plus.home.api.config.a h;
    public final kotlinx.coroutines.a i;
    public final kotlinx.coroutines.a j;
    public final kotlinx.coroutines.a k;
    public final com.yandex.passport.internal.core.accounts.h l;
    public final a1 m;
    public final com.yandex.plus.bdui.plus.content.controller.f n;
    public final com.yandex.plus.home.feature.webviews.internal.container.d o;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a p;
    public final com.yandex.plus.home.analytics.diagnostic.webview.a q;
    public final com.yandex.plus.home.analytics.diagnostic.messaging.b r;
    public final com.yandex.plus.home.analytics.f s;
    public final Function0 t;
    public final com.yandex.plus.home.auth.f u;
    public final com.yandex.plus.bdui.plus.content.controller.f v;
    public final com.yandex.plus.bdui.plus.content.controller.f v0;
    public final com.yandex.plus.bdui.plus.content.controller.f w;
    public final com.yandex.plus.core.network.api.interceptors.e w0;
    public final com.yandex.plus.bdui.plus.content.controller.f x;
    public final ci0 x0;
    public final com.yandex.plus.core.config.a y;
    public final com.yandex.plus.core.network.ssl.a y0;
    public final com.yandex.plus.home.feature.webviews.internalapi.analytics.a z;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.yandex.plus.home.feature.webviews.internal.uri.b bVar, com.yandex.plus.home.api.config.a aVar, kotlinx.coroutines.a aVar2, kotlinx.coroutines.a aVar3, kotlinx.coroutines.a aVar4, com.yandex.passport.internal.core.accounts.h hVar, a1 a1Var, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.home.feature.webviews.internal.container.d dVar, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar5, com.yandex.plus.home.analytics.diagnostic.webview.a aVar6, com.yandex.plus.home.analytics.diagnostic.messaging.b bVar2, com.yandex.plus.home.analytics.diagnostic.messaging.a aVar7, com.yandex.plus.home.analytics.f fVar2, Function0 function0, com.yandex.plus.home.auth.f fVar3, com.yandex.plus.bdui.plus.content.controller.f fVar4, com.yandex.plus.bdui.plus.content.controller.f fVar5, com.yandex.plus.bdui.plus.content.controller.f fVar6, com.yandex.plus.core.config.a aVar8, com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar9, com.yandex.plus.home.analytics.payment.e eVar, com.yandex.plus.home.analytics.payment.c cVar, String str, Map map, o oVar, com.yandex.plus.bdui.plus.content.controller.f fVar7, s sVar, t tVar, boolean z, boolean z2, String str2, y yVar, l lVar, rjf rjfVar, com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b bVar3, a1 a1Var2, com.yandex.plus.bdui.plus.content.controller.f fVar8, com.yandex.plus.core.network.api.interceptors.e eVar2, ci0 ci0Var, com.yandex.plus.core.network.ssl.a aVar10) {
        super(new c(), aVar2);
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        hVar.getClass();
        a1Var.getClass();
        aVar5.getClass();
        aVar6.getClass();
        bVar2.getClass();
        aVar7.getClass();
        fVar2.getClass();
        function0.getClass();
        fVar3.getClass();
        aVar8.getClass();
        aVar9.getClass();
        eVar.getClass();
        cVar.getClass();
        tVar.getClass();
        yVar.getClass();
        lVar.getClass();
        eVar2.getClass();
        ci0Var.getClass();
        this.g = bVar;
        this.h = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = aVar4;
        this.l = hVar;
        this.m = a1Var;
        this.n = fVar;
        this.o = dVar;
        this.p = aVar5;
        this.q = aVar6;
        this.r = bVar2;
        this.s = fVar2;
        this.t = function0;
        this.u = fVar3;
        this.v = fVar4;
        this.w = fVar5;
        this.x = fVar6;
        this.y = aVar8;
        this.z = aVar9;
        this.A = eVar;
        this.B = cVar;
        this.C = str;
        this.D = map;
        this.E = oVar;
        this.F = fVar7;
        this.G = sVar;
        this.H = tVar;
        this.I = z;
        this.J = str2;
        this.K = yVar;
        this.L = lVar;
        this.X = rjfVar;
        this.Y = bVar3;
        this.Z = a1Var2;
        this.v0 = fVar8;
        this.w0 = eVar2;
        this.x0 = ci0Var;
        this.y0 = aVar10;
        this.C0 = new evj();
        final int i = 0;
        this.D0 = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.home.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new d(this.b);
                    case 1:
                        g gVar = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.bridge.g(gVar.K, new qs(gVar, null, 25));
                    case 2:
                        return this.b.F.c();
                    case 3:
                        g gVar2 = this.b;
                        rjf rjfVar2 = gVar2.X;
                        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g gVar3 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.a;
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar11 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2, g.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 14);
                        mm6 l = gVar2.l();
                        String str3 = gVar2.C;
                        Map map2 = gVar2.D;
                        if (map2 == null) {
                            map2 = e5b.a;
                            map2.getClass();
                        }
                        Map map3 = map2;
                        com.yandex.plus.home.analytics.evgen.c cVar2 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "hideNativePayButton", "hideNativePayButton()V", 0, 15);
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar12 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2.e, a.class, "showNativePayError", "showNativePayError(Lcom/yandex/plus/home/pay/PayError;)V", 0, 15);
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar13 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2.e, a.class, "showNativePayButton", "showNativePayButton(Lcom/yandex/plus/home/feature/webviews/internal/purchase/pay/common/NativePayButtonConfig;)V", 0, 16);
                        com.yandex.plus.home.analytics.evgen.c cVar3 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "showHostBuyView", "showHostBuyView()V", 0, 16);
                        com.yandex.plus.home.analytics.evgen.c cVar4 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "cancelPayButtonLoading", "cancelPayButtonLoading()V", 0, 17);
                        rjfVar2.getClass();
                        str3.getClass();
                        h0 h0Var = new h0(str3, "plus_home");
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar4 = new com.yandex.plus.acquisition.sdk.common.api.di.b((g0) rjfVar2.e, h0Var, gVar3, (com.yandex.plus.home.analytics.payment.d) rjfVar2.g, (com.yandex.plus.home.analytics.payment.a) rjfVar2.k, (com.yandex.plus.home.analytics.payment.c) rjfVar2.j, aVar11, (com.yandex.plus.home.analytics.payment.e) rjfVar2.h, (com.yandex.plus.home.analytics.payment.b) rjfVar2.i);
                        kotlinx.coroutines.a aVar14 = (kotlinx.coroutines.a) rjfVar2.m;
                        p pVar = new p((com.yandex.plus.home.auth.f) rjfVar2.b, bVar4);
                        com.yandex.plus.bdui.plus.content.controller.f fVar9 = new com.yandex.plus.bdui.plus.content.controller.f((com.yandex.plus.bdui.plus.content.controller.f) rjfVar2.p, (com.yandex.plus.acquisition.adapter.internal.processor.b) rjfVar2.o);
                        com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c cVar5 = new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c(l, bVar4, new m((g0) rjfVar2.e, h0Var, map3, bVar4, (com.yandex.plus.home.plaque.plugin.internal.proxy.a) rjfVar2.c, (kotlinx.coroutines.a) rjfVar2.m, cVar2, aVar12, (o) rjfVar2.f, (y) rjfVar2.n), (com.yandex.plus.home.auth.f) rjfVar2.b, rjfVar2.a, aVar13, cVar4);
                        p pVar2 = new p(l, bVar4, cVar3);
                        com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = (com.yandex.plus.home.plaque.feature.internal.presentation.b) rjfVar2.d;
                        com.yandex.plus.bdui.plus.content.controller.f fVar10 = (com.yandex.plus.bdui.plus.content.controller.f) rjfVar2.l;
                        fVar10.getClass();
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f(aVar14, bVar4, pVar, fVar9, cVar5, pVar2, fVar10, bVar5);
                    default:
                        g gVar4 = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.pay.a(gVar4.h, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar4, g.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 17), new com.yandex.plus.home.analytics.evgen.c(0, gVar4.F0, com.yandex.plus.home.feature.webviews.internal.d.class, "reload", "reload()V", 0, 18), new com.yandex.plus.home.analytics.evgen.c(0, gVar4.e, a.class, "hideHostBuyView", "hideHostBuyView()V", 0, 19), gVar4.C, new com.yandex.plus.home.analytics.evgen.c(0, gVar4.h0(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f.class, "onPayButtonClicked", "onPayButtonClicked()V", 0, 20), gVar4.A, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.a, gVar4.B, gVar4.g.b);
                }
            }
        });
        final int i2 = 1;
        this.E0 = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.home.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new d(this.b);
                    case 1:
                        g gVar = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.bridge.g(gVar.K, new qs(gVar, null, 25));
                    case 2:
                        return this.b.F.c();
                    case 3:
                        g gVar2 = this.b;
                        rjf rjfVar2 = gVar2.X;
                        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g gVar3 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.a;
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar11 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2, g.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 14);
                        mm6 l = gVar2.l();
                        String str3 = gVar2.C;
                        Map map2 = gVar2.D;
                        if (map2 == null) {
                            map2 = e5b.a;
                            map2.getClass();
                        }
                        Map map3 = map2;
                        com.yandex.plus.home.analytics.evgen.c cVar2 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "hideNativePayButton", "hideNativePayButton()V", 0, 15);
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar12 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2.e, a.class, "showNativePayError", "showNativePayError(Lcom/yandex/plus/home/pay/PayError;)V", 0, 15);
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar13 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2.e, a.class, "showNativePayButton", "showNativePayButton(Lcom/yandex/plus/home/feature/webviews/internal/purchase/pay/common/NativePayButtonConfig;)V", 0, 16);
                        com.yandex.plus.home.analytics.evgen.c cVar3 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "showHostBuyView", "showHostBuyView()V", 0, 16);
                        com.yandex.plus.home.analytics.evgen.c cVar4 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "cancelPayButtonLoading", "cancelPayButtonLoading()V", 0, 17);
                        rjfVar2.getClass();
                        str3.getClass();
                        h0 h0Var = new h0(str3, "plus_home");
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar4 = new com.yandex.plus.acquisition.sdk.common.api.di.b((g0) rjfVar2.e, h0Var, gVar3, (com.yandex.plus.home.analytics.payment.d) rjfVar2.g, (com.yandex.plus.home.analytics.payment.a) rjfVar2.k, (com.yandex.plus.home.analytics.payment.c) rjfVar2.j, aVar11, (com.yandex.plus.home.analytics.payment.e) rjfVar2.h, (com.yandex.plus.home.analytics.payment.b) rjfVar2.i);
                        kotlinx.coroutines.a aVar14 = (kotlinx.coroutines.a) rjfVar2.m;
                        p pVar = new p((com.yandex.plus.home.auth.f) rjfVar2.b, bVar4);
                        com.yandex.plus.bdui.plus.content.controller.f fVar9 = new com.yandex.plus.bdui.plus.content.controller.f((com.yandex.plus.bdui.plus.content.controller.f) rjfVar2.p, (com.yandex.plus.acquisition.adapter.internal.processor.b) rjfVar2.o);
                        com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c cVar5 = new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c(l, bVar4, new m((g0) rjfVar2.e, h0Var, map3, bVar4, (com.yandex.plus.home.plaque.plugin.internal.proxy.a) rjfVar2.c, (kotlinx.coroutines.a) rjfVar2.m, cVar2, aVar12, (o) rjfVar2.f, (y) rjfVar2.n), (com.yandex.plus.home.auth.f) rjfVar2.b, rjfVar2.a, aVar13, cVar4);
                        p pVar2 = new p(l, bVar4, cVar3);
                        com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = (com.yandex.plus.home.plaque.feature.internal.presentation.b) rjfVar2.d;
                        com.yandex.plus.bdui.plus.content.controller.f fVar10 = (com.yandex.plus.bdui.plus.content.controller.f) rjfVar2.l;
                        fVar10.getClass();
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f(aVar14, bVar4, pVar, fVar9, cVar5, pVar2, fVar10, bVar5);
                    default:
                        g gVar4 = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.pay.a(gVar4.h, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar4, g.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 17), new com.yandex.plus.home.analytics.evgen.c(0, gVar4.F0, com.yandex.plus.home.feature.webviews.internal.d.class, "reload", "reload()V", 0, 18), new com.yandex.plus.home.analytics.evgen.c(0, gVar4.e, a.class, "hideHostBuyView", "hideHostBuyView()V", 0, 19), gVar4.C, new com.yandex.plus.home.analytics.evgen.c(0, gVar4.h0(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f.class, "onPayButtonClicked", "onPayButtonClicked()V", 0, 20), gVar4.A, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.a, gVar4.B, gVar4.g.b);
                }
            }
        });
        String uri = bVar.a.toString();
        uri.getClass();
        this.F0 = new f(this, uri, fVar3, aVar7, sVar, tVar, z2, aVar2);
        final int i3 = 2;
        this.G0 = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.home.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new d(this.b);
                    case 1:
                        g gVar = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.bridge.g(gVar.K, new qs(gVar, null, 25));
                    case 2:
                        return this.b.F.c();
                    case 3:
                        g gVar2 = this.b;
                        rjf rjfVar2 = gVar2.X;
                        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g gVar3 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.a;
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar11 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2, g.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 14);
                        mm6 l = gVar2.l();
                        String str3 = gVar2.C;
                        Map map2 = gVar2.D;
                        if (map2 == null) {
                            map2 = e5b.a;
                            map2.getClass();
                        }
                        Map map3 = map2;
                        com.yandex.plus.home.analytics.evgen.c cVar2 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "hideNativePayButton", "hideNativePayButton()V", 0, 15);
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar12 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2.e, a.class, "showNativePayError", "showNativePayError(Lcom/yandex/plus/home/pay/PayError;)V", 0, 15);
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar13 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2.e, a.class, "showNativePayButton", "showNativePayButton(Lcom/yandex/plus/home/feature/webviews/internal/purchase/pay/common/NativePayButtonConfig;)V", 0, 16);
                        com.yandex.plus.home.analytics.evgen.c cVar3 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "showHostBuyView", "showHostBuyView()V", 0, 16);
                        com.yandex.plus.home.analytics.evgen.c cVar4 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "cancelPayButtonLoading", "cancelPayButtonLoading()V", 0, 17);
                        rjfVar2.getClass();
                        str3.getClass();
                        h0 h0Var = new h0(str3, "plus_home");
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar4 = new com.yandex.plus.acquisition.sdk.common.api.di.b((g0) rjfVar2.e, h0Var, gVar3, (com.yandex.plus.home.analytics.payment.d) rjfVar2.g, (com.yandex.plus.home.analytics.payment.a) rjfVar2.k, (com.yandex.plus.home.analytics.payment.c) rjfVar2.j, aVar11, (com.yandex.plus.home.analytics.payment.e) rjfVar2.h, (com.yandex.plus.home.analytics.payment.b) rjfVar2.i);
                        kotlinx.coroutines.a aVar14 = (kotlinx.coroutines.a) rjfVar2.m;
                        p pVar = new p((com.yandex.plus.home.auth.f) rjfVar2.b, bVar4);
                        com.yandex.plus.bdui.plus.content.controller.f fVar9 = new com.yandex.plus.bdui.plus.content.controller.f((com.yandex.plus.bdui.plus.content.controller.f) rjfVar2.p, (com.yandex.plus.acquisition.adapter.internal.processor.b) rjfVar2.o);
                        com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c cVar5 = new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c(l, bVar4, new m((g0) rjfVar2.e, h0Var, map3, bVar4, (com.yandex.plus.home.plaque.plugin.internal.proxy.a) rjfVar2.c, (kotlinx.coroutines.a) rjfVar2.m, cVar2, aVar12, (o) rjfVar2.f, (y) rjfVar2.n), (com.yandex.plus.home.auth.f) rjfVar2.b, rjfVar2.a, aVar13, cVar4);
                        p pVar2 = new p(l, bVar4, cVar3);
                        com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = (com.yandex.plus.home.plaque.feature.internal.presentation.b) rjfVar2.d;
                        com.yandex.plus.bdui.plus.content.controller.f fVar10 = (com.yandex.plus.bdui.plus.content.controller.f) rjfVar2.l;
                        fVar10.getClass();
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f(aVar14, bVar4, pVar, fVar9, cVar5, pVar2, fVar10, bVar5);
                    default:
                        g gVar4 = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.pay.a(gVar4.h, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar4, g.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 17), new com.yandex.plus.home.analytics.evgen.c(0, gVar4.F0, com.yandex.plus.home.feature.webviews.internal.d.class, "reload", "reload()V", 0, 18), new com.yandex.plus.home.analytics.evgen.c(0, gVar4.e, a.class, "hideHostBuyView", "hideHostBuyView()V", 0, 19), gVar4.C, new com.yandex.plus.home.analytics.evgen.c(0, gVar4.h0(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f.class, "onPayButtonClicked", "onPayButtonClicked()V", 0, 20), gVar4.A, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.a, gVar4.B, gVar4.g.b);
                }
            }
        });
        final int i4 = 3;
        this.H0 = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.home.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return new d(this.b);
                    case 1:
                        g gVar = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.bridge.g(gVar.K, new qs(gVar, null, 25));
                    case 2:
                        return this.b.F.c();
                    case 3:
                        g gVar2 = this.b;
                        rjf rjfVar2 = gVar2.X;
                        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g gVar3 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.a;
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar11 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2, g.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 14);
                        mm6 l = gVar2.l();
                        String str3 = gVar2.C;
                        Map map2 = gVar2.D;
                        if (map2 == null) {
                            map2 = e5b.a;
                            map2.getClass();
                        }
                        Map map3 = map2;
                        com.yandex.plus.home.analytics.evgen.c cVar2 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "hideNativePayButton", "hideNativePayButton()V", 0, 15);
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar12 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2.e, a.class, "showNativePayError", "showNativePayError(Lcom/yandex/plus/home/pay/PayError;)V", 0, 15);
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar13 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2.e, a.class, "showNativePayButton", "showNativePayButton(Lcom/yandex/plus/home/feature/webviews/internal/purchase/pay/common/NativePayButtonConfig;)V", 0, 16);
                        com.yandex.plus.home.analytics.evgen.c cVar3 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "showHostBuyView", "showHostBuyView()V", 0, 16);
                        com.yandex.plus.home.analytics.evgen.c cVar4 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "cancelPayButtonLoading", "cancelPayButtonLoading()V", 0, 17);
                        rjfVar2.getClass();
                        str3.getClass();
                        h0 h0Var = new h0(str3, "plus_home");
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar4 = new com.yandex.plus.acquisition.sdk.common.api.di.b((g0) rjfVar2.e, h0Var, gVar3, (com.yandex.plus.home.analytics.payment.d) rjfVar2.g, (com.yandex.plus.home.analytics.payment.a) rjfVar2.k, (com.yandex.plus.home.analytics.payment.c) rjfVar2.j, aVar11, (com.yandex.plus.home.analytics.payment.e) rjfVar2.h, (com.yandex.plus.home.analytics.payment.b) rjfVar2.i);
                        kotlinx.coroutines.a aVar14 = (kotlinx.coroutines.a) rjfVar2.m;
                        p pVar = new p((com.yandex.plus.home.auth.f) rjfVar2.b, bVar4);
                        com.yandex.plus.bdui.plus.content.controller.f fVar9 = new com.yandex.plus.bdui.plus.content.controller.f((com.yandex.plus.bdui.plus.content.controller.f) rjfVar2.p, (com.yandex.plus.acquisition.adapter.internal.processor.b) rjfVar2.o);
                        com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c cVar5 = new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c(l, bVar4, new m((g0) rjfVar2.e, h0Var, map3, bVar4, (com.yandex.plus.home.plaque.plugin.internal.proxy.a) rjfVar2.c, (kotlinx.coroutines.a) rjfVar2.m, cVar2, aVar12, (o) rjfVar2.f, (y) rjfVar2.n), (com.yandex.plus.home.auth.f) rjfVar2.b, rjfVar2.a, aVar13, cVar4);
                        p pVar2 = new p(l, bVar4, cVar3);
                        com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = (com.yandex.plus.home.plaque.feature.internal.presentation.b) rjfVar2.d;
                        com.yandex.plus.bdui.plus.content.controller.f fVar10 = (com.yandex.plus.bdui.plus.content.controller.f) rjfVar2.l;
                        fVar10.getClass();
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f(aVar14, bVar4, pVar, fVar9, cVar5, pVar2, fVar10, bVar5);
                    default:
                        g gVar4 = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.pay.a(gVar4.h, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar4, g.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 17), new com.yandex.plus.home.analytics.evgen.c(0, gVar4.F0, com.yandex.plus.home.feature.webviews.internal.d.class, "reload", "reload()V", 0, 18), new com.yandex.plus.home.analytics.evgen.c(0, gVar4.e, a.class, "hideHostBuyView", "hideHostBuyView()V", 0, 19), gVar4.C, new com.yandex.plus.home.analytics.evgen.c(0, gVar4.h0(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f.class, "onPayButtonClicked", "onPayButtonClicked()V", 0, 20), gVar4.A, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.a, gVar4.B, gVar4.g.b);
                }
            }
        });
        final int i5 = 4;
        this.I0 = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.home.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new d(this.b);
                    case 1:
                        g gVar = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.bridge.g(gVar.K, new qs(gVar, null, 25));
                    case 2:
                        return this.b.F.c();
                    case 3:
                        g gVar2 = this.b;
                        rjf rjfVar2 = gVar2.X;
                        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g gVar3 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.a;
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar11 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2, g.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 14);
                        mm6 l = gVar2.l();
                        String str3 = gVar2.C;
                        Map map2 = gVar2.D;
                        if (map2 == null) {
                            map2 = e5b.a;
                            map2.getClass();
                        }
                        Map map3 = map2;
                        com.yandex.plus.home.analytics.evgen.c cVar2 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "hideNativePayButton", "hideNativePayButton()V", 0, 15);
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar12 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2.e, a.class, "showNativePayError", "showNativePayError(Lcom/yandex/plus/home/pay/PayError;)V", 0, 15);
                        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar13 = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar2.e, a.class, "showNativePayButton", "showNativePayButton(Lcom/yandex/plus/home/feature/webviews/internal/purchase/pay/common/NativePayButtonConfig;)V", 0, 16);
                        com.yandex.plus.home.analytics.evgen.c cVar3 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "showHostBuyView", "showHostBuyView()V", 0, 16);
                        com.yandex.plus.home.analytics.evgen.c cVar4 = new com.yandex.plus.home.analytics.evgen.c(0, gVar2.e, a.class, "cancelPayButtonLoading", "cancelPayButtonLoading()V", 0, 17);
                        rjfVar2.getClass();
                        str3.getClass();
                        h0 h0Var = new h0(str3, "plus_home");
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar4 = new com.yandex.plus.acquisition.sdk.common.api.di.b((g0) rjfVar2.e, h0Var, gVar3, (com.yandex.plus.home.analytics.payment.d) rjfVar2.g, (com.yandex.plus.home.analytics.payment.a) rjfVar2.k, (com.yandex.plus.home.analytics.payment.c) rjfVar2.j, aVar11, (com.yandex.plus.home.analytics.payment.e) rjfVar2.h, (com.yandex.plus.home.analytics.payment.b) rjfVar2.i);
                        kotlinx.coroutines.a aVar14 = (kotlinx.coroutines.a) rjfVar2.m;
                        p pVar = new p((com.yandex.plus.home.auth.f) rjfVar2.b, bVar4);
                        com.yandex.plus.bdui.plus.content.controller.f fVar9 = new com.yandex.plus.bdui.plus.content.controller.f((com.yandex.plus.bdui.plus.content.controller.f) rjfVar2.p, (com.yandex.plus.acquisition.adapter.internal.processor.b) rjfVar2.o);
                        com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c cVar5 = new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c(l, bVar4, new m((g0) rjfVar2.e, h0Var, map3, bVar4, (com.yandex.plus.home.plaque.plugin.internal.proxy.a) rjfVar2.c, (kotlinx.coroutines.a) rjfVar2.m, cVar2, aVar12, (o) rjfVar2.f, (y) rjfVar2.n), (com.yandex.plus.home.auth.f) rjfVar2.b, rjfVar2.a, aVar13, cVar4);
                        p pVar2 = new p(l, bVar4, cVar3);
                        com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = (com.yandex.plus.home.plaque.feature.internal.presentation.b) rjfVar2.d;
                        com.yandex.plus.bdui.plus.content.controller.f fVar10 = (com.yandex.plus.bdui.plus.content.controller.f) rjfVar2.l;
                        fVar10.getClass();
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f(aVar14, bVar4, pVar, fVar9, cVar5, pVar2, fVar10, bVar5);
                    default:
                        g gVar4 = this.b;
                        return new com.yandex.plus.home.feature.webviews.internal.purchase.pay.a(gVar4.h, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, gVar4, g.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 17), new com.yandex.plus.home.analytics.evgen.c(0, gVar4.F0, com.yandex.plus.home.feature.webviews.internal.d.class, "reload", "reload()V", 0, 18), new com.yandex.plus.home.analytics.evgen.c(0, gVar4.e, a.class, "hideHostBuyView", "hideHostBuyView()V", 0, 19), gVar4.C, new com.yandex.plus.home.analytics.evgen.c(0, gVar4.h0(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f.class, "onPayButtonClicked", "onPayButtonClicked()V", 0, 20), gVar4.A, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.a, gVar4.B, gVar4.g.b);
                }
            }
        });
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, com.yandex.plus.core.analytics.logging.b.b, "init() bundle=" + aVar, null);
    }

    @Override // defpackage.bsh
    public final void L() {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onResume()", null);
        f fVar = this.F0;
        fVar.getClass();
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "onResume()", null);
        fVar.a(new u6(14));
        this.C0.j();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.purchase.pay.b
    public final void a() {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f h0 = h0();
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
        this.q.e(i, str, str2, str3, z);
        if (z) {
            if (this.y == com.yandex.plus.core.config.a.a) {
                ((a) this.e).q();
            }
            k0("ssl error", str);
        }
    }

    @Override // defpackage.bsh
    public final void h() {
        super.h();
        com.yandex.plus.bdui.plus.analytics.b.d(h0().f);
        evj evjVar = this.C0;
        evjVar.a = false;
        evjVar.c();
        rar rarVar = this.A0;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.A0 = null;
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "detachView()", null);
        com.yandex.plus.bdui.plus.analytics.b.d(this.F0.h);
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "detachView()", null);
    }

    public final com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f h0() {
        return (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f) this.H0.getValue();
    }

    public final void i0(o3 o3Var) {
        o3Var.getClass();
        this.F0.d(o3Var, new com.yandex.plus.home.analytics.evgen.c(0, h0(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f.class, "onWebAuthorizationShow", "onWebAuthorizationShow()V", 0, 21), new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, h0(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f.class, "onAuthorizationResult", "onAuthorizationResult(Lcom/yandex/plus/home/feature/webviews/internalapi/authorization/AuthorizationResult;)V", 0, 18));
    }

    public final void j0() {
        this.v.p();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, "web view timeout", null);
        ((a) this.e).c("loading timeout");
        f fVar = this.F0;
        this.z.d(this.C, fVar.g);
        String str = fVar.g;
        this.q.d(this.x0.a, str);
    }

    @Override // com.yandex.plus.webview.core.i
    public final void k(int i, String str, String str2, String str3, boolean z) {
        this.q.c(i, str, str2, str3, z);
        if (z) {
            k0(String.format("connection error, error code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
    }

    public final void k0(String str, String str2) {
        if (!this.B0) {
            this.v.p();
        }
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, str, null);
        if (!this.I) {
            rar rarVar = this.A0;
            if (rarVar != null) {
                rarVar.g(null);
            }
            this.A0 = null;
        }
        if (this.B0) {
            return;
        }
        ((a) this.e).c(str);
        if (str2 == null) {
            str2 = this.F0.g;
        }
        this.z.d(this.C, str2);
    }

    public final void l0(v1 v1Var) {
        if (this.I) {
            ((a) this.e).d(v1Var);
        } else {
            ((d) this.D0.getValue()).A(v1Var);
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.c
    public final void onMessage(String str) {
        str.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        String concat = "onMessage() jsonMessage=".concat(str);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, concat, null);
        ((d) this.D0.getValue()).onMessage(str);
    }

    @Override // com.yandex.plus.webview.core.i
    public final void u(int i, String str, String str2, String str3, boolean z) {
        str3.getClass();
        this.q.b(i, str, str2, str3, z);
        if (z) {
            k0(String.format("http error, status code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
    }

    @Override // defpackage.bsh
    public final void w() {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onPause()", null);
        this.F0.getClass();
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "onPause()", null);
        this.C0.g();
    }
}
