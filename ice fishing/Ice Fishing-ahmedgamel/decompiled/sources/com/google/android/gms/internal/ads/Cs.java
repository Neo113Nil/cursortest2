package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Cs implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24255a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24256b;

    public /* synthetic */ Cs(int i, Object obj) {
        this.f24255a = i;
        this.f24256b = obj;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        boolean z3;
        boolean z6;
        switch (this.f24255a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Rt rt = (Rt) this.f24256b;
                if (rt != null) {
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.sd)).booleanValue()) {
                        return;
                    }
                    synchronized (rt.f27366c) {
                        rt.b();
                        z3 = rt.f27368e == 2;
                    }
                    bundle.putBoolean("render_in_browser", z3);
                    synchronized (rt.f27366c) {
                        rt.b();
                        z6 = rt.f27368e == 3;
                    }
                    bundle.putBoolean("disable_ml", z6);
                    return;
                }
                return;
            case 1:
                try {
                    ((JSONObject) obj).put("cache_state", (JSONObject) this.f24256b);
                    return;
                } catch (JSONException unused) {
                    u2.z.k("Unable to get cache_state");
                    return;
                }
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Zs zs = (Zs) this.f24256b;
                zs.getClass();
                try {
                    jSONObject.put("gms_sdk_env", zs.f28972a);
                    return;
                } catch (JSONException unused2) {
                    u2.z.k("Failed putting version constants.");
                    return;
                }
        }
    }
}
