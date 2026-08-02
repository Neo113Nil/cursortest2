package io.appmetrica.analytics.adrevenue.other.impl;

import android.os.Bundle;
import com.facebook.ads.AdSDKNotificationListener;
import defpackage.jl40;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class i implements AdSDKNotificationListener {
    public final ClientContext a;
    public final h b;

    public i(ClientContext clientContext, h hVar) {
        this.a = clientContext;
        this.b = hVar;
    }

    public final void onAdEvent(String str, Bundle bundle) {
        if (jl40.l(str, "impression")) {
            InternalClientModuleFacade internalClientModuleFacade = this.a.getInternalClientModuleFacade();
            this.b.getClass();
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Currency currency = Currency.getInstance("USD");
            Pair pair = new Pair("source", "facebook");
            Pair pair2 = new Pair(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-other");
            Pair pair3 = new Pair(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, "null");
            JSONObject jSONObject = new JSONObject();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                jSONObject.put(str2, obj != null ? obj.toString() : null);
            }
            internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(bigDecimal, currency, null, "facebook", null, null, null, null, null, kotlin.collections.b.h(pair, pair2, pair3, new Pair("raw_payload", jSONObject.toString())), true));
        }
    }
}
