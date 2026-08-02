package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ss, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3933ss implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34944a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34945b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34946c;

    public /* synthetic */ C3933ss(int i, Object obj, Object obj2) {
        this.f34944a = i;
        this.f34945b = obj;
        this.f34946c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f34944a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                JSONObject jSONObject = (JSONObject) this.f34945b;
                if (jSONObject != null) {
                    bundle.putString("fwd_cld", jSONObject.toString());
                }
                JSONObject jSONObject2 = (JSONObject) this.f34946c;
                if (jSONObject2 != null) {
                    bundle.putString("fwd_common_cld", jSONObject2.toString());
                    break;
                }
                break;
            default:
                try {
                    JSONObject v9 = d6.c.v("pii", (JSONObject) obj);
                    v9.put("doritos", (String) this.f34945b);
                    v9.put("doritos_v2", (String) this.f34946c);
                    break;
                } catch (JSONException unused) {
                    w2.z.k("Failed putting doritos string.");
                }
        }
    }
}
