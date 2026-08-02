package com.yandex.plus.home.feature.webviews.internal.smart.contract;

import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x3;
import com.yandex.plus.home.internal.di.y;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a extends com.yandex.plus.home.feature.webviews.internal.webview.b {
    public final com.yandex.plus.home.analytics.diagnostic.messaging.b A;
    public final String B;
    public final u y;
    public final com.yandex.plus.log.api.b z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(com.yandex.plus.webview.api.contract.message.d dVar, h hVar, u uVar, s sVar, com.yandex.plus.log.api.b bVar, f fVar, com.yandex.plus.home.analytics.f fVar2, a1 a1Var, f fVar3, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, com.yandex.plus.home.analytics.diagnostic.webview.a aVar2, com.yandex.plus.home.analytics.diagnostic.messaging.b bVar2, y yVar, com.yandex.plus.home.feature.webviews.internal.webview.h hVar2, Function0 function0, f fVar4, kotlinx.coroutines.a aVar3, kotlinx.coroutines.a aVar4) {
        super(dVar, hVar, fVar, new l(sVar), uVar, fVar2, a1Var, fVar3, aVar, aVar2, bVar2, null, yVar, hVar2, function0, null, fVar4, r18, bVar, aVar3, aVar4);
        com.yandex.plus.home.feature.webviews.internalapi.a aVar5 = com.yandex.plus.home.feature.webviews.internalapi.a.c;
        uVar.getClass();
        sVar.getClass();
        bVar.getClass();
        fVar.getClass();
        fVar2.getClass();
        a1Var.getClass();
        fVar3.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar2.getClass();
        yVar.getClass();
        hVar2.getClass();
        fVar4.getClass();
        aVar3.getClass();
        aVar4.getClass();
        this.y = uVar;
        this.z = bVar;
        this.A = bVar2;
        this.B = "SmartWebViewContract";
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.b
    public final String A() {
        return this.B;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.b
    public final void z(com.yandex.plus.webview.api.contract.message.d dVar) {
        dVar.getClass();
        dVar.c(a5.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(1, this, a.class, "handleReadyForMessaging", "handleReadyForMessaging(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ReadyForMessaging;)V", 0, 8));
        int i = 0;
        int i2 = 1;
        dVar.c(r3.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(i2, this, a.class, "handleOpenNativeSharing", "handleOpenNativeSharing(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenNativeSharing;)V", i, 9));
        dVar.c(x3.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(i2, this, a.class, "handleOpenStoriesMessage", "handleOpenStoriesMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenStories;)V", i, 10));
        dVar.c(d4.class, new com.yandex.plus.home.feature.webviews.internal.simple.d(i2, this, a.class, "handleOpenStoriesListMessage", "handleOpenStoriesListMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenStoriesList;)V", i, 11));
    }
}
