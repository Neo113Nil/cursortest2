package io.appmetrica.analytics.screenshot.impl;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.j73;
import defpackage.tcc;
import defpackage.y6i0;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.screenshot.internal.ServiceSideScreenshotConfigWrapper;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class S implements JsonParser {
    public final E a;

    public /* synthetic */ S(E e, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new E() : e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ServiceSideScreenshotConfigWrapper parse(JSONObject jSONObject) {
        N n;
        U u;
        P p;
        ?? d0;
        E e = this.a;
        e.getClass();
        boolean extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC1108m.a);
        JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
        if (optJSONObject == null) {
            p = new P(extractFeature, new N(new w().a), new U(), new O());
        } else {
            e.a.getClass();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("api_captor_config");
            O o = null;
            if (optJSONObject2 == null) {
                n = null;
            } else {
                w wVar = new w();
                Boolean optBooleanOrNull = JsonUtils.optBooleanOrNull(optJSONObject2, BackendConfig.Restrictions.ENABLED);
                n = new N(optBooleanOrNull != null ? optBooleanOrNull.booleanValue() : wVar.a);
            }
            if (n == null) {
                n = new N(new w().a);
            }
            e.b.getClass();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("service_captor_config");
            if (optJSONObject3 == null) {
                u = null;
            } else {
                y yVar = new y();
                Boolean optBooleanOrNull2 = JsonUtils.optBooleanOrNull(optJSONObject3, BackendConfig.Restrictions.ENABLED);
                boolean booleanValue = optBooleanOrNull2 != null ? optBooleanOrNull2.booleanValue() : yVar.a;
                Long optLongOrNull = JsonUtils.optLongOrNull(optJSONObject3, "delay_seconds");
                u = new U(booleanValue, optLongOrNull != null ? optLongOrNull.longValue() : yVar.b);
            }
            if (u == null) {
                u = new U();
            }
            e.c.getClass();
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("content_observer_captor_config");
            if (optJSONObject4 != null) {
                x xVar = new x();
                Boolean optBooleanOrNull3 = JsonUtils.optBooleanOrNull(optJSONObject4, BackendConfig.Restrictions.ENABLED);
                boolean booleanValue2 = optBooleanOrNull3 != null ? optBooleanOrNull3.booleanValue() : xVar.a;
                JSONArray optJSONArray = optJSONObject4.optJSONArray("media_store_column_names");
                if (optJSONArray != null) {
                    d6w n2 = y6i0.n(0, optJSONArray.length());
                    d0 = new ArrayList(tcc.n(n2, 10));
                    c6w it = n2.iterator();
                    while (it.c) {
                        d0.add(optJSONArray.getString(it.nextInt()));
                    }
                } else {
                    d0 = j73.d0(xVar.c);
                }
                Long optLongOrNull2 = JsonUtils.optLongOrNull(optJSONObject4, "detect_window_seconds");
                o = new O(booleanValue2, d0, optLongOrNull2 != null ? optLongOrNull2.longValue() : xVar.b);
            }
            if (o == null) {
                o = new O();
            }
            p = new P(extractFeature, n, u, o);
        }
        return ServiceSideScreenshotConfigWrapper.INSTANCE.toWrapper$screenshot_release(p);
    }

    public final ServiceSideScreenshotConfigWrapper b(JSONObject jSONObject) {
        return (ServiceSideScreenshotConfigWrapper) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (ServiceSideScreenshotConfigWrapper) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public S(E e) {
        this.a = e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public S() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
