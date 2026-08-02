package com.yandex.plus.home.analytics.payment;

import com.connectsdk.service.DeviceService;
import defpackage.b6e;
import defpackage.bnb;
import defpackage.cnb;
import defpackage.dnb;
import defpackage.tah;
import defpackage.zmb;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class c {
    public final dnb a;
    public final cnb b;

    public c(dnb dnbVar, cnb cnbVar) {
        dnbVar.getClass();
        this.a = dnbVar;
        this.b = cnbVar;
    }

    public static zmb b(com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return zmb.NativeSdk;
        }
        if (ordinal == 1) {
            return zmb.Web;
        }
        if (ordinal == 2) {
            return zmb.NativeHost;
        }
        b6e.s();
        return null;
    }

    public static bnb c(com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.c cVar) {
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            return bnb.Tarifficator;
        }
        if (ordinal == 1) {
            return bnb.OldPayment;
        }
        if (ordinal == 2) {
            return bnb.Host;
        }
        b6e.s();
        return null;
    }

    public final void a(com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.a aVar, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.c cVar, String str) {
        zmb b = b(aVar);
        bnb c = c(cVar);
        if (str == null) {
            str = "";
        }
        Map b2 = tah.b(new Pair(DeviceService.KEY_DESC, str));
        dnb dnbVar = this.a;
        dnbVar.getClass();
        b2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.a);
        linkedHashMap.put("additional_params", b2);
        linkedHashMap.put("button_type", b.a);
        linkedHashMap.put("payment_type", c.a);
        linkedHashMap.put("_meta", dnb.b(new HashMap()));
        dnbVar.c("Error.WebView.BuySubscription.Button.Loading.InvalidConfiguration", linkedHashMap);
    }
}
