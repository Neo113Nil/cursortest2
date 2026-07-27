package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.us, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4031us implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34671a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34672b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34673c;

    public /* synthetic */ C4031us(int i, Object obj, Object obj2) {
        this.f34671a = i;
        this.f34672b = obj;
        this.f34673c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f34671a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                JSONObject jSONObject = (JSONObject) this.f34672b;
                if (jSONObject != null) {
                    bundle.putString("fwd_cld", jSONObject.toString());
                }
                JSONObject jSONObject2 = (JSONObject) this.f34673c;
                if (jSONObject2 != null) {
                    bundle.putString("fwd_common_cld", jSONObject2.toString());
                    break;
                }
                break;
            default:
                try {
                    JSONObject v6 = p8.g.v("pii", (JSONObject) obj);
                    v6.put("doritos", (String) this.f34672b);
                    v6.put("doritos_v2", (String) this.f34673c);
                    break;
                } catch (JSONException unused) {
                    t2.C.k("Failed putting doritos string.");
                }
        }
    }
}
