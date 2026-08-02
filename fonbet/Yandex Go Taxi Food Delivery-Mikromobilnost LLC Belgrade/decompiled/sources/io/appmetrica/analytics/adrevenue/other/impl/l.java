package io.appmetrica.analytics.adrevenue.other.impl;

import io.appmetrica.analytics.adrevenue.other.internal.ServiceSideAdRevenueOtherConfigWrapper;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class l implements JsonParser {
    public final a a;

    public /* synthetic */ l(a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new a() : aVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ServiceSideAdRevenueOtherConfigWrapper parse(JSONObject jSONObject) {
        this.a.getClass();
        return ServiceSideAdRevenueOtherConfigWrapper.INSTANCE.toWrapper$ad_revenue_other_release(new j(RemoteConfigJsonUtils.extractFeature(jSONObject, "ad_revenue_other", f.a), RemoteConfigJsonUtils.extractFeature(jSONObject, "ad_revenue_other_include_source", f.b)));
    }

    public final ServiceSideAdRevenueOtherConfigWrapper b(JSONObject jSONObject) {
        return (ServiceSideAdRevenueOtherConfigWrapper) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (ServiceSideAdRevenueOtherConfigWrapper) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public l(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
