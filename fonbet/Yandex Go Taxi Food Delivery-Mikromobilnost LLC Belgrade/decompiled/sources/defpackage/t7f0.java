package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes10.dex */
public final class t7f0 {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    public t7f0(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (TextUtils.isEmpty(optString)) {
            ny61.g("Product id cannot be empty.");
            throw null;
        }
        if (TextUtils.isEmpty(optString2)) {
            ny61.g("Product type cannot be empty.");
            throw null;
        }
        this.e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f = jSONObject.optString("skuDetailsToken");
        this.g = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new s7f0(optJSONArray.getJSONObject(i)));
            }
            this.h = arrayList;
        } else {
            this.h = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(new q7f0(optJSONArray2.getJSONObject(i2)));
            }
            this.i = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.i = null;
        } else {
            arrayList2.add(new q7f0(optJSONObject));
            this.i = arrayList2;
        }
    }

    public final q7f0 a() {
        ArrayList arrayList = this.i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (q7f0) arrayList.get(0);
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b.optString("packageName");
    }

    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t7f0) {
            return TextUtils.equals(this.a, ((t7f0) obj).a);
        }
        return false;
    }

    public final String f() {
        return this.g;
    }

    public final ArrayList g() {
        return this.i;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String obj = this.b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        g8e.D(sb, this.a, "', parsedJson=", obj, ", productId='");
        sb.append(this.c);
        sb.append("', productType='");
        sb.append(this.d);
        sb.append("', title='");
        sb.append(this.e);
        sb.append("', productDetailsToken='");
        return g8e.r(sb, this.f, "', subscriptionOfferDetails=", valueOf, "}");
    }
}
