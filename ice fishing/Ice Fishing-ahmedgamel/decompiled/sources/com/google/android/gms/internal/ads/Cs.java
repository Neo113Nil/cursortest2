package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Cs implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25000a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25001b;

    public /* synthetic */ Cs(int i, Object obj) {
        this.f25000a = i;
        this.f25001b = obj;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        boolean z6;
        boolean z9;
        switch (this.f25000a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Rt rt = (Rt) this.f25001b;
                if (rt != null) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.sd)).booleanValue()) {
                        return;
                    }
                    synchronized (rt.f28080c) {
                        rt.b();
                        z6 = rt.f28082e == 2;
                    }
                    bundle.putBoolean("render_in_browser", z6);
                    synchronized (rt.f28080c) {
                        rt.b();
                        z9 = rt.f28082e == 3;
                    }
                    bundle.putBoolean("disable_ml", z9);
                    return;
                }
                return;
            case 1:
                try {
                    ((JSONObject) obj).put("cache_state", (JSONObject) this.f25001b);
                    return;
                } catch (JSONException unused) {
                    w2.z.k("Unable to get cache_state");
                    return;
                }
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Zs zs = (Zs) this.f25001b;
                zs.getClass();
                try {
                    jSONObject.put("gms_sdk_env", zs.f29742a);
                    return;
                } catch (JSONException unused2) {
                    w2.z.k("Failed putting version constants.");
                    return;
                }
        }
    }
}
