package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Vr implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28311a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28312b;

    public /* synthetic */ Vr(String str, int i) {
        this.f28311a = i;
        this.f28312b = str;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = this.f28312b;
        switch (this.f28311a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (str != null) {
                    bundle.putString("arek", str);
                    break;
                }
                break;
            case 1:
                ((Bundle) obj).putString("ms", str);
                break;
            case 2:
                AbstractC2720Pd.J("key_schema", (Bundle) obj, str);
                break;
            case 3:
                AbstractC2720Pd.J("omid_v", (Bundle) obj, str);
                break;
            case 4:
                ((Bundle) obj).putString("request_id", str);
                break;
            case 5:
                try {
                    ((JSONObject) obj).put("ms", str);
                    break;
                } catch (JSONException e6) {
                    t2.C.l("Failed putting Ad ID.", e6);
                    return;
                }
            default:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    if (!TextUtils.isEmpty(str)) {
                        p8.g.v("pii", jSONObject).put("adsid", str);
                        break;
                    }
                } catch (JSONException e9) {
                    int i = t2.C.f40822b;
                    u2.i.g("Failed putting trustless token.", e9);
                }
                break;
        }
    }
}
