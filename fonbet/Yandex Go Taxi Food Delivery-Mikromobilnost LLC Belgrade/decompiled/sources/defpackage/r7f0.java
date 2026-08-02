package defpackage;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class r7f0 {
    public final long a;
    public final String b;
    public final String c;
    public final int d;

    public r7f0(JSONObject jSONObject) {
        this.c = jSONObject.optString("billingPeriod");
        this.b = jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("formattedPrice");
        this.a = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        this.d = jSONObject.optInt("billingCycleCount");
    }
}
