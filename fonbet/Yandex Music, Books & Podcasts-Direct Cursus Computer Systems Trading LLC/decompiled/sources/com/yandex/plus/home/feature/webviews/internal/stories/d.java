package com.yandex.plus.home.feature.webviews.internal.stories;

import com.yandex.plus.pay.adapter.api.g0;
import com.yandex.plus.pay.adapter.api.h0;
import defpackage.e5b;
import defpackage.mm6;
import defpackage.rjf;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ d(k kVar, int i) {
        this.a = i;
        this.b = kVar;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [ezc, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                k kVar = this.b;
                break;
            case 2:
                k kVar2 = this.b;
                rjf rjfVar = kVar2.I;
                com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g gVar = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.b;
                com.yandex.plus.home.feature.webviews.internal.simple.d dVar = new com.yandex.plus.home.feature.webviews.internal.simple.d(1, kVar2, k.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 15);
                mm6 l = kVar2.l();
                String str = kVar2.y;
                Map map = kVar2.z;
                if (map == null) {
                    map = e5b.a;
                    map.getClass();
                }
                Map map2 = map;
                d dVar2 = new d(kVar2, 4);
                com.yandex.plus.home.feature.webviews.internal.simple.d dVar3 = new com.yandex.plus.home.feature.webviews.internal.simple.d(1, kVar2.e, c.class, "showNativePayError", "showNativePayError(Lcom/yandex/plus/home/pay/PayError;)V", 0, 16);
                int i = 0;
                com.yandex.plus.home.feature.webviews.internal.simple.d dVar4 = new com.yandex.plus.home.feature.webviews.internal.simple.d(1, kVar2.e, c.class, "showNativePayButton", "showNativePayButton(Lcom/yandex/plus/home/feature/webviews/internal/purchase/pay/common/NativePayButtonConfig;)V", i, 17);
                i iVar = new i(0, kVar2.e, c.class, "showHostBuyView", "showHostBuyView()V", i, 1);
                rjfVar.getClass();
                str.getClass();
                h0 h0Var = new h0(str, "story");
                com.yandex.plus.acquisition.sdk.common.api.di.b bVar = new com.yandex.plus.acquisition.sdk.common.api.di.b((g0) rjfVar.e, h0Var, gVar, (com.yandex.plus.home.analytics.payment.d) rjfVar.g, (com.yandex.plus.home.analytics.payment.a) rjfVar.k, (com.yandex.plus.home.analytics.payment.c) rjfVar.j, dVar, (com.yandex.plus.home.analytics.payment.e) rjfVar.h, (com.yandex.plus.home.analytics.payment.b) rjfVar.i);
                break;
            case 3:
                k kVar3 = this.b;
                break;
            case 4:
                k kVar4 = this.b;
                ((c) kVar4.e).j();
                kVar4.C.invoke();
                break;
            default:
                this.b.D.invoke();
                break;
        }
        return Unit.a;
    }
}
