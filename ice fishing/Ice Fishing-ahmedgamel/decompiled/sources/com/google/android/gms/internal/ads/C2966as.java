package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.as, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2966as implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29934a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f29935b;

    public /* synthetic */ C2966as(int i, Bundle bundle) {
        this.f29934a = i;
        this.f29935b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        switch (this.f29934a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Bundle bundle2 = this.f29935b;
                if (!bundle2.isEmpty()) {
                    bundle.putBundle("installed_adapter_data", bundle2);
                    break;
                }
                break;
            case 1:
                Bundle bundle3 = (Bundle) obj;
                Bundle b9 = MA.b("device", bundle3);
                b9.putBundle("android_mem_info", this.f29935b);
                bundle3.putBundle("device", b9);
                break;
            case 2:
                Bundle bundle4 = (Bundle) obj;
                Bundle bundle5 = this.f29935b;
                if (bundle5 != null) {
                    bundle4.putAll(bundle5);
                    break;
                }
                break;
            case 3:
                Bundle bundle6 = (Bundle) obj;
                Bundle bundle7 = this.f29935b;
                if (!bundle7.isEmpty()) {
                    bundle6.putBundle("shared_pref", bundle7);
                    break;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle8 = this.f29935b;
                if (bundle8 != null) {
                    try {
                        d6.c.v("play_store", d6.c.v("device", jSONObject)).put("parental_controls", C4949p.f40498g.f40499a.n(bundle8));
                        break;
                    } catch (JSONException unused) {
                        w2.z.k("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }
}
