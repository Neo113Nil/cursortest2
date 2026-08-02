package com.yandex.plus.home.feature.webviews.internal.home.contract;

import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.analytics.payment.e;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.home.j;
import com.yandex.plus.home.feature.webviews.internal.webview.h;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.p5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.q6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x3;
import com.yandex.plus.home.internal.di.y;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a extends com.yandex.plus.home.feature.webviews.internal.webview.b {
    public final com.yandex.plus.home.analytics.diagnostic.messaging.b A;
    public final com.yandex.plus.log.api.b B;
    public final String C;
    public final j y;
    public final u z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(j jVar, u uVar, s sVar, h hVar, f fVar, com.yandex.plus.webview.api.contract.message.d dVar, com.yandex.passport.internal.core.accounts.h hVar2, com.yandex.plus.home.analytics.f fVar2, a1 a1Var, f fVar3, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, com.yandex.plus.home.analytics.diagnostic.webview.a aVar2, com.yandex.plus.home.analytics.diagnostic.messaging.b bVar, e eVar, y yVar, Function0 function0, o oVar, f fVar4, com.yandex.plus.log.api.b bVar2, kotlinx.coroutines.a aVar3, kotlinx.coroutines.a aVar4) {
        super(dVar, hVar2, fVar, new l(sVar), uVar, fVar2, a1Var, fVar3, aVar, aVar2, bVar, eVar, yVar, hVar, function0, oVar, fVar4, r18, bVar2, aVar3, aVar4);
        com.yandex.plus.home.feature.webviews.internalapi.a aVar5 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
        jVar.getClass();
        uVar.getClass();
        sVar.getClass();
        hVar.getClass();
        fVar.getClass();
        fVar2.getClass();
        a1Var.getClass();
        fVar3.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        eVar.getClass();
        yVar.getClass();
        oVar.getClass();
        fVar4.getClass();
        bVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        this.y = jVar;
        this.z = uVar;
        this.A = bVar;
        this.B = bVar2;
        this.C = "HomeWebViewContract";
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.b
    public final String A() {
        return this.C;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.b
    public final void z(com.yandex.plus.webview.api.contract.message.d dVar) {
        dVar.getClass();
        dVar.c(a5.class, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, a.class, "handleReadyForMessaging", "handleReadyForMessaging(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ReadyForMessaging;)V", 0, 21));
        dVar.c(q6.class, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, a.class, "handleUserTappedSubscription", "handleUserTappedSubscription(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$UserTappedSubscription;)V", 0, 22));
        dVar.c(p5.class, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, a.class, "handleShowPurchaseButton", "handleShowPurchaseButton(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ShowPurchaseButton;)V", 0, 23));
        dVar.c(u2.class, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, a.class, "handleGetProductsRequest", "handleGetProductsRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$GetProductsRequest;)V", 0, 24));
        dVar.c(u4.class, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, a.class, "handlePurchaseProductRequest", "handlePurchaseProductRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$PurchaseProductRequest;)V", 0, 25));
        dVar.c(r4.class, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, a.class, "handlePurchaseButtonShown", "handlePurchaseButtonShown(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$PurchaseButtonShown;)V", 0, 26));
        dVar.c(r3.class, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, a.class, "handleOpenNativeSharing", "handleOpenNativeSharing(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenNativeSharing;)V", 0, 27));
        dVar.c(x3.class, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, a.class, "handleOpenStoriesMessage", "handleOpenStoriesMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenStories;)V", 0, 28));
        dVar.c(d4.class, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, a.class, "handleOpenStoriesListMessage", "handleOpenStoriesListMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenStoriesList;)V", 0, 29));
    }
}
