package com.yandex.plus.home.feature.webviews.internal.stories.contract;

import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.analytics.f;
import com.yandex.plus.home.analytics.payment.e;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.stories.n;
import com.yandex.plus.home.feature.webviews.internal.webview.h;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.h2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.j5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.k4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.m5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.p5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.q6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u4;
import com.yandex.plus.home.internal.di.y;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a extends com.yandex.plus.home.feature.webviews.internal.webview.b {
    public final com.yandex.plus.log.api.b A;
    public final String B;
    public final h y;
    public final n z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(h hVar, n nVar, com.yandex.plus.log.api.b bVar, s sVar, u uVar, com.yandex.plus.webview.api.contract.message.d dVar, com.yandex.passport.internal.core.accounts.h hVar2, f fVar, a1 a1Var, com.yandex.plus.bdui.plus.content.controller.f fVar2, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, com.yandex.plus.home.analytics.diagnostic.webview.a aVar2, com.yandex.plus.home.analytics.diagnostic.messaging.b bVar2, e eVar, y yVar, Function0 function0, o oVar, com.yandex.plus.bdui.plus.content.controller.f fVar3, kotlinx.coroutines.a aVar3, kotlinx.coroutines.a aVar4) {
        super(dVar, hVar2, null, new l(sVar), uVar, fVar, a1Var, fVar2, aVar, aVar2, bVar2, eVar, yVar, hVar, function0, oVar, fVar3, r18, bVar, aVar3, aVar4);
        com.yandex.plus.home.feature.webviews.internalapi.a aVar5 = com.yandex.plus.home.feature.webviews.internalapi.a.b;
        hVar.getClass();
        nVar.getClass();
        bVar.getClass();
        sVar.getClass();
        uVar.getClass();
        fVar.getClass();
        a1Var.getClass();
        fVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar2.getClass();
        eVar.getClass();
        yVar.getClass();
        oVar.getClass();
        fVar3.getClass();
        aVar3.getClass();
        aVar4.getClass();
        this.y = hVar;
        this.z = nVar;
        this.A = bVar;
        this.B = "StoriesWebViewContract";
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.b
    public final String A() {
        return this.B;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.b
    public final void B(l4 l4Var) {
        l4Var.getClass();
        super.B(l4Var);
        if (l4Var.c == k4.b) {
            this.y.o();
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.b
    public final void z(com.yandex.plus.webview.api.contract.message.d dVar) {
        dVar.getClass();
        dVar.c(h2.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(1, this, a.class, "handleCloseStories", "handleCloseStories(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$CloseStories;)V", 0, 21));
        int i = 0;
        int i2 = 1;
        dVar.c(a5.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(i2, this, a.class, "handleReadyForMessaging", "handleReadyForMessaging(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ReadyForMessaging;)V", i, 22));
        dVar.c(a3.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(i2, this, a.class, "handleMiniStoryIsReadyEvent", "handleMiniStoryIsReadyEvent(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$MiniStoryIsReadyEvent;)V", i, 23));
        dVar.c(j5.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(i2, this, a.class, "handleShowNextStoryEvent", "handleShowNextStoryEvent(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ShowNextStoryEvent;)V", i, 24));
        dVar.c(m5.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(i2, this, a.class, "handleShowPrevStoryEvent", "handleShowPrevStoryEvent(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ShowPrevStoryEvent;)V", i, 25));
        dVar.c(q6.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(i2, this, a.class, "handleUserTappedSubscription", "handleUserTappedSubscription(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$UserTappedSubscription;)V", i, 26));
        dVar.c(p5.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(i2, this, a.class, "handleShowPurchaseButton", "handleShowPurchaseButton(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ShowPurchaseButton;)V", i, 27));
        dVar.c(u2.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(i2, this, a.class, "handleGetProductsRequest", "handleGetProductsRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$GetProductsRequest;)V", i, 28));
        dVar.c(u4.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(i2, this, a.class, "handlePurchaseProductRequest", "handlePurchaseProductRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$PurchaseProductRequest;)V", i, 29));
        dVar.c(r4.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(i2, this, a.class, "handlePurchaseButtonShown", "handlePurchaseButtonShown(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$PurchaseButtonShown;)V", i, 20));
    }
}
