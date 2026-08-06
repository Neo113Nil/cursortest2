package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import u0.AbstractC1050a;
import w1.C1061b;
import w1.C1062c;

/* loaded from: classes.dex */
public final class L implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final Y f7595a;

    /* renamed from: b, reason: collision with root package name */
    public final X f7596b;

    /* JADX WARN: Multi-variable type inference failed */
    public L() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J parse(JSONObject jSONObject) {
        N n2;
        P p2;
        Q q2;
        boolean extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC0949o.f7669a);
        Y y2 = this.f7595a;
        X x2 = this.f7596b;
        x2.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
        if (optJSONObject == null) {
            q2 = new Q();
            q2.f7608a = new N();
            q2.f7609b = new P();
            O o2 = new O();
            o2.f7603c = AbstractC0949o.f7670b;
            q2.f7610c = o2;
        } else {
            Q q3 = new Q();
            x2.f7618a.getClass();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("api_captor_config");
            O o3 = null;
            if (optJSONObject2 == null) {
                n2 = null;
            } else {
                n2 = new N();
                Boolean optBooleanOrNull = JsonUtils.optBooleanOrNull(optJSONObject2, "enabled");
                if (optBooleanOrNull != null) {
                    n2.f7599a = optBooleanOrNull.booleanValue();
                }
            }
            if (n2 != null) {
                q3.f7608a = n2;
            }
            x2.f7619b.getClass();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("service_captor_config");
            if (optJSONObject3 == null) {
                p2 = null;
            } else {
                p2 = new P();
                Boolean optBooleanOrNull2 = JsonUtils.optBooleanOrNull(optJSONObject3, "enabled");
                if (optBooleanOrNull2 != null) {
                    p2.f7605a = optBooleanOrNull2.booleanValue();
                }
                Long optLongOrNull = JsonUtils.optLongOrNull(optJSONObject3, "delay_seconds");
                if (optLongOrNull != null) {
                    p2.f7606b = optLongOrNull.longValue();
                }
            }
            if (p2 != null) {
                q3.f7609b = p2;
            }
            x2.f7620c.getClass();
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("content_observer_captor_config");
            if (optJSONObject4 != null) {
                o3 = new O();
                Boolean optBooleanOrNull3 = JsonUtils.optBooleanOrNull(optJSONObject4, "enabled");
                if (optBooleanOrNull3 != null) {
                    o3.f7601a = optBooleanOrNull3.booleanValue();
                }
                JSONArray optJSONArray = optJSONObject4.optJSONArray("media_store_column_names");
                if (optJSONArray != null) {
                    C1062c E2 = AbstractC1050a.E(0, optJSONArray.length());
                    ArrayList arrayList = new ArrayList(i1.k.E(E2));
                    Iterator it = E2.iterator();
                    while (((C1061b) it).f8521c) {
                        arrayList.add(optJSONArray.getString(((C1061b) it).a()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o3.f7603c = (String[]) array;
                }
                Long optLongOrNull2 = JsonUtils.optLongOrNull(optJSONObject4, "detect_window_seconds");
                if (optLongOrNull2 != null) {
                    o3.f7602b = optLongOrNull2.longValue();
                }
            }
            if (o3 != null) {
                q3.f7610c = o3;
            }
            q2 = q3;
        }
        return new J(extractFeature, y2.toModel(q2));
    }

    public final J b(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public L(Y y2, X x2) {
        this.f7595a = y2;
        this.f7596b = x2;
    }

    public /* synthetic */ L(Y y2, X x2, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new Y(null, null, null, 7, null) : y2, (i2 & 2) != 0 ? new X() : x2);
    }
}
