package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Tr implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28600a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28601b;

    public /* synthetic */ Tr(String str, int i) {
        this.f28600a = i;
        this.f28601b = str;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = this.f28601b;
        switch (this.f28600a) {
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
                MA.M("key_schema", (Bundle) obj, str);
                break;
            case 3:
                MA.M("omid_v", (Bundle) obj, str);
                break;
            case 4:
                ((Bundle) obj).putString("request_id", str);
                break;
            case 5:
                try {
                    ((JSONObject) obj).put("ms", str);
                    break;
                } catch (JSONException e9) {
                    w2.z.l("Failed putting Ad ID.", e9);
                    return;
                }
            default:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    if (!TextUtils.isEmpty(str)) {
                        d6.c.v("pii", jSONObject).put("adsid", str);
                        break;
                    }
                } catch (JSONException e10) {
                    int i = w2.z.f41712b;
                    x2.i.g("Failed putting trustless token.", e10);
                }
                break;
        }
    }
}
