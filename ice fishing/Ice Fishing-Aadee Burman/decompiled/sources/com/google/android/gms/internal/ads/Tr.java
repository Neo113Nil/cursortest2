package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Tr implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27803a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27804b;

    public /* synthetic */ Tr(String str, int i) {
        this.f27803a = i;
        this.f27804b = str;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = this.f27804b;
        switch (this.f27803a) {
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
                    u2.z.l("Failed putting Ad ID.", e9);
                    return;
                }
            default:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    if (!TextUtils.isEmpty(str)) {
                        A8.b.N("pii", jSONObject).put("adsid", str);
                        break;
                    }
                } catch (JSONException e10) {
                    int i = u2.z.f41319b;
                    v2.i.g("Failed putting trustless token.", e10);
                }
                break;
        }
    }
}
