package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ss, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3910ss implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34158a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34159b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34160c;

    public /* synthetic */ C3910ss(int i, Object obj, Object obj2) {
        this.f34158a = i;
        this.f34159b = obj;
        this.f34160c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f34158a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                JSONObject jSONObject = (JSONObject) this.f34159b;
                if (jSONObject != null) {
                    bundle.putString("fwd_cld", jSONObject.toString());
                }
                JSONObject jSONObject2 = (JSONObject) this.f34160c;
                if (jSONObject2 != null) {
                    bundle.putString("fwd_common_cld", jSONObject2.toString());
                    break;
                }
                break;
            default:
                try {
                    JSONObject N8 = A8.b.N("pii", (JSONObject) obj);
                    N8.put("doritos", (String) this.f34159b);
                    N8.put("doritos_v2", (String) this.f34160c);
                    break;
                } catch (JSONException unused) {
                    u2.z.k("Failed putting doritos string.");
                }
        }
    }
}
